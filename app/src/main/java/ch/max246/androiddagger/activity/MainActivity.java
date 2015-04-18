package ch.max246.androiddagger.activity;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import java.util.Arrays;
import java.util.List;

import javax.inject.Inject;

import ch.max246.androiddagger.R;
import ch.max246.androiddagger.module.MainModule;
import ch.max246.androiddagger.module.SplashScreenModule;
import ch.max246.androiddagger.util.Log;
import ch.max246.androiddagger.util.TestPackage;


public class MainActivity extends BaseActivity {
    @Inject
    Log mLog;

    //@Inject
    //TestPackage pack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected List<Object> getModules() {
        modules = Arrays.<Object>asList(new MainModule(this));
        return modules;
    }

    @Override
    protected void log(String text) {
        mLog.print(TAG,text);
    }

    @Override
    protected void initDesign() {
        setContentView(R.layout.activity_main);
    }



    @Override
    public void onClick(View view) {

    }
}
