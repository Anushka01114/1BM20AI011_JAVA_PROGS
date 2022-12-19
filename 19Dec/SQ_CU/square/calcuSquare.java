/*
WAJP which has 2 packages: square and cube. A class which imports square and cube generates 10 random numbers [1, 100] and calculates the square and cube of the numbers generated, class also inherits an abstract class which 
has data member 'number' and a method 'random'.
*/

package square;

public class calcuSquare
{
  int a;
  calcuSquare(int lol)
  {
  this.a=lol;
  }
  
  int sq()
  {
  return a*a;
  }
}