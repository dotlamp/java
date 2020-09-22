package file;

import java.io.File;

public class FileList {

    String dirPath = "";

    void showFileList(String dirPath){
        File dir = new File(dirPath);
        File files[] = dir.listFiles();

        for (File file : files){
            System.out.println("file: " + file);
        }
    }

    public static void main(String[] args) {
       FileList a = new FileList();
       a.dirPath = "C:\\dotlamp\\java\\java";
       a.showFileList(a.dirPath);
    }
}
