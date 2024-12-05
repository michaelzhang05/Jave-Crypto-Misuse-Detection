package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

@TargetApi(21)
/* loaded from: classes2.dex */
final class t20 implements r20 {
    private final int a;

    /* renamed from: b, reason: collision with root package name */
    private MediaCodecInfo[] f12188b;

    public t20(boolean z) {
        this.a = z ? 1 : 0;
    }

    private final void e() {
        if (this.f12188b == null) {
            this.f12188b = new MediaCodecList(this.a).getCodecInfos();
        }
    }

    @Override // com.google.android.gms.internal.ads.r20
    public final MediaCodecInfo a(int i2) {
        e();
        return this.f12188b[i2];
    }

    @Override // com.google.android.gms.internal.ads.r20
    public final boolean b() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.r20
    public final int c() {
        e();
        return this.f12188b.length;
    }

    @Override // com.google.android.gms.internal.ads.r20
    public final boolean d(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }
}
