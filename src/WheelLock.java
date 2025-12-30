public class WheelLock {

    private final CircularLinkedList[] lists;

    public WheelLock(){
        this.lists = null;
    }

    public WheelLock(char[]... lists) {
        this.lists = new CircularLinkedList[lists.length];
        int index = 0;
        for(char[] list : lists){
            this.lists[index++] = new CircularLinkedList(list);
        }
    }

    public String getCurrentValue() {
        if (this.lists == null) {
            return null;
        }
        StringBuilder currentValue = new StringBuilder();
        for(CircularLinkedList list : this.lists){
            currentValue.append(list.getHeadValue());
        }
        return currentValue.toString();
    }

    public int getWidth() {
        if (this.lists == null) return 0;
        return this.lists.length;
    }

    public void rotateWheel(int index) {
        if (this.lists != null) {
            this.lists[index].rotate();
        }
    }
}
