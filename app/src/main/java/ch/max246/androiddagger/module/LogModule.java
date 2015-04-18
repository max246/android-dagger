package ch.max246.androiddagger.module;

import javax.inject.Singleton;

import ch.max246.androiddagger.activity.MainActivity;
import ch.max246.androiddagger.util.Log;
import dagger.Module;
import dagger.Provides;

/**
 * Created by christian on 18/04/15.
 */
@Module(
        injects = {MainActivity.class})
public class LogModule {

    @Provides
    @Singleton
    Log providePrint() {
        return new Log();
    }

}