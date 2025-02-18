public class BubbleSort extends SortingTemplate {

    /**
    *This sorts the text array using bubble sort algorithm
    *
    *@param text - array of generated text
    */
    @Override
    protected void sort(String[] text) {
        for (int i = 1; i <= text.length - 1; i++) {
            for (int j = 0; j < text.length - i; j++) {
                // compare the adjacent strings
                if (text[j].compareTo(text[j + 1]) > 0) { //condition for swapping elements
                String temp = text[j + 1];
                text[j + 1] = text[j];
                text[j] = temp;
                }
            }
        }      
    }
}
