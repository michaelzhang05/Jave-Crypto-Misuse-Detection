package R;

import O.C1263g;
import P.a;
import P.f;
import Q.InterfaceC1302c;
import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: R.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1310g extends AbstractC1306c implements a.f {

    /* renamed from: F, reason: collision with root package name */
    private final C1307d f8560F;

    /* renamed from: G, reason: collision with root package name */
    private final Set f8561G;

    /* renamed from: H, reason: collision with root package name */
    private final Account f8562H;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC1310g(Context context, Looper looper, int i8, C1307d c1307d, f.a aVar, f.b bVar) {
        this(context, looper, i8, c1307d, (InterfaceC1302c) aVar, (Q.h) bVar);
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

    @Override // R.AbstractC1306c
    protected final Set C() {
        return this.f8561G;
    }

    @Override // P.a.f
    public Set c() {
        if (n()) {
            return this.f8561G;
        }
        return Collections.emptySet();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final C1307d j0() {
        return this.f8560F;
    }

    @Override // R.AbstractC1306c
    public final Account u() {
        return this.f8562H;
    }

    @Override // R.AbstractC1306c
    protected Executor w() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC1310g(Context context, Looper looper, int i8, C1307d c1307d, InterfaceC1302c interfaceC1302c, Q.h hVar) {
        this(context, looper, AbstractC1311h.a(context), C1263g.n(), i8, c1307d, (InterfaceC1302c) AbstractC1319p.l(interfaceC1302c), (Q.h) AbstractC1319p.l(hVar));
    }

    protected AbstractC1310g(Context context, Looper looper, AbstractC1311h abstractC1311h, C1263g c1263g, int i8, C1307d c1307d, InterfaceC1302c interfaceC1302c, Q.h hVar) {
        super(context, looper, abstractC1311h, c1263g, i8, interfaceC1302c == null ? null : new E(interfaceC1302c), hVar == null ? null : new F(hVar), c1307d.j());
        this.f8560F = c1307d;
        this.f8562H = c1307d.a();
        this.f8561G = l0(c1307d.d());
    }

    protected Set k0(Set set) {
        return set;
    }
}
