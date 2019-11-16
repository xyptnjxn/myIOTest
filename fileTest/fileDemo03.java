package fileTest;

import java.io.*;

public class fileDemo03 {
    /*
    * 使用字符输出流
    * @author Lucky
    * */

    public static void main(String[] args) throws IOException {
        Paste("src/b");
    }

    public static void Paste(String path) throws IOException {
        File src = new File(path);
        //System.out.println(src.length());
        OutputStream os = new FileOutputStream(src, true);

        String str = "姜运峰congxiaochen";
        byte[] flush = str.getBytes();

        os.write(flush, 0, flush.length);
        os.flush();

        os.close();
    }
}
