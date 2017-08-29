package android.support.v4.p007g;

import android.os.Bundle;
import android.view.View;
import android.view.View.AccessibilityDelegate;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;

/* renamed from: android.support.v4.g.d */
class C0283d {

    /* renamed from: android.support.v4.g.d.a */
    public interface C0272a {
        Object m1379a(View view);

        void m1380a(View view, int i);

        void m1381a(View view, Object obj);

        boolean m1382a(View view, int i, Bundle bundle);

        boolean m1383a(View view, AccessibilityEvent accessibilityEvent);

        boolean m1384a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent);

        void m1385b(View view, AccessibilityEvent accessibilityEvent);

        void m1386c(View view, AccessibilityEvent accessibilityEvent);

        void m1387d(View view, AccessibilityEvent accessibilityEvent);
    }

    /* renamed from: android.support.v4.g.d.1 */
    static class C02821 extends AccessibilityDelegate {
        final /* synthetic */ C0272a f545a;

        C02821(C0272a c0272a) {
            this.f545a = c0272a;
        }

        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f545a.m1383a(view, accessibilityEvent);
        }

        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            return (AccessibilityNodeProvider) this.f545a.m1379a(view);
        }

        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f545a.m1385b(view, accessibilityEvent);
        }

        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            this.f545a.m1381a(view, (Object) accessibilityNodeInfo);
        }

        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f545a.m1386c(view, accessibilityEvent);
        }

        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f545a.m1384a(viewGroup, view, accessibilityEvent);
        }

        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            return this.f545a.m1382a(view, i, bundle);
        }

        public void sendAccessibilityEvent(View view, int i) {
            this.f545a.m1380a(view, i);
        }

        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f545a.m1387d(view, accessibilityEvent);
        }
    }

    public static Object m1447a(C0272a c0272a) {
        return new C02821(c0272a);
    }

    public static Object m1448a(Object obj, View view) {
        return ((AccessibilityDelegate) obj).getAccessibilityNodeProvider(view);
    }

    public static boolean m1449a(Object obj, View view, int i, Bundle bundle) {
        return ((AccessibilityDelegate) obj).performAccessibilityAction(view, i, bundle);
    }
}
