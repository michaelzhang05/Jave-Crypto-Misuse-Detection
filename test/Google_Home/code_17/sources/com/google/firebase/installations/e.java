package com.google.firebase.installations;

import d1.AbstractC2734d;
import q0.C3826j;

/* loaded from: classes3.dex */
class e implements h {

    /* renamed from: a, reason: collision with root package name */
    private final i f18320a;

    /* renamed from: b, reason: collision with root package name */
    private final C3826j f18321b;

    public e(i iVar, C3826j c3826j) {
        this.f18320a = iVar;
        this.f18321b = c3826j;
    }

    @Override // com.google.firebase.installations.h
    public boolean a(AbstractC2734d abstractC2734d) {
        if (abstractC2734d.k() && !this.f18320a.f(abstractC2734d)) {
            this.f18321b.c(g.a().b(abstractC2734d.b()).d(abstractC2734d.c()).c(abstractC2734d.h()).a());
            return true;
        }
        return false;
    }

    @Override // com.google.firebase.installations.h
    public boolean b(Exception exc) {
        this.f18321b.d(exc);
        return true;
    }
}
