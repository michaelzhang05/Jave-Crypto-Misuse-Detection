package io.sentry.vendor.gson.stream;

import cm.aptoide.pt.account.AdultContentAnalytics;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: JsonReader.java */
@ApiStatus.Internal
/* loaded from: classes2.dex */
public class a implements Closeable {

    /* renamed from: f, reason: collision with root package name */
    private final Reader f19311f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f19312g = false;

    /* renamed from: h, reason: collision with root package name */
    private final char[] f19313h = new char[1024];

    /* renamed from: i, reason: collision with root package name */
    private int f19314i = 0;

    /* renamed from: j, reason: collision with root package name */
    private int f19315j = 0;

    /* renamed from: k, reason: collision with root package name */
    private int f19316k = 0;
    private int l = 0;
    int m = 0;
    private long n;
    private int o;
    private String p;
    private int[] q;
    private int r;
    private String[] s;
    private int[] t;

    public a(Reader reader) {
        int[] iArr = new int[32];
        this.q = iArr;
        this.r = 0;
        this.r = 0 + 1;
        iArr[0] = 6;
        this.s = new String[32];
        this.t = new int[32];
        if (reader != null) {
            this.f19311f = reader;
            return;
        }
        throw new NullPointerException("in == null");
    }

    private char A0() throws IOException {
        int i2;
        int i3;
        if (this.f19314i == this.f19315j && !J(1)) {
            throw G0("Unterminated escape sequence");
        }
        char[] cArr = this.f19313h;
        int i4 = this.f19314i;
        int i5 = i4 + 1;
        this.f19314i = i5;
        char c2 = cArr[i4];
        if (c2 == '\n') {
            this.f19316k++;
            this.l = i5;
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
                if (i5 + 4 > this.f19315j && !J(4)) {
                    throw G0("Unterminated escape sequence");
                }
                char c3 = 0;
                int i6 = this.f19314i;
                int i7 = i6 + 4;
                while (i6 < i7) {
                    char c4 = this.f19313h[i6];
                    char c5 = (char) (c3 << 4);
                    if (c4 < '0' || c4 > '9') {
                        if (c4 >= 'a' && c4 <= 'f') {
                            i2 = c4 - 'a';
                        } else {
                            if (c4 < 'A' || c4 > 'F') {
                                throw new NumberFormatException("\\u" + new String(this.f19313h, this.f19314i, 4));
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
                this.f19314i += 4;
                return c3;
            }
            throw G0("Invalid escape sequence");
        }
        return c2;
    }

    private void B0(char c2) throws IOException {
        char[] cArr = this.f19313h;
        do {
            int i2 = this.f19314i;
            int i3 = this.f19315j;
            while (i2 < i3) {
                int i4 = i2 + 1;
                char c3 = cArr[i2];
                if (c3 == c2) {
                    this.f19314i = i4;
                    return;
                }
                if (c3 == '\\') {
                    this.f19314i = i4;
                    A0();
                    i2 = this.f19314i;
                    i3 = this.f19315j;
                } else {
                    if (c3 == '\n') {
                        this.f19316k++;
                        this.l = i4;
                    }
                    i2 = i4;
                }
            }
            this.f19314i = i2;
        } while (J(1));
        throw G0("Unterminated string");
    }

    private boolean C0(String str) throws IOException {
        int length = str.length();
        while (true) {
            if (this.f19314i + length > this.f19315j && !J(length)) {
                return false;
            }
            char[] cArr = this.f19313h;
            int i2 = this.f19314i;
            if (cArr[i2] != '\n') {
                for (int i3 = 0; i3 < length; i3++) {
                    if (this.f19313h[this.f19314i + i3] != str.charAt(i3)) {
                        break;
                    }
                }
                return true;
            }
            this.f19316k++;
            this.l = i2 + 1;
            this.f19314i++;
        }
    }

    private void D0() throws IOException {
        char c2;
        do {
            if (this.f19314i >= this.f19315j && !J(1)) {
                return;
            }
            char[] cArr = this.f19313h;
            int i2 = this.f19314i;
            int i3 = i2 + 1;
            this.f19314i = i3;
            c2 = cArr[i2];
            if (c2 == '\n') {
                this.f19316k++;
                this.l = i3;
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
    private void E0() throws java.io.IOException {
        /*
            r4 = this;
        L0:
            r0 = 0
        L1:
            int r1 = r4.f19314i
            int r2 = r1 + r0
            int r3 = r4.f19315j
            if (r2 >= r3) goto L51
            char[] r2 = r4.f19313h
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
            int r1 = r4.f19314i
            int r1 = r1 + r0
            r4.f19314i = r1
            return
        L51:
            int r1 = r1 + r0
            r4.f19314i = r1
            r0 = 1
            boolean r0 = r4.J(r0)
            if (r0 != 0) goto L0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.vendor.gson.stream.a.E0():void");
    }

    private IOException G0(String str) throws IOException {
        throw new MalformedJsonException(str + T());
    }

    private boolean J(int i2) throws IOException {
        int i3;
        int i4;
        char[] cArr = this.f19313h;
        int i5 = this.l;
        int i6 = this.f19314i;
        this.l = i5 - i6;
        int i7 = this.f19315j;
        if (i7 != i6) {
            int i8 = i7 - i6;
            this.f19315j = i8;
            System.arraycopy(cArr, i6, cArr, 0, i8);
        } else {
            this.f19315j = 0;
        }
        this.f19314i = 0;
        do {
            Reader reader = this.f19311f;
            int i9 = this.f19315j;
            int read = reader.read(cArr, i9, cArr.length - i9);
            if (read == -1) {
                return false;
            }
            i3 = this.f19315j + read;
            this.f19315j = i3;
            if (this.f19316k == 0 && (i4 = this.l) == 0 && i3 > 0 && cArr[0] == 65279) {
                this.f19314i++;
                this.l = i4 + 1;
                i2++;
            }
        } while (i3 < i2);
        return true;
    }

    private boolean P(char c2) throws IOException {
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
        if (!this.f19312g) {
            throw G0("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    private void o() throws IOException {
        q0(true);
        int i2 = this.f19314i - 1;
        this.f19314i = i2;
        if (i2 + 5 <= this.f19315j || J(5)) {
            char[] cArr = this.f19313h;
            if (cArr[i2] == ')' && cArr[i2 + 1] == ']' && cArr[i2 + 2] == '}' && cArr[i2 + 3] == '\'' && cArr[i2 + 4] == '\n') {
                this.f19314i += 5;
            }
        }
    }

    private int q0(boolean z) throws IOException {
        char[] cArr = this.f19313h;
        int i2 = this.f19314i;
        int i3 = this.f19315j;
        while (true) {
            if (i2 == i3) {
                this.f19314i = i2;
                if (!J(1)) {
                    if (!z) {
                        return -1;
                    }
                    throw new EOFException("End of input" + T());
                }
                i2 = this.f19314i;
                i3 = this.f19315j;
            }
            int i4 = i2 + 1;
            char c2 = cArr[i2];
            if (c2 == '\n') {
                this.f19316k++;
                this.l = i4;
            } else if (c2 != ' ' && c2 != '\r' && c2 != '\t') {
                if (c2 == '/') {
                    this.f19314i = i4;
                    if (i4 == i3) {
                        this.f19314i = i4 - 1;
                        boolean J = J(2);
                        this.f19314i++;
                        if (!J) {
                            return c2;
                        }
                    }
                    f();
                    int i5 = this.f19314i;
                    char c3 = cArr[i5];
                    if (c3 == '*') {
                        this.f19314i = i5 + 1;
                        if (C0("*/")) {
                            i2 = this.f19314i + 2;
                            i3 = this.f19315j;
                        } else {
                            throw G0("Unterminated comment");
                        }
                    } else {
                        if (c3 != '/') {
                            return c2;
                        }
                        this.f19314i = i5 + 1;
                        D0();
                        i2 = this.f19314i;
                        i3 = this.f19315j;
                    }
                } else if (c2 == '#') {
                    this.f19314i = i4;
                    f();
                    D0();
                    i2 = this.f19314i;
                    i3 = this.f19315j;
                } else {
                    this.f19314i = i4;
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
        r9.f19314i = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String t0(char r10) throws java.io.IOException {
        /*
            r9 = this;
            char[] r0 = r9.f19313h
            r1 = 0
        L3:
            int r2 = r9.f19314i
            int r3 = r9.f19315j
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
            r9.f19314i = r7
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
            r9.f19314i = r7
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
            char r2 = r9.A0()
            r1.append(r2)
            int r2 = r9.f19314i
            int r3 = r9.f19315j
            goto L7
        L4f:
            r5 = 10
            if (r2 != r5) goto L5a
            int r2 = r9.f19316k
            int r2 = r2 + r6
            r9.f19316k = r2
            r9.l = r7
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
            r9.f19314i = r2
            boolean r2 = r9.J(r6)
            if (r2 == 0) goto L7a
            goto L3
        L7a:
            java.lang.String r10 = "Unterminated string"
            java.io.IOException r10 = r9.G0(r10)
            goto L82
        L81:
            throw r10
        L82:
            goto L81
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.vendor.gson.stream.a.t0(char):java.lang.String");
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
    private java.lang.String v0() throws java.io.IOException {
        /*
            r6 = this;
            r0 = 0
            r1 = 0
        L2:
            r2 = 0
        L3:
            int r3 = r6.f19314i
            int r4 = r3 + r2
            int r5 = r6.f19315j
            if (r4 >= r5) goto L4e
            char[] r4 = r6.f19313h
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
            char[] r3 = r6.f19313h
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
            char[] r3 = r6.f19313h
            int r4 = r6.f19314i
            r1.append(r3, r4, r2)
            int r3 = r6.f19314i
            int r3 = r3 + r2
            r6.f19314i = r3
            r2 = 1
            boolean r2 = r6.J(r2)
            if (r2 != 0) goto L2
        L7e:
            if (r1 != 0) goto L8a
            java.lang.String r1 = new java.lang.String
            char[] r2 = r6.f19313h
            int r3 = r6.f19314i
            r1.<init>(r2, r3, r0)
            goto L95
        L8a:
            char[] r2 = r6.f19313h
            int r3 = r6.f19314i
            r1.append(r2, r3, r0)
            java.lang.String r1 = r1.toString()
        L95:
            int r2 = r6.f19314i
            int r2 = r2 + r0
            r6.f19314i = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.vendor.gson.stream.a.v0():java.lang.String");
    }

    private int x0() throws IOException {
        int i2;
        String str;
        String str2;
        char c2 = this.f19313h[this.f19314i];
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
            if (this.f19314i + i3 >= this.f19315j && !J(i3 + 1)) {
                return 0;
            }
            char c3 = this.f19313h[this.f19314i + i3];
            if (c3 != str.charAt(i3) && c3 != str2.charAt(i3)) {
                return 0;
            }
        }
        if ((this.f19314i + length < this.f19315j || J(length + 1)) && P(this.f19313h[this.f19314i + length])) {
            return 0;
        }
        this.f19314i += length;
        this.m = i2;
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
    
        r18.n = r11;
        r18.f19314i += r8;
        r18.m = 15;
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
    
        r18.o = r8;
        r18.m = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ce, code lost:
    
        return 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0097, code lost:
    
        if (P(r14) != false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00cf, code lost:
    
        return 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int y0() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.vendor.gson.stream.a.y0():int");
    }

    private void z0(int i2) {
        int i3 = this.r;
        int[] iArr = this.q;
        if (i3 == iArr.length) {
            int i4 = i3 * 2;
            this.q = Arrays.copyOf(iArr, i4);
            this.t = Arrays.copyOf(this.t, i4);
            this.s = (String[]) Arrays.copyOf(this.s, i4);
        }
        int[] iArr2 = this.q;
        int i5 = this.r;
        this.r = i5 + 1;
        iArr2[i5] = i2;
    }

    public void D() throws IOException {
        int i2 = this.m;
        if (i2 == 0) {
            i2 = w();
        }
        if (i2 == 2) {
            int i3 = this.r - 1;
            this.r = i3;
            this.s[i3] = null;
            int[] iArr = this.t;
            int i4 = i3 - 1;
            iArr[i4] = iArr[i4] + 1;
            this.m = 0;
            return;
        }
        throw new IllegalStateException("Expected END_OBJECT but was " + w0() + T());
    }

    public void F0() throws IOException {
        int i2 = 0;
        do {
            int i3 = this.m;
            if (i3 == 0) {
                i3 = w();
            }
            if (i3 == 3) {
                z0(1);
            } else if (i3 == 1) {
                z0(3);
            } else {
                if (i3 == 4) {
                    this.r--;
                } else if (i3 == 2) {
                    this.r--;
                } else {
                    if (i3 == 14 || i3 == 10) {
                        E0();
                    } else if (i3 == 8 || i3 == 12) {
                        B0('\'');
                    } else if (i3 == 9 || i3 == 13) {
                        B0('\"');
                    } else if (i3 == 16) {
                        this.f19314i += this.o;
                    }
                    this.m = 0;
                }
                i2--;
                this.m = 0;
            }
            i2++;
            this.m = 0;
        } while (i2 != 0);
        int[] iArr = this.t;
        int i4 = this.r;
        int i5 = i4 - 1;
        iArr[i5] = iArr[i5] + 1;
        this.s[i4 - 1] = "null";
    }

    public boolean L() throws IOException {
        int i2 = this.m;
        if (i2 == 0) {
            i2 = w();
        }
        return (i2 == 2 || i2 == 4) ? false : true;
    }

    String T() {
        return " at line " + (this.f19316k + 1) + " column " + ((this.f19314i - this.l) + 1) + " path " + c();
    }

    public boolean Y() throws IOException {
        int i2 = this.m;
        if (i2 == 0) {
            i2 = w();
        }
        if (i2 == 5) {
            this.m = 0;
            int[] iArr = this.t;
            int i3 = this.r - 1;
            iArr[i3] = iArr[i3] + 1;
            return true;
        }
        if (i2 == 6) {
            this.m = 0;
            int[] iArr2 = this.t;
            int i4 = this.r - 1;
            iArr2[i4] = iArr2[i4] + 1;
            return false;
        }
        throw new IllegalStateException("Expected a boolean but was " + w0() + T());
    }

    public void a() throws IOException {
        int i2 = this.m;
        if (i2 == 0) {
            i2 = w();
        }
        if (i2 == 3) {
            z0(1);
            this.t[this.r - 1] = 0;
            this.m = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_ARRAY but was " + w0() + T());
        }
    }

    public void b() throws IOException {
        int i2 = this.m;
        if (i2 == 0) {
            i2 = w();
        }
        if (i2 == 1) {
            z0(3);
            this.m = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_OBJECT but was " + w0() + T());
        }
    }

    public String c() {
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        int i2 = this.r;
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = this.q[i3];
            if (i4 == 1 || i4 == 2) {
                sb.append('[');
                sb.append(this.t[i3]);
                sb.append(']');
            } else if (i4 == 3 || i4 == 4 || i4 == 5) {
                sb.append('.');
                String[] strArr = this.s;
                if (strArr[i3] != null) {
                    sb.append(strArr[i3]);
                }
            }
        }
        return sb.toString();
    }

    public double c0() throws IOException {
        int i2 = this.m;
        if (i2 == 0) {
            i2 = w();
        }
        if (i2 == 15) {
            this.m = 0;
            int[] iArr = this.t;
            int i3 = this.r - 1;
            iArr[i3] = iArr[i3] + 1;
            return this.n;
        }
        if (i2 == 16) {
            this.p = new String(this.f19313h, this.f19314i, this.o);
            this.f19314i += this.o;
        } else if (i2 == 8 || i2 == 9) {
            this.p = t0(i2 == 8 ? '\'' : '\"');
        } else if (i2 == 10) {
            this.p = v0();
        } else if (i2 != 11) {
            throw new IllegalStateException("Expected a double but was " + w0() + T());
        }
        this.m = 11;
        double parseDouble = Double.parseDouble(this.p);
        if (!this.f19312g && (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble))) {
            throw new MalformedJsonException("JSON forbids NaN and infinities: " + parseDouble + T());
        }
        this.p = null;
        this.m = 0;
        int[] iArr2 = this.t;
        int i4 = this.r - 1;
        iArr2[i4] = iArr2[i4] + 1;
        return parseDouble;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.m = 0;
        this.q[0] = 8;
        this.r = 1;
        this.f19311f.close();
    }

    public int g0() throws IOException {
        int i2 = this.m;
        if (i2 == 0) {
            i2 = w();
        }
        if (i2 == 15) {
            long j2 = this.n;
            int i3 = (int) j2;
            if (j2 == i3) {
                this.m = 0;
                int[] iArr = this.t;
                int i4 = this.r - 1;
                iArr[i4] = iArr[i4] + 1;
                return i3;
            }
            throw new NumberFormatException("Expected an int but was " + this.n + T());
        }
        if (i2 == 16) {
            this.p = new String(this.f19313h, this.f19314i, this.o);
            this.f19314i += this.o;
        } else {
            if (i2 != 8 && i2 != 9 && i2 != 10) {
                throw new IllegalStateException("Expected an int but was " + w0() + T());
            }
            if (i2 == 10) {
                this.p = v0();
            } else {
                this.p = t0(i2 == 8 ? '\'' : '\"');
            }
            try {
                int parseInt = Integer.parseInt(this.p);
                this.m = 0;
                int[] iArr2 = this.t;
                int i5 = this.r - 1;
                iArr2[i5] = iArr2[i5] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }
        this.m = 11;
        double parseDouble = Double.parseDouble(this.p);
        int i6 = (int) parseDouble;
        if (i6 == parseDouble) {
            this.p = null;
            this.m = 0;
            int[] iArr3 = this.t;
            int i7 = this.r - 1;
            iArr3[i7] = iArr3[i7] + 1;
            return i6;
        }
        throw new NumberFormatException("Expected an int but was " + this.p + T());
    }

    public long i0() throws IOException {
        int i2 = this.m;
        if (i2 == 0) {
            i2 = w();
        }
        if (i2 == 15) {
            this.m = 0;
            int[] iArr = this.t;
            int i3 = this.r - 1;
            iArr[i3] = iArr[i3] + 1;
            return this.n;
        }
        if (i2 == 16) {
            this.p = new String(this.f19313h, this.f19314i, this.o);
            this.f19314i += this.o;
        } else {
            if (i2 != 8 && i2 != 9 && i2 != 10) {
                throw new IllegalStateException("Expected a long but was " + w0() + T());
            }
            if (i2 == 10) {
                this.p = v0();
            } else {
                this.p = t0(i2 == 8 ? '\'' : '\"');
            }
            try {
                long parseLong = Long.parseLong(this.p);
                this.m = 0;
                int[] iArr2 = this.t;
                int i4 = this.r - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        this.m = 11;
        double parseDouble = Double.parseDouble(this.p);
        long j2 = (long) parseDouble;
        if (j2 == parseDouble) {
            this.p = null;
            this.m = 0;
            int[] iArr3 = this.t;
            int i5 = this.r - 1;
            iArr3[i5] = iArr3[i5] + 1;
            return j2;
        }
        throw new NumberFormatException("Expected a long but was " + this.p + T());
    }

    public String k0() throws IOException {
        String t0;
        int i2 = this.m;
        if (i2 == 0) {
            i2 = w();
        }
        if (i2 == 14) {
            t0 = v0();
        } else if (i2 == 12) {
            t0 = t0('\'');
        } else if (i2 == 13) {
            t0 = t0('\"');
        } else {
            throw new IllegalStateException("Expected a name but was " + w0() + T());
        }
        this.m = 0;
        this.s[this.r - 1] = t0;
        return t0;
    }

    public void s0() throws IOException {
        int i2 = this.m;
        if (i2 == 0) {
            i2 = w();
        }
        if (i2 == 7) {
            this.m = 0;
            int[] iArr = this.t;
            int i3 = this.r - 1;
            iArr[i3] = iArr[i3] + 1;
            return;
        }
        throw new IllegalStateException("Expected null but was " + w0() + T());
    }

    public String toString() {
        return getClass().getSimpleName() + T();
    }

    public String u0() throws IOException {
        String str;
        int i2 = this.m;
        if (i2 == 0) {
            i2 = w();
        }
        if (i2 == 10) {
            str = v0();
        } else if (i2 == 8) {
            str = t0('\'');
        } else if (i2 == 9) {
            str = t0('\"');
        } else if (i2 == 11) {
            str = this.p;
            this.p = null;
        } else if (i2 == 15) {
            str = Long.toString(this.n);
        } else if (i2 == 16) {
            str = new String(this.f19313h, this.f19314i, this.o);
            this.f19314i += this.o;
        } else {
            throw new IllegalStateException("Expected a string but was " + w0() + T());
        }
        this.m = 0;
        int[] iArr = this.t;
        int i3 = this.r - 1;
        iArr[i3] = iArr[i3] + 1;
        return str;
    }

    int w() throws IOException {
        int q0;
        int[] iArr = this.q;
        int i2 = this.r;
        int i3 = iArr[i2 - 1];
        if (i3 == 1) {
            iArr[i2 - 1] = 2;
        } else if (i3 == 2) {
            int q02 = q0(true);
            if (q02 != 44) {
                if (q02 != 59) {
                    if (q02 == 93) {
                        this.m = 4;
                        return 4;
                    }
                    throw G0("Unterminated array");
                }
                f();
            }
        } else {
            if (i3 == 3 || i3 == 5) {
                iArr[i2 - 1] = 4;
                if (i3 == 5 && (q0 = q0(true)) != 44) {
                    if (q0 != 59) {
                        if (q0 == 125) {
                            this.m = 2;
                            return 2;
                        }
                        throw G0("Unterminated object");
                    }
                    f();
                }
                int q03 = q0(true);
                if (q03 == 34) {
                    this.m = 13;
                    return 13;
                }
                if (q03 == 39) {
                    f();
                    this.m = 12;
                    return 12;
                }
                if (q03 == 125) {
                    if (i3 != 5) {
                        this.m = 2;
                        return 2;
                    }
                    throw G0("Expected name");
                }
                f();
                this.f19314i--;
                if (P((char) q03)) {
                    this.m = 14;
                    return 14;
                }
                throw G0("Expected name");
            }
            if (i3 == 4) {
                iArr[i2 - 1] = 5;
                int q04 = q0(true);
                if (q04 != 58) {
                    if (q04 == 61) {
                        f();
                        if (this.f19314i < this.f19315j || J(1)) {
                            char[] cArr = this.f19313h;
                            int i4 = this.f19314i;
                            if (cArr[i4] == '>') {
                                this.f19314i = i4 + 1;
                            }
                        }
                    } else {
                        throw G0("Expected ':'");
                    }
                }
            } else if (i3 == 6) {
                if (this.f19312g) {
                    o();
                }
                this.q[this.r - 1] = 7;
            } else if (i3 == 7) {
                if (q0(false) == -1) {
                    this.m = 17;
                    return 17;
                }
                f();
                this.f19314i--;
            } else if (i3 == 8) {
                throw new IllegalStateException("JsonReader is closed");
            }
        }
        int q05 = q0(true);
        if (q05 == 34) {
            this.m = 9;
            return 9;
        }
        if (q05 == 39) {
            f();
            this.m = 8;
            return 8;
        }
        if (q05 != 44 && q05 != 59) {
            if (q05 == 91) {
                this.m = 3;
                return 3;
            }
            if (q05 != 93) {
                if (q05 != 123) {
                    this.f19314i--;
                    int x0 = x0();
                    if (x0 != 0) {
                        return x0;
                    }
                    int y0 = y0();
                    if (y0 != 0) {
                        return y0;
                    }
                    if (P(this.f19313h[this.f19314i])) {
                        f();
                        this.m = 10;
                        return 10;
                    }
                    throw G0("Expected value");
                }
                this.m = 1;
                return 1;
            }
            if (i3 == 1) {
                this.m = 4;
                return 4;
            }
        }
        if (i3 != 1 && i3 != 2) {
            throw G0("Unexpected value");
        }
        f();
        this.f19314i--;
        this.m = 7;
        return 7;
    }

    public b w0() throws IOException {
        int i2 = this.m;
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
        int i2 = this.m;
        if (i2 == 0) {
            i2 = w();
        }
        if (i2 == 4) {
            int i3 = this.r - 1;
            this.r = i3;
            int[] iArr = this.t;
            int i4 = i3 - 1;
            iArr[i4] = iArr[i4] + 1;
            this.m = 0;
            return;
        }
        throw new IllegalStateException("Expected END_ARRAY but was " + w0() + T());
    }
}
