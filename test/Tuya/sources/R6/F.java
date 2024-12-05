package R6;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes5.dex */
public class F implements InterfaceC1349p {

    /* renamed from: a, reason: collision with root package name */
    private C1357y f8780a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public F(C1357y c1357y) {
        this.f8780a = c1357y;
    }

    @Override // R6.InterfaceC1349p
    public InputStream a() {
        return new O(this.f8780a);
    }

    @Override // R6.InterfaceC1335d
    public AbstractC1351s d() {
        try {
            return g();
        } catch (IOException e8) {
            throw new r("IOException converting stream to byte array: " + e8.getMessage(), e8);
        }
    }

    @Override // R6.y0
    public AbstractC1351s g() {
        return new E(G7.a.b(a()));
    }
}
