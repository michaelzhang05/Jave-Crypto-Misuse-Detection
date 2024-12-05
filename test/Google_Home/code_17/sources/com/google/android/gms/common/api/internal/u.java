package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import q0.C3826j;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public abstract class u extends P.t {

    /* renamed from: b, reason: collision with root package name */
    protected final C3826j f16002b;

    public u(int i8, C3826j c3826j) {
        super(i8);
        this.f16002b = c3826j;
    }

    @Override // com.google.android.gms.common.api.internal.y
    public final void a(Status status) {
        this.f16002b.d(new O.b(status));
    }

    @Override // com.google.android.gms.common.api.internal.y
    public final void b(Exception exc) {
        this.f16002b.d(exc);
    }

    @Override // com.google.android.gms.common.api.internal.y
    public final void c(n nVar) {
        try {
            h(nVar);
        } catch (DeadObjectException e8) {
            a(y.e(e8));
            throw e8;
        } catch (RemoteException e9) {
            a(y.e(e9));
        } catch (RuntimeException e10) {
            this.f16002b.d(e10);
        }
    }

    protected abstract void h(n nVar);
}
