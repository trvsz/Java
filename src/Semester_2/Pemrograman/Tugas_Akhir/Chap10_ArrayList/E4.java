package Semester_2.Pemrograman.Tugas_Akhir.Chap10_ArrayList;

/*
 * Travis Zusa Zuve Saputra
 * 22537141013
 */

import java.util.*;
import java.io.*;

public class E4 {
    public static void main(String[] args) throws FileNotFoundException{
        ArrayList<String> allWords = new ArrayList<String>();
		Scanner input = new Scanner(new File("D:\\Kuliah\\Software\\Visual Studio Code\\Java\\src\\Semester_2\\Pemrograman\\Tugas_Akhir\\Chap10_ArrayList\\words.txt"));
		while (input.hasNext()) { // while there are more words to read
			String word = input.next(); // read the next word
			allWords.add(word); // add to the list
		}
		System.out.println(allWords); // print all words

		// remove all plural words
		for (int i = 0; i < allWords.size(); i++) {
			String word = allWords.get(i); // get the word
			if (word.endsWith("s")) { // if it ends with s
				allWords.remove(i); // remove it
			}
		}
    }
}
