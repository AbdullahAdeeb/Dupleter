
import java.io.File;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lenovo212
 */
public class Main {

    public static String CameraPath = "C:\\Users\\lenovo212\\Pictures\\Camera";

    Main(String path) {
        System.out.println("Ops!! too late to make sure.. what's done is done");
        File f = new File(path);
        if (f.isDirectory()) {
            File[] listFiles = f.listFiles();
            File pFile;
            for (int i = 0; i < listFiles.length; i++) {
                pFile = listFiles[i];
                System.out.print(pFile.getName());
                if (pFile.isFile() && pFile.getName().matches(".+[(][1-9][)][.].+")) {
                    System.out.println(" << say goodbye :( ");
                    pFile.delete();
                    
                }else{
                    System.out.println("");
                }
                    
            }
        }else{
            System.out.println("specifiy a directory in the argument.. Idiot!!");
        }
        
    }

    public static void main(String args[]) {
        System.out.println(args.length);
        if (args.length == 1) {
            new Main(args[1]);
        } else {
            new Main(CameraPath);
        }
    }
}
