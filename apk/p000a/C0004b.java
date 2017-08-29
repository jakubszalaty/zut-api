package p000a;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.List;
import p022b.C0633c;

/* renamed from: a.b */
public class C0004b extends BaseAdapter {
    private Context f13a;
    private List<C0633c> f14b;

    public C0004b(Context context, List<C0633c> list) {
        this.f13a = context;
        this.f14b = list;
    }

    public int getCount() {
        return this.f14b.size();
    }

    public Object getItem(int i) {
        return this.f14b.get(i);
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = ((LayoutInflater) this.f13a.getSystemService("layout_inflater")).inflate(2130968622, viewGroup, false);
        }
        if (i == 0) {
            view.setBackgroundColor(Color.rgb(231, 231, 239));
        } else {
            view.setBackgroundColor(0);
        }
        ((TextView) view.findViewById(2131427485)).setText(((C0633c) this.f14b.get(i)).m3175a());
        ((TextView) view.findViewById(2131427486)).setText(((C0633c) this.f14b.get(i)).m3176b());
        ((TextView) view.findViewById(2131427487)).setText(((C0633c) this.f14b.get(i)).m3177c());
        ((TextView) view.findViewById(2131427488)).setText(((C0633c) this.f14b.get(i)).m3178d());
        if (((C0633c) this.f14b.get(i)).m3179e() != null) {
            ((TextView) view.findViewById(2131427489)).setText(((C0633c) this.f14b.get(i)).m3179e());
        }
        return view;
    }
}
