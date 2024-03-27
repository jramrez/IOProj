import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class Main {
  public static void main(String[] args) throws IOException {
    File inputXYZ = new File("inputfile.txt");
    inputXYZ.delete();
    inputXYZ.createNewFile();
    File outputXYZ = new File("outputfile.txt");
    outputXYZ.delete();
    outputXYZ.createNewFile(); 
    
    Scanner scanInput = new Scanner(System.in);
    Scanner scanFile = new Scanner(inputXYZ);
    
    FileWriter writeInput = new FileWriter(inputXYZ);
    FileWriter writeOutput = new FileWriter(outputXYZ);
    scanFile.useDelimiter("[,, ,,\\n]");
    boolean inputActive = true;

    while (inputActive) {
      Library.clearConsole();
      System.out.println("Enter a 2 xyz coordinates in the following format: x2,y2,z2 x1,y1,z1. Type 'exit' to exit:");
      String command = scanInput.nextLine();
      if (command.equals("exit")) {
        inputActive = false;
        writeInput.close();
        scanInput.close();
      }
      else {
        writeInput.write(command + "\n");
      }
    }
    Library.clearConsole();
    while (scanFile.hasNext()) {
      int diffX = Integer.parseInt(scanFile.next());
      int diffY = Integer.parseInt(scanFile.next());
      int diffZ = Integer.parseInt(scanFile.next());
      diffX -= Integer.parseInt(scanFile.next());
      diffY -= Integer.parseInt(scanFile.next());
      diffZ -= Integer.parseInt(scanFile.next());
      writeOutput.write(Double.toString(Math.sqrt(Math.pow(diffX, 2) + Math.pow(diffY, 2) + Math.pow(diffZ,2))) + "\n");
    }
    System.out.println("Done!");
    writeOutput.close();
  }
}
