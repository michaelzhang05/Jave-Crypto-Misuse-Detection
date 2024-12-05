package R6;

import java.io.IOException;

/* loaded from: classes5.dex */
public class N implements InterfaceC1335d, y0 {

    /* renamed from: a, reason: collision with root package name */
    private boolean f8785a;

    /* renamed from: b, reason: collision with root package name */
    private int f8786b;

    /* renamed from: c, reason: collision with root package name */
    private C1357y f8787c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public N(boolean z8, int i8, C1357y c1357y) {
        this.f8785a = z8;
        this.f8786b = i8;
        this.f8787c = c1357y;
    }

    @Override // R6.InterfaceC1335d
    public AbstractC1351s d() {
        try {
            return g();
        } catch (IOException e8) {
            throw new r(e8.getMessage());
        }
    }

    @Override // R6.y0
    public AbstractC1351s g() {
        return this.f8787c.c(this.f8785a, this.f8786b);
    }
}
