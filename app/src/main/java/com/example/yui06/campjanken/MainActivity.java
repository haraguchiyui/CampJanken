package com.example.yui06.campjanken;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageView cpu,player;
    TextView result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cpu=(ImageView)findViewById(R.id.cpu);
        player =(ImageView)findViewById(R.id.player);
        /*imageView3=(ImageView)findViewById(R.id.imageView3);
        imageView4=(ImageView)findViewById(R.id.imageView4);
        imageView5=(ImageView)findViewById(R.id.imageView5);*/
        result=(TextView)findViewById(R.id.result);

    }

    public void goo(View v){

        player.setImageResource(R.drawable.goo);

        Random random=new Random();

        int n =random.nextInt(3);

        if(n==0){
            cpu.setImageResource(R.drawable.goo);
            result.setText("引き分けです！");
        }else if(n==1){
            cpu.setImageResource(R.drawable.choki);
            result.setText("あなたの勝ちです！");
        }else{
            cpu.setImageResource(R.drawable.paa);
            result.setText("あなたの負けです！");
        }
    }


    public void choki(View v){

        player.setImageResource(R.drawable.choki);

        Random random=new Random();

        int n =random.nextInt(3);

        if(n==0){
            cpu.setImageResource(R.drawable.goo);
            result.setText("あなたの負けです！");
        }else if(n==1){
            cpu.setImageResource(R.drawable.choki);
            result.setText("引き分けです！");
        }else{
            cpu.setImageResource(R.drawable.paa);
            result.setText("あなたの勝ちです！");
        }
    }


    public void paa(View v){

        player.setImageResource(R.drawable.paa);

        Random random=new Random();

        int n =random.nextInt(3);

        if(n==0){
            cpu.setImageResource(R.drawable.goo);
            result.setText("あなたの勝ちです！");
        }else if(n==1){
            cpu.setImageResource(R.drawable.choki);
            result.setText("あなたの負けです！");
        }else{
            cpu.setImageResource(R.drawable.paa);
            result.setText("引き分けです！");
        }
    }

}
