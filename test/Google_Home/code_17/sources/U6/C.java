package U6;

import java.io.IOException;

/* loaded from: classes5.dex */
public class C implements InterfaceC1444d, y0 {

    /* renamed from: a, reason: collision with root package name */
    private final int f10391a;

    /* renamed from: b, reason: collision with root package name */
    private final C1466y f10392b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C(int i8, C1466y c1466y) {
        this.f10391a = i8;
        this.f10392b = c1466y;
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
        return new B(this.f10391a, this.f10392b.d());
    }
}
