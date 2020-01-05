package com.example.colorseekbarrgb;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private TextView textRGB;
    private RelativeLayout layoutRGB;
    private int piros,zold,kek = 0;
    private SeekBar seekBarPIROS;
    private SeekBar seekBarZOLD;
    private SeekBar seekBarKEK;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        seekBarPIROS = (SeekBar)findViewById(R.id.seekBar_RED);
        textRGB.setText("(0,0,0)");
        textRGB.setTextColor(Color.rgb(255,255,255));
        layoutRGB.setBackgroundColor(Color.rgb(0,0,0));
        seekBarPIROS.setBackgroundColor(Color.rgb(255,255,255));
        seekBarPIROS.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener(){
            @Override
            public void onProgressChanged(SeekBar seekBar, int progressRED,
                                          boolean fromUser) {
                // TODO Auto-generated method stub
                piros = progressRED;
                textRGB.setText("(" + piros + "," + zold + "," + kek + ")");
                textRGB.setTextColor(Color.rgb(Math.abs(piros-255), Math.abs(zold-255), Math.abs(kek-255)));
                layoutRGB.setBackgroundColor(Color.rgb(piros,zold,kek));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub
            }
        });
        seekBarZOLD = (SeekBar)findViewById(R.id.seekBar_GREEN);
        seekBarZOLD.setBackgroundColor(Color.rgb(255,255,255));
        seekBarZOLD.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener(){
            @Override
            public void onProgressChanged(SeekBar seekBar, int progressGREEN,
                                          boolean fromUser) {
                // TODO Auto-generated method stub
                zold = progressGREEN;
                textRGB.setText("(" + piros + "," + zold + "," + kek + ")");
                textRGB.setTextColor(Color.rgb(Math.abs(piros-255), Math.abs(zold-255), Math.abs(kek-255)));
                layoutRGB.setBackgroundColor(Color.rgb(piros,zold,kek));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub
            }
        });
        seekBarKEK = (SeekBar)findViewById(R.id.seekBar_BLUE);
        seekBarKEK.setBackgroundColor(Color.rgb(255,255,255));
        seekBarKEK.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener(){
            @Override
            public void onProgressChanged(SeekBar seekBar, int progressBLUE,
                                          boolean fromUser) {
                // TODO Auto-generated method stub
                kek = progressBLUE;
                textRGB.setText("(" + piros + "," + zold + "," + kek + ")");
                textRGB.setTextColor(Color.rgb(Math.abs(piros-255), Math.abs(zold-255), Math.abs(kek-255)));
                layoutRGB.setBackgroundColor(Color.rgb(piros,zold,kek));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub
            }
        });

    }




    public void init()
    {
        textRGB = findViewById(R.id.text_RGB);
        layoutRGB = findViewById(R.id.layout_RGB);
    }
}
