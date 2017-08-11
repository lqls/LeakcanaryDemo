package com.wang.leaksdemo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by WangChao on 2017/8/11.
 */

public class ListenerManager {
    private static ListenerManager sInstance;
    private ListenerManager() {}
    private List<SampleListener> listeners = new ArrayList<>();
    public static ListenerManager getInstance() {
        if (sInstance == null) {
            sInstance = new ListenerManager();
        }
        return sInstance;
    }
    public void addListener(SampleListener listener) {
        listeners.add(listener);
    }
    public void removeListener(SampleListener listener) {
        listeners.remove(listener);
    }
}
