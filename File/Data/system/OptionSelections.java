package File.Data.system;

import java.util.Scanner;

public class OptionSelections {
    int optionss;

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
        if(optionss == 1){
            ShowDirectory fileLists = new ShowDirectory();
            ShowDirectoryLists showLists = new ShowDirectoryLists(fileLists);
        }
        if(option == 2){
            System.out.println("Enter 1 to add a book:");
            System.out.println("Enter 2 to delete a book:");
            System.out.println("Enter 3 to Search a book:");
            System.out.println("Enter 4 to return to Main menu:");
            Scanner operation= new Scanner(System.in);
            int getOp = operation.nextInt();
            if(getOp == 1){
                System.out.println("please enter file to add");
                Scanner files= new Scanner(System.in);
                String fileName = files.next();
                addFile add = new addFile(fileName);
                add.addFiles();
            }
            if(getOp == 2){
                System.out.println("please enter file to be searched..");
                Scanner files= new Scanner(System.in);
                String fileName = files.next();
                DeleteFile delete = new DeleteFile(fileName);
                delete.deleteFiles();
            }
            if(getOp == 3){
                System.out.println("please enter file name to delete");
                Scanner files= new Scanner(System.in);
                String fileName = files.next();
                SearchFile search = new SearchFile(fileName);
                search.searchFiles();
            }
            if(getOp == 4){
                OptionSelections newOption = new OptionSelections();
            }
        }
        if(option == 3){
            System.out.println("you are successfully came out of file management system!");
        }
    }

    private void setOptions(int option) {
        this.optionss = option;
    }
    public int getOptions(){
        return this.optionss;
    }



}
