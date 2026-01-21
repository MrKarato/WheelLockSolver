import java.util.Arrays;
import java.util.HashSet;

public class WheelLock {

    private final LetterWheel[] wheels;
    private final int[] max;
    private final EnglishDictionary dict = new EnglishDictionary("resources/dictionary.txt");

    public WheelLock(char[]... lists) {
        this.wheels = new LetterWheel[lists.length];
        int i = 0;
        int[] max = new int[lists.length];
        for (char[] list : lists) {
            this.wheels[i] = new LetterWheel(list);
            max[i++] = list.length - 1;
        }
        this.max = max;
    }

    public int getWidth() {
        return (this.wheels != null ) ? this.wheels.length : 0;
    }

    public String printCombination(int[] combination) {
        StringBuilder comboString = new StringBuilder();
        if (this.wheels == null) {
            return "Error: Lock is not valid";
        }
        if (combination.length != getWidth()) {
            return "Error: Array does not line up with lock.";
        }
        for (int x = 0; x < combination.length; ++x) {
            comboString.append(this.wheels[x].getValueAt(combination[x]));
        }
        return comboString.toString();
    }

    public HashSet<String> getAllCombinations() {
        HashSet<String> allCombos = new HashSet<>();
        if (this.wheels == null) {
            return null;
        }
        int[] combo = new int[getWidth()];
        String currentWord;
        while (!Arrays.equals(combo, this.max)) {
            currentWord = printCombination(combo).toUpperCase();
            if (this.dict.checkDict(currentWord)) {
                allCombos.add(currentWord);
            }
            combo = incrementArr(combo);
        }
        return allCombos;
    }

    private int[] incrementArr(int[] combo) {
        boolean carrying = true;
        if (this.max == null) return null;
        for (int x = combo.length - 1; carrying && x >= 0; --x) {
            combo[x] += 1;
            carrying = combo[x] > this.max[x];
            if (carrying) combo[x] = 0;
        }
        return combo;
    }
}
