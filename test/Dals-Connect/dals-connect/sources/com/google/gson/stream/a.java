package com.google.gson.stream;

import cm.aptoide.pt.account.AdultContentAnalytics;
import com.google.gson.t.f;
import com.google.gson.t.n.e;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;

/* compiled from: JsonReader.java */
/* loaded from: classes2.dex */
public class a implements Closeable {

    /* renamed from: f, reason: collision with root package name */
    private static final char[] f16849f = ")]}'\n".toCharArray();

    /* renamed from: g, reason: collision with root package name */
    private final Reader f16850g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f16851h = false;

    /* renamed from: i, reason: collision with root package name */
    private final char[] f16852i = new char[1024];

    /* renamed from: j, reason: collision with root package name */
    private int f16853j = 0;

    /* renamed from: k, reason: collision with root package name */
    private int f16854k = 0;
    private int l = 0;
    private int m = 0;
    int n = 0;
    private long o;
    private int p;
    private String q;
    private int[] r;
    private int s;
    private String[] t;
    private int[] u;

    /* compiled from: JsonReader.java */
    /* renamed from: com.google.gson.stream.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    static class C0201a extends f {
        C0201a() {
        }

        @Override // com.google.gson.t.f
        public void a(a aVar) throws IOException {
            if (aVar instanceof e) {
                ((e) aVar).M0();
                return;
            }
            int i2 = aVar.n;
            if (i2 == 0) {
                i2 = aVar.w();
            }
            if (i2 == 13) {
                aVar.n = 9;
                return;
            }
            if (i2 == 12) {
                aVar.n = 8;
                return;
            }
            if (i2 == 14) {
                aVar.n = 10;
                return;
            }
            throw new IllegalStateException("Expected a name but was " + aVar.x0() + aVar.Y());
        }
    }

    static {
        f.a = new C0201a();
    }

    public a(Reader reader) {
        int[] iArr = new int[32];
        this.r = iArr;
        this.s = 0;
        this.s = 0 + 1;
        iArr[0] = 6;
        this.t = new String[32];
        this.u = new int[32];
        if (reader != null) {
            this.f16850g = reader;
            return;
        }
        throw new NullPointerException("in == null");
    }

    private void A0(int i2) {
        int i3 = this.s;
        int[] iArr = this.r;
        if (i3 == iArr.length) {
            int[] iArr2 = new int[i3 * 2];
            int[] iArr3 = new int[i3 * 2];
            String[] strArr = new String[i3 * 2];
            System.arraycopy(iArr, 0, iArr2, 0, i3);
            System.arraycopy(this.u, 0, iArr3, 0, this.s);
            System.arraycopy(this.t, 0, strArr, 0, this.s);
            this.r = iArr2;
            this.u = iArr3;
            this.t = strArr;
        }
        int[] iArr4 = this.r;
        int i4 = this.s;
        this.s = i4 + 1;
        iArr4[i4] = i2;
    }

    private char B0() throws IOException {
        int i2;
        int i3;
        if (this.f16853j == this.f16854k && !J(1)) {
            throw I0("Unterminated escape sequence");
        }
        char[] cArr = this.f16852i;
        int i4 = this.f16853j;
        int i5 = i4 + 1;
        this.f16853j = i5;
        char c2 = cArr[i4];
        if (c2 == '\n') {
            this.l++;
            this.m = i5;
        } else if (c2 != '\"' && c2 != '\'' && c2 != '/' && c2 != '\\') {
            if (c2 == 'b') {
                return '\b';
            }
            if (c2 == 'f') {
                return '\f';
            }
            if (c2 == 'n') {
                return '\n';
            }
            if (c2 == 'r') {
                return '\r';
            }
            if (c2 == 't') {
                return '\t';
            }
            if (c2 == 'u') {
                if (i5 + 4 > this.f16854k && !J(4)) {
                    throw I0("Unterminated escape sequence");
                }
                char c3 = 0;
                int i6 = this.f16853j;
                int i7 = i6 + 4;
                while (i6 < i7) {
                    char c4 = this.f16852i[i6];
                    char c5 = (char) (c3 << 4);
                    if (c4 < '0' || c4 > '9') {
                        if (c4 >= 'a' && c4 <= 'f') {
                            i2 = c4 - 'a';
                        } else {
                            if (c4 < 'A' || c4 > 'F') {
                                throw new NumberFormatException("\\u" + new String(this.f16852i, this.f16853j, 4));
                            }
                            i2 = c4 - 'A';
                        }
                        i3 = i2 + 10;
                    } else {
                        i3 = c4 - '0';
                    }
                    c3 = (char) (c5 + i3);
                    i6++;
                }
                this.f16853j += 4;
                return c3;
            }
            throw I0("Invalid escape sequence");
        }
        return c2;
    }

    private void D0(char c2) throws IOException {
        char[] cArr = this.f16852i;
        do {
            int i2 = this.f16853j;
            int i3 = this.f16854k;
            while (i2 < i3) {
                int i4 = i2 + 1;
                char c3 = cArr[i2];
                if (c3 == c2) {
                    this.f16853j = i4;
                    return;
                }
                if (c3 == '\\') {
                    this.f16853j = i4;
                    B0();
                    i2 = this.f16853j;
                    i3 = this.f16854k;
                } else {
                    if (c3 == '\n') {
                        this.l++;
                        this.m = i4;
                    }
                    i2 = i4;
                }
            }
            this.f16853j = i2;
        } while (J(1));
        throw I0("Unterminated string");
    }

    private boolean E0(String str) throws IOException {
        int length = str.length();
        while (true) {
            if (this.f16853j + length > this.f16854k && !J(length)) {
                return false;
            }
            char[] cArr = this.f16852i;
            int i2 = this.f16853j;
            if (cArr[i2] != '\n') {
                for (int i3 = 0; i3 < length; i3++) {
                    if (this.f16852i[this.f16853j + i3] != str.charAt(i3)) {
                        break;
                    }
                }
                return true;
            }
            this.l++;
            this.m = i2 + 1;
            this.f16853j++;
        }
    }

    private void F0() throws IOException {
        char c2;
        do {
            if (this.f16853j >= this.f16854k && !J(1)) {
                return;
            }
            char[] cArr = this.f16852i;
            int i2 = this.f16853j;
            int i3 = i2 + 1;
            this.f16853j = i3;
            c2 = cArr[i2];
            if (c2 == '\n') {
                this.l++;
                this.m = i3;
                return;
            }
        } while (c2 != '\r');
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to find switch 'out' block (already processed)
        	at jadx.core.dex.visitors.regions.RegionMaker.calcSwitchOut(RegionMaker.java:923)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:797)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:157)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:735)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:735)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:735)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:740)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:740)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:735)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:735)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeEndlessLoop(RegionMaker.java:411)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:201)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:135)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:242)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:135)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    private void G0() throws java.io.IOException {
        /*
            r4 = this;
        L0:
            r0 = 0
        L1:
            int r1 = r4.f16853j
            int r2 = r1 + r0
            int r3 = r4.f16854k
            if (r2 >= r3) goto L51
            char[] r2 = r4.f16852i
            int r1 = r1 + r0
            char r1 = r2[r1]
            r2 = 9
            if (r1 == r2) goto L4b
            r2 = 10
            if (r1 == r2) goto L4b
            r2 = 12
            if (r1 == r2) goto L4b
            r2 = 13
            if (r1 == r2) goto L4b
            r2 = 32
            if (r1 == r2) goto L4b
            r2 = 35
            if (r1 == r2) goto L48
            r2 = 44
            if (r1 == r2) goto L4b
            r2 = 47
            if (r1 == r2) goto L48
            r2 = 61
            if (r1 == r2) goto L48
            r2 = 123(0x7b, float:1.72E-43)
            if (r1 == r2) goto L4b
            r2 = 125(0x7d, float:1.75E-43)
            if (r1 == r2) goto L4b
            r2 = 58
            if (r1 == r2) goto L4b
            r2 = 59
            if (r1 == r2) goto L48
            switch(r1) {
                case 91: goto L4b;
                case 92: goto L48;
                case 93: goto L4b;
                default: goto L45;
            }
        L45:
            int r0 = r0 + 1
            goto L1
        L48:
            r4.f()
        L4b:
            int r1 = r4.f16853j
            int r1 = r1 + r0
            r4.f16853j = r1
            return
        L51:
            int r1 = r1 + r0
            r4.f16853j = r1
            r0 = 1
            boolean r0 = r4.J(r0)
            if (r0 != 0) goto L0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.stream.a.G0():void");
    }

    private IOException I0(String str) throws IOException {
        throw new MalformedJsonException(str + Y());
    }

    private boolean J(int i2) throws IOException {
        int i3;
        int i4;
        char[] cArr = this.f16852i;
        int i5 = this.m;
        int i6 = this.f16853j;
        this.m = i5 - i6;
        int i7 = this.f16854k;
        if (i7 != i6) {
            int i8 = i7 - i6;
            this.f16854k = i8;
            System.arraycopy(cArr, i6, cArr, 0, i8);
        } else {
            this.f16854k = 0;
        }
        this.f16853j = 0;
        do {
            Reader reader = this.f16850g;
            int i9 = this.f16854k;
            int read = reader.read(cArr, i9, cArr.length - i9);
            if (read == -1) {
                return false;
            }
            i3 = this.f16854k + read;
            this.f16854k = i3;
            if (this.l == 0 && (i4 = this.m) == 0 && i3 > 0 && cArr[0] == 65279) {
                this.f16853j++;
                this.m = i4 + 1;
                i2++;
            }
        } while (i3 < i2);
        return true;
    }

    private boolean T(char c2) throws IOException {
        if (c2 == '\t' || c2 == '\n' || c2 == '\f' || c2 == '\r' || c2 == ' ') {
            return false;
        }
        if (c2 != '#') {
            if (c2 == ',') {
                return false;
            }
            if (c2 != '/' && c2 != '=') {
                if (c2 == '{' || c2 == '}' || c2 == ':') {
                    return false;
                }
                if (c2 != ';') {
                    switch (c2) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        f();
        return false;
    }

    private void f() throws IOException {
        if (!this.f16851h) {
            throw I0("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    private void o() throws IOException {
        s0(true);
        int i2 = this.f16853j - 1;
        this.f16853j = i2;
        char[] cArr = f16849f;
        if (i2 + cArr.length > this.f16854k && !J(cArr.length)) {
            return;
        }
        int i3 = 0;
        while (true) {
            char[] cArr2 = f16849f;
            if (i3 < cArr2.length) {
                if (this.f16852i[this.f16853j + i3] != cArr2[i3]) {
                    return;
                } else {
                    i3++;
                }
            } else {
                this.f16853j += cArr2.length;
                return;
            }
        }
    }

    private int s0(boolean z) throws IOException {
        char[] cArr = this.f16852i;
        int i2 = this.f16853j;
        int i3 = this.f16854k;
        while (true) {
            if (i2 == i3) {
                this.f16853j = i2;
                if (!J(1)) {
                    if (!z) {
                        return -1;
                    }
                    throw new EOFException("End of input" + Y());
                }
                i2 = this.f16853j;
                i3 = this.f16854k;
            }
            int i4 = i2 + 1;
            char c2 = cArr[i2];
            if (c2 == '\n') {
                this.l++;
                this.m = i4;
            } else if (c2 != ' ' && c2 != '\r' && c2 != '\t') {
                if (c2 == '/') {
                    this.f16853j = i4;
                    if (i4 == i3) {
                        this.f16853j = i4 - 1;
                        boolean J = J(2);
                        this.f16853j++;
                        if (!J) {
                            return c2;
                        }
                    }
                    f();
                    int i5 = this.f16853j;
                    char c3 = cArr[i5];
                    if (c3 == '*') {
                        this.f16853j = i5 + 1;
                        if (E0("*/")) {
                            i2 = this.f16853j + 2;
                            i3 = this.f16854k;
                        } else {
                            throw I0("Unterminated comment");
                        }
                    } else {
                        if (c3 != '/') {
                            return c2;
                        }
                        this.f16853j = i5 + 1;
                        F0();
                        i2 = this.f16853j;
                        i3 = this.f16854k;
                    }
                } else if (c2 == '#') {
                    this.f16853j = i4;
                    f();
                    F0();
                    i2 = this.f16853j;
                    i3 = this.f16854k;
                } else {
                    this.f16853j = i4;
                    return c2;
                }
            }
            i2 = i4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x005c, code lost:
    
        if (r1 != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x005e, code lost:
    
        r1 = new java.lang.StringBuilder(java.lang.Math.max((r2 - r3) * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x006c, code lost:
    
        r1.append(r0, r3, r2 - r3);
        r9.f16853j = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String u0(char r10) throws java.io.IOException {
        /*
            r9 = this;
            char[] r0 = r9.f16852i
            r1 = 0
        L3:
            int r2 = r9.f16853j
            int r3 = r9.f16854k
        L7:
            r4 = r3
            r3 = r2
        L9:
            r5 = 16
            r6 = 1
            if (r2 >= r4) goto L5c
            int r7 = r2 + 1
            char r2 = r0[r2]
            if (r2 != r10) goto L28
            r9.f16853j = r7
            int r7 = r7 - r3
            int r7 = r7 - r6
            if (r1 != 0) goto L20
            java.lang.String r10 = new java.lang.String
            r10.<init>(r0, r3, r7)
            return r10
        L20:
            r1.append(r0, r3, r7)
            java.lang.String r10 = r1.toString()
            return r10
        L28:
            r8 = 92
            if (r2 != r8) goto L4f
            r9.f16853j = r7
            int r7 = r7 - r3
            int r7 = r7 - r6
            if (r1 != 0) goto L40
            int r1 = r7 + 1
            int r1 = r1 * 2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r1 = java.lang.Math.max(r1, r5)
            r2.<init>(r1)
            r1 = r2
        L40:
            r1.append(r0, r3, r7)
            char r2 = r9.B0()
            r1.append(r2)
            int r2 = r9.f16853j
            int r3 = r9.f16854k
            goto L7
        L4f:
            r5 = 10
            if (r2 != r5) goto L5a
            int r2 = r9.l
            int r2 = r2 + r6
            r9.l = r2
            r9.m = r7
        L5a:
            r2 = r7
            goto L9
        L5c:
            if (r1 != 0) goto L6c
            int r1 = r2 - r3
            int r1 = r1 * 2
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r1 = java.lang.Math.max(r1, r5)
            r4.<init>(r1)
            r1 = r4
        L6c:
            int r4 = r2 - r3
            r1.append(r0, r3, r4)
            r9.f16853j = r2
            boolean r2 = r9.J(r6)
            if (r2 == 0) goto L7a
            goto L3
        L7a:
            java.lang.String r10 = "Unterminated string"
            java.io.IOException r10 = r9.I0(r10)
            goto L82
        L81:
            throw r10
        L82:
            goto L81
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.stream.a.u0(char):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x004a, code lost:
    
        f();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:54:0x0044. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String w0() throws java.io.IOException {
        /*
            r6 = this;
            r0 = 0
            r1 = 0
        L2:
            r2 = 0
        L3:
            int r3 = r6.f16853j
            int r4 = r3 + r2
            int r5 = r6.f16854k
            if (r4 >= r5) goto L4e
            char[] r4 = r6.f16852i
            int r3 = r3 + r2
            char r3 = r4[r3]
            r4 = 9
            if (r3 == r4) goto L5c
            r4 = 10
            if (r3 == r4) goto L5c
            r4 = 12
            if (r3 == r4) goto L5c
            r4 = 13
            if (r3 == r4) goto L5c
            r4 = 32
            if (r3 == r4) goto L5c
            r4 = 35
            if (r3 == r4) goto L4a
            r4 = 44
            if (r3 == r4) goto L5c
            r4 = 47
            if (r3 == r4) goto L4a
            r4 = 61
            if (r3 == r4) goto L4a
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L5c
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L5c
            r4 = 58
            if (r3 == r4) goto L5c
            r4 = 59
            if (r3 == r4) goto L4a
            switch(r3) {
                case 91: goto L5c;
                case 92: goto L4a;
                case 93: goto L5c;
                default: goto L47;
            }
        L47:
            int r2 = r2 + 1
            goto L3
        L4a:
            r6.f()
            goto L5c
        L4e:
            char[] r3 = r6.f16852i
            int r3 = r3.length
            if (r2 >= r3) goto L5e
            int r3 = r2 + 1
            boolean r3 = r6.J(r3)
            if (r3 == 0) goto L5c
            goto L3
        L5c:
            r0 = r2
            goto L7e
        L5e:
            if (r1 != 0) goto L6b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r2, r3)
            r1.<init>(r3)
        L6b:
            char[] r3 = r6.f16852i
            int r4 = r6.f16853j
            r1.append(r3, r4, r2)
            int r3 = r6.f16853j
            int r3 = r3 + r2
            r6.f16853j = r3
            r2 = 1
            boolean r2 = r6.J(r2)
            if (r2 != 0) goto L2
        L7e:
            if (r1 != 0) goto L8a
            java.lang.String r1 = new java.lang.String
            char[] r2 = r6.f16852i
            int r3 = r6.f16853j
            r1.<init>(r2, r3, r0)
            goto L95
        L8a:
            char[] r2 = r6.f16852i
            int r3 = r6.f16853j
            r1.append(r2, r3, r0)
            java.lang.String r1 = r1.toString()
        L95:
            int r2 = r6.f16853j
            int r2 = r2 + r0
            r6.f16853j = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.stream.a.w0():java.lang.String");
    }

    private int y0() throws IOException {
        int i2;
        String str;
        String str2;
        char c2 = this.f16852i[this.f16853j];
        if (c2 == 't' || c2 == 'T') {
            i2 = 5;
            str = "true";
            str2 = "TRUE";
        } else if (c2 == 'f' || c2 == 'F') {
            i2 = 6;
            str = AdultContentAnalytics.UNLOCK;
            str2 = "FALSE";
        } else {
            if (c2 != 'n' && c2 != 'N') {
                return 0;
            }
            i2 = 7;
            str = "null";
            str2 = "NULL";
        }
        int length = str.length();
        for (int i3 = 1; i3 < length; i3++) {
            if (this.f16853j + i3 >= this.f16854k && !J(i3 + 1)) {
                return 0;
            }
            char c3 = this.f16852i[this.f16853j + i3];
            if (c3 != str.charAt(i3) && c3 != str2.charAt(i3)) {
                return 0;
            }
        }
        if ((this.f16853j + length < this.f16854k || J(length + 1)) && T(this.f16852i[this.f16853j + length])) {
            return 0;
        }
        this.f16853j += length;
        this.n = i2;
        return i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0099, code lost:
    
        if (r9 != 2) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x009b, code lost:
    
        if (r10 == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00a1, code lost:
    
        if (r11 != Long.MIN_VALUE) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00a3, code lost:
    
        if (r13 == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00a9, code lost:
    
        if (r11 != 0) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00ab, code lost:
    
        if (r13 != false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00ad, code lost:
    
        if (r13 == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00b0, code lost:
    
        r11 = -r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00b1, code lost:
    
        r18.o = r11;
        r18.f16853j += r8;
        r18.n = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00bc, code lost:
    
        return 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00bd, code lost:
    
        if (r9 == 2) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00c0, code lost:
    
        if (r9 == 4) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c3, code lost:
    
        if (r9 != 7) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c6, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c8, code lost:
    
        r18.p = r8;
        r18.n = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ce, code lost:
    
        return 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0097, code lost:
    
        if (T(r14) != false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00cf, code lost:
    
        return 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int z0() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.stream.a.z0():int");
    }

    public final void C0(boolean z) {
        this.f16851h = z;
    }

    public void D() throws IOException {
        int i2 = this.n;
        if (i2 == 0) {
            i2 = w();
        }
        if (i2 == 2) {
            int i3 = this.s - 1;
            this.s = i3;
            this.t[i3] = null;
            int[] iArr = this.u;
            int i4 = i3 - 1;
            iArr[i4] = iArr[i4] + 1;
            this.n = 0;
            return;
        }
        throw new IllegalStateException("Expected END_OBJECT but was " + x0() + Y());
    }

    public void H0() throws IOException {
        int i2 = 0;
        do {
            int i3 = this.n;
            if (i3 == 0) {
                i3 = w();
            }
            if (i3 == 3) {
                A0(1);
            } else if (i3 == 1) {
                A0(3);
            } else {
                if (i3 == 4) {
                    this.s--;
                } else if (i3 == 2) {
                    this.s--;
                } else {
                    if (i3 == 14 || i3 == 10) {
                        G0();
                    } else if (i3 == 8 || i3 == 12) {
                        D0('\'');
                    } else if (i3 == 9 || i3 == 13) {
                        D0('\"');
                    } else if (i3 == 16) {
                        this.f16853j += this.p;
                    }
                    this.n = 0;
                }
                i2--;
                this.n = 0;
            }
            i2++;
            this.n = 0;
        } while (i2 != 0);
        int[] iArr = this.u;
        int i4 = this.s;
        int i5 = i4 - 1;
        iArr[i5] = iArr[i5] + 1;
        this.t[i4 - 1] = "null";
    }

    public boolean L() throws IOException {
        int i2 = this.n;
        if (i2 == 0) {
            i2 = w();
        }
        return (i2 == 2 || i2 == 4) ? false : true;
    }

    public final boolean P() {
        return this.f16851h;
    }

    String Y() {
        return " at line " + (this.l + 1) + " column " + ((this.f16853j - this.m) + 1) + " path " + c();
    }

    public void a() throws IOException {
        int i2 = this.n;
        if (i2 == 0) {
            i2 = w();
        }
        if (i2 == 3) {
            A0(1);
            this.u[this.s - 1] = 0;
            this.n = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_ARRAY but was " + x0() + Y());
        }
    }

    public void b() throws IOException {
        int i2 = this.n;
        if (i2 == 0) {
            i2 = w();
        }
        if (i2 == 1) {
            A0(3);
            this.n = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_OBJECT but was " + x0() + Y());
        }
    }

    public String c() {
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        int i2 = this.s;
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = this.r[i3];
            if (i4 == 1 || i4 == 2) {
                sb.append('[');
                sb.append(this.u[i3]);
                sb.append(']');
            } else if (i4 == 3 || i4 == 4 || i4 == 5) {
                sb.append('.');
                String[] strArr = this.t;
                if (strArr[i3] != null) {
                    sb.append(strArr[i3]);
                }
            }
        }
        return sb.toString();
    }

    public boolean c0() throws IOException {
        int i2 = this.n;
        if (i2 == 0) {
            i2 = w();
        }
        if (i2 == 5) {
            this.n = 0;
            int[] iArr = this.u;
            int i3 = this.s - 1;
            iArr[i3] = iArr[i3] + 1;
            return true;
        }
        if (i2 == 6) {
            this.n = 0;
            int[] iArr2 = this.u;
            int i4 = this.s - 1;
            iArr2[i4] = iArr2[i4] + 1;
            return false;
        }
        throw new IllegalStateException("Expected a boolean but was " + x0() + Y());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.n = 0;
        this.r[0] = 8;
        this.s = 1;
        this.f16850g.close();
    }

    public double g0() throws IOException {
        int i2 = this.n;
        if (i2 == 0) {
            i2 = w();
        }
        if (i2 == 15) {
            this.n = 0;
            int[] iArr = this.u;
            int i3 = this.s - 1;
            iArr[i3] = iArr[i3] + 1;
            return this.o;
        }
        if (i2 == 16) {
            this.q = new String(this.f16852i, this.f16853j, this.p);
            this.f16853j += this.p;
        } else if (i2 == 8 || i2 == 9) {
            this.q = u0(i2 == 8 ? '\'' : '\"');
        } else if (i2 == 10) {
            this.q = w0();
        } else if (i2 != 11) {
            throw new IllegalStateException("Expected a double but was " + x0() + Y());
        }
        this.n = 11;
        double parseDouble = Double.parseDouble(this.q);
        if (!this.f16851h && (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble))) {
            throw new MalformedJsonException("JSON forbids NaN and infinities: " + parseDouble + Y());
        }
        this.q = null;
        this.n = 0;
        int[] iArr2 = this.u;
        int i4 = this.s - 1;
        iArr2[i4] = iArr2[i4] + 1;
        return parseDouble;
    }

    public int i0() throws IOException {
        int i2 = this.n;
        if (i2 == 0) {
            i2 = w();
        }
        if (i2 == 15) {
            long j2 = this.o;
            int i3 = (int) j2;
            if (j2 == i3) {
                this.n = 0;
                int[] iArr = this.u;
                int i4 = this.s - 1;
                iArr[i4] = iArr[i4] + 1;
                return i3;
            }
            throw new NumberFormatException("Expected an int but was " + this.o + Y());
        }
        if (i2 == 16) {
            this.q = new String(this.f16852i, this.f16853j, this.p);
            this.f16853j += this.p;
        } else {
            if (i2 != 8 && i2 != 9 && i2 != 10) {
                throw new IllegalStateException("Expected an int but was " + x0() + Y());
            }
            if (i2 == 10) {
                this.q = w0();
            } else {
                this.q = u0(i2 == 8 ? '\'' : '\"');
            }
            try {
                int parseInt = Integer.parseInt(this.q);
                this.n = 0;
                int[] iArr2 = this.u;
                int i5 = this.s - 1;
                iArr2[i5] = iArr2[i5] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }
        this.n = 11;
        double parseDouble = Double.parseDouble(this.q);
        int i6 = (int) parseDouble;
        if (i6 == parseDouble) {
            this.q = null;
            this.n = 0;
            int[] iArr3 = this.u;
            int i7 = this.s - 1;
            iArr3[i7] = iArr3[i7] + 1;
            return i6;
        }
        throw new NumberFormatException("Expected an int but was " + this.q + Y());
    }

    public long k0() throws IOException {
        int i2 = this.n;
        if (i2 == 0) {
            i2 = w();
        }
        if (i2 == 15) {
            this.n = 0;
            int[] iArr = this.u;
            int i3 = this.s - 1;
            iArr[i3] = iArr[i3] + 1;
            return this.o;
        }
        if (i2 == 16) {
            this.q = new String(this.f16852i, this.f16853j, this.p);
            this.f16853j += this.p;
        } else {
            if (i2 != 8 && i2 != 9 && i2 != 10) {
                throw new IllegalStateException("Expected a long but was " + x0() + Y());
            }
            if (i2 == 10) {
                this.q = w0();
            } else {
                this.q = u0(i2 == 8 ? '\'' : '\"');
            }
            try {
                long parseLong = Long.parseLong(this.q);
                this.n = 0;
                int[] iArr2 = this.u;
                int i4 = this.s - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        this.n = 11;
        double parseDouble = Double.parseDouble(this.q);
        long j2 = (long) parseDouble;
        if (j2 == parseDouble) {
            this.q = null;
            this.n = 0;
            int[] iArr3 = this.u;
            int i5 = this.s - 1;
            iArr3[i5] = iArr3[i5] + 1;
            return j2;
        }
        throw new NumberFormatException("Expected a long but was " + this.q + Y());
    }

    public String q0() throws IOException {
        String u0;
        int i2 = this.n;
        if (i2 == 0) {
            i2 = w();
        }
        if (i2 == 14) {
            u0 = w0();
        } else if (i2 == 12) {
            u0 = u0('\'');
        } else if (i2 == 13) {
            u0 = u0('\"');
        } else {
            throw new IllegalStateException("Expected a name but was " + x0() + Y());
        }
        this.n = 0;
        this.t[this.s - 1] = u0;
        return u0;
    }

    public void t0() throws IOException {
        int i2 = this.n;
        if (i2 == 0) {
            i2 = w();
        }
        if (i2 == 7) {
            this.n = 0;
            int[] iArr = this.u;
            int i3 = this.s - 1;
            iArr[i3] = iArr[i3] + 1;
            return;
        }
        throw new IllegalStateException("Expected null but was " + x0() + Y());
    }

    public String toString() {
        return getClass().getSimpleName() + Y();
    }

    public String v0() throws IOException {
        String str;
        int i2 = this.n;
        if (i2 == 0) {
            i2 = w();
        }
        if (i2 == 10) {
            str = w0();
        } else if (i2 == 8) {
            str = u0('\'');
        } else if (i2 == 9) {
            str = u0('\"');
        } else if (i2 == 11) {
            str = this.q;
            this.q = null;
        } else if (i2 == 15) {
            str = Long.toString(this.o);
        } else if (i2 == 16) {
            str = new String(this.f16852i, this.f16853j, this.p);
            this.f16853j += this.p;
        } else {
            throw new IllegalStateException("Expected a string but was " + x0() + Y());
        }
        this.n = 0;
        int[] iArr = this.u;
        int i3 = this.s - 1;
        iArr[i3] = iArr[i3] + 1;
        return str;
    }

    int w() throws IOException {
        int s0;
        int[] iArr = this.r;
        int i2 = this.s;
        int i3 = iArr[i2 - 1];
        if (i3 == 1) {
            iArr[i2 - 1] = 2;
        } else if (i3 == 2) {
            int s02 = s0(true);
            if (s02 != 44) {
                if (s02 != 59) {
                    if (s02 == 93) {
                        this.n = 4;
                        return 4;
                    }
                    throw I0("Unterminated array");
                }
                f();
            }
        } else {
            if (i3 == 3 || i3 == 5) {
                iArr[i2 - 1] = 4;
                if (i3 == 5 && (s0 = s0(true)) != 44) {
                    if (s0 != 59) {
                        if (s0 == 125) {
                            this.n = 2;
                            return 2;
                        }
                        throw I0("Unterminated object");
                    }
                    f();
                }
                int s03 = s0(true);
                if (s03 == 34) {
                    this.n = 13;
                    return 13;
                }
                if (s03 == 39) {
                    f();
                    this.n = 12;
                    return 12;
                }
                if (s03 == 125) {
                    if (i3 != 5) {
                        this.n = 2;
                        return 2;
                    }
                    throw I0("Expected name");
                }
                f();
                this.f16853j--;
                if (T((char) s03)) {
                    this.n = 14;
                    return 14;
                }
                throw I0("Expected name");
            }
            if (i3 == 4) {
                iArr[i2 - 1] = 5;
                int s04 = s0(true);
                if (s04 != 58) {
                    if (s04 == 61) {
                        f();
                        if (this.f16853j < this.f16854k || J(1)) {
                            char[] cArr = this.f16852i;
                            int i4 = this.f16853j;
                            if (cArr[i4] == '>') {
                                this.f16853j = i4 + 1;
                            }
                        }
                    } else {
                        throw I0("Expected ':'");
                    }
                }
            } else if (i3 == 6) {
                if (this.f16851h) {
                    o();
                }
                this.r[this.s - 1] = 7;
            } else if (i3 == 7) {
                if (s0(false) == -1) {
                    this.n = 17;
                    return 17;
                }
                f();
                this.f16853j--;
            } else if (i3 == 8) {
                throw new IllegalStateException("JsonReader is closed");
            }
        }
        int s05 = s0(true);
        if (s05 == 34) {
            this.n = 9;
            return 9;
        }
        if (s05 == 39) {
            f();
            this.n = 8;
            return 8;
        }
        if (s05 != 44 && s05 != 59) {
            if (s05 == 91) {
                this.n = 3;
                return 3;
            }
            if (s05 != 93) {
                if (s05 != 123) {
                    this.f16853j--;
                    int y0 = y0();
                    if (y0 != 0) {
                        return y0;
                    }
                    int z0 = z0();
                    if (z0 != 0) {
                        return z0;
                    }
                    if (T(this.f16852i[this.f16853j])) {
                        f();
                        this.n = 10;
                        return 10;
                    }
                    throw I0("Expected value");
                }
                this.n = 1;
                return 1;
            }
            if (i3 == 1) {
                this.n = 4;
                return 4;
            }
        }
        if (i3 != 1 && i3 != 2) {
            throw I0("Unexpected value");
        }
        f();
        this.f16853j--;
        this.n = 7;
        return 7;
    }

    public b x0() throws IOException {
        int i2 = this.n;
        if (i2 == 0) {
            i2 = w();
        }
        switch (i2) {
            case 1:
                return b.BEGIN_OBJECT;
            case 2:
                return b.END_OBJECT;
            case 3:
                return b.BEGIN_ARRAY;
            case 4:
                return b.END_ARRAY;
            case 5:
            case 6:
                return b.BOOLEAN;
            case 7:
                return b.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return b.STRING;
            case 12:
            case 13:
            case 14:
                return b.NAME;
            case 15:
            case 16:
                return b.NUMBER;
            case 17:
                return b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    public void z() throws IOException {
        int i2 = this.n;
        if (i2 == 0) {
            i2 = w();
        }
        if (i2 == 4) {
            int i3 = this.s - 1;
            this.s = i3;
            int[] iArr = this.u;
            int i4 = i3 - 1;
            iArr[i4] = iArr[i4] + 1;
            this.n = 0;
            return;
        }
        throw new IllegalStateException("Expected END_ARRAY but was " + x0() + Y());
    }
}
