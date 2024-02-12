import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        File inputXYZ = new File("inputfile.txt");
        File outputXYZ = new File("outputfile.txt");
        File testXYZ = new File("test.txt");
        Scanner scanTest = new Scanner(testXYZ);
        Scanner scanFile = new Scanner(inputXYZ);
        scanFile.useDelimiter("  ");
        boolean inputActive = true;

        try {
            do {
                
                scanTest.nextLine();
                inputActive = false;
            } while (inputActive);
        }
        finally {
            scan.close();
            scanFile.close();    
            scanTest.close();
        }
    }
}