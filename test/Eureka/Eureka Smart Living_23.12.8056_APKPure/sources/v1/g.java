package v1;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import t1.a;
import t1.e;

/* loaded from: classes.dex */
public abstract class g extends c implements a.f {
    private final d F;
    private final Set G;
    private final Account H;

    /* JADX INFO: Access modifiers changed from: protected */
    public g(Context context, Looper looper, int i6, d dVar, e.a aVar, e.b bVar) {
        this(context, looper, i6, dVar, (u1.c) aVar, (u1.h) bVar);
    }

    private final Set i0(Set set) {
        Set h02 = h0(set);
        Iterator it = h02.iterator();
        while (it.hasNext()) {
            if (!set.contains((Scope) it.next())) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        return h02;
    }

    @Override // v1.c
    protected final Set B() {
        return this.G;
    }

    @Override // t1.a.f
    public Set g() {
        return j() ? this.G : Collections.emptySet();
    }

    protected Set h0(Set set) {
        return set;
    }

    @Override // v1.c
    public final Account t() {
        return this.H;
    }

    @Override // v1.c
    protected final Executor v() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public g(Context context, Looper looper, int i6, d dVar, u1.c cVar, u1.h hVar) {
        this(context, looper, h.b(context), s1.f.k(), i6, dVar, (u1.c) n.h(cVar), (u1.h) n.h(hVar));
    }

    protected g(Context context, Looper looper, h hVar, s1.f fVar, int i6, d dVar, u1.c cVar, u1.h hVar2) {
        super(context, looper, hVar, fVar, i6, cVar == null ? null : new c0(cVar), hVar2 == null ? null : new d0(hVar2), dVar.h());
        this.F = dVar;
        this.H = dVar.a();
        this.G = i0(dVar.c());
    }
}
