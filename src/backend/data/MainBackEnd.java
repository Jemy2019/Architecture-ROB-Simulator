package backend.data;

public class MainBackEnd implements DataModel{
    private DataObject data;
    @Override
    public int validateAndRun(String[] instructions) {
        return 0;
    }

    @Override
    public DataObject tick() throws RuntimeException {
        fetch();
        execute();
        broadCast();
        commit();
        return this.data;
    }

    @Override
    public void clear() {

    }

    private Instruction splitInstruction (String str){
        return null;
    }

    private boolean isValidInstruction(Instruction instruction){
        return false;
    }

    private void fetch(){

    }

    private void execute(){

    }

    private void broadCast(){

    }

    private void commit(){

    }
}
