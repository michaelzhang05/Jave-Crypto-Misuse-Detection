package com.inmobi.cmp.model;

import androidx.annotation.Keep;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3159y;
import r5.AbstractC3689a;
import y5.t;

@Keep
/* loaded from: classes3.dex */
public final class NonIABData {
    private boolean gdprApplies;
    private boolean hasGlobalConsent;
    private boolean hasGlobalScope;
    private String metadata;
    private Map<Integer, Boolean> nonIabVendorConsents;

    public NonIABData(boolean z8, boolean z9, boolean z10, String metadata, Map<Integer, Boolean> nonIabVendorConsents) {
        AbstractC3159y.i(metadata, "metadata");
        AbstractC3159y.i(nonIabVendorConsents, "nonIabVendorConsents");
        this.gdprApplies = z8;
        this.hasGlobalConsent = z9;
        this.hasGlobalScope = z10;
        this.metadata = metadata;
        this.nonIabVendorConsents = nonIabVendorConsents;
    }

    public static /* synthetic */ NonIABData copy$default(NonIABData nonIABData, boolean z8, boolean z9, boolean z10, String str, Map map, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            z8 = nonIABData.gdprApplies;
        }
        if ((i8 & 2) != 0) {
            z9 = nonIABData.hasGlobalConsent;
        }
        boolean z11 = z9;
        if ((i8 & 4) != 0) {
            z10 = nonIABData.hasGlobalScope;
        }
        boolean z12 = z10;
        if ((i8 & 8) != 0) {
            str = nonIABData.metadata;
        }
        String str2 = str;
        if ((i8 & 16) != 0) {
            map = nonIABData.nonIabVendorConsents;
        }
        return nonIABData.copy(z8, z11, z12, str2, map);
    }

    public final boolean component1() {
        return this.gdprApplies;
    }

    public final boolean component2() {
        return this.hasGlobalConsent;
    }

    public final boolean component3() {
        return this.hasGlobalScope;
    }

    public final String component4() {
        return this.metadata;
    }

    public final Map<Integer, Boolean> component5() {
        return this.nonIabVendorConsents;
    }

    public final NonIABData copy(boolean z8, boolean z9, boolean z10, String metadata, Map<Integer, Boolean> nonIabVendorConsents) {
        AbstractC3159y.i(metadata, "metadata");
        AbstractC3159y.i(nonIabVendorConsents, "nonIabVendorConsents");
        return new NonIABData(z8, z9, z10, metadata, nonIabVendorConsents);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NonIABData)) {
            return false;
        }
        NonIABData nonIABData = (NonIABData) obj;
        return this.gdprApplies == nonIABData.gdprApplies && this.hasGlobalConsent == nonIABData.hasGlobalConsent && this.hasGlobalScope == nonIABData.hasGlobalScope && AbstractC3159y.d(this.metadata, nonIABData.metadata) && AbstractC3159y.d(this.nonIabVendorConsents, nonIABData.nonIabVendorConsents);
    }

    public final boolean getGdprApplies() {
        return this.gdprApplies;
    }

    public final boolean getHasGlobalConsent() {
        return this.hasGlobalConsent;
    }

    public final boolean getHasGlobalScope() {
        return this.hasGlobalScope;
    }

    public final String getMetadata() {
        return this.metadata;
    }

    public final Map<Integer, Boolean> getNonIabVendorConsents() {
        return this.nonIabVendorConsents;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r3v0, types: [boolean] */
    public int hashCode() {
        boolean z8 = this.gdprApplies;
        ?? r02 = z8;
        if (z8) {
            r02 = 1;
        }
        int i8 = r02 * 31;
        ?? r32 = this.hasGlobalConsent;
        int i9 = r32;
        if (r32 != 0) {
            i9 = 1;
        }
        int i10 = (i8 + i9) * 31;
        boolean z9 = this.hasGlobalScope;
        return this.nonIabVendorConsents.hashCode() + t.a(this.metadata, (i10 + (z9 ? 1 : z9 ? 1 : 0)) * 31, 31);
    }

    public final void setGdprApplies(boolean z8) {
        this.gdprApplies = z8;
    }

    public final void setHasGlobalConsent(boolean z8) {
        this.hasGlobalConsent = z8;
    }

    public final void setHasGlobalScope(boolean z8) {
        this.hasGlobalScope = z8;
    }

    public final void setMetadata(String str) {
        AbstractC3159y.i(str, "<set-?>");
        this.metadata = str;
    }

    public final void setNonIabVendorConsents(Map<Integer, Boolean> map) {
        AbstractC3159y.i(map, "<set-?>");
        this.nonIabVendorConsents = map;
    }

    public String toString() {
        StringBuilder a8 = AbstractC3689a.a("NonIABData(gdprApplies=");
        a8.append(this.gdprApplies);
        a8.append(", hasGlobalConsent=");
        a8.append(this.hasGlobalConsent);
        a8.append(", hasGlobalScope=");
        a8.append(this.hasGlobalScope);
        a8.append(", metadata=");
        a8.append(this.metadata);
        a8.append(", nonIabVendorConsents=");
        a8.append(this.nonIabVendorConsents);
        a8.append(')');
        return a8.toString();
    }
}
