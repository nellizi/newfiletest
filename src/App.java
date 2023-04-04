import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class App {
    public static void main(String[] args) throws Exception {
        
        String path = "C:\\mkdirTest2";
        String fileName = "file_";

        File Folder = new File(path);

        if(!Folder.exists()){
            Folder.mkdir();

            for(int i=0; i<10; i++){
            File file = new File(Folder, fileName +i+".txt");
                if(!file.exists()){
                    file.createNewFile();
                    
                    // 3. Writer 생성
                    FileWriter fw = new FileWriter(file);
                    PrintWriter writer = new PrintWriter(fw);

                    // 4. 파일에 쓰기
                    writer.write("안녕하세요\n");
                    writer.println("Nice to meet you");
                    writer.print("!!");

                    // 5. PrintWriter close
                    writer.close();
                }

        }
            System.out.println("폴더 생성 완료");
        }else{
            System.out.println("폴더가 이미 존재합니다.");
        }

        // File file = new File(Folder, "test_file");
        // System.out.println("file getPath = " + file.getPath());
        // System.out.println("file getAbsolutePath = " + file.getAbsolutePath());

        // if(!file.exists()){
        //     file.createNewFile();
        //     System.out.println("파일 생성 성공");
        // }else{
        //     System.out.println("이미 존재하는 파일입니다.");
        // }

    }
}
