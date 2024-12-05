package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.t6, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C2252t6 extends AbstractC2234r6 {
    private static void m(Object obj, C2226q6 c2226q6) {
        ((AbstractC2091c5) obj).zzb = c2226q6;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC2234r6
    public final /* synthetic */ int a(Object obj) {
        return ((C2226q6) obj).a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC2234r6
    public final /* synthetic */ Object b(Object obj, Object obj2) {
        C2226q6 c2226q6 = (C2226q6) obj;
        C2226q6 c2226q62 = (C2226q6) obj2;
        if (C2226q6.k().equals(c2226q62)) {
            return c2226q6;
        }
        if (C2226q6.k().equals(c2226q6)) {
            return C2226q6.c(c2226q6, c2226q62);
        }
        return c2226q6.b(c2226q62);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC2234r6
    public final /* synthetic */ void c(Object obj, int i8, AbstractC2241s4 abstractC2241s4) {
        ((C2226q6) obj).e((i8 << 3) | 2, abstractC2241s4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC2234r6
    public final /* synthetic */ void d(Object obj, N6 n62) {
        ((C2226q6) obj).g(n62);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC2234r6
    public final /* synthetic */ int e(Object obj) {
        return ((C2226q6) obj).i();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC2234r6
    public final /* synthetic */ void f(Object obj, int i8, long j8) {
        ((C2226q6) obj).e(i8 << 3, Long.valueOf(j8));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC2234r6
    public final /* synthetic */ void g(Object obj, N6 n62) {
        ((C2226q6) obj).j(n62);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC2234r6
    public final /* synthetic */ void h(Object obj, Object obj2) {
        m(obj, (C2226q6) obj2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC2234r6
    public final /* synthetic */ Object i(Object obj) {
        C2226q6 c2226q6 = ((AbstractC2091c5) obj).zzb;
        if (c2226q6 == C2226q6.k()) {
            C2226q6 l8 = C2226q6.l();
            m(obj, l8);
            return l8;
        }
        return c2226q6;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC2234r6
    public final /* synthetic */ void j(Object obj, Object obj2) {
        m(obj, (C2226q6) obj2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC2234r6
    public final /* synthetic */ Object k(Object obj) {
        return ((AbstractC2091c5) obj).zzb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC2234r6
    public final void l(Object obj) {
        ((AbstractC2091c5) obj).zzb.m();
    }
}
