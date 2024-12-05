package g6;

import P5.O;
import java.util.NoSuchElementException;

/* loaded from: classes5.dex */
public final class k extends O {

    /* renamed from: a, reason: collision with root package name */
    private final long f32085a;

    /* renamed from: b, reason: collision with root package name */
    private final long f32086b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f32087c;

    /* renamed from: d, reason: collision with root package name */
    private long f32088d;

    public k(long j8, long j9, long j10) {
        this.f32085a = j10;
        this.f32086b = j9;
        boolean z8 = false;
        if (j10 <= 0 ? j8 >= j9 : j8 <= j9) {
            z8 = true;
        }
        this.f32087c = z8;
        this.f32088d = z8 ? j8 : j9;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f32087c;
    }

    @Override // P5.O
    public long nextLong() {
        long j8 = this.f32088d;
        if (j8 == this.f32086b) {
            if (this.f32087c) {
                this.f32087c = false;
            } else {
                throw new NoSuchElementException();
            }
        } else {
            this.f32088d = this.f32085a + j8;
        }
        return j8;
    }
}
