package R6;

import java.io.IOException;

/* loaded from: classes5.dex */
public class T implements InterfaceC1335d, y0 {

    /* renamed from: a, reason: collision with root package name */
    private C1357y f8792a;

    public T(C1357y c1357y) {
        this.f8792a = c1357y;
    }

    @Override // R6.InterfaceC1335d
    public AbstractC1351s d() {
        try {
            return g();
        } catch (IOException e8) {
            throw new r("unable to get DER object", e8);
        } catch (IllegalArgumentException e9) {
            throw new r("unable to get DER object", e9);
        }
    }

    @Override // R6.y0
    public AbstractC1351s g() {
        try {
            return new o0(this.f8792a.d());
        } catch (IllegalArgumentException e8) {
            throw new C1340g(e8.getMessage(), e8);
        }
    }
}
