package com.google.firebase.installations;

import l2.j;

/* loaded from: classes.dex */
class f implements h {

    /* renamed from: a, reason: collision with root package name */
    final j f5801a;

    public f(j jVar) {
        this.f5801a = jVar;
    }

    @Override // com.google.firebase.installations.h
    public boolean a(m4.d dVar) {
        if (!dVar.l() && !dVar.k() && !dVar.i()) {
            return false;
        }
        this.f5801a.e(dVar.d());
        return true;
    }

    @Override // com.google.firebase.installations.h
    public boolean b(Exception exc) {
        return false;
    }
}
