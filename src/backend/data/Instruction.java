package backend.data;

public class Instruction {

    public String type, destination, parA, parB;
    public int ID;
    public static int nextID = 0;

    public Instruction(String type, String dest, String a, String b){
        this.type = type;
        this.destination = dest;
        this.parA = a;
        this.parB = b;
        this.ID = nextID++;
    }

}