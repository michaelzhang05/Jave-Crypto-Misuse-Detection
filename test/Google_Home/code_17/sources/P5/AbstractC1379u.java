package P5;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.AbstractC3255y;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: P5.u, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC1379u {
    public static List a(List builder) {
        AbstractC3255y.i(builder, "builder");
        return ((Q5.b) builder).n();
    }

    public static final Object[] b(Object[] objArr, boolean z8) {
        AbstractC3255y.i(objArr, "<this>");
        if (!z8 || !AbstractC3255y.d(objArr.getClass(), Object[].class)) {
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length, Object[].class);
            AbstractC3255y.h(copyOf, "copyOf(...)");
            return copyOf;
        }
        return objArr;
    }

    public static List c() {
        return new Q5.b();
    }

    public static List d(int i8) {
        return new Q5.b(i8);
    }

    public static List e(Object obj) {
        List singletonList = Collections.singletonList(obj);
        AbstractC3255y.h(singletonList, "singletonList(...)");
        return singletonList;
    }

    public static Object[] f(int i8, Object[] array) {
        AbstractC3255y.i(array, "array");
        if (i8 < array.length) {
            array[i8] = null;
        }
        return array;
    }
}
