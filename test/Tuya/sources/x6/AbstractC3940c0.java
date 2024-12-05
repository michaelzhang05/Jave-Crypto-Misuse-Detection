package x6;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: x6.c0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3940c0 {

    /* renamed from: a, reason: collision with root package name */
    private static final v6.f[] f39550a = new v6.f[0];

    public static final Set a(v6.f fVar) {
        AbstractC3159y.i(fVar, "<this>");
        if (fVar instanceof InterfaceC3952l) {
            return ((InterfaceC3952l) fVar).b();
        }
        HashSet hashSet = new HashSet(fVar.e());
        int e8 = fVar.e();
        for (int i8 = 0; i8 < e8; i8++) {
            hashSet.add(fVar.f(i8));
        }
        return hashSet;
    }

    public static final v6.f[] b(List list) {
        v6.f[] fVarArr;
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            list = null;
        }
        if (list == null || (fVarArr = (v6.f[]) list.toArray(new v6.f[0])) == null) {
            return f39550a;
        }
        return fVarArr;
    }
}
