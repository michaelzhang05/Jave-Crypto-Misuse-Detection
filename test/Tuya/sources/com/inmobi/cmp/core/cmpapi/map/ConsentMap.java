package com.inmobi.cmp.core.cmpapi.map;

import androidx.annotation.Keep;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import r5.AbstractC3689a;

@Keep
/* loaded from: classes3.dex */
public final class ConsentMap {
    private Map<String, Boolean> consents;
    private Map<String, Boolean> legitimateInterests;

    /* JADX WARN: Multi-variable type inference failed */
    public ConsentMap() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ConsentMap copy$default(ConsentMap consentMap, Map map, Map map2, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            map = consentMap.consents;
        }
        if ((i8 & 2) != 0) {
            map2 = consentMap.legitimateInterests;
        }
        return consentMap.copy(map, map2);
    }

    public final Map<String, Boolean> component1() {
        return this.consents;
    }

    public final Map<String, Boolean> component2() {
        return this.legitimateInterests;
    }

    public final ConsentMap copy(Map<String, Boolean> consents, Map<String, Boolean> legitimateInterests) {
        AbstractC3159y.i(consents, "consents");
        AbstractC3159y.i(legitimateInterests, "legitimateInterests");
        return new ConsentMap(consents, legitimateInterests);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConsentMap)) {
            return false;
        }
        ConsentMap consentMap = (ConsentMap) obj;
        return AbstractC3159y.d(this.consents, consentMap.consents) && AbstractC3159y.d(this.legitimateInterests, consentMap.legitimateInterests);
    }

    public final Map<String, Boolean> getConsents() {
        return this.consents;
    }

    public final Map<String, Boolean> getLegitimateInterests() {
        return this.legitimateInterests;
    }

    public int hashCode() {
        return this.legitimateInterests.hashCode() + (this.consents.hashCode() * 31);
    }

    public final void setConsents(Map<String, Boolean> map) {
        AbstractC3159y.i(map, "<set-?>");
        this.consents = map;
    }

    public final void setLegitimateInterests(Map<String, Boolean> map) {
        AbstractC3159y.i(map, "<set-?>");
        this.legitimateInterests = map;
    }

    public String toString() {
        StringBuilder a8 = AbstractC3689a.a("ConsentMap(consents=");
        a8.append(this.consents);
        a8.append(", legitimateInterests=");
        a8.append(this.legitimateInterests);
        a8.append(')');
        return a8.toString();
    }

    public ConsentMap(Map<String, Boolean> consents, Map<String, Boolean> legitimateInterests) {
        AbstractC3159y.i(consents, "consents");
        AbstractC3159y.i(legitimateInterests, "legitimateInterests");
        this.consents = consents;
        this.legitimateInterests = legitimateInterests;
    }

    public /* synthetic */ ConsentMap(Map map, Map map2, int i8, AbstractC3151p abstractC3151p) {
        this((i8 & 1) != 0 ? new LinkedHashMap() : map, (i8 & 2) != 0 ? new LinkedHashMap() : map2);
    }
}
