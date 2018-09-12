public class Calc {
    int n;
    int memory;

    Calc(int tall){
        n = tall;
    }

    double add(int tall){
        return n = n + tall;
    }

    double sub(int tall){
        return n = n-tall;
    }

    double div(int tall){
        return n = n/tall;
    }

    double mul(int tall){
        return n = n*tall;
    }

    void clear(){
        n = 0;
    }

    void equal(){
        System.out.println(n);
    }

    void showMemory(){
        System.out.println(memory);
    }

    void store(){
        memory = n + memory;
    }

    void recall(){
        memory = memory - n;
    }
}
