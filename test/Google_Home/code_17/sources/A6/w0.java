package A6;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes5.dex */
public final class w0 extends h0 {

    /* renamed from: a, reason: collision with root package name */
    private int[] f626a;

    /* renamed from: b, reason: collision with root package name */
    private int f627b;

    public /* synthetic */ w0(int[] iArr, AbstractC3247p abstractC3247p) {
        this(iArr);
    }

    @Override // A6.h0
    public /* bridge */ /* synthetic */ Object a() {
        return O5.B.c(f());
    }

    @Override // A6.h0
    public void b(int i8) {
        if (O5.B.p(this.f626a) < i8) {
            int[] iArr = this.f626a;
            int[] copyOf = Arrays.copyOf(iArr, g6.m.d(i8, O5.B.p(iArr) * 2));
            AbstractC3255y.h(copyOf, "copyOf(...)");
            this.f626a = O5.B.f(copyOf);
        }
    }

    @Override // A6.h0
    public int d() {
        return this.f627b;
    }

    public final void e(int i8) {
        h0.c(this, 0, 1, null);
        int[] iArr = this.f626a;
        int d8 = d();
        this.f627b = d8 + 1;
        O5.B.u(iArr, d8, i8);
    }

    public int[] f() {
        int[] copyOf = Arrays.copyOf(this.f626a, d());
        AbstractC3255y.h(copyOf, "copyOf(...)");
        return O5.B.f(copyOf);
    }

    private w0(int[] bufferWithData) {
        AbstractC3255y.i(bufferWithData, "bufferWithData");
        this.f626a = bufferWithData;
        this.f627b = O5.B.p(bufferWithData);
        b(10);
    }
}
