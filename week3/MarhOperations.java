package week3;


/**
 * Write a description of class MarhOperations here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MarhOperations
{public static void main(String[] args) {

        int a = 10, b = 5;
        
        System.out.println("=== Arithmetic Operators ===");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        System.out.println("\n=== Unary Operators ===");
        int x = 10;
        System.out.println("x = " + x);
        System.out.println("Post-increment x++ = " + (x++));  
        System.out.println("After post-increment x = " + x); 
        System.out.println("Pre-increment ++x = " + (++x)); 
        System.out.println("Post-decrement x-- = " + (x--)); 
        System.out.println("Pre-decrement --x = " + (--x)); 

        System.out.println("\n=== Assignment Operators ===");
        int c = 20;
        System.out.println("c = " + c);
        c += 5;  
        System.out.println("c += 5 → " + c);
        c -= 3;  
        System.out.println("c -= 3 → " + c);
        c *= 2;
        System.out.println("c *= 2 → " + c);
        c /= 4;
        System.out.println("c /= 4 → " + c);

        System.out.println("\n=== Relational Operators ===");
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));

        System.out.println("\n=== Logical Operators ===");
        boolean p = true, q = false;
        System.out.println("p && q: " + (p && q));
        System.out.println("p || q: " + (p || q));
        System.out.println("!p: " + (!p));
        
        System.out.println("\n=== Ternary Operator ===");
        int max = (a > b) ? a : b;
        System.out.println("Max of a and b = " + max);
    }
}