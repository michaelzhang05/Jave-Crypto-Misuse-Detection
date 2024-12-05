package u3;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    private static final Charset f9439a = Charset.forName("UTF-8");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static abstract class a {

        /* renamed from: a, reason: collision with root package name */
        public byte[] f9440a;

        /* renamed from: b, reason: collision with root package name */
        public int f9441b;

        a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class b extends a {

        /* renamed from: f, reason: collision with root package name */
        private static final int[] f9442f = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

        /* renamed from: g, reason: collision with root package name */
        private static final int[] f9443g = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

        /* renamed from: c, reason: collision with root package name */
        private int f9444c;

        /* renamed from: d, reason: collision with root package name */
        private int f9445d;

        /* renamed from: e, reason: collision with root package name */
        private final int[] f9446e;

        public b(int i6, byte[] bArr) {
            this.f9440a = bArr;
            this.f9446e = (i6 & 8) == 0 ? f9442f : f9443g;
            this.f9444c = 0;
            this.f9445d = 0;
        }

        public boolean a(byte[] bArr, int i6, int i7, boolean z5) {
            int i8 = this.f9444c;
            if (i8 == 6) {
                return false;
            }
            int i9 = i7 + i6;
            int i10 = this.f9445d;
            byte[] bArr2 = this.f9440a;
            int[] iArr = this.f9446e;
            int i11 = i10;
            int i12 = 0;
            int i13 = i8;
            int i14 = i6;
            while (i14 < i9) {
                if (i13 == 0) {
                    while (true) {
                        int i15 = i14 + 4;
                        if (i15 > i9 || (i11 = (iArr[bArr[i14] & 255] << 18) | (iArr[bArr[i14 + 1] & 255] << 12) | (iArr[bArr[i14 + 2] & 255] << 6) | iArr[bArr[i14 + 3] & 255]) < 0) {
                            break;
                        }
                        bArr2[i12 + 2] = (byte) i11;
                        bArr2[i12 + 1] = (byte) (i11 >> 8);
                        bArr2[i12] = (byte) (i11 >> 16);
                        i12 += 3;
                        i14 = i15;
                    }
                    if (i14 >= i9) {
                        break;
                    }
                }
                int i16 = i14 + 1;
                int i17 = iArr[bArr[i14] & 255];
                if (i13 != 0) {
                    if (i13 == 1) {
                        if (i17 < 0) {
                            if (i17 != -1) {
                                this.f9444c = 6;
                                return false;
                            }
                        }
                        i17 |= i11 << 6;
                    } else if (i13 == 2) {
                        if (i17 < 0) {
                            if (i17 == -2) {
                                bArr2[i12] = (byte) (i11 >> 4);
                                i12++;
                                i13 = 4;
                            } else if (i17 != -1) {
                                this.f9444c = 6;
                                return false;
                            }
                        }
                        i17 |= i11 << 6;
                    } else if (i13 != 3) {
                        if (i13 != 4) {
                            if (i13 == 5 && i17 != -1) {
                                this.f9444c = 6;
                                return false;
                            }
                        } else if (i17 == -2) {
                            i13++;
                        } else if (i17 != -1) {
                            this.f9444c = 6;
                            return false;
                        }
                    } else if (i17 >= 0) {
                        int i18 = i17 | (i11 << 6);
                        bArr2[i12 + 2] = (byte) i18;
                        bArr2[i12 + 1] = (byte) (i18 >> 8);
                        bArr2[i12] = (byte) (i18 >> 16);
                        i12 += 3;
                        i11 = i18;
                        i13 = 0;
                    } else if (i17 == -2) {
                        bArr2[i12 + 1] = (byte) (i11 >> 2);
                        bArr2[i12] = (byte) (i11 >> 10);
                        i12 += 2;
                        i13 = 5;
                    } else if (i17 != -1) {
                        this.f9444c = 6;
                        return false;
                    }
                    i13++;
                    i11 = i17;
                } else {
                    if (i17 < 0) {
                        if (i17 != -1) {
                            this.f9444c = 6;
                            return false;
                        }
                    }
                    i13++;
                    i11 = i17;
                }
                i14 = i16;
            }
            if (!z5) {
                this.f9444c = i13;
                this.f9445d = i11;
            } else {
                if (i13 == 1) {
                    this.f9444c = 6;
                    return false;
                }
                if (i13 == 2) {
                    bArr2[i12] = (byte) (i11 >> 4);
                    i12++;
                } else if (i13 == 3) {
                    int i19 = i12 + 1;
                    bArr2[i12] = (byte) (i11 >> 10);
                    i12 = i19 + 1;
                    bArr2[i19] = (byte) (i11 >> 2);
                } else if (i13 == 4) {
                    this.f9444c = 6;
                    return false;
                }
                this.f9444c = i13;
            }
            this.f9441b = i12;
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class c extends a {

        /* renamed from: j, reason: collision with root package name */
        private static final byte[] f9447j = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

        /* renamed from: k, reason: collision with root package name */
        private static final byte[] f9448k = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};

        /* renamed from: c, reason: collision with root package name */
        private final byte[] f9449c;

        /* renamed from: d, reason: collision with root package name */
        int f9450d;

        /* renamed from: e, reason: collision with root package name */
        private int f9451e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f9452f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f9453g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f9454h;

        /* renamed from: i, reason: collision with root package name */
        private final byte[] f9455i;

        public c(int i6, byte[] bArr) {
            this.f9440a = bArr;
            this.f9452f = (i6 & 1) == 0;
            boolean z5 = (i6 & 2) == 0;
            this.f9453g = z5;
            this.f9454h = (i6 & 4) != 0;
            this.f9455i = (i6 & 8) == 0 ? f9447j : f9448k;
            this.f9449c = new byte[2];
            this.f9450d = 0;
            this.f9451e = z5 ? 19 : -1;
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0094  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00e6 A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean a(byte[] r18, int r19, int r20, boolean r21) {
            /*
                Method dump skipped, instructions count: 478
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: u3.e.c.a(byte[], int, int, boolean):boolean");
        }
    }

    public static byte[] a(String str, int i6) {
        return b(str.getBytes(f9439a), i6);
    }

    public static byte[] b(byte[] bArr, int i6) {
        return c(bArr, 0, bArr.length, i6);
    }

    public static byte[] c(byte[] bArr, int i6, int i7, int i8) {
        b bVar = new b(i8, new byte[(i7 * 3) / 4]);
        if (!bVar.a(bArr, i6, i7, true)) {
            throw new IllegalArgumentException("bad base-64");
        }
        int i9 = bVar.f9441b;
        byte[] bArr2 = bVar.f9440a;
        if (i9 == bArr2.length) {
            return bArr2;
        }
        byte[] bArr3 = new byte[i9];
        System.arraycopy(bArr2, 0, bArr3, 0, i9);
        return bArr3;
    }

    public static String d(byte[] bArr) {
        return g(bArr, 2);
    }

    public static byte[] e(byte[] bArr, int i6) {
        return f(bArr, 0, bArr.length, i6);
    }

    public static byte[] f(byte[] bArr, int i6, int i7, int i8) {
        c cVar = new c(i8, null);
        int i9 = (i7 / 3) * 4;
        if (!cVar.f9452f) {
            int i10 = i7 % 3;
            if (i10 == 1) {
                i9 += 2;
            } else if (i10 == 2) {
                i9 += 3;
            }
        } else if (i7 % 3 > 0) {
            i9 += 4;
        }
        if (cVar.f9453g && i7 > 0) {
            i9 += (((i7 - 1) / 57) + 1) * (cVar.f9454h ? 2 : 1);
        }
        cVar.f9440a = new byte[i9];
        cVar.a(bArr, i6, i7, true);
        return cVar.f9440a;
    }

    public static String g(byte[] bArr, int i6) {
        try {
            return new String(e(bArr, i6), "US-ASCII");
        } catch (UnsupportedEncodingException e6) {
            throw new AssertionError(e6);
        }
    }
}
