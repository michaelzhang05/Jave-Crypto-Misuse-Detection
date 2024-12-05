package com.google.android.gms.measurement.internal;

import Q.AbstractC1400p;
import android.content.SharedPreferences;

/* loaded from: classes3.dex */
public final class A2 {

    /* renamed from: a, reason: collision with root package name */
    private final String f16939a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f16940b;

    /* renamed from: c, reason: collision with root package name */
    private String f16941c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ C2443t2 f16942d;

    public A2(C2443t2 c2443t2, String str, String str2) {
        this.f16942d = c2443t2;
        AbstractC1400p.f(str);
        this.f16939a = str;
    }

    public final String a() {
        if (!this.f16940b) {
            this.f16940b = true;
            this.f16941c = this.f16942d.J().getString(this.f16939a, null);
        }
        return this.f16941c;
    }

    public final void b(String str) {
        SharedPreferences.Editor edit = this.f16942d.J().edit();
        edit.putString(this.f16939a, str);
        edit.apply();
        this.f16941c = str;
    }
}
