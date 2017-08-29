package android.support.v4.p007g.p013a;

import android.graphics.Rect;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: android.support.v4.g.a.f */
class C0198f {
    public static Object m892a(Object obj) {
        return AccessibilityNodeInfo.obtain((AccessibilityNodeInfo) obj);
    }

    public static void m893a(Object obj, int i) {
        ((AccessibilityNodeInfo) obj).addAction(i);
    }

    public static void m894a(Object obj, Rect rect) {
        ((AccessibilityNodeInfo) obj).getBoundsInParent(rect);
    }

    public static void m895a(Object obj, View view) {
        ((AccessibilityNodeInfo) obj).addChild(view);
    }

    public static void m896a(Object obj, CharSequence charSequence) {
        ((AccessibilityNodeInfo) obj).setClassName(charSequence);
    }

    public static void m897a(Object obj, boolean z) {
        ((AccessibilityNodeInfo) obj).setClickable(z);
    }

    public static int m898b(Object obj) {
        return ((AccessibilityNodeInfo) obj).getActions();
    }

    public static void m899b(Object obj, Rect rect) {
        ((AccessibilityNodeInfo) obj).getBoundsInScreen(rect);
    }

    public static void m900b(Object obj, View view) {
        ((AccessibilityNodeInfo) obj).setParent(view);
    }

    public static void m901b(Object obj, CharSequence charSequence) {
        ((AccessibilityNodeInfo) obj).setContentDescription(charSequence);
    }

    public static void m902b(Object obj, boolean z) {
        ((AccessibilityNodeInfo) obj).setEnabled(z);
    }

    public static CharSequence m903c(Object obj) {
        return ((AccessibilityNodeInfo) obj).getClassName();
    }

    public static void m904c(Object obj, Rect rect) {
        ((AccessibilityNodeInfo) obj).setBoundsInParent(rect);
    }

    public static void m905c(Object obj, View view) {
        ((AccessibilityNodeInfo) obj).setSource(view);
    }

    public static void m906c(Object obj, CharSequence charSequence) {
        ((AccessibilityNodeInfo) obj).setPackageName(charSequence);
    }

    public static void m907c(Object obj, boolean z) {
        ((AccessibilityNodeInfo) obj).setFocusable(z);
    }

    public static CharSequence m908d(Object obj) {
        return ((AccessibilityNodeInfo) obj).getContentDescription();
    }

    public static void m909d(Object obj, Rect rect) {
        ((AccessibilityNodeInfo) obj).setBoundsInScreen(rect);
    }

    public static void m910d(Object obj, boolean z) {
        ((AccessibilityNodeInfo) obj).setFocused(z);
    }

    public static CharSequence m911e(Object obj) {
        return ((AccessibilityNodeInfo) obj).getPackageName();
    }

    public static void m912e(Object obj, boolean z) {
        ((AccessibilityNodeInfo) obj).setLongClickable(z);
    }

    public static CharSequence m913f(Object obj) {
        return ((AccessibilityNodeInfo) obj).getText();
    }

    public static void m914f(Object obj, boolean z) {
        ((AccessibilityNodeInfo) obj).setScrollable(z);
    }

    public static void m915g(Object obj, boolean z) {
        ((AccessibilityNodeInfo) obj).setSelected(z);
    }

    public static boolean m916g(Object obj) {
        return ((AccessibilityNodeInfo) obj).isCheckable();
    }

    public static boolean m917h(Object obj) {
        return ((AccessibilityNodeInfo) obj).isChecked();
    }

    public static boolean m918i(Object obj) {
        return ((AccessibilityNodeInfo) obj).isClickable();
    }

    public static boolean m919j(Object obj) {
        return ((AccessibilityNodeInfo) obj).isEnabled();
    }

    public static boolean m920k(Object obj) {
        return ((AccessibilityNodeInfo) obj).isFocusable();
    }

    public static boolean m921l(Object obj) {
        return ((AccessibilityNodeInfo) obj).isFocused();
    }

    public static boolean m922m(Object obj) {
        return ((AccessibilityNodeInfo) obj).isLongClickable();
    }

    public static boolean m923n(Object obj) {
        return ((AccessibilityNodeInfo) obj).isPassword();
    }

    public static boolean m924o(Object obj) {
        return ((AccessibilityNodeInfo) obj).isScrollable();
    }

    public static boolean m925p(Object obj) {
        return ((AccessibilityNodeInfo) obj).isSelected();
    }

    public static void m926q(Object obj) {
        ((AccessibilityNodeInfo) obj).recycle();
    }
}
