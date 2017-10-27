package com.younus.sameexample;

import android.app.usage.UsageEvents;

import org.greenrobot.eventbus.EventBus;

/**
 * Created by younus on 17.10.2017.
 */

public class GlobalBus {

    private static EventBus eventBus;
    public static EventBus getBus(){
        if(eventBus==null){
            eventBus= EventBus.getDefault();
        }
        return eventBus;
    }
}
