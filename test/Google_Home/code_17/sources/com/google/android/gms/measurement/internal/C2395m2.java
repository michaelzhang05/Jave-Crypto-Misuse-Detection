package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* renamed from: com.google.android.gms.measurement.internal.m2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2395m2 {

    /* renamed from: a, reason: collision with root package name */
    public String f17715a;

    /* renamed from: b, reason: collision with root package name */
    public String f17716b;

    /* renamed from: c, reason: collision with root package name */
    public long f17717c;

    /* renamed from: d, reason: collision with root package name */
    public Bundle f17718d;

    public C2395m2(String str, String str2, Bundle bundle, long j8) {
        this.f17715a = str;
        this.f17716b = str2;
        this.f17718d = bundle == null ? new Bundle() : bundle;
        this.f17717c = j8;
    }

    public static C2395m2 b(G g8) {
        return new C2395m2(g8.f17033a, g8.f17035c, g8.f17034b.y(), g8.f17036d);
    }

    public final G a() {
        return new G(this.f17715a, new C(new Bundle(this.f17718d)), this.f17716b, this.f17717c);
    }

    public final String toString() {
        return "origin=" + this.f17716b + ",name=" + this.f17715a + ",params=" + String.valueOf(this.f17718d);
    }
}
