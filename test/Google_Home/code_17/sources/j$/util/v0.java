package j$.util;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class v0 {

    /* renamed from: a, reason: collision with root package name */
    private final String f33886a;

    /* renamed from: b, reason: collision with root package name */
    private final String f33887b;

    /* renamed from: c, reason: collision with root package name */
    private final String f33888c;

    /* renamed from: d, reason: collision with root package name */
    private String[] f33889d;

    /* renamed from: e, reason: collision with root package name */
    private int f33890e;

    /* renamed from: f, reason: collision with root package name */
    private int f33891f;

    public v0(CharSequence charSequence) {
        Objects.requireNonNull("", "The prefix must not be null");
        Objects.requireNonNull(charSequence, "The delimiter must not be null");
        Objects.requireNonNull("", "The suffix must not be null");
        this.f33886a = "".toString();
        this.f33887b = charSequence.toString();
        this.f33888c = "".toString();
    }

    private void b() {
        String[] strArr;
        if (this.f33890e > 1) {
            char[] cArr = new char[this.f33891f];
            int c8 = c(this.f33889d[0], cArr, 0);
            int i8 = 1;
            do {
                int c9 = c8 + c(this.f33887b, cArr, c8);
                c8 = c9 + c(this.f33889d[i8], cArr, c9);
                strArr = this.f33889d;
                strArr[i8] = null;
                i8++;
            } while (i8 < this.f33890e);
            this.f33890e = 1;
            strArr[0] = new String(cArr);
        }
    }

    private static int c(String str, char[] cArr, int i8) {
        int length = str.length();
        str.getChars(0, length, cArr, i8);
        return length;
    }

    public final void a(CharSequence charSequence) {
        String valueOf = String.valueOf(charSequence);
        String[] strArr = this.f33889d;
        if (strArr == null) {
            this.f33889d = new String[8];
        } else {
            int i8 = this.f33890e;
            if (i8 == strArr.length) {
                this.f33889d = (String[]) Arrays.copyOf(strArr, i8 * 2);
            }
            this.f33891f = this.f33887b.length() + this.f33891f;
        }
        this.f33891f = valueOf.length() + this.f33891f;
        String[] strArr2 = this.f33889d;
        int i9 = this.f33890e;
        this.f33890e = i9 + 1;
        strArr2[i9] = valueOf;
    }

    public final void d(v0 v0Var) {
        Objects.requireNonNull(v0Var);
        if (v0Var.f33889d == null) {
            return;
        }
        v0Var.b();
        a(v0Var.f33889d[0]);
    }

    public final String toString() {
        String[] strArr = this.f33889d;
        int i8 = this.f33890e;
        String str = this.f33886a;
        int length = str.length();
        String str2 = this.f33888c;
        int length2 = str2.length() + length;
        if (length2 == 0) {
            b();
            return i8 == 0 ? "" : strArr[0];
        }
        char[] cArr = new char[this.f33891f + length2];
        int c8 = c(str, cArr, 0);
        if (i8 > 0) {
            c8 += c(strArr[0], cArr, c8);
            for (int i9 = 1; i9 < i8; i9++) {
                int c9 = c8 + c(this.f33887b, cArr, c8);
                c8 = c9 + c(strArr[i9], cArr, c9);
            }
        }
        c(str2, cArr, c8);
        return new String(cArr);
    }
}
