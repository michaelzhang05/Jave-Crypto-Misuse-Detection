package z3;

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
import z3.o;

/* loaded from: classes.dex */
public class o implements e, c4.a {

    /* renamed from: h, reason: collision with root package name */
    private static final k4.b f10015h = new k4.b() { // from class: z3.l
        @Override // k4.b
        public final Object get() {
            return Collections.emptySet();
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final Map f10016a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f10017b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f10018c;

    /* renamed from: d, reason: collision with root package name */
    private final List f10019d;

    /* renamed from: e, reason: collision with root package name */
    private final v f10020e;

    /* renamed from: f, reason: collision with root package name */
    private final AtomicReference f10021f;

    /* renamed from: g, reason: collision with root package name */
    private final j f10022g;

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final Executor f10023a;

        /* renamed from: b, reason: collision with root package name */
        private final List f10024b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        private final List f10025c = new ArrayList();

        /* renamed from: d, reason: collision with root package name */
        private j f10026d = j.f10008a;

        b(Executor executor) {
            this.f10023a = executor;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ ComponentRegistrar f(ComponentRegistrar componentRegistrar) {
            return componentRegistrar;
        }

        public b b(c cVar) {
            this.f10025c.add(cVar);
            return this;
        }

        public b c(final ComponentRegistrar componentRegistrar) {
            this.f10024b.add(new k4.b() { // from class: z3.p
                @Override // k4.b
                public final Object get() {
                    ComponentRegistrar f6;
                    f6 = o.b.f(ComponentRegistrar.this);
                    return f6;
                }
            });
            return this;
        }

        public b d(Collection collection) {
            this.f10024b.addAll(collection);
            return this;
        }

        public o e() {
            return new o(this.f10023a, this.f10024b, this.f10025c, this.f10026d);
        }

        public b g(j jVar) {
            this.f10026d = jVar;
            return this;
        }
    }

    private o(Executor executor, Iterable iterable, Collection collection, j jVar) {
        this.f10016a = new HashMap();
        this.f10017b = new HashMap();
        this.f10018c = new HashMap();
        this.f10021f = new AtomicReference();
        v vVar = new v(executor);
        this.f10020e = vVar;
        this.f10022g = jVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(c.s(vVar, v.class, h4.d.class, h4.c.class));
        arrayList.add(c.s(this, c4.a.class, new Class[0]));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if (cVar != null) {
                arrayList.add(cVar);
            }
        }
        this.f10019d = o(iterable);
        l(arrayList);
    }

    public static b k(Executor executor) {
        return new b(executor);
    }

    private void l(List list) {
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator it = this.f10019d.iterator();
            while (it.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((k4.b) it.next()).get();
                    if (componentRegistrar != null) {
                        list.addAll(this.f10022g.a(componentRegistrar));
                        it.remove();
                    }
                } catch (w e6) {
                    it.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e6);
                }
            }
            if (this.f10016a.isEmpty()) {
                q.a(list);
            } else {
                ArrayList arrayList2 = new ArrayList(this.f10016a.keySet());
                arrayList2.addAll(list);
                q.a(arrayList2);
            }
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                final c cVar = (c) it2.next();
                this.f10016a.put(cVar, new x(new k4.b() { // from class: z3.k
                    @Override // k4.b
                    public final Object get() {
                        Object p6;
                        p6 = o.this.p(cVar);
                        return p6;
                    }
                }));
            }
            arrayList.addAll(u(list));
            arrayList.addAll(v());
            t();
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            ((Runnable) it3.next()).run();
        }
        s();
    }

    private void m(Map map, boolean z5) {
        for (Map.Entry entry : map.entrySet()) {
            c cVar = (c) entry.getKey();
            k4.b bVar = (k4.b) entry.getValue();
            if (cVar.n() || (cVar.o() && z5)) {
                bVar.get();
            }
        }
        this.f10020e.d();
    }

    private static List o(Iterable iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object p(c cVar) {
        return cVar.h().a(new f0(cVar, this));
    }

    private void s() {
        Boolean bool = (Boolean) this.f10021f.get();
        if (bool != null) {
            m(this.f10016a, bool.booleanValue());
        }
    }

    private void t() {
        Map map;
        e0 b6;
        Object c6;
        for (c cVar : this.f10016a.keySet()) {
            for (r rVar : cVar.g()) {
                if (rVar.f() && !this.f10018c.containsKey(rVar.b())) {
                    map = this.f10018c;
                    b6 = rVar.b();
                    c6 = y.b(Collections.emptySet());
                } else if (this.f10017b.containsKey(rVar.b())) {
                    continue;
                } else {
                    if (rVar.e()) {
                        throw new z(String.format("Unsatisfied dependency for component %s: %s", cVar, rVar.b()));
                    }
                    if (!rVar.f()) {
                        map = this.f10017b;
                        b6 = rVar.b();
                        c6 = c0.c();
                    }
                }
                map.put(b6, c6);
            }
        }
    }

    private List u(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if (cVar.p()) {
                final k4.b bVar = (k4.b) this.f10016a.get(cVar);
                for (e0 e0Var : cVar.j()) {
                    if (this.f10017b.containsKey(e0Var)) {
                        final c0 c0Var = (c0) ((k4.b) this.f10017b.get(e0Var));
                        arrayList.add(new Runnable() { // from class: z3.m
                            @Override // java.lang.Runnable
                            public final void run() {
                                c0.this.f(bVar);
                            }
                        });
                    } else {
                        this.f10017b.put(e0Var, bVar);
                    }
                }
            }
        }
        return arrayList;
    }

    private List v() {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.f10016a.entrySet()) {
            c cVar = (c) entry.getKey();
            if (!cVar.p()) {
                k4.b bVar = (k4.b) entry.getValue();
                for (e0 e0Var : cVar.j()) {
                    if (!hashMap.containsKey(e0Var)) {
                        hashMap.put(e0Var, new HashSet());
                    }
                    ((Set) hashMap.get(e0Var)).add(bVar);
                }
            }
        }
        for (Map.Entry entry2 : hashMap.entrySet()) {
            if (this.f10018c.containsKey(entry2.getKey())) {
                final y yVar = (y) this.f10018c.get(entry2.getKey());
                for (final k4.b bVar2 : (Set) entry2.getValue()) {
                    arrayList.add(new Runnable() { // from class: z3.n
                        @Override // java.lang.Runnable
                        public final void run() {
                            y.this.a(bVar2);
                        }
                    });
                }
            } else {
                this.f10018c.put((e0) entry2.getKey(), y.b((Collection) entry2.getValue()));
            }
        }
        return arrayList;
    }

    @Override // z3.e
    public /* synthetic */ Object a(Class cls) {
        return d.a(this, cls);
    }

    @Override // z3.e
    public /* synthetic */ k4.b b(Class cls) {
        return d.c(this, cls);
    }

    @Override // z3.e
    public /* synthetic */ Set c(Class cls) {
        return d.d(this, cls);
    }

    @Override // z3.e
    public /* synthetic */ Set d(e0 e0Var) {
        return d.e(this, e0Var);
    }

    @Override // z3.e
    public synchronized k4.b e(e0 e0Var) {
        y yVar = (y) this.f10018c.get(e0Var);
        if (yVar != null) {
            return yVar;
        }
        return f10015h;
    }

    @Override // z3.e
    public synchronized k4.b f(e0 e0Var) {
        d0.c(e0Var, "Null interface requested.");
        return (k4.b) this.f10017b.get(e0Var);
    }

    @Override // z3.e
    public /* synthetic */ Object g(e0 e0Var) {
        return d.b(this, e0Var);
    }

    public void n(boolean z5) {
        HashMap hashMap;
        if (u1.x.a(this.f10021f, null, Boolean.valueOf(z5))) {
            synchronized (this) {
                hashMap = new HashMap(this.f10016a);
            }
            m(hashMap, z5);
        }
    }
}
