package p6;

import java.util.concurrent.CancellationException;
import o6.InterfaceC3707g;

/* renamed from: p6.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3783a extends CancellationException {

    /* renamed from: a, reason: collision with root package name */
    public final transient InterfaceC3707g f37896a;

    public C3783a(InterfaceC3707g interfaceC3707g) {
        super("Flow was aborted, no more elements needed");
        this.f37896a = interfaceC3707g;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
