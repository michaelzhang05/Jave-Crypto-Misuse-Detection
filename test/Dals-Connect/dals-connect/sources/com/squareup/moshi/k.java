package com.squareup.moshi;

import cm.aptoide.pt.account.AdultContentAnalytics;
import com.squareup.moshi.i;
import java.io.EOFException;
import java.io.IOException;
import java.math.BigDecimal;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: JsonUtf8Reader.java */
/* loaded from: classes2.dex */
public final class k extends i {
    private static final j.i l = j.i.o("'\\");
    private static final j.i m = j.i.o("\"\\");
    private static final j.i n = j.i.o("{}[]:, \n\t\r\f/\\;#=");
    private static final j.i o = j.i.o("\n\r");
    private static final j.i p = j.i.o("*/");
    private final j.h q;
    private final j.f r;
    private int s = 0;
    private long t;
    private int u;
    private String v;

    /* JADX INFO: Access modifiers changed from: package-private */
    public k(j.h hVar) {
        if (hVar != null) {
            this.q = hVar;
            this.r = hVar.e();
            q0(6);
            return;
        }
        throw new NullPointerException("source == null");
    }

    private void A0() throws IOException {
        if (!this.f17253j) {
            throw y0("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    private int B0() throws IOException {
        int[] iArr = this.f17250g;
        int i2 = this.f17249f;
        int i3 = iArr[i2 - 1];
        if (i3 == 1) {
            iArr[i2 - 1] = 2;
        } else if (i3 == 2) {
            int G0 = G0(true);
            this.r.readByte();
            if (G0 != 44) {
                if (G0 != 59) {
                    if (G0 == 93) {
                        this.s = 4;
                        return 4;
                    }
                    throw y0("Unterminated array");
                }
                A0();
            }
        } else {
            if (i3 == 3 || i3 == 5) {
                iArr[i2 - 1] = 4;
                if (i3 == 5) {
                    int G02 = G0(true);
                    this.r.readByte();
                    if (G02 != 44) {
                        if (G02 != 59) {
                            if (G02 == 125) {
                                this.s = 2;
                                return 2;
                            }
                            throw y0("Unterminated object");
                        }
                        A0();
                    }
                }
                int G03 = G0(true);
                if (G03 == 34) {
                    this.r.readByte();
                    this.s = 13;
                    return 13;
                }
                if (G03 == 39) {
                    this.r.readByte();
                    A0();
                    this.s = 12;
                    return 12;
                }
                if (G03 != 125) {
                    A0();
                    if (E0((char) G03)) {
                        this.s = 14;
                        return 14;
                    }
                    throw y0("Expected name");
                }
                if (i3 != 5) {
                    this.r.readByte();
                    this.s = 2;
                    return 2;
                }
                throw y0("Expected name");
            }
            if (i3 == 4) {
                iArr[i2 - 1] = 5;
                int G04 = G0(true);
                this.r.readByte();
                if (G04 != 58) {
                    if (G04 == 61) {
                        A0();
                        if (this.q.request(1L) && this.r.s0(0L) == 62) {
                            this.r.readByte();
                        }
                    } else {
                        throw y0("Expected ':'");
                    }
                }
            } else if (i3 == 6) {
                iArr[i2 - 1] = 7;
            } else if (i3 == 7) {
                if (G0(false) == -1) {
                    this.s = 18;
                    return 18;
                }
                A0();
            } else {
                if (i3 == 9) {
                    throw null;
                }
                if (i3 == 8) {
                    throw new IllegalStateException("JsonReader is closed");
                }
            }
        }
        int G05 = G0(true);
        if (G05 == 34) {
            this.r.readByte();
            this.s = 9;
            return 9;
        }
        if (G05 == 39) {
            A0();
            this.r.readByte();
            this.s = 8;
            return 8;
        }
        if (G05 != 44 && G05 != 59) {
            if (G05 == 91) {
                this.r.readByte();
                this.s = 3;
                return 3;
            }
            if (G05 != 93) {
                if (G05 != 123) {
                    int J0 = J0();
                    if (J0 != 0) {
                        return J0;
                    }
                    int K0 = K0();
                    if (K0 != 0) {
                        return K0;
                    }
                    if (E0(this.r.s0(0L))) {
                        A0();
                        this.s = 10;
                        return 10;
                    }
                    throw y0("Expected value");
                }
                this.r.readByte();
                this.s = 1;
                return 1;
            }
            if (i3 == 1) {
                this.r.readByte();
                this.s = 4;
                return 4;
            }
        }
        if (i3 != 1 && i3 != 2) {
            throw y0("Unexpected value");
        }
        A0();
        this.s = 7;
        return 7;
    }

    private int C0(String str, i.a aVar) {
        int length = aVar.a.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(aVar.a[i2])) {
                this.s = 0;
                this.f17251h[this.f17249f - 1] = str;
                return i2;
            }
        }
        return -1;
    }

    private int D0(String str, i.a aVar) {
        int length = aVar.a.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(aVar.a[i2])) {
                this.s = 0;
                int[] iArr = this.f17252i;
                int i3 = this.f17249f - 1;
                iArr[i3] = iArr[i3] + 1;
                return i2;
            }
        }
        return -1;
    }

    private boolean E0(int i2) throws IOException {
        if (i2 == 9 || i2 == 10 || i2 == 12 || i2 == 13 || i2 == 32) {
            return false;
        }
        if (i2 != 35) {
            if (i2 == 44) {
                return false;
            }
            if (i2 != 47 && i2 != 61) {
                if (i2 == 123 || i2 == 125 || i2 == 58) {
                    return false;
                }
                if (i2 != 59) {
                    switch (i2) {
                        case 91:
                        case 93:
                            return false;
                        case 92:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        A0();
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0025, code lost:
    
        r6.r.skip(r3 - 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002f, code lost:
    
        if (r1 != 47) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0076, code lost:
    
        if (r1 != 35) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0078, code lost:
    
        A0();
        O0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007f, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0039, code lost:
    
        if (r6.q.request(2) != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x003c, code lost:
    
        A0();
        r3 = r6.r.s0(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0049, code lost:
    
        if (r3 == 42) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005c, code lost:
    
        r6.r.readByte();
        r6.r.readByte();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006a, code lost:
    
        if (N0() == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0073, code lost:
    
        throw y0("Unterminated comment");
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x004b, code lost:
    
        if (r3 == 47) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x004e, code lost:
    
        r6.r.readByte();
        r6.r.readByte();
        O0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x004d, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x003b, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int G0(boolean r7) throws java.io.IOException {
        /*
            r6 = this;
            r0 = 0
        L1:
            r1 = 0
        L2:
            j.h r2 = r6.q
            int r3 = r1 + 1
            long r4 = (long) r3
            boolean r2 = r2.request(r4)
            if (r2 == 0) goto L82
            j.f r2 = r6.r
            long r4 = (long) r1
            byte r1 = r2.s0(r4)
            r2 = 10
            if (r1 == r2) goto L80
            r2 = 32
            if (r1 == r2) goto L80
            r2 = 13
            if (r1 == r2) goto L80
            r2 = 9
            if (r1 != r2) goto L25
            goto L80
        L25:
            j.f r2 = r6.r
            int r3 = r3 + (-1)
            long r3 = (long) r3
            r2.skip(r3)
            r2 = 47
            if (r1 != r2) goto L74
            j.h r3 = r6.q
            r4 = 2
            boolean r3 = r3.request(r4)
            if (r3 != 0) goto L3c
            return r1
        L3c:
            r6.A0()
            j.f r3 = r6.r
            r4 = 1
            byte r3 = r3.s0(r4)
            r4 = 42
            if (r3 == r4) goto L5c
            if (r3 == r2) goto L4e
            return r1
        L4e:
            j.f r1 = r6.r
            r1.readByte()
            j.f r1 = r6.r
            r1.readByte()
            r6.O0()
            goto L1
        L5c:
            j.f r1 = r6.r
            r1.readByte()
            j.f r1 = r6.r
            r1.readByte()
            boolean r1 = r6.N0()
            if (r1 == 0) goto L6d
            goto L1
        L6d:
            java.lang.String r7 = "Unterminated comment"
            com.squareup.moshi.JsonEncodingException r7 = r6.y0(r7)
            throw r7
        L74:
            r2 = 35
            if (r1 != r2) goto L7f
            r6.A0()
            r6.O0()
            goto L1
        L7f:
            return r1
        L80:
            r1 = r3
            goto L2
        L82:
            if (r7 != 0) goto L86
            r7 = -1
            return r7
        L86:
            java.io.EOFException r7 = new java.io.EOFException
            java.lang.String r0 = "End of input"
            r7.<init>(r0)
            goto L8f
        L8e:
            throw r7
        L8f:
            goto L8e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.moshi.k.G0(boolean):int");
    }

    private String H0(j.i iVar) throws IOException {
        StringBuilder sb = null;
        while (true) {
            long A = this.q.A(iVar);
            if (A != -1) {
                if (this.r.s0(A) != 92) {
                    if (sb == null) {
                        String E0 = this.r.E0(A);
                        this.r.readByte();
                        return E0;
                    }
                    sb.append(this.r.E0(A));
                    this.r.readByte();
                    return sb.toString();
                }
                if (sb == null) {
                    sb = new StringBuilder();
                }
                sb.append(this.r.E0(A));
                this.r.readByte();
                sb.append(L0());
            } else {
                throw y0("Unterminated string");
            }
        }
    }

    private String I0() throws IOException {
        long A = this.q.A(n);
        return A != -1 ? this.r.E0(A) : this.r.D0();
    }

    private int J0() throws IOException {
        int i2;
        String str;
        String str2;
        byte s0 = this.r.s0(0L);
        if (s0 == 116 || s0 == 84) {
            i2 = 5;
            str = "true";
            str2 = "TRUE";
        } else if (s0 == 102 || s0 == 70) {
            i2 = 6;
            str = AdultContentAnalytics.UNLOCK;
            str2 = "FALSE";
        } else {
            if (s0 != 110 && s0 != 78) {
                return 0;
            }
            i2 = 7;
            str = "null";
            str2 = "NULL";
        }
        int length = str.length();
        int i3 = 1;
        while (i3 < length) {
            int i4 = i3 + 1;
            if (!this.q.request(i4)) {
                return 0;
            }
            byte s02 = this.r.s0(i3);
            if (s02 != str.charAt(i3) && s02 != str2.charAt(i3)) {
                return 0;
            }
            i3 = i4;
        }
        if (this.q.request(length + 1) && E0(this.r.s0(length))) {
            return 0;
        }
        this.r.skip(length);
        this.s = i2;
        return i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0089, code lost:
    
        if (E0(r11) != false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x008b, code lost:
    
        if (r6 != 2) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x008d, code lost:
    
        if (r7 == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0093, code lost:
    
        if (r8 != Long.MIN_VALUE) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0095, code lost:
    
        if (r10 == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0099, code lost:
    
        if (r8 != 0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x009b, code lost:
    
        if (r10 != false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x009d, code lost:
    
        if (r10 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00a0, code lost:
    
        r8 = -r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00a1, code lost:
    
        r16.t = r8;
        r16.r.skip(r5);
        r16.s = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00ad, code lost:
    
        return 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00ae, code lost:
    
        if (r6 == 2) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00b1, code lost:
    
        if (r6 == 4) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00b4, code lost:
    
        if (r6 != 7) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00b7, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00b9, code lost:
    
        r16.u = r5;
        r16.s = 17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00bf, code lost:
    
        return 17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00c0, code lost:
    
        return 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int K0() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.moshi.k.K0():int");
    }

    private char L0() throws IOException {
        int i2;
        int i3;
        if (this.q.request(1L)) {
            byte readByte = this.r.readByte();
            if (readByte == 10 || readByte == 34 || readByte == 39 || readByte == 47 || readByte == 92) {
                return (char) readByte;
            }
            if (readByte == 98) {
                return '\b';
            }
            if (readByte == 102) {
                return '\f';
            }
            if (readByte == 110) {
                return '\n';
            }
            if (readByte == 114) {
                return '\r';
            }
            if (readByte == 116) {
                return '\t';
            }
            if (readByte != 117) {
                if (this.f17253j) {
                    return (char) readByte;
                }
                throw y0("Invalid escape sequence: \\" + ((char) readByte));
            }
            if (this.q.request(4L)) {
                char c2 = 0;
                for (int i4 = 0; i4 < 4; i4++) {
                    byte s0 = this.r.s0(i4);
                    char c3 = (char) (c2 << 4);
                    if (s0 < 48 || s0 > 57) {
                        if (s0 >= 97 && s0 <= 102) {
                            i2 = s0 - 97;
                        } else {
                            if (s0 < 65 || s0 > 70) {
                                throw y0("\\u" + this.r.E0(4L));
                            }
                            i2 = s0 - 65;
                        }
                        i3 = i2 + 10;
                    } else {
                        i3 = s0 - 48;
                    }
                    c2 = (char) (c3 + i3);
                }
                this.r.skip(4L);
                return c2;
            }
            throw new EOFException("Unterminated escape sequence at path " + c());
        }
        throw y0("Unterminated escape sequence");
    }

    private void M0(j.i iVar) throws IOException {
        while (true) {
            long A = this.q.A(iVar);
            if (A != -1) {
                if (this.r.s0(A) == 92) {
                    this.r.skip(A + 1);
                    L0();
                } else {
                    this.r.skip(A + 1);
                    return;
                }
            } else {
                throw y0("Unterminated string");
            }
        }
    }

    private boolean N0() throws IOException {
        long t = this.q.t(p);
        boolean z = t != -1;
        j.f fVar = this.r;
        fVar.skip(z ? t + r1.P() : fVar.size());
        return z;
    }

    private void O0() throws IOException {
        long A = this.q.A(o);
        j.f fVar = this.r;
        fVar.skip(A != -1 ? A + 1 : fVar.size());
    }

    private void P0() throws IOException {
        long A = this.q.A(n);
        j.f fVar = this.r;
        if (A == -1) {
            A = fVar.size();
        }
        fVar.skip(A);
    }

    public String F0() throws IOException {
        String str;
        int i2 = this.s;
        if (i2 == 0) {
            i2 = B0();
        }
        if (i2 == 14) {
            str = I0();
        } else if (i2 == 13) {
            str = H0(m);
        } else if (i2 == 12) {
            str = H0(l);
        } else if (i2 == 15) {
            str = this.v;
            this.v = null;
        } else {
            throw new JsonDataException("Expected a name but was " + i0() + " at path " + c());
        }
        this.s = 0;
        this.f17251h[this.f17249f - 1] = str;
        return str;
    }

    @Override // com.squareup.moshi.i
    public boolean J() throws IOException {
        int i2 = this.s;
        if (i2 == 0) {
            i2 = B0();
        }
        if (i2 == 5) {
            this.s = 0;
            int[] iArr = this.f17252i;
            int i3 = this.f17249f - 1;
            iArr[i3] = iArr[i3] + 1;
            return true;
        }
        if (i2 == 6) {
            this.s = 0;
            int[] iArr2 = this.f17252i;
            int i4 = this.f17249f - 1;
            iArr2[i4] = iArr2[i4] + 1;
            return false;
        }
        throw new JsonDataException("Expected a boolean but was " + i0() + " at path " + c());
    }

    @Override // com.squareup.moshi.i
    public double L() throws IOException {
        int i2 = this.s;
        if (i2 == 0) {
            i2 = B0();
        }
        if (i2 == 16) {
            this.s = 0;
            int[] iArr = this.f17252i;
            int i3 = this.f17249f - 1;
            iArr[i3] = iArr[i3] + 1;
            return this.t;
        }
        if (i2 == 17) {
            this.v = this.r.E0(this.u);
        } else if (i2 == 9) {
            this.v = H0(m);
        } else if (i2 == 8) {
            this.v = H0(l);
        } else if (i2 == 10) {
            this.v = I0();
        } else if (i2 != 11) {
            throw new JsonDataException("Expected a double but was " + i0() + " at path " + c());
        }
        this.s = 11;
        try {
            double parseDouble = Double.parseDouble(this.v);
            if (!this.f17253j && (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble))) {
                throw new JsonEncodingException("JSON forbids NaN and infinities: " + parseDouble + " at path " + c());
            }
            this.v = null;
            this.s = 0;
            int[] iArr2 = this.f17252i;
            int i4 = this.f17249f - 1;
            iArr2[i4] = iArr2[i4] + 1;
            return parseDouble;
        } catch (NumberFormatException unused) {
            throw new JsonDataException("Expected a double but was " + this.v + " at path " + c());
        }
    }

    @Override // com.squareup.moshi.i
    public int P() throws IOException {
        String H0;
        int i2 = this.s;
        if (i2 == 0) {
            i2 = B0();
        }
        if (i2 == 16) {
            long j2 = this.t;
            int i3 = (int) j2;
            if (j2 == i3) {
                this.s = 0;
                int[] iArr = this.f17252i;
                int i4 = this.f17249f - 1;
                iArr[i4] = iArr[i4] + 1;
                return i3;
            }
            throw new JsonDataException("Expected an int but was " + this.t + " at path " + c());
        }
        if (i2 == 17) {
            this.v = this.r.E0(this.u);
        } else if (i2 == 9 || i2 == 8) {
            if (i2 == 9) {
                H0 = H0(m);
            } else {
                H0 = H0(l);
            }
            this.v = H0;
            try {
                int parseInt = Integer.parseInt(H0);
                this.s = 0;
                int[] iArr2 = this.f17252i;
                int i5 = this.f17249f - 1;
                iArr2[i5] = iArr2[i5] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        } else if (i2 != 11) {
            throw new JsonDataException("Expected an int but was " + i0() + " at path " + c());
        }
        this.s = 11;
        try {
            double parseDouble = Double.parseDouble(this.v);
            int i6 = (int) parseDouble;
            if (i6 == parseDouble) {
                this.v = null;
                this.s = 0;
                int[] iArr3 = this.f17252i;
                int i7 = this.f17249f - 1;
                iArr3[i7] = iArr3[i7] + 1;
                return i6;
            }
            throw new JsonDataException("Expected an int but was " + this.v + " at path " + c());
        } catch (NumberFormatException unused2) {
            throw new JsonDataException("Expected an int but was " + this.v + " at path " + c());
        }
    }

    @Override // com.squareup.moshi.i
    public long T() throws IOException {
        String H0;
        int i2 = this.s;
        if (i2 == 0) {
            i2 = B0();
        }
        if (i2 == 16) {
            this.s = 0;
            int[] iArr = this.f17252i;
            int i3 = this.f17249f - 1;
            iArr[i3] = iArr[i3] + 1;
            return this.t;
        }
        if (i2 == 17) {
            this.v = this.r.E0(this.u);
        } else if (i2 == 9 || i2 == 8) {
            if (i2 == 9) {
                H0 = H0(m);
            } else {
                H0 = H0(l);
            }
            this.v = H0;
            try {
                long parseLong = Long.parseLong(H0);
                this.s = 0;
                int[] iArr2 = this.f17252i;
                int i4 = this.f17249f - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        } else if (i2 != 11) {
            throw new JsonDataException("Expected a long but was " + i0() + " at path " + c());
        }
        this.s = 11;
        try {
            long longValueExact = new BigDecimal(this.v).longValueExact();
            this.v = null;
            this.s = 0;
            int[] iArr3 = this.f17252i;
            int i5 = this.f17249f - 1;
            iArr3[i5] = iArr3[i5] + 1;
            return longValueExact;
        } catch (ArithmeticException | NumberFormatException unused2) {
            throw new JsonDataException("Expected a long but was " + this.v + " at path " + c());
        }
    }

    @Override // com.squareup.moshi.i
    public <T> T Y() throws IOException {
        int i2 = this.s;
        if (i2 == 0) {
            i2 = B0();
        }
        if (i2 == 7) {
            this.s = 0;
            int[] iArr = this.f17252i;
            int i3 = this.f17249f - 1;
            iArr[i3] = iArr[i3] + 1;
            return null;
        }
        throw new JsonDataException("Expected null but was " + i0() + " at path " + c());
    }

    @Override // com.squareup.moshi.i
    public void a() throws IOException {
        int i2 = this.s;
        if (i2 == 0) {
            i2 = B0();
        }
        if (i2 == 3) {
            q0(1);
            this.f17252i[this.f17249f - 1] = 0;
            this.s = 0;
        } else {
            throw new JsonDataException("Expected BEGIN_ARRAY but was " + i0() + " at path " + c());
        }
    }

    @Override // com.squareup.moshi.i
    public void b() throws IOException {
        int i2 = this.s;
        if (i2 == 0) {
            i2 = B0();
        }
        if (i2 == 1) {
            q0(3);
            this.s = 0;
            return;
        }
        throw new JsonDataException("Expected BEGIN_OBJECT but was " + i0() + " at path " + c());
    }

    @Override // com.squareup.moshi.i
    public String c0() throws IOException {
        String E0;
        int i2 = this.s;
        if (i2 == 0) {
            i2 = B0();
        }
        if (i2 == 10) {
            E0 = I0();
        } else if (i2 == 9) {
            E0 = H0(m);
        } else if (i2 == 8) {
            E0 = H0(l);
        } else if (i2 == 11) {
            E0 = this.v;
            this.v = null;
        } else if (i2 == 16) {
            E0 = Long.toString(this.t);
        } else if (i2 == 17) {
            E0 = this.r.E0(this.u);
        } else {
            throw new JsonDataException("Expected a string but was " + i0() + " at path " + c());
        }
        this.s = 0;
        int[] iArr = this.f17252i;
        int i3 = this.f17249f - 1;
        iArr[i3] = iArr[i3] + 1;
        return E0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.s = 0;
        this.f17250g[0] = 8;
        this.f17249f = 1;
        this.r.b();
        this.q.close();
    }

    @Override // com.squareup.moshi.i
    public void f() throws IOException {
        int i2 = this.s;
        if (i2 == 0) {
            i2 = B0();
        }
        if (i2 == 4) {
            int i3 = this.f17249f - 1;
            this.f17249f = i3;
            int[] iArr = this.f17252i;
            int i4 = i3 - 1;
            iArr[i4] = iArr[i4] + 1;
            this.s = 0;
            return;
        }
        throw new JsonDataException("Expected END_ARRAY but was " + i0() + " at path " + c());
    }

    @Override // com.squareup.moshi.i
    public i.b i0() throws IOException {
        int i2 = this.s;
        if (i2 == 0) {
            i2 = B0();
        }
        switch (i2) {
            case 1:
                return i.b.BEGIN_OBJECT;
            case 2:
                return i.b.END_OBJECT;
            case 3:
                return i.b.BEGIN_ARRAY;
            case 4:
                return i.b.END_ARRAY;
            case 5:
            case 6:
                return i.b.BOOLEAN;
            case 7:
                return i.b.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return i.b.STRING;
            case 12:
            case 13:
            case 14:
            case 15:
                return i.b.NAME;
            case 16:
            case 17:
                return i.b.NUMBER;
            case 18:
                return i.b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    @Override // com.squareup.moshi.i
    public void k0() throws IOException {
        if (z()) {
            this.v = F0();
            this.s = 11;
        }
    }

    @Override // com.squareup.moshi.i
    public void o() throws IOException {
        int i2 = this.s;
        if (i2 == 0) {
            i2 = B0();
        }
        if (i2 == 2) {
            int i3 = this.f17249f - 1;
            this.f17249f = i3;
            this.f17251h[i3] = null;
            int[] iArr = this.f17252i;
            int i4 = i3 - 1;
            iArr[i4] = iArr[i4] + 1;
            this.s = 0;
            return;
        }
        throw new JsonDataException("Expected END_OBJECT but was " + i0() + " at path " + c());
    }

    @Override // com.squareup.moshi.i
    public int s0(i.a aVar) throws IOException {
        int i2 = this.s;
        if (i2 == 0) {
            i2 = B0();
        }
        if (i2 < 12 || i2 > 15) {
            return -1;
        }
        if (i2 == 15) {
            return C0(this.v, aVar);
        }
        int r0 = this.q.r0(aVar.f17255b);
        if (r0 != -1) {
            this.s = 0;
            this.f17251h[this.f17249f - 1] = aVar.a[r0];
            return r0;
        }
        String str = this.f17251h[this.f17249f - 1];
        String F0 = F0();
        int C0 = C0(F0, aVar);
        if (C0 == -1) {
            this.s = 15;
            this.v = F0;
            this.f17251h[this.f17249f - 1] = str;
        }
        return C0;
    }

    @Override // com.squareup.moshi.i
    public int t0(i.a aVar) throws IOException {
        int i2 = this.s;
        if (i2 == 0) {
            i2 = B0();
        }
        if (i2 < 8 || i2 > 11) {
            return -1;
        }
        if (i2 == 11) {
            return D0(this.v, aVar);
        }
        int r0 = this.q.r0(aVar.f17255b);
        if (r0 != -1) {
            this.s = 0;
            int[] iArr = this.f17252i;
            int i3 = this.f17249f - 1;
            iArr[i3] = iArr[i3] + 1;
            return r0;
        }
        String c0 = c0();
        int D0 = D0(c0, aVar);
        if (D0 == -1) {
            this.s = 11;
            this.v = c0;
            this.f17252i[this.f17249f - 1] = r0[r1] - 1;
        }
        return D0;
    }

    public String toString() {
        return "JsonReader(" + this.q + ")";
    }

    @Override // com.squareup.moshi.i
    public void w0() throws IOException {
        if (!this.f17254k) {
            int i2 = this.s;
            if (i2 == 0) {
                i2 = B0();
            }
            if (i2 == 14) {
                P0();
            } else if (i2 == 13) {
                M0(m);
            } else if (i2 == 12) {
                M0(l);
            } else if (i2 != 15) {
                throw new JsonDataException("Expected a name but was " + i0() + " at path " + c());
            }
            this.s = 0;
            this.f17251h[this.f17249f - 1] = "null";
            return;
        }
        i.b i0 = i0();
        F0();
        throw new JsonDataException("Cannot skip unexpected " + i0 + " at " + c());
    }

    @Override // com.squareup.moshi.i
    public void x0() throws IOException {
        if (!this.f17254k) {
            int i2 = 0;
            do {
                int i3 = this.s;
                if (i3 == 0) {
                    i3 = B0();
                }
                if (i3 == 3) {
                    q0(1);
                } else if (i3 == 1) {
                    q0(3);
                } else {
                    if (i3 == 4) {
                        i2--;
                        if (i2 >= 0) {
                            this.f17249f--;
                        } else {
                            throw new JsonDataException("Expected a value but was " + i0() + " at path " + c());
                        }
                    } else if (i3 == 2) {
                        i2--;
                        if (i2 >= 0) {
                            this.f17249f--;
                        } else {
                            throw new JsonDataException("Expected a value but was " + i0() + " at path " + c());
                        }
                    } else if (i3 == 14 || i3 == 10) {
                        P0();
                    } else if (i3 == 9 || i3 == 13) {
                        M0(m);
                    } else if (i3 == 8 || i3 == 12) {
                        M0(l);
                    } else if (i3 == 17) {
                        this.r.skip(this.u);
                    } else if (i3 == 18) {
                        throw new JsonDataException("Expected a value but was " + i0() + " at path " + c());
                    }
                    this.s = 0;
                }
                i2++;
                this.s = 0;
            } while (i2 != 0);
            int[] iArr = this.f17252i;
            int i4 = this.f17249f;
            int i5 = i4 - 1;
            iArr[i5] = iArr[i5] + 1;
            this.f17251h[i4 - 1] = "null";
            return;
        }
        throw new JsonDataException("Cannot skip unexpected " + i0() + " at " + c());
    }

    @Override // com.squareup.moshi.i
    public boolean z() throws IOException {
        int i2 = this.s;
        if (i2 == 0) {
            i2 = B0();
        }
        return (i2 == 2 || i2 == 4 || i2 == 18) ? false : true;
    }
}
