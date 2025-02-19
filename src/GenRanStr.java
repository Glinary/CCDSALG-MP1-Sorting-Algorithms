/*
  MCO1 Sorting S21 Group 4
  Cabungcal, Mary Joselle
  Ladrido, Eryl Gabriel
  Rejano, Hans Martin
  Uy, Gleezell Vina
*/

/**
 * Interface defining the contract for providing an alphabet set.
 * Implementing classes define specific character sets (e.g., DNA, Binary, Amino Acids).
 */
interface AlphabetProvider {
  /**
   * Retrieves the set of characters (alphabet) used for random string generation.
   * @return An array of characters representing the alphabet.
   */
  char[] getAlphabet();
}

/**
* Implementation of AlphabetProvider for Amino Acids.
* Uses the 20 standard amino acids found in proteins.
*/
class AlphabetProviderAminoAcid implements AlphabetProvider {
  private final char[] alphabet = {
      'A', 'R', 'N', 'D', 'C', 'E', 'Q', 'G', 'H', 'I', 
      'L', 'K', 'M', 'F', 'P', 'S', 'T', 'W', 'Y', 'V'
  };

  @Override
  public char[] getAlphabet() {
      return alphabet;
  }
}

/**
* Implementation of AlphabetProvider for Binary representation.
* Uses '0' and '1' as the character set.
*/
class AlphabetProviderBinary implements AlphabetProvider {
  private final char[] alphabet = {'0', '1'};

  @Override
  public char[] getAlphabet() {
      return alphabet;
  }
}

/**
* Implementation of AlphabetProvider for DNA sequences.
* Uses 'a', 'c', 'g', and 't' as the character set.
*/
class AlphabetProviderDNA implements AlphabetProvider {
  private final char[] alphabet = {'a', 'c', 'g', 't'};

  @Override
  public char[] getAlphabet() {
      return alphabet;
  }
}

/**
* Class responsible for generating random strings using a specified AlphabetProvider.
* Supports different alphabet types and suffix generation.
*/
public class GenRanStr {
  private AlphabetProvider alphabetProvider;

  /**
   * Default constructor.
   * Initializes with the DNA alphabet provider ('a', 'c', 'g', 't').
   */
  public GenRanStr() {
      this.alphabetProvider = new AlphabetProviderDNA();
  }

  /**
   * Sets the alphabet provider dynamically.
   * Allows changing the character set at runtime.
   * 
   * @param alphabetProvider The AlphabetProvider implementation to use.
   */
  public void setAlphabetProvider(AlphabetProvider alphabetProvider) {
      this.alphabetProvider = alphabetProvider;
  }

  /**
   * Executes the currently set alphabet provider and retrieves its character set.
   * 
   * @return A character array representing the current alphabet set.
   */
  public char[] executeAlphabetProvider() {
      return alphabetProvider.getAlphabet();
  }

  /**
   * Generates a random string of the specified length using the active alphabet provider.
   * Also constructs a suffix array where each entry is a progressively shorter substring.
   *
   * @param n The length of the random string to generate.
   * @return An array of suffixes derived from the generated random string.
   */
  public String[] getSuffix(int n) {
      char[] alphabet = executeAlphabetProvider();
      String res = "";
      int i;

      // Construct random string using characters from the selected alphabet
      for (i = 0; i < n; i++)
          res += alphabet[(int) (Math.random() * alphabet.length)];

      // Create suffix array with the same length as the generated string
      String[] suffix = new String[res.length()];

      // Populate suffix array with progressively shorter substrings
      for (i = 0; i < res.length(); i++)
          suffix[i] = res.substring(i);

      // Print the generated string and suffixes
      System.out.println("Generated: " + res);
      for (i = 0; i < suffix.length; i++) {
          System.out.println(i + ": " + suffix[i]);
      }

      return suffix;
  }
}
