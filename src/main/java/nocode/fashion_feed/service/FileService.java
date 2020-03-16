//package nocode.fashion_feed.service;
//
//import org.springframework.stereotype.Service;
//import org.springframework.web.multipart.MultipartFile;
//
//import java.io.File;
//import java.io.IOException;
//import java.text.SimpleDateFormat;
//
//public class FileService {
//     todo 맥북 경로 설정 알아보기
//    private static final String BASE_DIR = "";
//
//    public static void upload(MultipartFile multipartFile) {
//        try {
//            multipartFile.transferTo(new File(BASE_DIR + "\\" + multipartFile.getOriginalFilename()));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
////    public static String singleFileUpload(MultipartFile file) throws IOException {
////        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
////        file.transferTo(new File(file.getOriginalFilename()));
////    }
//}
