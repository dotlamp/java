package dir;


import java.io.*;

public class DirCopier {
    final static int BUFFER_SIZE = 4096;
    FileInputStream fis;
    FileOutputStream fos;
    BufferedInputStream bis;
    BufferedOutputStream bos;
    Input in;
    static int iMenu;

    DirCopier(){
        in = new Input(); //Input 객체 인스터스화
         menu();
    }

    void menu(){
        System.out.println("1. 디렉토리 복사 2. 디렉토리 잘라내기 3.종료");
        System.out.print("메뉴 선택 : ");
        try {
            String inStr = dir.Input.br.readLine();
            inStr = inStr.trim();
            if(inStr.equals("")){
                System.out.println("[Error] 값을 입력해야함 \n");
                menu();
                return;
            }
            iMenu = Integer.parseInt(inStr);
            switch (iMenu){
                case 1:
                    in.inSrc();
                    System.out.println("[System] 디렉토리 복사 중");
                    copyDir(in.srcF, in.destF);
                    System.out.println("[System] 디렉토리 복사 완료");
                    break;
                case 2:
                    in.inSrc();
                    System.out.println("[System] 디렉토리 잘라내는 중");
                    copyDir(in.srcF, in.destF);
                    deleteDir(in.srcF);
                    System.out.println("[System] 디렉토리 잘라내기 완료");
                    break;
                case 3:
                    System.out.println("[System] 프로그램 종료");
                    Input.br.close();
                    System.exit(0);
                default:
                    System.out.println("[Error] 1~3 사이 숫자만 입력가능");
            }
            menu();
        }catch (IOException ie){
            System.out.println("[Error] 입출력 오류 \n");
            System.exit(-1);
        }catch (NumberFormatException nf){
            System.out.println("[Error] 숫자만 입력해야함 \n");
            menu();
        }
    }

    void copyDir(File srcF, File destF){
        File[] files = srcF.listFiles();
        for(File file: files){
            File tempF = new File(destF.getAbsoluteFile() + File.separator + file.getName());
            if(file.isDirectory()){
                tempF.mkdir();
                copyDir(file, tempF);
            }else {
                copyFile(file, tempF);
            }
        }
    }

    void copyFile(File srcF, File destF){
        try{
            fis = new FileInputStream(srcF);
            fos = new FileOutputStream(destF);
            bis = new BufferedInputStream(fis, BUFFER_SIZE);
            bos = new BufferedOutputStream(fos, BUFFER_SIZE);
            int count = 0;
            byte[] bs = new byte[2048];
            while ((count = bis.read(bs)) != -1 ){
                bos.write(bs, 0, count);
                bos.flush();
            }
        }catch (FileNotFoundException fe){
            System.out.println("[Error] 파일이 존재하지 않음 \n");
            System.exit(-1);
        }catch (IOException ie){
            System.out.println("[Error] 입출력 오류 \n");
            System.exit(-1);
        }finally {
            try {
                if(bis != null){ bis.close();}
                if(bos != null){ bos.close();}
                if(fis != null){ fis.close();}
                if(fos != null){ fos.close();}
            }catch (IOException ie){
                System.out.println("[Error] 입출력 오류 \n");
                System.exit(-1);
            }
        }
    }

    boolean deleteDir(File scrF){
        if(!scrF.exists()){
            return false;
        }
        File[] files = scrF.listFiles();
        for(File file : files){
            if(file.isDirectory()){
                deleteDir(file);
            }else{
                file.delete();
            }
        }
        return scrF.delete();
    }

    public static void main(String[] args) {
        new DirCopier();
    }
}
