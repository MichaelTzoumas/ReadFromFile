package ReadFromFile;

import java.util.Scanner;
import java.io.File;							//Απαραίτητο import για να κάνω εισαγωγή απο file
import java.io.FileNotFoundException;			//Απαραίτητο για το Exception 

public class ReadFromFile {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(new File ("text.txt"));	//Παιρνει δεδομένα απο το αρχείο text.txt που βρίσκεται στο ReadFromFile
		
		while(in.hasNextLine()) {							//Κάνει έλεγχο αν υπάρχει κιαλλη γραμμή στο αρχείο
			System.out.println(in.nextLine());
		}

		in.close();
	}

}
