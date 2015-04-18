package ch.max246.androiddagger.util;

/**
 * Created by christian on 18/04/15.
 */
public class Log {
    public Log() {
    }

    public void print(String tag,String text) {

        android.util.Log.d(tag,text);
    }
}
