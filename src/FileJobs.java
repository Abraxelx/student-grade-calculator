import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileJobs {

    public void createFile(){
        try {
            File myObj = new File("Students.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            System.out.println(e.getMessage());
        }
    }

    public FileWriter fileWriter(String text) throws IOException{
            FileWriter myWriter = new FileWriter("Students.txt");
            myWriter.write(text);
            System.out.println("Successfully wrote to the file.");
            return myWriter;
        }
    }
