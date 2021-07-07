package File.Data.system;

import java.util.Scanner;

public class OptionSelections {
    int options;

    public OptionSelections(){
        System.out.println("*********************************************************************************");
        System.out.println("File management System");
        System.out.println("Author: Sujith Joseph");
        System.out.println("Designation: Full Stack Developer");
        System.out.println("*********************************************************************************");

        System.out.println("Main Menu:");
        System.out.println("Enter 1 to list the file details:");
        System.out.println("Enter 2 to ADD/Delete/Search files:");
        System.out.println("Enter 3 to close the applications:");
        System.out.println("Please enter you option here:");
        Scanner userOptions= new Scanner(System.in);
        System.out.println();
        int option = userOptions.nextInt();
        setOptions(option);
        if(options == 1){
            ShowDirectory fileLists = new ShowDirectory();
            ShowDirectoryLists showLists = new ShowDirectoryLists(fileLists);
        }
        if(option == 2){
            SubMenu menu = new SubMenu();

        }
        if(option == 3){
            System.out.println("you are successfully came out of file management system!");
        }
    }

    private void setOptions(int option) {
        this.options = option;
    }
    public int getOptions(){
        return this.options;
    }



}
