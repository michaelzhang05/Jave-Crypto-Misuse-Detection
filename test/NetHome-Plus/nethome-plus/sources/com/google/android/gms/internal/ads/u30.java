package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.os.Handler;

@TargetApi(23)
/* loaded from: classes2.dex */
final class u30 implements MediaCodec.OnFrameRenderedListener {
    private final /* synthetic */ zzth a;

    private u30(zzth zzthVar, MediaCodec mediaCodec) {
        this.a = zzthVar;
        mediaCodec.setOnFrameRenderedListener(this, new Handler());
    }

    @Override // android.media.MediaCodec.OnFrameRenderedListener
    public final void onFrameRendered(MediaCodec mediaCodec, long j2, long j3) {
        zzth zzthVar = this.a;
        if (this != zzthVar.z0) {
            return;
        }
        zzthVar.l0();
    }
}
