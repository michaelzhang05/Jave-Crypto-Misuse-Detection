package d6;

import M5.N;
import java.util.NoSuchElementException;

/* loaded from: classes5.dex */
public final class h extends N {

    /* renamed from: a, reason: collision with root package name */
    private final int f30195a;

    /* renamed from: b, reason: collision with root package name */
    private final int f30196b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f30197c;

    /* renamed from: d, reason: collision with root package name */
    private int f30198d;

    public h(int i8, int i9, int i10) {
        this.f30195a = i10;
        this.f30196b = i9;
        boolean z8 = false;
        if (i10 <= 0 ? i8 >= i9 : i8 <= i9) {
            z8 = true;
        }
        this.f30197c = z8;
        this.f30198d = z8 ? i8 : i9;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f30197c;
    }

    @Override // M5.N
    public int nextInt() {
        int i8 = this.f30198d;
        if (i8 == this.f30196b) {
            if (this.f30197c) {
                this.f30197c = false;
            } else {
                throw new NoSuchElementException();
            }
        } else {
            this.f30198d = this.f30195a + i8;
        }
        return i8;
    }
}
