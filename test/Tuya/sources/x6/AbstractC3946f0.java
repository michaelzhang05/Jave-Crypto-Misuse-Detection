package x6;

import java.util.Arrays;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: x6.f0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3946f0 {
    public static final int a(v6.f fVar, v6.f[] typeParams) {
        int i8;
        AbstractC3159y.i(fVar, "<this>");
        AbstractC3159y.i(typeParams, "typeParams");
        int hashCode = (fVar.a().hashCode() * 31) + Arrays.hashCode(typeParams);
        Iterable a8 = v6.h.a(fVar);
        Iterator it = a8.iterator();
        int i9 = 1;
        int i10 = 1;
        while (true) {
            int i11 = 0;
            if (!it.hasNext()) {
                break;
            }
            int i12 = i10 * 31;
            String a9 = ((v6.f) it.next()).a();
            if (a9 != null) {
                i11 = a9.hashCode();
            }
            i10 = i12 + i11;
        }
        Iterator it2 = a8.iterator();
        while (it2.hasNext()) {
            int i13 = i9 * 31;
            v6.j kind = ((v6.f) it2.next()).getKind();
            if (kind != null) {
                i8 = kind.hashCode();
            } else {
                i8 = 0;
            }
            i9 = i13 + i8;
        }
        return (((hashCode * 31) + i10) * 31) + i9;
    }
}
