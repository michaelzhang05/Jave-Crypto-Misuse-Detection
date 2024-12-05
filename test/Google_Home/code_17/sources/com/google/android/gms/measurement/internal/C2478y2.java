package com.google.android.gms.measurement.internal;

import Q.AbstractC1400p;
import android.content.SharedPreferences;

/* renamed from: com.google.android.gms.measurement.internal.y2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2478y2 {

    /* renamed from: a, reason: collision with root package name */
    private final String f17917a;

    /* renamed from: b, reason: collision with root package name */
    private final long f17918b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f17919c;

    /* renamed from: d, reason: collision with root package name */
    private long f17920d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ C2443t2 f17921e;

    public C2478y2(C2443t2 c2443t2, String str, long j8) {
        this.f17921e = c2443t2;
        AbstractC1400p.f(str);
        this.f17917a = str;
        this.f17918b = j8;
    }

    public final long a() {
        if (!this.f17919c) {
            this.f17919c = true;
            this.f17920d = this.f17921e.J().getLong(this.f17917a, this.f17918b);
        }
        return this.f17920d;
    }

    public final void b(long j8) {
        SharedPreferences.Editor edit = this.f17921e.J().edit();
        edit.putLong(this.f17917a, j8);
        edit.apply();
        this.f17920d = j8;
    }
}
