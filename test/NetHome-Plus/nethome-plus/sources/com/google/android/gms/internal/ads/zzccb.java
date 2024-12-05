package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzccb extends zzafb {

    /* renamed from: f, reason: collision with root package name */
    private final String f13865f;

    /* renamed from: g, reason: collision with root package name */
    private final zzbyn f13866g;

    /* renamed from: h, reason: collision with root package name */
    private final zzbyt f13867h;

    public zzccb(String str, zzbyn zzbynVar, zzbyt zzbytVar) {
        this.f13865f = str;
        this.f13866g = zzbynVar;
        this.f13867h = zzbytVar;
    }

    @Override // com.google.android.gms.internal.ads.zzafa
    public final zzaea a() throws RemoteException {
        return this.f13867h.V();
    }

    @Override // com.google.android.gms.internal.ads.zzafa
    public final String b() throws RemoteException {
        return this.f13867h.g();
    }

    @Override // com.google.android.gms.internal.ads.zzafa
    public final String c() throws RemoteException {
        return this.f13867h.d();
    }

    @Override // com.google.android.gms.internal.ads.zzafa
    public final String d() throws RemoteException {
        return this.f13867h.c();
    }

    @Override // com.google.android.gms.internal.ads.zzafa
    public final void destroy() throws RemoteException {
        this.f13866g.a();
    }

    @Override // com.google.android.gms.internal.ads.zzafa
    public final IObjectWrapper e() throws RemoteException {
        return this.f13867h.W();
    }

    @Override // com.google.android.gms.internal.ads.zzafa
    public final List f() throws RemoteException {
        return this.f13867h.h();
    }

    @Override // com.google.android.gms.internal.ads.zzafa
    public final Bundle getExtras() throws RemoteException {
        return this.f13867h.f();
    }

    @Override // com.google.android.gms.internal.ads.zzafa
    public final String getMediationAdapterClassName() throws RemoteException {
        return this.f13865f;
    }

    @Override // com.google.android.gms.internal.ads.zzafa
    public final zzaar getVideoController() throws RemoteException {
        return this.f13867h.m();
    }

    @Override // com.google.android.gms.internal.ads.zzafa
    public final zzaei h0() throws RemoteException {
        return this.f13867h.X();
    }

    @Override // com.google.android.gms.internal.ads.zzafa
    public final IObjectWrapper k() throws RemoteException {
        return ObjectWrapper.i0(this.f13866g);
    }

    @Override // com.google.android.gms.internal.ads.zzafa
    public final String m() throws RemoteException {
        return this.f13867h.b();
    }

    @Override // com.google.android.gms.internal.ads.zzafa
    public final void n(Bundle bundle) throws RemoteException {
        this.f13866g.w(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzafa
    public final boolean s(Bundle bundle) throws RemoteException {
        return this.f13866g.A(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzafa
    public final void y(Bundle bundle) throws RemoteException {
        this.f13866g.z(bundle);
    }
}
