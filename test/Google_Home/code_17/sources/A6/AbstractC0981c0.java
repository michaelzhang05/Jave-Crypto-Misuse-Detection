package A6;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: A6.c0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC0981c0 {

    /* renamed from: a, reason: collision with root package name */
    private static final y6.f[] f545a = new y6.f[0];

    public static final Set a(y6.f fVar) {
        AbstractC3255y.i(fVar, "<this>");
        if (fVar instanceof InterfaceC0993l) {
            return ((InterfaceC0993l) fVar).b();
        }
        HashSet hashSet = new HashSet(fVar.e());
        int e8 = fVar.e();
        for (int i8 = 0; i8 < e8; i8++) {
            hashSet.add(fVar.f(i8));
        }
        return hashSet;
    }

    public static final y6.f[] b(List list) {
        y6.f[] fVarArr;
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            list = null;
        }
        if (list == null || (fVarArr = (y6.f[]) list.toArray(new y6.f[0])) == null) {
            return f545a;
        }
        return fVarArr;
    }
}
