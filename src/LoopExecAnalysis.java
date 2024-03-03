//Edited in READ ME,
// but also have answers here below
public class LoopExecAnalysis {
    public static void loop(int n) {
        int i = n;
        while (i > 1) {
            System.out.println(i);
            if (i % 2 == 0) {
                i = i / 2;
            } else {
                i = i + 1;
            }
        }
    }

    public static void main(String[] args) {
        loop(10);
    }
}
//Table
/*
i: 0, n: 4
i: 1, n: 3
i: 2, n: 2
*/

//Output:
/*
10
5
6
3
4
2
*/

//Discuss
/*
Yes, once n is less than or equal to i,
it'll become false.
*/

