package backend.data;

public class ROBRecord {

    public String register;
    public int value;
    public boolean done;

    public ROBRecord(String register, int val, boolean done){
        this.register = register;
        this.value = val;
        this.done = done;
    }

}
