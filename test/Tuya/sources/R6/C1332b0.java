package R6;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: R6.b0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C1332b0 implements InterfaceC1349p {

    /* renamed from: a, reason: collision with root package name */
    private x0 f8805a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1332b0(x0 x0Var) {
        this.f8805a = x0Var;
    }

    @Override // R6.InterfaceC1349p
    public InputStream a() {
        return this.f8805a;
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
        return new C1330a0(this.f8805a.g());
    }
}
