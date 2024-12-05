package com.google.android.gms.internal.measurement;

import java.util.Comparator;

/* loaded from: classes3.dex */
final class O3 implements Comparator {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        X3 x32 = (X3) obj;
        X3 x33 = (X3) obj2;
        N3 n32 = new N3(x32);
        N3 n33 = new N3(x33);
        while (n32.hasNext() && n33.hasNext()) {
            int compareTo = Integer.valueOf(n32.a() & 255).compareTo(Integer.valueOf(n33.a() & 255));
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return Integer.valueOf(x32.g()).compareTo(Integer.valueOf(x33.g()));
    }
}
