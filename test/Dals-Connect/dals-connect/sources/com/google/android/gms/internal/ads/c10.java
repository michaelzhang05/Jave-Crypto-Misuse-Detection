package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.SystemClock;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class c10 {
    protected AudioTrack a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f11191b;

    /* renamed from: c, reason: collision with root package name */
    private int f11192c;

    /* renamed from: d, reason: collision with root package name */
    private long f11193d;

    /* renamed from: e, reason: collision with root package name */
    private long f11194e;

    /* renamed from: f, reason: collision with root package name */
    private long f11195f;

    /* renamed from: g, reason: collision with root package name */
    private long f11196g;

    /* renamed from: h, reason: collision with root package name */
    private long f11197h;

    /* renamed from: i, reason: collision with root package name */
    private long f11198i;

    private c10() {
    }

    public final void a() {
        if (this.f11196g != -9223372036854775807L) {
            return;
        }
        this.a.pause();
    }

    public void b(AudioTrack audioTrack, boolean z) {
        this.a = audioTrack;
        this.f11191b = z;
        this.f11196g = -9223372036854775807L;
        this.f11193d = 0L;
        this.f11194e = 0L;
        this.f11195f = 0L;
        if (audioTrack != null) {
            this.f11192c = audioTrack.getSampleRate();
        }
    }

    public final long c() {
        return (e() * 1000000) / this.f11192c;
    }

    public final void d(long j2) {
        this.f11197h = e();
        this.f11196g = SystemClock.elapsedRealtime() * 1000;
        this.f11198i = j2;
        this.a.stop();
    }

    public final long e() {
        if (this.f11196g != -9223372036854775807L) {
            return Math.min(this.f11198i, this.f11197h + ((((SystemClock.elapsedRealtime() * 1000) - this.f11196g) * this.f11192c) / 1000000));
        }
        int playState = this.a.getPlayState();
        if (playState == 1) {
            return 0L;
        }
        long playbackHeadPosition = 4294967295L & this.a.getPlaybackHeadPosition();
        if (this.f11191b) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.f11195f = this.f11193d;
            }
            playbackHeadPosition += this.f11195f;
        }
        if (this.f11193d > playbackHeadPosition) {
            this.f11194e++;
        }
        this.f11193d = playbackHeadPosition;
        return playbackHeadPosition + (this.f11194e << 32);
    }

    public boolean f() {
        return false;
    }

    public long g() {
        throw new UnsupportedOperationException();
    }

    public long h() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ c10(b10 b10Var) {
        this();
    }
}
