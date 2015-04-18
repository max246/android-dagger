package ch.max246.androiddagger.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.Arrays;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import javax.inject.Inject;

import ch.max246.androiddagger.R;
import ch.max246.androiddagger.module.SplashScreenModule;
import ch.max246.androiddagger.util.Log;

/**
 * Created by christian on 18/04/15.
 */
public class SplashScreenActivity extends BaseActivity  {
    @Inject
    Log log;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TAG = "Splash Screen Activity";

        TimerTask t = new TimerTask() {
            @Override
            public void run() {
                Intent i = new Intent(SplashScreenActivity.this, MainActivity.class);
                finish();
                startActivity(i);
            }
        };

        Timer tm = new Timer();
        tm.schedule(t, 1000);
        log.print("aa","aa");

    }



    @Override
    protected void initDesign() {
        setContentView(R.layout.activity_splashscreen);
    }

    @Override
    public void onClick(View view) {

    }

    @Override
    protected List<Object> getModules() {
        modules = Arrays.<Object>asList(new SplashScreenModule());
        return modules;
    }

    @Override
    protected void log(String text) {
        log.print(TAG,text);
    }
}