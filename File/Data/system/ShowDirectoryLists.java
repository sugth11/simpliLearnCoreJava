package File.Data.system;

import java.util.Scanner;

public class ShowDirectoryLists {
    public ShowDirectoryLists(ShowDirectory filesLists) {
        String[] books = filesLists.getBookList().toArray(new String[0]);
        if(books.length<1){
            System.out.println("This Directory is empty");
        } else {
            System.out.println("My Book Lists are:");
            for (String book : books) {
                System.out.println(book);
            }
            System.out.println("No of books are "+books.length);
            System.out.println("Enter 4 to go back to main menu:");
            Scanner option= new Scanner(System.in);
            int getOp = option.nextInt();
            if(getOp==4){
                OptionSelections newOption = new OptionSelections();
            }
        }
    }
}
