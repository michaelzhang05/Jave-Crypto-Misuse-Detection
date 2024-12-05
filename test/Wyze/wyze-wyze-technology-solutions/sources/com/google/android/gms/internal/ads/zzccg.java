package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzccg extends zzagh {

    /* renamed from: f, reason: collision with root package name */
    private final String f13877f;

    /* renamed from: g, reason: collision with root package name */
    private final zzbyn f13878g;

    /* renamed from: h, reason: collision with root package name */
    private final zzbyt f13879h;

    public zzccg(String str, zzbyn zzbynVar, zzbyt zzbytVar) {
        this.f13877f = str;
        this.f13878g = zzbynVar;
        this.f13879h = zzbytVar;
    }

    @Override // com.google.android.gms.internal.ads.zzagg
    public final void I() throws RemoteException {
        this.f13878g.g();
    }

    @Override // com.google.android.gms.internal.ads.zzagg
    public final void N(zzagd zzagdVar) throws RemoteException {
        this.f13878g.n(zzagdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzagg
    public final void O(zzaak zzaakVar) throws RemoteException {
        this.f13878g.m(zzaakVar);
    }

    @Override // com.google.android.gms.internal.ads.zzagg
    public final void Q() {
        this.f13878g.B();
    }

    @Override // com.google.android.gms.internal.ads.zzagg
    public final zzaea a() throws RemoteException {
        return this.f13879h.V();
    }

    @Override // com.google.android.gms.internal.ads.zzagg
    public final void a7() {
        this.f13878g.h();
    }

    @Override // com.google.android.gms.internal.ads.zzagg
    public final String b() throws RemoteException {
        return this.f13879h.g();
    }

    @Override // com.google.android.gms.internal.ads.zzagg
    public final String c() throws RemoteException {
        return this.f13879h.d();
    }

    @Override // com.google.android.gms.internal.ads.zzagg
    public final String d() throws RemoteException {
        return this.f13879h.c();
    }

    @Override // com.google.android.gms.internal.ads.zzagg
    public final void destroy() throws RemoteException {
        this.f13878g.a();
    }

    @Override // com.google.android.gms.internal.ads.zzagg
    public final IObjectWrapper e() throws RemoteException {
        return this.f13879h.W();
    }

    @Override // com.google.android.gms.internal.ads.zzagg
    public final zzaee e2() throws RemoteException {
        return this.f13878g.C();
    }

    @Override // com.google.android.gms.internal.ads.zzagg
    public final List f() throws RemoteException {
        return this.f13879h.h();
    }

    @Override // com.google.android.gms.internal.ads.zzagg
    public final Bundle getExtras() throws RemoteException {
        return this.f13879h.f();
    }

    @Override // com.google.android.gms.internal.ads.zzagg
    public final String getMediationAdapterClassName() throws RemoteException {
        return this.f13877f;
    }

    @Override // com.google.android.gms.internal.ads.zzagg
    public final String getStore() throws RemoteException {
        return this.f13879h.l();
    }

    @Override // com.google.android.gms.internal.ads.zzagg
    public final zzaar getVideoController() throws RemoteException {
        return this.f13879h.m();
    }

    @Override // com.google.android.gms.internal.ads.zzagg
    public final zzaei h() throws RemoteException {
        return this.f13879h.U();
    }

    @Override // com.google.android.gms.internal.ads.zzagg
    public final String i() throws RemoteException {
        return this.f13879h.j();
    }

    @Override // com.google.android.gms.internal.ads.zzagg
    public final IObjectWrapper k() throws RemoteException {
        return ObjectWrapper.i0(this.f13878g);
    }

    @Override // com.google.android.gms.internal.ads.zzagg
    public final void k0(zzaag zzaagVar) throws RemoteException {
        this.f13878g.l(zzaagVar);
    }

    @Override // com.google.android.gms.internal.ads.zzagg
    public final boolean k2() throws RemoteException {
        return (this.f13879h.i().isEmpty() || this.f13879h.y() == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzagg
    public final double l() throws RemoteException {
        return this.f13879h.k();
    }

    @Override // com.google.android.gms.internal.ads.zzagg
    public final String m() throws RemoteException {
        return this.f13879h.b();
    }

    @Override // com.google.android.gms.internal.ads.zzagg
    public final void n(Bundle bundle) throws RemoteException {
        this.f13878g.w(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzagg
    public final boolean s(Bundle bundle) throws RemoteException {
        return this.f13878g.A(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzagg
    public final void y(Bundle bundle) throws RemoteException {
        this.f13878g.z(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzagg
    public final List z4() throws RemoteException {
        if (k2()) {
            return this.f13879h.i();
        }
        return Collections.emptyList();
    }
}
