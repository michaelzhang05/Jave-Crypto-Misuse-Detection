package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class ca implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ String f11231f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ String f11232g;

    /* renamed from: h, reason: collision with root package name */
    private final /* synthetic */ long f11233h;

    /* renamed from: i, reason: collision with root package name */
    private final /* synthetic */ long f11234i;

    /* renamed from: j, reason: collision with root package name */
    private final /* synthetic */ boolean f11235j;

    /* renamed from: k, reason: collision with root package name */
    private final /* synthetic */ int f11236k;
    private final /* synthetic */ int l;
    private final /* synthetic */ zzbft m;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ca(zzbft zzbftVar, String str, String str2, long j2, long j3, boolean z, int i2, int i3) {
        this.m = zzbftVar;
        this.f11231f = str;
        this.f11232g = str2;
        this.f11233h = j2;
        this.f11234i = j3;
        this.f11235j = z;
        this.f11236k = i2;
        this.l = i3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheProgress");
        hashMap.put("src", this.f11231f);
        hashMap.put("cachedSrc", this.f11232g);
        hashMap.put("bufferedDuration", Long.toString(this.f11233h));
        hashMap.put("totalDuration", Long.toString(this.f11234i));
        hashMap.put("cacheReady", this.f11235j ? "1" : "0");
        hashMap.put("playerCount", Integer.toString(this.f11236k));
        hashMap.put("playerPreparedCount", Integer.toString(this.l));
        this.m.m("onPrecacheEvent", hashMap);
    }
}
