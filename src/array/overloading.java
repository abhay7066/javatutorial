package array;

class Add
{
    public int add(int x, int y)
    {
        int result = x+y;
        return result;
    }
    public int add( int x,int y ,int z)
    {
        int result = x+y+z;
        return result ;
    }

    public double add( double x , double y )
    {
        double result = x+y;
        return  result;
    }
}

public class overloading {
    public static void main(String[] args) {
        Add obj = new Add();

       int result =  obj.add(5,6);
        System.out.println(result);

        int result1 = obj.add(7,8,3);
        System.out.println(result1);

       double result2 =  obj.add(4.6,7.3);
        System.out.println(result2);



    }
}


