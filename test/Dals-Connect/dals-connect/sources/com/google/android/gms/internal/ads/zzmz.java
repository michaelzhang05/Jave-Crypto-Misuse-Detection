package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodec;

/* loaded from: classes2.dex */
public final class zzmz {
    public byte[] a;

    /* renamed from: b, reason: collision with root package name */
    private byte[] f15304b;

    /* renamed from: c, reason: collision with root package name */
    private int f15305c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f15306d;

    /* renamed from: e, reason: collision with root package name */
    public int[] f15307e;

    /* renamed from: f, reason: collision with root package name */
    private int f15308f;

    /* renamed from: g, reason: collision with root package name */
    private int f15309g;

    /* renamed from: h, reason: collision with root package name */
    private int f15310h;

    /* renamed from: i, reason: collision with root package name */
    private final MediaCodec.CryptoInfo f15311i;

    /* renamed from: j, reason: collision with root package name */
    private final l10 f15312j;

    public zzmz() {
        int i2 = zzsy.a;
        MediaCodec.CryptoInfo cryptoInfo = i2 >= 16 ? new MediaCodec.CryptoInfo() : null;
        this.f15311i = cryptoInfo;
        this.f15312j = i2 >= 24 ? new l10(cryptoInfo) : null;
    }

    public final void a(int i2, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i3) {
        this.f15308f = i2;
        this.f15306d = iArr;
        this.f15307e = iArr2;
        this.f15304b = bArr;
        this.a = bArr2;
        this.f15305c = i3;
        this.f15309g = 0;
        this.f15310h = 0;
        int i4 = zzsy.a;
        if (i4 >= 16) {
            MediaCodec.CryptoInfo cryptoInfo = this.f15311i;
            cryptoInfo.numSubSamples = i2;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr;
            cryptoInfo.iv = bArr2;
            cryptoInfo.mode = i3;
            if (i4 >= 24) {
                this.f15312j.a(0, 0);
            }
        }
    }

    @TargetApi(16)
    public final MediaCodec.CryptoInfo b() {
        return this.f15311i;
    }
}
