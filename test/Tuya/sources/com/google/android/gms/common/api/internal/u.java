package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import r0.C3679j;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public abstract class u extends Q.t {

    /* renamed from: b, reason: collision with root package name */
    protected final C3679j f15201b;

    public u(int i8, C3679j c3679j) {
        super(i8);
        this.f15201b = c3679j;
    }

    @Override // com.google.android.gms.common.api.internal.y
    public final void a(Status status) {
        this.f15201b.d(new P.b(status));
    }

    @Override // com.google.android.gms.common.api.internal.y
    public final void b(Exception exc) {
        this.f15201b.d(exc);
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
            this.f15201b.d(e10);
        }
    }

    protected abstract void h(n nVar);
}
