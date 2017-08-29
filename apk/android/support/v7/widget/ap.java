package android.support.v7.widget;

import android.app.SearchManager;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Bundle;
import android.support.v4.p005b.C0035a;
import android.support.v4.widget.C0386u;
import android.support.v7.p015b.C0475a.C0465a;
import android.support.v7.p015b.C0475a.C0470f;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;

class ap extends C0386u implements OnClickListener {
    private final SearchManager f1656j;
    private final SearchView f1657k;
    private final SearchableInfo f1658l;
    private final Context f1659m;
    private final WeakHashMap<String, ConstantState> f1660n;
    private final int f1661o;
    private boolean f1662p;
    private int f1663q;
    private ColorStateList f1664r;
    private int f1665s;
    private int f1666t;
    private int f1667u;
    private int f1668v;
    private int f1669w;
    private int f1670x;

    /* renamed from: android.support.v7.widget.ap.a */
    private static final class C0580a {
        public final TextView f1651a;
        public final TextView f1652b;
        public final ImageView f1653c;
        public final ImageView f1654d;
        public final ImageView f1655e;

        public C0580a(View view) {
            this.f1651a = (TextView) view.findViewById(16908308);
            this.f1652b = (TextView) view.findViewById(16908309);
            this.f1653c = (ImageView) view.findViewById(16908295);
            this.f1654d = (ImageView) view.findViewById(16908296);
            this.f1655e = (ImageView) view.findViewById(C0470f.edit_query);
        }
    }

    public ap(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, ConstantState> weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), null, true);
        this.f1662p = false;
        this.f1663q = 1;
        this.f1665s = -1;
        this.f1666t = -1;
        this.f1667u = -1;
        this.f1668v = -1;
        this.f1669w = -1;
        this.f1670x = -1;
        this.f1656j = (SearchManager) this.d.getSystemService("search");
        this.f1657k = searchView;
        this.f1658l = searchableInfo;
        this.f1661o = searchView.getSuggestionCommitIconResId();
        this.f1659m = context;
        this.f1660n = weakHashMap;
    }

    private Drawable m2912a(ComponentName componentName) {
        Object obj = null;
        String flattenToShortString = componentName.flattenToShortString();
        if (this.f1660n.containsKey(flattenToShortString)) {
            ConstantState constantState = (ConstantState) this.f1660n.get(flattenToShortString);
            return constantState == null ? null : constantState.newDrawable(this.f1659m.getResources());
        } else {
            Drawable b = m2919b(componentName);
            if (b != null) {
                obj = b.getConstantState();
            }
            this.f1660n.put(flattenToShortString, obj);
            return b;
        }
    }

    private Drawable m2913a(String str) {
        if (str == null || str.length() == 0 || "0".equals(str)) {
            return null;
        }
        Drawable b;
        try {
            int parseInt = Integer.parseInt(str);
            String str2 = "android.resource://" + this.f1659m.getPackageName() + "/" + parseInt;
            b = m2921b(str2);
            if (b != null) {
                return b;
            }
            b = C0035a.m73a(this.f1659m, parseInt);
            m2918a(str2, b);
            return b;
        } catch (NumberFormatException e) {
            b = m2921b(str);
            if (b != null) {
                return b;
            }
            b = m2920b(Uri.parse(str));
            m2918a(str, b);
            return b;
        } catch (NotFoundException e2) {
            Log.w("SuggestionsAdapter", "Icon resource not found: " + str);
            return null;
        }
    }

    private static String m2914a(Cursor cursor, int i) {
        String str = null;
        if (i != -1) {
            try {
                str = cursor.getString(i);
            } catch (Throwable e) {
                Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e);
            }
        }
        return str;
    }

    public static String m2915a(Cursor cursor, String str) {
        return m2914a(cursor, cursor.getColumnIndex(str));
    }

    private void m2916a(ImageView imageView, Drawable drawable, int i) {
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            imageView.setVisibility(i);
            return;
        }
        imageView.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    private void m2917a(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
    }

    private void m2918a(String str, Drawable drawable) {
        if (drawable != null) {
            this.f1660n.put(str, drawable.getConstantState());
        }
    }

    private Drawable m2919b(ComponentName componentName) {
        PackageManager packageManager = this.d.getPackageManager();
        try {
            ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, 128);
            int iconResource = activityInfo.getIconResource();
            if (iconResource == 0) {
                return null;
            }
            Drawable drawable = packageManager.getDrawable(componentName.getPackageName(), iconResource, activityInfo.applicationInfo);
            if (drawable != null) {
                return drawable;
            }
            Log.w("SuggestionsAdapter", "Invalid icon resource " + iconResource + " for " + componentName.flattenToShortString());
            return null;
        } catch (NameNotFoundException e) {
            Log.w("SuggestionsAdapter", e.toString());
            return null;
        }
    }

    private Drawable m2920b(Uri uri) {
        InputStream openInputStream;
        try {
            if ("android.resource".equals(uri.getScheme())) {
                return m2929a(uri);
            }
            openInputStream = this.f1659m.getContentResolver().openInputStream(uri);
            if (openInputStream == null) {
                throw new FileNotFoundException("Failed to open " + uri);
            }
            Drawable createFromStream = Drawable.createFromStream(openInputStream, null);
            try {
                openInputStream.close();
                return createFromStream;
            } catch (Throwable e) {
                Log.e("SuggestionsAdapter", "Error closing icon stream for " + uri, e);
                return createFromStream;
            }
        } catch (NotFoundException e2) {
            throw new FileNotFoundException("Resource does not exist: " + uri);
        } catch (FileNotFoundException e3) {
            Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + e3.getMessage());
            return null;
        } catch (Throwable th) {
            try {
                openInputStream.close();
            } catch (Throwable e4) {
                Log.e("SuggestionsAdapter", "Error closing icon stream for " + uri, e4);
            }
        }
    }

    private Drawable m2921b(String str) {
        ConstantState constantState = (ConstantState) this.f1660n.get(str);
        return constantState == null ? null : constantState.newDrawable();
    }

    private CharSequence m2922b(CharSequence charSequence) {
        if (this.f1664r == null) {
            TypedValue typedValue = new TypedValue();
            this.d.getTheme().resolveAttribute(C0465a.textColorSearchUrl, typedValue, true);
            this.f1664r = this.d.getResources().getColorStateList(typedValue.resourceId);
        }
        CharSequence spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.f1664r, null), 0, charSequence.length(), 33);
        return spannableString;
    }

    private void m2923d(Cursor cursor) {
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null && !extras.getBoolean("in_progress")) {
        }
    }

    private Drawable m2924e(Cursor cursor) {
        if (this.f1668v == -1) {
            return null;
        }
        Drawable a = m2913a(cursor.getString(this.f1668v));
        return a == null ? m2926g(cursor) : a;
    }

    private Drawable m2925f(Cursor cursor) {
        return this.f1669w == -1 ? null : m2913a(cursor.getString(this.f1669w));
    }

    private Drawable m2926g(Cursor cursor) {
        Drawable a = m2912a(this.f1658l.getSearchActivity());
        return a != null ? a : this.d.getPackageManager().getDefaultActivityIcon();
    }

    Cursor m2927a(SearchableInfo searchableInfo, String str, int i) {
        if (searchableInfo == null) {
            return null;
        }
        String suggestAuthority = searchableInfo.getSuggestAuthority();
        if (suggestAuthority == null) {
            return null;
        }
        String[] strArr;
        Builder fragment = new Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
            strArr = null;
        }
        if (i > 0) {
            fragment.appendQueryParameter("limit", String.valueOf(i));
        }
        return this.d.getContentResolver().query(fragment.build(), null, suggestSelection, strArr, null);
    }

    public Cursor m2928a(CharSequence charSequence) {
        String charSequence2 = charSequence == null ? "" : charSequence.toString();
        if (this.f1657k.getVisibility() != 0 || this.f1657k.getWindowVisibility() != 0) {
            return null;
        }
        try {
            Cursor a = m2927a(this.f1658l, charSequence2, 50);
            if (a != null) {
                a.getCount();
                return a;
            }
        } catch (Throwable e) {
            Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", e);
        }
        return null;
    }

    Drawable m2929a(Uri uri) {
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new FileNotFoundException("No authority: " + uri);
        }
        try {
            Resources resourcesForApplication = this.d.getPackageManager().getResourcesForApplication(authority);
            List pathSegments = uri.getPathSegments();
            if (pathSegments == null) {
                throw new FileNotFoundException("No path: " + uri);
            }
            int size = pathSegments.size();
            if (size == 1) {
                try {
                    size = Integer.parseInt((String) pathSegments.get(0));
                } catch (NumberFormatException e) {
                    throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                }
            } else if (size == 2) {
                size = resourcesForApplication.getIdentifier((String) pathSegments.get(1), (String) pathSegments.get(0), authority);
            } else {
                throw new FileNotFoundException("More than two path segments: " + uri);
            }
            if (size != 0) {
                return resourcesForApplication.getDrawable(size);
            }
            throw new FileNotFoundException("No resource found for: " + uri);
        } catch (NameNotFoundException e2) {
            throw new FileNotFoundException("No package found for authority: " + uri);
        }
    }

    public View m2930a(Context context, Cursor cursor, ViewGroup viewGroup) {
        View a = super.m1820a(context, cursor, viewGroup);
        a.setTag(new C0580a(a));
        ((ImageView) a.findViewById(C0470f.edit_query)).setImageResource(this.f1661o);
        return a;
    }

    public void m2931a(int i) {
        this.f1663q = i;
    }

    public void m2932a(Cursor cursor) {
        if (this.f1662p) {
            Log.w("SuggestionsAdapter", "Tried to change cursor after adapter was closed.");
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        try {
            super.m1750a(cursor);
            if (cursor != null) {
                this.f1665s = cursor.getColumnIndex("suggest_text_1");
                this.f1666t = cursor.getColumnIndex("suggest_text_2");
                this.f1667u = cursor.getColumnIndex("suggest_text_2_url");
                this.f1668v = cursor.getColumnIndex("suggest_icon_1");
                this.f1669w = cursor.getColumnIndex("suggest_icon_2");
                this.f1670x = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Throwable e) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e);
        }
    }

    public void m2933a(View view, Context context, Cursor cursor) {
        C0580a c0580a = (C0580a) view.getTag();
        int i = this.f1670x != -1 ? cursor.getInt(this.f1670x) : 0;
        if (c0580a.f1651a != null) {
            m2917a(c0580a.f1651a, m2914a(cursor, this.f1665s));
        }
        if (c0580a.f1652b != null) {
            CharSequence a = m2914a(cursor, this.f1667u);
            a = a != null ? m2922b(a) : m2914a(cursor, this.f1666t);
            if (TextUtils.isEmpty(a)) {
                if (c0580a.f1651a != null) {
                    c0580a.f1651a.setSingleLine(false);
                    c0580a.f1651a.setMaxLines(2);
                }
            } else if (c0580a.f1651a != null) {
                c0580a.f1651a.setSingleLine(true);
                c0580a.f1651a.setMaxLines(1);
            }
            m2917a(c0580a.f1652b, a);
        }
        if (c0580a.f1653c != null) {
            m2916a(c0580a.f1653c, m2924e(cursor), 4);
        }
        if (c0580a.f1654d != null) {
            m2916a(c0580a.f1654d, m2925f(cursor), 8);
        }
        if (this.f1663q == 2 || (this.f1663q == 1 && (i & 1) != 0)) {
            c0580a.f1655e.setVisibility(0);
            c0580a.f1655e.setTag(c0580a.f1651a.getText());
            c0580a.f1655e.setOnClickListener(this);
            return;
        }
        c0580a.f1655e.setVisibility(8);
    }

    public CharSequence m2934c(Cursor cursor) {
        if (cursor == null) {
            return null;
        }
        String a = m2915a(cursor, "suggest_intent_query");
        if (a != null) {
            return a;
        }
        if (this.f1658l.shouldRewriteQueryFromData()) {
            a = m2915a(cursor, "suggest_intent_data");
            if (a != null) {
                return a;
            }
        }
        if (!this.f1658l.shouldRewriteQueryFromText()) {
            return null;
        }
        a = m2915a(cursor, "suggest_text_1");
        return a != null ? a : null;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i, view, viewGroup);
        } catch (Throwable e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View a = m2930a(this.d, this.c, viewGroup);
            if (a != null) {
                ((C0580a) a.getTag()).f1651a.setText(e.toString());
            }
            return a;
        }
    }

    public boolean hasStableIds() {
        return false;
    }

    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        m2923d(m1746a());
    }

    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        m2923d(m1746a());
    }

    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f1657k.m2736a((CharSequence) tag);
        }
    }
}
