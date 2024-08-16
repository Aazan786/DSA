package First;

public class Array {
    private int[] items;
    private int count;

    public Array(int length) {
        items = new int[length];
    }

    public void insert(int item) {
        if (items.length == count) {
            int newitems[] = new int[count * 2];
            for (int i = 0; i < count; i++)
                newitems[i] = items[i];
            items = newitems;
        }
        items[count++] = item;
    }

    public void insertAt(int item, int index) {
        if (index < 0 || index >= count)
            throw new IllegalArgumentException();
        count++;
        for (int i = count - 1; i > index; i--)
            items[i] = items[i - 1];

        items[index] = item;
    }

    public void removeAt(int index) {
        if (index < 0 || index >= count)
            throw new IllegalArgumentException();
        for (int i = index; i < count - 1; i++)
            items[i] = items[i + 1];
        count--;
    }

    public int indexOf(int item) {
        for (int i = 0; i < count; i++)
            if (items[i] == item)
                return i;
        return -1;
    }

    public int Max() {
        int max = items[0];
        for (int i = 0; i < count; i++)
            if (max < items[i])
                max = items[i];
        return max;
    }

    public int Min() {
        int min = items[0];
        for (int i = 0; i < count; i++)
            if (min > items[i])
                min = items[i];
        return min;
    }

    public void reverse() {
        for (int i = count - 1; i >= 0; i--) {
            System.out.println(items[i]);
        }
    }

    public void print() {
        for (int i = 0; i < count; i++) {
            System.out.println(items[i]);
        }
    }
}