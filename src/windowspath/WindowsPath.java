package windowspath;

public class WindowsPath {
    private String filePath;

    public WindowsPath(String filePath) {
        String replacePath = filePath.replaceAll("\\\\", "/");
        String replacePath1 = replacePath.replaceAll("//", "/");
        this.filePath = replacePath1;
        //System.out.println(filePath);
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getExtension() {
        //System.out.println(this.filePath);
        if (this.filePath.lastIndexOf('.') != -1) {
            if (this.filePath.lastIndexOf('/') > this.filePath.lastIndexOf('.')) {
                return "Nu avem extensie";
            } else {
                String[] extension = this.filePath.split("[.]");
                return "Extensia fisierului este: " + extension[extension.length - 1];
            }
        } else {
            return "Nu avem extensie";
        }

    }

    public String getFileName() {
        if (this.filePath.lastIndexOf('.') != -1) {
            if (this.filePath.lastIndexOf('/') > this.filePath.lastIndexOf('.')) {
                String[] filnemane = this.filePath.split("[/]");
                return filnemane[filnemane.length - 1];
            } else {
                String[] filename = this.filePath.split("[./]");

                return "Numele fisierului este: " + filename[filename.length - 2];
            }
        } else {
            String[] filename = this.filePath.split("[/]");
            return "Numele fisierului este: " + filename[filename.length - 1];
        }

    }

    public String getFolderName() {
        try {
            if (this.filePath.lastIndexOf('.') != -1) {
                if (this.filePath.lastIndexOf('/') > this.filePath.lastIndexOf('.')) {
                    String[] filnemane = this.filePath.split("[/]");
                    return filnemane[filnemane.length - 1];
                } else {
                    String[] filename = this.filePath.split("[./]");

                    return "Numele folderului este: " + filename[filename.length - 3];
                }
            } else {
                String[] filename = this.filePath.split("[/]");
                return "Numele folderului este: " + filename[filename.length - 2];
            }

        } catch (Exception e) {
            return "Nu avem folder";
        }
    }
}
