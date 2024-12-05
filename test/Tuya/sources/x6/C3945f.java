package x6;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: x6.f, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3945f extends h0 {

    /* renamed from: a, reason: collision with root package name */
    private boolean[] f39568a;

    /* renamed from: b, reason: collision with root package name */
    private int f39569b;

    public C3945f(boolean[] bufferWithData) {
        AbstractC3159y.i(bufferWithData, "bufferWithData");
        this.f39568a = bufferWithData;
        this.f39569b = bufferWithData.length;
        b(10);
    }

    @Override // x6.h0
    public void b(int i8) {
        boolean[] zArr = this.f39568a;
        if (zArr.length < i8) {
            boolean[] copyOf = Arrays.copyOf(zArr, d6.m.d(i8, zArr.length * 2));
            AbstractC3159y.h(copyOf, "copyOf(...)");
            this.f39568a = copyOf;
        }
    }

    @Override // x6.h0
    public int d() {
        return this.f39569b;
    }

    public final void e(boolean z8) {
        h0.c(this, 0, 1, null);
        boolean[] zArr = this.f39568a;
        int d8 = d();
        this.f39569b = d8 + 1;
        zArr[d8] = z8;
    }

    @Override // x6.h0
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean[] a() {
        boolean[] copyOf = Arrays.copyOf(this.f39568a, d());
        AbstractC3159y.h(copyOf, "copyOf(...)");
        return copyOf;
    }
}
