package android.support.v7.p014a;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.support.v4.p005b.C0121i;
import android.util.Log;
import java.util.Calendar;

/* renamed from: android.support.v7.a.r */
class C0457r {
    private static C0457r f974a;
    private final Context f975b;
    private final LocationManager f976c;
    private final C0456a f977d;

    /* renamed from: android.support.v7.a.r.a */
    private static class C0456a {
        boolean f968a;
        long f969b;
        long f970c;
        long f971d;
        long f972e;
        long f973f;

        C0456a() {
        }
    }

    C0457r(Context context, LocationManager locationManager) {
        this.f977d = new C0456a();
        this.f975b = context;
        this.f976c = locationManager;
    }

    private Location m2152a(String str) {
        if (this.f976c != null) {
            try {
                if (this.f976c.isProviderEnabled(str)) {
                    return this.f976c.getLastKnownLocation(str);
                }
            } catch (Throwable e) {
                Log.d("TwilightManager", "Failed to get last known location", e);
            }
        }
        return null;
    }

    static C0457r m2153a(Context context) {
        if (f974a == null) {
            Context applicationContext = context.getApplicationContext();
            f974a = new C0457r(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return f974a;
    }

    private void m2154a(Location location) {
        long j;
        C0456a c0456a = this.f977d;
        long currentTimeMillis = System.currentTimeMillis();
        C0455q a = C0455q.m2150a();
        a.m2151a(currentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        long j2 = a.f965a;
        a.m2151a(currentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z = a.f967c == 1;
        long j3 = a.f966b;
        long j4 = a.f965a;
        a.m2151a(86400000 + currentTimeMillis, location.getLatitude(), location.getLongitude());
        long j5 = a.f966b;
        if (j3 == -1 || j4 == -1) {
            j = 43200000 + currentTimeMillis;
        } else {
            j = currentTimeMillis > j4 ? 0 + j5 : currentTimeMillis > j3 ? 0 + j4 : 0 + j3;
            j += 60000;
        }
        c0456a.f968a = z;
        c0456a.f969b = j2;
        c0456a.f970c = j3;
        c0456a.f971d = j4;
        c0456a.f972e = j5;
        c0456a.f973f = j;
    }

    private Location m2155b() {
        Location location = null;
        Location a = C0121i.m480a(this.f975b, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? m2152a("network") : null;
        if (C0121i.m480a(this.f975b, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            location = m2152a("gps");
        }
        if (location != null && a != null) {
            return location.getTime() > a.getTime() ? location : a;
        } else {
            if (location == null) {
                location = a;
            }
            return location;
        }
    }

    private boolean m2156c() {
        return this.f977d != null && this.f977d.f973f > System.currentTimeMillis();
    }

    boolean m2157a() {
        C0456a c0456a = this.f977d;
        if (m2156c()) {
            return c0456a.f968a;
        }
        Location b = m2155b();
        if (b != null) {
            m2154a(b);
            return c0456a.f968a;
        }
        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int i = Calendar.getInstance().get(11);
        return i < 6 || i >= 22;
    }
}
