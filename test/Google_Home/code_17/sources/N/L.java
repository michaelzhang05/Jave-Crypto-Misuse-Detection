package N;

import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
final class L extends N {

    /* renamed from: f, reason: collision with root package name */
    private final Callable f7444f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ L(Callable callable, K k8) {
        super();
        this.f7444f = callable;
    }

    @Override // N.N
    final String a() {
        try {
            return (String) this.f7444f.call();
        } catch (Exception e8) {
            throw new RuntimeException(e8);
        }
    }
}
