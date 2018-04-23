import java.util.ArrayList;
import java.util.List;

public class MainHello {


    public static void main(String[] args){


        Hello aBlockLambda =   () -> System.out.println("Hello world!");
        aBlockLambda.perform();

    }
}
