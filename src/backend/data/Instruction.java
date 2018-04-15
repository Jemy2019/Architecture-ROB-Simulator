package backend.data;

public class Instruction {

    public String type, destination, parA, parB;

    public Instruction(String type, String dest, String a, String b){
        this.type = type;
        this.destination = dest;
        this.parA = a;
        this.parB = b;
    }

}
