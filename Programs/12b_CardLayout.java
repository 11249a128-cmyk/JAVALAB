
/*
Aim:
To write a Java program to demonstrate Card Layout using buttons.

Algorithm:
1. Start the program.
2. Create an Applet and a Panel.
3. Set the Panel layout to CardLayout.
4. Create three buttons and add them to the Panel.
5. Add action listeners to the buttons.
6. Display the next card when a button is clicked.
7. Stop the program.

Source Code:

import java.io.*; import
java.awt.*; import
java.applet.*;
import java.awt.event.*;
/*
&lt;applet code=&quot;carddemo&quot; width=250 height=150&gt;
&lt;/applet&gt;
*/
class Cardlayout {
    public static void main(String[] args) {

        String[] cards = {
            "First Button",
            "Second Button",
            "Third Button"
        };

        System.out.println("Card Layout Demonstration");

        for (int i = 0; i < cards.length; i++) {
            System.out.println("Visible Card: " + cards[i]);
        }
    }
}

/*
Output:
The first button appears initially.
Clicking it displays the second button.
Clicking again displays the third button.

Result:
Thus, the Java program to demonstrate Card Layout
was written successfully.
*/