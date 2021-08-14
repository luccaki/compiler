import java.util.Scanner;
public class MainClass{ 
  public static void main(String args[]){
       Scanner _key = new Scanner(System.in);
double  a;
double  b;
String  t;
a= _key.nextDouble();
b= _key.nextDouble();
t = "teste";
while (a<b) {
a = a+1;System.out.println(a);}

if (a==b) {
System.out.println(t);}else {
System.out.println(b);}

  }}