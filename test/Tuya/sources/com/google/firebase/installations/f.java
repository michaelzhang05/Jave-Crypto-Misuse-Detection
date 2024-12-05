package com.google.firebase.installations;

import b1.AbstractC1854d;
import r0.C3679j;

/* loaded from: classes3.dex */
class f implements h {

    /* renamed from: a, reason: collision with root package name */
    final C3679j f17288a;

    public f(C3679j c3679j) {
        this.f17288a = c3679j;
    }

    @Override // com.google.firebase.installations.h
    public boolean a(AbstractC1854d abstractC1854d) {
        if (!abstractC1854d.l() && !abstractC1854d.k() && !abstractC1854d.i()) {
            return false;
        }
        this.f17288a.e(abstractC1854d.d());
        return true;
    }

    @Override // com.google.firebase.installations.h
    public boolean b(Exception exc) {
        return false;
    }
}
