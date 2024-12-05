package g6;

import P5.N;
import java.util.NoSuchElementException;

/* loaded from: classes5.dex */
public final class h extends N {

    /* renamed from: a, reason: collision with root package name */
    private final int f32075a;

    /* renamed from: b, reason: collision with root package name */
    private final int f32076b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f32077c;

    /* renamed from: d, reason: collision with root package name */
    private int f32078d;

    public h(int i8, int i9, int i10) {
        this.f32075a = i10;
        this.f32076b = i9;
        boolean z8 = false;
        if (i10 <= 0 ? i8 >= i9 : i8 <= i9) {
            z8 = true;
        }
        this.f32077c = z8;
        this.f32078d = z8 ? i8 : i9;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f32077c;
    }

    @Override // P5.N
    public int nextInt() {
        int i8 = this.f32078d;
        if (i8 == this.f32076b) {
            if (this.f32077c) {
                this.f32077c = false;
            } else {
                throw new NoSuchElementException();
            }
        } else {
            this.f32078d = this.f32075a + i8;
        }
        return i8;
    }
}
