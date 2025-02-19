public class MergeSort extends SortingTemplate {


    public MergeSort() {
        super("Merge Sort");
    }

    /**
     * This calls the merge sort algorithm to sort the text array
     *
     * @param text - the array of generated text
     */
    @Override
    protected void sort(String[] text) {
        // Merge Sort Implementation
        int left = 0;
        int right = text.length - 1;
        
        // Start the merge sort
        mergeSort(text, left, right);
    }

    /**
     * This recursively divides the array into subarrays and sorts them
     */
    private void mergeSort(String[] text, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            // Recursively sort the two halves
            mergeSort(text, left, mid);
            mergeSort(text, mid + 1, right);

            // Merge the sorted halves
            merge(text, left, mid, right);
        }
    }

    /**
     * This merges two subarrays of the String[] text
     */
    private void merge(String[] text, int p, int q, int r) {
        int n1 = q - p + 1;
        int n2 = r - q;

        // Create two arrays for the left and right sides
        String[] L = new String[n1];
        String[] R = new String[n2];

        // Initialize the data of the left and right subarrays
        int i, j;
        for (i = 0; i < n1; i++) {
            L[i] = text[p + i];
        }

        for (j = 0; j < n2; j++) {
            R[j] = text[q + 1 + j];
        }

        // Reset values to 0
        i = 0;
        j = 0;
        int k = p;

        // Merge the left and right subarrays back into the original array
        while (i < n1 && j < n2) {
            if (L[i].compareTo(R[j]) <= 0) {
                text[k] = L[i];
                i++;
            } else {
                text[k] = R[j];
                j++;
            }
            k++;
        }

        // Copy the remaining elements from the left array, if any
        while (i < n1) {
            text[k] = L[i];
            i++;
            k++;
        }

        // Copy the remaining elements from the right array, if any
        while (j < n2) {
            text[k] = R[j];
            j++;
            k++;
        }
    }
}
