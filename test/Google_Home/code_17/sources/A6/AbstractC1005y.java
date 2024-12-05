package A6;

import P5.AbstractC1371l;
import java.lang.annotation.Annotation;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: A6.y, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC1005y {
    public static final w6.b a(String serialName, Enum[] values, String[] names, Annotation[][] entryAnnotations, Annotation[] annotationArr) {
        AbstractC3255y.i(serialName, "serialName");
        AbstractC3255y.i(values, "values");
        AbstractC3255y.i(names, "names");
        AbstractC3255y.i(entryAnnotations, "entryAnnotations");
        C1003w c1003w = new C1003w(serialName, values.length);
        if (annotationArr != null) {
            for (Annotation annotation : annotationArr) {
                c1003w.r(annotation);
            }
        }
        int length = values.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            Enum r42 = values[i8];
            int i10 = i9 + 1;
            String str = (String) AbstractC1371l.k0(names, i9);
            if (str == null) {
                str = r42.name();
            }
            C0985e0.l(c1003w, str, false, 2, null);
            Annotation[] annotationArr2 = (Annotation[]) AbstractC1371l.k0(entryAnnotations, i9);
            if (annotationArr2 != null) {
                for (Annotation annotation2 : annotationArr2) {
                    c1003w.q(annotation2);
                }
            }
            i8++;
            i9 = i10;
        }
        return new C1004x(serialName, values, c1003w);
    }

    public static final w6.b b(String serialName, Enum[] values) {
        AbstractC3255y.i(serialName, "serialName");
        AbstractC3255y.i(values, "values");
        return new C1004x(serialName, values);
    }
}
