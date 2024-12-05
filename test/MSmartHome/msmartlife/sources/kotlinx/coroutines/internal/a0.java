package kotlinx.coroutines.internal;

import java.lang.Comparable;
import java.util.Arrays;
import kotlinx.coroutines.internal.b0;
import kotlinx.coroutines.l0;

/* compiled from: ThreadSafeHeap.kt */
/* loaded from: classes2.dex */
public class a0<T extends b0 & Comparable<? super T>> {
    private volatile /* synthetic */ int _size = 0;
    private T[] a;

    private final T[] f() {
        T[] tArr = this.a;
        if (tArr == null) {
            T[] tArr2 = (T[]) new b0[4];
            this.a = tArr2;
            return tArr2;
        }
        if (c() < tArr.length) {
            return tArr;
        }
        Object[] copyOf = Arrays.copyOf(tArr, c() * 2);
        kotlin.jvm.internal.l.e(copyOf, "java.util.Arrays.copyOf(this, newSize)");
        T[] tArr3 = (T[]) ((b0[]) copyOf);
        this.a = tArr3;
        return tArr3;
    }

    private final void j(int i2) {
        this._size = i2;
    }

    private final void k(int i2) {
        while (true) {
            int i3 = (i2 * 2) + 1;
            if (i3 >= c()) {
                return;
            }
            T[] tArr = this.a;
            kotlin.jvm.internal.l.c(tArr);
            int i4 = i3 + 1;
            if (i4 < c()) {
                T t = tArr[i4];
                kotlin.jvm.internal.l.c(t);
                T t2 = tArr[i3];
                kotlin.jvm.internal.l.c(t2);
                if (((Comparable) t).compareTo(t2) < 0) {
                    i3 = i4;
                }
            }
            T t3 = tArr[i2];
            kotlin.jvm.internal.l.c(t3);
            T t4 = tArr[i3];
            kotlin.jvm.internal.l.c(t4);
            if (((Comparable) t3).compareTo(t4) <= 0) {
                return;
            }
            m(i2, i3);
            i2 = i3;
        }
    }

    private final void l(int i2) {
        while (i2 > 0) {
            T[] tArr = this.a;
            kotlin.jvm.internal.l.c(tArr);
            int i3 = (i2 - 1) / 2;
            T t = tArr[i3];
            kotlin.jvm.internal.l.c(t);
            T t2 = tArr[i2];
            kotlin.jvm.internal.l.c(t2);
            if (((Comparable) t).compareTo(t2) <= 0) {
                return;
            }
            m(i2, i3);
            i2 = i3;
        }
    }

    private final void m(int i2, int i3) {
        T[] tArr = this.a;
        kotlin.jvm.internal.l.c(tArr);
        T t = tArr[i3];
        kotlin.jvm.internal.l.c(t);
        T t2 = tArr[i2];
        kotlin.jvm.internal.l.c(t2);
        tArr[i2] = t;
        tArr[i3] = t2;
        t.r(i2);
        t2.r(i3);
    }

    public final void a(T t) {
        if (l0.a()) {
            if (!(t.o() == null)) {
                throw new AssertionError();
            }
        }
        t.i(this);
        T[] f2 = f();
        int c2 = c();
        j(c2 + 1);
        f2[c2] = t;
        t.r(c2);
        l(c2);
    }

    public final T b() {
        T[] tArr = this.a;
        if (tArr == null) {
            return null;
        }
        return tArr[0];
    }

    public final int c() {
        return this._size;
    }

    public final boolean d() {
        return c() == 0;
    }

    public final T e() {
        T b2;
        synchronized (this) {
            b2 = b();
        }
        return b2;
    }

    public final boolean g(T t) {
        boolean z;
        synchronized (this) {
            z = true;
            if (t.o() == null) {
                z = false;
            } else {
                int f2 = t.f();
                if (l0.a()) {
                    if (!(f2 >= 0)) {
                        throw new AssertionError();
                    }
                }
                h(f2);
            }
        }
        return z;
    }

    public final T h(int i2) {
        if (l0.a()) {
            if (!(c() > 0)) {
                throw new AssertionError();
            }
        }
        T[] tArr = this.a;
        kotlin.jvm.internal.l.c(tArr);
        j(c() - 1);
        if (i2 < c()) {
            m(i2, c());
            int i3 = (i2 - 1) / 2;
            if (i2 > 0) {
                T t = tArr[i2];
                kotlin.jvm.internal.l.c(t);
                T t2 = tArr[i3];
                kotlin.jvm.internal.l.c(t2);
                if (((Comparable) t).compareTo(t2) < 0) {
                    m(i2, i3);
                    l(i3);
                }
            }
            k(i2);
        }
        T t3 = tArr[c()];
        kotlin.jvm.internal.l.c(t3);
        if (l0.a()) {
            if (!(t3.o() == this)) {
                throw new AssertionError();
            }
        }
        t3.i(null);
        t3.r(-1);
        tArr[c()] = null;
        return t3;
    }

    public final T i() {
        T h2;
        synchronized (this) {
            h2 = c() > 0 ? h(0) : null;
        }
        return h2;
    }
}
