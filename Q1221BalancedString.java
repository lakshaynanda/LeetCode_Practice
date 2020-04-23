public class Q1221BalancedString {
    public int balancedStringSplit(String s) {
        char character[] = s.toCharArray();
        int result = 0;
        int Lcount = 0;
        int Rcount = 0;
        for (int i = 0; i < character.length; i++) {
            if (character[i] == 'L') {
                Lcount++;
            } else if (character[i] == 'R') {
                Rcount++;
            }
            if (Lcount == Rcount) {
                result++;
                Lcount = 0;
                Rcount = 0;
            }
        }
        return result;
    }

}