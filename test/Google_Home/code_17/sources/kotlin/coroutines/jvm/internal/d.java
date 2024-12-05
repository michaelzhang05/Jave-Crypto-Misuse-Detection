package kotlin.coroutines.jvm.internal;

import S5.g;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes5.dex */
public abstract class d extends a {
    private final S5.g _context;
    private transient S5.d intercepted;

    public d(S5.d dVar, S5.g gVar) {
        super(dVar);
        this._context = gVar;
    }

    @Override // S5.d
    public S5.g getContext() {
        S5.g gVar = this._context;
        AbstractC3255y.f(gVar);
        return gVar;
    }

    public final S5.d intercepted() {
        S5.d dVar = this.intercepted;
        if (dVar == null) {
            S5.e eVar = (S5.e) getContext().get(S5.e.f9822a0);
            if (eVar == null || (dVar = eVar.interceptContinuation(this)) == null) {
                dVar = this;
            }
            this.intercepted = dVar;
        }
        return dVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.coroutines.jvm.internal.a
    public void releaseIntercepted() {
        S5.d dVar = this.intercepted;
        if (dVar != null && dVar != this) {
            g.b bVar = getContext().get(S5.e.f9822a0);
            AbstractC3255y.f(bVar);
            ((S5.e) bVar).releaseInterceptedContinuation(dVar);
        }
        this.intercepted = c.f34148a;
    }

    public d(S5.d dVar) {
        this(dVar, dVar != null ? dVar.getContext() : null);
    }
}
