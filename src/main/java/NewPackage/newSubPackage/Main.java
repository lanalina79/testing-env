package NewPackage.newSubPackage;

import static NewPackage.newSubPackage.Cats.myCat;

public class Main
         {

             public static void main(String[]Args) {

                 //declaration//
                 boolean myBoolean;
                 char myCharText;
                 int myIntegerNumber;
                 double myDoubleNumber;
                 float myFloatNumber;
                 long myLongNumber;
                 short myShortNumber;
                 byte myByteNumber;

                 String myStringTextName;
                 Object myObjectName;
                 Car myCar;

                 //initialization//

                 myBoolean=true;
                 myCharText='A';
                 myIntegerNumber = 95;
                 myDoubleNumber= -456969.4606408640646;
                 myFloatNumber=68.86F;
                 myLongNumber= 9223372036854775807L;
                 myShortNumber=-32767;
                 myByteNumber=127;

                 myStringTextName="Hello";
                 myObjectName=new Object();

                 myCar=new Car("Red",3684 );
                 myCar.findCar();

                 House myHouse = new House();
                 myHouse.houseAddress="London, Baker str.28";
                 myHouse.houseResidents=54;
                 myHouse.defineHouse();

                 Vase myVase=new Vase();
                 myVase.defineVase();

                 Cats.myCat.defineCat(2,"White");
                 /* hello
                 coments
                 jdgkjgkjdgk*/





             }
}
