package simple;

public class FindTheNextPerfectSquare {
    //DESCRIPTION:
    //You might know some pretty large perfect squares. But what about the NEXT one?
    //
    //Complete the findNextSquare method that finds the next integral perfect square after the one passed as a parameter. Recall that an integral perfect square is an integer n such that sqrt(n) is also an integer.
    //
    //If the parameter is itself not a perfect square then -1 should be returned. You may assume the parameter is non-negative.
    //
    //Examples:(Input --> Output)
    //
    //121 --> 144
    //625 --> 676
    //114 --> -1 since 114 is not a perfect square

    public static long findNextSquare(long sq) {
        double first = (Math.sqrt(sq));
        int second = (int) first;

        if (first == second) {
            return (long) ((first + 1) * (second + 1));
        }
        return -1;
    }
    //Second Solution
    public static long findNextSquare2(long sq) {

        double square = Math.sqrt(sq);

        if (square % 1 == 0){
            square++;
            return (long) (square*square);
        } else {
            return -1;
        }
    }
}
