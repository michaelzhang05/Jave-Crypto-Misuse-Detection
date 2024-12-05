package com.google.android.gms.common.api.internal;

import N.C1331b;
import O.a;
import P.C1357b;
import android.util.Log;
import java.util.Map;

/* loaded from: classes3.dex */
final class p implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C1331b f15984a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ q f15985b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public p(q qVar, C1331b c1331b) {
        this.f15985b = qVar;
        this.f15984a = c1331b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Map map;
        C1357b c1357b;
        a.f fVar;
        a.f fVar2;
        a.f fVar3;
        a.f fVar4;
        q qVar = this.f15985b;
        map = qVar.f15991f.f15942j;
        c1357b = qVar.f15987b;
        n nVar = (n) map.get(c1357b);
        if (nVar == null) {
            return;
        }
        if (this.f15984a.z()) {
            this.f15985b.f15990e = true;
            fVar = this.f15985b.f15986a;
            if (fVar.o()) {
                this.f15985b.i();
                return;
            }
            try {
                q qVar2 = this.f15985b;
                fVar3 = qVar2.f15986a;
                fVar4 = qVar2.f15986a;
                fVar3.m(null, fVar4.c());
                return;
            } catch (SecurityException e8) {
                Log.e("GoogleApiManager", "Failed to get service from broker. ", e8);
                fVar2 = this.f15985b.f15986a;
                fVar2.d("Failed to get service from broker.");
                nVar.H(new C1331b(10), null);
                return;
            }
        }
        nVar.H(this.f15984a, null);
    }
}
