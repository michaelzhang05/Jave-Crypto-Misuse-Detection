package com.stripe.android.view;

import P5.AbstractC1378t;
import e3.EnumC2791e;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: com.stripe.android.view.w, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC2668w {
    public static final EnumC2791e a(EnumC2791e enumC2791e, List possibleBrands, List merchantPreferredBrands) {
        AbstractC3255y.i(possibleBrands, "possibleBrands");
        AbstractC3255y.i(merchantPreferredBrands, "merchantPreferredBrands");
        Object obj = null;
        if (enumC2791e != EnumC2791e.f31452w && !AbstractC1378t.d0(possibleBrands, enumC2791e)) {
            enumC2791e = null;
        }
        Iterator it = merchantPreferredBrands.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (possibleBrands.contains((EnumC2791e) next)) {
                obj = next;
                break;
            }
        }
        EnumC2791e enumC2791e2 = (EnumC2791e) obj;
        if (enumC2791e == null) {
            if (enumC2791e2 == null) {
                return EnumC2791e.f31452w;
            }
            return enumC2791e2;
        }
        return enumC2791e;
    }
}
