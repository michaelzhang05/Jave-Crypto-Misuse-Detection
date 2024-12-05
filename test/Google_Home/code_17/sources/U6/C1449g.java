package U6;

import java.io.IOException;

/* renamed from: U6.g, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C1449g extends IOException {

    /* renamed from: a, reason: collision with root package name */
    private Throwable f10445a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1449g(String str) {
        super(str);
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f10445a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1449g(String str, Throwable th) {
        super(str);
        this.f10445a = th;
    }
}
