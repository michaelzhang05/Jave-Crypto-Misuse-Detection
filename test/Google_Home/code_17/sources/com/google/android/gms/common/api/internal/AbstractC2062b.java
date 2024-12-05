package com.google.android.gms.common.api.internal;

import O.a;
import Q.AbstractC1400p;
import android.app.PendingIntent;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.common.api.internal.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2062b extends BasePendingResult {

    /* renamed from: n, reason: collision with root package name */
    private final a.c f15927n;

    /* renamed from: o, reason: collision with root package name */
    private final O.a f15928o;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC2062b(O.a aVar, O.f fVar) {
        super((O.f) AbstractC1400p.m(fVar, "GoogleApiClient must not be null"));
        AbstractC1400p.m(aVar, "Api must not be null");
        this.f15927n = aVar.b();
        this.f15928o = aVar;
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
        AbstractC1400p.b(!status.H(), "Failed result must not be success");
        O.j c8 = c(status);
        f(c8);
        l(c8);
    }

    protected void l(O.j jVar) {
    }
}
