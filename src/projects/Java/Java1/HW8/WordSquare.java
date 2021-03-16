/***********************
 *
 *   WordSquare - creates a 2D array of char representing a find-a-word puzzle.
 *
 *   Author:   Shawn Brenneman
 *   Date:     2015-Nov-29
 *
 ***********************/ 
 import java.util.*;
 import java.io.*;

 public class WordSquare {

 public static final int MAX_PUZZLE = 4;
 public static final String PUZZLE_FILE = "WordPuzzles.txt";


 private static void skipPuzzle(Scanner file) throws IOException {

    String firstLine = file.nextLine();
    int size = firstLine.length();
    for (int i=1; i < size; i++) {
        file.nextLine();
    }
 }

 private static void skipWords(Scanner file) {
 
    Scanner lineScan = new Scanner(file.nextLine());
    lineScan.useDelimiter(":");

    while(!lineScan.next().equals("end")) {
        lineScan = new Scanner(file.nextLine());
        lineScan.useDelimiter(":");
    }

 }

 private static boolean isValid(int pNum) {
    return ((1 <= pNum) && (pNum <= MAX_PUZZLE)); 
 }

 public static char[][] create(int pNum) throws IOException {
    
    char[][] puzzle = null;
    Scanner fileScan = new Scanner(new File(PUZZLE_FILE));
    String line;

    if (isValid(pNum)) {

        for (int cnt=1; cnt <pNum; cnt++) {
            skipPuzzle(fileScan);
            skipWords(fileScan);
        }
        line = fileScan.nextLine();
        int size = line.length();

        puzzle = new char[size][size];

        puzzle[0] = line.toCharArray();

        for (int i=1; i < size; i++) {
            puzzle[i] = fileScan.nextLine().toCharArray();
        }

    }
    return puzzle;
 }

 private static String[] readWords(Scanner file) throws IOException {

    ArrayList<String> words = new ArrayList<String>();

    Scanner lineScan = new Scanner(file.nextLine());
    lineScan.useDelimiter(":");

    while(!lineScan.next().equals("end")) {
        words.add(lineScan.next());
        lineScan = new Scanner(file.nextLine());
        lineScan.useDelimiter(":");
    }
    String[] returnArray = new String[words.size()];
    words.toArray(returnArray);
    return returnArray;
 }

 public static String[] wordList(int pNum) throws IOException {

    Scanner fileScan = new Scanner(new File(PUZZLE_FILE));
    String[] words2Find = null;

    if (isValid(pNum)) {

        for (int cnt=1; cnt < pNum; cnt++) {
            skipPuzzle(fileScan);
            skipWords(fileScan);
        }
        skipPuzzle(fileScan);
        words2Find = readWords(fileScan);
    }
     
    return words2Find;
 }

 }