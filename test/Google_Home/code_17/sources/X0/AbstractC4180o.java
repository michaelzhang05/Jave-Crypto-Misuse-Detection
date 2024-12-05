package x0;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import x0.AbstractC4179n;

/* renamed from: x0.o, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4180o extends AbstractC4179n implements List, RandomAccess {

    /* renamed from: b, reason: collision with root package name */
    private static final T f40639b = new b(C4165I.f40566e, 0);

    /* renamed from: x0.o$a */
    /* loaded from: classes3.dex */
    public static final class a extends AbstractC4179n.a {
        public a() {
            this(4);
        }

        public a e(Object... objArr) {
            super.b(objArr);
            return this;
        }

        public AbstractC4180o f() {
            this.f40638c = true;
            return AbstractC4180o.m(this.f40636a, this.f40637b);
        }

        a(int i8) {
            super(i8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x0.o$b */
    /* loaded from: classes3.dex */
    public static class b extends AbstractC4166a {

        /* renamed from: c, reason: collision with root package name */
        private final AbstractC4180o f40640c;

        b(AbstractC4180o abstractC4180o, int i8) {
            super(abstractC4180o.size(), i8);
            this.f40640c = abstractC4180o;
        }

        @Override // x0.AbstractC4166a
        protected Object a(int i8) {
            return this.f40640c.get(i8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x0.o$c */
    /* loaded from: classes3.dex */
    public static class c extends AbstractC4180o {

        /* renamed from: c, reason: collision with root package name */
        private final transient AbstractC4180o f40641c;

        c(AbstractC4180o abstractC4180o) {
            this.f40641c = abstractC4180o;
        }

        private int D(int i8) {
            return (size() - 1) - i8;
        }

        private int E(int i8) {
            return size() - i8;
        }

        @Override // x0.AbstractC4180o, java.util.List
        /* renamed from: B, reason: merged with bridge method [inline-methods] */
        public AbstractC4180o subList(int i8, int i9) {
            w0.h.m(i8, i9, size());
            return this.f40641c.subList(E(i9), E(i8)).z();
        }

        @Override // x0.AbstractC4180o, x0.AbstractC4179n, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.f40641c.contains(obj);
        }

        @Override // java.util.List
        public Object get(int i8) {
            w0.h.g(i8, size());
            return this.f40641c.get(D(i8));
        }

        @Override // x0.AbstractC4180o, java.util.List
        public int indexOf(Object obj) {
            int lastIndexOf = this.f40641c.lastIndexOf(obj);
            if (lastIndexOf >= 0) {
                return D(lastIndexOf);
            }
            return -1;
        }

        @Override // x0.AbstractC4180o, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // x0.AbstractC4179n
        public boolean j() {
            return this.f40641c.j();
        }

        @Override // x0.AbstractC4180o, java.util.List
        public int lastIndexOf(Object obj) {
            int indexOf = this.f40641c.indexOf(obj);
            if (indexOf >= 0) {
                return D(indexOf);
            }
            return -1;
        }

        @Override // x0.AbstractC4180o, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return super.listIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f40641c.size();
        }

        @Override // x0.AbstractC4180o
        public AbstractC4180o z() {
            return this.f40641c;
        }

        @Override // x0.AbstractC4180o, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator(int i8) {
            return super.listIterator(i8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x0.o$d */
    /* loaded from: classes3.dex */
    public class d extends AbstractC4180o {

        /* renamed from: c, reason: collision with root package name */
        final transient int f40642c;

        /* renamed from: d, reason: collision with root package name */
        final transient int f40643d;

        d(int i8, int i9) {
            this.f40642c = i8;
            this.f40643d = i9;
        }

        @Override // x0.AbstractC4180o, java.util.List
        /* renamed from: B */
        public AbstractC4180o subList(int i8, int i9) {
            w0.h.m(i8, i9, this.f40643d);
            AbstractC4180o abstractC4180o = AbstractC4180o.this;
            int i10 = this.f40642c;
            return abstractC4180o.subList(i8 + i10, i9 + i10);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // x0.AbstractC4179n
        public Object[] d() {
            return AbstractC4180o.this.d();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // x0.AbstractC4179n
        public int e() {
            return AbstractC4180o.this.f() + this.f40642c + this.f40643d;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // x0.AbstractC4179n
        public int f() {
            return AbstractC4180o.this.f() + this.f40642c;
        }

        @Override // java.util.List
        public Object get(int i8) {
            w0.h.g(i8, this.f40643d);
            return AbstractC4180o.this.get(i8 + this.f40642c);
        }

        @Override // x0.AbstractC4180o, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // x0.AbstractC4179n
        public boolean j() {
            return true;
        }

        @Override // x0.AbstractC4180o, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return super.listIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f40643d;
        }

        @Override // x0.AbstractC4180o, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator(int i8) {
            return super.listIterator(i8);
        }
    }

    public static AbstractC4180o A(Comparator comparator, Iterable iterable) {
        w0.h.i(comparator);
        Object[] b8 = v.b(iterable);
        AbstractC4162F.b(b8);
        Arrays.sort(b8, comparator);
        return k(b8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static AbstractC4180o k(Object[] objArr) {
        return m(objArr, objArr.length);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static AbstractC4180o m(Object[] objArr, int i8) {
        if (i8 == 0) {
            return t();
        }
        return new C4165I(objArr, i8);
    }

    private static AbstractC4180o n(Object... objArr) {
        return k(AbstractC4162F.b(objArr));
    }

    public static AbstractC4180o t() {
        return C4165I.f40566e;
    }

    public static AbstractC4180o u(Object obj, Object obj2) {
        return n(obj, obj2);
    }

    public static AbstractC4180o v(Object obj, Object obj2, Object obj3) {
        return n(obj, obj2, obj3);
    }

    public static AbstractC4180o y(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        return n(obj, obj2, obj3, obj4, obj5, obj6, obj7);
    }

    @Override // java.util.List
    /* renamed from: B */
    public AbstractC4180o subList(int i8, int i9) {
        w0.h.m(i8, i9, size());
        int i10 = i9 - i8;
        if (i10 == size()) {
            return this;
        }
        if (i10 == 0) {
            return t();
        }
        return C(i8, i9);
    }

    AbstractC4180o C(int i8, int i9) {
        return new d(i8, i9 - i8);
    }

    @Override // java.util.List
    public final void add(int i8, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i8, Collection collection) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // x0.AbstractC4179n
    public int c(Object[] objArr, int i8) {
        int size = size();
        for (int i9 = 0; i9 < size; i9++) {
            objArr[i8 + i9] = get(i9);
        }
        return i8 + size;
    }

    @Override // x0.AbstractC4179n, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        if (indexOf(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        return x.a(this, obj);
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int i8 = 1;
        for (int i9 = 0; i9 < size; i9++) {
            i8 = ~(~((i8 * 31) + get(i9).hashCode()));
        }
        return i8;
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return x.b(this, obj);
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return x.d(this, obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public S iterator() {
        return listIterator();
    }

    @Override // java.util.List
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public T listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public T listIterator(int i8) {
        w0.h.k(i8, size());
        if (isEmpty()) {
            return f40639b;
        }
        return new b(this, i8);
    }

    @Override // java.util.List
    public final Object remove(int i8) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object set(int i8, Object obj) {
        throw new UnsupportedOperationException();
    }

    public AbstractC4180o z() {
        if (size() <= 1) {
            return this;
        }
        return new c(this);
    }
}
