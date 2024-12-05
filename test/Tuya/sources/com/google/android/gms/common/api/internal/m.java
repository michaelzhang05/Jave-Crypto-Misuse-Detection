package com.google.android.gms.common.api.internal;

import R.AbstractC1306c;
import android.os.Handler;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class m implements AbstractC1306c.e {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ n f15167a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public m(n nVar) {
        this.f15167a = nVar;
    }

    @Override // R.AbstractC1306c.e
    public final void a() {
        Handler handler;
        handler = this.f15167a.f15180u.f15145n;
        handler.post(new l(this));
    }
}
