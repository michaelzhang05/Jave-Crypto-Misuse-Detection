package com.google.android.gms.common.api.internal;

import O.C1260d;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import r0.C3679j;

/* loaded from: classes3.dex */
public final class w extends Q.t {

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC1940d f15203b;

    /* renamed from: c, reason: collision with root package name */
    private final C3679j f15204c;

    /* renamed from: d, reason: collision with root package name */
    private final Q.k f15205d;

    public w(int i8, AbstractC1940d abstractC1940d, C3679j c3679j, Q.k kVar) {
        super(i8);
        this.f15204c = c3679j;
        this.f15203b = abstractC1940d;
        this.f15205d = kVar;
        if (i8 == 2 && abstractC1940d.c()) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // com.google.android.gms.common.api.internal.y
    public final void a(Status status) {
        this.f15204c.d(this.f15205d.a(status));
    }

    @Override // com.google.android.gms.common.api.internal.y
    public final void b(Exception exc) {
        this.f15204c.d(exc);
    }

    @Override // com.google.android.gms.common.api.internal.y
    public final void c(n nVar) {
        try {
            this.f15203b.b(nVar.v(), this.f15204c);
        } catch (DeadObjectException e8) {
            throw e8;
        } catch (RemoteException e9) {
            a(y.e(e9));
        } catch (RuntimeException e10) {
            this.f15204c.d(e10);
        }
    }

    @Override // com.google.android.gms.common.api.internal.y
    public final void d(g gVar, boolean z8) {
        gVar.d(this.f15204c, z8);
    }

    @Override // Q.t
    public final boolean f(n nVar) {
        return this.f15203b.c();
    }

    @Override // Q.t
    public final C1260d[] g(n nVar) {
        return this.f15203b.e();
    }
}
