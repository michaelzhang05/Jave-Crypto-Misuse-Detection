package com.google.android.gms.measurement.internal;

import Q.AbstractC1400p;
import android.content.SharedPreferences;

/* renamed from: com.google.android.gms.measurement.internal.w2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2464w2 {

    /* renamed from: a, reason: collision with root package name */
    private final String f17878a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f17879b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f17880c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f17881d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ C2443t2 f17882e;

    public C2464w2(C2443t2 c2443t2, String str, boolean z8) {
        this.f17882e = c2443t2;
        AbstractC1400p.f(str);
        this.f17878a = str;
        this.f17879b = z8;
    }

    public final void a(boolean z8) {
        SharedPreferences.Editor edit = this.f17882e.J().edit();
        edit.putBoolean(this.f17878a, z8);
        edit.apply();
        this.f17881d = z8;
    }

    public final boolean b() {
        if (!this.f17880c) {
            this.f17880c = true;
            this.f17881d = this.f17882e.J().getBoolean(this.f17878a, this.f17879b);
        }
        return this.f17881d;
    }
}
