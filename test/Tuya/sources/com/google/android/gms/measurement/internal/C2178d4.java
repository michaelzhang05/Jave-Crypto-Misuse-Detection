package com.google.android.gms.measurement.internal;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.core.app.NotificationCompat;

/* renamed from: com.google.android.gms.measurement.internal.d4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2178d4 extends AbstractC2190f4 {

    /* renamed from: d, reason: collision with root package name */
    private final AlarmManager f16469d;

    /* renamed from: e, reason: collision with root package name */
    private AbstractC2236o f16470e;

    /* renamed from: f, reason: collision with root package name */
    private Integer f16471f;

    /* JADX INFO: Access modifiers changed from: protected */
    public C2178d4(r4 r4Var) {
        super(r4Var);
        this.f16469d = (AlarmManager) this.f16777a.c().getSystemService(NotificationCompat.CATEGORY_ALARM);
    }

    private final int o() {
        if (this.f16471f == null) {
            this.f16471f = Integer.valueOf("measurement".concat(String.valueOf(this.f16777a.c().getPackageName())).hashCode());
        }
        return this.f16471f.intValue();
    }

    private final PendingIntent p() {
        Context c8 = this.f16777a.c();
        return PendingIntent.getBroadcast(c8, 0, new Intent().setClassName(c8, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), com.google.android.gms.internal.measurement.W.f15592a);
    }

    private final AbstractC2236o q() {
        if (this.f16470e == null) {
            this.f16470e = new C2172c4(this, this.f16482b.b0());
        }
        return this.f16470e;
    }

    private final void r() {
        JobScheduler jobScheduler = (JobScheduler) this.f16777a.c().getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(o());
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2190f4
    protected final boolean l() {
        AlarmManager alarmManager = this.f16469d;
        if (alarmManager != null) {
            alarmManager.cancel(p());
        }
        if (Build.VERSION.SDK_INT >= 24) {
            r();
            return false;
        }
        return false;
    }

    public final void m() {
        i();
        this.f16777a.d().v().a("Unscheduling upload");
        AlarmManager alarmManager = this.f16469d;
        if (alarmManager != null) {
            alarmManager.cancel(p());
        }
        q().b();
        if (Build.VERSION.SDK_INT >= 24) {
            r();
        }
    }

    public final void n(long j8) {
        i();
        this.f16777a.b();
        Context c8 = this.f16777a.c();
        if (!y4.a0(c8)) {
            this.f16777a.d().q().a("Receiver not registered/enabled");
        }
        if (!y4.b0(c8, false)) {
            this.f16777a.d().q().a("Service not registered/enabled");
        }
        m();
        this.f16777a.d().v().b("Scheduling upload, millis", Long.valueOf(j8));
        long elapsedRealtime = this.f16777a.a().elapsedRealtime() + j8;
        this.f16777a.z();
        if (j8 < Math.max(0L, ((Long) AbstractC2217k1.f16632z.a(null)).longValue()) && !q().e()) {
            q().d(j8);
        }
        this.f16777a.b();
        if (Build.VERSION.SDK_INT >= 24) {
            Context c9 = this.f16777a.c();
            ComponentName componentName = new ComponentName(c9, "com.google.android.gms.measurement.AppMeasurementJobService");
            int o8 = o();
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putString("action", "com.google.android.gms.measurement.UPLOAD");
            com.google.android.gms.internal.measurement.X.a(c9, new JobInfo.Builder(o8, componentName).setMinimumLatency(j8).setOverrideDeadline(j8 + j8).setExtras(persistableBundle).build(), "com.google.android.gms", "UploadAlarm");
            return;
        }
        AlarmManager alarmManager = this.f16469d;
        if (alarmManager != null) {
            this.f16777a.z();
            alarmManager.setInexactRepeating(2, elapsedRealtime, Math.max(((Long) AbstractC2217k1.f16622u.a(null)).longValue(), j8), p());
        }
    }
}
