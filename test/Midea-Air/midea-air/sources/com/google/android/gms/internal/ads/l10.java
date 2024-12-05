package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodec;

@TargetApi(24)
/* loaded from: classes2.dex */
final class l10 {
    private final MediaCodec.CryptoInfo a;

    /* renamed from: b, reason: collision with root package name */
    private final MediaCodec.CryptoInfo.Pattern f11747b;

    private l10(MediaCodec.CryptoInfo cryptoInfo) {
        this.a = cryptoInfo;
        this.f11747b = new MediaCodec.CryptoInfo.Pattern(0, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(int i2, int i3) {
        this.f11747b.set(i2, i3);
        this.a.setPattern(this.f11747b);
    }
}
