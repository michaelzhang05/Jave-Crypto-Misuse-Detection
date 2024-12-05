package kotlin.jvm.internal;

import java.util.NoSuchElementException;

/* renamed from: kotlin.jvm.internal.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C3137b extends M5.E {

    /* renamed from: a, reason: collision with root package name */
    private final double[] f33767a;

    /* renamed from: b, reason: collision with root package name */
    private int f33768b;

    public C3137b(double[] array) {
        AbstractC3159y.i(array, "array");
        this.f33767a = array;
    }

    @Override // M5.E
    public double b() {
        try {
            double[] dArr = this.f33767a;
            int i8 = this.f33768b;
            this.f33768b = i8 + 1;
            return dArr[i8];
        } catch (ArrayIndexOutOfBoundsException e8) {
            this.f33768b--;
            throw new NoSuchElementException(e8.getMessage());
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.f33768b < this.f33767a.length) {
            return true;
        }
        return false;
    }
}
