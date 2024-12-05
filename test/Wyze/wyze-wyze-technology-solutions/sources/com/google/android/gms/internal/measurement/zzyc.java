package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzyc;
import java.io.IOException;

/* loaded from: classes2.dex */
public abstract class zzyc<M extends zzyc<M>> extends zzyi {

    /* renamed from: b, reason: collision with root package name */
    protected zzye f16175b;

    @Override // com.google.android.gms.internal.measurement.zzyi
    public void a(zzya zzyaVar) throws IOException {
        if (this.f16175b == null) {
            return;
        }
        for (int i2 = 0; i2 < this.f16175b.c(); i2++) {
            this.f16175b.d(i2).c(zzyaVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzyi
    protected int b() {
        if (this.f16175b == null) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f16175b.c(); i3++) {
            i2 += this.f16175b.d(i3).d();
        }
        return i2;
    }

    @Override // com.google.android.gms.internal.measurement.zzyi
    public /* synthetic */ Object clone() throws CloneNotSupportedException {
        zzyc zzycVar = (zzyc) super.clone();
        zzyg.a(this, zzycVar);
        return zzycVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzyi
    /* renamed from: d */
    public final /* synthetic */ zzyi clone() throws CloneNotSupportedException {
        return (zzyc) clone();
    }
}
