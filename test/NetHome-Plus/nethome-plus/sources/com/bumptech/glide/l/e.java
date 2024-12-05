package com.bumptech.glide.l;

import android.graphics.Bitmap;
import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.l.a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: StandardGifDecoder.java */
/* loaded from: classes.dex */
public class e implements a {
    private static final String a = "e";

    /* renamed from: b, reason: collision with root package name */
    private int[] f8418b;

    /* renamed from: c, reason: collision with root package name */
    private final int[] f8419c;

    /* renamed from: d, reason: collision with root package name */
    private final a.InterfaceC0105a f8420d;

    /* renamed from: e, reason: collision with root package name */
    private ByteBuffer f8421e;

    /* renamed from: f, reason: collision with root package name */
    private byte[] f8422f;

    /* renamed from: g, reason: collision with root package name */
    private short[] f8423g;

    /* renamed from: h, reason: collision with root package name */
    private byte[] f8424h;

    /* renamed from: i, reason: collision with root package name */
    private byte[] f8425i;

    /* renamed from: j, reason: collision with root package name */
    private byte[] f8426j;

    /* renamed from: k, reason: collision with root package name */
    private int[] f8427k;
    private int l;
    private c m;
    private Bitmap n;
    private boolean o;
    private int p;
    private int q;
    private int r;
    private int s;
    private Boolean t;
    private Bitmap.Config u;

    public e(a.InterfaceC0105a interfaceC0105a, c cVar, ByteBuffer byteBuffer, int i2) {
        this(interfaceC0105a);
        r(cVar, byteBuffer, i2);
    }

    private int j(int i2, int i3, int i4) {
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        for (int i10 = i2; i10 < this.q + i2; i10++) {
            byte[] bArr = this.f8426j;
            if (i10 >= bArr.length || i10 >= i3) {
                break;
            }
            int i11 = this.f8418b[bArr[i10] & 255];
            if (i11 != 0) {
                i5 += (i11 >> 24) & 255;
                i6 += (i11 >> 16) & 255;
                i7 += (i11 >> 8) & 255;
                i8 += i11 & 255;
                i9++;
            }
        }
        int i12 = i2 + i4;
        for (int i13 = i12; i13 < this.q + i12; i13++) {
            byte[] bArr2 = this.f8426j;
            if (i13 >= bArr2.length || i13 >= i3) {
                break;
            }
            int i14 = this.f8418b[bArr2[i13] & 255];
            if (i14 != 0) {
                i5 += (i14 >> 24) & 255;
                i6 += (i14 >> 16) & 255;
                i7 += (i14 >> 8) & 255;
                i8 += i14 & 255;
                i9++;
            }
        }
        if (i9 == 0) {
            return 0;
        }
        return ((i5 / i9) << 24) | ((i6 / i9) << 16) | ((i7 / i9) << 8) | (i8 / i9);
    }

    private void k(b bVar) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int[] iArr = this.f8427k;
        int i7 = bVar.f8397d;
        int i8 = this.q;
        int i9 = i7 / i8;
        int i10 = bVar.f8395b / i8;
        int i11 = bVar.f8396c / i8;
        int i12 = bVar.a / i8;
        boolean z = this.l == 0;
        int i13 = this.s;
        int i14 = this.r;
        byte[] bArr = this.f8426j;
        int[] iArr2 = this.f8418b;
        Boolean bool = this.t;
        int i15 = 8;
        int i16 = 0;
        int i17 = 0;
        int i18 = 1;
        while (i16 < i9) {
            Boolean bool2 = bool;
            if (bVar.f8398e) {
                if (i17 >= i9) {
                    i2 = i9;
                    int i19 = i18 + 1;
                    if (i19 == 2) {
                        i18 = i19;
                        i17 = 4;
                    } else if (i19 == 3) {
                        i18 = i19;
                        i17 = 2;
                        i15 = 4;
                    } else if (i19 != 4) {
                        i18 = i19;
                    } else {
                        i18 = i19;
                        i17 = 1;
                        i15 = 2;
                    }
                } else {
                    i2 = i9;
                }
                i3 = i17 + i15;
            } else {
                i2 = i9;
                i3 = i17;
                i17 = i16;
            }
            int i20 = i17 + i10;
            boolean z2 = i8 == 1;
            if (i20 < i14) {
                int i21 = i20 * i13;
                int i22 = i21 + i12;
                int i23 = i22 + i11;
                int i24 = i21 + i13;
                if (i24 < i23) {
                    i23 = i24;
                }
                i4 = i3;
                int i25 = i16 * i8 * bVar.f8396c;
                if (z2) {
                    int i26 = i22;
                    while (i26 < i23) {
                        int i27 = i10;
                        int i28 = iArr2[bArr[i25] & 255];
                        if (i28 != 0) {
                            iArr[i26] = i28;
                        } else if (z && bool2 == null) {
                            bool2 = Boolean.TRUE;
                        }
                        i25 += i8;
                        i26++;
                        i10 = i27;
                    }
                } else {
                    i6 = i10;
                    int i29 = ((i23 - i22) * i8) + i25;
                    int i30 = i22;
                    while (true) {
                        i5 = i11;
                        if (i30 < i23) {
                            int j2 = j(i25, i29, bVar.f8396c);
                            if (j2 != 0) {
                                iArr[i30] = j2;
                            } else if (z && bool2 == null) {
                                bool2 = Boolean.TRUE;
                            }
                            i25 += i8;
                            i30++;
                            i11 = i5;
                        }
                    }
                    bool = bool2;
                    i16++;
                    i10 = i6;
                    i11 = i5;
                    i9 = i2;
                    i17 = i4;
                }
            } else {
                i4 = i3;
            }
            i6 = i10;
            i5 = i11;
            bool = bool2;
            i16++;
            i10 = i6;
            i11 = i5;
            i9 = i2;
            i17 = i4;
        }
        Boolean bool3 = bool;
        if (this.t == null) {
            this.t = Boolean.valueOf(bool3 == null ? false : bool3.booleanValue());
        }
    }

    private void l(b bVar) {
        b bVar2 = bVar;
        int[] iArr = this.f8427k;
        int i2 = bVar2.f8397d;
        int i3 = bVar2.f8395b;
        int i4 = bVar2.f8396c;
        int i5 = bVar2.a;
        boolean z = this.l == 0;
        int i6 = this.s;
        byte[] bArr = this.f8426j;
        int[] iArr2 = this.f8418b;
        int i7 = 0;
        byte b2 = -1;
        while (i7 < i2) {
            int i8 = (i7 + i3) * i6;
            int i9 = i8 + i5;
            int i10 = i9 + i4;
            int i11 = i8 + i6;
            if (i11 < i10) {
                i10 = i11;
            }
            int i12 = bVar2.f8396c * i7;
            int i13 = i9;
            while (i13 < i10) {
                byte b3 = bArr[i12];
                int i14 = i2;
                int i15 = b3 & 255;
                if (i15 != b2) {
                    int i16 = iArr2[i15];
                    if (i16 != 0) {
                        iArr[i13] = i16;
                    } else {
                        b2 = b3;
                    }
                }
                i12++;
                i13++;
                i2 = i14;
            }
            i7++;
            bVar2 = bVar;
        }
        this.t = Boolean.valueOf(this.t == null && z && b2 != -1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v15, types: [short] */
    /* JADX WARN: Type inference failed for: r7v17 */
    private void m(b bVar) {
        int i2;
        int i3;
        short s;
        e eVar = this;
        if (bVar != null) {
            eVar.f8421e.position(bVar.f8403j);
        }
        if (bVar == null) {
            c cVar = eVar.m;
            i2 = cVar.f8409f;
            i3 = cVar.f8410g;
        } else {
            i2 = bVar.f8396c;
            i3 = bVar.f8397d;
        }
        int i4 = i2 * i3;
        byte[] bArr = eVar.f8426j;
        if (bArr == null || bArr.length < i4) {
            eVar.f8426j = eVar.f8420d.e(i4);
        }
        byte[] bArr2 = eVar.f8426j;
        if (eVar.f8423g == null) {
            eVar.f8423g = new short[RecyclerView.l.FLAG_APPEARED_IN_PRE_LAYOUT];
        }
        short[] sArr = eVar.f8423g;
        if (eVar.f8424h == null) {
            eVar.f8424h = new byte[RecyclerView.l.FLAG_APPEARED_IN_PRE_LAYOUT];
        }
        byte[] bArr3 = eVar.f8424h;
        if (eVar.f8425i == null) {
            eVar.f8425i = new byte[4097];
        }
        byte[] bArr4 = eVar.f8425i;
        int q = q();
        int i5 = 1 << q;
        int i6 = i5 + 1;
        int i7 = i5 + 2;
        int i8 = q + 1;
        int i9 = (1 << i8) - 1;
        int i10 = 0;
        for (int i11 = 0; i11 < i5; i11++) {
            sArr[i11] = 0;
            bArr3[i11] = (byte) i11;
        }
        byte[] bArr5 = eVar.f8422f;
        int i12 = i8;
        int i13 = i7;
        int i14 = i9;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = -1;
        int i21 = 0;
        int i22 = 0;
        while (true) {
            if (i10 >= i4) {
                break;
            }
            if (i15 == 0) {
                i15 = p();
                if (i15 <= 0) {
                    eVar.p = 3;
                    break;
                }
                i16 = 0;
            }
            i18 += (bArr5[i16] & 255) << i17;
            i16++;
            i15--;
            int i23 = i17 + 8;
            int i24 = i13;
            int i25 = i12;
            int i26 = i20;
            int i27 = i8;
            int i28 = i21;
            while (true) {
                if (i23 < i25) {
                    i20 = i26;
                    i13 = i24;
                    i17 = i23;
                    eVar = this;
                    i21 = i28;
                    i8 = i27;
                    i12 = i25;
                    break;
                }
                int i29 = i7;
                int i30 = i18 & i14;
                i18 >>= i25;
                i23 -= i25;
                if (i30 == i5) {
                    i14 = i9;
                    i25 = i27;
                    i24 = i29;
                    i7 = i24;
                    i26 = -1;
                } else {
                    if (i30 == i6) {
                        i17 = i23;
                        i21 = i28;
                        i13 = i24;
                        i8 = i27;
                        i7 = i29;
                        i20 = i26;
                        i12 = i25;
                        eVar = this;
                        break;
                    }
                    if (i26 == -1) {
                        bArr2[i19] = bArr3[i30];
                        i19++;
                        i10++;
                        i26 = i30;
                        i28 = i26;
                        i7 = i29;
                        i23 = i23;
                    } else {
                        if (i30 >= i24) {
                            bArr4[i22] = (byte) i28;
                            i22++;
                            s = i26;
                        } else {
                            s = i30;
                        }
                        while (s >= i5) {
                            bArr4[i22] = bArr3[s];
                            i22++;
                            s = sArr[s];
                        }
                        i28 = bArr3[s] & 255;
                        byte b2 = (byte) i28;
                        bArr2[i19] = b2;
                        while (true) {
                            i19++;
                            i10++;
                            if (i22 <= 0) {
                                break;
                            }
                            i22--;
                            bArr2[i19] = bArr4[i22];
                        }
                        byte[] bArr6 = bArr4;
                        if (i24 < 4096) {
                            sArr[i24] = (short) i26;
                            bArr3[i24] = b2;
                            i24++;
                            if ((i24 & i14) == 0 && i24 < 4096) {
                                i25++;
                                i14 += i24;
                            }
                        }
                        i26 = i30;
                        i7 = i29;
                        i23 = i23;
                        bArr4 = bArr6;
                    }
                }
            }
        }
        Arrays.fill(bArr2, i19, i4, (byte) 0);
    }

    private Bitmap o() {
        Boolean bool = this.t;
        Bitmap a2 = this.f8420d.a(this.s, this.r, (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.u);
        a2.setHasAlpha(true);
        return a2;
    }

    private int p() {
        int q = q();
        if (q <= 0) {
            return q;
        }
        ByteBuffer byteBuffer = this.f8421e;
        byteBuffer.get(this.f8422f, 0, Math.min(q, byteBuffer.remaining()));
        return q;
    }

    private int q() {
        return this.f8421e.get() & 255;
    }

    private Bitmap s(b bVar, b bVar2) {
        int i2;
        int i3;
        Bitmap bitmap;
        int[] iArr = this.f8427k;
        int i4 = 0;
        if (bVar2 == null) {
            Bitmap bitmap2 = this.n;
            if (bitmap2 != null) {
                this.f8420d.c(bitmap2);
            }
            this.n = null;
            Arrays.fill(iArr, 0);
        }
        if (bVar2 != null && bVar2.f8400g == 3 && this.n == null) {
            Arrays.fill(iArr, 0);
        }
        if (bVar2 != null && (i3 = bVar2.f8400g) > 0) {
            if (i3 == 2) {
                if (!bVar.f8399f) {
                    c cVar = this.m;
                    int i5 = cVar.l;
                    if (bVar.f8404k == null || cVar.f8413j != bVar.f8401h) {
                        i4 = i5;
                    }
                } else if (this.l == 0) {
                    this.t = Boolean.TRUE;
                }
                int i6 = bVar2.f8397d;
                int i7 = this.q;
                int i8 = i6 / i7;
                int i9 = bVar2.f8395b / i7;
                int i10 = bVar2.f8396c / i7;
                int i11 = bVar2.a / i7;
                int i12 = this.s;
                int i13 = (i9 * i12) + i11;
                int i14 = (i8 * i12) + i13;
                while (i13 < i14) {
                    int i15 = i13 + i10;
                    for (int i16 = i13; i16 < i15; i16++) {
                        iArr[i16] = i4;
                    }
                    i13 += this.s;
                }
            } else if (i3 == 3 && (bitmap = this.n) != null) {
                int i17 = this.s;
                bitmap.getPixels(iArr, 0, i17, 0, 0, i17, this.r);
            }
        }
        m(bVar);
        if (!bVar.f8398e && this.q == 1) {
            l(bVar);
        } else {
            k(bVar);
        }
        if (this.o && ((i2 = bVar.f8400g) == 0 || i2 == 1)) {
            if (this.n == null) {
                this.n = o();
            }
            Bitmap bitmap3 = this.n;
            int i18 = this.s;
            bitmap3.setPixels(iArr, 0, i18, 0, 0, i18, this.r);
        }
        Bitmap o = o();
        int i19 = this.s;
        o.setPixels(iArr, 0, i19, 0, 0, i19, this.r);
        return o;
    }

    @Override // com.bumptech.glide.l.a
    public synchronized Bitmap a() {
        if (this.m.f8406c <= 0 || this.l < 0) {
            String str = a;
            if (Log.isLoggable(str, 3)) {
                Log.d(str, "Unable to decode frame, frameCount=" + this.m.f8406c + ", framePointer=" + this.l);
            }
            this.p = 1;
        }
        int i2 = this.p;
        if (i2 != 1 && i2 != 2) {
            this.p = 0;
            if (this.f8422f == null) {
                this.f8422f = this.f8420d.e(255);
            }
            b bVar = this.m.f8408e.get(this.l);
            int i3 = this.l - 1;
            b bVar2 = i3 >= 0 ? this.m.f8408e.get(i3) : null;
            int[] iArr = bVar.f8404k;
            if (iArr == null) {
                iArr = this.m.a;
            }
            this.f8418b = iArr;
            if (iArr == null) {
                String str2 = a;
                if (Log.isLoggable(str2, 3)) {
                    Log.d(str2, "No valid color table found for frame #" + this.l);
                }
                this.p = 1;
                return null;
            }
            if (bVar.f8399f) {
                System.arraycopy(iArr, 0, this.f8419c, 0, iArr.length);
                int[] iArr2 = this.f8419c;
                this.f8418b = iArr2;
                iArr2[bVar.f8401h] = 0;
            }
            return s(bVar, bVar2);
        }
        String str3 = a;
        if (Log.isLoggable(str3, 3)) {
            Log.d(str3, "Unable to decode frame, status=" + this.p);
        }
        return null;
    }

    @Override // com.bumptech.glide.l.a
    public void b() {
        this.l = (this.l + 1) % this.m.f8406c;
    }

    @Override // com.bumptech.glide.l.a
    public int c() {
        return this.m.f8406c;
    }

    @Override // com.bumptech.glide.l.a
    public void clear() {
        this.m = null;
        byte[] bArr = this.f8426j;
        if (bArr != null) {
            this.f8420d.d(bArr);
        }
        int[] iArr = this.f8427k;
        if (iArr != null) {
            this.f8420d.f(iArr);
        }
        Bitmap bitmap = this.n;
        if (bitmap != null) {
            this.f8420d.c(bitmap);
        }
        this.n = null;
        this.f8421e = null;
        this.t = null;
        byte[] bArr2 = this.f8422f;
        if (bArr2 != null) {
            this.f8420d.d(bArr2);
        }
    }

    @Override // com.bumptech.glide.l.a
    public int d() {
        int i2;
        if (this.m.f8406c <= 0 || (i2 = this.l) < 0) {
            return 0;
        }
        return n(i2);
    }

    @Override // com.bumptech.glide.l.a
    public void e(Bitmap.Config config) {
        if (config != Bitmap.Config.ARGB_8888 && config != Bitmap.Config.RGB_565) {
            throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + Bitmap.Config.ARGB_8888 + " or " + Bitmap.Config.RGB_565);
        }
        this.u = config;
    }

    @Override // com.bumptech.glide.l.a
    public ByteBuffer f() {
        return this.f8421e;
    }

    @Override // com.bumptech.glide.l.a
    public void g() {
        this.l = -1;
    }

    @Override // com.bumptech.glide.l.a
    public int h() {
        return this.l;
    }

    @Override // com.bumptech.glide.l.a
    public int i() {
        return this.f8421e.limit() + this.f8426j.length + (this.f8427k.length * 4);
    }

    public int n(int i2) {
        if (i2 >= 0) {
            c cVar = this.m;
            if (i2 < cVar.f8406c) {
                return cVar.f8408e.get(i2).f8402i;
            }
        }
        return -1;
    }

    public synchronized void r(c cVar, ByteBuffer byteBuffer, int i2) {
        if (i2 > 0) {
            int highestOneBit = Integer.highestOneBit(i2);
            this.p = 0;
            this.m = cVar;
            this.l = -1;
            ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
            this.f8421e = asReadOnlyBuffer;
            asReadOnlyBuffer.position(0);
            this.f8421e.order(ByteOrder.LITTLE_ENDIAN);
            this.o = false;
            Iterator<b> it = cVar.f8408e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (it.next().f8400g == 3) {
                    this.o = true;
                    break;
                }
            }
            this.q = highestOneBit;
            int i3 = cVar.f8409f;
            this.s = i3 / highestOneBit;
            int i4 = cVar.f8410g;
            this.r = i4 / highestOneBit;
            this.f8426j = this.f8420d.e(i3 * i4);
            this.f8427k = this.f8420d.b(this.s * this.r);
        } else {
            throw new IllegalArgumentException("Sample size must be >=0, not: " + i2);
        }
    }

    public e(a.InterfaceC0105a interfaceC0105a) {
        this.f8419c = new int[256];
        this.u = Bitmap.Config.ARGB_8888;
        this.f8420d = interfaceC0105a;
        this.m = new c();
    }
}
