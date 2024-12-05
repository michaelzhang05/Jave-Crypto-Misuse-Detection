package a5;

import java.util.Collection;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class n extends m {
    public static final Collection c(Object[] objArr) {
        f5.h.e(objArr, "<this>");
        return new d(objArr, false);
    }

    public static List d() {
        return x.f78a;
    }

    public static final int e(List list) {
        f5.h.e(list, "<this>");
        return list.size() - 1;
    }

    public static List f(Object... objArr) {
        f5.h.e(objArr, "elements");
        return objArr.length > 0 ? i.b(objArr) : l.d();
    }

    public static void g() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
