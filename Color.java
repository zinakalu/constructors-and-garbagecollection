import java.awt.Color;

class Mini extends Car{
    private Color color;

    public Mini(){
        this(Color.RED);
    }

    public Mini(Color c){
        super("Mini");
        this.color = c;
    }
}