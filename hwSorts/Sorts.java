public class Sorts{
    public static void printArray(int[] data) {
	System.out.print("[");
	for (int i = 0; i < data.length - 1; i++) {
	    System.out.print(data[i] + ", ");
	}
	System.out.print(data[data.length - 1]);
	System.out.println("]");
    }
    public static void insertionSort(int[] data) {
	for (int i = 1; i < data.length; i++) {
	    int x = data[i];
	    int a;
	    for (a = i - 1; a >= 0 &&  x < data[a]; a--) {
		data[a+1] = data[a];
	    }
	    data[a+1] = x;
	}
    }
    public static void selectionSort(int[] data) {
	int min = data[0];
	int minIndex = 0;
	for (int i = 0; i < data.length; i++) {
	    for (int z = i; z < data.length; z++) {
		min = data[z];
		if (data[z] < min) {
		    min = data[z];
		    minIndex = z;
		}
	    }
	    data[minIndex] = data[i];
	    data[i] = min;
	}
    }
}