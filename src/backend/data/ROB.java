package backend.data;

public class ROB {

    public ROBRecord robRecord[];  // of size 8
    public int committed, issued;

    public ROB(ROBRecord robRecord[], int committed, int issued){
        this.robRecord = robRecord;
        this.committed = committed;
        this.issued = issued;
    }

}
