package com.example.readFileExcel;

import com.example.readFileExcel.Read.*;
import com.example.readFileExcel.cyber.utils.FileUtils;
import com.example.readFileExcel.cyber.utils.GlobalValue;
import com.example.readFileExcel.cyber.utils.TokenUtils;
import com.example.readFileExcel.cyber.utils.Utils;
import com.example.readFileExcel.request.Dschitiet;
import com.example.readFileExcel.request.RequestObj;
import com.example.readFileExcel.request.RequestObject;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import jdk.nashorn.internal.parser.JSONParser;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.core.env.Environment;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.awt.print.Book;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

@SpringBootApplication
@EnableScheduling
public class ReadFileExcelApplication extends SpringBootServletInitializer implements CommandLineRunner {

    private static String fileName;
    @Autowired
    Environment env;

    @Value("${fileMaxOutNum}")
    private String FILENAME;

    @Value("${fileMaHD}")
    private String FILEmaHD;

    @Value("${urlGetToken}")
    private String urlToken;

    private static final Logger logger = LoggerFactory.getLogger(ReadFileExcelApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(ReadFileExcelApplication.class, args);

    }

    public static void search(final String pattern, final File folder, List<String> result) {
        for (final File f : folder.listFiles()) {
            if (f.isDirectory()) {
                search(pattern, f, result);
            }

            if (f.isFile()) {
                if (f.getName().matches(pattern)) {
                    result.add(f.getAbsolutePath());
                }
            }

        }
    }

//    @Override
//    public void run(String... args) throws Exception {
//
//    }
//
//    @Scheduled(fixedRate = 30000L)


    private static void readFiles(String... url) throws IOException {

        final File folder = new File("D:\\cyber-job\\readFileExcel\\fromtmp");

        List<String> result = new ArrayList<>();
        List<Dschitiet> dschitiets = new ArrayList<>();
        final String uuid = UUID.randomUUID().toString();
        search(".*\\.xls", folder, result);

        if (result.size() > 0) {

            if (FileUtils.tokenWS == null || FileUtils.tokenWS.isEmpty()) {
                logger.info("***************: Lan dau chay => getToken   ");
                TokenUtils.getAccessToken(url[0], url[2], url[1], url[3]);
            }
            GlobalValue goGlobalValue = new GlobalValue();
            goGlobalValue.setUrlToken(url[0]);
            goGlobalValue.setPassword(url[1]);
            goGlobalValue.setUsername(url[2]);
            goGlobalValue.setDoanhnghiepMstStatic(url[3]);

            logger.info("*************************************: Bat dau chay app");
            for (String s : result) {
                Path source = Paths.get(s.toString());
                logger.info("*************************************: Lấy đường dẫn file định chuyển tới và đổi tên");
                Path targer = Paths.get(s.replace("D:\\cyber-job\\readFileExcel\\fromtmp\\", "D:\\cyber-job\\readFileExcel\\totmp\\" + uuid + ""));
                Path targetFaile = Paths.get(s.replace("D:\\cyber-job\\readFileExcel\\fromtmp\\", "D:\\cyber-job\\readFileExcel\\totmpfailer\\" + uuid + ""));
                System.out.println(targer);
                fileName = s;
                try {
                    logger.info("*************************************: Bắt đầu đọc file");
                    FileInputStream excelFile = new FileInputStream(new File(fileName));
                    Workbook workbook = new HSSFWorkbook(excelFile);
                    Sheet datatypeSheet = workbook.getSheetAt(0);
                    Iterator<Row> iterator = datatypeSheet.iterator();

                    DecimalFormat df = new DecimalFormat("#.##");

                    String returnValueTenQCHHDV = "";
                    String returnValueStt = "";
                    String returnValueMH = "";
                    String returnValueDVT = "";
                    String returnValueSL = "";
                    String returnValueDG = "";
                    String returnValueTT = "";

                    List<Object> valuesTable = new ArrayList<Object>();

                    logger.info("*************************************: Đọc dữ liệu DataInformation");
                    DataInformation dataInformation = new DataInformation(datatypeSheet.getRow(0).getCell(4).getStringCellValue(),
                            datatypeSheet.getRow(1).getCell(4).getStringCellValue(),
                            datatypeSheet.getRow(2).getCell(4).getStringCellValue().replace("Địa chỉ (Address): ", ""),
                            datatypeSheet.getRow(3).getCell(4).getStringCellValue().substring(17, 35),
                            datatypeSheet.getRow(3).getCell(4).getStringCellValue().substring(43, 62),
                            datatypeSheet.getRow(3).getCell(4).getStringCellValue().substring(72, 84),
                            datatypeSheet.getRow(4).getCell(4).getStringCellValue().replace("Mã số thuế (Tax code): ", "")
                    );
                    valuesTable.add(dataInformation);
                    logger.info("*************************************: Đọc dữ liệu DataTitle");
                    DataTitle dataTitle = new DataTitle(datatypeSheet.getRow(5).getCell(12).getStringCellValue().replace("Mẫu số (Book No.): ", ""),
                            datatypeSheet.getRow(6).getCell(12).getStringCellValue().replace("Ký hiệu (Serial No.): ", ""),
                            datatypeSheet.getRow(6).getCell(7).getStringCellValue(),
                            datatypeSheet.getRow(8).getCell(7).getStringCellValue(),
                            datatypeSheet.getRow(7).getCell(12).getStringCellValue().replace("Số (Inv No.): ", ""),
                            datatypeSheet.getRow(9).getCell(7).getStringCellValue().replace("Liên 1 (1st Copy): ", ""),
                            datatypeSheet.getRow(10).getCell(7).getStringCellValue().replace("Ngày (Date):  ", ""),
                            datatypeSheet.getRow(10).getCell(12).getStringCellValue().replace("Số tham chiếu (Ref No.): ", ""),
                            datatypeSheet.getRow(11).getCell(12).getStringCellValue().replace("Số LXH (SO No.): ", "")
                    );
                    valuesTable.add(dataTitle);

                    logger.info("*************************************: Đọc dữ liệu DataInfoKH");
                    DataInfoKH dataInfoKH = new DataInfoKH(datatypeSheet.getRow(12).getCell(0).getStringCellValue().replace("Họ tên người mua hàng (Customer): ", ""),
                            datatypeSheet.getRow(13).getCell(0).getStringCellValue().replace("Tên đơn vị mua hàng (Company): ", ""),
                            datatypeSheet.getRow(14).getCell(0).getStringCellValue().replace("Địa chỉ (Address): ", ""),
                            datatypeSheet.getRow(15).getCell(0).getStringCellValue().replace("Mã số thuế (Tax code): ", ""),
                            datatypeSheet.getRow(16).getCell(0).getStringCellValue().replace("Hình thức thanh toán (Payment method): ", "")
                    );
                    valuesTable.add(dataInfoKH);

                    logger.info("*************************************: Đọc dữ liệu DataTableTotal");
                    DataTableTotal dataTableTotal = new DataTableTotal(
                            datatypeSheet.getRow(34).getCell(0).getStringCellValue().replace("Thuế suất GTGT (VAT rate): ", "").replace("%", "").trim(),
                            df.format(datatypeSheet.getRow(33).getCell(13).getNumericCellValue()),
                            df.format(datatypeSheet.getRow(34).getCell(13).getNumericCellValue()),
                            df.format(datatypeSheet.getRow(35).getCell(13).getNumericCellValue()),
                            datatypeSheet.getRow(36).getCell(0).getStringCellValue().replace("Số tiền viết bằng chữ (In words): ", "")
                    );
                    valuesTable.add(dataTableTotal);

                    //Lấy dữ liệu trong bảng
                    DataTable dataTable = new DataTable();
                    int indexStt = 1;
                    int h = 21;
                    for (int y = 1; y <= indexStt; y++) {
                        if (h < 32) {
                            int nextStt = indexStt + 1;
                            while (datatypeSheet.getRow(h).getCell(0).getNumericCellValue() != nextStt) {
                                int g;
                                if (h < 32) {
                                    if (datatypeSheet.getRow(h).getCell(0).getNumericCellValue() == y) {
                                        g = h;
                                        returnValueStt = Double.toString(datatypeSheet.getRow(g).getCell(0).getNumericCellValue());
                                        returnValueMH = datatypeSheet.getRow(g).getCell(2).getStringCellValue();
                                        returnValueDVT = datatypeSheet.getRow(g).getCell(9).getStringCellValue();
                                        returnValueSL = df.format(datatypeSheet.getRow(g).getCell(10).getNumericCellValue());
                                        returnValueDG = df.format(datatypeSheet.getRow(g).getCell(12).getNumericCellValue());
                                        returnValueTT = df.format(datatypeSheet.getRow(g).getCell(13).getNumericCellValue());
                                    }
                                    if (datatypeSheet.getRow(h).getCell(5
                                    ).getStringCellValue().length() > 0) {
                                        returnValueTenQCHHDV = returnValueTenQCHHDV + datatypeSheet.getRow(h).getCell(5
                                        ).getStringCellValue();
                                        h++;
                                    } else {
                                        h++;
                                    }
                                } else {
                                    break;
                                }
                            }
                            dataTable = new DataTable(returnValueStt, returnValueMH, returnValueTenQCHHDV, returnValueDVT, returnValueSL, returnValueDG, returnValueTT);
//                    values.add(returnValue);
//                    System.out.println(dataTable);
                            returnValueTenQCHHDV = "";
                            indexStt++;
                            valuesTable.add(dataTable);
                            Dschitiet dschitiet = new Dschitiet((int) Double.parseDouble(dataTable.getStt()), 0, dataTable.getMaHang(), dataTable.getTenQCHHDV(), dataTable.getDvt(),
                                    Long.parseLong(dataTable.getSl()), Long.parseLong(dataTable.getDonGia()), Long.parseLong(dataTableTotal.getTienHang()), dataTableTotal.getThueXuat(), Long.parseLong(dataTableTotal.getTongTienTT()));
                            dschitiets.add(dschitiet);
                        } else {
                            break;
                        }
                    }


                    logger.info("*************************************: Đọc dữ liệu DataPay");
                    DataPay dataPay = new DataPay(
                            datatypeSheet.getRow(37).getCell(0).getStringCellValue().replace("Thông tin thanh toán (Payment instruction): ", ""),
                            datatypeSheet.getRow(38).getCell(0).getStringCellValue().replace("Tài khoản thanh toán (Bank account No.): ", ""),
                            datatypeSheet.getRow(39).getCell(0).getStringCellValue().replace("Hạn thanh toán (Payment term): ", "")
                    );
                    valuesTable.add(dataPay);

                    logger.info("*************************************: Đọc dữ liệu DataSign");
                    DataSign dataSign = new DataSign(
                            datatypeSheet.getRow(42).getCell(1).getStringCellValue().replace("(Ký, ghi rõ họ tên)", ""),
                            datatypeSheet.getRow(42).getCell(8).getStringCellValue().replace("(Ký, ghi rõ họ tên)", ""),
                            datatypeSheet.getRow(42).getCell(11).getStringCellValue().replace("(Ký, đóng dấu, ghi rõ họ tên)", "")
                    );

                    valuesTable.add(dataSign);
                    System.out.println(valuesTable.toString());
                    logger.info("*************************************: Đọc xong dữ liệu file" + source);
                    RequestObject bodyRequest = new RequestObject();
//                bodyRequest.setDoanhnghiep_mst(dataInformation.getMst().replace("Mã số thuế (Tax code): ","").replaceAll("\\s+",""));
                    bodyRequest.setDoanhnghiep_mst(url[3]);
                    bodyRequest.setLoaihoadon_ma(url[4]);
//                bodyRequest.setMauso(dataTitle.getMauSo());
//                bodyRequest.setKyhieu(dataTitle.getKyHieu());
                    bodyRequest.setMauso(url[5]);
                    bodyRequest.setKyhieu(url[6]);
                    bodyRequest.setMa_hoadon(uuid);
                    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
                    LocalDateTime now = LocalDateTime.now();
//                    bodyRequest.setNgaylap(dtf.format(now));
                    bodyRequest.setNgaylap(convertStringToStringFormatDate(dataTitle.getNgay()));
                    bodyRequest.setDnmua_mst(dataInfoKH.getMstKH());
                    bodyRequest.setDnmua_ten(dataInfoKH.getTenDVMH());
                    bodyRequest.setDnmua_tennguoimua(dataInfoKH.getHoTenKH());
                    bodyRequest.setDnmua_diachi(dataInfoKH.getDiaChiKH());
                    bodyRequest.setDnmua_sdt(null);
                    bodyRequest.setDnmua_email(null);
                    if (dataInfoKH.getHinhThucTT().equalsIgnoreCase("Chuyển khoản")) {
                        bodyRequest.setThanhtoan_phuongthuc(2);
                    }
                    if (dataInfoKH.getHinhThucTT().equalsIgnoreCase("Tiền mặt")) {
                        bodyRequest.setThanhtoan_phuongthuc(1);
                    }
                    if (dataInfoKH.getHinhThucTT().equalsIgnoreCase("Tiền mặt/Chuyển khoản")) {
                        bodyRequest.setThanhtoan_phuongthuc(3);
                    }
                    if (dataInfoKH.getHinhThucTT().equalsIgnoreCase("Thẻ tín dụng")) {
                        bodyRequest.setThanhtoan_phuongthuc(4);
                    }
                    if (dataInfoKH.getHinhThucTT().equalsIgnoreCase("Đối trừ công nợ")) {
                        bodyRequest.setThanhtoan_phuongthuc(5);
                    }
                    bodyRequest.setThanhtoan_phuongthuc_ten(dataInfoKH.getHinhThucTT());
                    bodyRequest.setThanhtoan_taikhoan(dataPay.getTaiKhoanTT());
                    bodyRequest.setThanhtoan_nganhang(null);
                    bodyRequest.setTiente_ma("VND");
                    bodyRequest.setThanhtoan_thoihan(dataPay.getHanTT());
                    bodyRequest.setTongtien_chuavat(Long.parseLong(dataTableTotal.getTienHang()));
                    bodyRequest.setTienthue(Long.parseLong(dataTableTotal.getTienThue()));
                    bodyRequest.setTongtien_covat(Long.parseLong(dataTableTotal.getTongTienTT()));
                    bodyRequest.setDschitiet(dschitiets);


                    String jsonbody = new Gson().toJson(bodyRequest);
                    logger.info("***************: Thong tin gui di la:   " + jsonbody);
                    String resultHD = Utils.connectServer(url[7], jsonbody,
                            " Bearer " + FileUtils.tokenWS, url[0]);

                    //Check xem ket qua tra ve
                    if (!resultHD.isEmpty()) {
                        if (!resultHD.equalsIgnoreCase("3")) {
                            JSONObject jsonObject = new JSONObject(resultHD);
                            JSONObject json = jsonObject.getJSONObject("result");
                            if (json.getString("maketqua").equals("01")) {
                                logger.info("***************: Ket qua CALL API- BILL voi ma_hoadon=:  " + uuid + " ------  "
                                        + resultHD);
                                logger.info("*************************************: Gui len hoa don thanh cong va chuyen file" + targer);
                                Files.move(source, targer, StandardCopyOption.REPLACE_EXISTING);
                                logger.info("*************************************: Xóa mảng");
                                valuesTable.clear();
                            } else {
                                logger.info("***************: Ket qua CALL API- BILL voi ma_hoadon=:  " + uuid + " ------  "
                                        + resultHD);
                                logger.info("*************************************: Gui len hoa don that bai va chuyen file" + targetFaile);
                                Files.move(source, targetFaile, StandardCopyOption.REPLACE_EXISTING);
                                logger.info("*************************************: Xóa mang");
                                valuesTable.clear();
                            }
                        } else {
                            logger.info("***************: Ket qua CALL API- BILL voi ma_hoadon=:  " + uuid + " ------  "
                                    + resultHD);
                            logger.info("*************************************: Gửi lên hóa đơn thất bại và chuyển file" + targetFaile);
                            Files.move(source, targetFaile, StandardCopyOption.REPLACE_EXISTING);
                            logger.info("*************************************: Xóa mảng");
                            valuesTable.clear();
                        }

                    }

                    logger.info("*************************************: End Project");

                } catch (FileNotFoundException e) {
                    logger.info("*************************************: Lỗi FileNotFoundException: " + e);
                    e.printStackTrace();
                } catch (IOException e) {
                    logger.info("*************************************: Lỗi Ioexception" + e);
                    e.printStackTrace();
                }


            }

        }

    }

    private static  String convertStringToStringFormatDate(String dat) {

        String formattedDate = null;
        try {
            DateFormat originalFormat = new SimpleDateFormat("dd/MM/yyyy");
            DateFormat targetFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date date = originalFormat.parse(dat);
            formattedDate = targetFormat.format(date);
        } catch (ParseException e) {
            logger.error("***************: Loi : " + e.getMessage() + "== " + e.getClass() + "line: 208 ");
            e.printStackTrace();
        }
        return formattedDate;
    }

    @Override
    public void run(String... args) throws Exception {
        while (true) {
            try {
                readFiles(env.getProperty("urlGetToken"), env.getProperty("mstPassword"), env.getProperty("mstUsername"), env.getProperty("doanhnghiepMst"),
                        env.getProperty("loaihoadonMa"), env.getProperty("mauso"), env.getProperty("kyhieu"), env.getProperty("urlGuiVaKyHoadonGocHSM"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
