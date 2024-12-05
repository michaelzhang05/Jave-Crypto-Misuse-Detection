package R6;

import java.io.IOException;

/* loaded from: classes5.dex */
public class t0 implements InterfaceC1354v {

    /* renamed from: a, reason: collision with root package name */
    private C1357y f8851a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public t0(C1357y c1357y) {
        this.f8851a = c1357y;
    }

    @Override // R6.InterfaceC1335d
    public AbstractC1351s d() {
        try {
            return g();
        } catch (IOException e8) {
            throw new IllegalStateException(e8.getMessage());
        }
    }

    @Override // R6.y0
    public AbstractC1351s g() {
        return new s0(this.f8851a.d());
    }
}
