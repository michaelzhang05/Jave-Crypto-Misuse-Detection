package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.GoogleApiManager;

/* loaded from: classes2.dex */
final class z implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ GoogleApiManager.zaa f10669f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public z(GoogleApiManager.zaa zaaVar) {
        this.f10669f = zaaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f10669f.q();
    }
}
