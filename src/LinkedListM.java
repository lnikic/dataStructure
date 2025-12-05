import java.util.NoSuchElementException;

public class LinkedListM {

    private class NodeM {
        private int value;
        private NodeM next;

        public NodeM(int value) {
            this.value = value;
        }
    }

    private NodeM first;
    private NodeM last;

    public void addLast(int value) {
        var node = new NodeM(value);
        if (first == null) {
            first = node;
            last = node;
        } else {
            last.next = node;
            last = node;
        }
    }

    public void addFirst(int value) {
        var node = new NodeM(value);
        if (first == null) {
            first = node;
            last = node;
        } else {
            node.next = first;
            first = node;
        }
    }

    public int indexOf(int item) {
        int index = 0;
        var current = first;
        while (current != null) {
            if (current.value == item) {
                return index;
            }
            current = current.next;
            index++;
        }
        return -1;
    }

    public boolean contains(int item) {
        return indexOf(item) != -1;
    }

    public void removeFirst() {
        if (first == null) {
            throw new NoSuchElementException();
        }

        if (first == last) {
            first = null;
            last = null;
            return;
        }

        var next = first.next;
        first.next = null;
        first = next;
    }

    public void removeLast() {
        if (first == null) {
            throw new NoSuchElementException();
        }

        if (first == last) {
            first = null;
            last = null;
            return;
        }

        var previous = getPrevious(last);
        last = previous;
        last.next = null;
    }

    private NodeM getPrevious(NodeM nodeM) {
        var current = first;
        while (current != null) {
            if (current.next == nodeM) {
                return current;
            }
            current = current.next;
        }
        return null;
    }
}
