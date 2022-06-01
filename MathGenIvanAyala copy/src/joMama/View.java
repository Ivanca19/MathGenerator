package joMama;

import java.util.ArrayList;

// This class creates the View that the user will see and adds every problem to the board.
public class View {

    private String map;

    public void addToView(String lol){
        map += lol + "\n";
    }

    public void clearView(){
        map = "Ayala Math Generator" + "\n" + "\n";
    }
    public View(){
        map = "Ayala Math Generator" + "\n" + "\n";
    }

    public String drawView() {
        return map;
    }
}
