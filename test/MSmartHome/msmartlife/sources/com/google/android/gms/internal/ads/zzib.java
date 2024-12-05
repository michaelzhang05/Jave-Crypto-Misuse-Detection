package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.RecyclerView;
import java.io.EOFException;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class zzib implements zzie {
    private static final byte[] a = new byte[RecyclerView.l.FLAG_APPEARED_IN_PRE_LAYOUT];

    /* renamed from: b, reason: collision with root package name */
    private final zzjp f15126b;

    /* renamed from: c, reason: collision with root package name */
    private long f15127c;

    /* renamed from: d, reason: collision with root package name */
    private long f15128d;

    public zzib(zzjp zzjpVar, long j2, long j3) {
        this.f15126b = zzjpVar;
        this.f15127c = j2;
        this.f15128d = j3;
    }

    @Override // com.google.android.gms.internal.ads.zzie
    public final void a(int i2) throws IOException, InterruptedException {
        int i3 = i2;
        while (i3 > 0) {
            if (!Thread.interrupted()) {
                zzjp zzjpVar = this.f15126b;
                byte[] bArr = a;
                int read = zzjpVar.read(bArr, 0, Math.min(bArr.length, i3));
                if (read == -1) {
                    throw new EOFException();
                }
                i3 -= read;
            } else {
                throw new InterruptedException();
            }
        }
        this.f15127c += i2;
    }

    @Override // com.google.android.gms.internal.ads.zzie
    public final boolean b(byte[] bArr, int i2, int i3, boolean z) throws IOException, InterruptedException {
        int i4 = i3;
        while (i4 > 0) {
            if (!Thread.interrupted()) {
                int read = this.f15126b.read(bArr, i2, i4);
                if (read == -1) {
                    if (z && i4 == i3) {
                        return false;
                    }
                    throw new EOFException();
                }
                i2 += read;
                i4 -= read;
            } else {
                throw new InterruptedException();
            }
        }
        this.f15127c += i3;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzie
    public final long getPosition() {
        return this.f15127c;
    }

    @Override // com.google.android.gms.internal.ads.zzie
    public final void readFully(byte[] bArr, int i2, int i3) throws IOException, InterruptedException {
        b(bArr, i2, i3, false);
    }
}
