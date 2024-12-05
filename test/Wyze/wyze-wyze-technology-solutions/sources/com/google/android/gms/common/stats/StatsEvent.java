package com.google.android.gms.common.stats;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

@KeepForSdk
/* loaded from: classes2.dex */
public abstract class StatsEvent extends AbstractSafeParcelable implements ReflectedParcelable {

    @KeepForSdk
    /* loaded from: classes2.dex */
    public interface Types {
    }

    public abstract long D();

    public abstract String J();

    public String toString() {
        long z = z();
        int w = w();
        long D = D();
        String J = J();
        StringBuilder sb = new StringBuilder(String.valueOf(J).length() + 53);
        sb.append(z);
        sb.append("\t");
        sb.append(w);
        sb.append("\t");
        sb.append(D);
        sb.append(J);
        return sb.toString();
    }

    public abstract int w();

    public abstract long z();
}
