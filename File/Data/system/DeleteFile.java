package File.Data.system;

import java.io.File;
import java.io.IOException;

public class DeleteFile extends FileNameProcess {

    boolean result;
    public DeleteFile(String fileName) {
        super(fileName,"delete");
    }
    public void deleteFiles(){
        File fileFromUserToDelete = this.getUserDetail();

        try {
            result = fileFromUserToDelete.delete();
            if(result){
                System.out.println(fileFromUserToDelete.getCanonicalPath()+" is successfully deleted! "); //returns the path string
            } else{
                System.out.println("Failed");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
