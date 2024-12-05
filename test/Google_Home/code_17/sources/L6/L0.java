package l6;

import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class L0 extends S5.a implements InterfaceC3390x0 {

    /* renamed from: a, reason: collision with root package name */
    public static final L0 f34569a = new L0();

    private L0() {
        super(InterfaceC3390x0.f34661n0);
    }

    @Override // l6.InterfaceC3390x0
    public InterfaceC3383u A(InterfaceC3387w interfaceC3387w) {
        return M0.f34570a;
    }

    @Override // l6.InterfaceC3390x0
    public boolean b() {
        return false;
    }

    @Override // l6.InterfaceC3390x0
    public InterfaceC3390x0 getParent() {
        return null;
    }

    @Override // l6.InterfaceC3390x0
    public boolean isActive() {
        return true;
    }

    @Override // l6.InterfaceC3390x0
    public boolean isCancelled() {
        return false;
    }

    @Override // l6.InterfaceC3390x0
    public InterfaceC3351d0 n(boolean z8, boolean z9, Function1 function1) {
        return M0.f34570a;
    }

    @Override // l6.InterfaceC3390x0
    public CancellationException o() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // l6.InterfaceC3390x0
    public InterfaceC3351d0 s(Function1 function1) {
        return M0.f34570a;
    }

    @Override // l6.InterfaceC3390x0
    public boolean start() {
        return false;
    }

    public String toString() {
        return "NonCancellable";
    }

    @Override // l6.InterfaceC3390x0
    public Object y(S5.d dVar) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // l6.InterfaceC3390x0
    public void cancel(CancellationException cancellationException) {
    }
}
