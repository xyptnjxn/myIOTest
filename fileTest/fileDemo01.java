package fileTest;

import java.io.File;

public class fileDemo01 {
    /*
    * 递归遍历目录
    * @author Lucky
    * */


    public static void travelDir (String path, int level) {
        for (int i = 0; i <= level; i++) {
            System.out.print("-");
        }
        File src = new File(path);
        System.out.println(src.getName());
        if (src.isDirectory()) {
            for (String temp : src.list()) {
                travelDir(temp, level+1);
            }
        }
    }

    public static void main(String[] args) {
        travelDir("F:/大学/IdeaProjects/IO_Test", 0);
    }
}
