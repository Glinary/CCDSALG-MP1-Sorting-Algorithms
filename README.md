# CCDSALG-MP1-Sorting-Algorithms
This is a program that evaluates and outputs the runtime of Bubble Sort and Merge Sort with a given number of strings.
#
created by: Mary Joselle Cabungcal, Eryl Ladrido, Martin Rejano, Gleezell Vina Uy
#
modified by: Gleezell Vina Uy, Erika Culala, Trisha Sayo, Joshua Corpuz, Angelo Guerra

## Implementation of the Template Design Pattern

This project has been refactored to use the **Template Design Pattern** to improve code modularity and reusability in sorting algorithms.

### Changes Made:
1. **Introduced an Abstract Class (`SortingTemplate.java`)**:  
   - This serves as the template class that defines a common structure for sorting algorithms.
   - Provides a base method that outlines the sorting process while allowing subclasses to implement specific sorting logic.

2. **Implemented Concrete Sorting Classes (`BubbleSort.java`, `MergeSort.java`)**:  
   - Each sorting algorithm extends `SortingTemplate.java` and implements its own sorting method.
   - This ensures a standardized approach to sorting while maintaining flexibility for different algorithms.

3. **Refactored Main (`Main.java`)**:  
   - Instead of directly implementing sorting logic, `Main.java` now delegates sorting to an instance of a specific sorting class.
   - This abstraction makes it easy to introduce new sorting algorithms without modifying existing code.

4. **Encapsulation of Sorting Logic**:  
   - Sorting operations follow a structured approach using the template method.
   - New sorting algorithms can be added by simply creating a new subclass of `SortingTemplate.java`.

Using this approach, the code follows the **Open-Closed Principle (OCP)** in SOLID design principles, making it more maintainable and extensible.
