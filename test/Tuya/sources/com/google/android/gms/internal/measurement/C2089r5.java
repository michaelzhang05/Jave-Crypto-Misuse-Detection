package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.r5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C2089r5 extends AbstractC2074p5 {
    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC2074p5
    public final /* synthetic */ int a(Object obj) {
        return ((C2082q5) obj).a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC2074p5
    public final /* synthetic */ int b(Object obj) {
        return ((C2082q5) obj).b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC2074p5
    public final /* bridge */ /* synthetic */ Object c(Object obj) {
        AbstractC2112u4 abstractC2112u4 = (AbstractC2112u4) obj;
        C2082q5 c2082q5 = abstractC2112u4.zzc;
        if (c2082q5 == C2082q5.c()) {
            C2082q5 f8 = C2082q5.f();
            abstractC2112u4.zzc = f8;
            return f8;
        }
        return c2082q5;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC2074p5
    public final /* synthetic */ Object d(Object obj) {
        return ((AbstractC2112u4) obj).zzc;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC2074p5
    public final /* bridge */ /* synthetic */ Object e(Object obj, Object obj2) {
        if (!C2082q5.c().equals(obj2)) {
            if (C2082q5.c().equals(obj)) {
                return C2082q5.e((C2082q5) obj, (C2082q5) obj2);
            }
            ((C2082q5) obj).d((C2082q5) obj2);
            return obj;
        }
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC2074p5
    public final /* bridge */ /* synthetic */ void f(Object obj, int i8, long j8) {
        ((C2082q5) obj).j(i8 << 3, Long.valueOf(j8));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC2074p5
    public final void g(Object obj) {
        ((AbstractC2112u4) obj).zzc.h();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC2074p5
    public final /* synthetic */ void h(Object obj, Object obj2) {
        ((AbstractC2112u4) obj).zzc = (C2082q5) obj2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC2074p5
    public final /* synthetic */ void i(Object obj, G5 g52) {
        ((C2082q5) obj).k(g52);
    }
}
