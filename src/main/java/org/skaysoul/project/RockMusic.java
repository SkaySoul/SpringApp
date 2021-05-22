package org.skaysoul.project;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic  implements Music {

    List<String> musicList;

    public RockMusic (){
        this.musicList = new ArrayList<String>();
        musicList.add("Smells like teen spirit");
        musicList.add("Back in black");
        musicList.add("some rock music...");
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
        return "Playing: " + "/n" + play();
    }
}
