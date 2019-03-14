package Word;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;
import static java.lang.System.*;
import java.util.ArrayList;
import java.util.Collections;

public class WordRunner {

    public static void main(String args[]) throws IOException {
        Scanner file = new Scanner(new File("src/Word/words.dat"));
        int size = file.nextInt();
        file.nextLine();
        ArrayList<Word> Words = new ArrayList<Word>();
        for(int i = 0; i<size;i++)
            Words.add(new Word(file.nextLine()));
        Collections.sort(Words);
        for(Word i: Words)
            System.out.println(i.toString());

    }
}
