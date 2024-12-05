package U6;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: U6.b0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C1441b0 implements InterfaceC1458p {

    /* renamed from: a, reason: collision with root package name */
    private x0 f10431a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1441b0(x0 x0Var) {
        this.f10431a = x0Var;
    }

    @Override // U6.InterfaceC1458p
    public InputStream c() {
        return this.f10431a;
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
        return new C1439a0(this.f10431a.l());
    }
}
