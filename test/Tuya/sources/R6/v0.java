package R6;

import java.io.IOException;

/* loaded from: classes5.dex */
public class v0 implements InterfaceC1356x {

    /* renamed from: a, reason: collision with root package name */
    private C1357y f8856a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public v0(C1357y c1357y) {
        this.f8856a = c1357y;
    }

    @Override // R6.InterfaceC1335d
    public AbstractC1351s d() {
        try {
            return g();
        } catch (IOException e8) {
            throw new r(e8.getMessage(), e8);
        }
    }

    @Override // R6.y0
    public AbstractC1351s g() {
        return new u0(this.f8856a.d());
    }
}
