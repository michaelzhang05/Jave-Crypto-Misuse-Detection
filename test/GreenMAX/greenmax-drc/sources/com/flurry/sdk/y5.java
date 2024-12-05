package com.flurry.sdk;

import android.location.Location;
import android.os.Build;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class y5 extends q6 {

    /* renamed from: b, reason: collision with root package name */
    public final int f10263b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f10264c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f10265d;

    /* renamed from: e, reason: collision with root package name */
    public final Location f10266e;

    public y5(int i2, boolean z, boolean z2, Location location) {
        this.f10263b = i2;
        this.f10264c = z;
        this.f10265d = z2;
        this.f10266e = location;
    }

    @Override // com.flurry.sdk.q6, com.flurry.sdk.t6
    public final JSONObject a() throws JSONException {
        Location location;
        double d2;
        double d3;
        boolean z;
        JSONObject a = super.a();
        a.put("fl.report.location.enabled", this.f10264c);
        if (this.f10264c) {
            a.put("fl.location.permission.status", this.f10265d);
            if (this.f10265d && (location = this.f10266e) != null) {
                int i2 = Build.VERSION.SDK_INT;
                boolean z2 = false;
                double d4 = 0.0d;
                if (i2 >= 26) {
                    d4 = location.getVerticalAccuracyMeters();
                    double bearingAccuracyDegrees = this.f10266e.getBearingAccuracyDegrees();
                    double speedAccuracyMetersPerSecond = this.f10266e.getSpeedAccuracyMetersPerSecond();
                    boolean hasBearingAccuracy = this.f10266e.hasBearingAccuracy();
                    z = this.f10266e.hasSpeedAccuracy();
                    d3 = speedAccuracyMetersPerSecond;
                    d2 = bearingAccuracyDegrees;
                    z2 = hasBearingAccuracy;
                } else {
                    d2 = 0.0d;
                    d3 = 0.0d;
                    z = false;
                }
                a.put("fl.precision.value", this.f10263b);
                a.put("fl.latitude.value", this.f10266e.getLatitude());
                a.put("fl.longitude.value", this.f10266e.getLongitude());
                a.put("fl.horizontal.accuracy.value", this.f10266e.getAccuracy());
                a.put("fl.time.epoch.value", this.f10266e.getTime());
                if (i2 >= 17) {
                    a.put("fl.time.uptime.value", TimeUnit.NANOSECONDS.toMillis(this.f10266e.getElapsedRealtimeNanos()));
                }
                a.put("fl.altitude.value", this.f10266e.getAltitude());
                a.put("fl.vertical.accuracy.value", d4);
                a.put("fl.bearing.value", this.f10266e.getBearing());
                a.put("fl.speed.value", this.f10266e.getSpeed());
                a.put("fl.bearing.accuracy.available", z2);
                a.put("fl.speed.accuracy.available", z);
                a.put("fl.bearing.accuracy.degrees", d2);
                a.put("fl.speed.accuracy.meters.per.sec", d3);
            }
        }
        return a;
    }
}
