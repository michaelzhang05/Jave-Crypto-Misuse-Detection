package com.google.android.gms.measurement.internal;

import Q.AbstractC1400p;
import android.content.SharedPreferences;
import android.util.Pair;

/* renamed from: com.google.android.gms.measurement.internal.x2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2471x2 {

    /* renamed from: a, reason: collision with root package name */
    private final String f17891a;

    /* renamed from: b, reason: collision with root package name */
    private final String f17892b;

    /* renamed from: c, reason: collision with root package name */
    private final String f17893c;

    /* renamed from: d, reason: collision with root package name */
    private final long f17894d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ C2443t2 f17895e;

    private final long c() {
        return this.f17895e.J().getLong(this.f17891a, 0L);
    }

    private final void d() {
        this.f17895e.k();
        long currentTimeMillis = this.f17895e.x().currentTimeMillis();
        SharedPreferences.Editor edit = this.f17895e.J().edit();
        edit.remove(this.f17892b);
        edit.remove(this.f17893c);
        edit.putLong(this.f17891a, currentTimeMillis);
        edit.apply();
    }

    public final Pair a() {
        long abs;
        this.f17895e.k();
        this.f17895e.k();
        long c8 = c();
        if (c8 == 0) {
            d();
            abs = 0;
        } else {
            abs = Math.abs(c8 - this.f17895e.x().currentTimeMillis());
        }
        long j8 = this.f17894d;
        if (abs < j8) {
            return null;
        }
        if (abs > (j8 << 1)) {
            d();
            return null;
        }
        String string = this.f17895e.J().getString(this.f17893c, null);
        long j9 = this.f17895e.J().getLong(this.f17892b, 0L);
        d();
        if (string != null && j9 > 0) {
            return new Pair(string, Long.valueOf(j9));
        }
        return C2443t2.f17811B;
    }

    public final void b(String str, long j8) {
        boolean z8;
        this.f17895e.k();
        if (c() == 0) {
            d();
        }
        if (str == null) {
            str = "";
        }
        long j9 = this.f17895e.J().getLong(this.f17892b, 0L);
        if (j9 <= 0) {
            SharedPreferences.Editor edit = this.f17895e.J().edit();
            edit.putString(this.f17893c, str);
            edit.putLong(this.f17892b, 1L);
            edit.apply();
            return;
        }
        long j10 = j9 + 1;
        if ((this.f17895e.h().W0().nextLong() & Long.MAX_VALUE) < Long.MAX_VALUE / j10) {
            z8 = true;
        } else {
            z8 = false;
        }
        SharedPreferences.Editor edit2 = this.f17895e.J().edit();
        if (z8) {
            edit2.putString(this.f17893c, str);
        }
        edit2.putLong(this.f17892b, j10);
        edit2.apply();
    }

    private C2471x2(C2443t2 c2443t2, String str, long j8) {
        this.f17895e = c2443t2;
        AbstractC1400p.f(str);
        AbstractC1400p.a(j8 > 0);
        this.f17891a = str + ":start";
        this.f17892b = str + ":count";
        this.f17893c = str + ":value";
        this.f17894d = j8;
    }
}
