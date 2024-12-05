package com.google.android.gms.internal.ads;

import java.io.IOException;

@zzard
/* loaded from: classes2.dex */
final class b9 implements zzjp {
    private final zzjp a;

    /* renamed from: b, reason: collision with root package name */
    private final long f11134b;

    /* renamed from: c, reason: collision with root package name */
    private final zzjp f11135c;

    /* renamed from: d, reason: collision with root package name */
    private long f11136d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b9(zzjp zzjpVar, int i2, zzjp zzjpVar2) {
        this.a = zzjpVar;
        this.f11134b = i2;
        this.f11135c = zzjpVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzjp
    public final long a(zzjq zzjqVar) throws IOException {
        zzjq zzjqVar2;
        long j2 = zzjqVar.f15182c;
        long j3 = this.f11134b;
        zzjq zzjqVar3 = null;
        if (j2 >= j3) {
            zzjqVar2 = null;
        } else {
            long j4 = zzjqVar.f15183d;
            zzjqVar2 = new zzjq(zzjqVar.a, j2, j4 != -1 ? Math.min(j4, j3 - j2) : j3 - j2, null);
        }
        long j5 = zzjqVar.f15183d;
        if (j5 == -1 || zzjqVar.f15182c + j5 > this.f11134b) {
            long max = Math.max(this.f11134b, zzjqVar.f15182c);
            long j6 = zzjqVar.f15183d;
            zzjqVar3 = new zzjq(zzjqVar.a, max, j6 != -1 ? Math.min(j6, (zzjqVar.f15182c + j6) - this.f11134b) : -1L, null);
        }
        long a = zzjqVar2 != null ? this.a.a(zzjqVar2) : 0L;
        long a2 = zzjqVar3 != null ? this.f11135c.a(zzjqVar3) : 0L;
        this.f11136d = zzjqVar.f15182c;
        if (a == -1 || a2 == -1) {
            return -1L;
        }
        return a + a2;
    }

    @Override // com.google.android.gms.internal.ads.zzjp
    public final void close() throws IOException {
        this.a.close();
        this.f11135c.close();
    }

    @Override // com.google.android.gms.internal.ads.zzjp
    public final int read(byte[] bArr, int i2, int i3) throws IOException {
        int i4;
        long j2 = this.f11136d;
        long j3 = this.f11134b;
        if (j2 < j3) {
            i4 = this.a.read(bArr, i2, (int) Math.min(i3, j3 - j2));
            this.f11136d += i4;
        } else {
            i4 = 0;
        }
        if (this.f11136d < this.f11134b) {
            return i4;
        }
        int read = this.f11135c.read(bArr, i2 + i4, i3 - i4);
        int i5 = i4 + read;
        this.f11136d += read;
        return i5;
    }
}
