package U6;

import java.io.IOException;

/* loaded from: classes5.dex */
public class t0 implements InterfaceC1463v {

    /* renamed from: a, reason: collision with root package name */
    private C1466y f10477a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public t0(C1466y c1466y) {
        this.f10477a = c1466y;
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
        return new s0(this.f10477a.d());
    }
}
