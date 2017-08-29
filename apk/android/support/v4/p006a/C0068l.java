package android.support.v4.p006a;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Parcelable;
import android.support.v4.p012f.C0160h;
import android.support.v4.p012f.C0172i;
import android.support.v7.p015b.C0475a.C0474j;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: android.support.v4.a.l */
public class C0068l extends C0059j {
    final Handler f270c;
    final C0069n f271d;
    boolean f272e;
    boolean f273f;
    boolean f274g;
    boolean f275h;
    boolean f276i;
    boolean f277j;
    int f278k;
    C0172i<String> f279l;

    /* renamed from: android.support.v4.a.l.1 */
    class C00641 extends Handler {
        final /* synthetic */ C0068l f255a;

        C00641(C0068l c0068l) {
            this.f255a = c0068l;
        }

        public void handleMessage(Message message) {
            switch (message.what) {
                case C0474j.View_android_focusable /*1*/:
                    if (this.f255a.f274g) {
                        this.f255a.m251a(false);
                    }
                case C0474j.View_paddingStart /*2*/:
                    this.f255a.a_();
                    this.f255a.f271d.m285n();
                default:
                    super.handleMessage(message);
            }
        }
    }

    /* renamed from: android.support.v4.a.l.a */
    class C0066a extends C0065o<C0068l> {
        final /* synthetic */ C0068l f266a;

        public C0066a(C0068l c0068l) {
            this.f266a = c0068l;
            super(c0068l);
        }

        public View m238a(int i) {
            return this.f266a.findViewById(i);
        }

        public void m239a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            this.f266a.dump(str, fileDescriptor, printWriter, strArr);
        }

        public boolean m240a() {
            Window window = this.f266a.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        public boolean m241a(C0063k c0063k) {
            return !this.f266a.isFinishing();
        }

        public LayoutInflater m242b() {
            return this.f266a.getLayoutInflater().cloneInContext(this.f266a);
        }

        public void m243b(C0063k c0063k) {
            this.f266a.m250a(c0063k);
        }

        public void m244c() {
            this.f266a.m254c();
        }

        public boolean m245d() {
            return this.f266a.getWindow() != null;
        }

        public int m246e() {
            Window window = this.f266a.getWindow();
            return window == null ? 0 : window.getAttributes().windowAnimations;
        }
    }

    /* renamed from: android.support.v4.a.l.b */
    static final class C0067b {
        Object f267a;
        C0079r f268b;
        C0160h<String, C0091w> f269c;

        C0067b() {
        }
    }

    public C0068l() {
        this.f270c = new C00641(this);
        this.f271d = C0069n.m256a(new C0066a(this));
    }

    private static String m247a(View view) {
        char c = 'F';
        char c2 = '.';
        StringBuilder stringBuilder = new StringBuilder(128);
        stringBuilder.append(view.getClass().getName());
        stringBuilder.append('{');
        stringBuilder.append(Integer.toHexString(System.identityHashCode(view)));
        stringBuilder.append(' ');
        switch (view.getVisibility()) {
            case C0474j.View_android_theme /*0*/:
                stringBuilder.append('V');
                break;
            case C0474j.View_theme /*4*/:
                stringBuilder.append('I');
                break;
            case C0474j.Toolbar_contentInsetRight /*8*/:
                stringBuilder.append('G');
                break;
            default:
                stringBuilder.append('.');
                break;
        }
        stringBuilder.append(view.isFocusable() ? 'F' : '.');
        stringBuilder.append(view.isEnabled() ? 'E' : '.');
        stringBuilder.append(view.willNotDraw() ? '.' : 'D');
        stringBuilder.append(view.isHorizontalScrollBarEnabled() ? 'H' : '.');
        stringBuilder.append(view.isVerticalScrollBarEnabled() ? 'V' : '.');
        stringBuilder.append(view.isClickable() ? 'C' : '.');
        stringBuilder.append(view.isLongClickable() ? 'L' : '.');
        stringBuilder.append(' ');
        if (!view.isFocused()) {
            c = '.';
        }
        stringBuilder.append(c);
        stringBuilder.append(view.isSelected() ? 'S' : '.');
        if (view.isPressed()) {
            c2 = 'P';
        }
        stringBuilder.append(c2);
        stringBuilder.append(' ');
        stringBuilder.append(view.getLeft());
        stringBuilder.append(',');
        stringBuilder.append(view.getTop());
        stringBuilder.append('-');
        stringBuilder.append(view.getRight());
        stringBuilder.append(',');
        stringBuilder.append(view.getBottom());
        int id = view.getId();
        if (id != -1) {
            stringBuilder.append(" #");
            stringBuilder.append(Integer.toHexString(id));
            Resources resources = view.getResources();
            if (!(id == 0 || resources == null)) {
                String str;
                switch (-16777216 & id) {
                    case 16777216:
                        str = "android";
                        break;
                    case 2130706432:
                        str = "app";
                        break;
                    default:
                        try {
                            str = resources.getResourcePackageName(id);
                            break;
                        } catch (NotFoundException e) {
                            break;
                        }
                }
                String resourceTypeName = resources.getResourceTypeName(id);
                String resourceEntryName = resources.getResourceEntryName(id);
                stringBuilder.append(" ");
                stringBuilder.append(str);
                stringBuilder.append(":");
                stringBuilder.append(resourceTypeName);
                stringBuilder.append("/");
                stringBuilder.append(resourceEntryName);
            }
        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    private void m248a(String str, PrintWriter printWriter, View view) {
        printWriter.print(str);
        if (view == null) {
            printWriter.println("null");
            return;
        }
        printWriter.println(C0068l.m247a(view));
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            if (childCount > 0) {
                String str2 = str + "  ";
                for (int i = 0; i < childCount; i++) {
                    m248a(str2, printWriter, viewGroup.getChildAt(i));
                }
            }
        }
    }

    final View m249a(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f271d.m259a(view, str, context, attributeSet);
    }

    public void m250a(C0063k c0063k) {
    }

    void m251a(boolean z) {
        if (!this.f275h) {
            this.f275h = true;
            this.f276i = z;
            this.f270c.removeMessages(1);
            m255d();
        } else if (z) {
            this.f271d.m286o();
            this.f271d.m274c(true);
        }
    }

    protected boolean m252a(View view, Menu menu) {
        return super.onPreparePanel(0, view, menu);
    }

    protected void a_() {
        this.f271d.m279h();
    }

    public Object m253b() {
        return null;
    }

    public void m254c() {
        if (VERSION.SDK_INT >= 11) {
            C0041b.m88a(this);
        } else {
            this.f277j = true;
        }
    }

    void m255d() {
        this.f271d.m274c(this.f276i);
        this.f271d.m282k();
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2;
        if (VERSION.SDK_INT >= 11) {
            printWriter.print(str);
            printWriter.print("Local FragmentActivity ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(" State:");
            str2 = str + "  ";
            printWriter.print(str2);
            printWriter.print("mCreated=");
            printWriter.print(this.f272e);
            printWriter.print("mResumed=");
            printWriter.print(this.f273f);
            printWriter.print(" mStopped=");
            printWriter.print(this.f274g);
            printWriter.print(" mReallyStopped=");
            printWriter.println(this.f275h);
            this.f271d.m264a(str2, fileDescriptor, printWriter, strArr);
            this.f271d.m258a().m291a(str, fileDescriptor, printWriter, strArr);
            printWriter.print(str);
            printWriter.println("View Hierarchy:");
            m248a(str + "  ", printWriter, getWindow().getDecorView());
        } else {
            printWriter.print(str);
            printWriter.print("Local FragmentActivity ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(" State:");
            str2 = str + "  ";
            printWriter.print(str2);
            printWriter.print("mCreated=");
            printWriter.print(this.f272e);
            printWriter.print("mResumed=");
            printWriter.print(this.f273f);
            printWriter.print(" mStopped=");
            printWriter.print(this.f274g);
            printWriter.print(" mReallyStopped=");
            printWriter.println(this.f275h);
            this.f271d.m264a(str2, fileDescriptor, printWriter, strArr);
            this.f271d.m258a().m291a(str, fileDescriptor, printWriter, strArr);
            printWriter.print(str);
            printWriter.println("View Hierarchy:");
            m248a(str + "  ", printWriter, getWindow().getDecorView());
        }
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        this.f271d.m269b();
        int i3 = i >> 16;
        if (i3 != 0) {
            int i4 = i3 - 1;
            String str = (String) this.f279l.m673a(i4);
            this.f279l.m679c(i4);
            if (str == null) {
                Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
                return;
            }
            C0063k a = this.f271d.m257a(str);
            if (a == null) {
                Log.w("FragmentActivity", "Activity result no fragment exists for who: " + str);
                return;
            } else {
                a.m152a(65535 & i, i2, intent);
                return;
            }
        }
        super.onActivityResult(i, i2, intent);
    }

    public void onBackPressed() {
        if (!this.f271d.m258a().m292a()) {
            super.onBackPressed();
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f271d.m260a(configuration);
    }

    protected void onCreate(Bundle bundle) {
        this.f271d.m262a(null);
        super.onCreate(bundle);
        C0067b c0067b = (C0067b) getLastNonConfigurationInstance();
        if (c0067b != null) {
            this.f271d.m263a(c0067b.f269c);
        }
        if (bundle != null) {
            this.f271d.m261a(bundle.getParcelable("android:support:fragments"), c0067b != null ? c0067b.f268b : null);
            if (bundle.containsKey("android:support:next_request_index")) {
                this.f278k = bundle.getInt("android:support:next_request_index");
                int[] intArray = bundle.getIntArray("android:support:request_indicies");
                String[] stringArray = bundle.getStringArray("android:support:request_fragment_who");
                if (intArray == null || stringArray == null || intArray.length != stringArray.length) {
                    Log.w("FragmentActivity", "Invalid requestCode mapping in savedInstanceState.");
                } else {
                    this.f279l = new C0172i(intArray.length);
                    for (int i = 0; i < intArray.length; i++) {
                        this.f279l.m677b(intArray[i], stringArray[i]);
                    }
                }
            }
        }
        if (this.f279l == null) {
            this.f279l = new C0172i();
            this.f278k = 0;
        }
        this.f271d.m276e();
    }

    public boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0) {
            return super.onCreatePanelMenu(i, menu);
        }
        return VERSION.SDK_INT >= 11 ? super.onCreatePanelMenu(i, menu) | this.f271d.m267a(menu, getMenuInflater()) : true;
    }

    public /* bridge */ /* synthetic */ View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return super.onCreateView(view, str, context, attributeSet);
    }

    public /* bridge */ /* synthetic */ View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return super.onCreateView(str, context, attributeSet);
    }

    protected void onDestroy() {
        super.onDestroy();
        m251a(false);
        this.f271d.m283l();
        this.f271d.m287p();
    }

    public void onLowMemory() {
        super.onLowMemory();
        this.f271d.m284m();
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        switch (i) {
            case C0474j.View_android_theme /*0*/:
                return this.f271d.m268a(menuItem);
            case C0474j.Toolbar_contentInsetEnd /*6*/:
                return this.f271d.m272b(menuItem);
            default:
                return false;
        }
    }

    public void onMultiWindowModeChanged(boolean z) {
        this.f271d.m265a(z);
    }

    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.f271d.m269b();
    }

    public void onPanelClosed(int i, Menu menu) {
        switch (i) {
            case C0474j.View_android_theme /*0*/:
                this.f271d.m270b(menu);
                break;
        }
        super.onPanelClosed(i, menu);
    }

    protected void onPause() {
        super.onPause();
        this.f273f = false;
        if (this.f270c.hasMessages(2)) {
            this.f270c.removeMessages(2);
            a_();
        }
        this.f271d.m280i();
    }

    public void onPictureInPictureModeChanged(boolean z) {
        this.f271d.m271b(z);
    }

    protected void onPostResume() {
        super.onPostResume();
        this.f270c.removeMessages(2);
        a_();
        this.f271d.m285n();
    }

    public boolean onPreparePanel(int i, View view, Menu menu) {
        if (i != 0 || menu == null) {
            return super.onPreparePanel(i, view, menu);
        }
        if (this.f277j) {
            this.f277j = false;
            menu.clear();
            onCreatePanelMenu(i, menu);
        }
        return m252a(view, menu) | this.f271d.m266a(menu);
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        int i2 = (i >> 16) & 65535;
        if (i2 != 0) {
            int i3 = i2 - 1;
            String str = (String) this.f279l.m673a(i3);
            this.f279l.m679c(i3);
            if (str == null) {
                Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
                return;
            }
            C0063k a = this.f271d.m257a(str);
            if (a == null) {
                Log.w("FragmentActivity", "Activity result no fragment exists for who: " + str);
            } else {
                a.m154a(i & 65535, strArr, iArr);
            }
        }
    }

    protected void onResume() {
        super.onResume();
        this.f270c.sendEmptyMessage(2);
        this.f273f = true;
        this.f271d.m285n();
    }

    public final Object onRetainNonConfigurationInstance() {
        if (this.f274g) {
            m251a(true);
        }
        Object b = m253b();
        C0079r d = this.f271d.m275d();
        C0160h r = this.f271d.m289r();
        if (d == null && r == null && b == null) {
            return null;
        }
        C0067b c0067b = new C0067b();
        c0067b.f267a = b;
        c0067b.f268b = d;
        c0067b.f269c = r;
        return c0067b;
    }

    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Parcelable c = this.f271d.m273c();
        if (c != null) {
            bundle.putParcelable("android:support:fragments", c);
        }
        if (this.f279l.m675b() > 0) {
            bundle.putInt("android:support:next_request_index", this.f278k);
            int[] iArr = new int[this.f279l.m675b()];
            String[] strArr = new String[this.f279l.m675b()];
            for (int i = 0; i < this.f279l.m675b(); i++) {
                iArr[i] = this.f279l.m680d(i);
                strArr[i] = (String) this.f279l.m681e(i);
            }
            bundle.putIntArray("android:support:request_indicies", iArr);
            bundle.putStringArray("android:support:request_fragment_who", strArr);
        }
    }

    protected void onStart() {
        super.onStart();
        this.f274g = false;
        this.f275h = false;
        this.f270c.removeMessages(1);
        if (!this.f272e) {
            this.f272e = true;
            this.f271d.m277f();
        }
        this.f271d.m269b();
        this.f271d.m285n();
        this.f271d.m286o();
        this.f271d.m278g();
        this.f271d.m288q();
    }

    public void onStateNotSaved() {
        this.f271d.m269b();
    }

    protected void onStop() {
        super.onStop();
        this.f274g = true;
        this.f270c.sendEmptyMessage(1);
        this.f271d.m281j();
    }

    public void startActivityForResult(Intent intent, int i) {
        if (!(this.b || i == -1)) {
            C0057h.m132a(i);
        }
        super.startActivityForResult(intent, i);
    }

    public /* bridge */ /* synthetic */ void startActivityForResult(Intent intent, int i, Bundle bundle) {
        super.startActivityForResult(intent, i, bundle);
    }

    public /* bridge */ /* synthetic */ void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    public /* bridge */ /* synthetic */ void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }
}
