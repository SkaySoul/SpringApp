package org.skaysoul.project;


import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements Music {

    List<String> musicList;

    public ClassicalMusic (){
        this.musicList = new ArrayList<String>();
        musicList.add("Hungarian Rapsody");
        musicList.add("some classical music");
        musicList.add("more classical music");
    }

    private String play(){
        String listening  = "";
        for(String song: musicList){
            listening += song + "\n";
        }
        return listening;
    }

    @Override
    public String getSong() {
        return play();
    }

}
