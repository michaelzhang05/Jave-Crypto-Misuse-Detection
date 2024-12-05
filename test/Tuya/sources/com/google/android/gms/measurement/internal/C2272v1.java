package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* renamed from: com.google.android.gms.measurement.internal.v1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2272v1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f16889a;

    /* renamed from: b, reason: collision with root package name */
    public final String f16890b;

    /* renamed from: c, reason: collision with root package name */
    public final long f16891c;

    /* renamed from: d, reason: collision with root package name */
    public final Bundle f16892d;

    public C2272v1(String str, String str2, Bundle bundle, long j8) {
        this.f16889a = str;
        this.f16890b = str2;
        this.f16892d = bundle;
        this.f16891c = j8;
    }

    public static C2272v1 b(C2270v c2270v) {
        return new C2272v1(c2270v.f16884a, c2270v.f16886c, c2270v.f16885b.z(), c2270v.f16887d);
    }

    public final C2270v a() {
        return new C2270v(this.f16889a, new C2260t(new Bundle(this.f16892d)), this.f16890b, this.f16891c);
    }

    public final String toString() {
        return "origin=" + this.f16890b + ",name=" + this.f16889a + ",params=" + this.f16892d.toString();
    }
}
