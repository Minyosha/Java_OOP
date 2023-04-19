package HW_3;

import java.util.ArrayList;
import java.util.List;

public class RuGame extends AbstractGame {
    @Override
    List<String> generateCharList() {
        List<String> charList = new ArrayList<String>();
        for (int i = 0; i < 9; i++) {
            charList.add(String.valueOf(i));
        }
        return charList;
    }
}
