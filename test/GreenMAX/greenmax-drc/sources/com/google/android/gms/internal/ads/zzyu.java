package com.google.android.gms.internal.ads;

import java.util.Random;

@zzard
/* loaded from: classes2.dex */
public final class zzyu extends zzzz {

    /* renamed from: g, reason: collision with root package name */
    private long f15835g;

    /* renamed from: h, reason: collision with root package name */
    private final Object f15836h = new Object();

    /* renamed from: f, reason: collision with root package name */
    private final Random f15834f = new Random();

    public zzyu() {
        H7();
    }

    public final void H7() {
        synchronized (this.f15836h) {
            int i2 = 3;
            long j2 = 0;
            while (true) {
                i2--;
                if (i2 <= 0) {
                    break;
                }
                j2 = this.f15834f.nextInt() + 2147483648L;
                if (j2 != this.f15835g && j2 != 0) {
                    break;
                }
            }
            this.f15835g = j2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzzy
    public final long getValue() {
        return this.f15835g;
    }
}
