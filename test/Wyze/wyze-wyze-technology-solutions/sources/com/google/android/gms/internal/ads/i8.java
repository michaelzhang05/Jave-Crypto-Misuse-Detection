package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import java.lang.ref.WeakReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class i8 implements zzgq {
    private WeakReference<zzgq> a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ zzbdk f11583b;

    private i8(zzbdk zzbdkVar) {
        this.f11583b = zzbdkVar;
        this.a = new WeakReference<>(null);
    }

    @Override // com.google.android.gms.internal.ads.zzgw
    public final void b(MediaCodec.CryptoException cryptoException) {
        this.f11583b.f("CryptoError", cryptoException.getMessage());
        zzgq zzgqVar = this.a.get();
        if (zzgqVar != null) {
            zzgqVar.b(cryptoException);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgw
    public final void c(String str, long j2, long j3) {
        zzgq zzgqVar = this.a.get();
        if (zzgqVar != null) {
            zzgqVar.c(str, j2, j3);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgw
    public final void d(zzgv zzgvVar) {
        this.f11583b.f("DecoderInitializationError", zzgvVar.getMessage());
        zzgq zzgqVar = this.a.get();
        if (zzgqVar != null) {
            zzgqVar.d(zzgvVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgq
    public final void f(zzhu zzhuVar) {
        this.f11583b.f("AudioTrackInitializationError", zzhuVar.getMessage());
        zzgq zzgqVar = this.a.get();
        if (zzgqVar != null) {
            zzgqVar.f(zzhuVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgq
    public final void h(zzhv zzhvVar) {
        this.f11583b.f("AudioTrackWriteError", zzhvVar.getMessage());
        zzgq zzgqVar = this.a.get();
        if (zzgqVar != null) {
            zzgqVar.h(zzhvVar);
        }
    }

    public final void i(zzgq zzgqVar) {
        this.a = new WeakReference<>(zzgqVar);
    }
}
