package A6;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: A6.m, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0994m extends h0 {

    /* renamed from: a, reason: collision with root package name */
    private char[] f579a;

    /* renamed from: b, reason: collision with root package name */
    private int f580b;

    public C0994m(char[] bufferWithData) {
        AbstractC3255y.i(bufferWithData, "bufferWithData");
        this.f579a = bufferWithData;
        this.f580b = bufferWithData.length;
        b(10);
    }

    @Override // A6.h0
    public void b(int i8) {
        char[] cArr = this.f579a;
        if (cArr.length < i8) {
            char[] copyOf = Arrays.copyOf(cArr, g6.m.d(i8, cArr.length * 2));
            AbstractC3255y.h(copyOf, "copyOf(...)");
            this.f579a = copyOf;
        }
    }

    @Override // A6.h0
    public int d() {
        return this.f580b;
    }

    public final void e(char c8) {
        h0.c(this, 0, 1, null);
        char[] cArr = this.f579a;
        int d8 = d();
        this.f580b = d8 + 1;
        cArr[d8] = c8;
    }

    @Override // A6.h0
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public char[] a() {
        char[] copyOf = Arrays.copyOf(this.f579a, d());
        AbstractC3255y.h(copyOf, "copyOf(...)");
        return copyOf;
    }
}
