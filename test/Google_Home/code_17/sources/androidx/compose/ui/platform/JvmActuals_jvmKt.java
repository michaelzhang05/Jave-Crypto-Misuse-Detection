package androidx.compose.ui.platform;

import java.util.Arrays;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3253w;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes.dex */
public final class JvmActuals_jvmKt {
    public static final Object nativeClass(Object obj) {
        return obj.getClass();
    }

    public static final String simpleIdentityToString(Object obj, String str) {
        if (str == null) {
            if (obj.getClass().isAnonymousClass()) {
                str = obj.getClass().getName();
            } else {
                str = obj.getClass().getSimpleName();
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append('@');
        kotlin.jvm.internal.Y y8 = kotlin.jvm.internal.Y.f34167a;
        String format = String.format("%07x", Arrays.copyOf(new Object[]{Integer.valueOf(System.identityHashCode(obj))}, 1));
        AbstractC3255y.h(format, "format(format, *args)");
        sb.append(format);
        return sb.toString();
    }

    /* renamed from: synchronized, reason: not valid java name */
    public static final <R> R m4475synchronized(Object obj, Function0 function0) {
        R r8;
        synchronized (obj) {
            try {
                r8 = (R) function0.invoke();
                AbstractC3253w.b(1);
            } catch (Throwable th) {
                AbstractC3253w.b(1);
                AbstractC3253w.a(1);
                throw th;
            }
        }
        AbstractC3253w.a(1);
        return r8;
    }
}
