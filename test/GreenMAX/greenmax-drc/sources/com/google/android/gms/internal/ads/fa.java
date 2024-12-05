package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class fa implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ String f11406f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ String f11407g;

    /* renamed from: h, reason: collision with root package name */
    private final /* synthetic */ long f11408h;

    /* renamed from: i, reason: collision with root package name */
    private final /* synthetic */ zzbft f11409i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public fa(zzbft zzbftVar, String str, String str2, long j2) {
        this.f11409i = zzbftVar;
        this.f11406f = str;
        this.f11407g = str2;
        this.f11408h = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheComplete");
        hashMap.put("src", this.f11406f);
        hashMap.put("cachedSrc", this.f11407g);
        hashMap.put("totalDuration", Long.toString(this.f11408h));
        this.f11409i.m("onPrecacheEvent", hashMap);
    }
}
