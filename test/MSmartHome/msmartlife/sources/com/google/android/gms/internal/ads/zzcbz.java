package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzcbz extends zzaex {

    /* renamed from: f, reason: collision with root package name */
    private final String f13854f;

    /* renamed from: g, reason: collision with root package name */
    private final zzbyn f13855g;

    /* renamed from: h, reason: collision with root package name */
    private final zzbyt f13856h;

    public zzcbz(String str, zzbyn zzbynVar, zzbyt zzbytVar) {
        this.f13854f = str;
        this.f13855g = zzbynVar;
        this.f13856h = zzbytVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    public final zzaea a() throws RemoteException {
        return this.f13856h.V();
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    public final String b() throws RemoteException {
        return this.f13856h.g();
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    public final String c() throws RemoteException {
        return this.f13856h.d();
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    public final String d() throws RemoteException {
        return this.f13856h.c();
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    public final void destroy() throws RemoteException {
        this.f13855g.a();
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    public final IObjectWrapper e() throws RemoteException {
        return this.f13856h.W();
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    public final List f() throws RemoteException {
        return this.f13856h.h();
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    public final Bundle getExtras() throws RemoteException {
        return this.f13856h.f();
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    public final String getMediationAdapterClassName() throws RemoteException {
        return this.f13854f;
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    public final String getStore() throws RemoteException {
        return this.f13856h.l();
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    public final zzaar getVideoController() throws RemoteException {
        return this.f13856h.m();
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    public final zzaei h() throws RemoteException {
        return this.f13856h.U();
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    public final String i() throws RemoteException {
        return this.f13856h.j();
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    public final IObjectWrapper k() throws RemoteException {
        return ObjectWrapper.i0(this.f13855g);
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    public final double l() throws RemoteException {
        return this.f13856h.k();
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    public final void n(Bundle bundle) throws RemoteException {
        this.f13855g.w(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    public final boolean s(Bundle bundle) throws RemoteException {
        return this.f13855g.A(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    public final void y(Bundle bundle) throws RemoteException {
        this.f13855g.z(bundle);
    }
}
