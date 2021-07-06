package File.Data.system;

import java.io.File;
import java.io.IOException;

public class addFile extends FileNameProcess {
    boolean result;
    public addFile(String fileName) {
        super(fileName, "add");
    }
    public void addFiles(){
        File fileFromUser = this.getUserDetail();

            try {
                result = fileFromUser.createNewFile();
                if(result){
                    System.out.println("file created "+fileFromUser.getCanonicalPath()); //returns the path string
                } else{
                    System.out.println("File already exist at location: "+fileFromUser.getCanonicalPath());
                }
            } catch (IOException e) {
                e.printStackTrace();

        }

    }

}
