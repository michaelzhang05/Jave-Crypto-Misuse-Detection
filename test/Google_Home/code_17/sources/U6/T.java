package U6;

import java.io.IOException;

/* loaded from: classes5.dex */
public class T implements InterfaceC1444d, y0 {

    /* renamed from: a, reason: collision with root package name */
    private C1466y f10418a;

    public T(C1466y c1466y) {
        this.f10418a = c1466y;
    }

    @Override // U6.InterfaceC1444d
    public AbstractC1460s d() {
        try {
            return e();
        } catch (IOException e8) {
            throw new r("unable to get DER object", e8);
        } catch (IllegalArgumentException e9) {
            throw new r("unable to get DER object", e9);
        }
    }

    @Override // U6.y0
    public AbstractC1460s e() {
        try {
            return new o0(this.f10418a.d());
        } catch (IllegalArgumentException e8) {
            throw new C1449g(e8.getMessage(), e8);
        }
    }
}
