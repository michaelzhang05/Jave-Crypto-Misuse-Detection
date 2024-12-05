package D0;

import D0.o;
import android.util.Log;
import b1.InterfaceC1955a;
import b1.InterfaceC1956b;
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
public class o implements InterfaceC1055e, T0.a {

    /* renamed from: i, reason: collision with root package name */
    private static final InterfaceC1956b f1739i = new InterfaceC1956b() { // from class: D0.k
        @Override // b1.InterfaceC1956b
        public final Object get() {
            return Collections.emptySet();
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final Map f1740a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f1741b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f1742c;

    /* renamed from: d, reason: collision with root package name */
    private final List f1743d;

    /* renamed from: e, reason: collision with root package name */
    private Set f1744e;

    /* renamed from: f, reason: collision with root package name */
    private final v f1745f;

    /* renamed from: g, reason: collision with root package name */
    private final AtomicReference f1746g;

    /* renamed from: h, reason: collision with root package name */
    private final j f1747h;

    public static b m(Executor executor) {
        return new b(executor);
    }

    private void n(List list) {
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator it = this.f1743d.iterator();
            while (it.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((InterfaceC1956b) it.next()).get();
                    if (componentRegistrar != null) {
                        list.addAll(this.f1747h.a(componentRegistrar));
                        it.remove();
                    }
                } catch (w e8) {
                    it.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e8);
                }
            }
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                Object[] array = ((C1053c) it2.next()).j().toArray();
                int length = array.length;
                int i8 = 0;
                while (true) {
                    if (i8 < length) {
                        Object obj = array[i8];
                        if (obj.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                            if (this.f1744e.contains(obj.toString())) {
                                it2.remove();
                                break;
                            }
                            this.f1744e.add(obj.toString());
                        }
                        i8++;
                    }
                }
            }
            if (this.f1740a.isEmpty()) {
                q.a(list);
            } else {
                ArrayList arrayList2 = new ArrayList(this.f1740a.keySet());
                arrayList2.addAll(list);
                q.a(arrayList2);
            }
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                final C1053c c1053c = (C1053c) it3.next();
                this.f1740a.put(c1053c, new x(new InterfaceC1956b() { // from class: D0.l
                    @Override // b1.InterfaceC1956b
                    public final Object get() {
                        Object r8;
                        r8 = o.this.r(c1053c);
                        return r8;
                    }
                }));
            }
            arrayList.addAll(w(list));
            arrayList.addAll(x());
            v();
        }
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            ((Runnable) it4.next()).run();
        }
        u();
    }

    private void o(Map map, boolean z8) {
        for (Map.Entry entry : map.entrySet()) {
            C1053c c1053c = (C1053c) entry.getKey();
            InterfaceC1956b interfaceC1956b = (InterfaceC1956b) entry.getValue();
            if (c1053c.n() || (c1053c.o() && z8)) {
                interfaceC1956b.get();
            }
        }
        this.f1745f.d();
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
    public /* synthetic */ Object r(C1053c c1053c) {
        return c1053c.h().a(new G(c1053c, this));
    }

    private void u() {
        Boolean bool = (Boolean) this.f1746g.get();
        if (bool != null) {
            o(this.f1740a, bool.booleanValue());
        }
    }

    private void v() {
        for (C1053c c1053c : this.f1740a.keySet()) {
            for (r rVar : c1053c.g()) {
                if (rVar.g() && !this.f1742c.containsKey(rVar.c())) {
                    this.f1742c.put(rVar.c(), y.b(Collections.emptySet()));
                } else if (this.f1741b.containsKey(rVar.c())) {
                    continue;
                } else if (!rVar.f()) {
                    if (!rVar.g()) {
                        this.f1741b.put(rVar.c(), D.e());
                    }
                } else {
                    throw new z(String.format("Unsatisfied dependency for component %s: %s", c1053c, rVar.c()));
                }
            }
        }
    }

    private List w(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C1053c c1053c = (C1053c) it.next();
            if (c1053c.p()) {
                final InterfaceC1956b interfaceC1956b = (InterfaceC1956b) this.f1740a.get(c1053c);
                for (F f8 : c1053c.j()) {
                    if (!this.f1741b.containsKey(f8)) {
                        this.f1741b.put(f8, interfaceC1956b);
                    } else {
                        final D d8 = (D) ((InterfaceC1956b) this.f1741b.get(f8));
                        arrayList.add(new Runnable() { // from class: D0.m
                            @Override // java.lang.Runnable
                            public final void run() {
                                D.this.j(interfaceC1956b);
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
        for (Map.Entry entry : this.f1740a.entrySet()) {
            C1053c c1053c = (C1053c) entry.getKey();
            if (!c1053c.p()) {
                InterfaceC1956b interfaceC1956b = (InterfaceC1956b) entry.getValue();
                for (F f8 : c1053c.j()) {
                    if (!hashMap.containsKey(f8)) {
                        hashMap.put(f8, new HashSet());
                    }
                    ((Set) hashMap.get(f8)).add(interfaceC1956b);
                }
            }
        }
        for (Map.Entry entry2 : hashMap.entrySet()) {
            if (!this.f1742c.containsKey(entry2.getKey())) {
                this.f1742c.put((F) entry2.getKey(), y.b((Collection) entry2.getValue()));
            } else {
                final y yVar = (y) this.f1742c.get(entry2.getKey());
                for (final InterfaceC1956b interfaceC1956b2 : (Set) entry2.getValue()) {
                    arrayList.add(new Runnable() { // from class: D0.n
                        @Override // java.lang.Runnable
                        public final void run() {
                            y.this.a(interfaceC1956b2);
                        }
                    });
                }
            }
        }
        return arrayList;
    }

    @Override // D0.InterfaceC1055e
    public /* synthetic */ Object a(Class cls) {
        return AbstractC1054d.b(this, cls);
    }

    @Override // D0.InterfaceC1055e
    public /* synthetic */ Object b(F f8) {
        return AbstractC1054d.a(this, f8);
    }

    @Override // D0.InterfaceC1055e
    public /* synthetic */ InterfaceC1956b c(Class cls) {
        return AbstractC1054d.d(this, cls);
    }

    @Override // D0.InterfaceC1055e
    public InterfaceC1955a d(F f8) {
        InterfaceC1956b f9 = f(f8);
        if (f9 == null) {
            return D.e();
        }
        if (f9 instanceof D) {
            return (D) f9;
        }
        return D.i(f9);
    }

    @Override // D0.InterfaceC1055e
    public /* synthetic */ Set e(Class cls) {
        return AbstractC1054d.f(this, cls);
    }

    @Override // D0.InterfaceC1055e
    public synchronized InterfaceC1956b f(F f8) {
        E.c(f8, "Null interface requested.");
        return (InterfaceC1956b) this.f1741b.get(f8);
    }

    @Override // D0.InterfaceC1055e
    public synchronized InterfaceC1956b g(F f8) {
        y yVar = (y) this.f1742c.get(f8);
        if (yVar != null) {
            return yVar;
        }
        return f1739i;
    }

    @Override // D0.InterfaceC1055e
    public /* synthetic */ Set h(F f8) {
        return AbstractC1054d.e(this, f8);
    }

    @Override // D0.InterfaceC1055e
    public /* synthetic */ InterfaceC1955a i(Class cls) {
        return AbstractC1054d.c(this, cls);
    }

    public void p(boolean z8) {
        HashMap hashMap;
        if (!androidx.compose.animation.core.d.a(this.f1746g, null, Boolean.valueOf(z8))) {
            return;
        }
        synchronized (this) {
            hashMap = new HashMap(this.f1740a);
        }
        o(hashMap, z8);
    }

    private o(Executor executor, Iterable iterable, Collection collection, j jVar) {
        this.f1740a = new HashMap();
        this.f1741b = new HashMap();
        this.f1742c = new HashMap();
        this.f1744e = new HashSet();
        this.f1746g = new AtomicReference();
        v vVar = new v(executor);
        this.f1745f = vVar;
        this.f1747h = jVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(C1053c.s(vVar, v.class, Y0.d.class, Y0.c.class));
        arrayList.add(C1053c.s(this, T0.a.class, new Class[0]));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C1053c c1053c = (C1053c) it.next();
            if (c1053c != null) {
                arrayList.add(c1053c);
            }
        }
        this.f1743d = q(iterable);
        n(arrayList);
    }

    /* loaded from: classes3.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final Executor f1748a;

        /* renamed from: b, reason: collision with root package name */
        private final List f1749b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        private final List f1750c = new ArrayList();

        /* renamed from: d, reason: collision with root package name */
        private j f1751d = j.f1732a;

        b(Executor executor) {
            this.f1748a = executor;
        }

        public b b(C1053c c1053c) {
            this.f1750c.add(c1053c);
            return this;
        }

        public b c(final ComponentRegistrar componentRegistrar) {
            this.f1749b.add(new InterfaceC1956b() { // from class: D0.p
                @Override // b1.InterfaceC1956b
                public final Object get() {
                    ComponentRegistrar f8;
                    f8 = o.b.f(ComponentRegistrar.this);
                    return f8;
                }
            });
            return this;
        }

        public b d(Collection collection) {
            this.f1749b.addAll(collection);
            return this;
        }

        public o e() {
            return new o(this.f1748a, this.f1749b, this.f1750c, this.f1751d);
        }

        public b g(j jVar) {
            this.f1751d = jVar;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ ComponentRegistrar f(ComponentRegistrar componentRegistrar) {
            return componentRegistrar;
        }
    }
}
