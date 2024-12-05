package N5;

import M5.AbstractC1235h;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes5.dex */
public final class h extends AbstractC1235h implements Set, Serializable, Y5.e {

    /* renamed from: b, reason: collision with root package name */
    private static final a f7512b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    private static final h f7513c = new h(d.f7488n.e());

    /* renamed from: a, reason: collision with root package name */
    private final d f7514a;

    /* loaded from: classes5.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    public h(d backing) {
        AbstractC3159y.i(backing, "backing");
        this.f7514a = backing;
    }

    public final Set a() {
        this.f7514a.m();
        if (size() > 0) {
            return this;
        }
        return f7513c;
    }

    @Override // M5.AbstractC1235h, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        if (this.f7514a.k(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(Collection elements) {
        AbstractC3159y.i(elements, "elements");
        this.f7514a.n();
        return super.addAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f7514a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f7514a.containsKey(obj);
    }

    @Override // M5.AbstractC1235h
    public int getSize() {
        return this.f7514a.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f7514a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return this.f7514a.H();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        if (this.f7514a.P(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection elements) {
        AbstractC3159y.i(elements, "elements");
        this.f7514a.n();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection elements) {
        AbstractC3159y.i(elements, "elements");
        this.f7514a.n();
        return super.retainAll(elements);
    }

    public h() {
        this(new d());
    }

    public h(int i8) {
        this(new d(i8));
    }
}
