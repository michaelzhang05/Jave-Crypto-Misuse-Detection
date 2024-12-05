package com.google.android.gms.measurement.internal;

import android.app.ActivityManager;
import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.x5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2474x5 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C2419p5 f17910a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2474x5(C2419p5 c2419p5) {
        this.f17910a = c2419p5;
    }

    private final void c(long j8, boolean z8) {
        this.f17910a.k();
        if (!this.f17910a.f17844a.m()) {
            return;
        }
        this.f17910a.f().f17828r.b(j8);
        this.f17910a.c().K().b("Session started, time", Long.valueOf(this.f17910a.x().elapsedRealtime()));
        long j9 = j8 / 1000;
        this.f17910a.o().i0("auto", "_sid", Long.valueOf(j9), j8);
        this.f17910a.f().f17829s.b(j9);
        this.f17910a.f().f17824n.a(false);
        Bundle bundle = new Bundle();
        bundle.putLong("_sid", j9);
        this.f17910a.o().c0("auto", "_s", j8, bundle);
        String a8 = this.f17910a.f().f17834x.a();
        if (!TextUtils.isEmpty(a8)) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("_ffr", a8);
            this.f17910a.o().c0("auto", "_ssr", j8, bundle2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        this.f17910a.k();
        if (this.f17910a.f().z(this.f17910a.x().currentTimeMillis())) {
            this.f17910a.f().f17824n.a(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                this.f17910a.c().K().a("Detected application was in foreground");
                c(this.f17910a.x().currentTimeMillis(), false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(long j8, boolean z8) {
        this.f17910a.k();
        this.f17910a.G();
        if (this.f17910a.f().z(j8)) {
            this.f17910a.f().f17824n.a(true);
            this.f17910a.m().I();
        }
        this.f17910a.f().f17828r.b(j8);
        if (this.f17910a.f().f17824n.b()) {
            c(j8, z8);
        }
    }
}
