public class Main {
    public static void main(String[] args){

        GetFileName getFileName = new GetFileName("../Myfolder/folder.txt");

        System.out.println(getFileName.getExtension());
        System.out.println(getFileName.getFilename());
        System.out.println(getFileName.getDirectoryname());
    }

}
