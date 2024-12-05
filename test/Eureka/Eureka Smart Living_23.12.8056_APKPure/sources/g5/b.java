package g5;

import a5.a0;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class b extends a0 {

    /* renamed from: a, reason: collision with root package name */
    private final int f6798a;

    /* renamed from: b, reason: collision with root package name */
    private final int f6799b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f6800c;

    /* renamed from: d, reason: collision with root package name */
    private int f6801d;

    public b(int i6, int i7, int i8) {
        this.f6798a = i8;
        this.f6799b = i7;
        boolean z5 = true;
        if (i8 <= 0 ? i6 < i7 : i6 > i7) {
            z5 = false;
        }
        this.f6800c = z5;
        this.f6801d = z5 ? i6 : i7;
    }

    @Override // a5.a0
    public int b() {
        int i6 = this.f6801d;
        if (i6 != this.f6799b) {
            this.f6801d = this.f6798a + i6;
        } else {
            if (!this.f6800c) {
                throw new NoSuchElementException();
            }
            this.f6800c = false;
        }
        return i6;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f6800c;
    }
}
