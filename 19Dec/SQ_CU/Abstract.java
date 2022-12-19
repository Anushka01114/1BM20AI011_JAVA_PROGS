/*
WAJP which has 2 packages: square and cube. A class which imports square and cube generates 10 random numbers [1, 100] and calculates the square and cube of the numbers generated, class also inherits an abstract class which 
has data member 'number' and a method 'random'.
*/
import cube.*;
import square.*;
import java.util.*;
  
abstract class Abstract
{
int number;
int random(int min, int max);
}

class A extends Abstract{
int random(int Min, int Max)
{
int Min = 1, Max = 100;
number =random(Min, Max);
System.out.println("Random num" +number);
square.calcuSquare(number);
cube.calcuCube(number);
return ThreadLocalRandom.current().nextInt(Min, Max + 1);
}
  
class Sample
{
public static void main(String[] args)
{
A h=new A();
int x=h.random();
square a= new square(x);
cube b=new cube(x);

for( int i=0;i<9;i++)
{
random(1,100)
a.sq();
b.cu();
}
}
}
   