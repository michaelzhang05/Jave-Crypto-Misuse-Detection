package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public final class t extends u1.q {

    /* renamed from: b, reason: collision with root package name */
    private final c f4636b;

    /* renamed from: c, reason: collision with root package name */
    private final l2.j f4637c;

    /* renamed from: d, reason: collision with root package name */
    private final u1.j f4638d;

    public t(int i6, c cVar, l2.j jVar, u1.j jVar2) {
        super(i6);
        this.f4637c = jVar;
        this.f4636b = cVar;
        this.f4638d = jVar2;
        if (i6 == 2 && cVar.c()) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // com.google.android.gms.common.api.internal.v
    public final void a(Status status) {
        this.f4637c.d(this.f4638d.a(status));
    }

    @Override // com.google.android.gms.common.api.internal.v
    public final void b(Exception exc) {
        this.f4637c.d(exc);
    }

    @Override // com.google.android.gms.common.api.internal.v
    public final void c(l lVar) {
        try {
            this.f4636b.b(lVar.u(), this.f4637c);
        } catch (DeadObjectException e6) {
            throw e6;
        } catch (RemoteException e7) {
            a(v.e(e7));
        } catch (RuntimeException e8) {
            this.f4637c.d(e8);
        }
    }

    @Override // com.google.android.gms.common.api.internal.v
    public final void d(e eVar, boolean z5) {
        eVar.b(this.f4637c, z5);
    }

    @Override // u1.q
    public final boolean f(l lVar) {
        return this.f4636b.c();
    }

    @Override // u1.q
    public final s1.c[] g(l lVar) {
        return this.f4636b.e();
    }
}
