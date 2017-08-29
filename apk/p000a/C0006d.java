package p000a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.List;
import p022b.C0636f;

/* renamed from: a.d */
public class C0006d extends BaseAdapter {
    private List<C0636f> f18a;
    private Context f19b;

    public C0006d(Context context, List<C0636f> list) {
        this.f19b = context;
        this.f18a = list;
    }

    public int getCount() {
        return this.f18a.size();
    }

    public Object getItem(int i) {
        return this.f18a.get(i);
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = ((LayoutInflater) this.f19b.getSystemService("layout_inflater")).inflate(2130968624, viewGroup, false);
        }
        view.setBackgroundColor(0);
        ((TextView) view.findViewById(2131427485)).setText(((C0636f) this.f18a.get(i)).m3193a());
        ((TextView) view.findViewById(2131427486)).setText(((C0636f) this.f18a.get(i)).m3194b());
        return view;
    }
}
