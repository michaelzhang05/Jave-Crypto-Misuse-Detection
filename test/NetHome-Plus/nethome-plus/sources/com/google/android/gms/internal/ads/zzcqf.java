package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbqy;
import com.google.android.gms.internal.ads.zzbtv;

/* loaded from: classes2.dex */
public final class zzcqf extends zzatu {

    /* renamed from: f, reason: collision with root package name */
    private zzbbh<zzcdb> f14364f;

    /* renamed from: g, reason: collision with root package name */
    private zzcdb f14365g;

    /* renamed from: h, reason: collision with root package name */
    private final zzbjm f14366h;

    /* renamed from: i, reason: collision with root package name */
    private final Context f14367i;
    private zzbss m;
    private final String n;
    private final zzcxx p;

    /* renamed from: j, reason: collision with root package name */
    private final zzcqa f14368j = new zzcqa();

    /* renamed from: k, reason: collision with root package name */
    private final zzcqb f14369k = new zzcqb();
    private final zzcpz l = new zzcpz();
    private boolean o = false;

    public zzcqf(zzbjm zzbjmVar, Context context, String str) {
        zzcxx zzcxxVar = new zzcxx();
        zzcxxVar.p.add("new_rewarded");
        this.p = zzcxxVar;
        this.f14366h = zzbjmVar;
        this.f14367i = context;
        this.n = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ zzbbh I7(zzcqf zzcqfVar, zzbbh zzbbhVar) {
        zzcqfVar.f14364f = null;
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzatt
    public final void A2(zzaue zzaueVar) throws RemoteException {
        Preconditions.f("#008 Must be called on the main UI thread.");
        this.f14368j.c(zzaueVar);
    }

    @Override // com.google.android.gms.internal.ads.zzatt
    public final synchronized void E7(IObjectWrapper iObjectWrapper, boolean z) throws RemoteException {
        Preconditions.f("#008 Must be called on the main UI thread.");
        if (this.f14365g == null) {
            zzbad.i("Rewarded can not be shown before loaded");
            this.f14368j.E(2);
        } else {
            this.f14365g.i(z, (Activity) ObjectWrapper.R(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzatt
    public final synchronized void L1(zzxz zzxzVar, zzaub zzaubVar) {
        Preconditions.f("#008 Must be called on the main UI thread.");
        this.f14369k.a(zzaubVar);
        this.o = false;
        if (this.f14364f != null) {
            return;
        }
        if (this.f14365g != null) {
            return;
        }
        zzcya.b(this.f14367i, zzxzVar.f15796k);
        zzcdf b2 = this.f14366h.m().a(new zzbqy.zza().e(this.f14367i).b(this.p.t(this.n).n(zzyd.L()).w(zzxzVar).d()).c()).c(new zzbtv.zza().c(this.f14368j, this.f14366h.e()).g(new fn(this, this.f14369k), this.f14366h.e()).d(this.f14369k, this.f14366h.e()).e(this.f14368j, this.f14366h.e()).b(this.l, this.f14366h.e()).a(new zzcpy(), this.f14366h.e()).k()).b();
        this.m = b2.d();
        zzbbh<zzcdb> c2 = b2.c();
        this.f14364f = c2;
        zzbar.f(c2, new dn(this, b2), this.f14366h.e());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void L7() {
        this.o = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void M7() {
        this.l.onAdMetadataChanged();
    }

    @Override // com.google.android.gms.internal.ads.zzatt
    public final void V5(zzaao zzaaoVar) throws RemoteException {
        this.l.a(new en(this, zzaaoVar));
    }

    @Override // com.google.android.gms.internal.ads.zzatt
    public final void c6(zzatw zzatwVar) throws RemoteException {
        Preconditions.f("#008 Must be called on the main UI thread.");
        this.f14368j.b(zzatwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzatt
    public final synchronized void d2(zzaum zzaumVar) throws RemoteException {
        Preconditions.f("#008 Must be called on the main UI thread.");
        this.p.u(zzaumVar.f12986f);
        if (((Boolean) zzyt.e().c(zzacu.d1)).booleanValue()) {
            this.p.v(zzaumVar.f12987g);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzatt
    public final Bundle getAdMetadata() throws RemoteException {
        zzbss zzbssVar;
        Preconditions.f("#008 Must be called on the main UI thread.");
        if (this.o && (zzbssVar = this.m) != null) {
            return zzbssVar.Y();
        }
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzatt
    public final synchronized String getMediationAdapterClassName() throws RemoteException {
        zzcdb zzcdbVar = this.f14365g;
        if (zzcdbVar == null) {
            return null;
        }
        return zzcdbVar.b();
    }

    @Override // com.google.android.gms.internal.ads.zzatt
    public final boolean isLoaded() throws RemoteException {
        Preconditions.f("#008 Must be called on the main UI thread.");
        return this.o;
    }

    @Override // com.google.android.gms.internal.ads.zzatt
    public final zzatq n7() {
        zzcdb zzcdbVar;
        Preconditions.f("#008 Must be called on the main UI thread.");
        if (!this.o || (zzcdbVar = this.f14365g) == null) {
            return null;
        }
        return zzcdbVar.j();
    }

    @Override // com.google.android.gms.internal.ads.zzatt
    public final synchronized void q5(IObjectWrapper iObjectWrapper) throws RemoteException {
        E7(iObjectWrapper, false);
    }
}
