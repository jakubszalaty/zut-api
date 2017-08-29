package pl.edu.zut.mobile;

import android.app.AlertDialog.Builder;
import android.app.ProgressDialog;
import android.content.Intent;
import android.content.SharedPreferences.Editor;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.p014a.C0399b;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import org.json.JSONException;
import org.json.JSONObject;
import pl.edu.zut.mobile.C0660a.C0644c;

public class LoginActivity extends C0399b implements C0644c {
    private final int f1998m;
    private C0660a f1999n;
    private ProgressDialog f2000o;

    public LoginActivity() {
        this.f1998m = 1001;
    }

    private String m3253a(String str, String str2) {
        String str3 = "d4Hb7BsxUDqaiBATQe7KuhvBQuh2T82j";
        try {
            Random random = new Random();
            StringBuffer stringBuffer = new StringBuffer(32);
            char[] cArr = new char[]{'2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'J', 'K', 'L', 'M', 'N', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
            char[] cArr2 = new char[]{'v', 'w', 'x', 'y', 'z', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'J', 'K', 'k', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'W', 'X', 'Y', 'Z', 'L', 'M', 'N', 'P', 'Q', 'R', 'S', 'T', 'U', 'V'};
            int length = cArr.length;
            for (int i = 0; i < 32; i++) {
                stringBuffer.append(cArr[random.nextInt(length)]);
            }
            String stringBuffer2 = stringBuffer.toString();
            if (str2 == null || str2.length() <= 0) {
                return stringBuffer2;
            }
            Calendar instance = Calendar.getInstance();
            instance.setTime(new Date());
            String str4 = str + str2;
            int[] iArr = new int[]{str4.length() - 1, str4.length() - 5, str4.length() - 8, instance.get(5), instance.get(7), instance.get(8)};
            if ((((((iArr[0] + iArr[1]) + iArr[2]) + iArr[3]) + iArr[4]) + iArr[5]) % 2 == 0) {
                iArr[0] = instance.get(5);
                iArr[1] = str4.length() + 3;
                iArr[2] = str4.length() + 9;
                iArr[3] = instance.get(7);
                iArr[4] = str4.length();
                iArr[5] = instance.get(8);
                cArr = cArr2;
            }
            String str5 = "";
            for (int i2 = 0; i2 < stringBuffer2.length(); i2++) {
                String substring = stringBuffer2.substring(i2, i2 + 1);
                StringBuffer stringBuffer3 = new StringBuffer(32);
                if (iArr[0] == i2 && iArr[0] < 32) {
                    stringBuffer3.append(cArr[iArr[0]]);
                    str5 = str5 + stringBuffer3.toString();
                } else if (iArr[1] == i2 && iArr[1] < 32) {
                    stringBuffer3.append(cArr[iArr[1]]);
                    str5 = str5 + stringBuffer3.toString();
                } else if (iArr[2] == i2 && iArr[2] < 32) {
                    stringBuffer3.append(cArr[iArr[2]]);
                    str5 = str5 + stringBuffer3.toString();
                } else if (iArr[3] == i2 && iArr[3] < 32) {
                    stringBuffer3.append(cArr[iArr[3]]);
                    str5 = str5 + stringBuffer3.toString();
                } else if (iArr[4] == i2 && iArr[4] < 32) {
                    stringBuffer3.append(cArr[iArr[4]]);
                    str5 = str5 + stringBuffer3.toString();
                } else if (iArr[5] != i2 || iArr[5] >= 32) {
                    str5 = str5 + substring;
                } else {
                    stringBuffer3.append(cArr[iArr[5]]);
                    str5 = str5 + stringBuffer3.toString();
                }
            }
            return str5;
        } catch (Exception e) {
            return "p4Hb7BwxUDqaiBATQe7KRhvBQuh2TY2j";
        }
    }

    public void m3254a(Bitmap bitmap, int i) {
    }

    public void m3255a(String str) {
        new Builder(this).setMessage(str).setPositiveButton("Ok", null).create().show();
    }

    public void m3256a(String str, int i) {
        try {
            if (this.f2000o.isShowing()) {
                this.f2000o.dismiss();
            }
        } catch (Exception e) {
        }
        if (str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.optString("logInStatus").equals("OK")) {
                    boolean optBoolean = jSONObject.optBoolean("student");
                    jSONObject.optBoolean("kandydat");
                    boolean optBoolean2 = jSONObject.optBoolean("doktorant");
                    boolean optBoolean3 = jSONObject.optBoolean("dydaktyk");
                    boolean optBoolean4 = jSONObject.optBoolean("pracownik");
                    jSONObject.optBoolean("absolwent");
                    String optString = jSONObject.optString("login");
                    String str2 = jSONObject.optString("pierwszeImie") + " " + jSONObject.optString("nazwisko");
                    String optString2 = jSONObject.optString("token");
                    String optString3 = jSONObject.optString("tokenJpg");
                    Editor edit = getApplicationContext().getSharedPreferences("mZut", 0).edit();
                    if (optBoolean) {
                        edit.putBoolean("STUDENT", true);
                    }
                    if (optBoolean2) {
                        edit.putBoolean("DOKTORANT", true);
                    }
                    if (optBoolean3) {
                        edit.putBoolean("DYDAKTYK", true);
                        edit.putString("DYDAKTYKID", jSONObject.optString("dydaktykId"));
                    }
                    if (optBoolean4) {
                        edit.putBoolean("PRACOWNIK", true);
                        edit.putString("PRACOWNIKID", jSONObject.optString("osobId"));
                    }
                    edit.putString("USERID", optString);
                    edit.putString("USERNAME", str2);
                    edit.putString("AUTHKEY", optString2);
                    edit.putString("IMAGEURL", "https://www.zut.edu.pl/app-json-proxy/image/?userId=" + optString + "&tokenJpg=" + optString3);
                    edit.apply();
                    startActivity(new Intent(this, HomeActivity.class));
                } else if (jSONObject.optString("loginInStatus").equals("SYSTEM ERROR")) {
                    m3255a(getString(2131099687));
                } else {
                    m3255a(getString(2131099681));
                }
            } catch (JSONException e2) {
            }
        }
    }

    public void m3257b(String str, int i) {
        try {
            if (this.f2000o.isShowing()) {
                this.f2000o.dismiss();
            }
        } catch (Exception e) {
        }
        if (i == 1001) {
            m3255a(getString(2131099681));
        }
    }

    public void cancelPasswordAction(View view) {
        startActivity(new Intent(this, HomeActivity.class));
    }

    public void forgotPasswordAction(View view) {
    }

    public void m3258i() {
        Display defaultDisplay = getWindowManager().getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        int i = displayMetrics.heightPixels / 2;
        ImageView imageView = (ImageView) findViewById(2131427426);
        imageView.getLayoutParams().height = i;
        imageView.getLayoutParams().width = i;
        EditText editText = (EditText) findViewById(2131427448);
        editText.setText("");
        editText.requestFocus();
        ((EditText) findViewById(2131427446)).setText("");
        this.f1999n = new C0660a(this);
        this.f2000o = new ProgressDialog(this);
        this.f2000o.setMessage(getString(2131099679));
    }

    public void loginAction(View view) {
        EditText editText = (EditText) findViewById(2131427448);
        String trim = editText.getText().toString().trim();
        if (trim.length() == 0) {
            editText.setError(getString(2131099674));
            return;
        }
        editText = (EditText) findViewById(2131427446);
        String trim2 = editText.getText().toString().trim();
        if (trim2.length() == 0) {
            editText.setError(getString(2131099675));
            return;
        }
        this.f2000o.show();
        if (this.f1999n.m3347a()) {
            // tutaj
            this.f1999n.m3343a(trim, trim2, m3253a(trim, trim2), m3253a(trim, null), 1001);
            return;
        }
        try {
            if (this.f2000o.isShowing()) {
                this.f2000o.dismiss();
            }
        } catch (Exception e) {
        }
        m3255a(getString(2131099699));
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2130968606);
        getApplicationContext().getSharedPreferences("mZut", 0).edit().clear().commit();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(2131558400, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getItemId();
        return super.onOptionsItemSelected(menuItem);
    }

    protected void onStart() {
        super.onStart();
        m3258i();
    }
}
