package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* loaded from: classes2.dex */
final class w2 extends v2<zzxe, zzxe> {
    private static void i(Object obj, zzxe zzxeVar) {
        ((zzuo) obj).zzbyf = zzxeVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.v2
    public final /* synthetic */ void a(zzxe zzxeVar, l3 l3Var) throws IOException {
        zzxeVar.d(l3Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.v2
    public final /* synthetic */ int b(zzxe zzxeVar) {
        return zzxeVar.g();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.v2
    public final /* synthetic */ zzxe c(Object obj) {
        return ((zzuo) obj).zzbyf;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.v2
    public final /* synthetic */ int d(zzxe zzxeVar) {
        return zzxeVar.i();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.v2
    public final /* synthetic */ void e(zzxe zzxeVar, l3 l3Var) throws IOException {
        zzxeVar.b(l3Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.v2
    public final /* synthetic */ void f(Object obj, zzxe zzxeVar) {
        i(obj, zzxeVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.v2
    public final /* synthetic */ zzxe g(zzxe zzxeVar, zzxe zzxeVar2) {
        zzxe zzxeVar3 = zzxeVar;
        zzxe zzxeVar4 = zzxeVar2;
        return zzxeVar4.equals(zzxe.h()) ? zzxeVar3 : zzxe.a(zzxeVar3, zzxeVar4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.v2
    public final void h(Object obj) {
        ((zzuo) obj).zzbyf.f();
    }
}
