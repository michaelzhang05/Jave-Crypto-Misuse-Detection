package com.stripe.android.model;

import com.stripe.android.model.b;
import com.stripe.android.model.r;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public abstract class s {
    public static final b.c a(r rVar) {
        AbstractC3255y.i(rVar, "<this>");
        if (rVar instanceof r.a) {
            return null;
        }
        if (rVar instanceof r.b) {
            return ((r.b) rVar).h();
        }
        if (rVar instanceof r.c) {
            return null;
        }
        if (rVar instanceof r.d) {
            return ((r.d) rVar).b();
        }
        if ((rVar instanceof r.e) || AbstractC3255y.d(rVar, r.f.f25730c)) {
            return null;
        }
        throw new O5.p();
    }
}
