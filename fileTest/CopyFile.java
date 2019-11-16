package fileTest;

import java.io.*;

public class CopyFile {
    /*
    * 拷贝文件
    * @author Lucky
    * */
    public static void main(String[] args) throws IOException {
        Copy("src/a", "src/b");
    }

    public static void Copy(String pathCopy, String pathPaste) throws IOException {
        File src = new File(pathCopy);
        File dest = new File(pathPaste);

        //System.out.println(src.length());
        InputStream is = new FileInputStream(src);
        OutputStream os = new FileOutputStream(dest);
        byte[] flush = new byte[1024];
        int len;

        while ((len=is.read(flush))!=-1) {
            os.write(flush, 0, len);
        }
        os.flush();

        os.close();
        is.close();
    }
}
