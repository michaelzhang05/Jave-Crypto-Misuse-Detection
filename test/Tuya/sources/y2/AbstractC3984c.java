package y2;

import M5.AbstractC1239l;
import M5.AbstractC1246t;
import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: y2.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3984c {
    public static final InterfaceC3983b a(int i8) {
        return new C3982a(i8, AbstractC1246t.m(), AbstractC1246t.m());
    }

    public static final InterfaceC3983b b(String str) {
        AbstractC3159y.i(str, "<this>");
        return new C3985d(str, AbstractC1246t.m());
    }

    public static final InterfaceC3983b c(InterfaceC3983b interfaceC3983b) {
        if (interfaceC3983b == null) {
            return b("");
        }
        return interfaceC3983b;
    }

    public static final InterfaceC3983b d(int i8, Object[] formatArgs, List transformations) {
        AbstractC3159y.i(formatArgs, "formatArgs");
        AbstractC3159y.i(transformations, "transformations");
        return new C3982a(i8, transformations, AbstractC1239l.V0(formatArgs));
    }

    public static final InterfaceC3983b e(String value, Object... formatArgs) {
        AbstractC3159y.i(value, "value");
        AbstractC3159y.i(formatArgs, "formatArgs");
        return new C3985d(value, AbstractC1239l.V0(formatArgs));
    }

    public static /* synthetic */ InterfaceC3983b f(int i8, Object[] objArr, List list, int i9, Object obj) {
        if ((i9 & 4) != 0) {
            list = AbstractC1246t.m();
        }
        return d(i8, objArr, list);
    }

    public static final Object[] g(Context context, List args) {
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(args, "args");
        List list = args;
        ArrayList arrayList = new ArrayList(AbstractC1246t.x(list, 10));
        for (Object obj : list) {
            if (obj instanceof InterfaceC3983b) {
                obj = ((InterfaceC3983b) obj).R(context);
            }
            arrayList.add(obj);
        }
        return arrayList.toArray(new Object[0]);
    }
}
