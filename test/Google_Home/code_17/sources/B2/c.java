package B2;

import P5.AbstractC1371l;
import P5.AbstractC1378t;
import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public abstract class c {
    public static final b a(int i8) {
        return new a(i8, AbstractC1378t.m(), AbstractC1378t.m());
    }

    public static final b b(String str) {
        AbstractC3255y.i(str, "<this>");
        return new d(str, AbstractC1378t.m());
    }

    public static final b c(b bVar) {
        if (bVar == null) {
            return b("");
        }
        return bVar;
    }

    public static final b d(int i8, Object[] formatArgs, List transformations) {
        AbstractC3255y.i(formatArgs, "formatArgs");
        AbstractC3255y.i(transformations, "transformations");
        return new a(i8, transformations, AbstractC1371l.V0(formatArgs));
    }

    public static final b e(String value, Object... formatArgs) {
        AbstractC3255y.i(value, "value");
        AbstractC3255y.i(formatArgs, "formatArgs");
        return new d(value, AbstractC1371l.V0(formatArgs));
    }

    public static /* synthetic */ b f(int i8, Object[] objArr, List list, int i9, Object obj) {
        if ((i9 & 4) != 0) {
            list = AbstractC1378t.m();
        }
        return d(i8, objArr, list);
    }

    public static final Object[] g(Context context, List args) {
        AbstractC3255y.i(context, "context");
        AbstractC3255y.i(args, "args");
        List list = args;
        ArrayList arrayList = new ArrayList(AbstractC1378t.x(list, 10));
        for (Object obj : list) {
            if (obj instanceof b) {
                obj = ((b) obj).R(context);
            }
            arrayList.add(obj);
        }
        return arrayList.toArray(new Object[0]);
    }
}
