package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class ea implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ String f11345f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ String f11346g;

    /* renamed from: h, reason: collision with root package name */
    private final /* synthetic */ int f11347h;

    /* renamed from: i, reason: collision with root package name */
    private final /* synthetic */ zzbft f11348i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ea(zzbft zzbftVar, String str, String str2, int i2) {
        this.f11348i = zzbftVar;
        this.f11345f = str;
        this.f11346g = str2;
        this.f11347h = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheComplete");
        hashMap.put("src", this.f11345f);
        hashMap.put("cachedSrc", this.f11346g);
        hashMap.put("totalBytes", Integer.toString(this.f11347h));
        this.f11348i.m("onPrecacheEvent", hashMap);
    }
}
