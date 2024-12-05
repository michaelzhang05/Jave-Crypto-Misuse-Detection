package com.inmobi.cmp.core.model;

import androidx.annotation.Keep;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import r5.AbstractC3689a;

@Keep
/* loaded from: classes3.dex */
public final class ACData {
    private final String acString;

    /* JADX WARN: Multi-variable type inference failed */
    public ACData() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ ACData copy$default(ACData aCData, String str, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = aCData.acString;
        }
        return aCData.copy(str);
    }

    public final String component1() {
        return this.acString;
    }

    public final ACData copy(String str) {
        return new ACData(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ACData) && AbstractC3159y.d(this.acString, ((ACData) obj).acString);
    }

    public final String getAcString() {
        return this.acString;
    }

    public int hashCode() {
        String str = this.acString;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        StringBuilder a8 = AbstractC3689a.a("ACData(acString=");
        a8.append((Object) this.acString);
        a8.append(')');
        return a8.toString();
    }

    public ACData(String str) {
        this.acString = str;
    }

    public /* synthetic */ ACData(String str, int i8, AbstractC3151p abstractC3151p) {
        this((i8 & 1) != 0 ? null : str);
    }
}
