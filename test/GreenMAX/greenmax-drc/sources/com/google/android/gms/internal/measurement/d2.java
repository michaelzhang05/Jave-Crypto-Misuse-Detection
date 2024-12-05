package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzuo;

/* loaded from: classes2.dex */
final class d2 implements t1 {
    private final zzvv a;

    /* renamed from: b, reason: collision with root package name */
    private final String f15946b;

    /* renamed from: c, reason: collision with root package name */
    private final Object[] f15947c;

    /* renamed from: d, reason: collision with root package name */
    private final int f15948d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String a() {
        return this.f15946b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Object[] b() {
        return this.f15947c;
    }

    @Override // com.google.android.gms.internal.measurement.t1
    public final zzvv g() {
        return this.a;
    }

    @Override // com.google.android.gms.internal.measurement.t1
    public final boolean i() {
        return (this.f15948d & 2) == 2;
    }

    @Override // com.google.android.gms.internal.measurement.t1
    public final int j() {
        return (this.f15948d & 1) == 1 ? zzuo.zze.f16133h : zzuo.zze.f16134i;
    }
}
