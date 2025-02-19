/*
  MCO1 Sorting S21 Group 4
  Cabungcal, Mary Joselle
  Ladrido, Eryl Gabriel
  Rejano, Hans Martin
  Uy, Gleezell Vina

  Code References:
  https://www.geeksforgeeks.org/program-generate-random-alphabets/ - Basis for generating random string

  https://www.geeksforgeeks.org/merge-sort/ -Basis for merge sort
  
*/

/*
  REFACTORED BY DSGNPAT TEAM 3
  Corpuz, Joshua
  Culala, Mary Erika
  Guerra, Angelo
  Sayo, Alina
  Uy, Gleezell Vina

*/

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner numScanner = new Scanner(System.in);
    // Asking user for input N
    System.out.print("Enter n: ");
    int n = numScanner.nextInt();
    
    // Asking user for number of iterations K
    System.out.print("Enter k: ");
    int k = numScanner.nextInt();

    System.out.println("Select Alphabet Patterns:");
    System.out.println("1 - DNA (A, C, G, T)");
    System.out.println("2 - Amino Acids (Protein Sequences)");
    System.out.println("3 - Binary (0, 1)");
    int a = numScanner.nextInt();
    
    numScanner.close();

    GenRanStr genRanStr = new GenRanStr();
    BubbleSort bubbleSort = new BubbleSort();
    MergeSort mergeSort = new MergeSort();

    switch (a) {
      case 1: genRanStr.setAlphabetProvider(new AlphabetProviderDNA());
      break;
      case 2: genRanStr.setAlphabetProvider(new AlphabetProviderAminoAcid());
      break;
      case 3: genRanStr.setAlphabetProvider(new AlphabetProviderBinary());
      break;
    } 

    for (int i = 0; i < k; i++) {
      // Use GenRanStr to generate random suffixes
      String[] suffixArray = genRanStr.getSuffix(n);

      // Create clones of the generated suffix array for sorting
      String[] bubbleArray = suffixArray.clone();
      String[] mergeArray = suffixArray.clone();
            
      System.out.println("Iteration " + (i + 1) + ":");
            
      // Sort and measure Bubble Sort
      bubbleSort.sortAndMeasure(bubbleArray);

      // Sort and measure Merge Sort
      mergeSort.sortAndMeasure(mergeArray);
            
      System.out.println();
    }
        
    printResults("Bubble Sort", bubbleSort);
    printResults("Merge Sort", mergeSort);

  }

  private static void printResults(String sortType, SortingTemplate sorter) {
    double best = sorter.getBestTime();
    double worst = sorter.getWorstTime();
    double avg = sorter.getAverageTime();
    
    System.out.println(sortType + " Results:");
    System.out.printf("Best: %.3f ms\n", best);
    System.out.printf("Worst: %.3f ms\n\n", worst);
    System.out.printf("Average: %.3f ms\n\n", avg);
  }
}
