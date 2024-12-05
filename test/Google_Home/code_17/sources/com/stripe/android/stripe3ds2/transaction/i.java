package com.stripe.android.stripe3ds2.transaction;

import b4.C1975a;
import com.stripe.android.stripe3ds2.transaction.c;
import com.stripe.android.stripe3ds2.transaction.p;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public final class i implements e {

    /* renamed from: a, reason: collision with root package name */
    private final X3.c f27911a;

    /* renamed from: b, reason: collision with root package name */
    private final S5.g f27912b;

    public i(X3.c errorReporter, S5.g workContext) {
        AbstractC3255y.i(errorReporter, "errorReporter");
        AbstractC3255y.i(workContext, "workContext");
        this.f27911a = errorReporter;
        this.f27912b = workContext;
    }

    @Override // com.stripe.android.stripe3ds2.transaction.e
    public Object a(c.a aVar, C1975a c1975a, S5.d dVar) {
        return new p.b(aVar).H(this.f27911a, this.f27912b).a(c1975a, dVar);
    }
}
