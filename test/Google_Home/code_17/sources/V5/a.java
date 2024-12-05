package V5;

import P5.AbstractC1371l;
import e6.AbstractC2806c;
import e6.C2805b;
import java.lang.reflect.Method;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes5.dex */
public abstract class a {

    /* renamed from: V5.a$a, reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    private static final class C0236a {

        /* renamed from: a, reason: collision with root package name */
        public static final C0236a f11264a = new C0236a();

        /* renamed from: b, reason: collision with root package name */
        public static final Method f11265b;

        /* renamed from: c, reason: collision with root package name */
        public static final Method f11266c;

        static {
            Method method;
            Method method2;
            Method[] methods = Throwable.class.getMethods();
            AbstractC3255y.f(methods);
            int length = methods.length;
            int i8 = 0;
            int i9 = 0;
            while (true) {
                method = null;
                if (i9 < length) {
                    method2 = methods[i9];
                    if (AbstractC3255y.d(method2.getName(), "addSuppressed")) {
                        Class<?>[] parameterTypes = method2.getParameterTypes();
                        AbstractC3255y.h(parameterTypes, "getParameterTypes(...)");
                        if (AbstractC3255y.d(AbstractC1371l.K0(parameterTypes), Throwable.class)) {
                            break;
                        }
                    }
                    i9++;
                } else {
                    method2 = null;
                    break;
                }
            }
            f11265b = method2;
            int length2 = methods.length;
            while (true) {
                if (i8 >= length2) {
                    break;
                }
                Method method3 = methods[i8];
                if (AbstractC3255y.d(method3.getName(), "getSuppressed")) {
                    method = method3;
                    break;
                }
                i8++;
            }
            f11266c = method;
        }

        private C0236a() {
        }
    }

    public void a(Throwable cause, Throwable exception) {
        AbstractC3255y.i(cause, "cause");
        AbstractC3255y.i(exception, "exception");
        Method method = C0236a.f11265b;
        if (method != null) {
            method.invoke(cause, exception);
        }
    }

    public AbstractC2806c b() {
        return new C2805b();
    }
}
