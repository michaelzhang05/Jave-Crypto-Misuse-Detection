package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class zzjo implements zzjp {
    private final byte[] a;

    /* renamed from: b, reason: collision with root package name */
    private int f15179b;

    /* renamed from: c, reason: collision with root package name */
    private int f15180c;

    public zzjo(byte[] bArr) {
        zzkh.c(bArr);
        zzkh.a(bArr.length > 0);
        this.a = bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzjp
    public final long a(zzjq zzjqVar) throws IOException {
        long j2 = zzjqVar.f15182c;
        int i2 = (int) j2;
        this.f15179b = i2;
        long j3 = zzjqVar.f15183d;
        if (j3 == -1) {
            j3 = this.a.length - j2;
        }
        int i3 = (int) j3;
        this.f15180c = i3;
        if (i3 > 0 && i2 + i3 <= this.a.length) {
            return i3;
        }
        int i4 = this.f15179b;
        long j4 = zzjqVar.f15183d;
        int length = this.a.length;
        StringBuilder sb = new StringBuilder(77);
        sb.append("Unsatisfiable range: [");
        sb.append(i4);
        sb.append(", ");
        sb.append(j4);
        sb.append("], length: ");
        sb.append(length);
        throw new IOException(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzjp
    public final void close() throws IOException {
    }

    @Override // com.google.android.gms.internal.ads.zzjp
    public final int read(byte[] bArr, int i2, int i3) throws IOException {
        int i4 = this.f15180c;
        if (i4 == 0) {
            return -1;
        }
        int min = Math.min(i3, i4);
        System.arraycopy(this.a, this.f15179b, bArr, i2, min);
        this.f15179b += min;
        this.f15180c -= min;
        return min;
    }
}
