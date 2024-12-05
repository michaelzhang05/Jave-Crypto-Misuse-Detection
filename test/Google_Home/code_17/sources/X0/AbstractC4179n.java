package x0;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;

/* renamed from: x0.n, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4179n extends AbstractCollection implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private static final Object[] f40635a = new Object[0];

    /* renamed from: x0.n$a */
    /* loaded from: classes3.dex */
    static abstract class a extends b {

        /* renamed from: a, reason: collision with root package name */
        Object[] f40636a;

        /* renamed from: b, reason: collision with root package name */
        int f40637b;

        /* renamed from: c, reason: collision with root package name */
        boolean f40638c;

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(int i8) {
            AbstractC4172g.b(i8, "initialCapacity");
            this.f40636a = new Object[i8];
            this.f40637b = 0;
        }

        private void d(int i8) {
            Object[] objArr = this.f40636a;
            if (objArr.length < i8) {
                this.f40636a = Arrays.copyOf(objArr, b.a(objArr.length, i8));
                this.f40638c = false;
            } else if (this.f40638c) {
                this.f40636a = (Object[]) objArr.clone();
                this.f40638c = false;
            }
        }

        public b b(Object... objArr) {
            c(objArr, objArr.length);
            return this;
        }

        final void c(Object[] objArr, int i8) {
            AbstractC4162F.c(objArr, i8);
            d(this.f40637b + i8);
            System.arraycopy(objArr, 0, this.f40636a, this.f40637b, i8);
            this.f40637b += i8;
        }
    }

    /* renamed from: x0.n$b */
    /* loaded from: classes3.dex */
    public static abstract class b {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static int a(int i8, int i9) {
            if (i9 >= 0) {
                int i10 = i8 + (i8 >> 1) + 1;
                if (i10 < i9) {
                    i10 = Integer.highestOneBit(i9 - 1) << 1;
                }
                if (i10 < 0) {
                    return Integer.MAX_VALUE;
                }
                return i10;
            }
            throw new AssertionError("cannot store more than MAX_VALUE elements");
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    abstract int c(Object[] objArr, int i8);

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public abstract boolean contains(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    public Object[] d() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int e() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int f() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract boolean j();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(f40635a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        w0.h.i(objArr);
        int size = size();
        if (objArr.length < size) {
            Object[] d8 = d();
            if (d8 != null) {
                return AbstractC4164H.a(d8, f(), e(), objArr);
            }
            objArr = AbstractC4162F.d(objArr, size);
        } else if (objArr.length > size) {
            objArr[size] = null;
        }
        c(objArr, 0);
        return objArr;
    }
}
