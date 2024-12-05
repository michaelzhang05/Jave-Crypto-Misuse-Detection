package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.view.Surface;
import java.lang.ref.WeakReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class k8 implements zzhh {
    private WeakReference<zzhh> a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ zzbdk f11696b;

    private k8(zzbdk zzbdkVar) {
        this.f11696b = zzbdkVar;
        this.a = new WeakReference<>(null);
    }

    @Override // com.google.android.gms.internal.ads.zzhh
    public final void a(int i2, long j2) {
        zzhh zzhhVar = this.a.get();
        if (zzhhVar != null) {
            zzhhVar.a(i2, j2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgw
    public final void b(MediaCodec.CryptoException cryptoException) {
        this.f11696b.f("CryptoError", cryptoException.getMessage());
        zzhh zzhhVar = this.a.get();
        if (zzhhVar != null) {
            zzhhVar.b(cryptoException);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgw
    public final void c(String str, long j2, long j3) {
        zzhh zzhhVar = this.a.get();
        if (zzhhVar != null) {
            zzhhVar.c(str, j2, j3);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgw
    public final void d(zzgv zzgvVar) {
        this.f11696b.f("DecoderInitializationError", zzgvVar.getMessage());
        zzhh zzhhVar = this.a.get();
        if (zzhhVar != null) {
            zzhhVar.d(zzgvVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhh
    public final void e(int i2, int i3, float f2) {
        zzhh zzhhVar = this.a.get();
        if (zzhhVar != null) {
            zzhhVar.e(i2, i3, f2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhh
    public final void g(Surface surface) {
        zzhh zzhhVar = this.a.get();
        if (zzhhVar != null) {
            zzhhVar.g(surface);
        }
    }

    public final void i(zzhh zzhhVar) {
        this.a = new WeakReference<>(zzhhVar);
    }
}
