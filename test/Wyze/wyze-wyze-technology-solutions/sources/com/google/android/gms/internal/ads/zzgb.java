package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaExtractor;

/* loaded from: classes2.dex */
public final class zzgb {
    public byte[] a;

    /* renamed from: b, reason: collision with root package name */
    private byte[] f15057b;

    /* renamed from: c, reason: collision with root package name */
    private int f15058c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f15059d;

    /* renamed from: e, reason: collision with root package name */
    public int[] f15060e;

    /* renamed from: f, reason: collision with root package name */
    private int f15061f;

    /* renamed from: g, reason: collision with root package name */
    private final MediaCodec.CryptoInfo f15062g;

    public zzgb() {
        this.f15062g = zzkq.a >= 16 ? new MediaCodec.CryptoInfo() : null;
    }

    public final void a(int i2, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i3) {
        this.f15061f = i2;
        this.f15059d = iArr;
        this.f15060e = iArr2;
        this.f15057b = bArr;
        this.a = bArr2;
        this.f15058c = 1;
        if (zzkq.a >= 16) {
            this.f15062g.set(i2, iArr, iArr2, bArr, bArr2, 1);
        }
    }

    @TargetApi(16)
    public final void b(MediaExtractor mediaExtractor) {
        mediaExtractor.getSampleCryptoInfo(this.f15062g);
        MediaCodec.CryptoInfo cryptoInfo = this.f15062g;
        this.f15061f = cryptoInfo.numSubSamples;
        this.f15059d = cryptoInfo.numBytesOfClearData;
        this.f15060e = cryptoInfo.numBytesOfEncryptedData;
        this.f15057b = cryptoInfo.key;
        this.a = cryptoInfo.iv;
        this.f15058c = cryptoInfo.mode;
    }

    @TargetApi(16)
    public final MediaCodec.CryptoInfo c() {
        return this.f15062g;
    }
}
