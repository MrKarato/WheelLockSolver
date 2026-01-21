//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    WheelLock tilted = new WheelLock(
            new char[] {'B', 'C', 'P', 'T', 'L', 'S', 'M', 'W'},
            new char[] {'A', 'E', 'I', 'O', 'U', 'H', 'R', 'T'},
            new char[] {'B', 'L', 'R', 'N', 'T', 'S', 'O', 'I'},
            new char[] {'D', 'T', 'H', 'S', 'I', 'K', 'V', 'A'},
            new char[] {'A', 'E', 'O', 'N', 'L', 'R', 'C', 'S'},
            new char[] {'N', 'D', 'G', 'R', 'W', 'T', 'E', 'Y'}
    );
    WheelLock actualObjective = new WheelLock(
            new char[] {'L', 'H', 'C', 'S', 'V', 'P', 'F', 'R'},
            new char[] {'L', 'R', 'A', 'E', 'I', 'D', 'U', 'H'},
            new char[] {'A', 'O', 'C', 'M', 'T', 'R', 'P', 'G'},
            new char[] {'I', 'U', 'S', 'T', 'R', 'D', 'L', 'E'},
            new char[] {'E', 'I', 'U', 'T', 'R', 'L', 'H', 'A'},
            new char[] {'T', 'N', 'R', 'S', 'E', 'Z', 'H', 'L'},
            new char[] {'E', 'R', 'N', 'Y', 'S', 'G', 'H', 'D'}
    );
    WheelLock memories = new WheelLock(
            new char[] {'N', 'R', 'T', 'D', 'G', 'H', 'L', 'M'},
            new char[] {'A', 'E', 'I', 'O', 'U', 'H', 'R', 'Y'},
            new char[] {'F', 'N', 'S', 'O', 'M', 'R', 'A', 'U'},
            new char[] {'A', 'E', 'I', 'O', 'U', 'P', 'G', 'T'},
            new char[] {'C', 'G', 'L', 'N', 'O', 'R', 'S', 'T'},
            new char[] {'N', 'L', 'T', 'A', 'E', 'I', 'O', 'H'},
            new char[] {'C', 'E', 'D', 'S', 'T', 'O', 'L', 'U'},
            new char[] {'T', 'Y', 'H', 'E', 'S', 'N', 'R', 'K'}
    );
    ArrayList<String> words =  new ArrayList<>(actualObjective.getAllCombinations());
    Collections.sort(words);
    for (String word : words) {
        System.out.println(word);
    }
    System.out.println(words.toArray().length);
}

boolean checkForWord(String str, HashSet<String> words) {
    return words.contains(str);
}