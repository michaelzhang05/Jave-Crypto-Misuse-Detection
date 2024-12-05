package com.stripe.android.model;

import P5.AbstractC1378t;
import P5.a0;
import com.stripe.android.model.o;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public abstract class y {

    /* renamed from: a, reason: collision with root package name */
    private static final Set f25860a = a0.d(o.p.f25565C);

    public static final int a(StripeIntent stripeIntent) {
        AbstractC3255y.i(stripeIntent, "<this>");
        return com.stripe.android.b.f24521q.b(stripeIntent);
    }

    public static final boolean b(StripeIntent stripeIntent) {
        o.p pVar;
        AbstractC3255y.i(stripeIntent, "<this>");
        if (stripeIntent instanceof n) {
            Set set = f25860a;
            o r8 = stripeIntent.r();
            if (r8 != null) {
                pVar = r8.f25467e;
            } else {
                pVar = null;
            }
            if (AbstractC1378t.d0(set, pVar) && stripeIntent.t()) {
                return true;
            }
        }
        return false;
    }
}
