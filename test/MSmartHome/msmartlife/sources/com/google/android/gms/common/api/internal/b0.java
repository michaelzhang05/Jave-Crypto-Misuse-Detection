package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.GoogleApiManager;

/* loaded from: classes2.dex */
final class b0 implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ ConnectionResult f10613f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ GoogleApiManager.zaa f10614g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b0(GoogleApiManager.zaa zaaVar, ConnectionResult connectionResult) {
        this.f10614g = zaaVar;
        this.f10613f = connectionResult;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f10614g.i0(this.f10613f);
    }
}
