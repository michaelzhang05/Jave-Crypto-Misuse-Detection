package a5;

import java.lang.reflect.Array;

/* loaded from: classes.dex */
abstract class g {
    public static final Object[] a(Object[] objArr, int i6) {
        f5.h.e(objArr, "reference");
        Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), i6);
        f5.h.c(newInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
        return (Object[]) newInstance;
    }
}
