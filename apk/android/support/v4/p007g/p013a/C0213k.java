package android.support.v4.p007g.p013a;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* renamed from: android.support.v4.g.a.k */
class C0213k {

    /* renamed from: android.support.v4.g.a.k.a */
    interface C0206a {
        Object m941a(int i);

        List<Object> m942a(String str, int i);

        boolean m943a(int i, int i2, Bundle bundle);

        Object m944b(int i);
    }

    /* renamed from: android.support.v4.g.a.k.1 */
    static class C02121 extends AccessibilityNodeProvider {
        final /* synthetic */ C0206a f501a;

        C02121(C0206a c0206a) {
            this.f501a = c0206a;
        }

        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
            return (AccessibilityNodeInfo) this.f501a.m941a(i);
        }

        public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i) {
            return this.f501a.m942a(str, i);
        }

        public AccessibilityNodeInfo findFocus(int i) {
            return (AccessibilityNodeInfo) this.f501a.m944b(i);
        }

        public boolean performAction(int i, int i2, Bundle bundle) {
            return this.f501a.m943a(i, i2, bundle);
        }
    }

    public static Object m956a(C0206a c0206a) {
        return new C02121(c0206a);
    }
}
