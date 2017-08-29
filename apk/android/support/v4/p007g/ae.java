package android.support.v4.p007g;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.os.Build.VERSION;
import android.support.v4.p007g.am.C0237a;
import android.support.v4.p011e.C0152c;
import android.view.View;
import android.view.ViewParent;
import java.util.WeakHashMap;

/* renamed from: android.support.v4.g.ae */
public class ae {
    static final C0225l f509a;

    /* renamed from: android.support.v4.g.ae.l */
    interface C0225l {
        int m992a(int i, int i2, int i3);

        bb m993a(View view, bb bbVar);

        void m994a(View view);

        void m995a(View view, float f);

        void m996a(View view, int i, int i2);

        void m997a(View view, int i, Paint paint);

        void m998a(View view, ColorStateList colorStateList);

        void m999a(View view, Mode mode);

        void m1000a(View view, C0275b c0275b);

        void m1001a(View view, C0330z c0330z);

        void m1002a(View view, Runnable runnable);

        void m1003a(View view, Runnable runnable, long j);

        void m1004a(View view, boolean z);

        boolean m1005a(View view, int i);

        int m1006b(View view);

        void m1007b(View view, float f);

        void m1008b(View view, int i);

        void m1009b(View view, boolean z);

        int m1010c(View view);

        void m1011c(View view, float f);

        void m1012c(View view, int i);

        int m1013d(View view);

        void m1014d(View view, int i);

        ViewParent m1015e(View view);

        int m1016f(View view);

        int m1017g(View view);

        boolean m1018h(View view);

        float m1019i(View view);

        int m1020j(View view);

        au m1021k(View view);

        int m1022l(View view);

        void m1023m(View view);

        float m1024n(View view);

        boolean m1025o(View view);

        void m1026p(View view);

        ColorStateList m1027q(View view);

        Mode m1028r(View view);

        void m1029s(View view);

        boolean m1030t(View view);

        boolean m1031u(View view);

        boolean m1032v(View view);
    }

    /* renamed from: android.support.v4.g.ae.b */
    static class C0226b implements C0225l {
        WeakHashMap<View, au> f505a;

        C0226b() {
            this.f505a = null;
        }

        private boolean m1033a(aa aaVar, int i) {
            int computeVerticalScrollOffset = aaVar.computeVerticalScrollOffset();
            int computeVerticalScrollRange = aaVar.computeVerticalScrollRange() - aaVar.computeVerticalScrollExtent();
            return computeVerticalScrollRange == 0 ? false : i < 0 ? computeVerticalScrollOffset > 0 : computeVerticalScrollOffset < computeVerticalScrollRange + -1;
        }

        public int m1034a(int i, int i2, int i3) {
            return View.resolveSize(i, i2);
        }

        long m1035a() {
            return 10;
        }

        public bb m1036a(View view, bb bbVar) {
            return bbVar;
        }

        public void m1037a(View view) {
            view.invalidate();
        }

        public void m1038a(View view, float f) {
        }

        public void m1039a(View view, int i, int i2) {
        }

        public void m1040a(View view, int i, Paint paint) {
        }

        public void m1041a(View view, ColorStateList colorStateList) {
            af.m1169a(view, colorStateList);
        }

        public void m1042a(View view, Mode mode) {
            af.m1170a(view, mode);
        }

        public void m1043a(View view, C0275b c0275b) {
        }

        public void m1044a(View view, C0330z c0330z) {
        }

        public void m1045a(View view, Runnable runnable) {
            view.postDelayed(runnable, m1035a());
        }

        public void m1046a(View view, Runnable runnable, long j) {
            view.postDelayed(runnable, m1035a() + j);
        }

        public void m1047a(View view, boolean z) {
        }

        public boolean m1048a(View view, int i) {
            return (view instanceof aa) && m1033a((aa) view, i);
        }

        public int m1049b(View view) {
            return 0;
        }

        public void m1050b(View view, float f) {
        }

        public void m1051b(View view, int i) {
        }

        public void m1052b(View view, boolean z) {
        }

        public int m1053c(View view) {
            return 0;
        }

        public void m1054c(View view, float f) {
        }

        public void m1055c(View view, int i) {
            af.m1172b(view, i);
        }

        public int m1056d(View view) {
            return 0;
        }

        public void m1057d(View view, int i) {
            af.m1168a(view, i);
        }

        public ViewParent m1058e(View view) {
            return view.getParent();
        }

        public int m1059f(View view) {
            return view.getMeasuredWidth();
        }

        public int m1060g(View view) {
            return 0;
        }

        public boolean m1061h(View view) {
            return true;
        }

        public float m1062i(View view) {
            return 0.0f;
        }

        public int m1063j(View view) {
            return af.m1174d(view);
        }

        public au m1064k(View view) {
            return new au(view);
        }

        public int m1065l(View view) {
            return 0;
        }

        public void m1066m(View view) {
        }

        public float m1067n(View view) {
            return 0.0f;
        }

        public boolean m1068o(View view) {
            return false;
        }

        public void m1069p(View view) {
        }

        public ColorStateList m1070q(View view) {
            return af.m1167a(view);
        }

        public Mode m1071r(View view) {
            return af.m1171b(view);
        }

        public void m1072s(View view) {
            if (view instanceof C0326v) {
                ((C0326v) view).stopNestedScroll();
            }
        }

        public boolean m1073t(View view) {
            return af.m1173c(view);
        }

        public boolean m1074u(View view) {
            return af.m1175e(view);
        }

        public boolean m1075v(View view) {
            return false;
        }
    }

    /* renamed from: android.support.v4.g.ae.c */
    static class C0227c extends C0226b {
        C0227c() {
        }

        public int m1076a(int i, int i2, int i3) {
            return ag.m1176a(i, i2, i3);
        }

        long m1077a() {
            return ag.m1178a();
        }

        public void m1078a(View view, float f) {
            ag.m1179a(view, f);
        }

        public void m1079a(View view, int i, Paint paint) {
            ag.m1181a(view, i, paint);
        }

        public void m1080a(View view, boolean z) {
            ag.m1182a(view, z);
        }

        public void m1081b(View view, float f) {
            ag.m1184b(view, f);
        }

        public void m1082b(View view, boolean z) {
            ag.m1186b(view, z);
        }

        public int m1083c(View view) {
            return ag.m1177a(view);
        }

        public void m1084c(View view, int i) {
            ag.m1185b(view, i);
        }

        public void m1085d(View view, int i) {
            ag.m1180a(view, i);
        }

        public int m1086f(View view) {
            return ag.m1183b(view);
        }

        public int m1087g(View view) {
            return ag.m1187c(view);
        }

        public float m1088i(View view) {
            return ag.m1188d(view);
        }

        public void m1089p(View view) {
            ag.m1189e(view);
        }
    }

    /* renamed from: android.support.v4.g.ae.e */
    static class C0228e extends C0227c {
        static boolean f506b;

        static {
            f506b = false;
        }

        C0228e() {
        }

        public void m1090a(View view, C0275b c0275b) {
            ah.m1191a(view, c0275b == null ? null : c0275b.m1401a());
        }

        public boolean m1091a(View view, int i) {
            return ah.m1192a(view, i);
        }

        public au m1092k(View view) {
            if (this.a == null) {
                this.a = new WeakHashMap();
            }
            au auVar = (au) this.a.get(view);
            if (auVar != null) {
                return auVar;
            }
            auVar = new au(view);
            this.a.put(view, auVar);
            return auVar;
        }
    }

    /* renamed from: android.support.v4.g.ae.d */
    static class C0229d extends C0228e {
        C0229d() {
        }

        public boolean m1093v(View view) {
            return ai.m1193a(view);
        }
    }

    /* renamed from: android.support.v4.g.ae.f */
    static class C0230f extends C0229d {
        C0230f() {
        }

        public void m1094a(View view) {
            aj.m1194a(view);
        }

        public void m1095a(View view, Runnable runnable) {
            aj.m1196a(view, runnable);
        }

        public void m1096a(View view, Runnable runnable, long j) {
            aj.m1197a(view, runnable, j);
        }

        public int m1097b(View view) {
            return aj.m1198b(view);
        }

        public void m1098b(View view, int i) {
            if (i == 4) {
                i = 2;
            }
            aj.m1195a(view, i);
        }

        public ViewParent m1099e(View view) {
            return aj.m1199c(view);
        }

        public boolean m1100h(View view) {
            return aj.m1203g(view);
        }

        public int m1101j(View view) {
            return aj.m1200d(view);
        }

        public void m1102m(View view) {
            aj.m1201e(view);
        }

        public boolean m1103o(View view) {
            return aj.m1202f(view);
        }
    }

    /* renamed from: android.support.v4.g.ae.g */
    static class C0231g extends C0230f {
        C0231g() {
        }

        public int m1104d(View view) {
            return ak.m1204a(view);
        }

        public int m1105l(View view) {
            return ak.m1205b(view);
        }
    }

    /* renamed from: android.support.v4.g.ae.h */
    static class C0232h extends C0231g {
        C0232h() {
        }
    }

    /* renamed from: android.support.v4.g.ae.i */
    static class C0233i extends C0232h {
        C0233i() {
        }

        public void m1106b(View view, int i) {
            aj.m1195a(view, i);
        }

        public boolean m1107t(View view) {
            return al.m1206a(view);
        }

        public boolean m1108u(View view) {
            return al.m1207b(view);
        }
    }

    /* renamed from: android.support.v4.g.ae.j */
    static class C0234j extends C0233i {

        /* renamed from: android.support.v4.g.ae.j.1 */
        class C02381 implements C0237a {
            final /* synthetic */ C0330z f507a;
            final /* synthetic */ C0234j f508b;

            C02381(C0234j c0234j, C0330z c0330z) {
                this.f508b = c0234j;
                this.f507a = c0330z;
            }

            public Object m1125a(View view, Object obj) {
                return bb.m1427a(this.f507a.m1550a(view, bb.m1426a(obj)));
            }
        }

        C0234j() {
        }

        public bb m1109a(View view, bb bbVar) {
            return bb.m1426a(am.m1209a(view, bb.m1427a(bbVar)));
        }

        public void m1110a(View view, ColorStateList colorStateList) {
            am.m1213a(view, colorStateList);
        }

        public void m1111a(View view, Mode mode) {
            am.m1214a(view, mode);
        }

        public void m1112a(View view, C0330z c0330z) {
            if (c0330z == null) {
                am.m1215a(view, null);
            } else {
                am.m1215a(view, new C02381(this, c0330z));
            }
        }

        public void m1113c(View view, float f) {
            am.m1211a(view, f);
        }

        public void m1114c(View view, int i) {
            am.m1217b(view, i);
        }

        public void m1115d(View view, int i) {
            am.m1212a(view, i);
        }

        public void m1116m(View view) {
            am.m1210a(view);
        }

        public float m1117n(View view) {
            return am.m1216b(view);
        }

        public ColorStateList m1118q(View view) {
            return am.m1218c(view);
        }

        public Mode m1119r(View view) {
            return am.m1219d(view);
        }

        public void m1120s(View view) {
            am.m1220e(view);
        }
    }

    /* renamed from: android.support.v4.g.ae.k */
    static class C0235k extends C0234j {
        C0235k() {
        }

        public void m1121a(View view, int i, int i2) {
            an.m1222a(view, i, i2);
        }

        public void m1122c(View view, int i) {
            an.m1223b(view, i);
        }

        public void m1123d(View view, int i) {
            an.m1221a(view, i);
        }
    }

    /* renamed from: android.support.v4.g.ae.a */
    static class C0236a extends C0235k {
        C0236a() {
        }
    }

    static {
        int i = VERSION.SDK_INT;
        if (C0152c.m599a()) {
            f509a = new C0236a();
        } else if (i >= 23) {
            f509a = new C0235k();
        } else if (i >= 21) {
            f509a = new C0234j();
        } else if (i >= 19) {
            f509a = new C0233i();
        } else if (i >= 18) {
            f509a = new C0232h();
        } else if (i >= 17) {
            f509a = new C0231g();
        } else if (i >= 16) {
            f509a = new C0230f();
        } else if (i >= 15) {
            f509a = new C0229d();
        } else if (i >= 14) {
            f509a = new C0228e();
        } else if (i >= 11) {
            f509a = new C0227c();
        } else {
            f509a = new C0226b();
        }
    }

    public static int m1126a(int i, int i2, int i3) {
        return f509a.m992a(i, i2, i3);
    }

    public static bb m1127a(View view, bb bbVar) {
        return f509a.m993a(view, bbVar);
    }

    public static void m1128a(View view) {
        f509a.m994a(view);
    }

    public static void m1129a(View view, float f) {
        f509a.m995a(view, f);
    }

    public static void m1130a(View view, int i, int i2) {
        f509a.m996a(view, i, i2);
    }

    public static void m1131a(View view, int i, Paint paint) {
        f509a.m997a(view, i, paint);
    }

    public static void m1132a(View view, ColorStateList colorStateList) {
        f509a.m998a(view, colorStateList);
    }

    public static void m1133a(View view, Mode mode) {
        f509a.m999a(view, mode);
    }

    public static void m1134a(View view, C0275b c0275b) {
        f509a.m1000a(view, c0275b);
    }

    public static void m1135a(View view, C0330z c0330z) {
        f509a.m1001a(view, c0330z);
    }

    public static void m1136a(View view, Runnable runnable) {
        f509a.m1002a(view, runnable);
    }

    public static void m1137a(View view, Runnable runnable, long j) {
        f509a.m1003a(view, runnable, j);
    }

    public static void m1138a(View view, boolean z) {
        f509a.m1004a(view, z);
    }

    public static boolean m1139a(View view, int i) {
        return f509a.m1005a(view, i);
    }

    public static int m1140b(View view) {
        return f509a.m1006b(view);
    }

    public static void m1141b(View view, float f) {
        f509a.m1007b(view, f);
    }

    public static void m1142b(View view, int i) {
        f509a.m1008b(view, i);
    }

    public static void m1143b(View view, boolean z) {
        f509a.m1009b(view, z);
    }

    public static int m1144c(View view) {
        return f509a.m1010c(view);
    }

    public static void m1145c(View view, float f) {
        f509a.m1011c(view, f);
    }

    public static void m1146c(View view, int i) {
        f509a.m1014d(view, i);
    }

    public static int m1147d(View view) {
        return f509a.m1013d(view);
    }

    public static void m1148d(View view, int i) {
        f509a.m1012c(view, i);
    }

    public static ViewParent m1149e(View view) {
        return f509a.m1015e(view);
    }

    public static int m1150f(View view) {
        return f509a.m1016f(view);
    }

    public static int m1151g(View view) {
        return f509a.m1017g(view);
    }

    public static float m1152h(View view) {
        return f509a.m1019i(view);
    }

    public static int m1153i(View view) {
        return f509a.m1020j(view);
    }

    public static au m1154j(View view) {
        return f509a.m1021k(view);
    }

    public static float m1155k(View view) {
        return f509a.m1024n(view);
    }

    public static int m1156l(View view) {
        return f509a.m1022l(view);
    }

    public static void m1157m(View view) {
        f509a.m1023m(view);
    }

    public static boolean m1158n(View view) {
        return f509a.m1025o(view);
    }

    public static void m1159o(View view) {
        f509a.m1026p(view);
    }

    public static boolean m1160p(View view) {
        return f509a.m1018h(view);
    }

    public static ColorStateList m1161q(View view) {
        return f509a.m1027q(view);
    }

    public static Mode m1162r(View view) {
        return f509a.m1028r(view);
    }

    public static void m1163s(View view) {
        f509a.m1029s(view);
    }

    public static boolean m1164t(View view) {
        return f509a.m1030t(view);
    }

    public static boolean m1165u(View view) {
        return f509a.m1031u(view);
    }

    public static boolean m1166v(View view) {
        return f509a.m1032v(view);
    }
}
