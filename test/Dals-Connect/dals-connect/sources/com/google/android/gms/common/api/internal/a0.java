package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.GoogleApiManager;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class a0 implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ GoogleApiManager.zaa f10611f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a0(GoogleApiManager.zaa zaaVar) {
        this.f10611f = zaaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f10611f.r();
    }
}
