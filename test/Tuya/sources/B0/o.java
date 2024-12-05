package B0;

import B0.o;
import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public class o implements InterfaceC1064e, R0.a {

    /* renamed from: h, reason: collision with root package name */
    private static final Z0.b f634h = new Z0.b() { // from class: B0.k
        @Override // Z0.b
        public final Object get() {
            return Collections.emptySet();
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final Map f635a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f636b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f637c;

    /* renamed from: d, reason: collision with root package name */
    private final List f638d;

    /* renamed from: e, reason: collision with root package name */
    private final v f639e;

    /* renamed from: f, reason: collision with root package name */
    private final AtomicReference f640f;

    /* renamed from: g, reason: collision with root package name */
    private final j f641g;

    public static b m(Executor executor) {
        return new b(executor);
    }

    private void n(List list) {
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator it = this.f638d.iterator();
            while (it.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((Z0.b) it.next()).get();
                    if (componentRegistrar != null) {
                        list.addAll(this.f641g.a(componentRegistrar));
                        it.remove();
                    }
                } catch (w e8) {
                    it.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e8);
                }
            }
            if (this.f635a.isEmpty()) {
                q.a(list);
            } else {
                ArrayList arrayList2 = new ArrayList(this.f635a.keySet());
                arrayList2.addAll(list);
                q.a(arrayList2);
            }
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                final C1062c c1062c = (C1062c) it2.next();
                this.f635a.put(c1062c, new x(new Z0.b() { // from class: B0.l
                    @Override // Z0.b
                    public final Object get() {
                        Object r8;
                        r8 = o.this.r(c1062c);
                        return r8;
                    }
                }));
            }
            arrayList.addAll(w(list));
            arrayList.addAll(x());
            v();
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            ((Runnable) it3.next()).run();
        }
        u();
    }

    private void o(Map map, boolean z8) {
        for (Map.Entry entry : map.entrySet()) {
            C1062c c1062c = (C1062c) entry.getKey();
            Z0.b bVar = (Z0.b) entry.getValue();
            if (c1062c.n() || (c1062c.o() && z8)) {
                bVar.get();
            }
        }
        this.f639e.d();
    }

    private static List q(Iterable iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object r(C1062c c1062c) {
        return c1062c.h().a(new G(c1062c, this));
    }

    private void u() {
        Boolean bool = (Boolean) this.f640f.get();
        if (bool != null) {
            o(this.f635a, bool.booleanValue());
        }
    }

    private void v() {
        for (C1062c c1062c : this.f635a.keySet()) {
            for (r rVar : c1062c.g()) {
                if (rVar.g() && !this.f637c.containsKey(rVar.c())) {
                    this.f637c.put(rVar.c(), y.b(Collections.emptySet()));
                } else if (this.f636b.containsKey(rVar.c())) {
                    continue;
                } else if (!rVar.f()) {
                    if (!rVar.g()) {
                        this.f636b.put(rVar.c(), D.e());
                    }
                } else {
                    throw new z(String.format("Unsatisfied dependency for component %s: %s", c1062c, rVar.c()));
                }
            }
        }
    }

    private List w(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C1062c c1062c = (C1062c) it.next();
            if (c1062c.p()) {
                final Z0.b bVar = (Z0.b) this.f635a.get(c1062c);
                for (F f8 : c1062c.j()) {
                    if (!this.f636b.containsKey(f8)) {
                        this.f636b.put(f8, bVar);
                    } else {
                        final D d8 = (D) ((Z0.b) this.f636b.get(f8));
                        arrayList.add(new Runnable() { // from class: B0.m
                            @Override // java.lang.Runnable
                            public final void run() {
                                D.this.j(bVar);
                            }
                        });
                    }
                }
            }
        }
        return arrayList;
    }

    private List x() {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.f635a.entrySet()) {
            C1062c c1062c = (C1062c) entry.getKey();
            if (!c1062c.p()) {
                Z0.b bVar = (Z0.b) entry.getValue();
                for (F f8 : c1062c.j()) {
                    if (!hashMap.containsKey(f8)) {
                        hashMap.put(f8, new HashSet());
                    }
                    ((Set) hashMap.get(f8)).add(bVar);
                }
            }
        }
        for (Map.Entry entry2 : hashMap.entrySet()) {
            if (!this.f637c.containsKey(entry2.getKey())) {
                this.f637c.put((F) entry2.getKey(), y.b((Collection) entry2.getValue()));
            } else {
                final y yVar = (y) this.f637c.get(entry2.getKey());
                for (final Z0.b bVar2 : (Set) entry2.getValue()) {
                    arrayList.add(new Runnable() { // from class: B0.n
                        @Override // java.lang.Runnable
                        public final void run() {
                            y.this.a(bVar2);
                        }
                    });
                }
            }
        }
        return arrayList;
    }

    @Override // B0.InterfaceC1064e
    public /* synthetic */ Object a(Class cls) {
        return AbstractC1063d.b(this, cls);
    }

    @Override // B0.InterfaceC1064e
    public Z0.a b(F f8) {
        Z0.b e8 = e(f8);
        if (e8 == null) {
            return D.e();
        }
        if (e8 instanceof D) {
            return (D) e8;
        }
        return D.i(e8);
    }

    @Override // B0.InterfaceC1064e
    public /* synthetic */ Set c(F f8) {
        return AbstractC1063d.e(this, f8);
    }

    @Override // B0.InterfaceC1064e
    public /* synthetic */ Z0.b d(Class cls) {
        return AbstractC1063d.d(this, cls);
    }

    @Override // B0.InterfaceC1064e
    public synchronized Z0.b e(F f8) {
        E.c(f8, "Null interface requested.");
        return (Z0.b) this.f636b.get(f8);
    }

    @Override // B0.InterfaceC1064e
    public /* synthetic */ Object f(F f8) {
        return AbstractC1063d.a(this, f8);
    }

    @Override // B0.InterfaceC1064e
    public /* synthetic */ Set g(Class cls) {
        return AbstractC1063d.f(this, cls);
    }

    @Override // B0.InterfaceC1064e
    public synchronized Z0.b h(F f8) {
        y yVar = (y) this.f637c.get(f8);
        if (yVar != null) {
            return yVar;
        }
        return f634h;
    }

    @Override // B0.InterfaceC1064e
    public /* synthetic */ Z0.a i(Class cls) {
        return AbstractC1063d.c(this, cls);
    }

    public void p(boolean z8) {
        HashMap hashMap;
        if (!androidx.compose.animation.core.d.a(this.f640f, null, Boolean.valueOf(z8))) {
            return;
        }
        synchronized (this) {
            hashMap = new HashMap(this.f635a);
        }
        o(hashMap, z8);
    }

    private o(Executor executor, Iterable iterable, Collection collection, j jVar) {
        this.f635a = new HashMap();
        this.f636b = new HashMap();
        this.f637c = new HashMap();
        this.f640f = new AtomicReference();
        v vVar = new v(executor);
        this.f639e = vVar;
        this.f641g = jVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(C1062c.s(vVar, v.class, W0.d.class, W0.c.class));
        arrayList.add(C1062c.s(this, R0.a.class, new Class[0]));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C1062c c1062c = (C1062c) it.next();
            if (c1062c != null) {
                arrayList.add(c1062c);
            }
        }
        this.f638d = q(iterable);
        n(arrayList);
    }

    /* loaded from: classes3.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final Executor f642a;

        /* renamed from: b, reason: collision with root package name */
        private final List f643b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        private final List f644c = new ArrayList();

        /* renamed from: d, reason: collision with root package name */
        private j f645d = j.f627a;

        b(Executor executor) {
            this.f642a = executor;
        }

        public b b(C1062c c1062c) {
            this.f644c.add(c1062c);
            return this;
        }

        public b c(final ComponentRegistrar componentRegistrar) {
            this.f643b.add(new Z0.b() { // from class: B0.p
                @Override // Z0.b
                public final Object get() {
                    ComponentRegistrar f8;
                    f8 = o.b.f(ComponentRegistrar.this);
                    return f8;
                }
            });
            return this;
        }

        public b d(Collection collection) {
            this.f643b.addAll(collection);
            return this;
        }

        public o e() {
            return new o(this.f642a, this.f643b, this.f644c, this.f645d);
        }

        public b g(j jVar) {
            this.f645d = jVar;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ ComponentRegistrar f(ComponentRegistrar componentRegistrar) {
            return componentRegistrar;
        }
    }
}
