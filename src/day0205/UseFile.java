package day0205;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Date;

public class UseFile {
    public static void main(String[] args) {
        // 파일 경로 설정
        String filePath = "C:\\dev\\temp\\test.txt";
        
        // 파일 객체 생성
        File file = new File(filePath);
        
        try {
            // 파일이 존재하는지 확인
            if (file.exists()) {
                // BufferedReader를 사용하여 파일 내용 읽기
                BufferedReader reader = new BufferedReader(new FileReader(file));
                
                // 한 줄씩 읽어서 출력
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
                System.out.println(file.canExecute());
                System.out.println(file.canRead());
                System.out.println(file.canWrite());
                System.out.println(file.getAbsolutePath());
                System.out.println(file.getCanonicalPath());
                System.out.println(file.getParent());
                System.out.println(file.isAbsolute());
                System.out.println(file.isDirectory());
                System.out.println(file.isHidden());
                System.out.println(file.lastModified());
                System.out.println(new Date(file.lastModified()));

                
                // 리더 닫기
                reader.close();
            } else {
                System.out.println("파일이 존재하지 않습니다.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
