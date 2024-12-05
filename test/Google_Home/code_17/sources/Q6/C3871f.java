package q6;

/* renamed from: q6.f, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3871f implements l6.M {

    /* renamed from: a, reason: collision with root package name */
    private final S5.g f38390a;

    public C3871f(S5.g gVar) {
        this.f38390a = gVar;
    }

    @Override // l6.M
    public S5.g getCoroutineContext() {
        return this.f38390a;
    }

    public String toString() {
        return "CoroutineScope(coroutineContext=" + getCoroutineContext() + ')';
    }
}
