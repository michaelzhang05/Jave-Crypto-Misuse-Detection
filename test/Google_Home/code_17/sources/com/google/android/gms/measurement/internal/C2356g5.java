package com.google.android.gms.measurement.internal;

import G.a;
import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Pair;
import j$.util.Objects;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.google.android.gms.measurement.internal.g5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2356g5 extends F5 {

    /* renamed from: d, reason: collision with root package name */
    private final Map f17595d;

    /* renamed from: e, reason: collision with root package name */
    public final C2478y2 f17596e;

    /* renamed from: f, reason: collision with root package name */
    public final C2478y2 f17597f;

    /* renamed from: g, reason: collision with root package name */
    public final C2478y2 f17598g;

    /* renamed from: h, reason: collision with root package name */
    public final C2478y2 f17599h;

    /* renamed from: i, reason: collision with root package name */
    public final C2478y2 f17600i;

    /* renamed from: j, reason: collision with root package name */
    public final C2478y2 f17601j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2356g5(I5 i52) {
        super(i52);
        this.f17595d = new HashMap();
        C2443t2 f8 = f();
        Objects.requireNonNull(f8);
        this.f17596e = new C2478y2(f8, "last_delete_stale", 0L);
        C2443t2 f9 = f();
        Objects.requireNonNull(f9);
        this.f17597f = new C2478y2(f9, "last_delete_stale_batch", 0L);
        C2443t2 f10 = f();
        Objects.requireNonNull(f10);
        this.f17598g = new C2478y2(f10, "backoff", 0L);
        C2443t2 f11 = f();
        Objects.requireNonNull(f11);
        this.f17599h = new C2478y2(f11, "last_upload", 0L);
        C2443t2 f12 = f();
        Objects.requireNonNull(f12);
        this.f17600i = new C2478y2(f12, "last_upload_attempt", 0L);
        C2443t2 f13 = f();
        Objects.requireNonNull(f13);
        this.f17601j = new C2478y2(f13, "midnight_offset", 0L);
    }

    private final Pair v(String str) {
        C2377j5 c2377j5;
        a.C0050a c0050a;
        k();
        long elapsedRealtime = x().elapsedRealtime();
        C2377j5 c2377j52 = (C2377j5) this.f17595d.get(str);
        if (c2377j52 != null && elapsedRealtime < c2377j52.f17664c) {
            return new Pair(c2377j52.f17662a, Boolean.valueOf(c2377j52.f17663b));
        }
        G.a.b(true);
        long E8 = a().E(str) + elapsedRealtime;
        try {
            try {
                c0050a = G.a.a(w());
            } catch (PackageManager.NameNotFoundException unused) {
                if (c2377j52 != null && elapsedRealtime < c2377j52.f17664c + a().C(str, H.f17109c)) {
                    return new Pair(c2377j52.f17662a, Boolean.valueOf(c2377j52.f17663b));
                }
                c0050a = null;
            }
        } catch (Exception e8) {
            c().F().b("Unable to get advertising id", e8);
            c2377j5 = new C2377j5("", false, E8);
        }
        if (c0050a == null) {
            return new Pair("00000000-0000-0000-0000-000000000000", Boolean.FALSE);
        }
        String a8 = c0050a.a();
        if (a8 != null) {
            c2377j5 = new C2377j5(a8, c0050a.b(), E8);
        } else {
            c2377j5 = new C2377j5("", c0050a.b(), E8);
        }
        this.f17595d.put(str, c2377j5);
        G.a.b(false);
        return new Pair(c2377j5.f17662a, Boolean.valueOf(c2377j5.f17663b));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String A(String str, boolean z8) {
        String str2;
        k();
        if (z8) {
            str2 = (String) v(str).first;
        } else {
            str2 = "00000000-0000-0000-0000-000000000000";
        }
        MessageDigest V02 = a6.V0();
        if (V02 == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, V02.digest(str2.getBytes())));
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
        return false;
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

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Pair z(String str, C2472x3 c2472x3) {
        if (c2472x3.A()) {
            return v(str);
        }
        return new Pair("", Boolean.FALSE);
    }
}
