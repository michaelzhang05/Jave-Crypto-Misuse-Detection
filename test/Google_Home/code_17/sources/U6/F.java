package U6;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes5.dex */
public class F implements InterfaceC1458p {

    /* renamed from: a, reason: collision with root package name */
    private C1466y f10406a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public F(C1466y c1466y) {
        this.f10406a = c1466y;
    }

    @Override // U6.InterfaceC1458p
    public InputStream c() {
        return new O(this.f10406a);
    }

    @Override // U6.InterfaceC1444d
    public AbstractC1460s d() {
        try {
            return e();
        } catch (IOException e8) {
            throw new r("IOException converting stream to byte array: " + e8.getMessage(), e8);
        }
    }

    @Override // U6.y0
    public AbstractC1460s e() {
        return new E(J7.a.b(c()));
    }
}
