package android.support.v4.p006a;

import android.content.Context;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View;

/* renamed from: android.support.v4.a.i */
abstract class C0058i extends C0057h {
    C0058i() {
    }

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View a = m133a(view, str, context, attributeSet);
        return (a != null || VERSION.SDK_INT < 11) ? a : super.onCreateView(view, str, context, attributeSet);
    }
}
