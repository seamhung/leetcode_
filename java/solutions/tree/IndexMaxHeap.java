package solutions.tree;

/**
 * Created by hoducust on 2018/9/3 22H 36m .
 */
public class IndexMaxHeap<Item> {

    Item[] data;
    int count;
    int capacity;

    public IndexMaxHeap(int capacity) {
        data = (Item[]) new Comparable[capacity + 1];
        this.capacity = capacity;
        this.count = 0;
    }

    public void insert(Item item) {

    }

    public Item extractMax() {

    }

    public boolean isEmpty() {
        return count == 0;
    }

    public int size() {
        return count;
    }

    private void shiftUp() {

    }

    private void shiftDown() {

    }

    private void swap(Item[] arr, int i, int j) {
        Item temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
