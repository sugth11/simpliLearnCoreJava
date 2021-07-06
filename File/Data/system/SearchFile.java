package File.Data.system;

import java.io.File;
import java.io.IOException;
import java.util.Collection;

public class SearchFile extends FileNameProcess {
    private String fileNames;
    public SearchFile(String fileName) {

        super(fileName,"search");
        this.fileNames= fileName;

    }
    public void searchFiles() {
        File directory = new File(String.valueOf(this.getUserDetail()));
        // store all names with same name
        // with/without extension
        String[] flist = directory.list();
        int flag = 0;
        if (flist == null) {
            System.out.println("Empty directory.");
        }
        else {
            // Linear search in the array
            for (int i = 0; i < flist.length; i++) {
                String filename = flist[i];
                if (filename.equalsIgnoreCase(this.fileNames)) {
                    System.out.println(filename + " found and it's in the directory "+ this.getUserDetail());
                    flag = 1;
                }
            }
        }

        if (flag == 0) {
            System.out.println("File Not Found");
        }

    }
}
