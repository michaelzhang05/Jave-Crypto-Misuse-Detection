package x0;

import j$.util.Objects;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import w0.AbstractC4123f;
import y0.AbstractC4195a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: x0.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4174i extends AbstractMap implements Serializable {

    /* renamed from: j, reason: collision with root package name */
    private static final Object f40610j = new Object();

    /* renamed from: a, reason: collision with root package name */
    private transient Object f40611a;

    /* renamed from: b, reason: collision with root package name */
    transient int[] f40612b;

    /* renamed from: c, reason: collision with root package name */
    transient Object[] f40613c;

    /* renamed from: d, reason: collision with root package name */
    transient Object[] f40614d;

    /* renamed from: e, reason: collision with root package name */
    private transient int f40615e;

    /* renamed from: f, reason: collision with root package name */
    private transient int f40616f;

    /* renamed from: g, reason: collision with root package name */
    private transient Set f40617g;

    /* renamed from: h, reason: collision with root package name */
    private transient Set f40618h;

    /* renamed from: i, reason: collision with root package name */
    private transient Collection f40619i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x0.i$a */
    /* loaded from: classes3.dex */
    public class a extends e {
        a() {
            super(C4174i.this, null);
        }

        @Override // x0.C4174i.e
        Object b(int i8) {
            return C4174i.this.L(i8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x0.i$b */
    /* loaded from: classes3.dex */
    public class b extends e {
        b() {
            super(C4174i.this, null);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // x0.C4174i.e
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Map.Entry b(int i8) {
            return new g(i8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x0.i$c */
    /* loaded from: classes3.dex */
    public class c extends e {
        c() {
            super(C4174i.this, null);
        }

        @Override // x0.C4174i.e
        Object b(int i8) {
            return C4174i.this.c0(i8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x0.i$d */
    /* loaded from: classes3.dex */
    public class d extends AbstractSet {
        d() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            C4174i.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map z8 = C4174i.this.z();
            if (z8 != null) {
                return z8.entrySet().contains(obj);
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int G8 = C4174i.this.G(entry.getKey());
            if (G8 == -1 || !AbstractC4123f.a(C4174i.this.c0(G8), entry.getValue())) {
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return C4174i.this.B();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map z8 = C4174i.this.z();
            if (z8 != null) {
                return z8.entrySet().remove(obj);
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (!C4174i.this.O()) {
                int E8 = C4174i.this.E();
                int f8 = AbstractC4175j.f(entry.getKey(), entry.getValue(), E8, C4174i.this.S(), C4174i.this.Q(), C4174i.this.R(), C4174i.this.T());
                if (f8 == -1) {
                    return false;
                }
                C4174i.this.N(f8, E8);
                C4174i.f(C4174i.this);
                C4174i.this.F();
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return C4174i.this.size();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x0.i$f */
    /* loaded from: classes3.dex */
    public class f extends AbstractSet {
        f() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            C4174i.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return C4174i.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return C4174i.this.M();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map z8 = C4174i.this.z();
            if (z8 != null) {
                return z8.keySet().remove(obj);
            }
            if (C4174i.this.P(obj) != C4174i.f40610j) {
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return C4174i.this.size();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x0.i$g */
    /* loaded from: classes3.dex */
    public final class g extends AbstractC4168c {

        /* renamed from: a, reason: collision with root package name */
        private final Object f40629a;

        /* renamed from: b, reason: collision with root package name */
        private int f40630b;

        g(int i8) {
            this.f40629a = C4174i.this.L(i8);
            this.f40630b = i8;
        }

        private void a() {
            int i8 = this.f40630b;
            if (i8 == -1 || i8 >= C4174i.this.size() || !AbstractC4123f.a(this.f40629a, C4174i.this.L(this.f40630b))) {
                this.f40630b = C4174i.this.G(this.f40629a);
            }
        }

        @Override // x0.AbstractC4168c, java.util.Map.Entry
        public Object getKey() {
            return this.f40629a;
        }

        @Override // x0.AbstractC4168c, java.util.Map.Entry
        public Object getValue() {
            Map z8 = C4174i.this.z();
            if (z8 != null) {
                return AbstractC4161E.a(z8.get(this.f40629a));
            }
            a();
            int i8 = this.f40630b;
            if (i8 != -1) {
                return C4174i.this.c0(i8);
            }
            return AbstractC4161E.b();
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            Map z8 = C4174i.this.z();
            if (z8 != null) {
                return AbstractC4161E.a(z8.put(this.f40629a, obj));
            }
            a();
            int i8 = this.f40630b;
            if (i8 != -1) {
                Object c02 = C4174i.this.c0(i8);
                C4174i.this.b0(this.f40630b, obj);
                return c02;
            }
            C4174i.this.put(this.f40629a, obj);
            return AbstractC4161E.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x0.i$h */
    /* loaded from: classes3.dex */
    public class h extends AbstractCollection {
        h() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            C4174i.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return C4174i.this.d0();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return C4174i.this.size();
        }
    }

    C4174i() {
        I(3);
    }

    private int A(int i8) {
        return Q()[i8];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int E() {
        return (1 << (this.f40615e & 31)) - 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int G(Object obj) {
        if (O()) {
            return -1;
        }
        int c8 = AbstractC4178m.c(obj);
        int E8 = E();
        int h8 = AbstractC4175j.h(S(), c8 & E8);
        if (h8 == 0) {
            return -1;
        }
        int b8 = AbstractC4175j.b(c8, E8);
        do {
            int i8 = h8 - 1;
            int A8 = A(i8);
            if (AbstractC4175j.b(A8, E8) == b8 && AbstractC4123f.a(obj, L(i8))) {
                return i8;
            }
            h8 = AbstractC4175j.c(A8, E8);
        } while (h8 != 0);
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object L(int i8) {
        return R()[i8];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object P(Object obj) {
        if (O()) {
            return f40610j;
        }
        int E8 = E();
        int f8 = AbstractC4175j.f(obj, null, E8, S(), Q(), R(), null);
        if (f8 == -1) {
            return f40610j;
        }
        Object c02 = c0(f8);
        N(f8, E8);
        this.f40616f--;
        F();
        return c02;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int[] Q() {
        int[] iArr = this.f40612b;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object[] R() {
        Object[] objArr = this.f40613c;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object S() {
        Object obj = this.f40611a;
        Objects.requireNonNull(obj);
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object[] T() {
        Object[] objArr = this.f40614d;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    private void W(int i8) {
        int min;
        int length = Q().length;
        if (i8 > length && (min = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            V(min);
        }
    }

    private int X(int i8, int i9, int i10, int i11) {
        Object a8 = AbstractC4175j.a(i9);
        int i12 = i9 - 1;
        if (i11 != 0) {
            AbstractC4175j.i(a8, i10 & i12, i11 + 1);
        }
        Object S8 = S();
        int[] Q8 = Q();
        for (int i13 = 0; i13 <= i8; i13++) {
            int h8 = AbstractC4175j.h(S8, i13);
            while (h8 != 0) {
                int i14 = h8 - 1;
                int i15 = Q8[i14];
                int b8 = AbstractC4175j.b(i15, i8) | i13;
                int i16 = b8 & i12;
                int h9 = AbstractC4175j.h(a8, i16);
                AbstractC4175j.i(a8, i16, h8);
                Q8[i14] = AbstractC4175j.d(b8, h9, i12);
                h8 = AbstractC4175j.c(i15, i8);
            }
        }
        this.f40611a = a8;
        Z(i12);
        return i12;
    }

    private void Y(int i8, int i9) {
        Q()[i8] = i9;
    }

    private void Z(int i8) {
        this.f40615e = AbstractC4175j.d(this.f40615e, 32 - Integer.numberOfLeadingZeros(i8), 31);
    }

    private void a0(int i8, Object obj) {
        R()[i8] = obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b0(int i8, Object obj) {
        T()[i8] = obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object c0(int i8) {
        return T()[i8];
    }

    static /* synthetic */ int f(C4174i c4174i) {
        int i8 = c4174i.f40616f;
        c4174i.f40616f = i8 - 1;
        return i8;
    }

    public static C4174i u() {
        return new C4174i();
    }

    Iterator B() {
        Map z8 = z();
        if (z8 != null) {
            return z8.entrySet().iterator();
        }
        return new b();
    }

    int C() {
        if (isEmpty()) {
            return -1;
        }
        return 0;
    }

    int D(int i8) {
        int i9 = i8 + 1;
        if (i9 >= this.f40616f) {
            return -1;
        }
        return i9;
    }

    void F() {
        this.f40615e += 32;
    }

    void I(int i8) {
        boolean z8;
        if (i8 >= 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        w0.h.e(z8, "Expected size must be >= 0");
        this.f40615e = AbstractC4195a.a(i8, 1, 1073741823);
    }

    void K(int i8, Object obj, Object obj2, int i9, int i10) {
        Y(i8, AbstractC4175j.d(i9, 0, i10));
        a0(i8, obj);
        b0(i8, obj2);
    }

    Iterator M() {
        Map z8 = z();
        if (z8 != null) {
            return z8.keySet().iterator();
        }
        return new a();
    }

    void N(int i8, int i9) {
        Object S8 = S();
        int[] Q8 = Q();
        Object[] R8 = R();
        Object[] T8 = T();
        int size = size();
        int i10 = size - 1;
        if (i8 < i10) {
            Object obj = R8[i10];
            R8[i8] = obj;
            T8[i8] = T8[i10];
            R8[i10] = null;
            T8[i10] = null;
            Q8[i8] = Q8[i10];
            Q8[i10] = 0;
            int c8 = AbstractC4178m.c(obj) & i9;
            int h8 = AbstractC4175j.h(S8, c8);
            if (h8 == size) {
                AbstractC4175j.i(S8, c8, i8 + 1);
                return;
            }
            while (true) {
                int i11 = h8 - 1;
                int i12 = Q8[i11];
                int c9 = AbstractC4175j.c(i12, i9);
                if (c9 == size) {
                    Q8[i11] = AbstractC4175j.d(i12, i8 + 1, i9);
                    return;
                }
                h8 = c9;
            }
        } else {
            R8[i8] = null;
            T8[i8] = null;
            Q8[i8] = 0;
        }
    }

    boolean O() {
        if (this.f40611a == null) {
            return true;
        }
        return false;
    }

    void V(int i8) {
        this.f40612b = Arrays.copyOf(Q(), i8);
        this.f40613c = Arrays.copyOf(R(), i8);
        this.f40614d = Arrays.copyOf(T(), i8);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        if (O()) {
            return;
        }
        F();
        Map z8 = z();
        if (z8 != null) {
            this.f40615e = AbstractC4195a.a(size(), 3, 1073741823);
            z8.clear();
            this.f40611a = null;
            this.f40616f = 0;
            return;
        }
        Arrays.fill(R(), 0, this.f40616f, (Object) null);
        Arrays.fill(T(), 0, this.f40616f, (Object) null);
        AbstractC4175j.g(S());
        Arrays.fill(Q(), 0, this.f40616f, 0);
        this.f40616f = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Map z8 = z();
        if (z8 != null) {
            return z8.containsKey(obj);
        }
        if (G(obj) != -1) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(Object obj) {
        Map z8 = z();
        if (z8 != null) {
            return z8.containsValue(obj);
        }
        for (int i8 = 0; i8 < this.f40616f; i8++) {
            if (AbstractC4123f.a(obj, c0(i8))) {
                return true;
            }
        }
        return false;
    }

    Iterator d0() {
        Map z8 = z();
        if (z8 != null) {
            return z8.values().iterator();
        }
        return new c();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        Set set = this.f40618h;
        if (set == null) {
            Set v8 = v();
            this.f40618h = v8;
            return v8;
        }
        return set;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        Map z8 = z();
        if (z8 != null) {
            return z8.get(obj);
        }
        int G8 = G(obj);
        if (G8 == -1) {
            return null;
        }
        q(G8);
        return c0(G8);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        Set set = this.f40617g;
        if (set == null) {
            Set x8 = x();
            this.f40617g = x8;
            return x8;
        }
        return set;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        int X7;
        int i8;
        if (O()) {
            s();
        }
        Map z8 = z();
        if (z8 != null) {
            return z8.put(obj, obj2);
        }
        int[] Q8 = Q();
        Object[] R8 = R();
        Object[] T8 = T();
        int i9 = this.f40616f;
        int i10 = i9 + 1;
        int c8 = AbstractC4178m.c(obj);
        int E8 = E();
        int i11 = c8 & E8;
        int h8 = AbstractC4175j.h(S(), i11);
        if (h8 == 0) {
            if (i10 > E8) {
                X7 = X(E8, AbstractC4175j.e(E8), c8, i9);
                i8 = X7;
            } else {
                AbstractC4175j.i(S(), i11, i10);
                i8 = E8;
            }
        } else {
            int b8 = AbstractC4175j.b(c8, E8);
            int i12 = 0;
            while (true) {
                int i13 = h8 - 1;
                int i14 = Q8[i13];
                if (AbstractC4175j.b(i14, E8) == b8 && AbstractC4123f.a(obj, R8[i13])) {
                    Object obj3 = T8[i13];
                    T8[i13] = obj2;
                    q(i13);
                    return obj3;
                }
                int c9 = AbstractC4175j.c(i14, E8);
                i12++;
                if (c9 == 0) {
                    if (i12 >= 9) {
                        return t().put(obj, obj2);
                    }
                    if (i10 > E8) {
                        X7 = X(E8, AbstractC4175j.e(E8), c8, i9);
                    } else {
                        Q8[i13] = AbstractC4175j.d(i14, i10, E8);
                    }
                } else {
                    h8 = c9;
                }
            }
        }
        W(i10);
        K(i9, obj, obj2, c8, i8);
        this.f40616f = i10;
        F();
        return null;
    }

    int r(int i8, int i9) {
        return i8 - 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        Map z8 = z();
        if (z8 != null) {
            return z8.remove(obj);
        }
        Object P8 = P(obj);
        if (P8 == f40610j) {
            return null;
        }
        return P8;
    }

    int s() {
        w0.h.o(O(), "Arrays already allocated");
        int i8 = this.f40615e;
        int j8 = AbstractC4175j.j(i8);
        this.f40611a = AbstractC4175j.a(j8);
        Z(j8 - 1);
        this.f40612b = new int[i8];
        this.f40613c = new Object[i8];
        this.f40614d = new Object[i8];
        return i8;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        Map z8 = z();
        if (z8 != null) {
            return z8.size();
        }
        return this.f40616f;
    }

    Map t() {
        Map w8 = w(E() + 1);
        int C8 = C();
        while (C8 >= 0) {
            w8.put(L(C8), c0(C8));
            C8 = D(C8);
        }
        this.f40611a = w8;
        this.f40612b = null;
        this.f40613c = null;
        this.f40614d = null;
        F();
        return w8;
    }

    Set v() {
        return new d();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection values() {
        Collection collection = this.f40619i;
        if (collection == null) {
            Collection y8 = y();
            this.f40619i = y8;
            return y8;
        }
        return collection;
    }

    Map w(int i8) {
        return new LinkedHashMap(i8, 1.0f);
    }

    Set x() {
        return new f();
    }

    Collection y() {
        return new h();
    }

    Map z() {
        Object obj = this.f40611a;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    /* renamed from: x0.i$e */
    /* loaded from: classes3.dex */
    private abstract class e implements Iterator {

        /* renamed from: a, reason: collision with root package name */
        int f40624a;

        /* renamed from: b, reason: collision with root package name */
        int f40625b;

        /* renamed from: c, reason: collision with root package name */
        int f40626c;

        private e() {
            this.f40624a = C4174i.this.f40615e;
            this.f40625b = C4174i.this.C();
            this.f40626c = -1;
        }

        private void a() {
            if (C4174i.this.f40615e == this.f40624a) {
            } else {
                throw new ConcurrentModificationException();
            }
        }

        abstract Object b(int i8);

        void c() {
            this.f40624a += 32;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f40625b >= 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public Object next() {
            a();
            if (hasNext()) {
                int i8 = this.f40625b;
                this.f40626c = i8;
                Object b8 = b(i8);
                this.f40625b = C4174i.this.D(this.f40625b);
                return b8;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            boolean z8;
            a();
            if (this.f40626c >= 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            AbstractC4172g.c(z8);
            c();
            C4174i c4174i = C4174i.this;
            c4174i.remove(c4174i.L(this.f40626c));
            this.f40625b = C4174i.this.r(this.f40625b, this.f40626c);
            this.f40626c = -1;
        }

        /* synthetic */ e(C4174i c4174i, a aVar) {
            this();
        }
    }

    void q(int i8) {
    }
}
