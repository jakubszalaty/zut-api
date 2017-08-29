package pl.edu.zut.mobile;

import android.app.ProgressDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.p014a.C0399b;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p000a.C0004b;
import p000a.C0007e;
import p022b.C0633c;
import pl.edu.zut.mobile.C0660a.C0644c;

public class ClassRoutineActivity extends C0399b implements C0644c {
    private List<C0633c> f1960A;
    private C0004b f1961B;
    private ProgressDialog f1962C;
    private List<String> f1963D;
    private int f1964m;
    private int f1965n;
    private int f1966o;
    private boolean f1967p;
    private boolean f1968q;
    private boolean f1969r;
    private String[] f1970s;
    private C0660a f1971t;
    private String f1972u;
    private String f1973v;
    private String f1974w;
    private final int f1975x;
    private final int f1976y;
    private List<C0633c> f1977z;

    /* renamed from: pl.edu.zut.mobile.ClassRoutineActivity.1 */
    class C06451 implements OnItemSelectedListener {
        final /* synthetic */ ClassRoutineActivity f1958a;

        C06451(ClassRoutineActivity classRoutineActivity) {
            this.f1958a = classRoutineActivity;
        }

        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            String replace;
            this.f1958a.f1964m = i;
            this.f1958a.f1962C.show();
            String str = "01011999";
            try {
                replace = ((String) this.f1958a.f1963D.get(this.f1958a.f1964m)).split(" ")[1].replace("-", "").replace(".", "");
            } catch (Exception e) {
                replace = str;
            }
            this.f1958a.f1971t.m3355d(this.f1958a.f1973v, this.f1958a.f1972u, replace, 1001);
        }

        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* renamed from: pl.edu.zut.mobile.ClassRoutineActivity.2 */
    class C06462 implements OnItemClickListener {
        final /* synthetic */ ClassRoutineActivity f1959a;

        C06462(ClassRoutineActivity classRoutineActivity) {
            this.f1959a = classRoutineActivity;
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            this.f1959a.m3237b(i);
        }
    }

    public ClassRoutineActivity() {
        this.f1975x = 1000;
        this.f1976y = 1001;
        this.f1963D = Arrays.asList(new String[]{" "});
    }

    private Date m3226a(Date date, int i) {
        Calendar instance = Calendar.getInstance();
        instance.setTime(date);
        instance.add(5, i);
        return instance.getTime();
    }

    private String m3228b(Date date, int i) {
        String[] strArr = new String[]{getString(2131099713), getString(2131099711), getString(2131099715), getString(2131099716), getString(2131099714), getString(2131099710), getString(2131099712)};
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTime(date);
        gregorianCalendar.add(5, i);
        return strArr[gregorianCalendar.get(7) - 1];
    }

    public void m3233a(Bitmap bitmap, int i) {
    }

    void m3234a(String str) {
        Toast.makeText(this, str, 0).show();
    }

    public void m3235a(String str, int i) {
        Object obj;
        try {
            if (this.f1962C.isShowing()) {
                this.f1962C.dismiss();
            }
        } catch (Exception e) {
        }
        int i2 = getResources().getConfiguration().orientation;
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (str != null) {
                if (str.contains("logInStatus") && jSONObject.get("logInStatus").equals("TOKEN OR ID ERROR")) {
                    m3234a(getString(2131099860));
                    startActivity(new Intent(this, LoginActivity.class));
                }
            }
            this.f1977z.clear();
            this.f1960A.clear();
            if (str != null) {
                if (str.contains("Plan")) {
                    String optString;
                    String optString2;
                    String optString3;
                    String optString4;
                    String optString5;
                    String optString6;
                    String optString7;
                    if (jSONObject.get("Plan") instanceof JSONArray) {
                        JSONArray jSONArray = jSONObject.getJSONArray("Plan");
                        String optString8;
                        String optString9;
                        if (i2 == 1) {
                            this.f1977z.add(new C0633c(getString(2131099840), getString(2131099842), getString(2131099821), getString(2131099786)));
                            this.f1960A.add(new C0633c("0", "0", "0", "0"));
                            for (i2 = 0; i2 < jSONArray.length(); i2++) {
                                JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                                optString8 = !m3240j().equals("PL") ? jSONObject2.optString("przedmiotO") : jSONObject2.optString("przedmiot");
                                optString = jSONObject2.optString("prowadzacy");
                                optString9 = jSONObject2.optString("sala");
                                optString2 = jSONObject2.optString("godz");
                                if (optString2 != null) {
                                    optString2 = optString2.replace("-", "\n");
                                }
                                optString3 = jSONObject2.optString("gpracownikId");
                                optString4 = jSONObject2.optString("dydaktykId");
                                optString5 = jSONObject2.optString("zastepstwoId");
                                optString6 = jSONObject2.optString("zajeciaElemId");
                                if (!(jSONObject2.optString("zastepstwoId") == null || jSONObject2.optString("zastepstwoId").equals("0"))) {
                                    optString = jSONObject2.optString("zastepstwo");
                                }
                                this.f1977z.add(new C0633c(optString8, optString, optString9, optString2));
                                this.f1960A.add(new C0633c(optString3, optString4, optString6, optString5));
                            }
                        } else {
                            this.f1977z.add(new C0633c(getString(2131099840), getString(2131099842), getString(2131099783), getString(2131099821), getString(2131099785)));
                            this.f1960A.add(new C0633c(getString(2131099840), getString(2131099842), getString(2131099783), getString(2131099821), getString(2131099785)));
                            for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                                jSONObject = jSONArray.getJSONObject(i3);
                                optString2 = jSONObject.optString("przedmiot");
                                if (!m3240j().equals("PL")) {
                                    optString2 = jSONObject.optString("przedmiotO");
                                }
                                optString8 = jSONObject.optString("prowadzacy");
                                String optString10 = jSONObject.optString("formaZajec");
                                if (!m3240j().equals("PL")) {
                                    optString10 = jSONObject.optString("formaZajecO");
                                }
                                String optString11 = jSONObject.optString("sala");
                                optString9 = jSONObject.optString("godz");
                                optString4 = jSONObject.optString("gpracownikId");
                                optString5 = jSONObject.optString("dydaktykId");
                                optString6 = jSONObject.optString("zastepstwoId");
                                optString7 = jSONObject.optString("zajeciaElemId");
                                if (!(jSONObject.optString("zastepstwoId") == null || jSONObject.optString("zastepstwoId").equals("0"))) {
                                    optString8 = jSONObject.optString("zastepstwo");
                                }
                                this.f1977z.add(new C0633c(optString2, optString8, optString10, optString11, optString9));
                                this.f1960A.add(new C0633c(optString4, optString5, optString7, optString6, "0"));
                            }
                        }
                    } else {
                        jSONObject = (JSONObject) jSONObject.get("Plan");
                        optString5 = !m3240j().equals("PL") ? jSONObject.optString("przedmiotO") : jSONObject.optString("przedmiot");
                        optString2 = jSONObject.optString("prowadzacy");
                        optString4 = !m3240j().equals("PL") ? jSONObject.optString("formaZajecO") : jSONObject.optString("formaZajec");
                        optString6 = jSONObject.optString("sala");
                        optString3 = jSONObject.optString("godz");
                        optString7 = jSONObject.optString("gpracownikId");
                        String optString12 = jSONObject.optString("dydaktykId");
                        String optString13 = jSONObject.optString("zastepstwoId");
                        String optString14 = jSONObject.optString("zajeciaElemId");
                        String optString15 = (jSONObject.optString("zastepstwoId") == null || jSONObject.optString("zastepstwoId").equals("0")) ? optString2 : jSONObject.optString("zastepstwo");
                        if (i2 == 1) {
                            optString = optString3 != null ? optString3.replace("-", "\n") : optString3;
                            this.f1977z.add(new C0633c(getString(2131099840), getString(2131099842), getString(2131099821), getString(2131099786)));
                            this.f1960A.add(new C0633c("0", "0", "0", "0"));
                            this.f1977z.add(new C0633c(optString5, optString15, optString6, optString));
                            this.f1960A.add(new C0633c(optString7, optString12, optString14, optString13));
                        } else {
                            this.f1977z.add(new C0633c(getString(2131099840), getString(2131099842), getString(2131099783), getString(2131099821), getString(2131099785)));
                            this.f1960A.add(new C0633c("0", "0", "0", "0", "0"));
                            this.f1977z.add(new C0633c(optString5, optString15, optString4, optString6, optString3));
                            this.f1960A.add(new C0633c(optString7, optString12, optString14, optString13, "0"));
                        }
                    }
                    if (this.f1967p) {
                        m3236a(getString(2131099727), "HCR");
                    } else if (this.f1968q && this.f1969r) {
                        m3236a(getString(2131099725), "HCL");
                    }
                    this.f1961B.notifyDataSetChanged();
                    obj = null;
                    if (obj != null) {
                        m3234a(getString(2131099676));
                    }
                }
            }
            m3234a(getString(2131099672));
            this.f1961B.notifyDataSetChanged();
            obj = null;
        } catch (JSONException e2) {
            obj = 1;
        }
        if (obj != null) {
            m3234a(getString(2131099676));
        }
    }

    void m3236a(String str, String str2) {
        Toast.makeText(this, str, 1).show();
        Editor edit = getApplicationContext().getSharedPreferences("mZut", 0).edit();
        edit.putBoolean(str2, false);
        edit.apply();
    }

    public void m3237b(int i) {
        String b = ((C0633c) this.f1960A.get(i)).m3176b();
        String d = ((C0633c) this.f1960A.get(i)).m3178d();
        if ((b != null && b.equals(this.f1974w)) || (d != null && d.equals(this.f1974w))) {
            Intent intent = new Intent(this, AttendanceActivity.class);
            intent.putExtra("gpracownikId", ((C0633c) this.f1960A.get(i)).m3175a());
            intent.putExtra("dydaktykId", ((C0633c) this.f1960A.get(i)).m3176b());
            intent.putExtra("zajeciaElemId", ((C0633c) this.f1960A.get(i)).m3177c());
            intent.putExtra("zastepstwoId", ((C0633c) this.f1960A.get(i)).m3178d());
            startActivity(intent);
        }
    }

    public void m3238b(String str, int i) {
        try {
            if (this.f1962C.isShowing()) {
                this.f1962C.dismiss();
            }
        } catch (Exception e) {
        }
        String string = i == 1000 ? getString(2131099678) : i == 1001 ? getString(2131099678) : getString(2131099678);
        m3234a(string);
    }

    public void backHomeActivity(View view) {
        super.onBackPressed();
    }

    public void datePickerButtonAction(View view) {
        Calendar instance = Calendar.getInstance();
        instance.get(5);
        instance.get(2);
        instance.get(1);
    }

    public void m3239i() {
        this.f1970s = new String[]{"Stycze\u0144", "Luty", "Marzec", "Kwiecie\u0144", "Maj", "Czerwiec", "Lipiec", "Sierpie\u0144", "Wrzesie\u0144", "Pa\u017adziernik", "Listopad", "Grudzie\u0144"};
        this.f1964m = -1;
        this.f1965n = -1;
        this.f1966o = -1;
        ((TextView) findViewById(2131427476)).setText(2131099917);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy");
        Date date = new Date();
        this.f1963D = Arrays.asList(new String[]{m3228b(date, 0) + " " + simpleDateFormat.format(m3226a(date, 0)), m3228b(date, 1) + " " + simpleDateFormat.format(m3226a(date, 1)), m3228b(date, 2) + " " + simpleDateFormat.format(m3226a(date, 2)), m3228b(date, 3) + " " + simpleDateFormat.format(m3226a(date, 3)), m3228b(date, 4) + " " + simpleDateFormat.format(m3226a(date, 4)), m3228b(date, 5) + " " + simpleDateFormat.format(m3226a(date, 5)), m3228b(date, 6) + " " + simpleDateFormat.format(m3226a(date, 6))});
        this.f1964m = -1;
        this.f1971t = new C0660a(this);
        SharedPreferences sharedPreferences = getApplicationContext().getSharedPreferences("mZut", 0);
        this.f1972u = sharedPreferences.getString("AUTHKEY", null);
        this.f1973v = sharedPreferences.getString("USERID", null);
        this.f1967p = sharedPreferences.getBoolean("HCR", true);
        this.f1968q = sharedPreferences.getBoolean("HCL", true);
        this.f1974w = sharedPreferences.getString("DYDAKTYKID", null);
        this.f1969r = sharedPreferences.getBoolean("DYDAKTYK", false);
        Spinner spinner = (Spinner) findViewById(2131427423);
        spinner.setAdapter(new C0007e(this, this.f1963D));
        spinner.setOnItemSelectedListener(new C06451(this));
        this.f1977z = new ArrayList();
        this.f1960A = new ArrayList();
        this.f1961B = new C0004b(this, this.f1977z);
        ListView listView = (ListView) findViewById(2131427424);
        listView.setAdapter(this.f1961B);
        listView.setOnItemClickListener(new C06462(this));
        this.f1962C = new ProgressDialog(this);
        this.f1962C.setMessage(getString(2131099679));
    }

    public String m3240j() {
        return getResources().getConfiguration().locale.toString().equals("pl_PL") ? "PL" : "";
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2130968604);
        m3239i();
    }

    public void viewButtonAction(View view) {
        this.f1977z.clear();
        this.f1960A.clear();
        if (this.f1964m != -1 && this.f1965n != -1 && this.f1966o != -1) {
            this.f1962C.show();
            this.f1971t.m3355d(this.f1973v, this.f1972u, "0", 1001);
        }
    }
}
