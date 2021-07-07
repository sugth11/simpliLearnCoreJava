package File.Data.system;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class addFile extends FileNameProcess {
    boolean result;
    private String fileName;
    public addFile(String fileName) {
        super(fileName, "add");
        this.fileName = fileName;
    }
    public void createNewFile(File getFile){
       boolean val;
        if(this.fileName.endsWith(".txt") || this.fileName.endsWith(".pdf") || this.fileName.endsWith(".png") || this.fileName.endsWith(".jpg") || this.fileName.endsWith(".jpeg")){
            try {
                val = getFile.createNewFile();
                if(val){
                    System.out.println("file created " + getFile.getCanonicalPath()); //returns the path string
                    System.out.println("Press '1' to go to previous menu or press '2' to go to main menu");
                    Scanner operation= new Scanner(System.in);
                } else{
                    System.out.println("File already exist at location: "+getFile.getCanonicalPath());
                    new SubMenu();
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }else {
            System.out.println("unsupported files! Supported only .pdf,.png,.txt,.jpg,.jpeg");
            System.out.println("Press '1' to go to previous menu or press '2' to go to main menu");
            Scanner operation= new Scanner(System.in);
            new goBackMenu(operation);
        }

    }
    public void addFiles(){
        File fileFromUser = this.getUserDetail();
        createNewFile(fileFromUser);
    }

}
