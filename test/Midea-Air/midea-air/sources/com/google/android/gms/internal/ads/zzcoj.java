package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public class zzcoj extends zzamw {

    /* renamed from: f, reason: collision with root package name */
    private final zzbri f14285f;

    /* renamed from: g, reason: collision with root package name */
    private final zzbrt f14286g;

    /* renamed from: h, reason: collision with root package name */
    private final zzbse f14287h;

    /* renamed from: i, reason: collision with root package name */
    private final zzbso f14288i;

    /* renamed from: j, reason: collision with root package name */
    private final zzbtp f14289j;

    /* renamed from: k, reason: collision with root package name */
    private final zzbsv f14290k;
    private final zzbvq l;

    public zzcoj(zzbri zzbriVar, zzbrt zzbrtVar, zzbse zzbseVar, zzbso zzbsoVar, zzbtp zzbtpVar, zzbsv zzbsvVar, zzbvq zzbvqVar) {
        this.f14285f = zzbriVar;
        this.f14286g = zzbrtVar;
        this.f14287h = zzbseVar;
        this.f14288i = zzbsoVar;
        this.f14289j = zzbtpVar;
        this.f14290k = zzbsvVar;
        this.l = zzbvqVar;
    }

    public void E(int i2) throws RemoteException {
    }

    public void G5(zzato zzatoVar) {
    }

    public void H0() {
        this.l.i0();
    }

    public void S() {
        this.l.Y();
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final void U0(zzamy zzamyVar) {
    }

    public void Y(zzatq zzatqVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final void h3(String str) {
    }

    public void h7() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final void j0(zzafe zzafeVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final void onAdClicked() {
        this.f14285f.onAdClicked();
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final void onAdClosed() {
        this.f14290k.zzsz();
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final void onAdFailedToLoad(int i2) {
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final void onAdImpression() {
        this.f14286g.Y();
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final void onAdLeftApplication() {
        this.f14287h.f0();
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final void onAdLoaded() {
        this.f14288i.onAdLoaded();
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final void onAdOpened() {
        this.f14290k.zzta();
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final void onAppEvent(String str, String str2) {
        this.f14289j.onAppEvent(str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final void onVideoPause() {
        this.l.f0();
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final void onVideoPlay() throws RemoteException {
        this.l.g0();
    }

    public void zzb(Bundle bundle) throws RemoteException {
    }
}
