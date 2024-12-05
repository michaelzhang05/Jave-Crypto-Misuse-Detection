package kotlinx.coroutines.internal;

import java.util.ArrayDeque;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.Result;
import kotlin.coroutines.j.internal.CoroutineStackFrame;

/* compiled from: StackTraceRecovery.kt */
/* loaded from: classes2.dex */
public final class u {
    private static final String a;

    /* renamed from: b */
    private static final String f22241b;

    static {
        Object a2;
        Object a3;
        try {
            Result.a aVar = Result.f21603f;
            a2 = Result.a(Class.forName("kotlin.y.j.a.a").getCanonicalName());
        } catch (Throwable th) {
            Result.a aVar2 = Result.f21603f;
            a2 = Result.a(kotlin.o.a(th));
        }
        if (Result.b(a2) != null) {
            a2 = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        a = (String) a2;
        try {
            Result.a aVar3 = Result.f21603f;
            a3 = Result.a(Class.forName("kotlinx.coroutines.internal.u").getCanonicalName());
        } catch (Throwable th2) {
            Result.a aVar4 = Result.f21603f;
            a3 = Result.a(kotlin.o.a(th2));
        }
        if (Result.b(a3) != null) {
            a3 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        f22241b = (String) a3;
    }

    public static final /* synthetic */ Throwable a(Throwable th, CoroutineStackFrame coroutineStackFrame) {
        return j(th, coroutineStackFrame);
    }

    public static final StackTraceElement b(String str) {
        return new StackTraceElement(kotlin.jvm.internal.l.m("\b\b\b(", str), "\b", "\b", -1);
    }

    private static final <E extends Throwable> Pair<E, StackTraceElement[]> c(E e2) {
        boolean z;
        Throwable cause = e2.getCause();
        if (cause != null && kotlin.jvm.internal.l.a(cause.getClass(), e2.getClass())) {
            StackTraceElement[] stackTrace = e2.getStackTrace();
            int length = stackTrace.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    z = false;
                    break;
                }
                if (h(stackTrace[i2])) {
                    z = true;
                    break;
                }
                i2++;
            }
            if (z) {
                return kotlin.s.a(cause, stackTrace);
            }
            return kotlin.s.a(e2, new StackTraceElement[0]);
        }
        return kotlin.s.a(e2, new StackTraceElement[0]);
    }

    private static final <E extends Throwable> E d(E e2, E e3, ArrayDeque<StackTraceElement> arrayDeque) {
        arrayDeque.addFirst(b("Coroutine boundary"));
        StackTraceElement[] stackTrace = e2.getStackTrace();
        int g2 = g(stackTrace, a);
        int i2 = 0;
        if (g2 == -1) {
            Object[] array = arrayDeque.toArray(new StackTraceElement[0]);
            if (array != null) {
                e3.setStackTrace((StackTraceElement[]) array);
                return e3;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[arrayDeque.size() + g2];
        if (g2 > 0) {
            int i3 = 0;
            while (true) {
                int i4 = i3 + 1;
                stackTraceElementArr[i3] = stackTrace[i3];
                if (i4 >= g2) {
                    break;
                }
                i3 = i4;
            }
        }
        Iterator<StackTraceElement> it = arrayDeque.iterator();
        while (it.hasNext()) {
            int i5 = i2 + 1;
            stackTraceElementArr[i2 + g2] = it.next();
            i2 = i5;
        }
        e3.setStackTrace(stackTraceElementArr);
        return e3;
    }

    private static final ArrayDeque<StackTraceElement> e(CoroutineStackFrame coroutineStackFrame) {
        ArrayDeque<StackTraceElement> arrayDeque = new ArrayDeque<>();
        StackTraceElement stackTraceElement = coroutineStackFrame.getStackTraceElement();
        if (stackTraceElement != null) {
            arrayDeque.add(stackTraceElement);
        }
        while (true) {
            coroutineStackFrame = coroutineStackFrame == null ? null : coroutineStackFrame.getCallerFrame();
            if (coroutineStackFrame == null) {
                return arrayDeque;
            }
            StackTraceElement stackTraceElement2 = coroutineStackFrame.getStackTraceElement();
            if (stackTraceElement2 != null) {
                arrayDeque.add(stackTraceElement2);
            }
        }
    }

    private static final boolean f(StackTraceElement stackTraceElement, StackTraceElement stackTraceElement2) {
        return stackTraceElement.getLineNumber() == stackTraceElement2.getLineNumber() && kotlin.jvm.internal.l.a(stackTraceElement.getMethodName(), stackTraceElement2.getMethodName()) && kotlin.jvm.internal.l.a(stackTraceElement.getFileName(), stackTraceElement2.getFileName()) && kotlin.jvm.internal.l.a(stackTraceElement.getClassName(), stackTraceElement2.getClassName());
    }

    private static final int g(StackTraceElement[] stackTraceElementArr, String str) {
        int length = stackTraceElementArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (kotlin.jvm.internal.l.a(str, stackTraceElementArr[i2].getClassName())) {
                return i2;
            }
        }
        return -1;
    }

    public static final boolean h(StackTraceElement stackTraceElement) {
        boolean A;
        A = kotlin.text.u.A(stackTraceElement.getClassName(), "\b\b\b", false, 2, null);
        return A;
    }

    private static final void i(StackTraceElement[] stackTraceElementArr, ArrayDeque<StackTraceElement> arrayDeque) {
        int length = stackTraceElementArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                i2 = -1;
                break;
            } else if (h(stackTraceElementArr[i2])) {
                break;
            } else {
                i2++;
            }
        }
        int i3 = i2 + 1;
        int length2 = stackTraceElementArr.length - 1;
        if (i3 > length2) {
            return;
        }
        while (true) {
            int i4 = length2 - 1;
            if (f(stackTraceElementArr[length2], arrayDeque.getLast())) {
                arrayDeque.removeLast();
            }
            arrayDeque.addFirst(stackTraceElementArr[length2]);
            if (length2 == i3) {
                return;
            } else {
                length2 = i4;
            }
        }
    }

    public static final <E extends Throwable> E j(E e2, CoroutineStackFrame coroutineStackFrame) {
        Pair c2 = c(e2);
        Throwable th = (Throwable) c2.a();
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) c2.b();
        Throwable e3 = g.e(th);
        if (e3 == null || !kotlin.jvm.internal.l.a(e3.getMessage(), th.getMessage())) {
            return e2;
        }
        ArrayDeque<StackTraceElement> e4 = e(coroutineStackFrame);
        if (e4.isEmpty()) {
            return e2;
        }
        if (th != e2) {
            i(stackTraceElementArr, e4);
        }
        return (E) d(th, e3, e4);
    }

    public static final <E extends Throwable> E k(E e2) {
        E e3 = (E) e2.getCause();
        if (e3 != null && kotlin.jvm.internal.l.a(e3.getClass(), e2.getClass())) {
            StackTraceElement[] stackTrace = e2.getStackTrace();
            int length = stackTrace.length;
            boolean z = false;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                if (h(stackTrace[i2])) {
                    z = true;
                    break;
                }
                i2++;
            }
            if (z) {
                return e3;
            }
        }
        return e2;
    }
}
