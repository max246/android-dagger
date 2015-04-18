package ch.max246.androiddagger.util;

import android.content.Context;

/**
 * Created by christian on 18/04/15.
 */
public class TestPackage {

    private  Context mContext;

    public TestPackage(Context context) {
        mContext = context;
    }

    public String getName() {
        return mContext.getPackageName();
    }
}
