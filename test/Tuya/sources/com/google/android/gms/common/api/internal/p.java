package com.google.android.gms.common.api.internal;

import O.C1258b;
import P.a;
import Q.C1301b;
import android.util.Log;
import java.util.Map;

/* loaded from: classes3.dex */
final class p implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C1258b f15183a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ q f15184b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public p(q qVar, C1258b c1258b) {
        this.f15184b = qVar;
        this.f15183a = c1258b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Map map;
        C1301b c1301b;
        a.f fVar;
        a.f fVar2;
        a.f fVar3;
        a.f fVar4;
        q qVar = this.f15184b;
        map = qVar.f15190f.f15141j;
        c1301b = qVar.f15186b;
        n nVar = (n) map.get(c1301b);
        if (nVar == null) {
            return;
        }
        if (this.f15183a.I()) {
            this.f15184b.f15189e = true;
            fVar = this.f15184b.f15185a;
            if (fVar.n()) {
                this.f15184b.i();
                return;
            }
            try {
                q qVar2 = this.f15184b;
                fVar3 = qVar2.f15185a;
                fVar4 = qVar2.f15185a;
                fVar3.p(null, fVar4.c());
                return;
            } catch (SecurityException e8) {
                Log.e("GoogleApiManager", "Failed to get service from broker. ", e8);
                fVar2 = this.f15184b.f15185a;
                fVar2.d("Failed to get service from broker.");
                nVar.H(new C1258b(10), null);
                return;
            }
        }
        nVar.H(this.f15183a, null);
    }
}
