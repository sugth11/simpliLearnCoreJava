package File.Data.system;

public class Directory {
    String executionPath = System.getProperty("user.dir");
    public Directory(){
    }
    public String getPath(){
        return executionPath;
    }
}
