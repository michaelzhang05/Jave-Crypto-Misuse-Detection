package rx.exceptions;

import java.util.HashSet;
import java.util.List;
import rx.f;
import rx.i;

/* compiled from: Exceptions.java */
/* loaded from: classes2.dex */
public final class a {
    public static void a(Throwable th, Throwable th2) {
        HashSet hashSet = new HashSet();
        int i2 = 0;
        while (th.getCause() != null) {
            int i3 = i2 + 1;
            if (i2 >= 25) {
                return;
            }
            th = th.getCause();
            if (!hashSet.contains(th.getCause())) {
                hashSet.add(th.getCause());
                i2 = i3;
            }
        }
        try {
            th.initCause(th2);
        } catch (Throwable unused) {
        }
    }

    public static Throwable b(Throwable th) {
        int i2 = 0;
        while (th.getCause() != null) {
            int i3 = i2 + 1;
            if (i2 >= 25) {
                return new RuntimeException("Stack too deep to get final cause");
            }
            th = th.getCause();
            i2 = i3;
        }
        return th;
    }

    public static RuntimeException c(Throwable th) {
        if (!(th instanceof RuntimeException)) {
            if (th instanceof Error) {
                throw ((Error) th);
            }
            throw new RuntimeException(th);
        }
        throw ((RuntimeException) th);
    }

    public static void d(List<? extends Throwable> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        if (list.size() == 1) {
            Throwable th = list.get(0);
            if (!(th instanceof RuntimeException)) {
                if (th instanceof Error) {
                    throw ((Error) th);
                }
                throw new RuntimeException(th);
            }
            throw ((RuntimeException) th);
        }
        throw new CompositeException(list);
    }

    public static void e(Throwable th) {
        if (!(th instanceof OnErrorNotImplementedException)) {
            if (!(th instanceof OnErrorFailedException)) {
                if (!(th instanceof OnCompletedFailedException)) {
                    if (!(th instanceof VirtualMachineError)) {
                        if (!(th instanceof ThreadDeath)) {
                            if (th instanceof LinkageError) {
                                throw ((LinkageError) th);
                            }
                            return;
                        }
                        throw ((ThreadDeath) th);
                    }
                    throw ((VirtualMachineError) th);
                }
                throw ((OnCompletedFailedException) th);
            }
            throw ((OnErrorFailedException) th);
        }
        throw ((OnErrorNotImplementedException) th);
    }

    public static void f(Throwable th, f<?> fVar) {
        e(th);
        fVar.onError(th);
    }

    public static void g(Throwable th, f<?> fVar, Object obj) {
        e(th);
        fVar.onError(OnErrorThrowable.a(th, obj));
    }

    public static void h(Throwable th, i<?> iVar) {
        e(th);
        iVar.onError(th);
    }

    public static void i(Throwable th, i<?> iVar, Object obj) {
        e(th);
        iVar.onError(OnErrorThrowable.a(th, obj));
    }
}
