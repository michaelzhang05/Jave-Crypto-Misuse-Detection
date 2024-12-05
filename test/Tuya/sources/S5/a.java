package S5;

import M5.AbstractC1239l;
import b6.AbstractC1885c;
import b6.C1884b;
import java.lang.reflect.Method;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes5.dex */
public abstract class a {

    /* renamed from: S5.a$a, reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    private static final class C0211a {

        /* renamed from: a, reason: collision with root package name */
        public static final C0211a f9621a = new C0211a();

        /* renamed from: b, reason: collision with root package name */
        public static final Method f9622b;

        /* renamed from: c, reason: collision with root package name */
        public static final Method f9623c;

        static {
            Method method;
            Method method2;
            Method[] methods = Throwable.class.getMethods();
            AbstractC3159y.f(methods);
            int length = methods.length;
            int i8 = 0;
            int i9 = 0;
            while (true) {
                method = null;
                if (i9 < length) {
                    method2 = methods[i9];
                    if (AbstractC3159y.d(method2.getName(), "addSuppressed")) {
                        Class<?>[] parameterTypes = method2.getParameterTypes();
                        AbstractC3159y.h(parameterTypes, "getParameterTypes(...)");
                        if (AbstractC3159y.d(AbstractC1239l.K0(parameterTypes), Throwable.class)) {
                            break;
                        }
                    }
                    i9++;
                } else {
                    method2 = null;
                    break;
                }
            }
            f9622b = method2;
            int length2 = methods.length;
            while (true) {
                if (i8 >= length2) {
                    break;
                }
                Method method3 = methods[i8];
                if (AbstractC3159y.d(method3.getName(), "getSuppressed")) {
                    method = method3;
                    break;
                }
                i8++;
            }
            f9623c = method;
        }

        private C0211a() {
        }
    }

    public void a(Throwable cause, Throwable exception) {
        AbstractC3159y.i(cause, "cause");
        AbstractC3159y.i(exception, "exception");
        Method method = C0211a.f9622b;
        if (method != null) {
            method.invoke(cause, exception);
        }
    }

    public AbstractC1885c b() {
        return new C1884b();
    }
}
