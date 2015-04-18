package ch.max246.androiddagger.module;

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
        includes = {LogModule.class}
)
public class MainModule {

/*

    @Provides
    @Singleton
    LoginNetwork provideLoginNetwork(HttpManager httpManager) { return new LoginNetwork(httpManager); }

    @Provides
    @Singleton
    HttpManager provideHttpManager() { return new HttpManager(); }*/

}