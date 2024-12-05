package z6;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: z6.G, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4036G implements InterfaceC4061v {

    /* renamed from: a, reason: collision with root package name */
    private char[] f40486a = C4045e.f40555c.d();

    /* renamed from: b, reason: collision with root package name */
    private int f40487b;

    private final void d(int i8, int i9, String str) {
        int i10;
        int length = str.length();
        while (i8 < length) {
            int f8 = f(i9, 2);
            char charAt = str.charAt(i8);
            if (charAt < S.a().length) {
                byte b8 = S.a()[charAt];
                if (b8 == 0) {
                    i10 = f8 + 1;
                    this.f40486a[f8] = charAt;
                } else {
                    if (b8 == 1) {
                        String str2 = S.b()[charAt];
                        AbstractC3159y.f(str2);
                        int f9 = f(f8, str2.length());
                        str2.getChars(0, str2.length(), this.f40486a, f9);
                        i9 = f9 + str2.length();
                        this.f40487b = i9;
                    } else {
                        char[] cArr = this.f40486a;
                        cArr[f8] = '\\';
                        cArr[f8 + 1] = (char) b8;
                        i9 = f8 + 2;
                        this.f40487b = i9;
                    }
                    i8++;
                }
            } else {
                i10 = f8 + 1;
                this.f40486a[f8] = charAt;
            }
            i9 = i10;
            i8++;
        }
        int f10 = f(i9, 1);
        this.f40486a[f10] = '\"';
        this.f40487b = f10 + 1;
    }

    private final void e(int i8) {
        f(this.f40487b, i8);
    }

    private final int f(int i8, int i9) {
        int i10 = i9 + i8;
        char[] cArr = this.f40486a;
        if (cArr.length <= i10) {
            char[] copyOf = Arrays.copyOf(cArr, d6.m.d(i10, i8 * 2));
            AbstractC3159y.h(copyOf, "copyOf(...)");
            this.f40486a = copyOf;
        }
        return i8;
    }

    @Override // z6.InterfaceC4061v
    public void a(char c8) {
        e(1);
        char[] cArr = this.f40486a;
        int i8 = this.f40487b;
        this.f40487b = i8 + 1;
        cArr[i8] = c8;
    }

    @Override // z6.InterfaceC4061v
    public void b(String text) {
        AbstractC3159y.i(text, "text");
        e(text.length() + 2);
        char[] cArr = this.f40486a;
        int i8 = this.f40487b;
        int i9 = i8 + 1;
        cArr[i8] = '\"';
        int length = text.length();
        text.getChars(0, length, cArr, i9);
        int i10 = length + i9;
        for (int i11 = i9; i11 < i10; i11++) {
            char c8 = cArr[i11];
            if (c8 < S.a().length && S.a()[c8] != 0) {
                d(i11 - i9, i11, text);
                return;
            }
        }
        cArr[i10] = '\"';
        this.f40487b = i10 + 1;
    }

    @Override // z6.InterfaceC4061v
    public void c(String text) {
        AbstractC3159y.i(text, "text");
        int length = text.length();
        if (length == 0) {
            return;
        }
        e(length);
        text.getChars(0, text.length(), this.f40486a, this.f40487b);
        this.f40487b += length;
    }

    public void g() {
        C4045e.f40555c.c(this.f40486a);
    }

    public String toString() {
        return new String(this.f40486a, 0, this.f40487b);
    }

    @Override // z6.InterfaceC4061v
    public void writeLong(long j8) {
        c(String.valueOf(j8));
    }
}
