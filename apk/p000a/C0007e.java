package p000a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.List;

/* renamed from: a.e */
public class C0007e extends BaseAdapter {
    private Context f20a;
    private List<String> f21b;

    public C0007e(Context context, List<String> list) {
        this.f20a = context;
        this.f21b = list;
    }

    public int getCount() {
        return this.f21b.size();
    }

    public Object getItem(int i) {
        return this.f21b.get(i);
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = ((LayoutInflater) this.f20a.getSystemService("layout_inflater")).inflate(2130968637, viewGroup, false);
        }
        ((TextView) view.findViewById(2131427503)).setText(((String) this.f21b.get(i)).toUpperCase());
        return view;
    }
}
