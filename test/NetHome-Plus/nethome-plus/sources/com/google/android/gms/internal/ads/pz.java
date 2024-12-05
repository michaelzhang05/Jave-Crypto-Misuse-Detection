package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.AudioTimestamp;
import android.media.AudioTrack;

@TargetApi(19)
/* loaded from: classes2.dex */
final class pz extends oz {

    /* renamed from: g, reason: collision with root package name */
    private final AudioTimestamp f12020g;

    /* renamed from: h, reason: collision with root package name */
    private long f12021h;

    /* renamed from: i, reason: collision with root package name */
    private long f12022i;

    /* renamed from: j, reason: collision with root package name */
    private long f12023j;

    public pz() {
        super(null);
        this.f12020g = new AudioTimestamp();
    }

    @Override // com.google.android.gms.internal.ads.oz
    public final void a(AudioTrack audioTrack, boolean z) {
        super.a(audioTrack, z);
        this.f12021h = 0L;
        this.f12022i = 0L;
        this.f12023j = 0L;
    }

    @Override // com.google.android.gms.internal.ads.oz
    public final boolean e() {
        boolean timestamp = this.a.getTimestamp(this.f12020g);
        if (timestamp) {
            long j2 = this.f12020g.framePosition;
            if (this.f12022i > j2) {
                this.f12021h++;
            }
            this.f12022i = j2;
            this.f12023j = j2 + (this.f12021h << 32);
        }
        return timestamp;
    }

    @Override // com.google.android.gms.internal.ads.oz
    public final long f() {
        return this.f12020g.nanoTime;
    }

    @Override // com.google.android.gms.internal.ads.oz
    public final long g() {
        return this.f12023j;
    }
}
