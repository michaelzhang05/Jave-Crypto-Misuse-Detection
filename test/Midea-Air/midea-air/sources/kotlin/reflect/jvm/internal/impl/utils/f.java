package kotlin.reflect.jvm.internal.impl.utils;

import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.collections.n;
import kotlin.collections.u0;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.markers.KMappedMarker;

/* compiled from: SmartSet.kt */
/* loaded from: classes2.dex */
public final class f<T> extends AbstractSet<T> {

    /* renamed from: f, reason: collision with root package name */
    public static final b f22019f = new b(null);

    /* renamed from: g, reason: collision with root package name */
    private Object f22020g;

    /* renamed from: h, reason: collision with root package name */
    private int f22021h;

    /* compiled from: SmartSet.kt */
    /* loaded from: classes2.dex */
    private static final class a<T> implements Iterator<T>, KMappedMarker {

        /* renamed from: f, reason: collision with root package name */
        private final Iterator<T> f22022f;

        public a(T[] tArr) {
            l.f(tArr, "array");
            this.f22022f = kotlin.jvm.internal.b.a(tArr);
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void remove() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f22022f.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            return this.f22022f.next();
        }
    }

    /* compiled from: SmartSet.kt */
    /* loaded from: classes2.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(g gVar) {
            this();
        }

        public final <T> f<T> a() {
            return new f<>(null);
        }

        public final <T> f<T> b(Collection<? extends T> collection) {
            l.f(collection, "set");
            f<T> fVar = new f<>(null);
            fVar.addAll(collection);
            return fVar;
        }
    }

    /* compiled from: SmartSet.kt */
    /* loaded from: classes2.dex */
    private static final class c<T> implements Iterator<T>, KMappedMarker {

        /* renamed from: f, reason: collision with root package name */
        private final T f22023f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f22024g = true;

        public c(T t) {
            this.f22023f = t;
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void remove() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f22024g;
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.f22024g) {
                this.f22024g = false;
                return this.f22023f;
            }
            throw new NoSuchElementException();
        }
    }

    private f() {
    }

    public /* synthetic */ f(g gVar) {
        this();
    }

    public static final <T> f<T> a() {
        return f22019f.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(T t) {
        boolean s;
        Object[] objArr;
        LinkedHashSet e2;
        if (size() == 0) {
            this.f22020g = t;
        } else if (size() == 1) {
            if (l.a(this.f22020g, t)) {
                return false;
            }
            this.f22020g = new Object[]{this.f22020g, t};
        } else if (size() < 5) {
            Object obj = this.f22020g;
            l.d(obj, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            Object[] objArr2 = (Object[]) obj;
            s = n.s(objArr2, t);
            if (s) {
                return false;
            }
            if (size() == 4) {
                e2 = u0.e(Arrays.copyOf(objArr2, objArr2.length));
                e2.add(t);
                objArr = e2;
            } else {
                Object[] copyOf = Arrays.copyOf(objArr2, size() + 1);
                l.e(copyOf, "copyOf(this, newSize)");
                copyOf[copyOf.length - 1] = t;
                objArr = copyOf;
            }
            this.f22020g = objArr;
        } else {
            Object obj2 = this.f22020g;
            l.d(obj2, "null cannot be cast to non-null type kotlin.collections.MutableSet<T of org.jetbrains.kotlin.utils.SmartSet>");
            if (!g0.d(obj2).add(t)) {
                return false;
            }
        }
        f(size() + 1);
        return true;
    }

    public int b() {
        return this.f22021h;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f22020g = null;
        f(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        boolean s;
        if (size() == 0) {
            return false;
        }
        if (size() == 1) {
            return l.a(this.f22020g, obj);
        }
        if (size() >= 5) {
            Object obj2 = this.f22020g;
            l.d(obj2, "null cannot be cast to non-null type kotlin.collections.Set<T of org.jetbrains.kotlin.utils.SmartSet>");
            return ((Set) obj2).contains(obj);
        }
        Object obj3 = this.f22020g;
        l.d(obj3, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
        s = n.s((Object[]) obj3, obj);
        return s;
    }

    public void f(int i2) {
        this.f22021h = i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<T> iterator() {
        if (size() == 0) {
            return Collections.emptySet().iterator();
        }
        if (size() == 1) {
            return new c(this.f22020g);
        }
        if (size() < 5) {
            Object obj = this.f22020g;
            l.d(obj, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            return new a((Object[]) obj);
        }
        Object obj2 = this.f22020g;
        l.d(obj2, "null cannot be cast to non-null type kotlin.collections.MutableSet<T of org.jetbrains.kotlin.utils.SmartSet>");
        return g0.d(obj2).iterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return b();
    }
}
