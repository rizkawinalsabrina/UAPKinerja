package exceptionhadling;

public class Healer extends Character{


    Healer(int H, int d, int a) {
        super(H, d, a);
    }

    @Override
    boolean attack() {
        return false;
    }

    void heal(){

    }
}
