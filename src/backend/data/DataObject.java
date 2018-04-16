package backend.data;

import java.util.ArrayList;
import java.util.LinkedList;

public class DataObject {

    public int registers[];    // size 16
    public int memory[];       // size 256
    public Instruction rsAdd[];         // size 3
    public Instruction rsMul[];         // size 3
    public String rat[];       // size 16
    public ROB rob;
    public MemRS load[];       // size 3
    public MemRS store[];      // size 3
    public int ip;
    public ArrayList<Instruction> instructionQueue;

    DataObject(){
        registers = new int[16];
        memory = new int[256];
        rsAdd = new Instruction[3];
        rsMul = new Instruction[3];
        rat = new String[16];
        rob = new ROB();
        load = new MemRS[3];
        store = new MemRS[3];
        ip = 0;
        instructionQueue = new ArrayList<Instruction>();
    }
}
