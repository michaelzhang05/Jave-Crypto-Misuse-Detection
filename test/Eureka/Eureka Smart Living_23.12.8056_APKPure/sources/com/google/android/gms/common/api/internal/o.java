package com.google.android.gms.common.api.internal;

import android.os.Handler;
import android.util.Log;
import java.util.Map;
import java.util.Set;
import t1.a;
import v1.c;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class o implements c.InterfaceC0144c, u1.u {

    /* renamed from: a, reason: collision with root package name */
    private final a.f f4619a;

    /* renamed from: b, reason: collision with root package name */
    private final u1.b f4620b;

    /* renamed from: c, reason: collision with root package name */
    private v1.i f4621c = null;

    /* renamed from: d, reason: collision with root package name */
    private Set f4622d = null;

    /* renamed from: e, reason: collision with root package name */
    private boolean f4623e = false;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ b f4624f;

    public o(b bVar, a.f fVar, u1.b bVar2) {
        this.f4624f = bVar;
        this.f4619a = fVar;
        this.f4620b = bVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h() {
        v1.i iVar;
        if (!this.f4623e || (iVar = this.f4621c) == null) {
            return;
        }
        this.f4619a.n(iVar, this.f4622d);
    }

    @Override // u1.u
    public final void a(s1.a aVar) {
        Map map;
        map = this.f4624f.f4577l;
        l lVar = (l) map.get(this.f4620b);
        if (lVar != null) {
            lVar.H(aVar);
        }
    }

    @Override // v1.c.InterfaceC0144c
    public final void b(s1.a aVar) {
        Handler handler;
        handler = this.f4624f.f4581p;
        handler.post(new n(this, aVar));
    }

    @Override // u1.u
    public final void c(v1.i iVar, Set set) {
        if (iVar == null || set == null) {
            Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
            a(new s1.a(4));
        } else {
            this.f4621c = iVar;
            this.f4622d = set;
            h();
        }
    }
}
