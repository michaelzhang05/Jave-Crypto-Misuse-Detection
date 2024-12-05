package com.google.android.gms.common.api.internal;

import N.C1333d;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import q0.C3826j;

/* loaded from: classes3.dex */
public final class w extends P.t {

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC2064d f16004b;

    /* renamed from: c, reason: collision with root package name */
    private final C3826j f16005c;

    /* renamed from: d, reason: collision with root package name */
    private final P.k f16006d;

    public w(int i8, AbstractC2064d abstractC2064d, C3826j c3826j, P.k kVar) {
        super(i8);
        this.f16005c = c3826j;
        this.f16004b = abstractC2064d;
        this.f16006d = kVar;
        if (i8 == 2 && abstractC2064d.c()) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // com.google.android.gms.common.api.internal.y
    public final void a(Status status) {
        this.f16005c.d(this.f16006d.a(status));
    }

    @Override // com.google.android.gms.common.api.internal.y
    public final void b(Exception exc) {
        this.f16005c.d(exc);
    }

    @Override // com.google.android.gms.common.api.internal.y
    public final void c(n nVar) {
        try {
            this.f16004b.b(nVar.v(), this.f16005c);
        } catch (DeadObjectException e8) {
            throw e8;
        } catch (RemoteException e9) {
            a(y.e(e9));
        } catch (RuntimeException e10) {
            this.f16005c.d(e10);
        }
    }

    @Override // com.google.android.gms.common.api.internal.y
    public final void d(g gVar, boolean z8) {
        gVar.d(this.f16005c, z8);
    }

    @Override // P.t
    public final boolean f(n nVar) {
        return this.f16004b.c();
    }

    @Override // P.t
    public final C1333d[] g(n nVar) {
        return this.f16004b.e();
    }
}
