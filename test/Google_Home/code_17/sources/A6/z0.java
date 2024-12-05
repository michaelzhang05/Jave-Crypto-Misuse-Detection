package A6;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes5.dex */
public final class z0 extends h0 {

    /* renamed from: a, reason: collision with root package name */
    private long[] f638a;

    /* renamed from: b, reason: collision with root package name */
    private int f639b;

    public /* synthetic */ z0(long[] jArr, AbstractC3247p abstractC3247p) {
        this(jArr);
    }

    @Override // A6.h0
    public /* bridge */ /* synthetic */ Object a() {
        return O5.D.c(f());
    }

    @Override // A6.h0
    public void b(int i8) {
        if (O5.D.p(this.f638a) < i8) {
            long[] jArr = this.f638a;
            long[] copyOf = Arrays.copyOf(jArr, g6.m.d(i8, O5.D.p(jArr) * 2));
            AbstractC3255y.h(copyOf, "copyOf(...)");
            this.f638a = O5.D.f(copyOf);
        }
    }

    @Override // A6.h0
    public int d() {
        return this.f639b;
    }

    public final void e(long j8) {
        h0.c(this, 0, 1, null);
        long[] jArr = this.f638a;
        int d8 = d();
        this.f639b = d8 + 1;
        O5.D.u(jArr, d8, j8);
    }

    public long[] f() {
        long[] copyOf = Arrays.copyOf(this.f638a, d());
        AbstractC3255y.h(copyOf, "copyOf(...)");
        return O5.D.f(copyOf);
    }

    private z0(long[] bufferWithData) {
        AbstractC3255y.i(bufferWithData, "bufferWithData");
        this.f638a = bufferWithData;
        this.f639b = O5.D.p(bufferWithData);
        b(10);
    }
}
