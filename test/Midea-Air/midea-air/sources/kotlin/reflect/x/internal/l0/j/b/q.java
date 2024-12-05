package kotlin.reflect.x.internal.l0.j.b;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.u;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.l;
import kotlin.reflect.jvm.internal.impl.descriptors.g0;
import kotlin.reflect.jvm.internal.impl.descriptors.z0;
import kotlin.reflect.x.internal.l0.e.m;
import kotlin.reflect.x.internal.l0.e.o;
import kotlin.reflect.x.internal.l0.e.p;
import kotlin.reflect.x.internal.l0.e.z.d;
import kotlin.reflect.x.internal.l0.f.c;
import kotlin.reflect.x.internal.l0.i.w.h;
import kotlin.reflect.x.internal.l0.j.b.g0.f;
import kotlin.reflect.x.internal.l0.j.b.g0.i;
import kotlin.reflect.x.internal.l0.k.n;

/* compiled from: DeserializedPackageFragmentImpl.kt */
/* loaded from: classes2.dex */
public abstract class q extends p {
    private final kotlin.reflect.x.internal.l0.e.z.a m;
    private final f n;
    private final d o;
    private final y p;
    private m q;
    private h r;

    /* compiled from: DeserializedPackageFragmentImpl.kt */
    /* loaded from: classes2.dex */
    static final class a extends Lambda implements Function1<kotlin.reflect.x.internal.l0.f.b, z0> {
        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final z0 invoke(kotlin.reflect.x.internal.l0.f.b bVar) {
            l.f(bVar, "it");
            f fVar = q.this.n;
            if (fVar != null) {
                return fVar;
            }
            z0 z0Var = z0.a;
            l.e(z0Var, "NO_SOURCE");
            return z0Var;
        }
    }

    /* compiled from: DeserializedPackageFragmentImpl.kt */
    /* loaded from: classes2.dex */
    static final class b extends Lambda implements Function0<Collection<? extends kotlin.reflect.x.internal.l0.f.f>> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Collection<kotlin.reflect.x.internal.l0.f.f> invoke() {
            int t;
            Collection<kotlin.reflect.x.internal.l0.f.b> b2 = q.this.A0().b();
            ArrayList arrayList = new ArrayList();
            for (Object obj : b2) {
                kotlin.reflect.x.internal.l0.f.b bVar = (kotlin.reflect.x.internal.l0.f.b) obj;
                if ((bVar.l() || i.a.a().contains(bVar)) ? false : true) {
                    arrayList.add(obj);
                }
            }
            t = u.t(arrayList, 10);
            ArrayList arrayList2 = new ArrayList(t);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((kotlin.reflect.x.internal.l0.f.b) it.next()).j());
            }
            return arrayList2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(c cVar, n nVar, g0 g0Var, m mVar, kotlin.reflect.x.internal.l0.e.z.a aVar, f fVar) {
        super(cVar, nVar, g0Var);
        l.f(cVar, "fqName");
        l.f(nVar, "storageManager");
        l.f(g0Var, "module");
        l.f(mVar, "proto");
        l.f(aVar, "metadataVersion");
        this.m = aVar;
        this.n = fVar;
        p Q = mVar.Q();
        l.e(Q, "proto.strings");
        o P = mVar.P();
        l.e(P, "proto.qualifiedNames");
        d dVar = new d(Q, P);
        this.o = dVar;
        this.p = new y(mVar, dVar, aVar, new a());
        this.q = mVar;
    }

    @Override // kotlin.reflect.x.internal.l0.j.b.p
    public void M0(k kVar) {
        l.f(kVar, "components");
        m mVar = this.q;
        if (mVar != null) {
            this.q = null;
            kotlin.reflect.x.internal.l0.e.l O = mVar.O();
            l.e(O, "proto.`package`");
            this.r = new i(this, O, this.o, this.m, this.n, kVar, "scope of " + this, new b());
            return;
        }
        throw new IllegalStateException("Repeated call to DeserializedPackageFragmentImpl::initialize".toString());
    }

    @Override // kotlin.reflect.x.internal.l0.j.b.p
    /* renamed from: O0, reason: merged with bridge method [inline-methods] */
    public y A0() {
        return this.p;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.k0
    public h q() {
        h hVar = this.r;
        if (hVar != null) {
            return hVar;
        }
        l.v("_memberScope");
        return null;
    }
}
