package ch.max246.androiddagger.module;

import android.content.Context;

import javax.inject.Singleton;

import ch.max246.androiddagger.activity.MainActivity;
import ch.max246.androiddagger.util.TestPackage;
import dagger.Module;
import dagger.Provides;

/**
 * Created by christian on 18/04/15.
 */

@Module (
       library =  true
)
public class TestContextModule {

    private Context mContext;

    public TestContextModule(Context context) {
        mContext = context;
    }
    @Provides @Singleton
    TestPackage providePackage() {
        return new TestPackage(mContext);
    }
}
