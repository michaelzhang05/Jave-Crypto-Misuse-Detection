package kotlin.reflect.jvm.internal.impl.utils;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* compiled from: SmartList.java */
/* loaded from: classes2.dex */
public class e<E> extends AbstractList<E> implements RandomAccess {

    /* renamed from: f, reason: collision with root package name */
    private int f22013f;

    /* renamed from: g, reason: collision with root package name */
    private Object f22014g;

    /* compiled from: SmartList.java */
    /* loaded from: classes2.dex */
    private static class b<T> implements Iterator<T> {

        /* renamed from: f, reason: collision with root package name */
        private static final b f22015f = new b();

        private b() {
        }

        public static <T> b<T> a() {
            return f22015f;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public T next() {
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new IllegalStateException();
        }
    }

    /* compiled from: SmartList.java */
    /* loaded from: classes2.dex */
    private class c extends d<E> {

        /* renamed from: g, reason: collision with root package name */
        private final int f22016g;

        public c() {
            super();
            this.f22016g = ((AbstractList) e.this).modCount;
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.e.d
        protected void a() {
            if (((AbstractList) e.this).modCount == this.f22016g) {
                return;
            }
            throw new ConcurrentModificationException("ModCount: " + ((AbstractList) e.this).modCount + "; expected: " + this.f22016g);
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.e.d
        protected E c() {
            return (E) e.this.f22014g;
        }

        @Override // java.util.Iterator
        public void remove() {
            a();
            e.this.clear();
        }
    }

    /* compiled from: SmartList.java */
    /* loaded from: classes2.dex */
    private static abstract class d<T> implements Iterator<T> {

        /* renamed from: f, reason: collision with root package name */
        private boolean f22018f;

        private d() {
        }

        protected abstract void a();

        protected abstract T c();

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return !this.f22018f;
        }

        @Override // java.util.Iterator
        public final T next() {
            if (!this.f22018f) {
                this.f22018f = true;
                a();
                return c();
            }
            throw new NoSuchElementException();
        }
    }

    private static /* synthetic */ void a(int i2) {
        String str = (i2 == 2 || i2 == 3 || i2 == 5 || i2 == 6 || i2 == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i2 == 2 || i2 == 3 || i2 == 5 || i2 == 6 || i2 == 7) ? 2 : 3];
        switch (i2) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
                break;
            case 4:
                objArr[0] = "a";
                break;
            default:
                objArr[0] = "elements";
                break;
        }
        if (i2 == 2 || i2 == 3) {
            objArr[1] = "iterator";
        } else if (i2 == 5 || i2 == 6 || i2 == 7) {
            objArr[1] = "toArray";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
        }
        switch (i2) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
                break;
            case 4:
                objArr[2] = "toArray";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i2 != 2 && i2 != 3 && i2 != 5 && i2 != 6 && i2 != 7) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e2) {
        int i2 = this.f22013f;
        if (i2 == 0) {
            this.f22014g = e2;
        } else if (i2 == 1) {
            this.f22014g = new Object[]{this.f22014g, e2};
        } else {
            Object[] objArr = (Object[]) this.f22014g;
            int length = objArr.length;
            if (i2 >= length) {
                int i3 = ((length * 3) / 2) + 1;
                int i4 = i2 + 1;
                if (i3 < i4) {
                    i3 = i4;
                }
                Object[] objArr2 = new Object[i3];
                this.f22014g = objArr2;
                System.arraycopy(objArr, 0, objArr2, 0, length);
                objArr = objArr2;
            }
            objArr[this.f22013f] = e2;
        }
        this.f22013f++;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.f22014g = null;
        this.f22013f = 0;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i2) {
        int i3;
        if (i2 >= 0 && i2 < (i3 = this.f22013f)) {
            if (i3 == 1) {
                return (E) this.f22014g;
            }
            return (E) ((Object[]) this.f22014g)[i2];
        }
        throw new IndexOutOfBoundsException("Index: " + i2 + ", Size: " + this.f22013f);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<E> iterator() {
        int i2 = this.f22013f;
        if (i2 == 0) {
            b a2 = b.a();
            if (a2 == null) {
                a(2);
            }
            return a2;
        }
        if (i2 == 1) {
            return new c();
        }
        Iterator<E> it = super.iterator();
        if (it == null) {
            a(3);
        }
        return it;
    }

    @Override // java.util.AbstractList, java.util.List
    public E remove(int i2) {
        int i3;
        E e2;
        if (i2 >= 0 && i2 < (i3 = this.f22013f)) {
            if (i3 == 1) {
                e2 = (E) this.f22014g;
                this.f22014g = null;
            } else {
                Object[] objArr = (Object[]) this.f22014g;
                Object obj = objArr[i2];
                if (i3 == 2) {
                    this.f22014g = objArr[1 - i2];
                } else {
                    int i4 = (i3 - i2) - 1;
                    if (i4 > 0) {
                        System.arraycopy(objArr, i2 + 1, objArr, i2, i4);
                    }
                    objArr[this.f22013f - 1] = null;
                }
                e2 = (E) obj;
            }
            this.f22013f--;
            ((AbstractList) this).modCount++;
            return e2;
        }
        throw new IndexOutOfBoundsException("Index: " + i2 + ", Size: " + this.f22013f);
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int i2, E e2) {
        int i3;
        if (i2 < 0 || i2 >= (i3 = this.f22013f)) {
            throw new IndexOutOfBoundsException("Index: " + i2 + ", Size: " + this.f22013f);
        }
        if (i3 == 1) {
            E e3 = (E) this.f22014g;
            this.f22014g = e2;
            return e3;
        }
        Object[] objArr = (Object[]) this.f22014g;
        E e4 = (E) objArr[i2];
        objArr[i2] = e2;
        return e4;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f22013f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public <T> T[] toArray(T[] tArr) {
        if (tArr == 0) {
            a(4);
        }
        int length = tArr.length;
        int i2 = this.f22013f;
        if (i2 == 1) {
            if (length != 0) {
                tArr[0] = this.f22014g;
            } else {
                T[] tArr2 = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), 1));
                tArr2[0] = this.f22014g;
                return tArr2;
            }
        } else {
            if (length < i2) {
                T[] tArr3 = (T[]) Arrays.copyOf((Object[]) this.f22014g, i2, tArr.getClass());
                if (tArr3 == null) {
                    a(6);
                }
                return tArr3;
            }
            if (i2 != 0) {
                System.arraycopy(this.f22014g, 0, tArr, 0, i2);
            }
        }
        int i3 = this.f22013f;
        if (length > i3) {
            tArr[i3] = 0;
        }
        return tArr;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i2, E e2) {
        int i3;
        if (i2 >= 0 && i2 <= (i3 = this.f22013f)) {
            if (i3 == 0) {
                this.f22014g = e2;
            } else if (i3 == 1 && i2 == 0) {
                this.f22014g = new Object[]{e2, this.f22014g};
            } else {
                Object[] objArr = new Object[i3 + 1];
                if (i3 == 1) {
                    objArr[0] = this.f22014g;
                } else {
                    Object[] objArr2 = (Object[]) this.f22014g;
                    System.arraycopy(objArr2, 0, objArr, 0, i2);
                    System.arraycopy(objArr2, i2, objArr, i2 + 1, this.f22013f - i2);
                }
                objArr[i2] = e2;
                this.f22014g = objArr;
            }
            this.f22013f++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("Index: " + i2 + ", Size: " + this.f22013f);
    }
}
