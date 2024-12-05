package M5;

import java.util.List;
import kotlin.jvm.internal.AbstractC3159y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract class B extends A {
    public static List W(List list) {
        AbstractC3159y.i(list, "<this>");
        return new Y(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int X(List list, int i8) {
        if (new d6.i(0, AbstractC1246t.o(list)).p(i8)) {
            return AbstractC1246t.o(list) - i8;
        }
        throw new IndexOutOfBoundsException("Element index " + i8 + " must be in range [" + new d6.i(0, AbstractC1246t.o(list)) + "].");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int Y(List list, int i8) {
        return AbstractC1246t.o(list) - i8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int Z(List list, int i8) {
        if (new d6.i(0, list.size()).p(i8)) {
            return list.size() - i8;
        }
        throw new IndexOutOfBoundsException("Position index " + i8 + " must be in range [" + new d6.i(0, list.size()) + "].");
    }
}
