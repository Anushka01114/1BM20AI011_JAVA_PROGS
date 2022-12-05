Write a class named Car that has the following data members:
// • model. The model field is an int that holds the car’s year.
// • make. The make field references a String object that holds the make of the car.
// • speed. The speed field is an int that holds the car’s current speed.
// The class should have the following constructor and other methods.
// • The constructor should accept the car’s year model, make and speed as arguments.
// • Accessor methods should get the values stored in an object’s year, Model, make, and speed fields.
// • Accelerate method should add 5 to the speed field each time it is called.
// • Brake method should subtract 5 from the speed field each time it is called.
// Demonstrate the class in a program that creates a Car object, and then calls the accelerate method five times. After each call to the accelerate method, get the current speed of the car and display it. Call the brake method five times. After each call to the brake method, get the current speed of the car and display it.



class car{
int model;
String make;
int speed;
car(int mo,String ma,int s)
{
model=mo;
make=ma;
speed=s;
}
void display()
{
System.out.println("Car Details");
System.out.println("Car model:"+model);
System.out.println("Car make:"+make);
System.out.println("Car speed:"+speed);
}
int accelerate()
{
speed=speed+5;
return speed;
}
int brake()
{
speed=speed-5;
return speed;
}
}

class test1{
public static void main(String args[])
{
car c = new car(2020,"BMW",60);
c.display();
System.out.println("\nNew speed after acceleration: "+c.accelerate());
System.out.println("\nNew speed after acceleration: "+c.accelerate());
System.out.println("\nNew speed after acceleration: "+c.accelerate());
System.out.println("\nNew speed after acceleration: "+c.accelerate());
System.out.println("\nNew speed after acceleration: "+c.accelerate());

System.out.println("\nNew speed after brake: "+c.brake());
System.out.println("\nNew speed after brake: "+c.brake());
System.out.println("\nNew speed after brake: "+c.brake());
System.out.println("\nNew speed after brake: "+c.brake());
System.out.println("\nNew speed after brake: "+c.brake());
}
}
