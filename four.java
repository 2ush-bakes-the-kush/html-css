4. i) Type conversion in java

There are two types of conversions also known as Type Casting in java namely Implicit Type Casting and Explicit Type Casting.

**Implicit or Automatic conversion takes place when two data types are automatically converted. This happens when:
-->	The two data types are compatible.
--> When we assign value of a smaller data type to a bigger data type.

For Example, in java the numeric data types are compatible with each other but no automatic conversion is supported from numeric type to char or Boolean. Also, char and Boolean are not compatible with each other.
Example:
class Test
{
    public static void main(String[] args)
    {
        int i = 100; 
         
        //automatic type conversion
        long l = i; 
         
        //automatic type conversion
        float f = l; 
        System.out.println("Int value "+i);
        System.out.println("Long value "+l);
        System.out.println("Float value "+f);
    }
}
OUTPUT: Int value 100
  Long value 100
  Float value 100.0
  
  
**If we want to assign a value of larger data type to a smaller data type we perform explicit type casting or narrowing.
-->This is useful for incompatible data types where automatic conversion cannot be done.
-->Here, target-type specifies the desired type to convert the specified value to.

//Java program to illustrate explicit type conversion
class Test
{
    public static void main(String[] args)
    {
        double d = 100.04; 
         
        //explicit type casting
        long l = (long)d;
         
        //explicit type casting 
        int i = (int)l; 
        System.out.println("Double value "+d);
         
        //fractional part lost
        System.out.println("Long value "+l); 
         
        //fractional part lost
        System.out.println("Int value "+i); 
    } 
}
OUTPUT:
Double value 100.04
Long value 100
Int value 100


4.ii) Various Operators in Java 

Assignment Operator
=       Simple assignment operator
+=	Short Hand Addition Assignment Operator.
-=	Short Hand Subtraction Assignment Operator.
*=	Short Hand Multiplication Assignment Operator.
/=	Short Hand Division Assignment Operator.

Arithmetic Operators
+       Additive operator (also used for String concatenation)
-       Subtraction operator
*       Multiplication operator
/       Division operator
%       Remainder operator

Unary Operators
+       Unary plus operator; indicates positive value
-       Unary minus operator; negates an expression
++      Increment operator; increments a value by 1
--      Decrement operator; decrements a value by 1
!       Logical complement operator; inverts the value of a Boolean

Relational Operators
==      Equal to
!=      Not equal to
>       Greater than
>=      Greater than or equal to
<       Less than
<=      Less than or equal to

Conditional Operators
&&      Conditional-AND
||      Conditional-OR
?:      Ternary (shorthand for if-then-else statement)

Bitwise and Bit Shift Operators
~       Unary bitwise complement
<<      Signed left shift
>>      Signed right shift
>>>     Unsigned right shift
&       Bitwise AND
^       Bitwise exclusive OR
|       Bitwise inclusive OR



4 .iii) Labelled break and continue statements

Labels with break and continue can be used shift control from break and continue. By default break goes outside of loop but if you use more than one loop you can use break statement to break a specific loop by providing label. Same is true for continue. If you are working on nested loops labels gives more control to break and continue. 
-->Labelled Continue Example:
	 int intArray[][] = new int[][]{{1,2},{2,3}};
	   
	    Outer:
	    for(int i=0; i < intArray.length; i++)
	    {
	      for(int j=0; j < intArray[i].length ; j++)
	      {
	        if(intArray[i][j] == 3)
				continue Outer;
	        System.out.println("Element is : " + intArray[i][j]);
	      }
	    }

OUTPUT
Element is 1
Element is 2
Element is 2 	//Element is 3 is not printed due to the continue statement.


-->Labelled Break Example


 int[][] arr = {{1, 2}, {3, 4}, {9, 10}, {11, 12}};
        Boolean found = false;
        int row,col;
        //find index of first int greater than 10
        searchint:
 
        for (row=0; row < arr.length; row++) {
            for (col=0; col < arr[row].length; col++) {
                if (arr[row][col] > 10) {
                    found = true;
                    //using break label to terminate outer statements
                    break searchint;
                }
            }
        }
        if (found)
            System.out.println("First int greater than 10 is found at index:     [" + row + "," + col +"]");

OUTPUT: First int greater than 10 is found at index: [3],[0]




4. iv) Method Overloading and Method Overriding


Overloading occurs when two or more methods in one class have the same method name but different parameters.

Overriding means having two methods with the same method name and parameters (i.e., method signature). One of the methods is in the parent class and the other is in the child class. Overriding allows a child class to provide a specific implementation of a method that is already provided its parent class.

-->Example of Overloading:
class Dog{
    public void bark(){
        System.out.println("woof ");
    }
 
    //overloading method
    public void bark(int num){
    	for(int i=0; i<num; i++)
    		System.out.println("woof ");
    }
}


-->Example of Overriding:

class Dog{
    public void bark(){
        System.out.println("woof ");
    }
}
class Hound extends Dog{
    public void sniff(){
        System.out.println("sniff ");
    }
 
    public void bark(){
        System.out.println("bowl");
    }
}
 
public class OverridingTest{
    public static void main(String [] args){
        Dog dog = new Hound();
        dog.bark();
    }
}

OUTPUT:
Bowl
