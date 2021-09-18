package final_Project;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;


public class Dir_File{
	
	 public static void file_list() throws IOException {

	
		String path ="D:\\File_Store";

		File file = new File(path);

		File name[] = file.listFiles();

		Arrays.sort( name);

		for (File e :name) {

			if (e.isFile()) {
				System.out.println("File : " + e.getName() + "  Location of File is " + e.getAbsolutePath());
			} 
			else {
				System.out.println("Not Known :" + e.getName() + " " + e.getAbsolutePath());
			}

		}

	}}
	
   
   
 
 
