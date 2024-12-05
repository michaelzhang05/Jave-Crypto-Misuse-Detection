package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.LinkedBlockingDeque;

/* loaded from: classes2.dex */
final class sz {
    private final zzjl a;

    /* renamed from: b, reason: collision with root package name */
    private final int f12177b;

    /* renamed from: c, reason: collision with root package name */
    private final uz f12178c;

    /* renamed from: d, reason: collision with root package name */
    private final LinkedBlockingDeque<zzjk> f12179d;

    /* renamed from: e, reason: collision with root package name */
    private final vz f12180e;

    /* renamed from: f, reason: collision with root package name */
    private final zzkm f12181f;

    /* renamed from: g, reason: collision with root package name */
    private long f12182g;

    /* renamed from: h, reason: collision with root package name */
    private long f12183h;

    /* renamed from: i, reason: collision with root package name */
    private zzjk f12184i;

    /* renamed from: j, reason: collision with root package name */
    private int f12185j;

    public sz(zzjl zzjlVar) {
        this.a = zzjlVar;
        int a = zzjlVar.a();
        this.f12177b = a;
        this.f12178c = new uz();
        this.f12179d = new LinkedBlockingDeque<>();
        this.f12180e = new vz();
        this.f12181f = new zzkm(32);
        this.f12185j = a;
    }

    private final void c(long j2, byte[] bArr, int i2) {
        int i3 = 0;
        while (i3 < i2) {
            i(j2);
            int i4 = (int) (j2 - this.f12182g);
            int min = Math.min(i2 - i3, this.f12177b - i4);
            System.arraycopy(this.f12179d.peek().a, i4 + 0, bArr, i3, min);
            j2 += min;
            i3 += min;
        }
    }

    private final void i(long j2) {
        int i2 = ((int) (j2 - this.f12182g)) / this.f12177b;
        for (int i3 = 0; i3 < i2; i3++) {
            this.a.c(this.f12179d.remove());
            this.f12182g += this.f12177b;
        }
    }

    private final void l() {
        if (this.f12185j == this.f12177b) {
            this.f12185j = 0;
            zzjk b2 = this.a.b();
            this.f12184i = b2;
            this.f12179d.add(b2);
        }
    }

    public final void a() {
        this.f12178c.a();
        while (!this.f12179d.isEmpty()) {
            this.a.c(this.f12179d.remove());
        }
        this.f12182g = 0L;
        this.f12183h = 0L;
        this.f12184i = null;
        this.f12185j = this.f12177b;
    }

    public final void b(long j2, int i2, long j3, int i3, byte[] bArr) {
        this.f12178c.b(j2, i2, j3, i3, bArr);
    }

    public final int d(zzie zzieVar, int i2) throws IOException, InterruptedException {
        l();
        int min = Math.min(i2, this.f12177b - this.f12185j);
        zzieVar.readFully(this.f12184i.a, this.f12185j + 0, min);
        this.f12185j += min;
        this.f12183h += min;
        return min;
    }

    public final void e(zzkm zzkmVar, int i2) {
        int i3 = i2;
        while (i3 > 0) {
            l();
            int min = Math.min(i3, this.f12177b - this.f12185j);
            zzkmVar.j(this.f12184i.a, this.f12185j + 0, min);
            this.f12185j += min;
            i3 -= min;
        }
        this.f12183h += i2;
    }

    public final boolean f(zzhm zzhmVar) {
        return this.f12178c.c(zzhmVar, this.f12180e);
    }

    public final boolean g(zzhm zzhmVar) {
        int i2;
        if (!this.f12178c.c(zzhmVar, this.f12180e)) {
            return false;
        }
        if (zzhmVar.a()) {
            vz vzVar = this.f12180e;
            long j2 = vzVar.a;
            c(j2, this.f12181f.a, 1);
            long j3 = j2 + 1;
            byte b2 = this.f12181f.a[0];
            boolean z = (b2 & 128) != 0;
            int i3 = b2 & Byte.MAX_VALUE;
            zzgb zzgbVar = zzhmVar.a;
            if (zzgbVar.a == null) {
                zzgbVar.a = new byte[16];
            }
            c(j3, zzgbVar.a, i3);
            long j4 = j3 + i3;
            if (z) {
                c(j4, this.f12181f.a, 2);
                j4 += 2;
                this.f12181f.g(0);
                i2 = this.f12181f.f();
            } else {
                i2 = 1;
            }
            zzgb zzgbVar2 = zzhmVar.a;
            int[] iArr = zzgbVar2.f15059d;
            if (iArr == null || iArr.length < i2) {
                iArr = new int[i2];
            }
            int[] iArr2 = iArr;
            int[] iArr3 = zzgbVar2.f15060e;
            if (iArr3 == null || iArr3.length < i2) {
                iArr3 = new int[i2];
            }
            int[] iArr4 = iArr3;
            if (z) {
                int i4 = i2 * 6;
                zzkm zzkmVar = this.f12181f;
                if (zzkmVar.b() < i4) {
                    zzkmVar.i(new byte[i4], i4);
                }
                c(j4, this.f12181f.a, i4);
                j4 += i4;
                this.f12181f.g(0);
                for (int i5 = 0; i5 < i2; i5++) {
                    iArr2[i5] = this.f12181f.f();
                    iArr4[i5] = this.f12181f.m();
                }
            } else {
                iArr2[0] = 0;
                iArr4[0] = zzhmVar.f15103c - ((int) (j4 - vzVar.a));
            }
            zzgb zzgbVar3 = zzhmVar.a;
            zzgbVar3.a(i2, iArr2, iArr4, vzVar.f12298b, zzgbVar3.a, 1);
            long j5 = vzVar.a;
            int i6 = (int) (j4 - j5);
            vzVar.a = j5 + i6;
            zzhmVar.f15103c -= i6;
        }
        ByteBuffer byteBuffer = zzhmVar.f15102b;
        if (byteBuffer != null) {
            byteBuffer.capacity();
            int i7 = zzhmVar.f15103c;
        }
        ByteBuffer byteBuffer2 = zzhmVar.f15102b;
        if (byteBuffer2 != null) {
            long j6 = this.f12180e.a;
            int i8 = zzhmVar.f15103c;
            while (i8 > 0) {
                i(j6);
                int i9 = (int) (j6 - this.f12182g);
                int min = Math.min(i8, this.f12177b - i9);
                byteBuffer2.put(this.f12179d.peek().a, i9 + 0, min);
                j6 += min;
                i8 -= min;
            }
        }
        i(this.f12178c.e());
        return true;
    }

    public final boolean h(long j2) {
        long d2 = this.f12178c.d(j2);
        if (d2 == -1) {
            return false;
        }
        i(d2);
        return true;
    }

    public final void j() {
        i(this.f12178c.e());
    }

    public final long k() {
        return this.f12183h;
    }
}
