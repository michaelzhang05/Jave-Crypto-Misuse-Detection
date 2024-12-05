package com.google.firebase.installations;

import l2.j;

/* loaded from: classes.dex */
class e implements h {

    /* renamed from: a, reason: collision with root package name */
    private final i f5799a;

    /* renamed from: b, reason: collision with root package name */
    private final j f5800b;

    public e(i iVar, j jVar) {
        this.f5799a = iVar;
        this.f5800b = jVar;
    }

    @Override // com.google.firebase.installations.h
    public boolean a(m4.d dVar) {
        if (!dVar.k() || this.f5799a.f(dVar)) {
            return false;
        }
        this.f5800b.c(g.a().b(dVar.b()).d(dVar.c()).c(dVar.h()).a());
        return true;
    }

    @Override // com.google.firebase.installations.h
    public boolean b(Exception exc) {
        this.f5800b.d(exc);
        return true;
    }
}
