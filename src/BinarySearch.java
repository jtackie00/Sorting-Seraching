
public class BinarySearch extends SelectionSort{

    public int BinSearch(int[] array, int key){

        sort(array);

        int low = 0;
        int high = array.length;
        int mid;

        while (low <= high) {
            mid = high / 2;

            if (array[mid] == key) {
                return mid;
            } else if (array[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

}
