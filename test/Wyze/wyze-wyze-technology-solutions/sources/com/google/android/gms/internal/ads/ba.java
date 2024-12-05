package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class ba implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ String f11137f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ String f11138g;

    /* renamed from: h, reason: collision with root package name */
    private final /* synthetic */ long f11139h;

    /* renamed from: i, reason: collision with root package name */
    private final /* synthetic */ long f11140i;

    /* renamed from: j, reason: collision with root package name */
    private final /* synthetic */ boolean f11141j;

    /* renamed from: k, reason: collision with root package name */
    private final /* synthetic */ zzbft f11142k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ba(zzbft zzbftVar, String str, String str2, long j2, long j3, boolean z) {
        this.f11142k = zzbftVar;
        this.f11137f = str;
        this.f11138g = str2;
        this.f11139h = j2;
        this.f11140i = j3;
        this.f11141j = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheProgress");
        hashMap.put("src", this.f11137f);
        hashMap.put("cachedSrc", this.f11138g);
        hashMap.put("bufferedDuration", Long.toString(this.f11139h));
        hashMap.put("totalDuration", Long.toString(this.f11140i));
        hashMap.put("cacheReady", this.f11141j ? "1" : "0");
        this.f11142k.m("onPrecacheEvent", hashMap);
    }
}
