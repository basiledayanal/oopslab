import java.util.*;
abstract class shape{
public int length,breath;
abstract void printArea();
}
class Rectangle extends shape{
Scanner sc = new Scanner(System.in);
void printArea(){
System.out.println("Enter length:");
super.length = sc.nextInt();
System.out.println("Enter breath:");
super.breath = sc.nextInt();
System.out.println("Area of rectangle:"+(length*breath));
}}
class triangle extends shape{
Scanner sc = new Scanner(System.in);
void printArea(){
System.out.println("Enter height:");
super.length = sc.nextInt();
System.out.println("Enter breath:");
super.breath = sc.nextInt();
System.out.println("Area of triangle:"+(0.5f*length*breath));
}}
class circle extends shape{
Scanner sc = new Scanner(System.in);
void printArea(){
System.out.println("Enter height:");
super.length = sc.nextInt();
System.out.println("Area of Circle:"+((3.14f)*length*length));
}}
public class c3shapes {
public static void main(String ...a){
shape s = new Rectangle();
shape s1 = new triangle();
shape s2 = new circle();
s.printArea();
s1.printArea();
s2.printArea();
}}
