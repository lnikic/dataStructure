public class ArrayM {
    private int[] items;
    private int count;

    public ArrayM(int length) {
        items = new int[length];
    }

    public void insert(int e) {
        if (items.length == count) {
            int[] newItems = new int[count * 2];
            for (int i = 0; i < count; i++) {
                newItems[i] = items[i];
            }
            items = newItems;
        }
        items[count] = e;
        count++;
    }

    public void remove(int index) {
        if (index < 0 || index >= count) {
            throw new IllegalArgumentException();
        }
        for (int i = index; i < count; i++) {
            items[i] = items[i + 1];
        }
        count--;
    }

    public int indexOf(int item) {
        for(int i = 0; i < count; i++) {
            if(items[i] == item) {
                return i;
            }
        }
        return -1;
    }

    public void print() {
        System.out.print("[");
        for (int i = 0; i < count; i++) {
            System.out.print(" " + items[i]);
        }
        System.out.println(" ]");
    }
}
