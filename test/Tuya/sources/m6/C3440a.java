package m6;

import java.util.concurrent.CancellationException;
import l6.InterfaceC3359g;

/* renamed from: m6.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3440a extends CancellationException {

    /* renamed from: a, reason: collision with root package name */
    public final transient InterfaceC3359g f35870a;

    public C3440a(InterfaceC3359g interfaceC3359g) {
        super("Flow was aborted, no more elements needed");
        this.f35870a = interfaceC3359g;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
