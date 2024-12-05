package com.google.android.gms.common.api.internal;

import Q.AbstractC1387c;
import android.os.Handler;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class m implements AbstractC1387c.e {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ n f15968a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public m(n nVar) {
        this.f15968a = nVar;
    }

    @Override // Q.AbstractC1387c.e
    public final void a() {
        Handler handler;
        handler = this.f15968a.f15981u.f15946n;
        handler.post(new l(this));
    }
}
