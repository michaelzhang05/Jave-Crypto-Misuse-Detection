package U6;

import java.io.IOException;

/* loaded from: classes5.dex */
public class H implements InterfaceC1444d, y0 {

    /* renamed from: a, reason: collision with root package name */
    private final int f10407a;

    /* renamed from: b, reason: collision with root package name */
    private final C1466y f10408b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public H(int i8, C1466y c1466y) {
        this.f10407a = i8;
        this.f10408b = c1466y;
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
        return new G(this.f10407a, this.f10408b.d());
    }
}
