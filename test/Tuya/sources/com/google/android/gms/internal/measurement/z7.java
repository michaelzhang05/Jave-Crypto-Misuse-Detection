package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class z7 extends AbstractC2028k {

    /* renamed from: c, reason: collision with root package name */
    final boolean f15983c;

    /* renamed from: d, reason: collision with root package name */
    final boolean f15984d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ A7 f15985e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z7(A7 a72, boolean z8, boolean z9) {
        super("log");
        this.f15985e = a72;
        this.f15983c = z8;
        this.f15984d = z9;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2028k
    public final r b(T1 t12, List list) {
        int i8;
        InterfaceC2003g7 interfaceC2003g7;
        InterfaceC2003g7 interfaceC2003g72;
        InterfaceC2003g7 interfaceC2003g73;
        AbstractC2110u2.i("log", 1, list);
        if (list.size() == 1) {
            interfaceC2003g73 = this.f15985e.f15254c;
            interfaceC2003g73.a(3, t12.b((r) list.get(0)).g(), Collections.emptyList(), this.f15983c, this.f15984d);
            return r.f15866c0;
        }
        int b8 = AbstractC2110u2.b(t12.b((r) list.get(0)).f().doubleValue());
        if (b8 != 2) {
            if (b8 != 3) {
                if (b8 != 5) {
                    if (b8 != 6) {
                        i8 = 3;
                    } else {
                        i8 = 2;
                    }
                } else {
                    i8 = 5;
                }
            } else {
                i8 = 1;
            }
        } else {
            i8 = 4;
        }
        String g8 = t12.b((r) list.get(1)).g();
        if (list.size() == 2) {
            interfaceC2003g72 = this.f15985e.f15254c;
            interfaceC2003g72.a(i8, g8, Collections.emptyList(), this.f15983c, this.f15984d);
            return r.f15866c0;
        }
        ArrayList arrayList = new ArrayList();
        for (int i9 = 2; i9 < Math.min(list.size(), 5); i9++) {
            arrayList.add(t12.b((r) list.get(i9)).g());
        }
        interfaceC2003g7 = this.f15985e.f15254c;
        interfaceC2003g7.a(i8, g8, arrayList, this.f15983c, this.f15984d);
        return r.f15866c0;
    }
}
