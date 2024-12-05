package com.google.android.gms.measurement.internal;

import R.AbstractC1319p;
import android.content.SharedPreferences;

/* loaded from: classes3.dex */
public final class H1 {

    /* renamed from: a, reason: collision with root package name */
    private final String f16133a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f16134b;

    /* renamed from: c, reason: collision with root package name */
    private String f16135c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ I1 f16136d;

    public H1(I1 i12, String str, String str2) {
        this.f16136d = i12;
        AbstractC1319p.f(str);
        this.f16133a = str;
    }

    public final String a() {
        if (!this.f16134b) {
            this.f16134b = true;
            this.f16135c = this.f16136d.o().getString(this.f16133a, null);
        }
        return this.f16135c;
    }

    public final void b(String str) {
        SharedPreferences.Editor edit = this.f16136d.o().edit();
        edit.putString(this.f16133a, str);
        edit.apply();
        this.f16135c = str;
    }
}
