package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class V3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ String f17375a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f17376b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ long f17377c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ Bundle f17378d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ boolean f17379e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ boolean f17380f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ boolean f17381g;

    /* renamed from: h, reason: collision with root package name */
    private final /* synthetic */ String f17382h;

    /* renamed from: i, reason: collision with root package name */
    private final /* synthetic */ A3 f17383i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public V3(A3 a32, String str, String str2, long j8, Bundle bundle, boolean z8, boolean z9, boolean z10, String str3) {
        this.f17375a = str;
        this.f17376b = str2;
        this.f17377c = j8;
        this.f17378d = bundle;
        this.f17379e = z8;
        this.f17380f = z9;
        this.f17381g = z10;
        this.f17382h = str3;
        this.f17383i = a32;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f17383i.d0(this.f17375a, this.f17376b, this.f17377c, this.f17378d, this.f17379e, this.f17380f, this.f17381g, this.f17382h);
    }
}
