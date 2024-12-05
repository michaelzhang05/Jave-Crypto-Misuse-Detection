package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class ph implements com.google.android.gms.ads.internal.overlay.zzo, com.google.android.gms.ads.internal.overlay.zzu, zzagv, zzagx, zzxr {

    /* renamed from: f, reason: collision with root package name */
    private zzxr f11989f;

    /* renamed from: g, reason: collision with root package name */
    private zzagv f11990g;

    /* renamed from: h, reason: collision with root package name */
    private com.google.android.gms.ads.internal.overlay.zzo f11991h;

    /* renamed from: i, reason: collision with root package name */
    private zzagx f11992i;

    /* renamed from: j, reason: collision with root package name */
    private com.google.android.gms.ads.internal.overlay.zzu f11993j;

    private ph() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void b(zzxr zzxrVar, zzagv zzagvVar, com.google.android.gms.ads.internal.overlay.zzo zzoVar, zzagx zzagxVar, com.google.android.gms.ads.internal.overlay.zzu zzuVar) {
        this.f11989f = zzxrVar;
        this.f11990g = zzagvVar;
        this.f11991h = zzoVar;
        this.f11992i = zzagxVar;
        this.f11993j = zzuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzagv
    public final synchronized void k(String str, Bundle bundle) {
        zzagv zzagvVar = this.f11990g;
        if (zzagvVar != null) {
            zzagvVar.k(str, bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxr
    public final synchronized void onAdClicked() {
        zzxr zzxrVar = this.f11989f;
        if (zzxrVar != null) {
            zzxrVar.onAdClicked();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzagx
    public final synchronized void onAppEvent(String str, String str2) {
        zzagx zzagxVar = this.f11992i;
        if (zzagxVar != null) {
            zzagxVar.onAppEvent(str, str2);
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void onPause() {
        com.google.android.gms.ads.internal.overlay.zzo zzoVar = this.f11991h;
        if (zzoVar != null) {
            zzoVar.onPause();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void onResume() {
        com.google.android.gms.ads.internal.overlay.zzo zzoVar = this.f11991h;
        if (zzoVar != null) {
            zzoVar.onResume();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzsz() {
        com.google.android.gms.ads.internal.overlay.zzo zzoVar = this.f11991h;
        if (zzoVar != null) {
            zzoVar.zzsz();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzta() {
        com.google.android.gms.ads.internal.overlay.zzo zzoVar = this.f11991h;
        if (zzoVar != null) {
            zzoVar.zzta();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzu
    public final synchronized void zztq() {
        com.google.android.gms.ads.internal.overlay.zzu zzuVar = this.f11993j;
        if (zzuVar != null) {
            zzuVar.zztq();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ ph(lh lhVar) {
        this();
    }
}
