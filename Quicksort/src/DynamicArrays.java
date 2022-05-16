public class DynamicArrays extends Quicksort {

    String[] str;
    int sizeOfStr;
    int arrayCapacity;

    public DynamicArrays() {
        str = new String[2];
        sizeOfStr = 0;
        arrayCapacity = 2;
    }
    // method for adding elements to specific position
    public void addElementAtPosition(int position, String value) {
        // makes the capacity double if all the array elements filled
        if (sizeOfStr == arrayCapacity) {
            increaseCapacity(2);
        }
        // shifting array elements
        for (int p = sizeOfStr - 1; p >= position; p--) {
            str[p + 1] = str[p];
        }
        // adding the element at specific position
        str[position] = value;
        sizeOfStr++;
    }

    // method for increasing capacity if all the elements in an array filled
    public void increaseCapacity(int minimumCapacity) {
        String[] temp = new String[arrayCapacity * minimumCapacity];
        if (arrayCapacity >= 0) System.arraycopy(str, 0, temp, 0, arrayCapacity);
        str = temp;
        arrayCapacity = arrayCapacity * minimumCapacity;
    }

    // method for adding elements
    public void addElementsToArray(String element) {
        // makes the capacity double if all the array elements filled
        if (sizeOfStr == arrayCapacity) {
            increaseCapacity(2);
        }
        str[sizeOfStr] = element;
        sizeOfStr++;
    }

    // method for display all elements
    public void displayArrayElements() {
        System.out.println("Best Case \n");
        quicksort(str, 5);
        System.out.println("\n\nAverage Case \n");
        quicksort(str, 15);
        System.out.println("\n\nWorst Case \n");
        quicksort(str, 20);
    }
}