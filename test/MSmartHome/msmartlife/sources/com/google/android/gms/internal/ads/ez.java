package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class ez implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ MediaCodec.CryptoException f11374f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ zzgr f11375g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ez(zzgr zzgrVar, MediaCodec.CryptoException cryptoException) {
        this.f11375g = zzgrVar;
        this.f11374f = cryptoException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzgw zzgwVar;
        zzgwVar = this.f11375g.f15083j;
        zzgwVar.b(this.f11374f);
    }
}
