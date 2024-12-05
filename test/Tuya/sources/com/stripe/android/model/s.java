package com.stripe.android.model;

import com.stripe.android.model.b;
import com.stripe.android.model.r;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public abstract class s {
    public static final b.c a(r rVar) {
        AbstractC3159y.i(rVar, "<this>");
        if (rVar instanceof r.a) {
            return null;
        }
        if (rVar instanceof r.b) {
            return ((r.b) rVar).f();
        }
        if (rVar instanceof r.c) {
            return null;
        }
        if (rVar instanceof r.d) {
            return ((r.d) rVar).c();
        }
        if ((rVar instanceof r.e) || AbstractC3159y.d(rVar, r.f.f24675c)) {
            return null;
        }
        throw new L5.p();
    }
}
