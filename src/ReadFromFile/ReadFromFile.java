package ReadFromFile;

import java.util.ArrayList;						//Απαραίτητο για να εισάγω ArrayList
import java.util.List;							//Απαραίτητο για να εισάγω List
import java.util.Scanner;
import java.io.File;							//Απαραίτητο import για να κάνω εισαγωγή απο file
import java.io.FileNotFoundException;			//Απαραίτητο για το Exception 

public class ReadFromFile {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner in = new Scanner(new File ("text.txt"));	//Παιρνει δεδομένα απο το αρχείο text.txt που βρίσκεται στο ReadFromFile

/*---1ος Τρόπος! Τραβάει δεδομένα απο το αρχείο text.txt και τα εκτυπώνει  ----	



		while(in.hasNextLine()) {							//Κάνει έλεγχο αν υπάρχει κιαλλη γραμμή στο αρχείο
			System.out.println(in.nextLine());
		}
		
		*/
		
		
		
/*---2ος Τρόπος! Να πηγαίνουν απο το αρχείο στη λίστα και να εκτυπώνωνται μετά----*/	

/*Ορισμός => The List class is a resizable array, which can be found in the java.util package.---*/
		
		List<String> family = new ArrayList<String>();		//Φτιάχνει μια καινούρια Λίστα τύπου String, με όνομα family
		
		while(in.hasNextLine()) {							//Κάνει έλεγχο αν υπάρχει κιαλλη γραμμή στο αρχείο
			family.add(in.nextLine());						//Βάζει δεδομένα στη λίστα με την εντολή add, τα οποία τραβάει απο το αρχείο 
		}
		
		
		for(int i=0;i<family.size();i++) {					//Εκτυπώνει ολα τα δεδομένα της λίστας 
			System.out.println("Όνομα= "+ family.get(i));	//Με την εντολή get(i) παίρνω το περιεχόμενο του στοιχείου που βρίσκεται στην θέση i στην λίστα
			
			
			
			
		}
		
		in.close();
	}

}
