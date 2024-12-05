package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdob;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes2.dex */
final class xu extends wu<Object> {
    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.wu
    public final int a(Map.Entry<?, ?> entry) {
        entry.getKey();
        throw new NoSuchMethodError();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.wu
    public final Object b(zzdno zzdnoVar, zzdpk zzdpkVar, int i2) {
        return zzdnoVar.a(zzdpkVar, i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.wu
    public final <UT, UB> UB c(lw lwVar, Object obj, zzdno zzdnoVar, zu<Object> zuVar, UB ub, dx<UT, UB> dxVar) throws IOException {
        throw new NoSuchMethodError();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.wu
    public final void d(zzdmr zzdmrVar, Object obj, zzdno zzdnoVar, zu<Object> zuVar) throws IOException {
        throw new NoSuchMethodError();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.wu
    public final void e(lw lwVar, Object obj, zzdno zzdnoVar, zu<Object> zuVar) throws IOException {
        throw new NoSuchMethodError();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.wu
    public final void f(vx vxVar, Map.Entry<?, ?> entry) throws IOException {
        entry.getKey();
        throw new NoSuchMethodError();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.wu
    public final void g(Object obj) {
        i(obj).l();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.wu
    public final boolean h(zzdpk zzdpkVar) {
        return zzdpkVar instanceof zzdob.zzc;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.wu
    public final zu<Object> i(Object obj) {
        return ((zzdob.zzc) obj).zzhhj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.wu
    public final zu<Object> j(Object obj) {
        zzdob.zzc zzcVar = (zzdob.zzc) obj;
        if (zzcVar.zzhhj.c()) {
            zzcVar.zzhhj = (zu) zzcVar.zzhhj.clone();
        }
        return zzcVar.zzhhj;
    }
}
