package com.google.android.gms.common.api.internal;

import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
final class m extends com.google.android.gms.signin.internal.zac {

    /* renamed from: f, reason: collision with root package name */
    private final WeakReference<zaak> f10639f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public m(zaak zaakVar) {
        this.f10639f = new WeakReference<>(zaakVar);
    }

    @Override // com.google.android.gms.signin.internal.zac, com.google.android.gms.signin.internal.zad
    public final void k1(com.google.android.gms.signin.internal.zaj zajVar) {
        zabe zabeVar;
        zaak zaakVar = this.f10639f.get();
        if (zaakVar == null) {
            return;
        }
        zabeVar = zaakVar.a;
        zabeVar.h(new n(this, zaakVar, zaakVar, zajVar));
    }
}
