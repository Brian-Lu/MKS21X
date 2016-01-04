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
	int x = 0;
	for (int i = 1; i < data.length; i++) {
	    if(data[i] < data[i - 1]) {
		int z = data[i];
		while (x < data[i]) {
		    x++;
		}
		int y = i;
		for (y = i; y > x; y--) {
		    data[y] = data[y-1];
		}
		data[x] = z;
	    }
	}
    }
    public static void selectionSort(int[] data) {
	int min = data[0];
	for (int i = 0; i < data.length; i++) {
	    for (int z = i; z < data.length; z++) {
		if (data[z] < min) {
		    min = data[z];
		}
	    }
	    data[i] = minIndex;
	}
    }
}
