package L6;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes5.dex */
public final class e extends RuntimeException {

    /* renamed from: b, reason: collision with root package name */
    private static final Method f6298b;

    /* renamed from: a, reason: collision with root package name */
    private IOException f6299a;

    static {
        Method method;
        try {
            method = Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class);
        } catch (Exception unused) {
            method = null;
        }
        f6298b = method;
    }

    public e(IOException iOException) {
        super(iOException);
        this.f6299a = iOException;
    }

    private void b(IOException iOException, IOException iOException2) {
        Method method = f6298b;
        if (method != null) {
            try {
                method.invoke(iOException, iOException2);
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
    }

    public void a(IOException iOException) {
        b(iOException, this.f6299a);
        this.f6299a = iOException;
    }

    public IOException c() {
        return this.f6299a;
    }
}
