    /*
     * The Number to Roman Numerals Program
     *
     * @author  Liam Fletcher
     * @version 1.0
     * @since   2021-12-08 
     */

    class Main {
        // Function to calculate roman equivalent
        static String intToRoman(int num) {
            // storing roman values of digits from 0-9
            // when placed at different places
            String m[] = {
                "",
                "M",
                "MM",
                "MMM"
            };
            String c[] = {
                "",
                "C",
                "CC",
                "CCC",
                "CD",
                "D",
                "DC",
                "DCC",
                "DCCC",
                "CM"
            };
            String x[] = {
                "",
                "X",
                "XX",
                "XXX",
                "XL",
                "L",
                "LX",
                "LXX",
                "LXXX",
                "XC"
            };
            String i[] = {
                "",
                "I",
                "II",
                "III",
                "IV",
                "V",
                "VI",
                "VII",
                "VIII",
                "IX"
            };

            // Converting to roman
            String thousands = m[num / 1000];
            String hundereds = c[(num % 1000) / 100];
            String tens = x[(num % 100) / 10];
            String ones = i[num % 10];

            String ans = thousands + hundereds + tens + ones;

            return ans;
        }

        // Driver program to test above function
        public static void main(String[] args) {
            int number = 3524;
            System.out.println("The original number is: " + number);
            System.out.println("");
            System.out.println("The number converted into roman numerals is: " + intToRoman(number));
            System.out.println("");
            System.out.println("Done.");
        }
    }
