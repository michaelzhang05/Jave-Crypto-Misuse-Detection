package com.inmobi.cmp.core.cmpapi.map;

import androidx.annotation.Keep;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import r5.AbstractC3689a;

@Keep
/* loaded from: classes3.dex */
public final class OutOfBandMap {
    private Map<String, Boolean> allowedVendors;
    private Map<String, Boolean> disclosedVendors;

    /* JADX WARN: Multi-variable type inference failed */
    public OutOfBandMap() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OutOfBandMap copy$default(OutOfBandMap outOfBandMap, Map map, Map map2, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            map = outOfBandMap.allowedVendors;
        }
        if ((i8 & 2) != 0) {
            map2 = outOfBandMap.disclosedVendors;
        }
        return outOfBandMap.copy(map, map2);
    }

    public final Map<String, Boolean> component1() {
        return this.allowedVendors;
    }

    public final Map<String, Boolean> component2() {
        return this.disclosedVendors;
    }

    public final OutOfBandMap copy(Map<String, Boolean> allowedVendors, Map<String, Boolean> disclosedVendors) {
        AbstractC3159y.i(allowedVendors, "allowedVendors");
        AbstractC3159y.i(disclosedVendors, "disclosedVendors");
        return new OutOfBandMap(allowedVendors, disclosedVendors);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OutOfBandMap)) {
            return false;
        }
        OutOfBandMap outOfBandMap = (OutOfBandMap) obj;
        return AbstractC3159y.d(this.allowedVendors, outOfBandMap.allowedVendors) && AbstractC3159y.d(this.disclosedVendors, outOfBandMap.disclosedVendors);
    }

    public final Map<String, Boolean> getAllowedVendors() {
        return this.allowedVendors;
    }

    public final Map<String, Boolean> getDisclosedVendors() {
        return this.disclosedVendors;
    }

    public int hashCode() {
        return this.disclosedVendors.hashCode() + (this.allowedVendors.hashCode() * 31);
    }

    public final void setAllowedVendors(Map<String, Boolean> map) {
        AbstractC3159y.i(map, "<set-?>");
        this.allowedVendors = map;
    }

    public final void setDisclosedVendors(Map<String, Boolean> map) {
        AbstractC3159y.i(map, "<set-?>");
        this.disclosedVendors = map;
    }

    public String toString() {
        StringBuilder a8 = AbstractC3689a.a("OutOfBandMap(allowedVendors=");
        a8.append(this.allowedVendors);
        a8.append(", disclosedVendors=");
        a8.append(this.disclosedVendors);
        a8.append(')');
        return a8.toString();
    }

    public OutOfBandMap(Map<String, Boolean> allowedVendors, Map<String, Boolean> disclosedVendors) {
        AbstractC3159y.i(allowedVendors, "allowedVendors");
        AbstractC3159y.i(disclosedVendors, "disclosedVendors");
        this.allowedVendors = allowedVendors;
        this.disclosedVendors = disclosedVendors;
    }

    public /* synthetic */ OutOfBandMap(Map map, Map map2, int i8, AbstractC3151p abstractC3151p) {
        this((i8 & 1) != 0 ? new LinkedHashMap() : map, (i8 & 2) != 0 ? new LinkedHashMap() : map2);
    }
}
