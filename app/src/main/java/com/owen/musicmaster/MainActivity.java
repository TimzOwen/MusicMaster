package com.owen.musicmaster;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    //Step 1 and 2;
    //create the Media player and add the raw media to the res android directory file.(app->new->androidResDirectory->select raw and Add)
    MediaPlayer mMediaPlayer;
    Button btnPlay, btnPause;
    Switch mSwitch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //step 5
        //create the play music player
        mMediaPlayer = MediaPlayer.create(this,R.raw.raw_misc_sample);
    }
    public void playMusic(View view) {
        mMediaPlayer.start();
    }
    //step 3 and 4 .
    //create the methods to play and pause the music
    public void pauseMusic(View view)
    {
        //step 6
        //check if there is music playing and pause it
        if (mMediaPlayer.isPlaying())
        {
            mMediaPlayer.pause();
        }
    }
}