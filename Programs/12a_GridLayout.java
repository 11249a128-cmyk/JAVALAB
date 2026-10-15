
/*
Aim:
To demonstrate a grid layout with 10 buttons
arranged in 5 rows and 2 columns.

Algorithm:
1. Start.
2. Create a two-dimensional array.
3. Store buttons A to J in 5 rows and 2 columns.
4. Display the buttons row by row.
5. Stop.
*/

public class Gridlayout {
    public static void main(String[] args) {

        String[][] buttons = {
            {"A", "B"},
            {"C", "D"},
            {"E", "F"},
            {"G", "H"},
            {"I", "J"}
        };

        System.out.println("Grid Layout");
        System.out.println("+----------+----------+");

        for (int i = 0; i < buttons.length; i++) {
            System.out.printf("| %-8s | %-8s |%n",
                    buttons[i][0], buttons[i][1]);
            System.out.println("+----------+----------+");
        }
    }
}

/*
Result:
Thus, the grid arrangement was displayed
successfully with 5 rows and 2 columns.
*/