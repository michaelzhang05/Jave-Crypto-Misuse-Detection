package com.stripe.android.paymentsheet;

import com.stripe.android.model.StripeIntent;
import com.stripe.android.paymentsheet.u;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import u3.InterfaceC3802a;
import y3.AbstractC3991f;
import z3.InterfaceC4021c;

/* loaded from: classes4.dex */
public abstract class z {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ y f26796a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(y yVar) {
            super(0);
            this.f26796a = yVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(this.f26796a.f().u() != u.n.f26494d);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ y f26797a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(y yVar) {
            super(0);
            this.f26797a = yVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(this.f26797a.f().u() == u.n.f26494d && !(this.f26797a.r().f().getValue() instanceof InterfaceC4021c.d));
        }
    }

    public static final boolean a(y yVar) {
        StripeIntent stripeIntent;
        AbstractC3159y.i(yVar, "<this>");
        InterfaceC3802a o02 = yVar.o0();
        Y2.d dVar = (Y2.d) yVar.t().getValue();
        if (dVar != null) {
            stripeIntent = dVar.V();
        } else {
            stripeIntent = null;
        }
        return o02.c(stripeIntent, yVar.k0().e());
    }

    private static final boolean b(y yVar, Function0 function0) {
        StripeIntent stripeIntent;
        InterfaceC3802a o02 = yVar.o0();
        Y2.d dVar = (Y2.d) yVar.t().getValue();
        if (dVar != null) {
            stripeIntent = dVar.V();
        } else {
            stripeIntent = null;
        }
        return o02.a(stripeIntent, (AbstractC3991f) yVar.y().getValue(), yVar.k0().e(), function0);
    }

    public static final boolean c(y yVar) {
        AbstractC3159y.i(yVar, "<this>");
        return b(yVar, new a(yVar));
    }

    public static final boolean d(y yVar) {
        AbstractC3159y.i(yVar, "<this>");
        return b(yVar, new b(yVar));
    }
}
