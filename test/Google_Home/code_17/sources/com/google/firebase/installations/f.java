package com.google.firebase.installations;

import d1.AbstractC2734d;
import q0.C3826j;

/* loaded from: classes3.dex */
class f implements h {

    /* renamed from: a, reason: collision with root package name */
    final C3826j f18322a;

    public f(C3826j c3826j) {
        this.f18322a = c3826j;
    }

    @Override // com.google.firebase.installations.h
    public boolean a(AbstractC2734d abstractC2734d) {
        if (!abstractC2734d.l() && !abstractC2734d.k() && !abstractC2734d.i()) {
            return false;
        }
        this.f18322a.e(abstractC2734d.d());
        return true;
    }

    @Override // com.google.firebase.installations.h
    public boolean b(Exception exc) {
        return false;
    }
}
