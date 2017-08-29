package android.support.v4.p006a;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;

/* renamed from: android.support.v4.a.j */
abstract class C0059j extends C0058i {
    boolean f201b;

    C0059j() {
    }

    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        if (!(this.f201b || i == -1)) {
            C0057h.m132a(i);
        }
        super.startActivityForResult(intent, i, bundle);
    }

    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        if (!(this.a || i == -1)) {
            C0057h.m132a(i);
        }
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }
}
