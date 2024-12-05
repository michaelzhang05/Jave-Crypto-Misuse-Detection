package androidx.lifecycle;

import androidx.lifecycle.h;
import i.b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public class n extends h {

    /* renamed from: j, reason: collision with root package name */
    public static final a f3096j = new a(null);

    /* renamed from: b, reason: collision with root package name */
    private final boolean f3097b;

    /* renamed from: c, reason: collision with root package name */
    private i.a f3098c;

    /* renamed from: d, reason: collision with root package name */
    private h.b f3099d;

    /* renamed from: e, reason: collision with root package name */
    private final WeakReference f3100e;

    /* renamed from: f, reason: collision with root package name */
    private int f3101f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f3102g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f3103h;

    /* renamed from: i, reason: collision with root package name */
    private ArrayList f3104i;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f5.f fVar) {
            this();
        }

        public final h.b a(h.b bVar, h.b bVar2) {
            f5.h.e(bVar, "state1");
            return (bVar2 == null || bVar2.compareTo(bVar) >= 0) ? bVar : bVar2;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private h.b f3105a;

        /* renamed from: b, reason: collision with root package name */
        private k f3106b;

        public b(l lVar, h.b bVar) {
            f5.h.e(bVar, "initialState");
            f5.h.b(lVar);
            this.f3106b = o.f(lVar);
            this.f3105a = bVar;
        }

        public final void a(m mVar, h.a aVar) {
            f5.h.e(aVar, "event");
            h.b b6 = aVar.b();
            this.f3105a = n.f3096j.a(this.f3105a, b6);
            k kVar = this.f3106b;
            f5.h.b(mVar);
            kVar.d(mVar, aVar);
            this.f3105a = b6;
        }

        public final h.b b() {
            return this.f3105a;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public n(m mVar) {
        this(mVar, true);
        f5.h.e(mVar, "provider");
    }

    private final void d(m mVar) {
        Iterator h6 = this.f3098c.h();
        f5.h.d(h6, "observerMap.descendingIterator()");
        while (h6.hasNext() && !this.f3103h) {
            Map.Entry entry = (Map.Entry) h6.next();
            f5.h.d(entry, "next()");
            l lVar = (l) entry.getKey();
            b bVar = (b) entry.getValue();
            while (bVar.b().compareTo(this.f3099d) > 0 && !this.f3103h && this.f3098c.contains(lVar)) {
                h.a a6 = h.a.Companion.a(bVar.b());
                if (a6 == null) {
                    throw new IllegalStateException("no event down from " + bVar.b());
                }
                m(a6.b());
                bVar.a(mVar, a6);
                l();
            }
        }
    }

    private final h.b e(l lVar) {
        b bVar;
        Map.Entry p6 = this.f3098c.p(lVar);
        h.b bVar2 = null;
        h.b b6 = (p6 == null || (bVar = (b) p6.getValue()) == null) ? null : bVar.b();
        if (!this.f3104i.isEmpty()) {
            bVar2 = (h.b) this.f3104i.get(r0.size() - 1);
        }
        a aVar = f3096j;
        return aVar.a(aVar.a(this.f3099d, b6), bVar2);
    }

    private final void f(String str) {
        if (!this.f3097b || h.c.f().b()) {
            return;
        }
        throw new IllegalStateException(("Method " + str + " must be called on the main thread").toString());
    }

    private final void g(m mVar) {
        b.d k6 = this.f3098c.k();
        f5.h.d(k6, "observerMap.iteratorWithAdditions()");
        while (k6.hasNext() && !this.f3103h) {
            Map.Entry entry = (Map.Entry) k6.next();
            l lVar = (l) entry.getKey();
            b bVar = (b) entry.getValue();
            while (bVar.b().compareTo(this.f3099d) < 0 && !this.f3103h && this.f3098c.contains(lVar)) {
                m(bVar.b());
                h.a b6 = h.a.Companion.b(bVar.b());
                if (b6 == null) {
                    throw new IllegalStateException("no event up from " + bVar.b());
                }
                bVar.a(mVar, b6);
                l();
            }
        }
    }

    private final boolean i() {
        if (this.f3098c.size() == 0) {
            return true;
        }
        Map.Entry i6 = this.f3098c.i();
        f5.h.b(i6);
        h.b b6 = ((b) i6.getValue()).b();
        Map.Entry l6 = this.f3098c.l();
        f5.h.b(l6);
        h.b b7 = ((b) l6.getValue()).b();
        return b6 == b7 && this.f3099d == b7;
    }

    private final void k(h.b bVar) {
        h.b bVar2 = this.f3099d;
        if (bVar2 == bVar) {
            return;
        }
        if (!((bVar2 == h.b.INITIALIZED && bVar == h.b.DESTROYED) ? false : true)) {
            throw new IllegalStateException(("no event down from " + this.f3099d + " in component " + this.f3100e.get()).toString());
        }
        this.f3099d = bVar;
        if (this.f3102g || this.f3101f != 0) {
            this.f3103h = true;
            return;
        }
        this.f3102g = true;
        o();
        this.f3102g = false;
        if (this.f3099d == h.b.DESTROYED) {
            this.f3098c = new i.a();
        }
    }

    private final void l() {
        this.f3104i.remove(r0.size() - 1);
    }

    private final void m(h.b bVar) {
        this.f3104i.add(bVar);
    }

    private final void o() {
        m mVar = (m) this.f3100e.get();
        if (mVar == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (true) {
            boolean i6 = i();
            this.f3103h = false;
            if (i6) {
                return;
            }
            h.b bVar = this.f3099d;
            Map.Entry i7 = this.f3098c.i();
            f5.h.b(i7);
            if (bVar.compareTo(((b) i7.getValue()).b()) < 0) {
                d(mVar);
            }
            Map.Entry l6 = this.f3098c.l();
            if (!this.f3103h && l6 != null && this.f3099d.compareTo(((b) l6.getValue()).b()) > 0) {
                g(mVar);
            }
        }
    }

    @Override // androidx.lifecycle.h
    public void a(l lVar) {
        m mVar;
        f5.h.e(lVar, "observer");
        f("addObserver");
        h.b bVar = this.f3099d;
        h.b bVar2 = h.b.DESTROYED;
        if (bVar != bVar2) {
            bVar2 = h.b.INITIALIZED;
        }
        b bVar3 = new b(lVar, bVar2);
        if (((b) this.f3098c.n(lVar, bVar3)) == null && (mVar = (m) this.f3100e.get()) != null) {
            boolean z5 = this.f3101f != 0 || this.f3102g;
            h.b e6 = e(lVar);
            this.f3101f++;
            while (bVar3.b().compareTo(e6) < 0 && this.f3098c.contains(lVar)) {
                m(bVar3.b());
                h.a b6 = h.a.Companion.b(bVar3.b());
                if (b6 == null) {
                    throw new IllegalStateException("no event up from " + bVar3.b());
                }
                bVar3.a(mVar, b6);
                l();
                e6 = e(lVar);
            }
            if (!z5) {
                o();
            }
            this.f3101f--;
        }
    }

    @Override // androidx.lifecycle.h
    public h.b b() {
        return this.f3099d;
    }

    @Override // androidx.lifecycle.h
    public void c(l lVar) {
        f5.h.e(lVar, "observer");
        f("removeObserver");
        this.f3098c.o(lVar);
    }

    public void h(h.a aVar) {
        f5.h.e(aVar, "event");
        f("handleLifecycleEvent");
        k(aVar.b());
    }

    public void j(h.b bVar) {
        f5.h.e(bVar, "state");
        f("markState");
        n(bVar);
    }

    public void n(h.b bVar) {
        f5.h.e(bVar, "state");
        f("setCurrentState");
        k(bVar);
    }

    private n(m mVar, boolean z5) {
        this.f3097b = z5;
        this.f3098c = new i.a();
        this.f3099d = h.b.INITIALIZED;
        this.f3104i = new ArrayList();
        this.f3100e = new WeakReference(mVar);
    }
}
