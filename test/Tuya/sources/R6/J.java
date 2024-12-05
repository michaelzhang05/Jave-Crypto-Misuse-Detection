package R6;

import java.io.IOException;

/* loaded from: classes5.dex */
public class J implements InterfaceC1354v {

    /* renamed from: a, reason: collision with root package name */
    private C1357y f8783a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public J(C1357y c1357y) {
        this.f8783a = c1357y;
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
        return new I(this.f8783a.d());
    }
}
