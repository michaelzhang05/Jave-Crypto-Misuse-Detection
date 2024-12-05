package kotlin.reflect.jvm.internal.impl.utils;

import kotlin.jvm.internal.l;

/* compiled from: exceptionUtils.kt */
/* loaded from: classes2.dex */
public final class c {
    public static final boolean a(Throwable th) {
        l.f(th, "<this>");
        Class<?> cls = th.getClass();
        while (!l.a(cls.getCanonicalName(), "com.intellij.openapi.progress.ProcessCanceledException")) {
            cls = cls.getSuperclass();
            if (cls == null) {
                return false;
            }
        }
        return true;
    }

    public static final RuntimeException b(Throwable th) {
        l.f(th, "e");
        throw th;
    }
}
