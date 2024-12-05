package com.google.android.gms.internal.ads;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.ConditionVariable;
import android.os.SystemClock;
import android.util.Log;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.LinkedList;
import okhttp3.internal.ws.RealWebSocket;

/* loaded from: classes2.dex */
public final class zzmh {
    private long A;
    private long B;
    private boolean C;
    private long D;
    private Method E;
    private int F;
    private long G;
    private long H;
    private int I;
    private long J;
    private long K;
    private int L;
    private int M;
    private long N;
    private long O;
    private long P;
    private float Q;
    private zzlx[] R;
    private ByteBuffer[] S;
    private ByteBuffer T;
    private ByteBuffer U;
    private byte[] V;
    private int W;
    private int X;
    private boolean Y;
    private boolean Z;
    private int a0;

    /* renamed from: b, reason: collision with root package name */
    private final f10 f15280b;
    private boolean b0;

    /* renamed from: c, reason: collision with root package name */
    private final zzmx f15281c;
    private boolean c0;

    /* renamed from: d, reason: collision with root package name */
    private final zzlx[] f15282d;
    private long d0;

    /* renamed from: e, reason: collision with root package name */
    private final zzmn f15283e;

    /* renamed from: g, reason: collision with root package name */
    private final long[] f15285g;

    /* renamed from: h, reason: collision with root package name */
    private final c10 f15286h;

    /* renamed from: i, reason: collision with root package name */
    private final LinkedList<e10> f15287i;

    /* renamed from: j, reason: collision with root package name */
    private AudioTrack f15288j;

    /* renamed from: k, reason: collision with root package name */
    private int f15289k;
    private int l;
    private int m;
    private int n;
    private int o;
    private boolean p;
    private int q;
    private long r;
    private zzln s;
    private zzln t;
    private long u;
    private long v;
    private ByteBuffer w;
    private int x;
    private int y;
    private int z;
    private final zzlw a = null;

    /* renamed from: f, reason: collision with root package name */
    private final ConditionVariable f15284f = new ConditionVariable(true);

    public zzmh(zzlw zzlwVar, zzlx[] zzlxVarArr, zzmn zzmnVar) {
        b10 b10Var = null;
        this.f15283e = zzmnVar;
        if (zzsy.a >= 18) {
            try {
                this.E = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        if (zzsy.a >= 19) {
            this.f15286h = new d10();
        } else {
            this.f15286h = new c10(b10Var);
        }
        f10 f10Var = new f10();
        this.f15280b = f10Var;
        zzmx zzmxVar = new zzmx();
        this.f15281c = zzmxVar;
        zzlx[] zzlxVarArr2 = new zzlx[zzlxVarArr.length + 3];
        this.f15282d = zzlxVarArr2;
        zzlxVarArr2[0] = new i10();
        zzlxVarArr2[1] = f10Var;
        System.arraycopy(zzlxVarArr, 0, zzlxVarArr2, 2, zzlxVarArr.length);
        zzlxVarArr2[zzlxVarArr.length + 2] = zzmxVar;
        this.f15285g = new long[10];
        this.Q = 1.0f;
        this.M = 0;
        this.o = 3;
        this.a0 = 0;
        this.t = zzln.a;
        this.X = -1;
        this.R = new zzlx[0];
        this.S = new ByteBuffer[0];
        this.f15287i = new LinkedList<>();
    }

    private final void C() {
        if (a()) {
            if (zzsy.a >= 21) {
                this.f15288j.setVolume(this.Q);
                return;
            }
            AudioTrack audioTrack = this.f15288j;
            float f2 = this.Q;
            audioTrack.setStereoVolume(f2, f2);
        }
    }

    private final long D() {
        return this.p ? this.K : this.J / this.I;
    }

    private final boolean E() {
        if (zzsy.a >= 23) {
            return false;
        }
        int i2 = this.n;
        return i2 == 5 || i2 == 6;
    }

    private final boolean a() {
        return this.f15288j != null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00d7, code lost:
    
        if (r11 < r10) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean n(java.nio.ByteBuffer r9, long r10) throws com.google.android.gms.internal.ads.zzmp {
        /*
            Method dump skipped, instructions count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzmh.n(java.nio.ByteBuffer, long):boolean");
    }

    private static int o(String str) {
        str.hashCode();
        char c2 = 65535;
        switch (str.hashCode()) {
            case -1095064472:
                if (str.equals("audio/vnd.dts")) {
                    c2 = 0;
                    break;
                }
                break;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    c2 = 1;
                    break;
                }
                break;
            case 1504578661:
                if (str.equals("audio/eac3")) {
                    c2 = 2;
                    break;
                }
                break;
            case 1505942594:
                if (str.equals("audio/vnd.dts.hd")) {
                    c2 = 3;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                return 7;
            case 1:
                return 5;
            case 2:
                return 6;
            case 3:
                return 8;
            default:
                return 0;
        }
    }

    private final long p(long j2) {
        return (j2 * 1000000) / this.f15289k;
    }

    private final long q(long j2) {
        return (j2 * this.f15289k) / 1000000;
    }

    private final void s(long j2) throws zzmp {
        ByteBuffer byteBuffer;
        int length = this.R.length;
        int i2 = length;
        while (i2 >= 0) {
            if (i2 > 0) {
                byteBuffer = this.S[i2 - 1];
            } else {
                byteBuffer = this.T;
                if (byteBuffer == null) {
                    byteBuffer = zzlx.a;
                }
            }
            if (i2 == length) {
                n(byteBuffer, j2);
            } else {
                zzlx zzlxVar = this.R[i2];
                zzlxVar.h(byteBuffer);
                ByteBuffer d2 = zzlxVar.d();
                this.S[i2] = d2;
                if (d2.hasRemaining()) {
                    i2++;
                }
            }
            if (byteBuffer.hasRemaining()) {
                return;
            } else {
                i2--;
            }
        }
    }

    private final void v() {
        this.A = 0L;
        this.z = 0;
        this.y = 0;
        this.B = 0L;
        this.C = false;
        this.D = 0L;
    }

    private final void x() {
        ArrayList arrayList = new ArrayList();
        for (zzlx zzlxVar : this.f15282d) {
            if (zzlxVar.b()) {
                arrayList.add(zzlxVar);
            } else {
                zzlxVar.flush();
            }
        }
        int size = arrayList.size();
        this.R = (zzlx[]) arrayList.toArray(new zzlx[size]);
        this.S = new ByteBuffer[size];
        for (int i2 = 0; i2 < size; i2++) {
            zzlx zzlxVar2 = this.R[i2];
            zzlxVar2.flush();
            this.S[i2] = zzlxVar2.d();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0032 -> B:7:0x0012). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean z() throws com.google.android.gms.internal.ads.zzmp {
        /*
            r9 = this;
            int r0 = r9.X
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 != r1) goto L14
            boolean r0 = r9.p
            if (r0 == 0) goto Lf
            com.google.android.gms.internal.ads.zzlx[] r0 = r9.R
            int r0 = r0.length
            goto L10
        Lf:
            r0 = 0
        L10:
            r9.X = r0
        L12:
            r0 = 1
            goto L15
        L14:
            r0 = 0
        L15:
            int r4 = r9.X
            com.google.android.gms.internal.ads.zzlx[] r5 = r9.R
            int r6 = r5.length
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r6) goto L38
            r4 = r5[r4]
            if (r0 == 0) goto L28
            r4.c()
        L28:
            r9.s(r7)
            boolean r0 = r4.q()
            if (r0 != 0) goto L32
            return r3
        L32:
            int r0 = r9.X
            int r0 = r0 + r2
            r9.X = r0
            goto L12
        L38:
            java.nio.ByteBuffer r0 = r9.U
            if (r0 == 0) goto L44
            r9.n(r0, r7)
            java.nio.ByteBuffer r0 = r9.U
            if (r0 == 0) goto L44
            return r3
        L44:
            r9.X = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzmh.z():boolean");
    }

    public final zzln A() {
        return this.t;
    }

    public final void B() {
        if (this.b0) {
            this.b0 = false;
            this.a0 = 0;
            e();
        }
    }

    public final void b() {
        this.Z = false;
        if (a()) {
            v();
            this.f15286h.a();
        }
    }

    public final void c() {
        this.Z = true;
        if (a()) {
            this.O = System.nanoTime() / 1000;
            this.f15288j.play();
        }
    }

    public final void d() {
        e();
        for (zzlx zzlxVar : this.f15282d) {
            zzlxVar.a();
        }
        this.a0 = 0;
        this.Z = false;
    }

    public final void e() {
        if (a()) {
            this.G = 0L;
            this.H = 0L;
            this.J = 0L;
            this.K = 0L;
            this.L = 0;
            zzln zzlnVar = this.s;
            if (zzlnVar != null) {
                this.t = zzlnVar;
                this.s = null;
            } else if (!this.f15287i.isEmpty()) {
                this.t = e10.a(this.f15287i.getLast());
            }
            this.f15287i.clear();
            this.u = 0L;
            this.v = 0L;
            this.T = null;
            this.U = null;
            int i2 = 0;
            while (true) {
                zzlx[] zzlxVarArr = this.R;
                if (i2 >= zzlxVarArr.length) {
                    break;
                }
                zzlx zzlxVar = zzlxVarArr[i2];
                zzlxVar.flush();
                this.S[i2] = zzlxVar.d();
                i2++;
            }
            this.Y = false;
            this.X = -1;
            this.w = null;
            this.x = 0;
            this.M = 0;
            this.P = 0L;
            v();
            if (this.f15288j.getPlayState() == 3) {
                this.f15288j.pause();
            }
            AudioTrack audioTrack = this.f15288j;
            this.f15288j = null;
            this.f15286h.b(null, false);
            this.f15284f.close();
            new b10(this, audioTrack).start();
        }
    }

    public final void f(int i2) {
        if (this.o == i2) {
            return;
        }
        this.o = i2;
        if (this.b0) {
            return;
        }
        e();
        this.a0 = 0;
    }

    public final void g(float f2) {
        if (this.Q != f2) {
            this.Q = f2;
            C();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(java.lang.String r9, int r10, int r11, int r12, int r13, int[] r14) throws com.google.android.gms.internal.ads.zzml {
        /*
            Method dump skipped, instructions count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzmh.i(java.lang.String, int, int, int, int, int[]):void");
    }

    public final boolean j(ByteBuffer byteBuffer, long j2) throws zzmm, zzmp {
        int i2;
        int a;
        ByteBuffer byteBuffer2 = this.T;
        zzsk.a(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (!a()) {
            this.f15284f.block();
            if (this.b0) {
                this.f15288j = new AudioTrack(new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(16).build(), new AudioFormat.Builder().setChannelMask(this.l).setEncoding(this.n).setSampleRate(this.f15289k).build(), this.q, 1, this.a0);
            } else if (this.a0 == 0) {
                this.f15288j = new AudioTrack(this.o, this.f15289k, this.l, this.n, this.q, 1);
            } else {
                this.f15288j = new AudioTrack(this.o, this.f15289k, this.l, this.n, this.q, 1, this.a0);
            }
            int state = this.f15288j.getState();
            if (state == 1) {
                int audioSessionId = this.f15288j.getAudioSessionId();
                if (this.a0 != audioSessionId) {
                    this.a0 = audioSessionId;
                    this.f15283e.a(audioSessionId);
                }
                this.f15286h.b(this.f15288j, E());
                C();
                this.c0 = false;
                if (this.Z) {
                    c();
                }
            } else {
                try {
                    this.f15288j.release();
                } catch (Exception unused) {
                } finally {
                    this.f15288j = null;
                }
                throw new zzmm(state, this.f15289k, this.l, this.q);
            }
        }
        if (E()) {
            if (this.f15288j.getPlayState() == 2) {
                this.c0 = false;
                return false;
            }
            if (this.f15288j.getPlayState() == 1 && this.f15286h.e() != 0) {
                return false;
            }
        }
        boolean z = this.c0;
        boolean u = u();
        this.c0 = u;
        if (z && !u && this.f15288j.getPlayState() != 1) {
            this.f15283e.b(this.q, zzkt.a(this.r), SystemClock.elapsedRealtime() - this.d0);
        }
        if (this.T == null) {
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            if (this.p && this.L == 0) {
                int i3 = this.n;
                if (i3 == 7 || i3 == 8) {
                    a = zzmr.a(byteBuffer);
                } else if (i3 == 5) {
                    a = zzlv.d();
                } else if (i3 == 6) {
                    a = zzlv.c(byteBuffer);
                } else {
                    StringBuilder sb = new StringBuilder(38);
                    sb.append("Unexpected audio encoding: ");
                    sb.append(i3);
                    throw new IllegalStateException(sb.toString());
                }
                this.L = a;
            }
            if (this.s != null) {
                if (!z()) {
                    return false;
                }
                this.f15287i.add(new e10(this.s, Math.max(0L, j2), p(D()), null));
                this.s = null;
                x();
            }
            if (this.M == 0) {
                this.N = Math.max(0L, j2);
                this.M = 1;
            } else {
                long p = this.N + p(this.p ? this.H : this.G / this.F);
                if (this.M != 1 || Math.abs(p - j2) <= 200000) {
                    i2 = 2;
                } else {
                    StringBuilder sb2 = new StringBuilder(80);
                    sb2.append("Discontinuity detected [expected ");
                    sb2.append(p);
                    sb2.append(", got ");
                    sb2.append(j2);
                    sb2.append("]");
                    Log.e("AudioTrack", sb2.toString());
                    i2 = 2;
                    this.M = 2;
                }
                if (this.M == i2) {
                    this.N += j2 - p;
                    this.M = 1;
                    this.f15283e.c();
                }
            }
            if (this.p) {
                this.H += this.L;
            } else {
                this.G += byteBuffer.remaining();
            }
            this.T = byteBuffer;
        }
        if (this.p) {
            n(this.T, j2);
        } else {
            s(j2);
        }
        if (this.T.hasRemaining()) {
            return false;
        }
        this.T = null;
        return true;
    }

    public final void k(int i2) {
        zzsk.e(zzsy.a >= 21);
        if (this.b0 && this.a0 == i2) {
            return;
        }
        this.b0 = true;
        this.a0 = i2;
        e();
    }

    public final boolean l(String str) {
        zzlw zzlwVar = this.a;
        return zzlwVar != null && zzlwVar.a(o(str));
    }

    public final zzln m(zzln zzlnVar) {
        if (this.p) {
            zzln zzlnVar2 = zzln.a;
            this.t = zzlnVar2;
            return zzlnVar2;
        }
        zzln zzlnVar3 = new zzln(this.f15281c.i(zzlnVar.f15254b), this.f15281c.j(zzlnVar.f15255c));
        zzln zzlnVar4 = this.s;
        if (zzlnVar4 == null) {
            if (!this.f15287i.isEmpty()) {
                zzlnVar4 = e10.a(this.f15287i.getLast());
            } else {
                zzlnVar4 = this.t;
            }
        }
        if (!zzlnVar3.equals(zzlnVar4)) {
            if (a()) {
                this.s = zzlnVar3;
            } else {
                this.t = zzlnVar3;
            }
        }
        return this.t;
    }

    public final boolean r() {
        if (a()) {
            return this.Y && !u();
        }
        return true;
    }

    public final void t() {
        if (this.M == 1) {
            this.M = 2;
        }
    }

    public final boolean u() {
        if (a()) {
            if (D() <= this.f15286h.e()) {
                if (E() && this.f15288j.getPlayState() == 2 && this.f15288j.getPlaybackHeadPosition() == 0) {
                }
            }
            return true;
        }
        return false;
    }

    public final long w(boolean z) {
        long j2;
        long j3;
        long j4;
        long j5;
        if (!(a() && this.M != 0)) {
            return Long.MIN_VALUE;
        }
        if (this.f15288j.getPlayState() == 3) {
            long c2 = this.f15286h.c();
            if (c2 != 0) {
                long nanoTime = System.nanoTime() / 1000;
                if (nanoTime - this.B >= 30000) {
                    long[] jArr = this.f15285g;
                    int i2 = this.y;
                    jArr[i2] = c2 - nanoTime;
                    this.y = (i2 + 1) % 10;
                    int i3 = this.z;
                    if (i3 < 10) {
                        this.z = i3 + 1;
                    }
                    this.B = nanoTime;
                    this.A = 0L;
                    int i4 = 0;
                    while (true) {
                        int i5 = this.z;
                        if (i4 >= i5) {
                            break;
                        }
                        this.A += this.f15285g[i4] / i5;
                        i4++;
                    }
                }
                if (!E() && nanoTime - this.D >= 500000) {
                    boolean f2 = this.f15286h.f();
                    this.C = f2;
                    if (f2) {
                        long g2 = this.f15286h.g() / 1000;
                        long h2 = this.f15286h.h();
                        if (g2 < this.O) {
                            this.C = false;
                        } else if (Math.abs(g2 - nanoTime) > 5000000) {
                            StringBuilder sb = new StringBuilder(136);
                            sb.append("Spurious audio timestamp (system clock mismatch): ");
                            sb.append(h2);
                            sb.append(", ");
                            sb.append(g2);
                            sb.append(", ");
                            sb.append(nanoTime);
                            sb.append(", ");
                            sb.append(c2);
                            Log.w("AudioTrack", sb.toString());
                            this.C = false;
                        } else if (Math.abs(p(h2) - c2) > 5000000) {
                            StringBuilder sb2 = new StringBuilder(138);
                            sb2.append("Spurious audio timestamp (frame position mismatch): ");
                            sb2.append(h2);
                            sb2.append(", ");
                            sb2.append(g2);
                            sb2.append(", ");
                            sb2.append(nanoTime);
                            sb2.append(", ");
                            sb2.append(c2);
                            Log.w("AudioTrack", sb2.toString());
                            this.C = false;
                        }
                    }
                    if (this.E != null && !this.p) {
                        try {
                            long intValue = (((Integer) r1.invoke(this.f15288j, null)).intValue() * 1000) - this.r;
                            this.P = intValue;
                            long max = Math.max(intValue, 0L);
                            this.P = max;
                            if (max > 5000000) {
                                StringBuilder sb3 = new StringBuilder(61);
                                sb3.append("Ignoring impossibly large audio latency: ");
                                sb3.append(max);
                                Log.w("AudioTrack", sb3.toString());
                                this.P = 0L;
                            }
                        } catch (Exception unused) {
                            this.E = null;
                        }
                    }
                    this.D = nanoTime;
                }
            }
        }
        long nanoTime2 = System.nanoTime() / 1000;
        if (this.C) {
            j2 = p(this.f15286h.h() + q(nanoTime2 - (this.f15286h.g() / 1000)));
        } else {
            if (this.z == 0) {
                j2 = this.f15286h.c();
            } else {
                j2 = nanoTime2 + this.A;
            }
            if (!z) {
                j2 -= this.P;
            }
        }
        long j6 = this.N;
        while (!this.f15287i.isEmpty() && j2 >= e10.b(this.f15287i.getFirst())) {
            e10 remove = this.f15287i.remove();
            this.t = e10.a(remove);
            this.v = e10.b(remove);
            this.u = e10.c(remove) - this.N;
        }
        if (this.t.f15254b == 1.0f) {
            j5 = (j2 + this.u) - this.v;
        } else {
            if (this.f15287i.isEmpty() && this.f15281c.l() >= RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE) {
                j3 = this.u;
                j4 = zzsy.c(j2 - this.v, this.f15281c.k(), this.f15281c.l());
            } else {
                j3 = this.u;
                double d2 = this.t.f15254b;
                double d3 = j2 - this.v;
                Double.isNaN(d2);
                Double.isNaN(d3);
                j4 = (long) (d2 * d3);
            }
            j5 = j4 + j3;
        }
        return j6 + j5;
    }

    public final void y() throws zzmp {
        if (!this.Y && a() && z()) {
            this.f15286h.d(D());
            this.x = 0;
            this.Y = true;
        }
    }
}
