package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;

@zzard
/* loaded from: classes2.dex */
final class v9 implements zzrv {
    private final zzrv a;

    /* renamed from: b, reason: collision with root package name */
    private final long f12277b;

    /* renamed from: c, reason: collision with root package name */
    private final zzrv f12278c;

    /* renamed from: d, reason: collision with root package name */
    private long f12279d;

    /* renamed from: e, reason: collision with root package name */
    private Uri f12280e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public v9(zzrv zzrvVar, int i2, zzrv zzrvVar2) {
        this.a = zzrvVar;
        this.f12277b = i2;
        this.f12278c = zzrvVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzrv
    public final long a(zzry zzryVar) throws IOException {
        zzry zzryVar2;
        this.f12280e = zzryVar.a;
        long j2 = zzryVar.f15509d;
        long j3 = this.f12277b;
        zzry zzryVar3 = null;
        if (j2 >= j3) {
            zzryVar2 = null;
        } else {
            long j4 = zzryVar.f15510e;
            zzryVar2 = new zzry(zzryVar.a, j2, j4 != -1 ? Math.min(j4, j3 - j2) : j3 - j2, null);
        }
        long j5 = zzryVar.f15510e;
        if (j5 == -1 || zzryVar.f15509d + j5 > this.f12277b) {
            long max = Math.max(this.f12277b, zzryVar.f15509d);
            long j6 = zzryVar.f15510e;
            zzryVar3 = new zzry(zzryVar.a, max, j6 != -1 ? Math.min(j6, (zzryVar.f15509d + j6) - this.f12277b) : -1L, null);
        }
        long a = zzryVar2 != null ? this.a.a(zzryVar2) : 0L;
        long a2 = zzryVar3 != null ? this.f12278c.a(zzryVar3) : 0L;
        this.f12279d = zzryVar.f15509d;
        if (a == -1 || a2 == -1) {
            return -1L;
        }
        return a + a2;
    }

    @Override // com.google.android.gms.internal.ads.zzrv
    public final void close() throws IOException {
        this.a.close();
        this.f12278c.close();
    }

    @Override // com.google.android.gms.internal.ads.zzrv
    public final Uri n0() {
        return this.f12280e;
    }

    @Override // com.google.android.gms.internal.ads.zzrv
    public final int read(byte[] bArr, int i2, int i3) throws IOException {
        int i4;
        long j2 = this.f12279d;
        long j3 = this.f12277b;
        if (j2 < j3) {
            i4 = this.a.read(bArr, i2, (int) Math.min(i3, j3 - j2));
            this.f12279d += i4;
        } else {
            i4 = 0;
        }
        if (this.f12279d < this.f12277b) {
            return i4;
        }
        int read = this.f12278c.read(bArr, i2 + i4, i3 - i4);
        int i5 = i4 + read;
        this.f12279d += read;
        return i5;
    }
}
