package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class D2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f16046a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f16047b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ long f16048c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Bundle f16049d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ boolean f16050e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ boolean f16051f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ boolean f16052g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ String f16053h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ Y2 f16054i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public D2(Y2 y22, String str, String str2, long j8, Bundle bundle, boolean z8, boolean z9, boolean z10, String str3) {
        this.f16054i = y22;
        this.f16046a = str;
        this.f16047b = str2;
        this.f16048c = j8;
        this.f16049d = bundle;
        this.f16050e = z8;
        this.f16051f = z9;
        this.f16052g = z10;
        this.f16053h = str3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f16054i.w(this.f16046a, this.f16047b, this.f16048c, this.f16049d, this.f16050e, this.f16051f, this.f16052g, this.f16053h);
    }
}
