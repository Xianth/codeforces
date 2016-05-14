
import java.awt.EventQueue;
import com.company.MyFrame;
import com.company.ActionFrame;


//public class Main {
//    public static void main(String[] args) {
//        EventQueue.invokeLater(new Runnable() {
//            @Override
//            public void run() {
//                new MyFrame();
//            }
//        });
//    }
//}

class Main {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MyFrame();
            }
        });
    }
}

/*
package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println('a'+'A');
        System.out.println(1+2);
        System.out.println(1.0+2.0);
        System.out.println("cudzysłów \"");
        System.out.println(true);
    }
}
*/