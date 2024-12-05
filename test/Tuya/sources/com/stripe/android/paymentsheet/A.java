package com.stripe.android.paymentsheet;

import com.stripe.android.paymentsheet.u;

/* loaded from: classes4.dex */
public abstract class A {
    public static final /* synthetic */ boolean a(u.l lVar) {
        return b(lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b(u.l lVar) {
        if (lVar instanceof u.l.b) {
            return true;
        }
        if (lVar instanceof u.l.c) {
            return false;
        }
        if (lVar instanceof u.l.a) {
            return ((u.l.a) lVar).c().b() instanceof u.m.d.a;
        }
        throw new L5.p();
    }
}
