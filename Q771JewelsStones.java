
public class Q771JewelsStones
{

    public int numJewelsInStones(String J, String S) {
        char ch[] = new char[J.length()];
        char ch1[] = new char[S.length()];
        int count = 0;
        for (int i = 0; i < J.length(); i++) {
            ch[i] = J.charAt(i);
        }
        for (int i = 0; i < S.length(); i++) {
            ch1[i] = S.charAt(i);
        }
        for (int i = 0; i < ch1.length; i++) {
            for (int j = 0; j < ch.length; j++) {
                if (ch[j] == ch1[i]) {
                    count++;
                }
            }
        }
        return count;
    }

}