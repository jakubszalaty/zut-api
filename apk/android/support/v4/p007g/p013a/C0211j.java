package android.support.v4.p007g.p013a;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* renamed from: android.support.v4.g.a.j */
class C0211j {

    /* renamed from: android.support.v4.g.a.j.a */
    interface C0202a {
        Object m933a(int i);

        List<Object> m934a(String str, int i);

        boolean m935a(int i, int i2, Bundle bundle);
    }

    /* renamed from: android.support.v4.g.a.j.1 */
    static class C02101 extends AccessibilityNodeProvider {
        final /* synthetic */ C0202a f500a;

        C02101(C0202a c0202a) {
            this.f500a = c0202a;
        }

        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
            return (AccessibilityNodeInfo) this.f500a.m933a(i);
        }

        public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i) {
            return this.f500a.m934a(str, i);
        }

        public boolean performAction(int i, int i2, Bundle bundle) {
            return this.f500a.m935a(i, i2, bundle);
        }
    }

    public static Object m955a(C0202a c0202a) {
        return new C02101(c0202a);
    }
}
