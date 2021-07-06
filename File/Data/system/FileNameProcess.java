package File.Data.system;

import java.io.File;

public class FileNameProcess {
    public String filename;
    private String action;
    public FileNameProcess(String fileName,String action) {
        this.filename =fileName;
        this.action=action;
    }
    public File getUserDetail(){
        String executionPath = System.getProperty("user.dir");
        File file = null;
        if(this.action!="search") {
            file = new File(executionPath + "/" + this.filename);
        } else {
            file = new File(executionPath);
        }
        return file;
    }


}
