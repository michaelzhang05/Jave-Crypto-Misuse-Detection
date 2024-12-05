package androidx.compose.runtime.external.kotlinx.collections.immutable.internal;

import X5.n;

/* loaded from: classes.dex */
public final class ForEachOneBitKt {
    public static final void forEachOneBit(int i8, n nVar) {
        int i9 = 0;
        while (i8 != 0) {
            int lowestOneBit = Integer.lowestOneBit(i8);
            nVar.invoke(Integer.valueOf(lowestOneBit), Integer.valueOf(i9));
            i9++;
            i8 ^= lowestOneBit;
        }
    }
}
