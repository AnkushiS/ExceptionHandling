import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.*;
import java.io.IOException;
import java.util.*;

// gets an input of file name, creates it. Then asks for input of integer, checks in hashmap,
// if not present in hash map, asks if need to add. if yes, then adds/writes it to the file.
public class HashMapsSaveFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// ask for input from user
		Scanner scan = new Scanner(System.in);
		String opted = "Y";

		HashMap<Integer, String> hash1 = new HashMap<Integer, String>();
		// initialize the hash map with a few values
		hash1.put(2, "two");
		hash1.put(3, "three");
		hash1.put(5, "five");

		// create a file
		System.out.println("Please enter filename: ");
		String fname = scan.next();
		File file = new File(fname);
		file.createNewFile();

		// create a reader file object
	
		// create a writer file object
		BufferedWriter outputStream = new BufferedWriter(new FileWriter(file));
		BufferedReader inStream = new BufferedReader(new FileReader(file));

		while (opted.equalsIgnoreCase("Y")) {
			System.out.println("Please enter integer: ");
			int oneInp = scan.nextInt();
			if (hash1.containsKey(oneInp) == true) {
				System.out.println("already have it");
				// read if the file has it or not
			} else {
				System.out.println("Do you want to add the value? (y/n)");
				opted = scan.next();
				if (opted.equalsIgnoreCase("y")) {
					System.out.println("Please enter the value: ");
					String value = scan.next();
					hash1.put(oneInp, value);
					// write to the file too
					try {
							outputStream.write(hash1.get(oneInp) + "\n");
						
							//outputStream.append(hash1.get(oneInp) + "\n");
							System.out.println("%%%%%%%%%%" + hash1.get(oneInp));
					}
					catch(IOException e){
						System.out.println(e.getMessage());
					}
				}
				System.out.println("Do you wish to continue? y/n ");
				opted = scan.next();
				
				if (opted.equalsIgnoreCase("n")) {
					outputStream.close();

					System.out.println("Values in the file: ");
					try{
						String str = "";
						//System.out.println(inStream.read());
						while((str = inStream.readLine()) != null){
							// read first line
							
							//Scanner scanner = new Scanner(file.getAbsoluteFile());
							System.out.println(str);
						}
							
						//}
					}catch(Exception e){
						System.out.println("error: " + e.getMessage());
					}
					System.out.println("BBBYYYEEE");
				}
			}
		}
		scan.close();
	}
}
