package backend.data;

public class ROB {

    public ROBRecord robRecord[];  // of size 8
    public int committed, issued;

    public ROB(){
        robRecord = new ROBRecord[8];       //8 empty ROB records
        committed = issued = -1;            //Initially = no committed or issued instructions
    }

}
