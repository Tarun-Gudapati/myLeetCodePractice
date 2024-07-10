import java.util.Scanner;

public class leet1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a value :");
        System.out.println("");
        String str = sc.nextLine();
        Solution s = new Solution();
        int m = s.romanToInt(str);
        System.out.println(m);
        sc.close();

    }
}

class Solution {
    public int romanToInt(String s) {

        char[] ch = s.toCharArray();
        int tval = 0;

        for (int i = 0; i < ch.length; i++) {

            switch (ch[i]) {

                case 'I':

                    tval = tval + 1;
                    break;
                case 'V':
                    if (i > 0 && ch[i - 1] == 'I')
                        tval = tval + 4;
                    else
                        tval = tval + 5;
                    break;

                case 'X':
                    if (i > 0 && ch[i - 1] == 'I')
                        tval = tval + 8;
                    else
                        tval = tval + 10;
                    break;
                case 'L':
                    if (i > 0 && ch[i - 1] == 'X')
                        tval = tval + 40;
                    else
                        tval = tval + 50;
                    break;
                case 'C':
                    if (i > 0 && ch[i - 1] == 'X')
                        tval = tval + 90;
                    else
                        tval = tval + 100;
                    break;
                case 'D':
                    if (i > 0 && ch[i - 1] == 'C')
                        tval = tval + 400;
                    else
                        tval = tval + 500;
                    break;
                case 'M':

                    if (i > 0 && ch[i - 1] == 'C')
                        tval = tval + 900;
                    else
                        tval = tval + 1000;
                    break;

                default:
                    break;
            }

        }
        return tval;
    }
}