package R1;

import j$.util.DesugarCollections;
import java.util.Set;

/* loaded from: classes4.dex */
public abstract class h implements T1.a {

    /* renamed from: a, reason: collision with root package name */
    private final Set f9592a;

    /* renamed from: b, reason: collision with root package name */
    private final T1.b f9593b = new T1.b();

    public h(Set set) {
        if (set != null) {
            this.f9592a = DesugarCollections.unmodifiableSet(set);
            return;
        }
        throw new IllegalArgumentException("The supported JWS algorithm set must not be null");
    }

    @Override // T1.a
    public T1.b d() {
        return this.f9593b;
    }

    public Set g() {
        return this.f9592a;
    }
}
