package U6;

import java.io.IOException;

/* loaded from: classes5.dex */
public class J implements InterfaceC1463v {

    /* renamed from: a, reason: collision with root package name */
    private C1466y f10409a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public J(C1466y c1466y) {
        this.f10409a = c1466y;
    }

    @Override // U6.InterfaceC1444d
    public AbstractC1460s d() {
        try {
            return e();
        } catch (IOException e8) {
            throw new IllegalStateException(e8.getMessage());
        }
    }

    @Override // U6.y0
    public AbstractC1460s e() {
        return new I(this.f10409a.d());
    }
}
