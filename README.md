# CCDSALG-MP1-Sorting-Algorithms
This a program that evaluates and outputs the runtime of Bubble Sort and Merge Sort with a given number of strings.
#
created by: Mary Joselle Cabungcal, Eryl Ladrido, Martin Rejano, Gleezell Vina Uy
#
modified by: Gleezell Vina Uy, Erika Culala, Trisha Sayo, Joshua Corpuz, Angelo Guerra


## Implementation of the Strategy Design Pattern
This project has been refactored to use the **Strategy Design Pattern** to improve code modularity and flexibility in sorting algorithms. 

### Changes Made:
1. **Introduced an Interface (`Sort.java`)**: This serves as the strategy interface that defines a common method for sorting.
2. **Implemented Sorting Strategies (`IndexArray.java`)**: Sorting algorithms are now implemented as separate strategy classes.
3. **Refactored Main (`Main.java`)**: Instead of directly implementing sorting logic, `Main.java` now delegates sorting to an instance of `Sort`.
4. **Encapsulation of Sorting Logic**: Sorting strategies can be easily swapped without modifying the main code structure.

Using this approach, new sorting algorithms can be added with minimal code changes, following the **Open-Closed Principle (OCP)** in SOLID design principles.

# How to run
## Compile the code
```
javac BubbleSort.java GenRanStr.java Main.java MergeSort.java SortingTemplate.java
```
## Run the code
```
java Main
```
