package kotlin.coroutines.jvm.internal;

/* loaded from: classes5.dex */
public abstract class j extends a {
    public j(P5.d dVar) {
        super(dVar);
        if (dVar != null && dVar.getContext() != P5.h.f7994a) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext".toString());
        }
    }

    @Override // P5.d
    public P5.g getContext() {
        return P5.h.f7994a;
    }
}
