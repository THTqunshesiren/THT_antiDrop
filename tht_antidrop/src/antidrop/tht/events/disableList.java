package antidrop.tht.events;

import java.util.ArrayList;
import java.util.List;

public class disableList {
    public static final List<String> enableList = new ArrayList();

    public disableList() {
    }

    public static void addPlayerName(String playerNameIn) {
        String convertedName = playerNameIn.toLowerCase();
        if (!enableList.contains(convertedName)) {
            enableList.add(convertedName);
        }

    }

    public static void removePlayerName(String playerNameIn) {
        String convertedName = playerNameIn.toLowerCase();
        enableList.remove(convertedName);
    }

    public static boolean hasPlayerName(String playerNameIn) {
        String convertedName = playerNameIn.toLowerCase();
        return enableList.contains(convertedName);
    }
}