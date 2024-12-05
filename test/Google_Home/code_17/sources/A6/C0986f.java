package A6;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: A6.f, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0986f extends h0 {

    /* renamed from: a, reason: collision with root package name */
    private boolean[] f563a;

    /* renamed from: b, reason: collision with root package name */
    private int f564b;

    public C0986f(boolean[] bufferWithData) {
        AbstractC3255y.i(bufferWithData, "bufferWithData");
        this.f563a = bufferWithData;
        this.f564b = bufferWithData.length;
        b(10);
    }

    @Override // A6.h0
    public void b(int i8) {
        boolean[] zArr = this.f563a;
        if (zArr.length < i8) {
            boolean[] copyOf = Arrays.copyOf(zArr, g6.m.d(i8, zArr.length * 2));
            AbstractC3255y.h(copyOf, "copyOf(...)");
            this.f563a = copyOf;
        }
    }

    @Override // A6.h0
    public int d() {
        return this.f564b;
    }

    public final void e(boolean z8) {
        h0.c(this, 0, 1, null);
        boolean[] zArr = this.f563a;
        int d8 = d();
        this.f564b = d8 + 1;
        zArr[d8] = z8;
    }

    @Override // A6.h0
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean[] a() {
        boolean[] copyOf = Arrays.copyOf(this.f563a, d());
        AbstractC3255y.h(copyOf, "copyOf(...)");
        return copyOf;
    }
}
