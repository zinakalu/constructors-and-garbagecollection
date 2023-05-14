public class DuckTest{
    class Duck{
    int size;

    public Duck(){
        this.size = 27;
        }
    }

    class Duck2{
        int size; 

        public Duck2(){
        this.size = 27;
        }
        
        public Duck2(int duckSize){
        this.size = duckSize;
        }
    }

     public static void main(String[] args){
        Duck2 d = new Duck2(15);
        Duck2 d2 = new Duck();

        System.out.println("Duck size " + d.size);
        System.out.println("Duck2 size " + d2.size);
    }
}


