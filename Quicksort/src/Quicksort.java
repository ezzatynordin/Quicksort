public class Quicksort
{
        int left; int right;
        int counter;

        public static void main(String[] args)
        {

        }

        void quicksort(String[] arr, int size)
        {
                int i= left;
                int j= right;
                String pivot = arr[( left + right ) / 2];
                String temp;
                counter = 1;
                counter++;

                for (i = 1; i < size; i++) {

                        for (j = i + 1; j < size; j++)
                        {

                                counter += 4;
                                counter += 4;
                                while (i <= j) {

                                        while (arr[i].compareTo(pivot) <= 0 && i < right && j > i)
                                        {
                                                i++;
                                        }
                                        while (arr[j].compareTo(pivot) >= 0 && j > left && j >= i)
                                        {
                                                j--;
                                        }

                                        if (i <= j) {
                                                temp = arr[i];
                                                arr[i] = arr[j];
                                                arr[j] = temp;
                                                i++;
                                                j--;
                                                counter += 20;
                                        }

                                        counter += 2;
                                        System.out.println(arr[i]);
                                }
                        }
                        System.out.println("Number of primitive:");
                }
                }
        }
