public class Superclass{
    private int superClassVariable;

    public Superclass(){
        superClassVariable = 10; //initializing the superclass variable
    }
    //...
}

public class Subclass extends Superclass{
    private int subclassVariable;

    public Subclass(){
        subclassVariable = 20; //initializing the subclass variable
    }
    //...
}

public class Main{
    public static void main(String[] args){
        Subclass obj = new Subclass();
        //accessing and using the superclass and subclass variables
        System.out.println(obj.superClassVariable);
        System.out.println(obj.subclassVariable);
    }
}