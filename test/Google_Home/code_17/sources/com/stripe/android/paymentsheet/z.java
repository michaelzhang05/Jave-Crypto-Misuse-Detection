package com.stripe.android.paymentsheet;

import C3.c;
import b3.C1970d;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.paymentsheet.u;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import x3.InterfaceC4187a;

/* loaded from: classes4.dex */
public abstract class z {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ y f27851a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(y yVar) {
            super(0);
            this.f27851a = yVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(this.f27851a.f().w() != u.n.f27549d);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ y f27852a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(y yVar) {
            super(0);
            this.f27852a = yVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(this.f27852a.f().w() == u.n.f27549d && !(this.f27852a.r().f().getValue() instanceof c.d));
        }
    }

    public static final boolean a(y yVar) {
        StripeIntent stripeIntent;
        AbstractC3255y.i(yVar, "<this>");
        InterfaceC4187a o02 = yVar.o0();
        C1970d c1970d = (C1970d) yVar.t().getValue();
        if (c1970d != null) {
            stripeIntent = c1970d.W();
        } else {
            stripeIntent = null;
        }
        return o02.c(stripeIntent, yVar.k0().g());
    }

    private static final boolean b(y yVar, Function0 function0) {
        StripeIntent stripeIntent;
        InterfaceC4187a o02 = yVar.o0();
        C1970d c1970d = (C1970d) yVar.t().getValue();
        if (c1970d != null) {
            stripeIntent = c1970d.W();
        } else {
            stripeIntent = null;
        }
        return o02.b(stripeIntent, (B3.f) yVar.y().getValue(), yVar.k0().g(), function0);
    }

    public static final boolean c(y yVar) {
        AbstractC3255y.i(yVar, "<this>");
        return b(yVar, new a(yVar));
    }

    public static final boolean d(y yVar) {
        AbstractC3255y.i(yVar, "<this>");
        return b(yVar, new b(yVar));
    }
}
