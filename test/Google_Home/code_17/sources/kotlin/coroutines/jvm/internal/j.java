package kotlin.coroutines.jvm.internal;

/* loaded from: classes5.dex */
public abstract class j extends a {
    public j(S5.d dVar) {
        super(dVar);
        if (dVar != null && dVar.getContext() != S5.h.f9825a) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext".toString());
        }
    }

    @Override // S5.d
    public S5.g getContext() {
        return S5.h.f9825a;
    }
}
