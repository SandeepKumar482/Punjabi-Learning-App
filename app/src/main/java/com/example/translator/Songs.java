package com.example.translator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.RemoteControlClient;
import android.media.RemoteController;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Songs extends AppCompatActivity {
    private MediaPlayer mediaPlayer;
    private AudioManager audioManager;
    private AudioManager.OnAudioFocusChangeListener mOnAudioFC = new AudioManager.OnAudioFocusChangeListener() {
        @Override
        public void onAudioFocusChange(int focusChange) {
            if (focusChange == AudioManager.AUDIOFOCUS_LOSS_TRANSIENT ||
                    focusChange == AudioManager.AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK) {
                mediaPlayer.pause();
                mediaPlayer.seekTo(0);
            } else if (focusChange == AudioManager.AUDIOFOCUS_GAIN) {
                mediaPlayer.start();
            } else if (focusChange == AudioManager.AUDIOFOCUS_LOSS) {
                releaseM();
            }
        }
    };
    private MediaPlayer.OnCompletionListener onCompletionListener = new MediaPlayer.OnCompletionListener() {
        @Override
        public void onCompletion(MediaPlayer mp) {
            releaseM();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);


        final ArrayList<Word> numbers = new ArrayList<Word>();
        numbers.add(new Word("song 1 ", "pahila geet ", -1, R.raw.waddi, R.drawable.outline_play_arrow_white_18dp));
        WordAddapter itemsAdapter = new WordAddapter(this, numbers);
        ListView listView = (ListView) findViewById(R.id.songs);
        listView.setAdapter(itemsAdapter);
        audioManager = (AudioManager) getSystemService(Context.AUDIO_SERVICE);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                releaseM();
                Word words = numbers.get(position);

                int result = audioManager.requestAudioFocus((AudioManager.OnAudioFocusChangeListener) onCompletionListener, AudioManager.STREAM_MUSIC, AudioManager.AUDIOFOCUS_GAIN);
                if (result == AudioManager.AUDIOFOCUS_REQUEST_GRANTED) {
                    mediaPlayer=MediaPlayer.create(Songs.this,words.getAaudio());
                    mediaPlayer.start();
                    mediaPlayer.setOnCompletionListener(onCompletionListener);
                    mediaPlayer = MediaPlayer.create(Songs.this, words.getAaudio());
                    mediaPlayer.start();
                    mediaPlayer.setOnCompletionListener(onCompletionListener);

                }
            }

        });


    }

    @Override
    protected void onStop() {
        super.onStop();
        releaseM();
    }


    private void releaseM() {
        if (mediaPlayer != null) {
            mediaPlayer.release();

            mediaPlayer = null;
            audioManager.abandonAudioFocus((AudioManager.OnAudioFocusChangeListener) onCompletionListener);
        }
    }
}

