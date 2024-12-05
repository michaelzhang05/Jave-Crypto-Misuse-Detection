package androidx.compose.runtime.external.kotlinx.collections.immutable.internal;

import a6.InterfaceC1668n;

/* loaded from: classes.dex */
public final class ForEachOneBitKt {
    public static final void forEachOneBit(int i8, InterfaceC1668n interfaceC1668n) {
        int i9 = 0;
        while (i8 != 0) {
            int lowestOneBit = Integer.lowestOneBit(i8);
            interfaceC1668n.invoke(Integer.valueOf(lowestOneBit), Integer.valueOf(i9));
            i9++;
            i8 ^= lowestOneBit;
        }
    }
}
