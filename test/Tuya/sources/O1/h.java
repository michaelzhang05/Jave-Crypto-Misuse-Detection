package O1;

import j$.util.DesugarCollections;
import java.util.Set;

/* loaded from: classes4.dex */
public abstract class h implements Q1.a {

    /* renamed from: a, reason: collision with root package name */
    private final Set f7736a;

    /* renamed from: b, reason: collision with root package name */
    private final Q1.b f7737b = new Q1.b();

    public h(Set set) {
        if (set != null) {
            this.f7736a = DesugarCollections.unmodifiableSet(set);
            return;
        }
        throw new IllegalArgumentException("The supported JWS algorithm set must not be null");
    }

    @Override // Q1.a
    public Q1.b e() {
        return this.f7737b;
    }

    public Set g() {
        return this.f7736a;
    }
}
