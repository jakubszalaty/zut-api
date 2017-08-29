package p000a;

import android.content.Context;
import android.support.v7.p015b.C0475a.C0470f;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;
import java.util.HashMap;
import java.util.List;

/* renamed from: a.c */
public class C0005c extends BaseExpandableListAdapter {
    private Context f15a;
    private List<String> f16b;
    private HashMap<String, List<String>> f17c;

    public C0005c(Context context, List<String> list, HashMap<String, List<String>> hashMap) {
        this.f15a = context;
        this.f16b = list;
        this.f17c = hashMap;
    }

    public Object getChild(int i, int i2) {
        return ((List) this.f17c.get(this.f16b.get(i))).get(i2);
    }

    public long getChildId(int i, int i2) {
        return (long) i2;
    }

    public View getChildView(int i, int i2, boolean z, View view, ViewGroup viewGroup) {
        CharSequence charSequence = "    " + ((String) getChild(i, i2));
        if (view == null) {
            view = ((LayoutInflater) this.f15a.getSystemService("layout_inflater")).inflate(2130968623, viewGroup, false);
        }
        ((TextView) view.findViewById(C0470f.title)).setText(charSequence);
        return view;
    }

    public int getChildrenCount(int i) {
        try {
            return ((List) this.f17c.get(this.f16b.get(i))).size();
        } catch (Exception e) {
            return 0;
        }
    }

    public Object getGroup(int i) {
        return this.f16b.get(i);
    }

    public int getGroupCount() {
        return this.f16b.size();
    }

    public long getGroupId(int i) {
        return (long) i;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getGroupView(int r6, boolean r7, android.view.View r8, android.view.ViewGroup r9) {
        /*
        r5 = this;
        r2 = 0;
        r0 = r5.getGroup(r6);
        r0 = (java.lang.String) r0;
        if (r8 != 0) goto L_0x001a;
    L_0x0009:
        r1 = r5.f15a;
        r3 = "layout_inflater";
        r1 = r1.getSystemService(r3);
        r1 = (android.view.LayoutInflater) r1;
        r3 = 2130968623; // 0x7f04002f float:1.7545905E38 double:1.052838389E-314;
        r8 = r1.inflate(r3, r9, r2);
    L_0x001a:
        r1 = 2131427373; // 0x7f0b002d float:1.847636E38 double:1.0530650416E-314;
        r1 = r8.findViewById(r1);
        r1 = (android.widget.TextView) r1;
        r1.setText(r0);
        r1 = 2131427372; // 0x7f0b002c float:1.8476358E38 double:1.053065041E-314;
        r1 = r8.findViewById(r1);
        r1 = (android.widget.ImageView) r1;
        r3 = -1;
        r4 = r0.hashCode();
        switch(r4) {
            case -2133229556: goto L_0x0097;
            case -2110382574: goto L_0x00e8;
            case -2013538399: goto L_0x016c;
            case -1822469688: goto L_0x0148;
            case -1808034328: goto L_0x008c;
            case -1752880375: goto L_0x00d0;
            case -1561913254: goto L_0x0078;
            case -1289865674: goto L_0x013c;
            case -1134460396: goto L_0x00a2;
            case -961436350: goto L_0x0124;
            case -824281321: goto L_0x0160;
            case -703500773: goto L_0x0118;
            case -633276745: goto L_0x00ad;
            case -500966277: goto L_0x005a;
            case -214489081: goto L_0x0082;
            case 2255103: goto L_0x003c;
            case 2424563: goto L_0x0046;
            case 76008060: goto L_0x0100;
            case 949073114: goto L_0x00b8;
            case 1106060528: goto L_0x00dc;
            case 1151130098: goto L_0x0178;
            case 1282562326: goto L_0x00c4;
            case 1321521514: goto L_0x006e;
            case 1447326541: goto L_0x010c;
            case 1534919082: goto L_0x0050;
            case 1852099085: goto L_0x0064;
            case 2004825170: goto L_0x0154;
            case 2061972239: goto L_0x0130;
            case 2140940188: goto L_0x00f4;
            default: goto L_0x0037;
        };
    L_0x0037:
        r0 = r3;
    L_0x0038:
        switch(r0) {
            case 0: goto L_0x0184;
            case 1: goto L_0x018c;
            case 2: goto L_0x018c;
            case 3: goto L_0x018c;
            case 4: goto L_0x018c;
            case 5: goto L_0x0194;
            case 6: goto L_0x0194;
            case 7: goto L_0x019c;
            case 8: goto L_0x019c;
            case 9: goto L_0x01a4;
            case 10: goto L_0x01a4;
            case 11: goto L_0x01ac;
            case 12: goto L_0x01ac;
            case 13: goto L_0x01b4;
            case 14: goto L_0x01b4;
            case 15: goto L_0x01bc;
            case 16: goto L_0x01bc;
            case 17: goto L_0x01c4;
            case 18: goto L_0x01c4;
            case 19: goto L_0x01cc;
            case 20: goto L_0x01cc;
            case 21: goto L_0x01d4;
            case 22: goto L_0x01d4;
            case 23: goto L_0x01dc;
            case 24: goto L_0x01dc;
            case 25: goto L_0x01e4;
            case 26: goto L_0x01e4;
            case 27: goto L_0x01ec;
            case 28: goto L_0x01ec;
            default: goto L_0x003b;
        };
    L_0x003b:
        return r8;
    L_0x003c:
        r4 = "Home";
        r0 = r0.equals(r4);
        if (r0 == 0) goto L_0x0037;
    L_0x0044:
        r0 = r2;
        goto L_0x0038;
    L_0x0046:
        r2 = "News";
        r0 = r0.equals(r2);
        if (r0 == 0) goto L_0x0037;
    L_0x004e:
        r0 = 1;
        goto L_0x0038;
    L_0x0050:
        r2 = "Aktualno\u015bci";
        r0 = r0.equals(r2);
        if (r0 == 0) goto L_0x0037;
    L_0x0058:
        r0 = 2;
        goto L_0x0038;
    L_0x005a:
        r2 = "Notices";
        r0 = r0.equals(r2);
        if (r0 == 0) goto L_0x0037;
    L_0x0062:
        r0 = 3;
        goto L_0x0038;
    L_0x0064:
        r2 = "Og\u0142oszenia";
        r0 = r0.equals(r2);
        if (r0 == 0) goto L_0x0037;
    L_0x006c:
        r0 = 4;
        goto L_0x0038;
    L_0x006e:
        r2 = "Personal data";
        r0 = r0.equals(r2);
        if (r0 == 0) goto L_0x0037;
    L_0x0076:
        r0 = 5;
        goto L_0x0038;
    L_0x0078:
        r2 = "Dane osobowe";
        r0 = r0.equals(r2);
        if (r0 == 0) goto L_0x0037;
    L_0x0080:
        r0 = 6;
        goto L_0x0038;
    L_0x0082:
        r2 = "Studies";
        r0 = r0.equals(r2);
        if (r0 == 0) goto L_0x0037;
    L_0x008a:
        r0 = 7;
        goto L_0x0038;
    L_0x008c:
        r2 = "Studia";
        r0 = r0.equals(r2);
        if (r0 == 0) goto L_0x0037;
    L_0x0094:
        r0 = 8;
        goto L_0x0038;
    L_0x0097:
        r2 = "Employment";
        r0 = r0.equals(r2);
        if (r0 == 0) goto L_0x0037;
    L_0x009f:
        r0 = 9;
        goto L_0x0038;
    L_0x00a2:
        r2 = "Zatrudnienie";
        r0 = r0.equals(r2);
        if (r0 == 0) goto L_0x0037;
    L_0x00aa:
        r0 = 10;
        goto L_0x0038;
    L_0x00ad:
        r2 = "Schedule";
        r0 = r0.equals(r2);
        if (r0 == 0) goto L_0x0037;
    L_0x00b5:
        r0 = 11;
        goto L_0x0038;
    L_0x00b8:
        r2 = "Plan zaj\u0119\u0107";
        r0 = r0.equals(r2);
        if (r0 == 0) goto L_0x0037;
    L_0x00c0:
        r0 = 12;
        goto L_0x0038;
    L_0x00c4:
        r2 = "Vacations";
        r0 = r0.equals(r2);
        if (r0 == 0) goto L_0x0037;
    L_0x00cc:
        r0 = 13;
        goto L_0x0038;
    L_0x00d0:
        r2 = "Urlopy";
        r0 = r0.equals(r2);
        if (r0 == 0) goto L_0x0037;
    L_0x00d8:
        r0 = 14;
        goto L_0x0038;
    L_0x00dc:
        r2 = "List of attendance";
        r0 = r0.equals(r2);
        if (r0 == 0) goto L_0x0037;
    L_0x00e4:
        r0 = 15;
        goto L_0x0038;
    L_0x00e8:
        r2 = "Lista obecno\u015bci";
        r0 = r0.equals(r2);
        if (r0 == 0) goto L_0x0037;
    L_0x00f0:
        r0 = 16;
        goto L_0x0038;
    L_0x00f4:
        r2 = "Grades";
        r0 = r0.equals(r2);
        if (r0 == 0) goto L_0x0037;
    L_0x00fc:
        r0 = 17;
        goto L_0x0038;
    L_0x0100:
        r2 = "Oceny";
        r0 = r0.equals(r2);
        if (r0 == 0) goto L_0x0037;
    L_0x0108:
        r0 = 18;
        goto L_0x0038;
    L_0x010c:
        r2 = "Payments";
        r0 = r0.equals(r2);
        if (r0 == 0) goto L_0x0037;
    L_0x0114:
        r0 = 19;
        goto L_0x0038;
    L_0x0118:
        r2 = "P\u0142atno\u015bci";
        r0 = r0.equals(r2);
        if (r0 == 0) goto L_0x0037;
    L_0x0120:
        r0 = 20;
        goto L_0x0038;
    L_0x0124:
        r2 = "Diploma";
        r0 = r0.equals(r2);
        if (r0 == 0) goto L_0x0037;
    L_0x012c:
        r0 = 21;
        goto L_0x0038;
    L_0x0130:
        r2 = "Dyplom";
        r0 = r0.equals(r2);
        if (r0 == 0) goto L_0x0037;
    L_0x0138:
        r0 = 22;
        goto L_0x0038;
    L_0x013c:
        r2 = "Wyszukiwanie";
        r0 = r0.equals(r2);
        if (r0 == 0) goto L_0x0037;
    L_0x0144:
        r0 = 23;
        goto L_0x0038;
    L_0x0148:
        r2 = "Search";
        r0 = r0.equals(r2);
        if (r0 == 0) goto L_0x0037;
    L_0x0150:
        r0 = 24;
        goto L_0x0038;
    L_0x0154:
        r2 = "Log out";
        r0 = r0.equals(r2);
        if (r0 == 0) goto L_0x0037;
    L_0x015c:
        r0 = 25;
        goto L_0x0038;
    L_0x0160:
        r2 = "Wyloguj";
        r0 = r0.equals(r2);
        if (r0 == 0) goto L_0x0037;
    L_0x0168:
        r0 = 26;
        goto L_0x0038;
    L_0x016c:
        r2 = "Log in";
        r0 = r0.equals(r2);
        if (r0 == 0) goto L_0x0037;
    L_0x0174:
        r0 = 27;
        goto L_0x0038;
    L_0x0178:
        r2 = "Zaloguj";
        r0 = r0.equals(r2);
        if (r0 == 0) goto L_0x0037;
    L_0x0180:
        r0 = 28;
        goto L_0x0038;
    L_0x0184:
        r0 = 2130837596; // 0x7f02005c float:1.728015E38 double:1.052773653E-314;
        r1.setImageResource(r0);
        goto L_0x003b;
    L_0x018c:
        r0 = 2130837609; // 0x7f020069 float:1.7280177E38 double:1.0527736595E-314;
        r1.setImageResource(r0);
        goto L_0x003b;
    L_0x0194:
        r0 = 2130837614; // 0x7f02006e float:1.7280187E38 double:1.052773662E-314;
        r1.setImageResource(r0);
        goto L_0x003b;
    L_0x019c:
        r0 = 2130837622; // 0x7f020076 float:1.7280203E38 double:1.052773666E-314;
        r1.setImageResource(r0);
        goto L_0x003b;
    L_0x01a4:
        r0 = 2130837593; // 0x7f020059 float:1.7280144E38 double:1.0527736516E-314;
        r1.setImageResource(r0);
        goto L_0x003b;
    L_0x01ac:
        r0 = 2130837618; // 0x7f020072 float:1.7280195E38 double:1.052773664E-314;
        r1.setImageResource(r0);
        goto L_0x003b;
    L_0x01b4:
        r0 = 2130837616; // 0x7f020070 float:1.7280191E38 double:1.052773663E-314;
        r1.setImageResource(r0);
        goto L_0x003b;
    L_0x01bc:
        r0 = 2130837588; // 0x7f020054 float:1.7280134E38 double:1.052773649E-314;
        r1.setImageResource(r0);
        goto L_0x003b;
    L_0x01c4:
        r0 = 2130837595; // 0x7f02005b float:1.7280149E38 double:1.0527736526E-314;
        r1.setImageResource(r0);
        goto L_0x003b;
    L_0x01cc:
        r0 = 2130837613; // 0x7f02006d float:1.7280185E38 double:1.0527736614E-314;
        r1.setImageResource(r0);
        goto L_0x003b;
    L_0x01d4:
        r0 = 2130837591; // 0x7f020057 float:1.728014E38 double:1.0527736506E-314;
        r1.setImageResource(r0);
        goto L_0x003b;
    L_0x01dc:
        r0 = 2130837619; // 0x7f020073 float:1.7280197E38 double:1.0527736644E-314;
        r1.setImageResource(r0);
        goto L_0x003b;
    L_0x01e4:
        r0 = 2130837606; // 0x7f020066 float:1.728017E38 double:1.052773658E-314;
        r1.setImageResource(r0);
        goto L_0x003b;
    L_0x01ec:
        r0 = 2130837602; // 0x7f020062 float:1.7280163E38 double:1.052773656E-314;
        r1.setImageResource(r0);
        goto L_0x003b;
        */
        throw new UnsupportedOperationException("Method not decompiled: a.c.getGroupView(int, boolean, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public boolean hasStableIds() {
        return false;
    }

    public boolean isChildSelectable(int i, int i2) {
        return true;
    }
}
