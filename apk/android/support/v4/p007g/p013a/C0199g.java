package android.support.v4.p007g.p013a;

import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: android.support.v4.g.a.g */
class C0199g {
    public static void m927a(Object obj, boolean z) {
        ((AccessibilityNodeInfo) obj).setVisibleToUser(z);
    }

    public static boolean m928a(Object obj) {
        return ((AccessibilityNodeInfo) obj).isVisibleToUser();
    }

    public static void m929b(Object obj, boolean z) {
        ((AccessibilityNodeInfo) obj).setAccessibilityFocused(z);
    }

    public static boolean m930b(Object obj) {
        return ((AccessibilityNodeInfo) obj).isAccessibilityFocused();
    }
}
