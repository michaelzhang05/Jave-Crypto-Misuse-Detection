package P5;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;
import kotlin.jvm.internal.AbstractC3255y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class Z extends AbstractC1362c implements RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    private final Object[] f8849a;

    /* renamed from: b, reason: collision with root package name */
    private final int f8850b;

    /* renamed from: c, reason: collision with root package name */
    private int f8851c;

    /* renamed from: d, reason: collision with root package name */
    private int f8852d;

    /* loaded from: classes5.dex */
    public static final class a extends AbstractC1361b {

        /* renamed from: c, reason: collision with root package name */
        private int f8853c;

        /* renamed from: d, reason: collision with root package name */
        private int f8854d;

        a() {
            this.f8853c = Z.this.size();
            this.f8854d = Z.this.f8851c;
        }

        @Override // P5.AbstractC1361b
        protected void a() {
            if (this.f8853c == 0) {
                b();
                return;
            }
            c(Z.this.f8849a[this.f8854d]);
            this.f8854d = (this.f8854d + 1) % Z.this.f8850b;
            this.f8853c--;
        }
    }

    public Z(Object[] buffer, int i8) {
        AbstractC3255y.i(buffer, "buffer");
        this.f8849a = buffer;
        if (i8 >= 0) {
            if (i8 <= buffer.length) {
                this.f8850b = buffer.length;
                this.f8852d = i8;
                return;
            }
            throw new IllegalArgumentException(("ring buffer filled size: " + i8 + " cannot be larger than the buffer size: " + buffer.length).toString());
        }
        throw new IllegalArgumentException(("ring buffer filled size should not be negative but it is " + i8).toString());
    }

    @Override // P5.AbstractC1362c, java.util.List
    public Object get(int i8) {
        AbstractC1362c.Companion.b(i8, size());
        return this.f8849a[(this.f8851c + i8) % this.f8850b];
    }

    @Override // P5.AbstractC1362c, P5.AbstractC1360a
    public int getSize() {
        return this.f8852d;
    }

    @Override // P5.AbstractC1362c, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return new a();
    }

    public final void j(Object obj) {
        if (!m()) {
            this.f8849a[(this.f8851c + size()) % this.f8850b] = obj;
            this.f8852d = size() + 1;
            return;
        }
        throw new IllegalStateException("ring buffer is full");
    }

    public final Z k(int i8) {
        Object[] array;
        int i9 = this.f8850b;
        int g8 = g6.m.g(i9 + (i9 >> 1) + 1, i8);
        if (this.f8851c == 0) {
            array = Arrays.copyOf(this.f8849a, g8);
            AbstractC3255y.h(array, "copyOf(...)");
        } else {
            array = toArray(new Object[g8]);
        }
        return new Z(array, size());
    }

    public final boolean m() {
        if (size() == this.f8850b) {
            return true;
        }
        return false;
    }

    public final void n(int i8) {
        if (i8 >= 0) {
            if (i8 <= size()) {
                if (i8 > 0) {
                    int i9 = this.f8851c;
                    int i10 = (i9 + i8) % this.f8850b;
                    if (i9 > i10) {
                        AbstractC1371l.t(this.f8849a, null, i9, this.f8850b);
                        AbstractC1371l.t(this.f8849a, null, 0, i10);
                    } else {
                        AbstractC1371l.t(this.f8849a, null, i9, i10);
                    }
                    this.f8851c = i10;
                    this.f8852d = size() - i8;
                    return;
                }
                return;
            }
            throw new IllegalArgumentException(("n shouldn't be greater than the buffer size: n = " + i8 + ", size = " + size()).toString());
        }
        throw new IllegalArgumentException(("n shouldn't be negative but it is " + i8).toString());
    }

    @Override // P5.AbstractC1360a, java.util.Collection, java.util.List
    public Object[] toArray(Object[] array) {
        AbstractC3255y.i(array, "array");
        if (array.length < size()) {
            array = Arrays.copyOf(array, size());
            AbstractC3255y.h(array, "copyOf(...)");
        }
        int size = size();
        int i8 = 0;
        int i9 = 0;
        for (int i10 = this.f8851c; i9 < size && i10 < this.f8850b; i10++) {
            array[i9] = this.f8849a[i10];
            i9++;
        }
        while (i9 < size) {
            array[i9] = this.f8849a[i8];
            i9++;
            i8++;
        }
        return AbstractC1378t.f(size, array);
    }

    public Z(int i8) {
        this(new Object[i8], 0);
    }

    @Override // P5.AbstractC1360a, java.util.Collection, java.util.List
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }
}
