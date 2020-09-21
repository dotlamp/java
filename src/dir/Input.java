package dir;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Input {
    static BufferedReader br;
    File srcF;
    File destF;

    Input(){
        br = new BufferedReader(new InputStreamReader(System.in));
    }

    void inSrc(){
        if(DirCopier.iMenu == 1){
            System.out.print("\n 복사할 디렉토리 : ");
        }
        if(DirCopier.iMenu == 2){
            System.out.print("\n 잘라낼 디렉토리 : ");
        }

        try {
            String inStr = br.readLine();
            inStr = inStr.trim();
            if (inStr.equals("")){
                System.out.println("[Error] 경로를 입력 해야함 \n");
                inSrc();
                return;
            }
            srcF = new File(inStr);
            if(!srcF.exists()){
                System.out.println("[Error] 해당 디렉토리가 존재하지 않음 \n");
                inSrc();
                return;
            }
            if(!srcF.isDirectory()){
                System.out.print("[Error] 디렉토리만 입력 가능 ");
                inSrc();
                return;
            }
            inDest();
        }catch (IOException ie){
            System.out.println("[Error] 입출력 오류 \n");
            System.exit(-1);
        }
    }

    void inDest(){
        System.out.print("저장할 디렉토리 : ");
        try{
            String inStr = br.readLine();
            inStr = inStr.trim();
            if(inStr.equals("")){
                System.out.println("[Error] 경로를 입력 해야함 \n");
                inDest();
                return;
            }
            destF = new File(inStr);
            if(checkOverlap()){
                System.out.println("[Error] 햔재위치에 포함된 디렉토리가 복사 할 수 없음\n");
                inSrc();
            }
            if(!destF.exists()){
                if(!askMakingDir()){
                    return;
                }
            }
            if(!destF.isDirectory()){
                System.out.print("[Error] 디렉토리만 입력 가능 ");
                inDest();
                return;
            }
            destF = new File(inStr + File.separator + srcF.getName());
            if(!destF.exists()){
                destF.mkdir();
            }
        }catch (IOException ie){
            System.out.println("[Error] 입출력 오류 \n");
            System.exit(-1);
        }
    }

    boolean askMakingDir(){
        System.out.print("[Error] 해당 디렉토리가 없음 (생성 Y, 취소 N) : ");
        try{
            String inStr = br.readLine();
            if(inStr.equalsIgnoreCase("y")){
                if(destF.mkdir()){}
                else if(destF.mkdirs()){}
                return true;
            }else if(inStr.equalsIgnoreCase("n")){
                inDest();
                return false;
            }else{
                System.out.println("[Error] Y또는 N을 입력 ");
                askMakingDir();
            }
        }catch (IOException ie){
            System.out.println("[Error] 입출력 오류 \n");
            System.exit(-1);
        }
        return false;
    }

    boolean checkOverlap(){
        String srcDir = "";
        String destPath = "";
        try{
            srcDir = srcF.getCanonicalPath();
            int i = srcDir.lastIndexOf(File.separator);
            srcDir = srcDir.substring(i+1, srcDir.length());
            destPath = destF.getCanonicalPath();
        }catch (IOException ie){
            System.out.println("[Error] 입출력 오류 \n");
            System.exit(-1);
        }
        StringTokenizer stringTokenizer = new StringTokenizer(destPath, File.separator);
        while (stringTokenizer.hasMoreTokens()){
            String destDir = stringTokenizer.nextToken();
            if(srcDir.equals(destDir)){
                return true;
            }
        }
        return false;
    }
}
