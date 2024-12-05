package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class aa implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ String f11066f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ String f11067g;

    /* renamed from: h, reason: collision with root package name */
    private final /* synthetic */ int f11068h;

    /* renamed from: i, reason: collision with root package name */
    private final /* synthetic */ int f11069i = 0;

    /* renamed from: j, reason: collision with root package name */
    private final /* synthetic */ boolean f11070j;

    /* renamed from: k, reason: collision with root package name */
    private final /* synthetic */ int f11071k;
    private final /* synthetic */ int l;
    private final /* synthetic */ zzbft m;

    /* JADX INFO: Access modifiers changed from: package-private */
    public aa(zzbft zzbftVar, String str, String str2, int i2, int i3, boolean z, int i4, int i5) {
        this.m = zzbftVar;
        this.f11066f = str;
        this.f11067g = str2;
        this.f11068h = i2;
        this.f11070j = z;
        this.f11071k = i4;
        this.l = i5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheProgress");
        hashMap.put("src", this.f11066f);
        hashMap.put("cachedSrc", this.f11067g);
        hashMap.put("bytesLoaded", Integer.toString(this.f11068h));
        hashMap.put("totalBytes", Integer.toString(this.f11069i));
        hashMap.put("cacheReady", this.f11070j ? "1" : "0");
        hashMap.put("playerCount", Integer.toString(this.f11071k));
        hashMap.put("playerPreparedCount", Integer.toString(this.l));
        this.m.m("onPrecacheEvent", hashMap);
    }
}
