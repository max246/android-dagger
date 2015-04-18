package ch.max246.androiddagger.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import java.util.List;

import ch.max246.androiddagger.App;
import dagger.ObjectGraph;

/**
 * Created by christian on 18/04/15.
 */
public abstract class BaseActivity extends Activity implements View.OnClickListener  {

    protected String TAG = "";

    protected List<Object> modules;
    private ObjectGraph activityGraph;

    protected App mApplication;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getModules() != null) {
            activityGraph = ((App) getApplication()).createScopedGraph(getModules().toArray());
            activityGraph.inject(this);
        }

        mApplication = (App) getApplicationContext();
        initDesign();
    }

    protected abstract List<Object> getModules();

    protected abstract void log(String text);

    protected abstract void initDesign();
}

