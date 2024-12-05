package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Api;

/* loaded from: classes2.dex */
final class d0 implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ c0 f10617f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d0(c0 c0Var) {
        this.f10617f = c0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Api.Client client;
        client = this.f10617f.a.f10593g;
        client.disconnect();
    }
}
