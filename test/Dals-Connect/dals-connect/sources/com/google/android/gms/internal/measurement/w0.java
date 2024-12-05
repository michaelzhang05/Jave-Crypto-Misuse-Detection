package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzuo;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes2.dex */
final class w0 extends v0<Object> {
    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.v0
    public final void a(l3 l3Var, Map.Entry<?, ?> entry) throws IOException {
        entry.getKey();
        throw new NoSuchMethodError();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.v0
    public final int b(Map.Entry<?, ?> entry) {
        entry.getKey();
        throw new NoSuchMethodError();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.v0
    public final boolean c(zzvv zzvvVar) {
        return zzvvVar instanceof zzuo.zzc;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.v0
    public final y0<Object> d(Object obj) {
        return ((zzuo.zzc) obj).zzbyl;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.v0
    public final y0<Object> e(Object obj) {
        zzuo.zzc zzcVar = (zzuo.zzc) obj;
        if (zzcVar.zzbyl.c()) {
            zzcVar.zzbyl = (y0) zzcVar.zzbyl.clone();
        }
        return zzcVar.zzbyl;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.v0
    public final void f(Object obj) {
        d(obj).p();
    }
}
