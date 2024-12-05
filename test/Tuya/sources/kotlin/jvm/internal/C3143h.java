package kotlin.jvm.internal;

import java.util.NoSuchElementException;

/* renamed from: kotlin.jvm.internal.h, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C3143h extends M5.O {

    /* renamed from: a, reason: collision with root package name */
    private final long[] f33775a;

    /* renamed from: b, reason: collision with root package name */
    private int f33776b;

    public C3143h(long[] array) {
        AbstractC3159y.i(array, "array");
        this.f33775a = array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.f33776b < this.f33775a.length) {
            return true;
        }
        return false;
    }

    @Override // M5.O
    public long nextLong() {
        try {
            long[] jArr = this.f33775a;
            int i8 = this.f33776b;
            this.f33776b = i8 + 1;
            return jArr[i8];
        } catch (ArrayIndexOutOfBoundsException e8) {
            this.f33776b--;
            throw new NoSuchElementException(e8.getMessage());
        }
    }
}
