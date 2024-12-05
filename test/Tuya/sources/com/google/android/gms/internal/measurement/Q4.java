package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class Q4 extends AbstractC2028k {

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ F5 f15533c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q4(C2050m5 c2050m5, String str, F5 f52) {
        super("getValue");
        this.f15533c = f52;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2028k
    public final r b(T1 t12, List list) {
        AbstractC2110u2.h("getValue", 2, list);
        r b8 = t12.b((r) list.get(0));
        r b9 = t12.b((r) list.get(1));
        String a8 = this.f15533c.a(b8.g());
        if (a8 != null) {
            return new C2115v(a8);
        }
        return b9;
    }
}
