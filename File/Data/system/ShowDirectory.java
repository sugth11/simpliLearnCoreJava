package File.Data.system;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ShowDirectory extends Directory {
    String[] pathNames;
    String path;
public ShowDirectory(){
    super();
}
    public List<String> getBookList(){
        File f = new File(this.getPath());
        pathNames = f.list();
        List<String> bookList = Arrays.asList(f.list());
        List<String> sortedList = bookList.stream().sorted().collect(Collectors.toList());
        return sortedList;
    }
}
