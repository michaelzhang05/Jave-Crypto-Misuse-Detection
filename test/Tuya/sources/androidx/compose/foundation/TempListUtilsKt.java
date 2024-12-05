package androidx.compose.foundation;

import M5.AbstractC1246t;
import X5.n;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes.dex */
public final class TempListUtilsKt {
    public static final <T> List<T> fastFilter(List<? extends T> list, Function1 predicate) {
        AbstractC3159y.i(list, "<this>");
        AbstractC3159y.i(predicate, "predicate");
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i8 = 0; i8 < size; i8++) {
            T t8 = list.get(i8);
            if (((Boolean) predicate.invoke(t8)).booleanValue()) {
                arrayList.add(t8);
            }
        }
        return arrayList;
    }

    public static final <T, R> R fastFold(List<? extends T> list, R r8, n operation) {
        AbstractC3159y.i(list, "<this>");
        AbstractC3159y.i(operation, "operation");
        int size = list.size();
        for (int i8 = 0; i8 < size; i8++) {
            r8 = (R) operation.invoke(r8, list.get(i8));
        }
        return r8;
    }

    public static final <T, R> List<R> fastMapIndexedNotNull(List<? extends T> list, n transform) {
        AbstractC3159y.i(list, "<this>");
        AbstractC3159y.i(transform, "transform");
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i8 = 0; i8 < size; i8++) {
            Object invoke = transform.invoke(Integer.valueOf(i8), list.get(i8));
            if (invoke != null) {
                arrayList.add(invoke);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, R extends Comparable<? super R>> R fastMaxOfOrNull(List<? extends T> list, Function1 selector) {
        AbstractC3159y.i(list, "<this>");
        AbstractC3159y.i(selector, "selector");
        if (list.isEmpty()) {
            return null;
        }
        R r8 = (R) selector.invoke(list.get(0));
        int o8 = AbstractC1246t.o(list);
        int i8 = 1;
        if (1 <= o8) {
            while (true) {
                Comparable comparable = (Comparable) selector.invoke(list.get(i8));
                if (comparable.compareTo(r8) > 0) {
                    r8 = comparable;
                }
                if (i8 == o8) {
                    break;
                }
                i8++;
            }
        }
        return r8;
    }
}
