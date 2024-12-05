package x6;

import M5.AbstractC1239l;
import java.lang.annotation.Annotation;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: x6.y, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3964y {
    public static final t6.b a(String serialName, Enum[] values, String[] names, Annotation[][] entryAnnotations, Annotation[] annotationArr) {
        AbstractC3159y.i(serialName, "serialName");
        AbstractC3159y.i(values, "values");
        AbstractC3159y.i(names, "names");
        AbstractC3159y.i(entryAnnotations, "entryAnnotations");
        C3962w c3962w = new C3962w(serialName, values.length);
        if (annotationArr != null) {
            for (Annotation annotation : annotationArr) {
                c3962w.r(annotation);
            }
        }
        int length = values.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            Enum r42 = values[i8];
            int i10 = i9 + 1;
            String str = (String) AbstractC1239l.k0(names, i9);
            if (str == null) {
                str = r42.name();
            }
            C3944e0.l(c3962w, str, false, 2, null);
            Annotation[] annotationArr2 = (Annotation[]) AbstractC1239l.k0(entryAnnotations, i9);
            if (annotationArr2 != null) {
                for (Annotation annotation2 : annotationArr2) {
                    c3962w.q(annotation2);
                }
            }
            i8++;
            i9 = i10;
        }
        return new C3963x(serialName, values, c3962w);
    }

    public static final t6.b b(String serialName, Enum[] values) {
        AbstractC3159y.i(serialName, "serialName");
        AbstractC3159y.i(values, "values");
        return new C3963x(serialName, values);
    }
}
