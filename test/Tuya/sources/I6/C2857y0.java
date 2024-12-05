package i6;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: i6.y0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2857y0 extends CancellationException {

    /* renamed from: a, reason: collision with root package name */
    public final transient InterfaceC2855x0 f31811a;

    public C2857y0(String str, Throwable th, InterfaceC2855x0 interfaceC2855x0) {
        super(str);
        this.f31811a = interfaceC2855x0;
        if (th != null) {
            initCause(th);
        }
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof C2857y0) {
                C2857y0 c2857y0 = (C2857y0) obj;
                if (!AbstractC3159y.d(c2857y0.getMessage(), getMessage()) || !AbstractC3159y.d(c2857y0.f31811a, this.f31811a) || !AbstractC3159y.d(c2857y0.getCause(), getCause())) {
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
        AbstractC3159y.f(message);
        int hashCode = ((message.hashCode() * 31) + this.f31811a.hashCode()) * 31;
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
        return super.toString() + "; job=" + this.f31811a;
    }
}
