package org.skaysoul.project;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void  main(String [] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationcontext.xml"
        );

//        Music music = context.getBean("rockMusic", Music.class);
//        Music music2 = context.getBean("classicalMusic", Music.class);
//        MusicPlayer musicPlayer = new MusicPlayer(music);
//        MusicPlayer musicPlayer2 = new MusicPlayer(music2);
//        musicPlayer.playMusic();
//        musicPlayer2.playMusic();
//        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        musicPlayer.playMusic();

        Computer computer= context.getBean("computer", Computer.class);
        System.out.println(computer);
        context.close();
    }
}
