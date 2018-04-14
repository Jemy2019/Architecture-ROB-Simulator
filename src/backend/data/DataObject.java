package backend.data;

public class DataObject {

    public int registers[];    // size 16
    public int memory[];       // size 256
    public RS rsAdd[];         // size 3
    public RS rsMul[];         // size 3
    public String rat[];       // size 16
    public ROB rob;
    public MemRS load[];       // size 3
    public MemRS store[];      // size 3
    public int ip;

}
