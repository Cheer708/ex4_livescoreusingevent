/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package livescoreusingevent;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author AV01
 */
public class ScoreSource {
    private List<ScoreListener> listeners = new ArrayList<>();

    public void addListener(ScoreListener listener) {
        listeners.add(listener);
    }

    public void removeListener(ScoreListener listener) {
        listeners.remove(listener);
    }

    public void notifyListeners(ScoreEvent event) {
        for (ScoreListener listener : listeners) {
            listener.scoreChange(event);
        }
    }

    public void setScoreLine(String score) {
        ScoreEvent event = new ScoreEvent(this, score);
        notifyListeners(event);
    }
}
