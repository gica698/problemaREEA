public class GetFileName {

    private String filePath;

    public GetFileName(String filePath){
        this.filePath=filePath;
    }

    public String getFilePath(){
        return this.filePath;
    }

    public void setFilePath(String path){
        this.filePath=path;
    }

    public String[] splitPath(){
        //System.out.println(filePath);

        String[] splitPathh = this.filePath.split("[/.]");


        return splitPathh;
    }

    public int getSize(){
        return splitPath().length;
    }


    public String getExtension(){

        return splitPath()[getSize()-1];
    }

    public String getFilename(){

        return splitPath()[getSize()-2];
    }

    public String getDirectoryname(){

        return splitPath()[getSize()-3];
    }



}
