public class Cell {

    private Cell next;
    private char data;

    public Cell() {}

    public Cell(Cell next, char data){
        this.next = next;
        this.data = data;
    }

    public Cell getNext() {
        return next;
    }

    public void setNext(Cell next) {
        this.next = next;
    }

    public char getData() {
        return data;
    }

    public void setData(char data) {
        this.data = data;
    }
}