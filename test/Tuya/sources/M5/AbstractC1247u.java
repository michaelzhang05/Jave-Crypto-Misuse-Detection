package M5;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.AbstractC3159y;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: M5.u, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC1247u {
    public static List a(List builder) {
        AbstractC3159y.i(builder, "builder");
        return ((N5.b) builder).q();
    }

    public static final Object[] b(Object[] objArr, boolean z8) {
        AbstractC3159y.i(objArr, "<this>");
        if (!z8 || !AbstractC3159y.d(objArr.getClass(), Object[].class)) {
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length, Object[].class);
            AbstractC3159y.h(copyOf, "copyOf(...)");
            return copyOf;
        }
        return objArr;
    }

    public static List c() {
        return new N5.b();
    }

    public static List d(int i8) {
        return new N5.b(i8);
    }

    public static List e(Object obj) {
        List singletonList = Collections.singletonList(obj);
        AbstractC3159y.h(singletonList, "singletonList(...)");
        return singletonList;
    }

    public static Object[] f(int i8, Object[] array) {
        AbstractC3159y.i(array, "array");
        if (i8 < array.length) {
            array[i8] = null;
        }
        return array;
    }
}
