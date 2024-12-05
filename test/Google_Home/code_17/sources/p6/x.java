package p6;

/* loaded from: classes5.dex */
final class x implements S5.d, kotlin.coroutines.jvm.internal.e {

    /* renamed from: a, reason: collision with root package name */
    private final S5.d f37973a;

    /* renamed from: b, reason: collision with root package name */
    private final S5.g f37974b;

    public x(S5.d dVar, S5.g gVar) {
        this.f37973a = dVar;
        this.f37974b = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.e
    public kotlin.coroutines.jvm.internal.e getCallerFrame() {
        S5.d dVar = this.f37973a;
        if (dVar instanceof kotlin.coroutines.jvm.internal.e) {
            return (kotlin.coroutines.jvm.internal.e) dVar;
        }
        return null;
    }

    @Override // S5.d
    public S5.g getContext() {
        return this.f37974b;
    }

    @Override // S5.d
    public void resumeWith(Object obj) {
        this.f37973a.resumeWith(obj);
    }
}
