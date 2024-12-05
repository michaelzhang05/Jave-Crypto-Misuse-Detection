package com.google.android.gms.common.api.internal;

import N.C1331b;
import N.C1336g;
import P.C1357b;
import Q.AbstractC1400p;
import android.app.Activity;
import androidx.collection.ArraySet;

/* loaded from: classes3.dex */
public final class h extends C {

    /* renamed from: f, reason: collision with root package name */
    private final ArraySet f15961f;

    /* renamed from: g, reason: collision with root package name */
    private final C2063c f15962g;

    h(P.e eVar, C2063c c2063c, C1336g c1336g) {
        super(eVar, c1336g);
        this.f15961f = new ArraySet();
        this.f15962g = c2063c;
        this.f15921a.b("ConnectionlessLifecycleHelper", this);
    }

    public static void u(Activity activity, C2063c c2063c, C1357b c1357b) {
        P.e d8 = LifecycleCallback.d(activity);
        h hVar = (h) d8.e("ConnectionlessLifecycleHelper", h.class);
        if (hVar == null) {
            hVar = new h(d8, c2063c, C1336g.n());
        }
        AbstractC1400p.m(c1357b, "ApiKey cannot be null");
        hVar.f15961f.add(c1357b);
        c2063c.b(hVar);
    }

    private final void v() {
        if (!this.f15961f.isEmpty()) {
            this.f15962g.b(this);
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
        this.f15962g.c(this);
    }

    @Override // com.google.android.gms.common.api.internal.C
    protected final void m(C1331b c1331b, int i8) {
        this.f15962g.D(c1331b, i8);
    }

    @Override // com.google.android.gms.common.api.internal.C
    protected final void n() {
        this.f15962g.E();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ArraySet t() {
        return this.f15961f;
    }
}
