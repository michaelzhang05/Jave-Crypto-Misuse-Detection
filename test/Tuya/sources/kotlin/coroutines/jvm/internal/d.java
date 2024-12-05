package kotlin.coroutines.jvm.internal;

import P5.g;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes5.dex */
public abstract class d extends a {
    private final P5.g _context;
    private transient P5.d intercepted;

    public d(P5.d dVar, P5.g gVar) {
        super(dVar);
        this._context = gVar;
    }

    @Override // P5.d
    public P5.g getContext() {
        P5.g gVar = this._context;
        AbstractC3159y.f(gVar);
        return gVar;
    }

    public final P5.d intercepted() {
        P5.d dVar = this.intercepted;
        if (dVar == null) {
            P5.e eVar = (P5.e) getContext().get(P5.e.f7991a0);
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
        P5.d dVar = this.intercepted;
        if (dVar != null && dVar != this) {
            g.b bVar = getContext().get(P5.e.f7991a0);
            AbstractC3159y.f(bVar);
            ((P5.e) bVar).releaseInterceptedContinuation(dVar);
        }
        this.intercepted = c.f33747a;
    }

    public d(P5.d dVar) {
        this(dVar, dVar != null ? dVar.getContext() : null);
    }
}
