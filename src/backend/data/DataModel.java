package backend.data;


import backend.data.DataObject;

// MainController will use this interface to interact with the model
public interface DataModel {

    int validateAndRun(String instructions[]);
    DataObject tick() throws RuntimeException;
    void clear();

}
