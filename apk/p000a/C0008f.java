package p000a;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.List;
import p022b.C0634d;

/* renamed from: a.f */
public class C0008f extends BaseAdapter {
    private List<C0634d> f22a;
    private Context f23b;

    public C0008f(Context context, List<C0634d> list) {
        this.f23b = context;
        this.f22a = list;
    }

    public int getCount() {
        return this.f22a.size();
    }

    public Object getItem(int i) {
        return this.f22a.get(i);
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = ((LayoutInflater) this.f23b.getSystemService("layout_inflater")).inflate(2130968639, viewGroup, false);
        }
        if (i == 0) {
            view.setBackgroundColor(Color.rgb(231, 231, 239));
        } else {
            view.setBackgroundColor(0);
        }
        ((TextView) view.findViewById(2131427485)).setText(((C0634d) this.f22a.get(i)).m3180a());
        ((TextView) view.findViewById(2131427486)).setText(((C0634d) this.f22a.get(i)).m3181b());
        ((TextView) view.findViewById(2131427487)).setText(((C0634d) this.f22a.get(i)).m3182c());
        ((TextView) view.findViewById(2131427488)).setText(((C0634d) this.f22a.get(i)).m3183d());
        if (((C0634d) this.f22a.get(i)).m3184e() != null) {
            ((TextView) view.findViewById(2131427489)).setText(((C0634d) this.f22a.get(i)).m3184e());
        }
        if (((C0634d) this.f22a.get(i)).m3185f() != null) {
            ((TextView) view.findViewById(2131427505)).setText(((C0634d) this.f22a.get(i)).m3185f());
        }
        return view;
    }
}
