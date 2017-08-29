package android.support.v4.p006a;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.p005b.C0035a;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: android.support.v4.a.ad */
public final class ad implements Iterable<Intent> {
    private static final C0038b f132a;
    private final ArrayList<Intent> f133b;
    private final Context f134c;

    /* renamed from: android.support.v4.a.ad.a */
    public interface C0037a {
        Intent m81a();
    }

    /* renamed from: android.support.v4.a.ad.b */
    interface C0038b {
    }

    /* renamed from: android.support.v4.a.ad.c */
    static class C0039c implements C0038b {
        C0039c() {
        }
    }

    /* renamed from: android.support.v4.a.ad.d */
    static class C0040d implements C0038b {
        C0040d() {
        }
    }

    static {
        if (VERSION.SDK_INT >= 11) {
            f132a = new C0040d();
        } else {
            f132a = new C0039c();
        }
    }

    private ad(Context context) {
        this.f133b = new ArrayList();
        this.f134c = context;
    }

    public static ad m82a(Context context) {
        return new ad(context);
    }

    public ad m83a(Activity activity) {
        Intent intent = null;
        if (activity instanceof C0037a) {
            intent = ((C0037a) activity).m81a();
        }
        Intent a = intent == null ? C0099y.m429a(activity) : intent;
        if (a != null) {
            ComponentName component = a.getComponent();
            if (component == null) {
                component = a.resolveActivity(this.f134c.getPackageManager());
            }
            m84a(component);
            m85a(a);
        }
        return this;
    }

    public ad m84a(ComponentName componentName) {
        int size = this.f133b.size();
        try {
            Intent a = C0099y.m430a(this.f134c, componentName);
            while (a != null) {
                this.f133b.add(size, a);
                a = C0099y.m430a(this.f134c, a.getComponent());
            }
            return this;
        } catch (Throwable e) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e);
        }
    }

    public ad m85a(Intent intent) {
        this.f133b.add(intent);
        return this;
    }

    public void m86a() {
        m87a(null);
    }

    public void m87a(Bundle bundle) {
        if (this.f133b.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] intentArr = (Intent[]) this.f133b.toArray(new Intent[this.f133b.size()]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        if (!C0035a.m74a(this.f134c, intentArr, bundle)) {
            Intent intent = new Intent(intentArr[intentArr.length - 1]);
            intent.addFlags(268435456);
            this.f134c.startActivity(intent);
        }
    }

    @Deprecated
    public Iterator<Intent> iterator() {
        return this.f133b.iterator();
    }
}
