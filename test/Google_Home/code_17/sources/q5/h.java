package Q5;

import P5.AbstractC1367h;
import b6.InterfaceC1989e;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes5.dex */
public final class h extends AbstractC1367h implements Set, Serializable, InterfaceC1989e {

    /* renamed from: b, reason: collision with root package name */
    private static final a f9472b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    private static final h f9473c = new h(d.f9448n.e());

    /* renamed from: a, reason: collision with root package name */
    private final d f9474a;

    /* loaded from: classes5.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    public h(d backing) {
        AbstractC3255y.i(backing, "backing");
        this.f9474a = backing;
    }

    @Override // P5.AbstractC1367h, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        if (this.f9474a.j(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(Collection elements) {
        AbstractC3255y.i(elements, "elements");
        this.f9474a.n();
        return super.addAll(elements);
    }

    public final Set c() {
        this.f9474a.m();
        if (size() > 0) {
            return this;
        }
        return f9473c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f9474a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f9474a.containsKey(obj);
    }

    @Override // P5.AbstractC1367h
    public int getSize() {
        return this.f9474a.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f9474a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return this.f9474a.F();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        if (this.f9474a.P(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection elements) {
        AbstractC3255y.i(elements, "elements");
        this.f9474a.n();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection elements) {
        AbstractC3255y.i(elements, "elements");
        this.f9474a.n();
        return super.retainAll(elements);
    }

    public h() {
        this(new d());
    }

    public h(int i8) {
        this(new d(i8));
    }
}
