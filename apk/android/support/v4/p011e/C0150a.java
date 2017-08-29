package android.support.v4.p011e;

import android.os.AsyncTask;
import android.os.Build.VERSION;

/* renamed from: android.support.v4.e.a */
public final class C0150a {
    public static <Params, Progress, Result> AsyncTask<Params, Progress, Result> m597a(AsyncTask<Params, Progress, Result> asyncTask, Params... paramsArr) {
        if (asyncTask == null) {
            throw new IllegalArgumentException("task can not be null");
        }
        if (VERSION.SDK_INT >= 11) {
            C0151b.m598a(asyncTask, paramsArr);
        } else {
            asyncTask.execute(paramsArr);
        }
        return asyncTask;
    }
}
