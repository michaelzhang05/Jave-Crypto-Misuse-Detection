package Y1;

import a2.AbstractC1618f;
import a2.C1617e;
import com.google.android.material.internal.ViewUtils;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

/* loaded from: classes4.dex */
abstract class b {

    /* renamed from: t, reason: collision with root package name */
    protected static boolean[] f13493t;

    /* renamed from: u, reason: collision with root package name */
    protected static boolean[] f13494u;

    /* renamed from: v, reason: collision with root package name */
    protected static boolean[] f13495v;

    /* renamed from: w, reason: collision with root package name */
    protected static boolean[] f13496w;

    /* renamed from: x, reason: collision with root package name */
    protected static boolean[] f13497x;

    /* renamed from: a, reason: collision with root package name */
    protected char f13498a;

    /* renamed from: b, reason: collision with root package name */
    C1617e f13499b;

    /* renamed from: c, reason: collision with root package name */
    private String f13500c;

    /* renamed from: d, reason: collision with root package name */
    protected final a f13501d = new a(15);

    /* renamed from: e, reason: collision with root package name */
    protected Object f13502e;

    /* renamed from: f, reason: collision with root package name */
    protected String f13503f;

    /* renamed from: g, reason: collision with root package name */
    protected int f13504g;

    /* renamed from: h, reason: collision with root package name */
    protected final boolean f13505h;

    /* renamed from: i, reason: collision with root package name */
    protected final boolean f13506i;

    /* renamed from: j, reason: collision with root package name */
    protected final boolean f13507j;

    /* renamed from: k, reason: collision with root package name */
    protected final boolean f13508k;

    /* renamed from: l, reason: collision with root package name */
    protected final boolean f13509l;

    /* renamed from: m, reason: collision with root package name */
    protected final boolean f13510m;

    /* renamed from: n, reason: collision with root package name */
    protected final boolean f13511n;

    /* renamed from: o, reason: collision with root package name */
    protected final boolean f13512o;

    /* renamed from: p, reason: collision with root package name */
    protected final boolean f13513p;

    /* renamed from: q, reason: collision with root package name */
    protected final boolean f13514q;

    /* renamed from: r, reason: collision with root package name */
    protected final boolean f13515r;

    /* renamed from: s, reason: collision with root package name */
    protected final boolean f13516s;

    /* loaded from: classes4.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        char[] f13517a;

        /* renamed from: b, reason: collision with root package name */
        int f13518b = -1;

        public a(int i8) {
            this.f13517a = new char[i8];
        }

        public void a(char c8) {
            int i8 = this.f13518b + 1;
            this.f13518b = i8;
            char[] cArr = this.f13517a;
            if (cArr.length <= i8) {
                char[] cArr2 = new char[(cArr.length * 2) + 1];
                System.arraycopy(cArr, 0, cArr2, 0, cArr.length);
                this.f13517a = cArr2;
            }
            this.f13517a[this.f13518b] = c8;
        }

        public void b() {
            this.f13518b = -1;
        }

        public String toString() {
            return new String(this.f13517a, 0, this.f13518b + 1);
        }
    }

    static {
        boolean[] zArr = new boolean[126];
        f13493t = zArr;
        boolean[] zArr2 = new boolean[126];
        f13494u = zArr2;
        boolean[] zArr3 = new boolean[126];
        f13495v = zArr3;
        boolean[] zArr4 = new boolean[126];
        f13496w = zArr4;
        boolean[] zArr5 = new boolean[126];
        f13497x = zArr5;
        zArr3[26] = true;
        zArr3[58] = true;
        zArr4[26] = true;
        zArr4[125] = true;
        zArr4[44] = true;
        zArr2[26] = true;
        zArr2[93] = true;
        zArr2[44] = true;
        zArr5[26] = true;
        zArr[58] = true;
        zArr[44] = true;
        zArr[26] = true;
        zArr[125] = true;
        zArr[93] = true;
    }

    public b(int i8) {
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        if ((i8 & 4) > 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.f13506i = z8;
        if ((i8 & 2) > 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f13507j = z9;
        if ((i8 & 1) > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f13508k = z10;
        if ((i8 & 8) > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f13512o = z11;
        if ((i8 & 16) > 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f13514q = z12;
        if ((i8 & 32) > 0) {
            z13 = true;
        } else {
            z13 = false;
        }
        this.f13505h = z13;
        if ((i8 & 64) > 0) {
            z14 = true;
        } else {
            z14 = false;
        }
        this.f13509l = z14;
        if ((i8 & 128) > 0) {
            z15 = true;
        } else {
            z15 = false;
        }
        this.f13513p = z15;
        if ((i8 & ViewUtils.EDGE_TO_EDGE_FLAGS) != 768) {
            z16 = true;
        } else {
            z16 = false;
        }
        this.f13510m = z16;
        if ((i8 & 512) == 0) {
            z17 = true;
        } else {
            z17 = false;
        }
        this.f13511n = z17;
        if ((i8 & 1024) > 0) {
            z18 = true;
        } else {
            z18 = false;
        }
        this.f13515r = z18;
        this.f13516s = (i8 & 2048) > 0;
    }

    public void a() {
        if (this.f13512o) {
            return;
        }
        int length = this.f13503f.length();
        for (int i8 = 0; i8 < length; i8++) {
            char charAt = this.f13503f.charAt(i8);
            if (charAt >= 0) {
                if (charAt > 31) {
                    if (charAt == 127 && this.f13515r) {
                        throw new e(this.f13504g + i8, 0, Character.valueOf(charAt));
                    }
                } else {
                    throw new e(this.f13504g + i8, 0, Character.valueOf(charAt));
                }
            }
        }
    }

    public void b() {
        int length = this.f13503f.length();
        if (length == 1) {
            return;
        }
        if (length == 2) {
            if (!this.f13503f.equals("00")) {
                return;
            } else {
                throw new e(this.f13504g, 6, this.f13503f);
            }
        }
        char charAt = this.f13503f.charAt(0);
        char charAt2 = this.f13503f.charAt(1);
        if (charAt == '-') {
            char charAt3 = this.f13503f.charAt(2);
            if (charAt2 == '0' && charAt3 >= '0' && charAt3 <= '9') {
                throw new e(this.f13504g, 6, this.f13503f);
            }
            return;
        }
        if (charAt == '0' && charAt2 >= '0' && charAt2 <= '9') {
            throw new e(this.f13504g, 6, this.f13503f);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Number c() {
        if (!this.f13505h) {
            b();
        }
        try {
            if (!this.f13513p) {
                return Float.valueOf(Float.parseFloat(this.f13503f));
            }
            if (this.f13503f.length() > 18) {
                BigDecimal bigDecimal = new BigDecimal(this.f13503f);
                if (!this.f13516s) {
                    double parseDouble = Double.parseDouble(this.f13503f);
                    if (String.valueOf(parseDouble).equals(this.f13503f)) {
                        return Double.valueOf(parseDouble);
                    }
                    return bigDecimal;
                }
                return bigDecimal;
            }
            return Double.valueOf(Double.parseDouble(this.f13503f));
        } catch (NumberFormatException unused) {
            throw new e(this.f13504g, 1, this.f13503f);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Object d(AbstractC1618f abstractC1618f) {
        this.f13504g = -1;
        try {
            f();
            Object h8 = h(abstractC1618f);
            if (this.f13510m) {
                if (!this.f13511n) {
                    t();
                }
                if (this.f13498a != 26) {
                    throw new e(this.f13504g - 1, 1, Character.valueOf(this.f13498a));
                }
            }
            this.f13503f = null;
            this.f13502e = null;
            return h8;
        } catch (IOException e8) {
            throw new e(this.f13504g, e8);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Number e(String str) {
        int i8;
        int i9;
        boolean z8;
        int length = str.length();
        boolean z9 = false;
        if (str.charAt(0) == '-') {
            if (!this.f13505h && length >= 3 && str.charAt(1) == '0') {
                throw new e(this.f13504g, 6, str);
            }
            i8 = 20;
            i9 = 1;
            z8 = true;
        } else {
            if (!this.f13505h && length >= 2 && str.charAt(0) == '0') {
                throw new e(this.f13504g, 6, str);
            }
            i8 = 19;
            i9 = 0;
            z8 = false;
        }
        if (length >= i8) {
            if (length > i8) {
                return new BigInteger(str, 10);
            }
            length--;
            z9 = true;
        }
        long j8 = 0;
        while (i9 < length) {
            j8 = (j8 * 10) + ('0' - str.charAt(i9));
            i9++;
        }
        if (z9) {
            if (j8 <= -922337203685477580L) {
                if (j8 >= -922337203685477580L) {
                    if (z8) {
                    }
                }
                return new BigInteger(str, 10);
            }
            j8 = (j8 * 10) + ('0' - str.charAt(i9));
        }
        if (z8) {
            if (this.f13514q && j8 >= -2147483648L) {
                return Integer.valueOf((int) j8);
            }
            return Long.valueOf(j8);
        }
        long j9 = -j8;
        if (this.f13514q && j9 <= 2147483647L) {
            return Integer.valueOf((int) j9);
        }
        return Long.valueOf(j9);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void f();

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0043, code lost:
    
        if (r4 == ':') goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0047, code lost:
    
        if (r4 == ']') goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x004b, code lost:
    
        if (r4 == '}') goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0081, code lost:
    
        throw new Y1.e(r7.f13504g, 0, java.lang.Character.valueOf(r7.f13498a));
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0057, code lost:
    
        if (r1 == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x005b, code lost:
    
        if (r7.f13509l == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x006b, code lost:
    
        throw new Y1.e(r7.f13504g, 0, java.lang.Character.valueOf(r7.f13498a));
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x006c, code lost:
    
        f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0073, code lost:
    
        return r8.b(r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected java.lang.Object g(a2.AbstractC1618f r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r8.c()
            char r1 = r7.f13498a
            r2 = 91
            if (r1 != r2) goto Lad
            r7.f()
            char r1 = r7.f13498a
            r2 = 44
            r3 = 0
            if (r1 != r2) goto L27
            boolean r1 = r7.f13509l
            if (r1 == 0) goto L19
            goto L27
        L19:
            Y1.e r8 = new Y1.e
            int r0 = r7.f13504g
            char r1 = r7.f13498a
            java.lang.Character r1 = java.lang.Character.valueOf(r1)
            r8.<init>(r0, r3, r1)
            throw r8
        L27:
            r1 = 0
        L28:
            char r4 = r7.f13498a
            r5 = 9
            if (r4 == r5) goto La8
            r5 = 10
            if (r4 == r5) goto La8
            r5 = 13
            if (r4 == r5) goto La8
            r5 = 26
            r6 = 1
            if (r4 == r5) goto L9c
            r5 = 32
            if (r4 == r5) goto La8
            if (r4 == r2) goto L82
            r5 = 58
            if (r4 == r5) goto L74
            r5 = 93
            if (r4 == r5) goto L57
            r1 = 125(0x7d, float:1.75E-43)
            if (r4 == r1) goto L74
            boolean[] r1 = Y1.b.f13494u
            java.lang.Object r1 = r7.i(r8, r1)
            r8.a(r0, r1)
            goto L27
        L57:
            if (r1 == 0) goto L6c
            boolean r1 = r7.f13509l
            if (r1 == 0) goto L5e
            goto L6c
        L5e:
            Y1.e r8 = new Y1.e
            int r0 = r7.f13504g
            char r1 = r7.f13498a
            java.lang.Character r1 = java.lang.Character.valueOf(r1)
            r8.<init>(r0, r3, r1)
            throw r8
        L6c:
            r7.f()
            java.lang.Object r8 = r8.b(r0)
            return r8
        L74:
            Y1.e r8 = new Y1.e
            int r0 = r7.f13504g
            char r1 = r7.f13498a
            java.lang.Character r1 = java.lang.Character.valueOf(r1)
            r8.<init>(r0, r3, r1)
            throw r8
        L82:
            if (r1 == 0) goto L97
            boolean r1 = r7.f13509l
            if (r1 == 0) goto L89
            goto L97
        L89:
            Y1.e r8 = new Y1.e
            int r0 = r7.f13504g
            char r1 = r7.f13498a
            java.lang.Character r1 = java.lang.Character.valueOf(r1)
            r8.<init>(r0, r3, r1)
            throw r8
        L97:
            r7.f()
            r1 = 1
            goto L28
        L9c:
            Y1.e r8 = new Y1.e
            int r0 = r7.f13504g
            int r0 = r0 - r6
            r1 = 3
            java.lang.String r2 = "EOF"
            r8.<init>(r0, r1, r2)
            throw r8
        La8:
            r7.f()
            goto L28
        Lad:
            java.lang.RuntimeException r8 = new java.lang.RuntimeException
            java.lang.String r0 = "Internal Error"
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: Y1.b.g(a2.f):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00ba, code lost:
    
        throw new Y1.e(r3.f13504g, 0, java.lang.Character.valueOf(r3.f13498a));
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00fd, code lost:
    
        r0 = l(Y1.b.f13497x);
        r3.f13502e = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0109, code lost:
    
        return r4.b(r0);
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x000b. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected java.lang.Object h(a2.AbstractC1618f r4) {
        /*
            Method dump skipped, instructions count: 362
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y1.b.h(a2.f):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a0, code lost:
    
        throw new Y1.e(r2.f13504g, 0, java.lang.Character.valueOf(r2.f13498a));
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00e3, code lost:
    
        return l(r4);
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x000b. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected java.lang.Object i(a2.AbstractC1618f r3, boolean[] r4) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y1.b.i(a2.f, boolean[]):java.lang.Object");
    }

    protected abstract void j(boolean[] zArr);

    protected abstract void k();

    protected abstract Object l(boolean[] zArr);

    /* JADX WARN: Code restructure failed: missing block: B:72:0x00e7, code lost:
    
        throw new Y1.e(r12.f13504g, 0, java.lang.Character.valueOf(r12.f13498a));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected java.lang.Object m(a2.AbstractC1618f r13) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y1.b.m(a2.f):java.lang.Object");
    }

    abstract void n();

    protected abstract void o();

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Failed to find 'out' block for switch in B:99:0x0018. Please report as an issue. */
    public void p() {
        char c8 = this.f13498a;
        while (true) {
            f();
            char c9 = this.f13498a;
            if (c9 != '\"' && c9 != '\'') {
                if (c9 != '\\') {
                    if (c9 != 127) {
                        switch (c9) {
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case '\b':
                            case '\t':
                            case '\n':
                            case 11:
                            case '\f':
                            case '\r':
                            case 14:
                            case 15:
                            case 16:
                            case 17:
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                                if (!this.f13512o) {
                                    throw new e(this.f13504g, 0, Character.valueOf(this.f13498a));
                                }
                                break;
                            case 26:
                                throw new e(this.f13504g - 1, 3, null);
                            default:
                                this.f13501d.a(c9);
                                break;
                        }
                    } else if (this.f13512o) {
                        continue;
                    } else {
                        if (this.f13515r) {
                            throw new e(this.f13504g, 0, Character.valueOf(this.f13498a));
                        }
                        this.f13501d.a(c9);
                    }
                } else {
                    f();
                    char c10 = this.f13498a;
                    if (c10 != '\"') {
                        if (c10 != '\'') {
                            if (c10 != '/') {
                                if (c10 != '\\') {
                                    if (c10 != 'b') {
                                        if (c10 != 'f') {
                                            if (c10 != 'n') {
                                                if (c10 != 'r') {
                                                    if (c10 != 'x') {
                                                        if (c10 != 't') {
                                                            if (c10 == 'u') {
                                                                this.f13501d.a(q(4));
                                                            }
                                                        } else {
                                                            this.f13501d.a('\t');
                                                        }
                                                    } else {
                                                        this.f13501d.a(q(2));
                                                    }
                                                } else {
                                                    this.f13501d.a('\r');
                                                }
                                            } else {
                                                this.f13501d.a('\n');
                                            }
                                        } else {
                                            this.f13501d.a('\f');
                                        }
                                    } else {
                                        this.f13501d.a('\b');
                                    }
                                } else {
                                    this.f13501d.a('\\');
                                }
                            } else {
                                this.f13501d.a('/');
                            }
                        } else {
                            this.f13501d.a('\'');
                        }
                    } else {
                        this.f13501d.a('\"');
                    }
                }
            } else {
                if (c8 == c9) {
                    f();
                    this.f13503f = this.f13501d.toString();
                    return;
                }
                this.f13501d.a(c9);
            }
        }
    }

    protected char q(int i8) {
        int i9;
        int i10 = 0;
        for (int i11 = 0; i11 < i8; i11++) {
            int i12 = i10 * 16;
            f();
            char c8 = this.f13498a;
            if (c8 <= '9' && c8 >= '0') {
                i9 = c8 - '0';
            } else if (c8 <= 'F' && c8 >= 'A') {
                i9 = c8 - '7';
            } else {
                if (c8 < 'a' || c8 > 'f') {
                    if (c8 == 26) {
                        throw new e(this.f13504g, 3, "EOF");
                    }
                    throw new e(this.f13504g, 4, Character.valueOf(this.f13498a));
                }
                i9 = c8 - 'W';
            }
            i10 = i12 + i9;
        }
        return (char) i10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void r() {
        while (true) {
            char c8 = this.f13498a;
            if (c8 >= '0' && c8 <= '9') {
                n();
            } else {
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void s(boolean[] zArr) {
        while (true) {
            char c8 = this.f13498a;
            if (c8 != 26) {
                if (c8 < 0 || c8 >= '~' || !zArr[c8]) {
                    n();
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void t() {
        while (true) {
            char c8 = this.f13498a;
            if (c8 <= ' ' && c8 != 26) {
                n();
            } else {
                return;
            }
        }
    }
}
