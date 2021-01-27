package app;

public class App{
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int c = -10;
        
        try{
            System.out.println(square(a));
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }

        try{
            System.out.println(square(b));
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }

        try{
            System.out.println(square(c));
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }

    public static int square(int v) throws Exception{
        if(v < 0 | v == 0) throw new Exception("The number less than 0 or equil!");
        return v*v ;
    }
}