package d6;

import M5.O;
import java.util.NoSuchElementException;

/* loaded from: classes5.dex */
public final class k extends O {

    /* renamed from: a, reason: collision with root package name */
    private final long f30205a;

    /* renamed from: b, reason: collision with root package name */
    private final long f30206b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f30207c;

    /* renamed from: d, reason: collision with root package name */
    private long f30208d;

    public k(long j8, long j9, long j10) {
        this.f30205a = j10;
        this.f30206b = j9;
        boolean z8 = false;
        if (j10 <= 0 ? j8 >= j9 : j8 <= j9) {
            z8 = true;
        }
        this.f30207c = z8;
        this.f30208d = z8 ? j8 : j9;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f30207c;
    }

    @Override // M5.O
    public long nextLong() {
        long j8 = this.f30208d;
        if (j8 == this.f30206b) {
            if (this.f30207c) {
                this.f30207c = false;
            } else {
                throw new NoSuchElementException();
            }
        } else {
            this.f30208d = this.f30205a + j8;
        }
        return j8;
    }
}
