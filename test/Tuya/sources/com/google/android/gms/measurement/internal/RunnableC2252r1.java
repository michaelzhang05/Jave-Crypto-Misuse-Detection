package com.google.android.gms.measurement.internal;

import android.util.Log;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.r1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC2252r1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f16771a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f16772b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Object f16773c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Object f16774d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Object f16775e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C2267u1 f16776f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2252r1(C2267u1 c2267u1, int i8, String str, Object obj, Object obj2, Object obj3) {
        this.f16776f = c2267u1;
        this.f16771a = i8;
        this.f16772b = str;
        this.f16773c = obj;
        this.f16774d = obj2;
        this.f16775e = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        char c8;
        long j8;
        char c9;
        long j9;
        I1 F8 = this.f16776f.f16777a.F();
        if (F8.n()) {
            C2267u1 c2267u1 = this.f16776f;
            c8 = c2267u1.f16830c;
            if (c8 == 0) {
                if (c2267u1.f16777a.z().H()) {
                    C2267u1 c2267u12 = this.f16776f;
                    c2267u12.f16777a.b();
                    c2267u12.f16830c = 'C';
                } else {
                    C2267u1 c2267u13 = this.f16776f;
                    c2267u13.f16777a.b();
                    c2267u13.f16830c = 'c';
                }
            }
            C2267u1 c2267u14 = this.f16776f;
            j8 = c2267u14.f16831d;
            if (j8 < 0) {
                c2267u14.f16777a.z().q();
                c2267u14.f16831d = 79000L;
            }
            char charAt = "01VDIWEA?".charAt(this.f16771a);
            C2267u1 c2267u15 = this.f16776f;
            c9 = c2267u15.f16830c;
            j9 = c2267u15.f16831d;
            String str = "2" + charAt + c9 + j9 + ":" + C2267u1.A(true, this.f16772b, this.f16773c, this.f16774d, this.f16775e);
            if (str.length() > 1024) {
                str = this.f16772b.substring(0, 1024);
            }
            G1 g12 = F8.f16148d;
            if (g12 != null) {
                g12.b(str, 1L);
                return;
            }
            return;
        }
        Log.println(6, this.f16776f.D(), "Persisted config not initialized. Not logging error/warn");
    }
}
