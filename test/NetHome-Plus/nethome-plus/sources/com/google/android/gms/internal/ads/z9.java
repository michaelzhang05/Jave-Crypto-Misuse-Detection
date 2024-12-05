package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* loaded from: classes2.dex */
final class z9 implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ String f12507f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ String f12508g;

    /* renamed from: h, reason: collision with root package name */
    private final /* synthetic */ int f12509h;

    /* renamed from: i, reason: collision with root package name */
    private final /* synthetic */ int f12510i;

    /* renamed from: j, reason: collision with root package name */
    private final /* synthetic */ boolean f12511j = false;

    /* renamed from: k, reason: collision with root package name */
    private final /* synthetic */ zzbft f12512k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public z9(zzbft zzbftVar, String str, String str2, int i2, int i3, boolean z) {
        this.f12512k = zzbftVar;
        this.f12507f = str;
        this.f12508g = str2;
        this.f12509h = i2;
        this.f12510i = i3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheProgress");
        hashMap.put("src", this.f12507f);
        hashMap.put("cachedSrc", this.f12508g);
        hashMap.put("bytesLoaded", Integer.toString(this.f12509h));
        hashMap.put("totalBytes", Integer.toString(this.f12510i));
        hashMap.put("cacheReady", this.f12511j ? "1" : "0");
        this.f12512k.m("onPrecacheEvent", hashMap);
    }
}
