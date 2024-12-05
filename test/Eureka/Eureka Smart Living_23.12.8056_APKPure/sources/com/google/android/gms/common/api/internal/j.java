package com.google.android.gms.common.api.internal;

import t1.a;

/* loaded from: classes.dex */
final class j implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ k f4600a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(k kVar) {
        this.f4600a = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a.f fVar;
        a.f fVar2;
        l lVar = this.f4600a.f4601a;
        fVar = lVar.f4603b;
        fVar2 = lVar.f4603b;
        fVar.i(fVar2.getClass().getName().concat(" disconnecting because it was signed out."));
    }
}
