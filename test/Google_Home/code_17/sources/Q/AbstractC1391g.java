package Q;

import N.C1336g;
import O.a;
import O.f;
import P.InterfaceC1358c;
import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: Q.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1391g extends AbstractC1387c implements a.f {

    /* renamed from: F, reason: collision with root package name */
    private final C1388d f9022F;

    /* renamed from: G, reason: collision with root package name */
    private final Set f9023G;

    /* renamed from: H, reason: collision with root package name */
    private final Account f9024H;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC1391g(Context context, Looper looper, int i8, C1388d c1388d, f.a aVar, f.b bVar) {
        this(context, looper, i8, c1388d, (InterfaceC1358c) aVar, (P.h) bVar);
    }

    private final Set l0(Set set) {
        Set k02 = k0(set);
        Iterator it = k02.iterator();
        while (it.hasNext()) {
            if (!set.contains((Scope) it.next())) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        return k02;
    }

    @Override // Q.AbstractC1387c
    protected final Set C() {
        return this.f9023G;
    }

    @Override // O.a.f
    public Set c() {
        if (o()) {
            return this.f9023G;
        }
        return Collections.emptySet();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final C1388d j0() {
        return this.f9022F;
    }

    @Override // Q.AbstractC1387c
    public final Account u() {
        return this.f9024H;
    }

    @Override // Q.AbstractC1387c
    protected Executor w() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC1391g(Context context, Looper looper, int i8, C1388d c1388d, InterfaceC1358c interfaceC1358c, P.h hVar) {
        this(context, looper, AbstractC1392h.a(context), C1336g.n(), i8, c1388d, (InterfaceC1358c) AbstractC1400p.l(interfaceC1358c), (P.h) AbstractC1400p.l(hVar));
    }

    protected AbstractC1391g(Context context, Looper looper, AbstractC1392h abstractC1392h, C1336g c1336g, int i8, C1388d c1388d, InterfaceC1358c interfaceC1358c, P.h hVar) {
        super(context, looper, abstractC1392h, c1336g, i8, interfaceC1358c == null ? null : new E(interfaceC1358c), hVar == null ? null : new F(hVar), c1388d.j());
        this.f9022F = c1388d;
        this.f9024H = c1388d.a();
        this.f9023G = l0(c1388d.d());
    }

    protected Set k0(Set set) {
        return set;
    }
}
