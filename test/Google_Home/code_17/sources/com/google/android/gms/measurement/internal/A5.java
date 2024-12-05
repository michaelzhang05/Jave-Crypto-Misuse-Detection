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
import com.google.android.gms.internal.measurement.AbstractC2291y0;

/* loaded from: classes3.dex */
public final class A5 extends F5 {

    /* renamed from: d, reason: collision with root package name */
    private final AlarmManager f16964d;

    /* renamed from: e, reason: collision with root package name */
    private AbstractC2461w f16965e;

    /* renamed from: f, reason: collision with root package name */
    private Integer f16966f;

    /* JADX INFO: Access modifiers changed from: protected */
    public A5(I5 i52) {
        super(i52);
        this.f16964d = (AlarmManager) w().getSystemService(NotificationCompat.CATEGORY_ALARM);
    }

    private final int A() {
        if (this.f16966f == null) {
            this.f16966f = Integer.valueOf(("measurement" + w().getPackageName()).hashCode());
        }
        return this.f16966f.intValue();
    }

    private final PendingIntent B() {
        Context w8 = w();
        return AbstractC2291y0.a(w8, 0, new Intent().setClassName(w8, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), AbstractC2291y0.f16901a);
    }

    private final AbstractC2461w C() {
        if (this.f16965e == null) {
            this.f16965e = new D5(this, this.f16988b.t0());
        }
        return this.f16965e;
    }

    private final void D() {
        JobScheduler jobScheduler = (JobScheduler) w().getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(A());
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2451u3
    public final /* bridge */ /* synthetic */ C2364i a() {
        return super.a();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2451u3
    public final /* bridge */ /* synthetic */ B b() {
        return super.b();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2451u3, com.google.android.gms.measurement.internal.InterfaceC2465w3
    public final /* bridge */ /* synthetic */ C2367i2 c() {
        return super.c();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2451u3
    public final /* bridge */ /* synthetic */ C2360h2 d() {
        return super.d();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2451u3, com.google.android.gms.measurement.internal.InterfaceC2465w3
    public final /* bridge */ /* synthetic */ M2 e() {
        return super.e();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2451u3
    public final /* bridge */ /* synthetic */ C2443t2 f() {
        return super.f();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2451u3
    public final /* bridge */ /* synthetic */ a6 h() {
        return super.h();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2451u3
    public final /* bridge */ /* synthetic */ void i() {
        super.i();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2451u3
    public final /* bridge */ /* synthetic */ void j() {
        super.j();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2451u3
    public final /* bridge */ /* synthetic */ void k() {
        super.k();
    }

    @Override // com.google.android.gms.measurement.internal.C5
    public final /* bridge */ /* synthetic */ W5 l() {
        return super.l();
    }

    @Override // com.google.android.gms.measurement.internal.C5
    public final /* bridge */ /* synthetic */ g6 m() {
        return super.m();
    }

    @Override // com.google.android.gms.measurement.internal.C5
    public final /* bridge */ /* synthetic */ C2392m n() {
        return super.n();
    }

    @Override // com.google.android.gms.measurement.internal.C5
    public final /* bridge */ /* synthetic */ E2 o() {
        return super.o();
    }

    @Override // com.google.android.gms.measurement.internal.C5
    public final /* bridge */ /* synthetic */ C2356g5 p() {
        return super.p();
    }

    @Override // com.google.android.gms.measurement.internal.C5
    public final /* bridge */ /* synthetic */ E5 q() {
        return super.q();
    }

    @Override // com.google.android.gms.measurement.internal.F5
    protected final boolean u() {
        AlarmManager alarmManager = this.f16964d;
        if (alarmManager != null) {
            alarmManager.cancel(B());
        }
        if (Build.VERSION.SDK_INT >= 24) {
            D();
            return false;
        }
        return false;
    }

    public final void v(long j8) {
        r();
        Context w8 = w();
        if (!a6.d0(w8)) {
            c().F().a("Receiver not registered/enabled");
        }
        if (!a6.e0(w8, false)) {
            c().F().a("Service not registered/enabled");
        }
        z();
        c().K().b("Scheduling upload, millis", Long.valueOf(j8));
        long elapsedRealtime = x().elapsedRealtime() + j8;
        if (j8 < Math.max(0L, ((Long) H.f17168z.a(null)).longValue()) && !C().e()) {
            C().b(j8);
        }
        if (Build.VERSION.SDK_INT >= 24) {
            Context w9 = w();
            ComponentName componentName = new ComponentName(w9, "com.google.android.gms.measurement.AppMeasurementJobService");
            int A8 = A();
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putString("action", "com.google.android.gms.measurement.UPLOAD");
            com.google.android.gms.internal.measurement.B0.c(w9, new JobInfo.Builder(A8, componentName).setMinimumLatency(j8).setOverrideDeadline(j8 << 1).setExtras(persistableBundle).build(), "com.google.android.gms", "UploadAlarm");
            return;
        }
        AlarmManager alarmManager = this.f16964d;
        if (alarmManager != null) {
            alarmManager.setInexactRepeating(2, elapsedRealtime, Math.max(((Long) H.f17158u.a(null)).longValue(), j8), B());
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2451u3, com.google.android.gms.measurement.internal.InterfaceC2465w3
    public final /* bridge */ /* synthetic */ Context w() {
        return super.w();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2451u3, com.google.android.gms.measurement.internal.InterfaceC2465w3
    public final /* bridge */ /* synthetic */ V.d x() {
        return super.x();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2451u3, com.google.android.gms.measurement.internal.InterfaceC2465w3
    public final /* bridge */ /* synthetic */ C2329d y() {
        return super.y();
    }

    public final void z() {
        r();
        c().K().a("Unscheduling upload");
        AlarmManager alarmManager = this.f16964d;
        if (alarmManager != null) {
            alarmManager.cancel(B());
        }
        C().a();
        if (Build.VERSION.SDK_INT >= 24) {
            D();
        }
    }
}
