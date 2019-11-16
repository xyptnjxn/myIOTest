package fileTest;

import java.io.*;

public class fileDemo_Reader {
    public static void main(String[] args) throws IOException {
        File src = new File("src/a");
        //System.out.println(src.length());
        Reader rd = new FileReader(src);
        char[] flush = new char[1024];
        String str;
        int len;
        while ((len = rd.read(flush)) != -1) {
            str = new String(flush, 0, len);
            System.out.println(str);
        }

        rd.close();
    }


    /*public static void Copy(String path) throws IOException {
        File src = new File(path);
        //System.out.println(src.length());
        InputStream is = new FileInputStream(src);
        byte[] flush = new byte[1024];
        String str;
        int len;
        while ((len = is.read(flush)) != -1) {
            str = new String(flush, 0, len);
            System.out.println(str);
        }

        is.close();
    }*/
}