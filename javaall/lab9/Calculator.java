
//We define ourself NumberOutOfRangeException class that extends Exception
class NumberOutOfRangeException extends Exception{

    //Remember this syntanx
    public NumberOutOfRangeException(){
        super();
    }
    public NumberOutOfRangeException(String s){
        super(s);
    }
}

public class Calculator{
    public static double divide(int a, int b) throws NumberOutOfRangeException{ //NumberOutOfRangeException is a custom exception therfore it neeeds to be declared
        if(b == 0){
            throw new ArithmeticException("divide by zero");    //Throw new ArithmeticException because it cannot be performed when b = 0
        }
        if(a < -1000 || a > 1000 || b < -1000 || b > 1000){
            throw new NumberOutOfRangeException("Number is outside the computation");   //Throw new NumberOutOfRangeException because the number falls outside the acceptable range
        }
        return (double) a / b;
    }

    public static int multiply(int a, int b) throws NumberOutOfRangeException{  //NumberOutOfRangeException is a custom exception therfore it neeeds to be declared
        if(b == 0){
            throw new ArithmeticException("divide by zero");    //Throw new ArithmeticException because it cannot be performed when b = 0
        }
        if(a < -1000 || a > 1000 || b < -1000 || b > 1000){
            throw new NumberOutOfRangeException("Number is outside the computation");   //Throw new NumberOutOfRangeException because the number falls outside the acceptable range
        }
        return a * b;
    }

    public static void main(String[] args){

        //First, we try the divide() method with the parameter we put there
        try{
            System.out.println("Division result of 10 and 2: " + divide(10, 2));
        }

        //Catch an ArithmeticException if there is
        catch(ArithmeticException err){ //err is a variable meaning we can name it anything
            System.out.println(err);
        } 

        //Catch an NumberOutOfRangeException if there is
        catch(NumberOutOfRangeException err){   //err is a variable meaning we can name it anything
            System.out.println(err);
        }

        //First, we try the multiply() method with the parameter we put there
        try{
            System.out.println("Multiplication result of 10 and 2: " + multiply(10, 2));
        }

        //Catch an ArithmeticException if there is
        catch(ArithmeticException err){ //err is a variable meaning we can name it anything
            System.out.println(err);
        } 

        //Catch an NumberOutOfRangeException if there is
        catch(NumberOutOfRangeException err){   //err is a variable meaning we can name it anything
            System.out.println(err);
        }
    }
}