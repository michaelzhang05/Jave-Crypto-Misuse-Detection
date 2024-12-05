package com.google.android.gms.common.api.internal;

import P.a;
import R.AbstractC1319p;
import android.app.PendingIntent;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.common.api.internal.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1938b extends BasePendingResult {

    /* renamed from: n, reason: collision with root package name */
    private final a.c f15126n;

    /* renamed from: o, reason: collision with root package name */
    private final P.a f15127o;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC1938b(P.a aVar, P.f fVar) {
        super((P.f) AbstractC1319p.m(fVar, "GoogleApiClient must not be null"));
        AbstractC1319p.m(aVar, "Api must not be null");
        this.f15126n = aVar.b();
        this.f15127o = aVar;
    }

    private void n(RemoteException remoteException) {
        o(new Status(8, remoteException.getLocalizedMessage(), (PendingIntent) null));
    }

    protected abstract void k(a.b bVar);

    public final void m(a.b bVar) {
        try {
            k(bVar);
        } catch (DeadObjectException e8) {
            n(e8);
            throw e8;
        } catch (RemoteException e9) {
            n(e9);
        }
    }

    public final void o(Status status) {
        AbstractC1319p.b(!status.L(), "Failed result must not be success");
        P.j c8 = c(status);
        f(c8);
        l(c8);
    }

    protected void l(P.j jVar) {
    }
}
