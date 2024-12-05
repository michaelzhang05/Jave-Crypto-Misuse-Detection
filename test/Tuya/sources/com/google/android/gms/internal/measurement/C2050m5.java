package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.m5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2050m5 extends AbstractC2028k {

    /* renamed from: c, reason: collision with root package name */
    private final F5 f15766c;

    public C2050m5(String str, F5 f52) {
        super("internal.remoteConfig");
        this.f15766c = f52;
        this.f15750b.put("getValue", new Q4(this, "getValue", f52));
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2028k
    public final r b(T1 t12, List list) {
        return r.f15866c0;
    }
}
