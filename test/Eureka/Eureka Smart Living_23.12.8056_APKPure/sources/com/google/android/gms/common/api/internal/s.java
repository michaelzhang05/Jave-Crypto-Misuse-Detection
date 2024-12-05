package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class s extends u1.q {

    /* renamed from: b, reason: collision with root package name */
    protected final l2.j f4635b;

    public s(int i6, l2.j jVar) {
        super(i6);
        this.f4635b = jVar;
    }

    @Override // com.google.android.gms.common.api.internal.v
    public final void a(Status status) {
        this.f4635b.d(new t1.b(status));
    }

    @Override // com.google.android.gms.common.api.internal.v
    public final void b(Exception exc) {
        this.f4635b.d(exc);
    }

    @Override // com.google.android.gms.common.api.internal.v
    public final void c(l lVar) {
        try {
            h(lVar);
        } catch (DeadObjectException e6) {
            a(v.e(e6));
            throw e6;
        } catch (RemoteException e7) {
            a(v.e(e7));
        } catch (RuntimeException e8) {
            this.f4635b.d(e8);
        }
    }

    protected abstract void h(l lVar);
}
