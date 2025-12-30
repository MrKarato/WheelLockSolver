public class CircularLinkedList {

    private Cell head;
    private Cell tail;
    private int length = 0;


    public CircularLinkedList(char[] data) {
        for (char datum : data) {
            append(datum);
            this.length += 1;
        }
    }

    public void append(char data) {
        Cell newCell;
        if (this.length > 0)
            newCell = new Cell(this.head, data);
        else {
            newCell = new Cell();
            newCell.setData(data);
            newCell.setNext(newCell);
            this.head = newCell;
        }
        if (this.tail != null)
            this.tail.setNext(newCell);
        this.tail = newCell;

    }

    public void rotate() {
        this.tail = this.head;
        this.head = this.head.getNext();
    }

    public char getHeadValue() {
        return this.head.getData();
    }

    public int getLength() {
        return this.length;
    }
}
