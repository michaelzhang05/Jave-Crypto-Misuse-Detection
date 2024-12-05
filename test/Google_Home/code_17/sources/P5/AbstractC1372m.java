package P5;

import java.lang.reflect.Array;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: P5.m, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
abstract class AbstractC1372m {
    public static final Object[] a(Object[] reference, int i8) {
        AbstractC3255y.i(reference, "reference");
        Object newInstance = Array.newInstance(reference.getClass().getComponentType(), i8);
        AbstractC3255y.g(newInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
        return (Object[]) newInstance;
    }

    public static final void b(int i8, int i9) {
        if (i8 <= i9) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i8 + ") is greater than size (" + i9 + ").");
    }
}
