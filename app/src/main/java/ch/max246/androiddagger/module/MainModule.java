package ch.max246.androiddagger.module;

import android.content.Context;

import javax.inject.Singleton;

import ch.max246.androiddagger.App;
import ch.max246.androiddagger.activity.MainActivity;
import dagger.Module;
import dagger.Provides;

/**
 * Created by christian on 18/04/15.
 */
@Module(
        injects = { MainActivity.class, App.class},
        includes = {LogModule.class,TestContextModule.class},
        library =  true
)
public class MainModule {

    private Context mContext;

    public  MainModule(Context context) {
        mContext = context;
    }

     @Provides @Singleton
     Context provideContext() {
         return mContext;
     }
}