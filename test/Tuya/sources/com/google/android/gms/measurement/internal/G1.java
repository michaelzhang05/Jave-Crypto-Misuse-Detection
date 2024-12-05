package com.google.android.gms.measurement.internal;

import R.AbstractC1319p;
import android.content.SharedPreferences;
import android.util.Pair;

/* loaded from: classes3.dex */
public final class G1 {

    /* renamed from: a, reason: collision with root package name */
    final String f16114a;

    /* renamed from: b, reason: collision with root package name */
    private final String f16115b;

    /* renamed from: c, reason: collision with root package name */
    private final String f16116c;

    /* renamed from: d, reason: collision with root package name */
    private final long f16117d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ I1 f16118e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ G1(I1 i12, String str, long j8, m0.g gVar) {
        boolean z8;
        this.f16118e = i12;
        AbstractC1319p.f("health_monitor");
        if (j8 > 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        AbstractC1319p.a(z8);
        this.f16114a = "health_monitor:start";
        this.f16115b = "health_monitor:count";
        this.f16116c = "health_monitor:value";
        this.f16117d = j8;
    }

    private final long c() {
        return this.f16118e.o().getLong(this.f16114a, 0L);
    }

    private final void d() {
        this.f16118e.h();
        long currentTimeMillis = this.f16118e.f16777a.a().currentTimeMillis();
        SharedPreferences.Editor edit = this.f16118e.o().edit();
        edit.remove(this.f16115b);
        edit.remove(this.f16116c);
        edit.putLong(this.f16114a, currentTimeMillis);
        edit.apply();
    }

    public final Pair a() {
        long abs;
        this.f16118e.h();
        this.f16118e.h();
        long c8 = c();
        if (c8 == 0) {
            d();
            abs = 0;
        } else {
            abs = Math.abs(c8 - this.f16118e.f16777a.a().currentTimeMillis());
        }
        long j8 = this.f16117d;
        if (abs < j8) {
            return null;
        }
        if (abs > j8 + j8) {
            d();
            return null;
        }
        String string = this.f16118e.o().getString(this.f16116c, null);
        long j9 = this.f16118e.o().getLong(this.f16115b, 0L);
        d();
        if (string != null && j9 > 0) {
            return new Pair(string, Long.valueOf(j9));
        }
        return I1.f16146y;
    }

    public final void b(String str, long j8) {
        this.f16118e.h();
        if (c() == 0) {
            d();
        }
        if (str == null) {
            str = "";
        }
        long j9 = this.f16118e.o().getLong(this.f16115b, 0L);
        if (j9 <= 0) {
            SharedPreferences.Editor edit = this.f16118e.o().edit();
            edit.putString(this.f16116c, str);
            edit.putLong(this.f16115b, 1L);
            edit.apply();
            return;
        }
        long nextLong = this.f16118e.f16777a.N().u().nextLong() & Long.MAX_VALUE;
        long j10 = j9 + 1;
        long j11 = Long.MAX_VALUE / j10;
        SharedPreferences.Editor edit2 = this.f16118e.o().edit();
        if (nextLong < j11) {
            edit2.putString(this.f16116c, str);
        }
        edit2.putLong(this.f16115b, j10);
        edit2.apply();
    }
}
