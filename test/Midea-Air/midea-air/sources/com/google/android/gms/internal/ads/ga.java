package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class ga implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ String f11472f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ String f11473g;

    /* renamed from: h, reason: collision with root package name */
    private final /* synthetic */ String f11474h;

    /* renamed from: i, reason: collision with root package name */
    private final /* synthetic */ String f11475i;

    /* renamed from: j, reason: collision with root package name */
    private final /* synthetic */ zzbft f11476j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ga(zzbft zzbftVar, String str, String str2, String str3, String str4) {
        this.f11476j = zzbftVar;
        this.f11472f = str;
        this.f11473g = str2;
        this.f11474h = str3;
        this.f11475i = str4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String A;
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheCanceled");
        hashMap.put("src", this.f11472f);
        if (!TextUtils.isEmpty(this.f11473g)) {
            hashMap.put("cachedSrc", this.f11473g);
        }
        zzbft zzbftVar = this.f11476j;
        A = zzbft.A(this.f11474h);
        hashMap.put("type", A);
        hashMap.put("reason", this.f11474h);
        if (!TextUtils.isEmpty(this.f11475i)) {
            hashMap.put("message", this.f11475i);
        }
        this.f11476j.m("onPrecacheEvent", hashMap);
    }
}
