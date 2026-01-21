public class LetterWheel {
    char[] letters;

    public LetterWheel(char[] letters) {
        this.letters = letters;
    }

    public char getValueAt(int index) {
        return letters[index];
    }

    public int getLength() {
        return letters.length;
    }
}
