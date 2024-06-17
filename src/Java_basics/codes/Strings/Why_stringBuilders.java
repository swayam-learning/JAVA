package Java_basics.codes.Strings;

public class Why_stringBuilders {
    public static void main(String[] args) {
        String series = "";
        for (int i = 0; i < 26 ; i++) {
            char ch = (char)('a'+i);
            series = series+ch;//here it only concatenating and not appending
            System.out.println(series);

        }
        System.out.println(series);
        /* as we can clearly see that after each iteration the series variable is
        copying the old-value and appending something new to it
        which is the main problem because it takes too much memory in the computer and the space complexity becomes O(n^2)
        because in the space it is adding for 1 + 2 +3 +.....+26 = n(n+1)/2---->O(n^2)
         */
        /* so we came up with string builders which allows us to modify the strings*/

    }
}
