package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.AudioTrack;
import android.media.MediaFormat;
import android.os.ConditionVariable;
import android.util.Log;
import java.lang.reflect.Method;

@TargetApi(16)
/* loaded from: classes2.dex */
public final class zzhq {
    private boolean A;
    private int B;
    private final ConditionVariable a = new ConditionVariable(true);

    /* renamed from: b */
    private final long[] f15108b;

    /* renamed from: c */
    private final oz f15109c;

    /* renamed from: d */
    private AudioTrack f15110d;

    /* renamed from: e */
    private int f15111e;

    /* renamed from: f */
    private int f15112f;

    /* renamed from: g */
    private int f15113g;

    /* renamed from: h */
    private int f15114h;

    /* renamed from: i */
    private int f15115i;

    /* renamed from: j */
    private int f15116j;

    /* renamed from: k */
    private int f15117k;
    private int l;
    private long m;
    private long n;
    private boolean o;
    private long p;
    private Method q;
    private long r;
    private int s;
    private long t;
    private long u;
    private long v;
    private float w;
    private byte[] x;
    private int y;
    private int z;

    public zzhq() {
        if (zzkq.a >= 18) {
            try {
                this.q = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        if (zzkq.a >= 19) {
            this.f15109c = new pz();
        } else {
            this.f15109c = new oz(null);
        }
        this.f15108b = new long[10];
        this.w = 1.0f;
        this.s = 0;
    }

    private final long i(long j2) {
        if (this.A) {
            if (this.B == 0) {
                return 0L;
            }
            return ((j2 << 3) * this.f15111e) / (r0 * 1000);
        }
        return j2 / this.f15114h;
    }

    private final long j(long j2) {
        return (j2 * 1000000) / this.f15111e;
    }

    private final long k(long j2) {
        return (j2 * this.f15111e) / 1000000;
    }

    private final void o() {
        this.m = 0L;
        this.l = 0;
        this.f15117k = 0;
        this.n = 0L;
        this.o = false;
        this.p = 0L;
    }

    public final boolean a() {
        return this.f15110d != null;
    }

    public final void b() {
        if (a()) {
            o();
            this.f15110d.pause();
        }
    }

    public final void c() {
        if (a()) {
            this.u = System.nanoTime() / 1000;
            this.f15110d.play();
        }
    }

    public final void d() {
        if (a()) {
            this.r = 0L;
            this.z = 0;
            this.t = 0L;
            this.v = 0L;
            o();
            if (this.f15110d.getPlayState() == 3) {
                this.f15110d.pause();
            }
            AudioTrack audioTrack = this.f15110d;
            this.f15110d = null;
            this.f15109c.a(null, false);
            this.a.close();
            new nz(this, audioTrack).start();
        }
    }

    public final void e(float f2) {
        this.w = f2;
        if (a()) {
            if (zzkq.a >= 21) {
                this.f15110d.setVolume(f2);
            } else {
                this.f15110d.setStereoVolume(f2, f2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0101  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int f(java.nio.ByteBuffer r17, int r18, int r19, long r20) throws com.google.android.gms.internal.ads.zzhv {
        /*
            Method dump skipped, instructions count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzhq.f(java.nio.ByteBuffer, int, int, long):int");
    }

    public final void h(MediaFormat mediaFormat, int i2) {
        int i3;
        int i4;
        int integer = mediaFormat.getInteger("channel-count");
        if (integer == 1) {
            i3 = 4;
        } else if (integer == 2) {
            i3 = 12;
        } else if (integer == 6) {
            i3 = 252;
        } else {
            if (integer != 8) {
                StringBuilder sb = new StringBuilder(38);
                sb.append("Unsupported channel count: ");
                sb.append(integer);
                throw new IllegalArgumentException(sb.toString());
            }
            i3 = 1020;
        }
        int integer2 = mediaFormat.getInteger("sample-rate");
        String string = mediaFormat.getString("mime");
        if ("audio/ac3".equals(string)) {
            i4 = 5;
        } else if ("audio/eac3".equals(string)) {
            i4 = 6;
        } else {
            i4 = zzkl.b(string) ? 2 : 0;
        }
        boolean z = i4 == 5 || i4 == 6;
        if (a() && this.f15111e == integer2 && this.f15112f == i3 && !this.A && !z) {
            return;
        }
        d();
        this.f15113g = i4;
        this.f15111e = integer2;
        this.f15112f = i3;
        this.A = z;
        this.B = 0;
        this.f15114h = integer * 2;
        int minBufferSize = AudioTrack.getMinBufferSize(integer2, i3, i4);
        this.f15115i = minBufferSize;
        zzkh.d(minBufferSize != -2);
        int i5 = this.f15115i << 2;
        int k2 = ((int) k(250000L)) * this.f15114h;
        int max = (int) Math.max(this.f15115i, k(750000L) * this.f15114h);
        if (i5 < k2) {
            i5 = k2;
        } else if (i5 > max) {
            i5 = max;
        }
        this.f15116j = i5;
    }

    public final void l() {
        if (this.s == 1) {
            this.s = 2;
        }
    }

    public final boolean m() {
        if (a()) {
            return i(this.r) > this.f15109c.c() || this.f15109c.b();
        }
        return false;
    }

    public final boolean n() {
        return this.r > ((long) ((this.f15115i * 3) / 2));
    }

    public final long p(boolean z) {
        long j2;
        long j3;
        if (!(a() && this.t != 0)) {
            return Long.MIN_VALUE;
        }
        if (this.f15110d.getPlayState() == 3) {
            long d2 = this.f15109c.d();
            if (d2 != 0) {
                long nanoTime = System.nanoTime() / 1000;
                if (nanoTime - this.n >= 30000) {
                    long[] jArr = this.f15108b;
                    int i2 = this.f15117k;
                    jArr[i2] = d2 - nanoTime;
                    this.f15117k = (i2 + 1) % 10;
                    int i3 = this.l;
                    if (i3 < 10) {
                        this.l = i3 + 1;
                    }
                    this.n = nanoTime;
                    this.m = 0L;
                    int i4 = 0;
                    while (true) {
                        int i5 = this.l;
                        if (i4 >= i5) {
                            break;
                        }
                        this.m += this.f15108b[i4] / i5;
                        i4++;
                    }
                }
                if (!this.A && nanoTime - this.p >= 500000) {
                    boolean e2 = this.f15109c.e();
                    this.o = e2;
                    if (e2) {
                        long f2 = this.f15109c.f() / 1000;
                        long g2 = this.f15109c.g();
                        if (f2 < this.u) {
                            this.o = false;
                        } else if (Math.abs(f2 - nanoTime) > 5000000) {
                            this.o = false;
                            StringBuilder sb = new StringBuilder(136);
                            sb.append("Spurious audio timestamp (system clock mismatch): ");
                            sb.append(g2);
                            sb.append(", ");
                            sb.append(f2);
                            sb.append(", ");
                            sb.append(nanoTime);
                            sb.append(", ");
                            sb.append(d2);
                            Log.w("AudioTrack", sb.toString());
                        } else if (Math.abs(j(g2) - d2) > 5000000) {
                            this.o = false;
                            StringBuilder sb2 = new StringBuilder(138);
                            sb2.append("Spurious audio timestamp (frame position mismatch): ");
                            sb2.append(g2);
                            sb2.append(", ");
                            sb2.append(f2);
                            sb2.append(", ");
                            sb2.append(nanoTime);
                            sb2.append(", ");
                            sb2.append(d2);
                            Log.w("AudioTrack", sb2.toString());
                        }
                    }
                    if (this.q != null) {
                        try {
                            long intValue = (((Integer) r1.invoke(this.f15110d, null)).intValue() * 1000) - j(i(this.f15116j));
                            this.v = intValue;
                            long max = Math.max(intValue, 0L);
                            this.v = max;
                            if (max > 5000000) {
                                StringBuilder sb3 = new StringBuilder(61);
                                sb3.append("Ignoring impossibly large audio latency: ");
                                sb3.append(max);
                                Log.w("AudioTrack", sb3.toString());
                                this.v = 0L;
                            }
                        } catch (Exception unused) {
                            this.q = null;
                        }
                    }
                    this.p = nanoTime;
                }
            }
        }
        long nanoTime2 = System.nanoTime() / 1000;
        if (this.o) {
            return j(this.f15109c.g() + k(nanoTime2 - (this.f15109c.f() / 1000))) + this.t;
        }
        if (this.l == 0) {
            j2 = this.f15109c.d();
            j3 = this.t;
        } else {
            j2 = nanoTime2 + this.m;
            j3 = this.t;
        }
        long j4 = j2 + j3;
        return !z ? j4 - this.v : j4;
    }

    public final int q(int i2) throws zzhu {
        this.a.block();
        if (i2 == 0) {
            this.f15110d = new AudioTrack(3, this.f15111e, this.f15112f, this.f15113g, this.f15116j, 1);
        } else {
            this.f15110d = new AudioTrack(3, this.f15111e, this.f15112f, this.f15113g, this.f15116j, 1, i2);
        }
        int state = this.f15110d.getState();
        if (state == 1) {
            int audioSessionId = this.f15110d.getAudioSessionId();
            this.f15109c.a(this.f15110d, this.A);
            e(this.w);
            return audioSessionId;
        }
        try {
            this.f15110d.release();
        } catch (Exception unused) {
        } finally {
            this.f15110d = null;
        }
        throw new zzhu(state, this.f15111e, this.f15112f, this.f15116j);
    }
}
