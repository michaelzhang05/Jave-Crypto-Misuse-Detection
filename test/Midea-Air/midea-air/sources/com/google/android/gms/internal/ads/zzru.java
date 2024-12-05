package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class zzru implements zzrv {
    private final byte[] a;

    /* renamed from: b, reason: collision with root package name */
    private Uri f15503b;

    /* renamed from: c, reason: collision with root package name */
    private int f15504c;

    /* renamed from: d, reason: collision with root package name */
    private int f15505d;

    public zzru(byte[] bArr) {
        zzsk.d(bArr);
        zzsk.a(bArr.length > 0);
        this.a = bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzrv
    public final long a(zzry zzryVar) throws IOException {
        this.f15503b = zzryVar.a;
        long j2 = zzryVar.f15509d;
        int i2 = (int) j2;
        this.f15504c = i2;
        long j3 = zzryVar.f15510e;
        if (j3 == -1) {
            j3 = this.a.length - j2;
        }
        int i3 = (int) j3;
        this.f15505d = i3;
        if (i3 > 0 && i2 + i3 <= this.a.length) {
            return i3;
        }
        int i4 = this.f15504c;
        long j4 = zzryVar.f15510e;
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

    @Override // com.google.android.gms.internal.ads.zzrv
    public final void close() throws IOException {
        this.f15503b = null;
    }

    @Override // com.google.android.gms.internal.ads.zzrv
    public final Uri n0() {
        return this.f15503b;
    }

    @Override // com.google.android.gms.internal.ads.zzrv
    public final int read(byte[] bArr, int i2, int i3) throws IOException {
        if (i3 == 0) {
            return 0;
        }
        int i4 = this.f15505d;
        if (i4 == 0) {
            return -1;
        }
        int min = Math.min(i3, i4);
        System.arraycopy(this.a, this.f15504c, bArr, i2, min);
        this.f15504c += min;
        this.f15505d -= min;
        return min;
    }
}
