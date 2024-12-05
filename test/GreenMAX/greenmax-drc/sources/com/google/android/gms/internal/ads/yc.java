package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
final class yc extends zzbnf {

    /* renamed from: f, reason: collision with root package name */
    private final Context f12457f;

    /* renamed from: g, reason: collision with root package name */
    private final View f12458g;

    /* renamed from: h, reason: collision with root package name */
    private final zzbgz f12459h;

    /* renamed from: i, reason: collision with root package name */
    private final zzcxn f12460i;

    /* renamed from: j, reason: collision with root package name */
    private final zzbpb f12461j;

    /* renamed from: k, reason: collision with root package name */
    private final zzbzc f12462k;
    private final zzbvd l;
    private final zzdte<zzcpm> m;
    private final Executor n;

    /* JADX INFO: Access modifiers changed from: package-private */
    public yc(Context context, zzcxn zzcxnVar, View view, zzbgz zzbgzVar, zzbpb zzbpbVar, zzbzc zzbzcVar, zzbvd zzbvdVar, zzdte<zzcpm> zzdteVar, Executor executor) {
        this.f12457f = context;
        this.f12458g = view;
        this.f12459h = zzbgzVar;
        this.f12460i = zzcxnVar;
        this.f12461j = zzbpbVar;
        this.f12462k = zzbzcVar;
        this.l = zzbvdVar;
        this.m = zzdteVar;
        this.n = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzbpc
    public final void c() {
        this.n.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zc

            /* renamed from: f, reason: collision with root package name */
            private final yc f12523f;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f12523f = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f12523f.m();
            }
        });
        super.c();
    }

    @Override // com.google.android.gms.internal.ads.zzbnf
    public final zzaar g() {
        try {
            return this.f12461j.getVideoController();
        } catch (RemoteException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbnf
    public final void h(ViewGroup viewGroup, zzyd zzydVar) {
        zzbgz zzbgzVar;
        if (viewGroup == null || (zzbgzVar = this.f12459h) == null) {
            return;
        }
        zzbgzVar.A(zzbin.i(zzydVar));
        viewGroup.setMinimumHeight(zzydVar.f15812h);
        viewGroup.setMinimumWidth(zzydVar.f15815k);
    }

    @Override // com.google.android.gms.internal.ads.zzbnf
    public final View i() {
        return this.f12458g;
    }

    @Override // com.google.android.gms.internal.ads.zzbnf
    public final zzcxn j() {
        return this.f13486b.o.get(0);
    }

    @Override // com.google.android.gms.internal.ads.zzbnf
    public final int k() {
        return this.a.f14570b.f14567b.f14560c;
    }

    @Override // com.google.android.gms.internal.ads.zzbnf
    public final void l() {
        this.l.Y();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void m() {
        if (this.f12462k.d() != null) {
            try {
                this.f12462k.d().P0(this.m.get(), ObjectWrapper.i0(this.f12457f));
            } catch (RemoteException e2) {
                zzbad.c("RemoteException when notifyAdLoad is called", e2);
            }
        }
    }
}
