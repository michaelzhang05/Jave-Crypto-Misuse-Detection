package B3;

import B3.f;
import B3.i;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public abstract class j {
    public static final i a(f fVar) {
        AbstractC3255y.i(fVar, "<this>");
        if (fVar instanceof f.c) {
            return i.a.f876a;
        }
        if (fVar instanceof f.d) {
            return i.b.f877a;
        }
        if (fVar instanceof f.C0009f) {
            String str = ((f.C0009f) fVar).r().f25463a;
            if (str == null) {
                str = "";
            }
            return new i.d(str);
        }
        return null;
    }
}
