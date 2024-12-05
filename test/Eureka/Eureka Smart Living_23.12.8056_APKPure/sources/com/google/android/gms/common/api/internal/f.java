package com.google.android.gms.common.api.internal;

import android.app.Activity;

/* loaded from: classes.dex */
public final class f extends z {

    /* renamed from: f, reason: collision with root package name */
    private final l.b f4594f;

    /* renamed from: g, reason: collision with root package name */
    private final b f4595g;

    f(u1.e eVar, b bVar, s1.f fVar) {
        super(eVar, fVar);
        this.f4594f = new l.b();
        this.f4595g = bVar;
        this.f4556a.b("ConnectionlessLifecycleHelper", this);
    }

    public static void u(Activity activity, b bVar, u1.b bVar2) {
        u1.e c6 = LifecycleCallback.c(activity);
        f fVar = (f) c6.e("ConnectionlessLifecycleHelper", f.class);
        if (fVar == null) {
            fVar = new f(c6, bVar, s1.f.k());
        }
        v1.n.i(bVar2, "ApiKey cannot be null");
        fVar.f4594f.add(bVar2);
        bVar.c(fVar);
    }

    private final void v() {
        if (this.f4594f.isEmpty()) {
            return;
        }
        this.f4595g.c(this);
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void h() {
        super.h();
        v();
    }

    @Override // com.google.android.gms.common.api.internal.z, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void j() {
        super.j();
        v();
    }

    @Override // com.google.android.gms.common.api.internal.z, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void k() {
        super.k();
        this.f4595g.d(this);
    }

    @Override // com.google.android.gms.common.api.internal.z
    protected final void m(s1.a aVar, int i6) {
        this.f4595g.F(aVar, i6);
    }

    @Override // com.google.android.gms.common.api.internal.z
    protected final void n() {
        this.f4595g.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final l.b t() {
        return this.f4594f;
    }
}
