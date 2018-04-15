package backend.data;

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

}
