package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.doubleclick.AppEventListener;

@zzard
/* loaded from: classes2.dex */
public final class zzyf extends zzzt {

    /* renamed from: f, reason: collision with root package name */
    private final AppEventListener f15816f;

    public zzyf(AppEventListener appEventListener) {
        this.f15816f = appEventListener;
    }

    public final AppEventListener I7() {
        return this.f15816f;
    }

    @Override // com.google.android.gms.internal.ads.zzzs
    public final void onAppEvent(String str, String str2) {
        this.f15816f.onAppEvent(str, str2);
    }
}
