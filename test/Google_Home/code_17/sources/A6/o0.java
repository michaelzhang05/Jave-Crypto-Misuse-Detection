package A6;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes5.dex */
public final class o0 extends h0 {

    /* renamed from: a, reason: collision with root package name */
    private short[] f587a;

    /* renamed from: b, reason: collision with root package name */
    private int f588b;

    public o0(short[] bufferWithData) {
        AbstractC3255y.i(bufferWithData, "bufferWithData");
        this.f587a = bufferWithData;
        this.f588b = bufferWithData.length;
        b(10);
    }

    @Override // A6.h0
    public void b(int i8) {
        short[] sArr = this.f587a;
        if (sArr.length < i8) {
            short[] copyOf = Arrays.copyOf(sArr, g6.m.d(i8, sArr.length * 2));
            AbstractC3255y.h(copyOf, "copyOf(...)");
            this.f587a = copyOf;
        }
    }

    @Override // A6.h0
    public int d() {
        return this.f588b;
    }

    public final void e(short s8) {
        h0.c(this, 0, 1, null);
        short[] sArr = this.f587a;
        int d8 = d();
        this.f588b = d8 + 1;
        sArr[d8] = s8;
    }

    @Override // A6.h0
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public short[] a() {
        short[] copyOf = Arrays.copyOf(this.f587a, d());
        AbstractC3255y.h(copyOf, "copyOf(...)");
        return copyOf;
    }
}
