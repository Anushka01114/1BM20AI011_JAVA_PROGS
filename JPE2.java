import java.io.*;

class Clock
{
private int hours, mins,secs;
//constructors
Clock()
{
hours=12;
mins=0;
secs=0;
}
Clock(int h, int m, int s)
{
hours=h;
mins=m;
secs=s;
}
Clock(int num)
{
hours=num/360;
mins=num/60;
secs=num%360;
}
//instance methods
void setClock(int seconds)
{
hours=seconds/360;
mins=seconds/60;
secs=seconds%360;
System.out.println(hours+":"+mins+":"+secs");
}
//getters
int getHours()
{
return this.hours;
}
int getMins()
{
return this.mins;
}
int getSecs()
{
return this.secs;
}
//setters
void setHours(int h)
{
this.hours=h;
}
void setMins(int m)
{
this.mins=m;
}
void setSecs(int s)
{
this.secs=s;
}
//method tick
void tick()
{
if (secs==59)
{
   if(mins==59)
   {
      if(hours==24)
      hours==0;
      else
      hours++;
   }
   else
   mins++;
}
else secs++;
}
//
void addClock(obj Clock)
{
//?
}
//
void toString()
{
//?
}
//
void tickDown()
{
if (secs==0)
{
   if(mins==0)
   {
      if(hours==0)
      hours==24;
      else
      hours--;
   }
   else
   mins--;
}
else secs--;
}
//
void subtractClock()
{
//?
}
}

class jpe2
{
public static void main(String args[])
    {
      int read;
      System.out.println("Enter the seconds since midnight");
      Scanner sc=new Scanner(System.in);
      read=sc.nextInt()
      Clock firstClock=new Clock(read);
     
      for(int i=0;i<9;i++)
      {
         tick();
         System.out.println(hours+":"+mins+":"+secs");
      }
     
      Clock secondClock=new Clock(3,4,5);
     
      for(int i=0;i<9;i++)
      {
         tick();
         System.out.println(hours+":"+mins+":"+secs");
      }
     
      addClock(secondClock);
     
      toString();
     
      Clock thirdClock=new Clock(3,4,5);
    }
}
