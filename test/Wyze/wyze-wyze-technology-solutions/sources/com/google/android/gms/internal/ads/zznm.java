package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.RecyclerView;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class zznm implements zzno {
    private static final byte[] a = new byte[RecyclerView.l.FLAG_APPEARED_IN_PRE_LAYOUT];

    /* renamed from: b, reason: collision with root package name */
    private final zzrv f15341b;

    /* renamed from: c, reason: collision with root package name */
    private final long f15342c;

    /* renamed from: d, reason: collision with root package name */
    private long f15343d;

    /* renamed from: e, reason: collision with root package name */
    private byte[] f15344e = new byte[65536];

    /* renamed from: f, reason: collision with root package name */
    private int f15345f;

    /* renamed from: g, reason: collision with root package name */
    private int f15346g;

    public zznm(zzrv zzrvVar, long j2, long j3) {
        this.f15341b = zzrvVar;
        this.f15343d = j2;
        this.f15342c = j3;
    }

    private final int h(byte[] bArr, int i2, int i3, int i4, boolean z) throws InterruptedException, IOException {
        if (!Thread.interrupted()) {
            int read = this.f15341b.read(bArr, i2 + i4, i3 - i4);
            if (read != -1) {
                return i4 + read;
            }
            if (i4 == 0 && z) {
                return -1;
            }
            throw new EOFException();
        }
        throw new InterruptedException();
    }

    private final int i(int i2) {
        int min = Math.min(this.f15346g, i2);
        j(min);
        return min;
    }

    private final void j(int i2) {
        int i3 = this.f15346g - i2;
        this.f15346g = i3;
        this.f15345f = 0;
        byte[] bArr = this.f15344e;
        byte[] bArr2 = i3 < bArr.length - 524288 ? new byte[65536 + i3] : bArr;
        System.arraycopy(bArr, i2, bArr2, 0, i3);
        this.f15344e = bArr2;
    }

    private final void k(int i2) {
        if (i2 != -1) {
            this.f15343d += i2;
        }
    }

    private final int l(byte[] bArr, int i2, int i3) {
        int i4 = this.f15346g;
        if (i4 == 0) {
            return 0;
        }
        int min = Math.min(i4, i3);
        System.arraycopy(this.f15344e, 0, bArr, i2, min);
        j(min);
        return min;
    }

    private final boolean m(int i2, boolean z) throws IOException, InterruptedException {
        int i3 = this.f15345f + i2;
        byte[] bArr = this.f15344e;
        if (i3 > bArr.length) {
            this.f15344e = Arrays.copyOf(this.f15344e, zzsy.q(bArr.length << 1, 65536 + i3, i3 + 524288));
        }
        int min = Math.min(this.f15346g - this.f15345f, i2);
        while (min < i2) {
            min = h(this.f15344e, this.f15345f, i2, min, false);
            if (min == -1) {
                return false;
            }
        }
        int i4 = this.f15345f + i2;
        this.f15345f = i4;
        this.f15346g = Math.max(this.f15346g, i4);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzno
    public final void a(int i2) throws IOException, InterruptedException {
        int i3 = i(i2);
        while (i3 < i2 && i3 != -1) {
            byte[] bArr = a;
            i3 = h(bArr, -i3, Math.min(i2, bArr.length + i3), i3, false);
        }
        k(i3);
    }

    @Override // com.google.android.gms.internal.ads.zzno
    public final boolean b(byte[] bArr, int i2, int i3, boolean z) throws IOException, InterruptedException {
        int l = l(bArr, i2, i3);
        while (l < i3 && l != -1) {
            l = h(bArr, i2, i3, l, z);
        }
        k(l);
        return l != -1;
    }

    @Override // com.google.android.gms.internal.ads.zzno
    public final void c() {
        this.f15345f = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzno
    public final void d(byte[] bArr, int i2, int i3) throws IOException, InterruptedException {
        if (m(i3, false)) {
            System.arraycopy(this.f15344e, this.f15345f - i3, bArr, i2, i3);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzno
    public final int e(int i2) throws IOException, InterruptedException {
        int i3 = i(i2);
        if (i3 == 0) {
            byte[] bArr = a;
            i3 = h(bArr, 0, Math.min(i2, bArr.length), 0, true);
        }
        k(i3);
        return i3;
    }

    @Override // com.google.android.gms.internal.ads.zzno
    public final long f() {
        return this.f15342c;
    }

    @Override // com.google.android.gms.internal.ads.zzno
    public final void g(int i2) throws IOException, InterruptedException {
        m(i2, false);
    }

    @Override // com.google.android.gms.internal.ads.zzno
    public final long getPosition() {
        return this.f15343d;
    }

    @Override // com.google.android.gms.internal.ads.zzno
    public final int read(byte[] bArr, int i2, int i3) throws IOException, InterruptedException {
        int l = l(bArr, i2, i3);
        if (l == 0) {
            l = h(bArr, i2, i3, 0, true);
        }
        k(l);
        return l;
    }

    @Override // com.google.android.gms.internal.ads.zzno
    public final void readFully(byte[] bArr, int i2, int i3) throws IOException, InterruptedException {
        b(bArr, i2, i3, false);
    }
}
