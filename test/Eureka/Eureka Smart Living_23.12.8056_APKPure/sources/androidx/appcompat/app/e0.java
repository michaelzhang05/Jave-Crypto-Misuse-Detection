package androidx.appcompat.app;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import java.util.Calendar;

/* loaded from: classes.dex */
class e0 {

    /* renamed from: d, reason: collision with root package name */
    private static e0 f294d;

    /* renamed from: a, reason: collision with root package name */
    private final Context f295a;

    /* renamed from: b, reason: collision with root package name */
    private final LocationManager f296b;

    /* renamed from: c, reason: collision with root package name */
    private final a f297c = new a();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        boolean f298a;

        /* renamed from: b, reason: collision with root package name */
        long f299b;

        a() {
        }
    }

    e0(Context context, LocationManager locationManager) {
        this.f295a = context;
        this.f296b = locationManager;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static e0 a(Context context) {
        if (f294d == null) {
            Context applicationContext = context.getApplicationContext();
            f294d = new e0(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return f294d;
    }

    private Location b() {
        Location c6 = androidx.core.content.j.b(this.f295a, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? c("network") : null;
        Location c7 = androidx.core.content.j.b(this.f295a, "android.permission.ACCESS_FINE_LOCATION") == 0 ? c("gps") : null;
        return (c7 == null || c6 == null) ? c7 != null ? c7 : c6 : c7.getTime() > c6.getTime() ? c7 : c6;
    }

    private Location c(String str) {
        try {
            if (this.f296b.isProviderEnabled(str)) {
                return this.f296b.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e6) {
            Log.d("TwilightManager", "Failed to get last known location", e6);
            return null;
        }
    }

    private boolean e() {
        return this.f297c.f299b > System.currentTimeMillis();
    }

    private void f(Location location) {
        long j6;
        a aVar = this.f297c;
        long currentTimeMillis = System.currentTimeMillis();
        d0 b6 = d0.b();
        b6.a(currentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        b6.a(currentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z5 = b6.f292c == 1;
        long j7 = b6.f291b;
        long j8 = b6.f290a;
        b6.a(currentTimeMillis + 86400000, location.getLatitude(), location.getLongitude());
        long j9 = b6.f291b;
        if (j7 == -1 || j8 == -1) {
            j6 = 43200000 + currentTimeMillis;
        } else {
            j6 = (currentTimeMillis > j8 ? j9 + 0 : currentTimeMillis > j7 ? j8 + 0 : j7 + 0) + 60000;
        }
        aVar.f298a = z5;
        aVar.f299b = j6;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean d() {
        a aVar = this.f297c;
        if (e()) {
            return aVar.f298a;
        }
        Location b6 = b();
        if (b6 != null) {
            f(b6);
            return aVar.f298a;
        }
        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int i6 = Calendar.getInstance().get(11);
        return i6 < 6 || i6 >= 22;
    }
}
