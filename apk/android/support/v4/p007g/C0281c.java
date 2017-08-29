package android.support.v4.p007g;

import android.view.View;
import android.view.View.AccessibilityDelegate;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: android.support.v4.g.c */
class C0281c {

    /* renamed from: android.support.v4.g.c.a */
    public interface C0267a {
        void m1334a(View view, int i);

        void m1335a(View view, Object obj);

        boolean m1336a(View view, AccessibilityEvent accessibilityEvent);

        boolean m1337a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent);

        void m1338b(View view, AccessibilityEvent accessibilityEvent);

        void m1339c(View view, AccessibilityEvent accessibilityEvent);

        void m1340d(View view, AccessibilityEvent accessibilityEvent);
    }

    /* renamed from: android.support.v4.g.c.1 */
    static class C02801 extends AccessibilityDelegate {
        final /* synthetic */ C0267a f544a;

        C02801(C0267a c0267a) {
            this.f544a = c0267a;
        }

        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f544a.m1336a(view, accessibilityEvent);
        }

        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f544a.m1338b(view, accessibilityEvent);
        }

        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            this.f544a.m1335a(view, (Object) accessibilityNodeInfo);
        }

        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f544a.m1339c(view, accessibilityEvent);
        }

        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f544a.m1337a(viewGroup, view, accessibilityEvent);
        }

        public void sendAccessibilityEvent(View view, int i) {
            this.f544a.m1334a(view, i);
        }

        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f544a.m1340d(view, accessibilityEvent);
        }
    }

    public static Object m1438a() {
        return new AccessibilityDelegate();
    }

    public static Object m1439a(C0267a c0267a) {
        return new C02801(c0267a);
    }

    public static void m1440a(Object obj, View view, int i) {
        ((AccessibilityDelegate) obj).sendAccessibilityEvent(view, i);
    }

    public static void m1441a(Object obj, View view, Object obj2) {
        ((AccessibilityDelegate) obj).onInitializeAccessibilityNodeInfo(view, (AccessibilityNodeInfo) obj2);
    }

    public static boolean m1442a(Object obj, View view, AccessibilityEvent accessibilityEvent) {
        return ((AccessibilityDelegate) obj).dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public static boolean m1443a(Object obj, ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return ((AccessibilityDelegate) obj).onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public static void m1444b(Object obj, View view, AccessibilityEvent accessibilityEvent) {
        ((AccessibilityDelegate) obj).onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public static void m1445c(Object obj, View view, AccessibilityEvent accessibilityEvent) {
        ((AccessibilityDelegate) obj).onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public static void m1446d(Object obj, View view, AccessibilityEvent accessibilityEvent) {
        ((AccessibilityDelegate) obj).sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }
}
