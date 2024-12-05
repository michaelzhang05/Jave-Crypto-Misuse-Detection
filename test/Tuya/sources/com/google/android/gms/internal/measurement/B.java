package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class B extends AbstractC2139y {
    /* JADX INFO: Access modifiers changed from: protected */
    public B() {
        this.f15960a.add(O.APPLY);
        this.f15960a.add(O.BLOCK);
        this.f15960a.add(O.BREAK);
        this.f15960a.add(O.CASE);
        this.f15960a.add(O.DEFAULT);
        this.f15960a.add(O.CONTINUE);
        this.f15960a.add(O.DEFINE_FUNCTION);
        this.f15960a.add(O.FN);
        this.f15960a.add(O.IF);
        this.f15960a.add(O.QUOTE);
        this.f15960a.add(O.RETURN);
        this.f15960a.add(O.SWITCH);
        this.f15960a.add(O.TERNARY);
    }

    private static r c(T1 t12, List list) {
        AbstractC2110u2.i(O.FN.name(), 2, list);
        r b8 = t12.b((r) list.get(0));
        r b9 = t12.b((r) list.get(1));
        if (b9 instanceof C1986f) {
            List v8 = ((C1986f) b9).v();
            List arrayList = new ArrayList();
            if (list.size() > 2) {
                arrayList = list.subList(2, list.size());
            }
            return new C2076q(b8.g(), v8, arrayList, t12);
        }
        throw new IllegalArgumentException(String.format("FN requires an ArrayValue of parameter names found %s", b9.getClass().getCanonicalName()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x0128, code lost:
    
        if (r8.equals("continue") == false) goto L64;
     */
    @Override // com.google.android.gms.internal.measurement.AbstractC2139y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.measurement.r a(java.lang.String r8, com.google.android.gms.internal.measurement.T1 r9, java.util.List r10) {
        /*
            Method dump skipped, instructions count: 634
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.B.a(java.lang.String, com.google.android.gms.internal.measurement.T1, java.util.List):com.google.android.gms.internal.measurement.r");
    }
}
