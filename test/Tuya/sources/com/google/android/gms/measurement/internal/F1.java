package com.google.android.gms.measurement.internal;

import R.AbstractC1319p;
import android.content.SharedPreferences;

/* loaded from: classes3.dex */
public final class F1 {

    /* renamed from: a, reason: collision with root package name */
    private final String f16102a;

    /* renamed from: b, reason: collision with root package name */
    private final long f16103b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f16104c;

    /* renamed from: d, reason: collision with root package name */
    private long f16105d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ I1 f16106e;

    public F1(I1 i12, String str, long j8) {
        this.f16106e = i12;
        AbstractC1319p.f(str);
        this.f16102a = str;
        this.f16103b = j8;
    }

    public final long a() {
        if (!this.f16104c) {
            this.f16104c = true;
            this.f16105d = this.f16106e.o().getLong(this.f16102a, this.f16103b);
        }
        return this.f16105d;
    }

    public final void b(long j8) {
        SharedPreferences.Editor edit = this.f16106e.o().edit();
        edit.putLong(this.f16102a, j8);
        edit.apply();
        this.f16105d = j8;
    }
}
