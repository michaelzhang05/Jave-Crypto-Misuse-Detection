package R6;

import java.io.IOException;

/* renamed from: R6.g, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C1340g extends IOException {

    /* renamed from: a, reason: collision with root package name */
    private Throwable f8819a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1340g(String str) {
        super(str);
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f8819a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1340g(String str, Throwable th) {
        super(str);
        this.f8819a = th;
    }
}
