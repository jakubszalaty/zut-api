package android.support.v4.p007g.p013a;

import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction;

/* renamed from: android.support.v4.g.a.c */
class C0195c {
    static Object m882a(int i, CharSequence charSequence) {
        return new AccessibilityAction(i, charSequence);
    }

    public static boolean m883a(Object obj, Object obj2) {
        return ((AccessibilityNodeInfo) obj).removeAction((AccessibilityAction) obj2);
    }
}
