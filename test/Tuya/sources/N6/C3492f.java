package n6;

/* renamed from: n6.f, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3492f implements i6.M {

    /* renamed from: a, reason: collision with root package name */
    private final P5.g f36262a;

    public C3492f(P5.g gVar) {
        this.f36262a = gVar;
    }

    @Override // i6.M
    public P5.g getCoroutineContext() {
        return this.f36262a;
    }

    public String toString() {
        return "CoroutineScope(coroutineContext=" + getCoroutineContext() + ')';
    }
}
