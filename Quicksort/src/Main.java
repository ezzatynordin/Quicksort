import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main extends DynamicArrays{

    public static void main (String[] args) {
        DynamicArrays array = new DynamicArrays();

        try{
            //the file to be opened for reading
            FileInputStream fis=new FileInputStream("C:\\Users\\hp\\Desktop\\wordList.txt");
            Scanner sc=new Scanner(fis);//file to be scanned
            //returns true if there is another line to read
            while(sc.hasNextLine())
            {
                array.addElementsToArray(sc.nextLine());
            }
            sc.close();     //closes the scanner
        }
        catch(IOException e){
            e.printStackTrace();
        }

        array.displayArrayElements();
    }
}