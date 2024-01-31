package main.clients;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
public interface Goable {
//    List<Integer> pi = new ArrayList<>(); //public static final
    void toGo(); // public abstract
    default double getRunSpeed(){
        return 10;
    }
}
