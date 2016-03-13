import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws IOException {
		DbOperations d=new DbOperations();
		ArrayList<Employee> a=(ArrayList) d.selectAll();
		String tmp=a.toString();
		System.out.println(tmp);
		File f = new File("E:/mydb.txt");
        FileWriter fw = new FileWriter(f);
        fw.write(tmp);
        fw.close();
		
	}

}
