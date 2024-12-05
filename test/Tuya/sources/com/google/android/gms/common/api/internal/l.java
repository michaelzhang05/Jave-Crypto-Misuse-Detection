package com.google.android.gms.common.api.internal;

import P.a;

/* loaded from: classes3.dex */
final class l implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ m f15166a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public l(m mVar) {
        this.f15166a = mVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a.f fVar;
        a.f fVar2;
        n nVar = this.f15166a.f15167a;
        fVar = nVar.f15169b;
        fVar2 = nVar.f15169b;
        fVar.d(fVar2.getClass().getName().concat(" disconnecting because it was signed out."));
    }
}
