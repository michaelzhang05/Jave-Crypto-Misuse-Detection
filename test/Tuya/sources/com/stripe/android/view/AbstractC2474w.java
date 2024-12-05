package com.stripe.android.view;

import M5.AbstractC1246t;
import b3.EnumC1870e;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: com.stripe.android.view.w, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC2474w {
    public static final EnumC1870e a(EnumC1870e enumC1870e, List possibleBrands, List merchantPreferredBrands) {
        AbstractC3159y.i(possibleBrands, "possibleBrands");
        AbstractC3159y.i(merchantPreferredBrands, "merchantPreferredBrands");
        Object obj = null;
        if (enumC1870e != EnumC1870e.f14446w && !AbstractC1246t.d0(possibleBrands, enumC1870e)) {
            enumC1870e = null;
        }
        Iterator it = merchantPreferredBrands.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (possibleBrands.contains((EnumC1870e) next)) {
                obj = next;
                break;
            }
        }
        EnumC1870e enumC1870e2 = (EnumC1870e) obj;
        if (enumC1870e == null) {
            if (enumC1870e2 == null) {
                return EnumC1870e.f14446w;
            }
            return enumC1870e2;
        }
        return enumC1870e;
    }
}
