package O;

import N.C1333d;

/* loaded from: classes3.dex */
public final class k extends UnsupportedOperationException {

    /* renamed from: a, reason: collision with root package name */
    private final C1333d f7814a;

    public k(C1333d c1333d) {
        this.f7814a = c1333d;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return "Missing ".concat(String.valueOf(this.f7814a));
    }
}
