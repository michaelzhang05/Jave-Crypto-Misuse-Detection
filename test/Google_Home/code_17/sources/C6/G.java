package C6;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes5.dex */
public final class G implements InterfaceC1050v {

    /* renamed from: a, reason: collision with root package name */
    private char[] f1604a = C1034e.f1673c.d();

    /* renamed from: b, reason: collision with root package name */
    private int f1605b;

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
                    this.f1604a[f8] = charAt;
                } else {
                    if (b8 == 1) {
                        String str2 = S.b()[charAt];
                        AbstractC3255y.f(str2);
                        int f9 = f(f8, str2.length());
                        str2.getChars(0, str2.length(), this.f1604a, f9);
                        i9 = f9 + str2.length();
                        this.f1605b = i9;
                    } else {
                        char[] cArr = this.f1604a;
                        cArr[f8] = '\\';
                        cArr[f8 + 1] = (char) b8;
                        i9 = f8 + 2;
                        this.f1605b = i9;
                    }
                    i8++;
                }
            } else {
                i10 = f8 + 1;
                this.f1604a[f8] = charAt;
            }
            i9 = i10;
            i8++;
        }
        int f10 = f(i9, 1);
        this.f1604a[f10] = '\"';
        this.f1605b = f10 + 1;
    }

    private final void e(int i8) {
        f(this.f1605b, i8);
    }

    private final int f(int i8, int i9) {
        int i10 = i9 + i8;
        char[] cArr = this.f1604a;
        if (cArr.length <= i10) {
            char[] copyOf = Arrays.copyOf(cArr, g6.m.d(i10, i8 * 2));
            AbstractC3255y.h(copyOf, "copyOf(...)");
            this.f1604a = copyOf;
        }
        return i8;
    }

    @Override // C6.InterfaceC1050v
    public void a(char c8) {
        e(1);
        char[] cArr = this.f1604a;
        int i8 = this.f1605b;
        this.f1605b = i8 + 1;
        cArr[i8] = c8;
    }

    @Override // C6.InterfaceC1050v
    public void b(String text) {
        AbstractC3255y.i(text, "text");
        e(text.length() + 2);
        char[] cArr = this.f1604a;
        int i8 = this.f1605b;
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
        this.f1605b = i10 + 1;
    }

    @Override // C6.InterfaceC1050v
    public void c(String text) {
        AbstractC3255y.i(text, "text");
        int length = text.length();
        if (length == 0) {
            return;
        }
        e(length);
        text.getChars(0, text.length(), this.f1604a, this.f1605b);
        this.f1605b += length;
    }

    public void g() {
        C1034e.f1673c.c(this.f1604a);
    }

    public String toString() {
        return new String(this.f1604a, 0, this.f1605b);
    }

    @Override // C6.InterfaceC1050v
    public void writeLong(long j8) {
        c(String.valueOf(j8));
    }
}
