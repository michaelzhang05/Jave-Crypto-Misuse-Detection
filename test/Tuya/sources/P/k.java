package P;

import O.C1260d;

/* loaded from: classes3.dex */
public final class k extends UnsupportedOperationException {

    /* renamed from: a, reason: collision with root package name */
    private final C1260d f7852a;

    public k(C1260d c1260d) {
        this.f7852a = c1260d;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return "Missing ".concat(String.valueOf(this.f7852a));
    }
}
