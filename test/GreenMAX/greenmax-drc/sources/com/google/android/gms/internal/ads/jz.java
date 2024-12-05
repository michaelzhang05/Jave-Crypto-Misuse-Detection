package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

@TargetApi(21)
/* loaded from: classes2.dex */
final class jz implements hz {
    private final int a;

    /* renamed from: b, reason: collision with root package name */
    private MediaCodecInfo[] f11671b;

    public jz(boolean z) {
        this.a = z ? 1 : 0;
    }

    private final void e() {
        if (this.f11671b == null) {
            this.f11671b = new MediaCodecList(this.a).getCodecInfos();
        }
    }

    @Override // com.google.android.gms.internal.ads.hz
    public final MediaCodecInfo a(int i2) {
        e();
        return this.f11671b[i2];
    }

    @Override // com.google.android.gms.internal.ads.hz
    public final boolean b() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.hz
    public final int c() {
        e();
        return this.f11671b.length;
    }

    @Override // com.google.android.gms.internal.ads.hz
    public final boolean d(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }
}
