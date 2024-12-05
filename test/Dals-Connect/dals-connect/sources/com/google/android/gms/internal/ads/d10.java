package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.AudioTimestamp;
import android.media.AudioTrack;

/* JADX INFO: Access modifiers changed from: package-private */
@TargetApi(19)
/* loaded from: classes2.dex */
public final class d10 extends c10 {

    /* renamed from: j, reason: collision with root package name */
    private final AudioTimestamp f11268j;

    /* renamed from: k, reason: collision with root package name */
    private long f11269k;
    private long l;
    private long m;

    public d10() {
        super(null);
        this.f11268j = new AudioTimestamp();
    }

    @Override // com.google.android.gms.internal.ads.c10
    public final void b(AudioTrack audioTrack, boolean z) {
        super.b(audioTrack, z);
        this.f11269k = 0L;
        this.l = 0L;
        this.m = 0L;
    }

    @Override // com.google.android.gms.internal.ads.c10
    public final boolean f() {
        boolean timestamp = this.a.getTimestamp(this.f11268j);
        if (timestamp) {
            long j2 = this.f11268j.framePosition;
            if (this.l > j2) {
                this.f11269k++;
            }
            this.l = j2;
            this.m = j2 + (this.f11269k << 32);
        }
        return timestamp;
    }

    @Override // com.google.android.gms.internal.ads.c10
    public final long g() {
        return this.f11268j.nanoTime;
    }

    @Override // com.google.android.gms.internal.ads.c10
    public final long h() {
        return this.m;
    }
}
