package com.google.android.gms.common.api.internal;

import O.a;

/* loaded from: classes3.dex */
final class l implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ m f15967a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public l(m mVar) {
        this.f15967a = mVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a.f fVar;
        a.f fVar2;
        n nVar = this.f15967a.f15968a;
        fVar = nVar.f15970b;
        fVar2 = nVar.f15970b;
        fVar.d(fVar2.getClass().getName().concat(" disconnecting because it was signed out."));
    }
}
