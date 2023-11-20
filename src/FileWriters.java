import java.io.FileWriter;
import java.io.IOException;  

public class FileWriters {
    // File writing logic
    public void write(String data) {
        // Write to a file
    	try {
  	      FileWriter myWriter = new FileWriter("details.txt");
  	      myWriter.write(data);
  	      myWriter.close();
  	    } catch (IOException e) {
  	      System.out.println("An error occurred.");
  	      e.printStackTrace();
  	    }
    }
}
