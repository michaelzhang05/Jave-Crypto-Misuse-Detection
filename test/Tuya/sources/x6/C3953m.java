package x6;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: x6.m, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3953m extends h0 {

    /* renamed from: a, reason: collision with root package name */
    private char[] f39584a;

    /* renamed from: b, reason: collision with root package name */
    private int f39585b;

    public C3953m(char[] bufferWithData) {
        AbstractC3159y.i(bufferWithData, "bufferWithData");
        this.f39584a = bufferWithData;
        this.f39585b = bufferWithData.length;
        b(10);
    }

    @Override // x6.h0
    public void b(int i8) {
        char[] cArr = this.f39584a;
        if (cArr.length < i8) {
            char[] copyOf = Arrays.copyOf(cArr, d6.m.d(i8, cArr.length * 2));
            AbstractC3159y.h(copyOf, "copyOf(...)");
            this.f39584a = copyOf;
        }
    }

    @Override // x6.h0
    public int d() {
        return this.f39585b;
    }

    public final void e(char c8) {
        h0.c(this, 0, 1, null);
        char[] cArr = this.f39584a;
        int d8 = d();
        this.f39585b = d8 + 1;
        cArr[d8] = c8;
    }

    @Override // x6.h0
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public char[] a() {
        char[] copyOf = Arrays.copyOf(this.f39584a, d());
        AbstractC3159y.h(copyOf, "copyOf(...)");
        return copyOf;
    }
}
