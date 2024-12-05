package u;

import java.util.Set;
import s.C3982c;

/* loaded from: classes3.dex */
final class q implements s.j {

    /* renamed from: a, reason: collision with root package name */
    private final Set f39895a;

    /* renamed from: b, reason: collision with root package name */
    private final p f39896b;

    /* renamed from: c, reason: collision with root package name */
    private final t f39897c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public q(Set set, p pVar, t tVar) {
        this.f39895a = set;
        this.f39896b = pVar;
        this.f39897c = tVar;
    }

    @Override // s.j
    public s.i a(String str, Class cls, C3982c c3982c, s.h hVar) {
        if (this.f39895a.contains(c3982c)) {
            return new s(this.f39896b, str, c3982c, hVar, this.f39897c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", c3982c, this.f39895a));
    }
}
