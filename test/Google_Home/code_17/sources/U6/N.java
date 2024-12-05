package U6;

import java.io.IOException;

/* loaded from: classes5.dex */
public class N implements InterfaceC1444d, y0 {

    /* renamed from: a, reason: collision with root package name */
    private boolean f10411a;

    /* renamed from: b, reason: collision with root package name */
    private int f10412b;

    /* renamed from: c, reason: collision with root package name */
    private C1466y f10413c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public N(boolean z8, int i8, C1466y c1466y) {
        this.f10411a = z8;
        this.f10412b = i8;
        this.f10413c = c1466y;
    }

    @Override // U6.InterfaceC1444d
    public AbstractC1460s d() {
        try {
            return e();
        } catch (IOException e8) {
            throw new r(e8.getMessage());
        }
    }

    @Override // U6.y0
    public AbstractC1460s e() {
        return this.f10413c.c(this.f10411a, this.f10412b);
    }
}
