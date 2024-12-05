package R1;

import j$.util.DesugarCollections;
import java.util.Set;

/* loaded from: classes4.dex */
abstract class g implements N1.o {

    /* renamed from: a, reason: collision with root package name */
    private final Set f9589a;

    /* renamed from: b, reason: collision with root package name */
    private final Set f9590b;

    /* renamed from: c, reason: collision with root package name */
    private final T1.c f9591c = new T1.c();

    public g(Set set, Set set2) {
        if (set != null) {
            this.f9589a = DesugarCollections.unmodifiableSet(set);
            if (set2 != null) {
                this.f9590b = set2;
                return;
            }
            throw new IllegalArgumentException("The supported encryption methods must not be null");
        }
        throw new IllegalArgumentException("The supported JWE algorithm set must not be null");
    }

    @Override // N1.o
    public Set a() {
        return this.f9590b;
    }

    @Override // N1.o
    public Set e() {
        return this.f9589a;
    }

    public T1.c g() {
        return this.f9591c;
    }
}
