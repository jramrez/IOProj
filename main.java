import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        FileInputStream inputXYZ = null;
        FileOutputStream outputXYZ = null;
        FileReader readXYZ = new FileReader("outputfile.txt");

        int distanceX = 0;
        int distanceY = 0;
        int distanceZ = 0;
        while ((readXYZ.read()) != -1) {
            distanceX += readXYZ.read();
        }
        inputXYZ.close();
        outputXYZ.close();
        readXYZ.close();
        scan.close();
    }
}