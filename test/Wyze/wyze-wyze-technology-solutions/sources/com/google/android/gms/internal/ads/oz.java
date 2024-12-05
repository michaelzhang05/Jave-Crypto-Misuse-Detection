package com.google.android.gms.internal.ads;

import android.media.AudioTrack;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class oz {
    protected AudioTrack a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f11956b;

    /* renamed from: c, reason: collision with root package name */
    private int f11957c;

    /* renamed from: d, reason: collision with root package name */
    private long f11958d;

    /* renamed from: e, reason: collision with root package name */
    private long f11959e;

    /* renamed from: f, reason: collision with root package name */
    private long f11960f;

    private oz() {
    }

    public void a(AudioTrack audioTrack, boolean z) {
        this.a = audioTrack;
        this.f11956b = z;
        this.f11958d = 0L;
        this.f11959e = 0L;
        this.f11960f = 0L;
        if (audioTrack != null) {
            this.f11957c = audioTrack.getSampleRate();
        }
    }

    public final boolean b() {
        return zzkq.a <= 22 && this.f11956b && this.a.getPlayState() == 2 && this.a.getPlaybackHeadPosition() == 0;
    }

    public final long c() {
        long playbackHeadPosition = this.a.getPlaybackHeadPosition() & 4294967295L;
        if (zzkq.a <= 22 && this.f11956b) {
            if (this.a.getPlayState() == 1) {
                this.f11958d = playbackHeadPosition;
            } else if (this.a.getPlayState() == 2 && playbackHeadPosition == 0) {
                this.f11960f = this.f11958d;
            }
            playbackHeadPosition += this.f11960f;
        }
        if (this.f11958d > playbackHeadPosition) {
            this.f11959e++;
        }
        this.f11958d = playbackHeadPosition;
        return playbackHeadPosition + (this.f11959e << 32);
    }

    public final long d() {
        return (c() * 1000000) / this.f11957c;
    }

    public boolean e() {
        return false;
    }

    public long f() {
        throw new UnsupportedOperationException();
    }

    public long g() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ oz(nz nzVar) {
        this();
    }
}
