package fileTest;

import java.io.*;

public class CopyFile_txt {
    /*
    * 拷贝文件
    * @author Lucky
    * */
    public static void main(String[] args) throws IOException {
        String str;
        str =  Copy("src/a");
        Paste("src/b", str);

    }

    public static String Copy(String path) throws IOException {
        File src = new File(path);
        //System.out.println(src.length());
        InputStream is = new FileInputStream(src);
        byte[] flush = new byte[1024];
        int len;
        String str = new String();
        while ((len=is.read(flush))!=-1) {
            str += (new String(flush, 0, len));
        }

        is.close();

        return str;
    }

    public static void Paste(String path, String str) throws IOException {
        File src = new File(path);
        //System.out.println(src.length());
        OutputStream os = new FileOutputStream(src, false);

        byte[] flush = str.getBytes();

        os.write(flush, 0, flush.length);
        os.flush();

        os.close();
    }
}
