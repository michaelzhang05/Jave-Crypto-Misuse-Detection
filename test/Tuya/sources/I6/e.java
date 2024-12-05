package I6;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes5.dex */
public final class e extends RuntimeException {

    /* renamed from: b, reason: collision with root package name */
    private static final Method f4303b;

    /* renamed from: a, reason: collision with root package name */
    private IOException f4304a;

    static {
        Method method;
        try {
            method = Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class);
        } catch (Exception unused) {
            method = null;
        }
        f4303b = method;
    }

    public e(IOException iOException) {
        super(iOException);
        this.f4304a = iOException;
    }

    private void b(IOException iOException, IOException iOException2) {
        Method method = f4303b;
        if (method != null) {
            try {
                method.invoke(iOException, iOException2);
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
    }

    public void a(IOException iOException) {
        b(iOException, this.f4304a);
        this.f4304a = iOException;
    }

    public IOException c() {
        return this.f4304a;
    }
}
