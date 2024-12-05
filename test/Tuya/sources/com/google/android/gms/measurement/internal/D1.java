package com.google.android.gms.measurement.internal;

import R.AbstractC1319p;
import android.content.SharedPreferences;

/* loaded from: classes3.dex */
public final class D1 {

    /* renamed from: a, reason: collision with root package name */
    private final String f16041a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f16042b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f16043c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f16044d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ I1 f16045e;

    public D1(I1 i12, String str, boolean z8) {
        this.f16045e = i12;
        AbstractC1319p.f(str);
        this.f16041a = str;
        this.f16042b = z8;
    }

    public final void a(boolean z8) {
        SharedPreferences.Editor edit = this.f16045e.o().edit();
        edit.putBoolean(this.f16041a, z8);
        edit.apply();
        this.f16044d = z8;
    }

    public final boolean b() {
        if (!this.f16043c) {
            this.f16043c = true;
            this.f16044d = this.f16045e.o().getBoolean(this.f16041a, this.f16042b);
        }
        return this.f16044d;
    }
}
