package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class q1 implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ zzala f12032f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ zzajw f12033g;

    /* renamed from: h, reason: collision with root package name */
    private final /* synthetic */ zzakh f12034h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public q1(zzakh zzakhVar, zzala zzalaVar, zzajw zzajwVar) {
        this.f12034h = zzakhVar;
        this.f12032f = zzalaVar;
        this.f12033g = zzajwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        obj = this.f12034h.a;
        synchronized (obj) {
            if (this.f12032f.a() != -1 && this.f12032f.a() != 1) {
                this.f12032f.b();
                Executor executor = zzbbm.a;
                zzajw zzajwVar = this.f12033g;
                zzajwVar.getClass();
                executor.execute(r1.a(zzajwVar));
                zzawz.m("Could not receive loaded message in a timely manner. Rejecting.");
            }
        }
    }
}
