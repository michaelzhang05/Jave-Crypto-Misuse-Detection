package a5;

import java.util.Collection;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class o extends n {
    public static int h(Iterable iterable, int i6) {
        f5.h.e(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i6;
    }
}
