package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class zzkk {
    private int a;

    /* renamed from: b, reason: collision with root package name */
    private long[] f15217b;

    public zzkk() {
        this(32);
    }

    public final void a(long j2) {
        int i2 = this.a;
        long[] jArr = this.f15217b;
        if (i2 == jArr.length) {
            this.f15217b = Arrays.copyOf(jArr, i2 << 1);
        }
        long[] jArr2 = this.f15217b;
        int i3 = this.a;
        this.a = i3 + 1;
        jArr2[i3] = j2;
    }

    public final long b(int i2) {
        if (i2 >= 0 && i2 < this.a) {
            return this.f15217b[i2];
        }
        int i3 = this.a;
        StringBuilder sb = new StringBuilder(45);
        sb.append("Invalid size ");
        sb.append(i2);
        sb.append(", size is ");
        sb.append(i3);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public final int c() {
        return this.a;
    }

    private zzkk(int i2) {
        this.f15217b = new long[32];
    }
}
