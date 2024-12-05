package kotlin.jvm.internal;

import java.util.NoSuchElementException;

/* renamed from: kotlin.jvm.internal.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C3138c extends M5.J {

    /* renamed from: a, reason: collision with root package name */
    private final float[] f33769a;

    /* renamed from: b, reason: collision with root package name */
    private int f33770b;

    public C3138c(float[] array) {
        AbstractC3159y.i(array, "array");
        this.f33769a = array;
    }

    @Override // M5.J
    public float b() {
        try {
            float[] fArr = this.f33769a;
            int i8 = this.f33770b;
            this.f33770b = i8 + 1;
            return fArr[i8];
        } catch (ArrayIndexOutOfBoundsException e8) {
            this.f33770b--;
            throw new NoSuchElementException(e8.getMessage());
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.f33770b < this.f33769a.length) {
            return true;
        }
        return false;
    }
}
