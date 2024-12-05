package Q5;

import P5.AbstractC1362c;
import P5.AbstractC1371l;
import P5.N;
import b6.InterfaceC1985a;
import b6.InterfaceC1988d;
import g6.i;
import g6.m;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes5.dex */
public final class d implements Map, Serializable, InterfaceC1988d {

    /* renamed from: n, reason: collision with root package name */
    public static final a f9448n = new a(null);

    /* renamed from: o, reason: collision with root package name */
    private static final d f9449o;

    /* renamed from: a, reason: collision with root package name */
    private Object[] f9450a;

    /* renamed from: b, reason: collision with root package name */
    private Object[] f9451b;

    /* renamed from: c, reason: collision with root package name */
    private int[] f9452c;

    /* renamed from: d, reason: collision with root package name */
    private int[] f9453d;

    /* renamed from: e, reason: collision with root package name */
    private int f9454e;

    /* renamed from: f, reason: collision with root package name */
    private int f9455f;

    /* renamed from: g, reason: collision with root package name */
    private int f9456g;

    /* renamed from: h, reason: collision with root package name */
    private int f9457h;

    /* renamed from: i, reason: collision with root package name */
    private int f9458i;

    /* renamed from: j, reason: collision with root package name */
    private Q5.f f9459j;

    /* renamed from: k, reason: collision with root package name */
    private g f9460k;

    /* renamed from: l, reason: collision with root package name */
    private Q5.e f9461l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f9462m;

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int c(int i8) {
            return Integer.highestOneBit(m.d(i8, 1) * 3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int d(int i8) {
            return Integer.numberOfLeadingZeros(i8) + 1;
        }

        public final d e() {
            return d.f9449o;
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* loaded from: classes5.dex */
    public static final class b extends C0191d implements Iterator, InterfaceC1985a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(d map) {
            super(map);
            AbstractC3255y.i(map, "map");
        }

        @Override // java.util.Iterator
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public c next() {
            a();
            if (b() < e().f9455f) {
                int b8 = b();
                g(b8 + 1);
                h(b8);
                c cVar = new c(e(), c());
                f();
                return cVar;
            }
            throw new NoSuchElementException();
        }

        public final void j(StringBuilder sb) {
            AbstractC3255y.i(sb, "sb");
            if (b() < e().f9455f) {
                int b8 = b();
                g(b8 + 1);
                h(b8);
                Object obj = e().f9450a[c()];
                if (obj == e()) {
                    sb.append("(this Map)");
                } else {
                    sb.append(obj);
                }
                sb.append('=');
                Object[] objArr = e().f9451b;
                AbstractC3255y.f(objArr);
                Object obj2 = objArr[c()];
                if (obj2 == e()) {
                    sb.append("(this Map)");
                } else {
                    sb.append(obj2);
                }
                f();
                return;
            }
            throw new NoSuchElementException();
        }

        public final int k() {
            int i8;
            if (b() < e().f9455f) {
                int b8 = b();
                g(b8 + 1);
                h(b8);
                Object obj = e().f9450a[c()];
                int i9 = 0;
                if (obj != null) {
                    i8 = obj.hashCode();
                } else {
                    i8 = 0;
                }
                Object[] objArr = e().f9451b;
                AbstractC3255y.f(objArr);
                Object obj2 = objArr[c()];
                if (obj2 != null) {
                    i9 = obj2.hashCode();
                }
                int i10 = i8 ^ i9;
                f();
                return i10;
            }
            throw new NoSuchElementException();
        }
    }

    /* loaded from: classes5.dex */
    public static final class c implements Map.Entry, InterfaceC1988d.a {

        /* renamed from: a, reason: collision with root package name */
        private final d f9463a;

        /* renamed from: b, reason: collision with root package name */
        private final int f9464b;

        public c(d map, int i8) {
            AbstractC3255y.i(map, "map");
            this.f9463a = map;
            this.f9464b = i8;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                if (AbstractC3255y.d(entry.getKey(), getKey()) && AbstractC3255y.d(entry.getValue(), getValue())) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return this.f9463a.f9450a[this.f9464b];
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            Object[] objArr = this.f9463a.f9451b;
            AbstractC3255y.f(objArr);
            return objArr[this.f9464b];
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            int i8;
            Object key = getKey();
            int i9 = 0;
            if (key != null) {
                i8 = key.hashCode();
            } else {
                i8 = 0;
            }
            Object value = getValue();
            if (value != null) {
                i9 = value.hashCode();
            }
            return i8 ^ i9;
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            this.f9463a.n();
            Object[] k8 = this.f9463a.k();
            int i8 = this.f9464b;
            Object obj2 = k8[i8];
            k8[i8] = obj;
            return obj2;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getKey());
            sb.append('=');
            sb.append(getValue());
            return sb.toString();
        }
    }

    /* renamed from: Q5.d$d, reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static class C0191d {

        /* renamed from: a, reason: collision with root package name */
        private final d f9465a;

        /* renamed from: b, reason: collision with root package name */
        private int f9466b;

        /* renamed from: c, reason: collision with root package name */
        private int f9467c;

        /* renamed from: d, reason: collision with root package name */
        private int f9468d;

        public C0191d(d map) {
            AbstractC3255y.i(map, "map");
            this.f9465a = map;
            this.f9467c = -1;
            this.f9468d = map.f9457h;
            f();
        }

        public final void a() {
            if (this.f9465a.f9457h == this.f9468d) {
            } else {
                throw new ConcurrentModificationException();
            }
        }

        public final int b() {
            return this.f9466b;
        }

        public final int c() {
            return this.f9467c;
        }

        public final d e() {
            return this.f9465a;
        }

        public final void f() {
            while (this.f9466b < this.f9465a.f9455f) {
                int[] iArr = this.f9465a.f9452c;
                int i8 = this.f9466b;
                if (iArr[i8] < 0) {
                    this.f9466b = i8 + 1;
                } else {
                    return;
                }
            }
        }

        public final void g(int i8) {
            this.f9466b = i8;
        }

        public final void h(int i8) {
            this.f9467c = i8;
        }

        public final boolean hasNext() {
            if (this.f9466b < this.f9465a.f9455f) {
                return true;
            }
            return false;
        }

        public final void remove() {
            a();
            if (this.f9467c != -1) {
                this.f9465a.n();
                this.f9465a.Q(this.f9467c);
                this.f9467c = -1;
                this.f9468d = this.f9465a.f9457h;
                return;
            }
            throw new IllegalStateException("Call next() before removing element from the iterator.".toString());
        }
    }

    /* loaded from: classes5.dex */
    public static final class e extends C0191d implements Iterator, InterfaceC1985a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(d map) {
            super(map);
            AbstractC3255y.i(map, "map");
        }

        @Override // java.util.Iterator
        public Object next() {
            a();
            if (b() < e().f9455f) {
                int b8 = b();
                g(b8 + 1);
                h(b8);
                Object obj = e().f9450a[c()];
                f();
                return obj;
            }
            throw new NoSuchElementException();
        }
    }

    /* loaded from: classes5.dex */
    public static final class f extends C0191d implements Iterator, InterfaceC1985a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(d map) {
            super(map);
            AbstractC3255y.i(map, "map");
        }

        @Override // java.util.Iterator
        public Object next() {
            a();
            if (b() < e().f9455f) {
                int b8 = b();
                g(b8 + 1);
                h(b8);
                Object[] objArr = e().f9451b;
                AbstractC3255y.f(objArr);
                Object obj = objArr[c()];
                f();
                return obj;
            }
            throw new NoSuchElementException();
        }
    }

    static {
        d dVar = new d(0);
        dVar.f9462m = true;
        f9449o = dVar;
    }

    private d(Object[] objArr, Object[] objArr2, int[] iArr, int[] iArr2, int i8, int i9) {
        this.f9450a = objArr;
        this.f9451b = objArr2;
        this.f9452c = iArr;
        this.f9453d = iArr2;
        this.f9454e = i8;
        this.f9455f = i9;
        this.f9456g = f9448n.d(A());
    }

    private final int A() {
        return this.f9453d.length;
    }

    private final int E(Object obj) {
        int i8;
        if (obj != null) {
            i8 = obj.hashCode();
        } else {
            i8 = 0;
        }
        return (i8 * (-1640531527)) >>> this.f9456g;
    }

    private final boolean G(Collection collection) {
        boolean z8 = false;
        if (collection.isEmpty()) {
            return false;
        }
        u(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (I((Map.Entry) it.next())) {
                z8 = true;
            }
        }
        return z8;
    }

    private final boolean I(Map.Entry entry) {
        int j8 = j(entry.getKey());
        Object[] k8 = k();
        if (j8 >= 0) {
            k8[j8] = entry.getValue();
            return true;
        }
        int i8 = (-j8) - 1;
        if (!AbstractC3255y.d(entry.getValue(), k8[i8])) {
            k8[i8] = entry.getValue();
            return true;
        }
        return false;
    }

    private final boolean K(int i8) {
        int E8 = E(this.f9450a[i8]);
        int i9 = this.f9454e;
        while (true) {
            int[] iArr = this.f9453d;
            if (iArr[E8] == 0) {
                iArr[E8] = i8 + 1;
                this.f9452c[i8] = E8;
                return true;
            }
            i9--;
            if (i9 < 0) {
                return false;
            }
            int i10 = E8 - 1;
            if (E8 == 0) {
                E8 = A() - 1;
            } else {
                E8 = i10;
            }
        }
    }

    private final void L() {
        this.f9457h++;
    }

    private final void M(int i8) {
        L();
        if (this.f9455f > size()) {
            o();
        }
        int i9 = 0;
        if (i8 != A()) {
            this.f9453d = new int[i8];
            this.f9456g = f9448n.d(i8);
        } else {
            AbstractC1371l.r(this.f9453d, 0, 0, A());
        }
        while (i9 < this.f9455f) {
            int i10 = i9 + 1;
            if (K(i9)) {
                i9 = i10;
            } else {
                throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
            }
        }
    }

    private final void O(int i8) {
        int g8 = m.g(this.f9454e * 2, A() / 2);
        int i9 = 0;
        int i10 = i8;
        do {
            int i11 = i8 - 1;
            if (i8 == 0) {
                i8 = A() - 1;
            } else {
                i8 = i11;
            }
            i9++;
            if (i9 > this.f9454e) {
                this.f9453d[i10] = 0;
                return;
            }
            int[] iArr = this.f9453d;
            int i12 = iArr[i8];
            if (i12 == 0) {
                iArr[i10] = 0;
                return;
            }
            if (i12 < 0) {
                iArr[i10] = -1;
            } else {
                int i13 = i12 - 1;
                if (((E(this.f9450a[i13]) - i8) & (A() - 1)) >= i9) {
                    this.f9453d[i10] = i12;
                    this.f9452c[i13] = i10;
                }
                g8--;
            }
            i10 = i8;
            i9 = 0;
            g8--;
        } while (g8 >= 0);
        this.f9453d[i10] = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Q(int i8) {
        Q5.c.f(this.f9450a, i8);
        O(this.f9452c[i8]);
        this.f9452c[i8] = -1;
        this.f9458i = size() - 1;
        L();
    }

    private final boolean S(int i8) {
        int y8 = y();
        int i9 = this.f9455f;
        int i10 = y8 - i9;
        int size = i9 - size();
        if (i10 < i8 && i10 + size >= i8 && size >= y() / 4) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object[] k() {
        Object[] objArr = this.f9451b;
        if (objArr != null) {
            return objArr;
        }
        Object[] d8 = Q5.c.d(y());
        this.f9451b = d8;
        return d8;
    }

    private final void o() {
        int i8;
        Object[] objArr = this.f9451b;
        int i9 = 0;
        int i10 = 0;
        while (true) {
            i8 = this.f9455f;
            if (i9 >= i8) {
                break;
            }
            if (this.f9452c[i9] >= 0) {
                Object[] objArr2 = this.f9450a;
                objArr2[i10] = objArr2[i9];
                if (objArr != null) {
                    objArr[i10] = objArr[i9];
                }
                i10++;
            }
            i9++;
        }
        Q5.c.g(this.f9450a, i10, i8);
        if (objArr != null) {
            Q5.c.g(objArr, i10, this.f9455f);
        }
        this.f9455f = i10;
    }

    private final boolean s(Map map) {
        if (size() == map.size() && q(map.entrySet())) {
            return true;
        }
        return false;
    }

    private final void t(int i8) {
        Object[] objArr;
        if (i8 >= 0) {
            if (i8 > y()) {
                int e8 = AbstractC1362c.Companion.e(y(), i8);
                this.f9450a = Q5.c.e(this.f9450a, e8);
                Object[] objArr2 = this.f9451b;
                if (objArr2 != null) {
                    objArr = Q5.c.e(objArr2, e8);
                } else {
                    objArr = null;
                }
                this.f9451b = objArr;
                int[] copyOf = Arrays.copyOf(this.f9452c, e8);
                AbstractC3255y.h(copyOf, "copyOf(...)");
                this.f9452c = copyOf;
                int c8 = f9448n.c(e8);
                if (c8 > A()) {
                    M(c8);
                    return;
                }
                return;
            }
            return;
        }
        throw new OutOfMemoryError();
    }

    private final void u(int i8) {
        if (S(i8)) {
            M(A());
        } else {
            t(this.f9455f + i8);
        }
    }

    private final int w(Object obj) {
        int E8 = E(obj);
        int i8 = this.f9454e;
        while (true) {
            int i9 = this.f9453d[E8];
            if (i9 == 0) {
                return -1;
            }
            if (i9 > 0) {
                int i10 = i9 - 1;
                if (AbstractC3255y.d(this.f9450a[i10], obj)) {
                    return i10;
                }
            }
            i8--;
            if (i8 < 0) {
                return -1;
            }
            int i11 = E8 - 1;
            if (E8 == 0) {
                E8 = A() - 1;
            } else {
                E8 = i11;
            }
        }
    }

    private final int x(Object obj) {
        int i8 = this.f9455f;
        while (true) {
            i8--;
            if (i8 < 0) {
                return -1;
            }
            if (this.f9452c[i8] >= 0) {
                Object[] objArr = this.f9451b;
                AbstractC3255y.f(objArr);
                if (AbstractC3255y.d(objArr[i8], obj)) {
                    return i8;
                }
            }
        }
    }

    public Set B() {
        Q5.f fVar = this.f9459j;
        if (fVar == null) {
            Q5.f fVar2 = new Q5.f(this);
            this.f9459j = fVar2;
            return fVar2;
        }
        return fVar;
    }

    public int C() {
        return this.f9458i;
    }

    public Collection D() {
        g gVar = this.f9460k;
        if (gVar == null) {
            g gVar2 = new g(this);
            this.f9460k = gVar2;
            return gVar2;
        }
        return gVar;
    }

    public final e F() {
        return new e(this);
    }

    public final boolean N(Map.Entry entry) {
        AbstractC3255y.i(entry, "entry");
        n();
        int w8 = w(entry.getKey());
        if (w8 < 0) {
            return false;
        }
        Object[] objArr = this.f9451b;
        AbstractC3255y.f(objArr);
        if (!AbstractC3255y.d(objArr[w8], entry.getValue())) {
            return false;
        }
        Q(w8);
        return true;
    }

    public final int P(Object obj) {
        n();
        int w8 = w(obj);
        if (w8 < 0) {
            return -1;
        }
        Q(w8);
        return w8;
    }

    public final boolean R(Object obj) {
        n();
        int x8 = x(obj);
        if (x8 < 0) {
            return false;
        }
        Q(x8);
        return true;
    }

    public final f T() {
        return new f(this);
    }

    @Override // java.util.Map
    public void clear() {
        n();
        N it = new i(0, this.f9455f - 1).iterator();
        while (it.hasNext()) {
            int nextInt = it.nextInt();
            int[] iArr = this.f9452c;
            int i8 = iArr[nextInt];
            if (i8 >= 0) {
                this.f9453d[i8] = 0;
                iArr[nextInt] = -1;
            }
        }
        Q5.c.g(this.f9450a, 0, this.f9455f);
        Object[] objArr = this.f9451b;
        if (objArr != null) {
            Q5.c.g(objArr, 0, this.f9455f);
        }
        this.f9458i = 0;
        this.f9455f = 0;
        L();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        if (w(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        if (x(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ Set entrySet() {
        return z();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        if (obj != this && (!(obj instanceof Map) || !s((Map) obj))) {
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        int w8 = w(obj);
        if (w8 < 0) {
            return null;
        }
        Object[] objArr = this.f9451b;
        AbstractC3255y.f(objArr);
        return objArr[w8];
    }

    @Override // java.util.Map
    public int hashCode() {
        b v8 = v();
        int i8 = 0;
        while (v8.hasNext()) {
            i8 += v8.k();
        }
        return i8;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    public final int j(Object obj) {
        n();
        while (true) {
            int E8 = E(obj);
            int g8 = m.g(this.f9454e * 2, A() / 2);
            int i8 = 0;
            while (true) {
                int i9 = this.f9453d[E8];
                if (i9 <= 0) {
                    if (this.f9455f >= y()) {
                        u(1);
                    } else {
                        int i10 = this.f9455f;
                        int i11 = i10 + 1;
                        this.f9455f = i11;
                        this.f9450a[i10] = obj;
                        this.f9452c[i10] = E8;
                        this.f9453d[E8] = i11;
                        this.f9458i = size() + 1;
                        L();
                        if (i8 > this.f9454e) {
                            this.f9454e = i8;
                        }
                        return i10;
                    }
                } else {
                    if (AbstractC3255y.d(this.f9450a[i9 - 1], obj)) {
                        return -i9;
                    }
                    i8++;
                    if (i8 > g8) {
                        M(A() * 2);
                        break;
                    }
                    int i12 = E8 - 1;
                    if (E8 == 0) {
                        E8 = A() - 1;
                    } else {
                        E8 = i12;
                    }
                }
            }
        }
    }

    @Override // java.util.Map
    public final /* bridge */ Set keySet() {
        return B();
    }

    public final Map m() {
        n();
        this.f9462m = true;
        if (size() > 0) {
            return this;
        }
        d dVar = f9449o;
        AbstractC3255y.g(dVar, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        return dVar;
    }

    public final void n() {
        if (!this.f9462m) {
        } else {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public Object put(Object obj, Object obj2) {
        n();
        int j8 = j(obj);
        Object[] k8 = k();
        if (j8 < 0) {
            int i8 = (-j8) - 1;
            Object obj3 = k8[i8];
            k8[i8] = obj2;
            return obj3;
        }
        k8[j8] = obj2;
        return null;
    }

    @Override // java.util.Map
    public void putAll(Map from) {
        AbstractC3255y.i(from, "from");
        n();
        G(from.entrySet());
    }

    public final boolean q(Collection m8) {
        AbstractC3255y.i(m8, "m");
        for (Object obj : m8) {
            if (obj != null) {
                try {
                    if (!r((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    public final boolean r(Map.Entry entry) {
        AbstractC3255y.i(entry, "entry");
        int w8 = w(entry.getKey());
        if (w8 < 0) {
            return false;
        }
        Object[] objArr = this.f9451b;
        AbstractC3255y.f(objArr);
        return AbstractC3255y.d(objArr[w8], entry.getValue());
    }

    @Override // java.util.Map
    public Object remove(Object obj) {
        int P8 = P(obj);
        if (P8 < 0) {
            return null;
        }
        Object[] objArr = this.f9451b;
        AbstractC3255y.f(objArr);
        Object obj2 = objArr[P8];
        Q5.c.f(objArr, P8);
        return obj2;
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return C();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder((size() * 3) + 2);
        sb.append("{");
        b v8 = v();
        int i8 = 0;
        while (v8.hasNext()) {
            if (i8 > 0) {
                sb.append(", ");
            }
            v8.j(sb);
            i8++;
        }
        sb.append("}");
        String sb2 = sb.toString();
        AbstractC3255y.h(sb2, "toString(...)");
        return sb2;
    }

    public final b v() {
        return new b(this);
    }

    @Override // java.util.Map
    public final /* bridge */ Collection values() {
        return D();
    }

    public final int y() {
        return this.f9450a.length;
    }

    public Set z() {
        Q5.e eVar = this.f9461l;
        if (eVar == null) {
            Q5.e eVar2 = new Q5.e(this);
            this.f9461l = eVar2;
            return eVar2;
        }
        return eVar;
    }

    public d() {
        this(8);
    }

    public d(int i8) {
        this(Q5.c.d(i8), null, new int[i8], new int[f9448n.c(i8)], 2, 0);
    }
}
