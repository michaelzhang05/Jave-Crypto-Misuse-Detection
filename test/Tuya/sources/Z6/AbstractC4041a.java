package z6;

import L5.C1224h;
import M5.AbstractC1246t;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: z6.a */
/* loaded from: classes5.dex */
public abstract class AbstractC4041a {

    /* renamed from: a */
    public int f40547a;

    /* renamed from: c */
    private String f40549c;

    /* renamed from: b */
    public final C4033D f40548b = new C4033D();

    /* renamed from: d */
    private StringBuilder f40550d = new StringBuilder();

    private final int B(CharSequence charSequence, int i8) {
        char charAt = charSequence.charAt(i8);
        if ('0' <= charAt && charAt < ':') {
            return charAt - '0';
        }
        if ('a' <= charAt && charAt < 'g') {
            return charAt - 'W';
        }
        if ('A' <= charAt && charAt < 'G') {
            return charAt - '7';
        }
        x(this, "Invalid toHexChar char '" + charAt + "' in unicode escape", 0, null, 6, null);
        throw new C1224h();
    }

    private final String L() {
        String str = this.f40549c;
        AbstractC3159y.f(str);
        this.f40549c = null;
        return str;
    }

    public static /* synthetic */ boolean O(AbstractC4041a abstractC4041a, boolean z8, int i8, Object obj) {
        if (obj == null) {
            if ((i8 & 1) != 0) {
                z8 = true;
            }
            return abstractC4041a.N(z8);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryConsumeNull");
    }

    private final boolean Q() {
        if (C().charAt(this.f40547a - 1) != '\"') {
            return true;
        }
        return false;
    }

    private final int a(int i8) {
        int H8 = H(i8);
        if (H8 != -1) {
            int i9 = H8 + 1;
            char charAt = C().charAt(H8);
            if (charAt == 'u') {
                return c(C(), i9);
            }
            char b8 = AbstractC4042b.b(charAt);
            if (b8 != 0) {
                this.f40550d.append(b8);
                return i9;
            }
            x(this, "Invalid escaped char '" + charAt + '\'', 0, null, 6, null);
            throw new C1224h();
        }
        x(this, "Expected escape sequence to continue, got EOF", 0, null, 6, null);
        throw new C1224h();
    }

    private final int b(int i8, int i9) {
        d(i8, i9);
        return a(i9 + 1);
    }

    private final int c(CharSequence charSequence, int i8) {
        int i9 = i8 + 4;
        if (i9 >= charSequence.length()) {
            this.f40547a = i8;
            u();
            if (this.f40547a + 4 < charSequence.length()) {
                return c(charSequence, this.f40547a);
            }
            x(this, "Unexpected EOF during unicode escape", 0, null, 6, null);
            throw new C1224h();
        }
        this.f40550d.append((char) ((B(charSequence, i8) << 12) + (B(charSequence, i8 + 1) << 8) + (B(charSequence, i8 + 2) << 4) + B(charSequence, i8 + 3)));
        return i9;
    }

    private final boolean f(int i8) {
        int H8 = H(i8);
        if (H8 < C().length() && H8 != -1) {
            int i9 = H8 + 1;
            int charAt = C().charAt(H8) | ' ';
            if (charAt != 102) {
                if (charAt == 116) {
                    h("rue", i9);
                    return true;
                }
                x(this, "Expected valid boolean literal prefix, but had '" + q() + '\'', 0, null, 6, null);
                throw new C1224h();
            }
            h("alse", i9);
            return false;
        }
        x(this, "EOF", 0, null, 6, null);
        throw new C1224h();
    }

    private final void h(String str, int i8) {
        if (C().length() - i8 >= str.length()) {
            int length = str.length();
            for (int i9 = 0; i9 < length; i9++) {
                if (str.charAt(i9) != (C().charAt(i8 + i9) | ' ')) {
                    x(this, "Expected valid boolean literal prefix, but had '" + q() + '\'', 0, null, 6, null);
                    throw new C1224h();
                }
            }
            this.f40547a = i8 + str.length();
            return;
        }
        x(this, "Unexpected end of boolean literal", 0, null, 6, null);
        throw new C1224h();
    }

    private static final double n(long j8, boolean z8) {
        if (!z8) {
            return Math.pow(10.0d, -j8);
        }
        if (z8) {
            return Math.pow(10.0d, j8);
        }
        throw new L5.p();
    }

    private final String s(int i8, int i9) {
        d(i8, i9);
        String sb = this.f40550d.toString();
        AbstractC3159y.h(sb, "toString(...)");
        this.f40550d.setLength(0);
        return sb;
    }

    public static /* synthetic */ Void x(AbstractC4041a abstractC4041a, String str, int i8, String str2, int i9, Object obj) {
        if (obj == null) {
            if ((i9 & 2) != 0) {
                i8 = abstractC4041a.f40547a;
            }
            if ((i9 & 4) != 0) {
                str2 = "";
            }
            return abstractC4041a.w(str, i8, str2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fail");
    }

    public static /* synthetic */ Void z(AbstractC4041a abstractC4041a, byte b8, boolean z8, int i8, Object obj) {
        if (obj == null) {
            if ((i8 & 2) != 0) {
                z8 = true;
            }
            return abstractC4041a.y(b8, z8);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fail");
    }

    public final void A(String key) {
        AbstractC3159y.i(key, "key");
        w("Encountered an unknown key '" + key + '\'', g6.n.X(K(0, this.f40547a), key, 0, false, 6, null), "Use 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys.");
        throw new C1224h();
    }

    protected abstract CharSequence C();

    public final boolean D(char c8) {
        boolean z8;
        if (c8 == '}' || c8 == ']' || c8 == ':' || c8 == ',') {
            z8 = true;
        } else {
            z8 = false;
        }
        return !z8;
    }

    public abstract String E(String str, boolean z8);

    public final byte F() {
        CharSequence C8 = C();
        int i8 = this.f40547a;
        while (true) {
            int H8 = H(i8);
            if (H8 != -1) {
                char charAt = C8.charAt(H8);
                if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                    this.f40547a = H8;
                    return AbstractC4042b.a(charAt);
                }
                i8 = H8 + 1;
            } else {
                this.f40547a = H8;
                return (byte) 10;
            }
        }
    }

    public final String G(boolean z8) {
        String o8;
        byte F8 = F();
        if (z8) {
            if (F8 != 1 && F8 != 0) {
                return null;
            }
            o8 = q();
        } else {
            if (F8 != 1) {
                return null;
            }
            o8 = o();
        }
        this.f40549c = o8;
        return o8;
    }

    public abstract int H(int i8);

    public final void I(boolean z8) {
        ArrayList arrayList = new ArrayList();
        byte F8 = F();
        if (F8 != 8 && F8 != 6) {
            q();
            return;
        }
        while (true) {
            byte F9 = F();
            if (F9 == 1) {
                if (z8) {
                    q();
                } else {
                    i();
                }
            } else {
                if (F9 == 8 || F9 == 6) {
                    arrayList.add(Byte.valueOf(F9));
                } else if (F9 == 9) {
                    if (((Number) AbstractC1246t.y0(arrayList)).byteValue() == 8) {
                        AbstractC1246t.P(arrayList);
                    } else {
                        throw AbstractC4031B.e(this.f40547a, "found ] instead of } at path: " + this.f40548b, C());
                    }
                } else if (F9 == 7) {
                    if (((Number) AbstractC1246t.y0(arrayList)).byteValue() == 6) {
                        AbstractC1246t.P(arrayList);
                    } else {
                        throw AbstractC4031B.e(this.f40547a, "found } instead of ] at path: " + this.f40548b, C());
                    }
                } else if (F9 == 10) {
                    x(this, "Unexpected end of input due to malformed JSON during ignoring unknown keys", 0, null, 6, null);
                    throw new C1224h();
                }
                j();
                if (arrayList.size() == 0) {
                    return;
                }
            }
        }
    }

    public abstract int J();

    public String K(int i8, int i9) {
        return C().subSequence(i8, i9).toString();
    }

    public abstract boolean M();

    public final boolean N(boolean z8) {
        int H8 = H(J());
        int length = C().length() - H8;
        if (length < 4 || H8 == -1) {
            return false;
        }
        for (int i8 = 0; i8 < 4; i8++) {
            if ("null".charAt(i8) != C().charAt(H8 + i8)) {
                return false;
            }
        }
        if (length > 4 && AbstractC4042b.a(C().charAt(H8 + 4)) == 0) {
            return false;
        }
        if (z8) {
            this.f40547a = H8 + 4;
            return true;
        }
        return true;
    }

    public final void P(char c8) {
        int i8 = this.f40547a;
        if (i8 > 0 && c8 == '\"') {
            try {
                this.f40547a = i8 - 1;
                String q8 = q();
                this.f40547a = i8;
                if (AbstractC3159y.d(q8, "null")) {
                    w("Expected string literal but 'null' literal was found", this.f40547a - 1, "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls to default values.");
                    throw new C1224h();
                }
            } catch (Throwable th) {
                this.f40547a = i8;
                throw th;
            }
        }
        z(this, AbstractC4042b.a(c8), false, 2, null);
        throw new C1224h();
    }

    protected void d(int i8, int i9) {
        this.f40550d.append(C(), i8, i9);
    }

    public abstract boolean e();

    public final boolean g() {
        boolean z8;
        int J8 = J();
        if (J8 != C().length()) {
            if (C().charAt(J8) == '\"') {
                J8++;
                z8 = true;
            } else {
                z8 = false;
            }
            boolean f8 = f(J8);
            if (z8) {
                if (this.f40547a != C().length()) {
                    if (C().charAt(this.f40547a) == '\"') {
                        this.f40547a++;
                    } else {
                        x(this, "Expected closing quotation mark", 0, null, 6, null);
                        throw new C1224h();
                    }
                } else {
                    x(this, "EOF", 0, null, 6, null);
                    throw new C1224h();
                }
            }
            return f8;
        }
        x(this, "EOF", 0, null, 6, null);
        throw new C1224h();
    }

    public abstract String i();

    public abstract byte j();

    public final byte k(byte b8) {
        byte j8 = j();
        if (j8 == b8) {
            return j8;
        }
        z(this, b8, false, 2, null);
        throw new C1224h();
    }

    public abstract void l(char c8);

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0144, code lost:
    
        if (r5 == r0) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0146, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0149, code lost:
    
        if (r0 == r5) goto L225;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x014b, code lost:
    
        if (r10 == false) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x014f, code lost:
    
        if (r0 == (r5 - 1)) goto L225;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0151, code lost:
    
        if (r1 == false) goto L204;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0153, code lost:
    
        if (r3 == false) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x015f, code lost:
    
        if (C().charAt(r5) != '\"') goto L200;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0161, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0164, code lost:
    
        x(r17, "Expected closing quotation mark", 0, null, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0174, code lost:
    
        throw new L5.C1224h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0175, code lost:
    
        x(r17, "EOF", 0, null, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0185, code lost:
    
        throw new L5.C1224h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0186, code lost:
    
        r17.f40547a = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0188, code lost:
    
        if (r9 == false) goto L217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x018a, code lost:
    
        r0 = r11 * n(r13, r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0195, code lost:
    
        if (r0 > 9.223372036854776E18d) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x019b, code lost:
    
        if (r0 < (-9.223372036854776E18d)) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01a3, code lost:
    
        if (java.lang.Math.floor(r0) != r0) goto L213;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01a5, code lost:
    
        r11 = (long) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01a7, code lost:
    
        x(r17, "Can't convert " + r0 + " to Long", 0, null, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01cb, code lost:
    
        throw new L5.C1224h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01cc, code lost:
    
        x(r17, "Numeric value overflow", 0, null, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01dc, code lost:
    
        throw new L5.C1224h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01dd, code lost:
    
        if (r10 == false) goto L219;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01e4, code lost:
    
        if (r11 == Long.MIN_VALUE) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01e7, code lost:
    
        return -r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01e8, code lost:
    
        x(r17, "Numeric value overflow", 0, null, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01f8, code lost:
    
        throw new L5.C1224h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:?, code lost:
    
        return r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01f9, code lost:
    
        x(r17, "Expected numeric literal", 0, null, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0209, code lost:
    
        throw new L5.C1224h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0148, code lost:
    
        r3 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long m() {
        /*
            Method dump skipped, instructions count: 539
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z6.AbstractC4041a.m():long");
    }

    public final String o() {
        if (this.f40549c != null) {
            return L();
        }
        return i();
    }

    public final String p(CharSequence source, int i8, int i9) {
        String s8;
        int H8;
        AbstractC3159y.i(source, "source");
        char charAt = source.charAt(i9);
        boolean z8 = false;
        while (charAt != '\"') {
            if (charAt == '\\') {
                H8 = H(b(i8, i9));
                if (H8 == -1) {
                    x(this, "Unexpected EOF", H8, null, 4, null);
                    throw new C1224h();
                }
            } else {
                i9++;
                if (i9 >= source.length()) {
                    d(i8, i9);
                    H8 = H(i9);
                    if (H8 == -1) {
                        x(this, "Unexpected EOF", H8, null, 4, null);
                        throw new C1224h();
                    }
                } else {
                    continue;
                    charAt = source.charAt(i9);
                }
            }
            i8 = H8;
            i9 = i8;
            z8 = true;
            charAt = source.charAt(i9);
        }
        if (!z8) {
            s8 = K(i8, i9);
        } else {
            s8 = s(i8, i9);
        }
        this.f40547a = i9 + 1;
        return s8;
    }

    public final String q() {
        String s8;
        if (this.f40549c != null) {
            return L();
        }
        int J8 = J();
        if (J8 < C().length() && J8 != -1) {
            byte a8 = AbstractC4042b.a(C().charAt(J8));
            if (a8 == 1) {
                return o();
            }
            if (a8 == 0) {
                boolean z8 = false;
                while (AbstractC4042b.a(C().charAt(J8)) == 0) {
                    J8++;
                    if (J8 >= C().length()) {
                        d(this.f40547a, J8);
                        int H8 = H(J8);
                        if (H8 == -1) {
                            this.f40547a = J8;
                            return s(0, 0);
                        }
                        J8 = H8;
                        z8 = true;
                    }
                }
                if (!z8) {
                    s8 = K(this.f40547a, J8);
                } else {
                    s8 = s(this.f40547a, J8);
                }
                this.f40547a = J8;
                return s8;
            }
            x(this, "Expected beginning of the string, but got " + C().charAt(J8), 0, null, 6, null);
            throw new C1224h();
        }
        x(this, "EOF", J8, null, 4, null);
        throw new C1224h();
    }

    public final String r() {
        String q8 = q();
        if (AbstractC3159y.d(q8, "null") && Q()) {
            x(this, "Unexpected 'null' value instead of string literal", 0, null, 6, null);
            throw new C1224h();
        }
        return q8;
    }

    public final void t() {
        this.f40549c = null;
    }

    public String toString() {
        return "JsonReader(source='" + ((Object) C()) + "', currentPosition=" + this.f40547a + ')';
    }

    public final void v() {
        if (j() == 10) {
            return;
        }
        x(this, "Expected EOF after parsing, but had " + C().charAt(this.f40547a - 1) + " instead", 0, null, 6, null);
        throw new C1224h();
    }

    public final Void w(String message, int i8, String hint) {
        String str;
        AbstractC3159y.i(message, "message");
        AbstractC3159y.i(hint, "hint");
        if (hint.length() == 0) {
            str = "";
        } else {
            str = '\n' + hint;
        }
        throw AbstractC4031B.e(i8, message + " at path: " + this.f40548b.a() + str, C());
    }

    public final Void y(byte b8, boolean z8) {
        int i8;
        String str;
        String c8 = AbstractC4042b.c(b8);
        if (z8) {
            i8 = this.f40547a - 1;
        } else {
            i8 = this.f40547a;
        }
        int i9 = i8;
        if (this.f40547a != C().length() && i9 >= 0) {
            str = String.valueOf(C().charAt(i9));
        } else {
            str = "EOF";
        }
        x(this, "Expected " + c8 + ", but had '" + str + "' instead", i9, null, 4, null);
        throw new C1224h();
    }

    public void u() {
    }
}
