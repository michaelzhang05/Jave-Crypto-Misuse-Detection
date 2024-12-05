package com.google.android.gms.common.api.internal;

import android.os.Handler;
import v1.c;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class k implements c.e {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ l f4601a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public k(l lVar) {
        this.f4601a = lVar;
    }

    @Override // v1.c.e
    public final void a() {
        Handler handler;
        handler = this.f4601a.f4614m.f4581p;
        handler.post(new j(this));
    }
}
