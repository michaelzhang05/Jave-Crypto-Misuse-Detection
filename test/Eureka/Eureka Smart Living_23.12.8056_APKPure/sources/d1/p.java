package d1;

import java.util.Set;

/* loaded from: classes.dex */
final class p implements b1.g {

    /* renamed from: a, reason: collision with root package name */
    private final Set f6455a;

    /* renamed from: b, reason: collision with root package name */
    private final o f6456b;

    /* renamed from: c, reason: collision with root package name */
    private final s f6457c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public p(Set set, o oVar, s sVar) {
        this.f6455a = set;
        this.f6456b = oVar;
        this.f6457c = sVar;
    }

    @Override // b1.g
    public b1.f a(String str, Class cls, b1.b bVar, b1.e eVar) {
        if (this.f6455a.contains(bVar)) {
            return new r(this.f6456b, str, bVar, eVar, this.f6457c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", bVar, this.f6455a));
    }
}
