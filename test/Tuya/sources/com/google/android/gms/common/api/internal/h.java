package com.google.android.gms.common.api.internal;

import O.C1258b;
import O.C1263g;
import Q.C1301b;
import R.AbstractC1319p;
import android.app.Activity;
import androidx.collection.ArraySet;

/* loaded from: classes3.dex */
public final class h extends C {

    /* renamed from: f, reason: collision with root package name */
    private final ArraySet f15160f;

    /* renamed from: g, reason: collision with root package name */
    private final C1939c f15161g;

    h(Q.e eVar, C1939c c1939c, C1263g c1263g) {
        super(eVar, c1263g);
        this.f15160f = new ArraySet();
        this.f15161g = c1939c;
        this.f15120a.a("ConnectionlessLifecycleHelper", this);
    }

    public static void u(Activity activity, C1939c c1939c, C1301b c1301b) {
        Q.e d8 = LifecycleCallback.d(activity);
        h hVar = (h) d8.e("ConnectionlessLifecycleHelper", h.class);
        if (hVar == null) {
            hVar = new h(d8, c1939c, C1263g.n());
        }
        AbstractC1319p.m(c1301b, "ApiKey cannot be null");
        hVar.f15160f.add(c1301b);
        c1939c.b(hVar);
    }

    private final void v() {
        if (!this.f15160f.isEmpty()) {
            this.f15161g.b(this);
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void h() {
        super.h();
        v();
    }

    @Override // com.google.android.gms.common.api.internal.C, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void j() {
        super.j();
        v();
    }

    @Override // com.google.android.gms.common.api.internal.C, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void k() {
        super.k();
        this.f15161g.c(this);
    }

    @Override // com.google.android.gms.common.api.internal.C
    protected final void m(C1258b c1258b, int i8) {
        this.f15161g.D(c1258b, i8);
    }

    @Override // com.google.android.gms.common.api.internal.C
    protected final void n() {
        this.f15161g.E();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ArraySet t() {
        return this.f15160f;
    }
}
