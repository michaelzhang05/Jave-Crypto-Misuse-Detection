package kotlin.reflect.x.internal.l0.e.a0.b;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.l;
import kotlin.reflect.x.internal.l0.e.a0.a;

/* compiled from: JvmNameResolver.kt */
/* loaded from: classes2.dex */
public final class h {
    public static final List<a.e.c> a(List<a.e.c> list) {
        l.f(list, "<this>");
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(list.size());
        for (a.e.c cVar : list) {
            int H = cVar.H();
            for (int i2 = 0; i2 < H; i2++) {
                arrayList.add(cVar);
            }
        }
        arrayList.trimToSize();
        return arrayList;
    }
}
