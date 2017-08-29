package android.support.v4.p011e;

import android.os.AsyncTask;

/* renamed from: android.support.v4.e.b */
class C0151b {
    static <Params, Progress, Result> void m598a(AsyncTask<Params, Progress, Result> asyncTask, Params... paramsArr) {
        asyncTask.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, paramsArr);
    }
}
