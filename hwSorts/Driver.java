import java.util.Arrays;
public class Driver {
    public static void main (String[]args) {
	int[]ary = {1, 2, 9, 5, 0, 3};
	//Sorts.insertionSort(ary);
	Sorts.selectionSort(ary);
	System.out.println(Arrays.toString(ary));
    }
}