package fileTest;

import java.io.*;

public class fileDemo02 {
    /*
    * 使用字符输入流
    * @author Lucky
    * */

    /*
    * 1.创建源
    * 2.创建流
    * 3.操作
    * 4.关闭资源*/
    public static void main(String[] args) throws IOException {
        Copy("src/a");
    }

    public static void Copy(String path) throws IOException {
        File src = new File(path);
        //System.out.println(src.length());
        InputStream is = new FileInputStream(src);
        byte[] flush = new byte[1024];
        String str;
        int len;
        while ((len=is.read(flush))!=-1) {
            str = new String(flush, 0, len);
            System.out.println(str);
        }

        is.close();
    }
}
