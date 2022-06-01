package joMama;

import java.util.ArrayList;

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
