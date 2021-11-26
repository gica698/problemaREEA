package main;

import linuxpath.LinuxPath;
import windowspath.WindowsPath;

public class Main {
    public static void main(String[] args) {

        LinuxPath LinuxPath = new LinuxPath("./tmp/relativepath.txt");
        WindowsPath WindowsPath = new WindowsPath(".\\tmp\\relativepath.txt");

        System.out.println(LinuxPath.getExtension());
        System.out.println(LinuxPath.getFileName());
        System.out.println(LinuxPath.getFolderName());

        System.out.println(WindowsPath.getExtension());
        System.out.println(WindowsPath.getFileName());
        System.out.println(WindowsPath.getFolderName());
    }

}
