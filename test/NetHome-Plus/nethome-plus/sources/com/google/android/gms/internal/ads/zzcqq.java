package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbqy;
import com.google.android.gms.internal.ads.zzbtv;
import com.google.android.gms.internal.ads.zzcqt;

/* loaded from: classes2.dex */
public final class zzcqq extends zzawb {

    /* renamed from: f, reason: collision with root package name */
    private zzbjm f14376f;

    public zzcqq(zzbjm zzbjmVar) {
        this.f14376f = zzbjmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzawa
    public final void x5(IObjectWrapper iObjectWrapper, zzawc zzawcVar, zzavy zzavyVar) {
        Context context = (Context) ObjectWrapper.R(iObjectWrapper);
        String str = zzawcVar.f13021f;
        String str2 = zzawcVar.f13022g;
        zzcqp c2 = this.f14376f.n().b(new zzbqy.zza().e(context).b(new zzcxx().t(str).w(new zzya().a()).n(zzawcVar.f13023h).d()).c()).c(new zzcqt(new zzcqt.zza().b(str2)));
        new zzbtv.zza().k();
        zzbar.f(c2.a().a(), new kn(this, zzavyVar), this.f14376f.e());
    }
}
