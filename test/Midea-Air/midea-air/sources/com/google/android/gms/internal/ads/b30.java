package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class b30 implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ e30 f11115f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ y20 f11116g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b30(y20 y20Var, e30 e30Var) {
        this.f11116g = y20Var;
        this.f11115f = e30Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SparseArray sparseArray;
        SparseArray sparseArray2;
        this.f11115f.a();
        sparseArray = this.f11116g.u;
        int size = sparseArray.size();
        for (int i2 = 0; i2 < size; i2++) {
            sparseArray2 = this.f11116g.u;
            ((zzqt) sparseArray2.valueAt(i2)).e();
        }
    }
}
