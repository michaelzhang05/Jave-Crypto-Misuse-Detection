package l6;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: l6.y0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3392y0 extends CancellationException {

    /* renamed from: a, reason: collision with root package name */
    public final transient InterfaceC3390x0 f34663a;

    public C3392y0(String str, Throwable th, InterfaceC3390x0 interfaceC3390x0) {
        super(str);
        this.f34663a = interfaceC3390x0;
        if (th != null) {
            initCause(th);
        }
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof C3392y0) {
                C3392y0 c3392y0 = (C3392y0) obj;
                if (!AbstractC3255y.d(c3392y0.getMessage(), getMessage()) || !AbstractC3255y.d(c3392y0.f34663a, this.f34663a) || !AbstractC3255y.d(c3392y0.getCause(), getCause())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public int hashCode() {
        int i8;
        String message = getMessage();
        AbstractC3255y.f(message);
        int hashCode = ((message.hashCode() * 31) + this.f34663a.hashCode()) * 31;
        Throwable cause = getCause();
        if (cause != null) {
            i8 = cause.hashCode();
        } else {
            i8 = 0;
        }
        return hashCode + i8;
    }

    @Override // java.lang.Throwable
    public String toString() {
        return super.toString() + "; job=" + this.f34663a;
    }
}
