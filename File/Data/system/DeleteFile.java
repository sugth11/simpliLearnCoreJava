package File.Data.system;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

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
                System.out.println("Press '1' to go to previous menu or press '2' to go to main menu");
                Scanner operation= new Scanner(System.in);
                new goBackMenu(operation);
            } else{
                System.out.println("Failed");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
