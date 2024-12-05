package com.google.android.gms.auth.api.signin.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* loaded from: classes2.dex */
final class b extends zzc {

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ a f10460f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(a aVar) {
        this.f10460f = aVar;
    }

    @Override // com.google.android.gms.auth.api.signin.internal.zzc, com.google.android.gms.auth.api.signin.internal.zzs
    public final void N0(Status status) throws RemoteException {
        this.f10460f.k(status);
    }
}
