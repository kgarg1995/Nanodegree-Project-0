package com.iotalabs.appportfolionanodegree;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button spotify,scores,library,buildItBigger, xyzReaders,Capstone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        spotify = (Button) findViewById(R.id.buttonSpotify);
        scores = (Button) findViewById(R.id.buttonScore);
        library = (Button) findViewById(R.id.buttonlibrary);
        buildItBigger = (Button) findViewById(R.id.buttonBuildBigger);
        xyzReaders = (Button) findViewById(R.id.buttonXYZReader);
        Capstone = (Button) findViewById(R.id.buttonCapstone);

        spotify.setOnClickListener(this);
        scores.setOnClickListener(this);
        library.setOnClickListener(this);
        buildItBigger.setOnClickListener(this);
        xyzReaders.setOnClickListener(this);
        Capstone.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.buttonSpotify:
                Toast.makeText(MainActivity.this,"Keep your eyes here!!!Spotify App Coming really soon",Toast.LENGTH_SHORT).show();
                break;
            case R.id.buttonScore:
                Toast.makeText(MainActivity.this,"Keep your eyes here!!!Scores App Coming really soon",Toast.LENGTH_SHORT).show();
                break;
            case R.id.buttonlibrary:
                Toast.makeText(MainActivity.this,"Keep your eyes here!!!Library App Coming really soon",Toast.LENGTH_SHORT).show();
                break;
            case R.id.buttonBuildBigger:
                Toast.makeText(MainActivity.this,"Keep your eyes here!!!Bigggg App Coming really soon",Toast.LENGTH_SHORT).show();
                break;
            case R.id.buttonXYZReader:
                Toast.makeText(MainActivity.this,"Keep your eyes here!!!XYZ Reader App Coming really soon",Toast.LENGTH_SHORT).show();
                break;
            case R.id.buttonCapstone:
                Toast.makeText(MainActivity.this,"This is really special!!! A surprise for you.",Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
