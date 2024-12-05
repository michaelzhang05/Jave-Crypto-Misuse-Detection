package com.google.android.gms.internal.measurement;

import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class g0 extends i0 {

    /* renamed from: f, reason: collision with root package name */
    private int f15958f = 0;

    /* renamed from: g, reason: collision with root package name */
    private final int f15959g;

    /* renamed from: h, reason: collision with root package name */
    private final /* synthetic */ zzte f15960h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g0(zzte zzteVar) {
        this.f15960h = zzteVar;
        this.f15959g = zzteVar.size();
    }

    @Override // com.google.android.gms.internal.measurement.zztl
    public final byte b() {
        int i2 = this.f15958f;
        if (i2 < this.f15959g) {
            this.f15958f = i2 + 1;
            return this.f15960h.z(i2);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f15958f < this.f15959g;
    }
}
