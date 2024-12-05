package Y1;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;

/* renamed from: Y1.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C1515d {

    /* renamed from: a, reason: collision with root package name */
    byte[] f12816a;

    /* renamed from: b, reason: collision with root package name */
    int f12817b;

    public C1515d() {
        this.f12816a = new byte[64];
    }

    private void b(int i8) {
        byte[] bArr = this.f12816a;
        int length = bArr.length * 2;
        int i9 = this.f12817b;
        int i10 = i8 + i9;
        if (length <= i10) {
            length = i10;
        }
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, i9);
        this.f12816a = bArr2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final C1515d a(String str, int i8, int i9) {
        int length = str.length();
        int i10 = i8;
        int i11 = i10;
        while (i10 < length) {
            char charAt = str.charAt(i10);
            if (charAt >= 1 && charAt <= 127) {
                i11++;
            } else if (charAt <= 2047) {
                i11 += 2;
            } else {
                i11 += 3;
            }
            i10++;
        }
        if (i11 <= i9) {
            int i12 = this.f12817b;
            int i13 = i12 - i8;
            int i14 = i13 - 2;
            if (i14 >= 0) {
                byte[] bArr = this.f12816a;
                bArr[i14] = (byte) (i11 >>> 8);
                bArr[i13 - 1] = (byte) i11;
            }
            if ((i12 + i11) - i8 > this.f12816a.length) {
                b(i11 - i8);
            }
            int i15 = this.f12817b;
            while (i8 < length) {
                char charAt2 = str.charAt(i8);
                if (charAt2 >= 1 && charAt2 <= 127) {
                    this.f12816a[i15] = (byte) charAt2;
                    i15++;
                } else if (charAt2 <= 2047) {
                    byte[] bArr2 = this.f12816a;
                    int i16 = i15 + 1;
                    bArr2[i15] = (byte) (((charAt2 >> 6) & 31) | PsExtractor.AUDIO_STREAM);
                    i15 += 2;
                    bArr2[i16] = (byte) ((charAt2 & '?') | 128);
                } else {
                    byte[] bArr3 = this.f12816a;
                    bArr3[i15] = (byte) (((charAt2 >> '\f') & 15) | 224);
                    int i17 = i15 + 2;
                    bArr3[i15 + 1] = (byte) (((charAt2 >> 6) & 63) | 128);
                    i15 += 3;
                    bArr3[i17] = (byte) ((charAt2 & '?') | 128);
                }
                i8++;
            }
            this.f12817b = i15;
            return this;
        }
        throw new IllegalArgumentException("UTF8 string too large");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final C1515d c(int i8, int i9) {
        int i10 = this.f12817b;
        if (i10 + 2 > this.f12816a.length) {
            b(2);
        }
        byte[] bArr = this.f12816a;
        bArr[i10] = (byte) i8;
        bArr[i10 + 1] = (byte) i9;
        this.f12817b = i10 + 2;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final C1515d d(int i8, int i9, int i10) {
        int i11 = this.f12817b;
        if (i11 + 4 > this.f12816a.length) {
            b(4);
        }
        byte[] bArr = this.f12816a;
        bArr[i11] = (byte) i8;
        bArr[i11 + 1] = (byte) i9;
        bArr[i11 + 2] = (byte) (i10 >>> 8);
        bArr[i11 + 3] = (byte) i10;
        this.f12817b = i11 + 4;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final C1515d e(int i8, int i9) {
        int i10 = this.f12817b;
        if (i10 + 3 > this.f12816a.length) {
            b(3);
        }
        byte[] bArr = this.f12816a;
        bArr[i10] = (byte) i8;
        bArr[i10 + 1] = (byte) (i9 >>> 8);
        bArr[i10 + 2] = (byte) i9;
        this.f12817b = i10 + 3;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final C1515d f(int i8, int i9, int i10) {
        int i11 = this.f12817b;
        if (i11 + 5 > this.f12816a.length) {
            b(5);
        }
        byte[] bArr = this.f12816a;
        bArr[i11] = (byte) i8;
        bArr[i11 + 1] = (byte) (i9 >>> 8);
        bArr[i11 + 2] = (byte) i9;
        bArr[i11 + 3] = (byte) (i10 >>> 8);
        bArr[i11 + 4] = (byte) i10;
        this.f12817b = i11 + 5;
        return this;
    }

    public C1515d g(int i8) {
        int i9 = this.f12817b;
        int i10 = i9 + 1;
        if (i10 > this.f12816a.length) {
            b(1);
        }
        this.f12816a[i9] = (byte) i8;
        this.f12817b = i10;
        return this;
    }

    public C1515d h(byte[] bArr, int i8, int i9) {
        if (this.f12817b + i9 > this.f12816a.length) {
            b(i9);
        }
        if (bArr != null) {
            System.arraycopy(bArr, i8, this.f12816a, this.f12817b, i9);
        }
        this.f12817b += i9;
        return this;
    }

    public C1515d i(int i8) {
        int i9 = this.f12817b;
        if (i9 + 4 > this.f12816a.length) {
            b(4);
        }
        byte[] bArr = this.f12816a;
        bArr[i9] = (byte) (i8 >>> 24);
        bArr[i9 + 1] = (byte) (i8 >>> 16);
        bArr[i9 + 2] = (byte) (i8 >>> 8);
        bArr[i9 + 3] = (byte) i8;
        this.f12817b = i9 + 4;
        return this;
    }

    public C1515d j(long j8) {
        int i8 = this.f12817b;
        if (i8 + 8 > this.f12816a.length) {
            b(8);
        }
        byte[] bArr = this.f12816a;
        int i9 = (int) (j8 >>> 32);
        bArr[i8] = (byte) (i9 >>> 24);
        bArr[i8 + 1] = (byte) (i9 >>> 16);
        bArr[i8 + 2] = (byte) (i9 >>> 8);
        bArr[i8 + 3] = (byte) i9;
        int i10 = (int) j8;
        bArr[i8 + 4] = (byte) (i10 >>> 24);
        bArr[i8 + 5] = (byte) (i10 >>> 16);
        bArr[i8 + 6] = (byte) (i10 >>> 8);
        bArr[i8 + 7] = (byte) i10;
        this.f12817b = i8 + 8;
        return this;
    }

    public C1515d k(int i8) {
        int i9 = this.f12817b;
        if (i9 + 2 > this.f12816a.length) {
            b(2);
        }
        byte[] bArr = this.f12816a;
        bArr[i9] = (byte) (i8 >>> 8);
        bArr[i9 + 1] = (byte) i8;
        this.f12817b = i9 + 2;
        return this;
    }

    public C1515d l(String str) {
        int length = str.length();
        if (length <= 65535) {
            int i8 = this.f12817b;
            if (i8 + 2 + length > this.f12816a.length) {
                b(length + 2);
            }
            byte[] bArr = this.f12816a;
            int i9 = i8 + 1;
            bArr[i8] = (byte) (length >>> 8);
            int i10 = i8 + 2;
            bArr[i9] = (byte) length;
            int i11 = 0;
            while (i11 < length) {
                char charAt = str.charAt(i11);
                if (charAt >= 1 && charAt <= 127) {
                    bArr[i10] = (byte) charAt;
                    i11++;
                    i10++;
                } else {
                    this.f12817b = i10;
                    return a(str, i11, 65535);
                }
            }
            this.f12817b = i10;
            return this;
        }
        throw new IllegalArgumentException("UTF8 string too large");
    }

    public C1515d(int i8) {
        this.f12816a = new byte[i8];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1515d(byte[] bArr) {
        this.f12816a = bArr;
        this.f12817b = bArr.length;
    }
}
