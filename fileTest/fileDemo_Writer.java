package fileTest;

import java.io.*;

public class fileDemo_Writer {
    /*
    * 使用文本输出流
    * @author Lucky
    * */

    public static void main(String[] args) throws IOException {
        File src = new File("src/b");
        //System.out.println(src.length());
        Writer wt = new FileWriter(src, false);

        String str = "姜运峰congxiaochen";
        char[] flush = str.toCharArray();

        wt.write(flush, 0, flush.length);
        wt.flush();

        wt.close();
    }

    /*public static void Paste(String path) throws IOException {
        File src = new File(path);
        //System.out.println(src.length());
        OutputStream os = new FileOutputStream(src, true);

        String str = "姜运峰congxiaochen";
        byte[] flush = str.getBytes();

        os.write(flush, 0, flush.length);
        os.flush();

        os.close();
    }*/
}
