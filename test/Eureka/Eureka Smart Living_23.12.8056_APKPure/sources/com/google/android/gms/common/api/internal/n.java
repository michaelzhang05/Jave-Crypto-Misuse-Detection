package com.google.android.gms.common.api.internal;

import android.util.Log;
import java.util.Map;
import t1.a;

/* loaded from: classes.dex */
final class n implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ s1.a f4617a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ o f4618b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public n(o oVar, s1.a aVar) {
        this.f4618b = oVar;
        this.f4617a = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Map map;
        u1.b bVar;
        a.f fVar;
        a.f fVar2;
        a.f fVar3;
        a.f fVar4;
        o oVar = this.f4618b;
        map = oVar.f4624f.f4577l;
        bVar = oVar.f4620b;
        l lVar = (l) map.get(bVar);
        if (lVar == null) {
            return;
        }
        if (!this.f4617a.e()) {
            lVar.G(this.f4617a, null);
            return;
        }
        this.f4618b.f4623e = true;
        fVar = this.f4618b.f4619a;
        if (fVar.j()) {
            this.f4618b.h();
            return;
        }
        try {
            o oVar2 = this.f4618b;
            fVar3 = oVar2.f4619a;
            fVar4 = oVar2.f4619a;
            fVar3.n(null, fVar4.g());
        } catch (SecurityException e6) {
            Log.e("GoogleApiManager", "Failed to get service from broker. ", e6);
            fVar2 = this.f4618b.f4619a;
            fVar2.i("Failed to get service from broker.");
            lVar.G(new s1.a(10), null);
        }
    }
}
