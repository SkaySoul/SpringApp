package org.skaysoul.project;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    public List<Music> getMusicList() {
        return musicList;
    }

    public void setMusicList(Music music) {
        for (int i = 0; i<3;i++){
            musicList.add(music);
        }

    }

    private List<Music> musicList = new ArrayList<Music>();


    private String name;
    private int volume;


//    public MusicPlayer(Music music){
//        this.music = music;
//    }
    public MusicPlayer(){}



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }


    public void playMusic(){
        for (int i = 0; i<musicList.size(); i++) {
            System.out.println("Playing: " + musicList.get(i).getSong());
        }

    }
}
