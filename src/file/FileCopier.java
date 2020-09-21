package file;

import java.io.*;

public class FileCopier {
    BufferedReader br;
    FileInputStream fis;
    FileOutputStream fos;
    File f;
    String filePath;
    String dirPath;
    String fileName;
    int iMenu;
    FileCopier(){
        menu();
    }

    void menu(){
        System.out.println("1. 파일 복사  2. 파일 잘라내기  3.종료");
        System.out.print("메뉴 선택 : ");
        try{
            br = new BufferedReader(new InputStreamReader(System.in));
            String inStr = br.readLine();
            if(inStr.equals("")){
                System.out.println("[Error] 값을 입력해야함 \n");
                menu();
                return;
            }
        iMenu = Integer.parseInt(inStr);
            switch (iMenu){
                case 1:
                    copyFile(); pasteFile(); break;
                case 2:
                    copyFile(); pasteFile(); cutFile(); break;
                case 3:
                    System.out.println("[Error] 숫자만 입력해야함 \n");
                    System.exit(0);
                default:
                    System.out.println("[Error] 1~3 사이 숫자만 입력가능");
            }
            menu();
        }catch (IOException ie){
            System.out.println("[Error] 입출력 실패 \n");
            System.exit(-1);
        }catch (NumberFormatException nf){
            System.out.println("[Error] 숫자만 입력해야함 \n");
            menu();
        }
    }

    void copyFile(){
        if(iMenu == 1){
            System.out.print("\n 복사할 원본파일 : ");
        }else{
            System.out.print("\n 잘라낼 원본 파일 : ");
        }
        try {
            filePath = br.readLine();
            filePath = filePath.trim();
            if(filePath.equals("")){
                System.out.println("[Error] 값을 입력해야함 \n");
                copyFile();
                return;
            }
            f = new File(filePath);
            if(f.isDirectory()){
                System.out.println("[Error] 폴더는 복사가 불가능 \n");
                copyFile();
                return;
            }
            fileName = f.getName();
            fis = new FileInputStream(filePath);
        }catch (FileNotFoundException fe){
            System.out.println("[Error] 파일이 존재하지 않음 \n");
            copyFile();
        }catch (IOException ie) {
            System.out.println("[Error] 입출력 실패");
            System.exit(-1);
        }
    }

    void pasteFile(){
        System.out.print("저장할 폴더 : ");
        try {
            dirPath = br.readLine();
            dirPath = dirPath.trim();
            if(dirPath.equals("")){
                System.out.println("[Error] 값을 입력해야함");
                pasteFile();
                return;
            }
            f = new File(dirPath);
            if(f.isFile()){
                System.out.println("[Error] 파일은 폴더에만 저장가능");
                pasteFile();
                return;
            }
            if(!f.exists()){
                if(!askMakingDir()){
                    return;
                }
            }
            fos = new FileOutputStream(dirPath+ "/" + fileName);
            int count = 0;
            byte[] bs = new byte[1024];
            while ((count = fis.read(bs)) != -1){
                fos.write(bs, 0, count);
            }
            if(iMenu == 1){
                System.out.println("[System] 파일 복사 완료\n");
            }
        }catch (IOException ie){
            System.out.println("[Error] 입출력 실패");
            System.exit(-1);
        }finally {
            try {
                if(fos != null) fos.close();
                if(fis != null) fis.close();
            }catch (IOException ie){
                System.out.println("[Error] 입출력 실패");
                System.exit(-1);
            }
        }
    }

    void cutFile(){
        f = new File(filePath);
        if(f.delete()) {
            System.out.println("[System] 파일 잘라내기 완료 \n");
        }else{
            System.out.println("[Error] 파일 삭제 실패");
        }
    }

    boolean askMakingDir(){
        System.out.print("[Error] 해당 폴더가 없음 (생성 Y, 취소 N) : ");
        try {
            String inStr = br.readLine();
            if(inStr.equalsIgnoreCase("y")){
                if(f.mkdir()){}
                else if(f.mkdirs()){}
                return true;
            }else if(inStr.equalsIgnoreCase("n")){
                pasteFile();
                return false;
            }else{
                System.out.println("[Error] Y또는 N을 입력 ");
                askMakingDir();
            }
        }catch (IOException ie){
            System.out.println("[Error] 입출력 실패");
            System.exit(-1);
        }
        return false;
    }

    public static void main(String[] args) {
        new FileCopier();
    }
}
