public class Mian {

    public void add() {
        int a = 9;//local variables
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        //System.out.println(a);//compile time error as local variables cannot be accessed outside the method. Uncomment this line and observe the error.

        Demo obj1 = new Demo();//creating object of class Demo

        obj1.id=1;
        obj1.name="java";//instance variables can be accessed by the object of that class
        obj1.num++;//obj1 is incrementing the static variable num.The output for this line should be 101

        System.out.println("id of obj1 is "+obj1.id+"\nname of obj2 is "+obj1.name+"\nObserve the static variable "+obj1.num);

        Demo obj2 = new Demo();/*obj2 will not have the properties that we have set to obj1, each object will share individual
		                       copy of instance variables.Therefore this should give 0 for int and null for string type of variables
		                       Note that by default the values of int will be 0 and string will be null if no values are given.*/

        System.out.println("\nid of obj1 is "+obj2.id+"\nname of obj2 is  "+obj2.name+"\nObserve the static variable "+obj2.num);

		/*Now we will try to increment the static variable num again using obj2 so static variable should increment
		but other variables will still be null if string , 0 if int.
		*/

        obj2.num++;//The output for this line should be 102.

        System.out.println("\nid of obj1 is "+obj2.id+"\nname of obj2 is  "+obj2.name+"\nObserve the static variable "+obj2.num);

        //now let us try to modify the final variable f.
//       obj2.f=45;//It throws compile time error, as we cannot change the values of final variables.Uncomment this line and observe the error.

        System.out.println("\nStatic variable can be accessed by classname and . operator "+Demo.num);/*Observe that we don't need to create object to access static variables
		           we can access static variables with classname and dot operator.*/




    }
}
