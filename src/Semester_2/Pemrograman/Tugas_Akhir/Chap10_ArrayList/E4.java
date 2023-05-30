package Semester_2.Pemrograman.Tugas_Akhir.Chap10_ArrayList;

/*
 * Travis Zusa Zuve Saputra
 * 22537141013
 */

import java.util.*;
import java.io.*;

public class E4 {
    public static void main(String[] args) throws FileNotFoundException {
		ArrayList<String> allWords = new ArrayList<String>();
		Scanner input = new Scanner(new File("D:\\Kuliah\\Software\\Visual Studio Code\\Java\\src\\Semester_2\\Pemrograman\\Tugas_Akhir\\Chap10_ArrayList\\words.txt"));
		while (input.hasNext()) {
			String word = input.next();
			allWords.add(word);
		}
		System.out.println(allWords);
	
		Iterator<String> iterator = allWords.iterator(); // Mengambil nilai dari list
		while (iterator.hasNext()) { // Pengulangan untuk mengambil nilai dari list
			String word = iterator.next(); // Menyimpan nilai list ke dalam variabel word
			if (word.endsWith("s")) { // Jika word berakhiran s
				iterator.remove(); // Menghapus nilai list
			}
		}
	
		System.out.println(allWords); // Menampilkan nilai list
	}
}

/*
Kode diatas sudah dimodif untuk menghilangkan kata yang berakhiran s dari list

Iterator = mengakses nilai-nilai yang disimpan pada collection satu per-satu

Kode diatas jika diberi breakpoint pada if di dalam while akan menghasilkan:
i = 0, word = "aa"
i = 1, word = "aah"
i = 2, word = "aahed"
i = 3, word = "aahing"
i = 4, word = "aahs"
i = 5, word = "aal"

hal ini dapat membuktikan jika if pada perulangan tersebut akan menunjukkan:
i = 0, word = first_word
i = 1, word = second_word
i = 2, word = third_word
i = 3, word = fourth_word
i = 4, word = fifth_word
i = 5, word = sixth_word
 */