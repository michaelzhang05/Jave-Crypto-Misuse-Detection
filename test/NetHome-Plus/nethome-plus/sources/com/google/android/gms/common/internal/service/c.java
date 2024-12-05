package com.google.android.gms.common.internal.service;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;

/* loaded from: classes2.dex */
final class c extends zaa {

    /* renamed from: f, reason: collision with root package name */
    private final BaseImplementation.ResultHolder<Status> f10912f;

    public c(BaseImplementation.ResultHolder<Status> resultHolder) {
        this.f10912f = resultHolder;
    }

    @Override // com.google.android.gms.common.internal.service.zaa, com.google.android.gms.common.internal.service.zaj
    public final void n2(int i2) throws RemoteException {
        this.f10912f.a(new Status(i2));
    }
}
