package linuxpath;

public class LinuxPath {

    private String filePath;

    public LinuxPath(String filePath) {
        this.filePath = filePath;
    }

    public String getFilePath() {
        return this.filePath;
    }

    public void setFilePath(String path) {
        this.filePath = path;
    }

    public String getExtension() {
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
