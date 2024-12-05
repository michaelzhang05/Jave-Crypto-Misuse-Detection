package i6;

import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class L0 extends P5.a implements InterfaceC2855x0 {

    /* renamed from: a, reason: collision with root package name */
    public static final L0 f31717a = new L0();

    private L0() {
        super(InterfaceC2855x0.f31809n0);
    }

    @Override // i6.InterfaceC2855x0
    public boolean b() {
        return false;
    }

    @Override // i6.InterfaceC2855x0
    public Object e(P5.d dVar) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // i6.InterfaceC2855x0
    public InterfaceC2855x0 getParent() {
        return null;
    }

    @Override // i6.InterfaceC2855x0
    public boolean isActive() {
        return true;
    }

    @Override // i6.InterfaceC2855x0
    public InterfaceC2816d0 l(boolean z8, boolean z9, Function1 function1) {
        return M0.f31718a;
    }

    @Override // i6.InterfaceC2855x0
    public CancellationException m() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // i6.InterfaceC2855x0
    public boolean start() {
        return false;
    }

    @Override // i6.InterfaceC2855x0
    public InterfaceC2848u t(InterfaceC2852w interfaceC2852w) {
        return M0.f31718a;
    }

    public String toString() {
        return "NonCancellable";
    }

    @Override // i6.InterfaceC2855x0
    public InterfaceC2816d0 u(Function1 function1) {
        return M0.f31718a;
    }

    @Override // i6.InterfaceC2855x0
    public void cancel(CancellationException cancellationException) {
    }
}
