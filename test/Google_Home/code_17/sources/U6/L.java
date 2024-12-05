package U6;

import java.io.IOException;

/* loaded from: classes5.dex */
public class L implements InterfaceC1465x {

    /* renamed from: a, reason: collision with root package name */
    private C1466y f10410a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public L(C1466y c1466y) {
        this.f10410a = c1466y;
    }

    @Override // U6.InterfaceC1444d
    public AbstractC1460s d() {
        try {
            return e();
        } catch (IOException e8) {
            throw new r(e8.getMessage(), e8);
        }
    }

    @Override // U6.y0
    public AbstractC1460s e() {
        return new K(this.f10410a.d());
    }
}
