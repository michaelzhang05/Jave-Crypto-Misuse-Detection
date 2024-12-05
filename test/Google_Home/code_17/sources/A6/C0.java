package A6;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes5.dex */
public final class C0 extends h0 {

    /* renamed from: a, reason: collision with root package name */
    private short[] f501a;

    /* renamed from: b, reason: collision with root package name */
    private int f502b;

    public /* synthetic */ C0(short[] sArr, AbstractC3247p abstractC3247p) {
        this(sArr);
    }

    @Override // A6.h0
    public /* bridge */ /* synthetic */ Object a() {
        return O5.G.c(f());
    }

    @Override // A6.h0
    public void b(int i8) {
        if (O5.G.p(this.f501a) < i8) {
            short[] sArr = this.f501a;
            short[] copyOf = Arrays.copyOf(sArr, g6.m.d(i8, O5.G.p(sArr) * 2));
            AbstractC3255y.h(copyOf, "copyOf(...)");
            this.f501a = O5.G.f(copyOf);
        }
    }

    @Override // A6.h0
    public int d() {
        return this.f502b;
    }

    public final void e(short s8) {
        h0.c(this, 0, 1, null);
        short[] sArr = this.f501a;
        int d8 = d();
        this.f502b = d8 + 1;
        O5.G.u(sArr, d8, s8);
    }

    public short[] f() {
        short[] copyOf = Arrays.copyOf(this.f501a, d());
        AbstractC3255y.h(copyOf, "copyOf(...)");
        return O5.G.f(copyOf);
    }

    private C0(short[] bufferWithData) {
        AbstractC3255y.i(bufferWithData, "bufferWithData");
        this.f501a = bufferWithData;
        this.f502b = O5.G.p(bufferWithData);
        b(10);
    }
}
