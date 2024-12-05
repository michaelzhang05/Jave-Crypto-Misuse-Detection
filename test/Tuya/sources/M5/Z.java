package M5;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;
import kotlin.jvm.internal.AbstractC3159y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class Z extends AbstractC1230c implements RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    private final Object[] f7025a;

    /* renamed from: b, reason: collision with root package name */
    private final int f7026b;

    /* renamed from: c, reason: collision with root package name */
    private int f7027c;

    /* renamed from: d, reason: collision with root package name */
    private int f7028d;

    /* loaded from: classes5.dex */
    public static final class a extends AbstractC1229b {

        /* renamed from: c, reason: collision with root package name */
        private int f7029c;

        /* renamed from: d, reason: collision with root package name */
        private int f7030d;

        a() {
            this.f7029c = Z.this.size();
            this.f7030d = Z.this.f7027c;
        }

        @Override // M5.AbstractC1229b
        protected void b() {
            if (this.f7029c == 0) {
                c();
                return;
            }
            e(Z.this.f7025a[this.f7030d]);
            this.f7030d = (this.f7030d + 1) % Z.this.f7026b;
            this.f7029c--;
        }
    }

    public Z(Object[] buffer, int i8) {
        AbstractC3159y.i(buffer, "buffer");
        this.f7025a = buffer;
        if (i8 >= 0) {
            if (i8 <= buffer.length) {
                this.f7026b = buffer.length;
                this.f7028d = i8;
                return;
            }
            throw new IllegalArgumentException(("ring buffer filled size: " + i8 + " cannot be larger than the buffer size: " + buffer.length).toString());
        }
        throw new IllegalArgumentException(("ring buffer filled size should not be negative but it is " + i8).toString());
    }

    @Override // M5.AbstractC1230c, java.util.List
    public Object get(int i8) {
        AbstractC1230c.Companion.b(i8, size());
        return this.f7025a[(this.f7027c + i8) % this.f7026b];
    }

    @Override // M5.AbstractC1230c, M5.AbstractC1228a
    public int getSize() {
        return this.f7028d;
    }

    @Override // M5.AbstractC1230c, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return new a();
    }

    public final void l(Object obj) {
        if (!p()) {
            this.f7025a[(this.f7027c + size()) % this.f7026b] = obj;
            this.f7028d = size() + 1;
            return;
        }
        throw new IllegalStateException("ring buffer is full");
    }

    public final Z m(int i8) {
        Object[] array;
        int i9 = this.f7026b;
        int g8 = d6.m.g(i9 + (i9 >> 1) + 1, i8);
        if (this.f7027c == 0) {
            array = Arrays.copyOf(this.f7025a, g8);
            AbstractC3159y.h(array, "copyOf(...)");
        } else {
            array = toArray(new Object[g8]);
        }
        return new Z(array, size());
    }

    public final boolean p() {
        if (size() == this.f7026b) {
            return true;
        }
        return false;
    }

    public final void q(int i8) {
        if (i8 >= 0) {
            if (i8 <= size()) {
                if (i8 > 0) {
                    int i9 = this.f7027c;
                    int i10 = (i9 + i8) % this.f7026b;
                    if (i9 > i10) {
                        AbstractC1239l.t(this.f7025a, null, i9, this.f7026b);
                        AbstractC1239l.t(this.f7025a, null, 0, i10);
                    } else {
                        AbstractC1239l.t(this.f7025a, null, i9, i10);
                    }
                    this.f7027c = i10;
                    this.f7028d = size() - i8;
                    return;
                }
                return;
            }
            throw new IllegalArgumentException(("n shouldn't be greater than the buffer size: n = " + i8 + ", size = " + size()).toString());
        }
        throw new IllegalArgumentException(("n shouldn't be negative but it is " + i8).toString());
    }

    @Override // M5.AbstractC1228a, java.util.Collection, java.util.List
    public Object[] toArray(Object[] array) {
        AbstractC3159y.i(array, "array");
        if (array.length < size()) {
            array = Arrays.copyOf(array, size());
            AbstractC3159y.h(array, "copyOf(...)");
        }
        int size = size();
        int i8 = 0;
        int i9 = 0;
        for (int i10 = this.f7027c; i9 < size && i10 < this.f7026b; i10++) {
            array[i9] = this.f7025a[i10];
            i9++;
        }
        while (i9 < size) {
            array[i9] = this.f7025a[i8];
            i9++;
            i8++;
        }
        return AbstractC1246t.f(size, array);
    }

    public Z(int i8) {
        this(new Object[i8], 0);
    }

    @Override // M5.AbstractC1228a, java.util.Collection, java.util.List
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }
}
