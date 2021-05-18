

import java.util.Scanner;
class complex
{
 int a,b;
 public static void main(String args[])
 {
  Scanner sc =new Scanner(System.in);
  complex c1 =new complex();
  complex c2 =new complex();
  System.out.println("Enter the 1st complex numbers :");
  c1.a=sc.nextInt();
  c1.b=sc.nextInt();
  System.out.println("Enter the 2nd complex numbers :");
  c2.a=sc.nextInt();
  c2.b=sc.nextInt();
  int x=c1.a+c2.a;
  int y=c1.b+c2.b;
  System.out.println("Sum:"+x+"+"+y+"i");
 }
}



basilalias@Basils-Mac-mini java % javac complex.java
basilalias@Basils-Mac-mini java % java complex
Enter the 1st complex number :
8
9
Enter the 2nd complex number :
11
12
Sum:19+21i
