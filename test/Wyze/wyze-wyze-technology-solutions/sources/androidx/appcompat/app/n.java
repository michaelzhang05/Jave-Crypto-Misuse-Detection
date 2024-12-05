package androidx.appcompat.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import cm.aptoide.pt.notification.PullingContentService;
import java.util.Calendar;

/* compiled from: TwilightManager.java */
/* loaded from: classes.dex */
class n {
    private static n a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f190b;

    /* renamed from: c, reason: collision with root package name */
    private final LocationManager f191c;

    /* renamed from: d, reason: collision with root package name */
    private final a f192d = new a();

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: TwilightManager.java */
    /* loaded from: classes.dex */
    public static class a {
        boolean a;

        /* renamed from: b, reason: collision with root package name */
        long f193b;

        /* renamed from: c, reason: collision with root package name */
        long f194c;

        /* renamed from: d, reason: collision with root package name */
        long f195d;

        /* renamed from: e, reason: collision with root package name */
        long f196e;

        /* renamed from: f, reason: collision with root package name */
        long f197f;

        a() {
        }
    }

    n(Context context, LocationManager locationManager) {
        this.f190b = context;
        this.f191c = locationManager;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static n a(Context context) {
        if (a == null) {
            Context applicationContext = context.getApplicationContext();
            a = new n(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return a;
    }

    @SuppressLint({"MissingPermission"})
    private Location b() {
        Location c2 = androidx.core.content.c.b(this.f190b, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? c("network") : null;
        Location c3 = androidx.core.content.c.b(this.f190b, "android.permission.ACCESS_FINE_LOCATION") == 0 ? c("gps") : null;
        return (c3 == null || c2 == null) ? c3 != null ? c3 : c2 : c3.getTime() > c2.getTime() ? c3 : c2;
    }

    private Location c(String str) {
        try {
            if (this.f191c.isProviderEnabled(str)) {
                return this.f191c.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e2) {
            Log.d("TwilightManager", "Failed to get last known location", e2);
            return null;
        }
    }

    private boolean e() {
        return this.f192d.f197f > System.currentTimeMillis();
    }

    private void f(Location location) {
        long j2;
        a aVar = this.f192d;
        long currentTimeMillis = System.currentTimeMillis();
        m b2 = m.b();
        b2.a(currentTimeMillis - PullingContentService.UPDATES_INTERVAL, location.getLatitude(), location.getLongitude());
        long j3 = b2.f187b;
        b2.a(currentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z = b2.f189d == 1;
        long j4 = b2.f188c;
        long j5 = b2.f187b;
        boolean z2 = z;
        b2.a(PullingContentService.UPDATES_INTERVAL + currentTimeMillis, location.getLatitude(), location.getLongitude());
        long j6 = b2.f188c;
        if (j4 == -1 || j5 == -1) {
            j2 = 43200000 + currentTimeMillis;
        } else {
            j2 = (currentTimeMillis > j5 ? 0 + j6 : currentTimeMillis > j4 ? 0 + j5 : 0 + j4) + 60000;
        }
        aVar.a = z2;
        aVar.f193b = j3;
        aVar.f194c = j4;
        aVar.f195d = j5;
        aVar.f196e = j6;
        aVar.f197f = j2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean d() {
        a aVar = this.f192d;
        if (e()) {
            return aVar.a;
        }
        Location b2 = b();
        if (b2 != null) {
            f(b2);
            return aVar.a;
        }
        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int i2 = Calendar.getInstance().get(11);
        return i2 < 6 || i2 >= 22;
    }
}
