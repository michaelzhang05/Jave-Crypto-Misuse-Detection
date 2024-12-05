package com.google.android.gms.internal.measurement;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.internal.measurement.zzuo;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import sun.misc.Unsafe;

/* loaded from: classes2.dex */
final class w1<T> implements e2<T> {
    private static final int[] a = new int[0];

    /* renamed from: b, reason: collision with root package name */
    private static final Unsafe f16037b = z2.M();

    /* renamed from: c, reason: collision with root package name */
    private final int[] f16038c;

    /* renamed from: d, reason: collision with root package name */
    private final Object[] f16039d;

    /* renamed from: e, reason: collision with root package name */
    private final int f16040e;

    /* renamed from: f, reason: collision with root package name */
    private final int f16041f;

    /* renamed from: g, reason: collision with root package name */
    private final zzvv f16042g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f16043h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f16044i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f16045j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f16046k;
    private final int[] l;
    private final int m;
    private final int n;
    private final y1 o;
    private final h1 p;
    private final v2<?, ?> q;
    private final v0<?> r;
    private final q1 s;

    private w1(int[] iArr, Object[] objArr, int i2, int i3, zzvv zzvvVar, boolean z, boolean z2, int[] iArr2, int i4, int i5, y1 y1Var, h1 h1Var, v2<?, ?> v2Var, v0<?> v0Var, q1 q1Var) {
        this.f16038c = iArr;
        this.f16039d = objArr;
        this.f16040e = i2;
        this.f16041f = i3;
        this.f16044i = zzvvVar instanceof zzuo;
        this.f16045j = z;
        this.f16043h = v0Var != null && v0Var.c(zzvvVar);
        this.f16046k = false;
        this.l = iArr2;
        this.m = i4;
        this.n = i5;
        this.o = y1Var;
        this.p = h1Var;
        this.q = v2Var;
        this.r = v0Var;
        this.f16042g = zzvvVar;
        this.s = q1Var;
    }

    private final boolean A(T t, T t2, int i2) {
        return u(t, i2) == u(t2, i2);
    }

    private static <E> List<E> B(Object obj, long j2) {
        return (List) z2.A(obj, j2);
    }

    private static <T> double C(T t, long j2) {
        return ((Double) z2.A(t, j2)).doubleValue();
    }

    private static <T> float D(T t, long j2) {
        return ((Float) z2.A(t, j2)).floatValue();
    }

    private static <T> int E(T t, long j2) {
        return ((Integer) z2.A(t, j2)).intValue();
    }

    private static <T> long F(T t, long j2) {
        return ((Long) z2.A(t, j2)).longValue();
    }

    private static <T> boolean G(T t, long j2) {
        return ((Boolean) z2.A(t, j2)).booleanValue();
    }

    private static <UT, UB> int h(v2<UT, UB> v2Var, T t) {
        return v2Var.b(v2Var.c(t));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> w1<T> i(Class<T> cls, t1 t1Var, y1 y1Var, h1 h1Var, v2<?, ?> v2Var, v0<?> v0Var, q1 q1Var) {
        int i2;
        int charAt;
        int charAt2;
        int i3;
        int i4;
        int i5;
        int i6;
        int[] iArr;
        int i7;
        int i8;
        char charAt3;
        int i9;
        char charAt4;
        int i10;
        char charAt5;
        int i11;
        char charAt6;
        int i12;
        char charAt7;
        int i13;
        char charAt8;
        int i14;
        char charAt9;
        int i15;
        char charAt10;
        int i16;
        int i17;
        boolean z;
        int i18;
        d2 d2Var;
        int i19;
        int objectFieldOffset;
        int i20;
        int i21;
        Class<?> cls2;
        String str;
        int i22;
        int i23;
        Field j2;
        int i24;
        char charAt11;
        int i25;
        Field j3;
        Field j4;
        int i26;
        char charAt12;
        int i27;
        char charAt13;
        int i28;
        char charAt14;
        int i29;
        char charAt15;
        char charAt16;
        if (t1Var instanceof d2) {
            d2 d2Var2 = (d2) t1Var;
            int i30 = 0;
            boolean z2 = d2Var2.j() == zzuo.zze.f16134i;
            String a2 = d2Var2.a();
            int length = a2.length();
            int charAt17 = a2.charAt(0);
            if (charAt17 >= 55296) {
                int i31 = charAt17 & 8191;
                int i32 = 1;
                int i33 = 13;
                while (true) {
                    i2 = i32 + 1;
                    charAt16 = a2.charAt(i32);
                    if (charAt16 < 55296) {
                        break;
                    }
                    i31 |= (charAt16 & 8191) << i33;
                    i33 += 13;
                    i32 = i2;
                }
                charAt17 = i31 | (charAt16 << i33);
            } else {
                i2 = 1;
            }
            int i34 = i2 + 1;
            int charAt18 = a2.charAt(i2);
            if (charAt18 >= 55296) {
                int i35 = charAt18 & 8191;
                int i36 = 13;
                while (true) {
                    i29 = i34 + 1;
                    charAt15 = a2.charAt(i34);
                    if (charAt15 < 55296) {
                        break;
                    }
                    i35 |= (charAt15 & 8191) << i36;
                    i36 += 13;
                    i34 = i29;
                }
                charAt18 = i35 | (charAt15 << i36);
                i34 = i29;
            }
            if (charAt18 == 0) {
                iArr = a;
                i7 = 0;
                i4 = 0;
                charAt = 0;
                i5 = 0;
                charAt2 = 0;
                i6 = 0;
            } else {
                int i37 = i34 + 1;
                int charAt19 = a2.charAt(i34);
                if (charAt19 >= 55296) {
                    int i38 = charAt19 & 8191;
                    int i39 = 13;
                    while (true) {
                        i15 = i37 + 1;
                        charAt10 = a2.charAt(i37);
                        if (charAt10 < 55296) {
                            break;
                        }
                        i38 |= (charAt10 & 8191) << i39;
                        i39 += 13;
                        i37 = i15;
                    }
                    charAt19 = i38 | (charAt10 << i39);
                    i37 = i15;
                }
                int i40 = i37 + 1;
                int charAt20 = a2.charAt(i37);
                if (charAt20 >= 55296) {
                    int i41 = charAt20 & 8191;
                    int i42 = 13;
                    while (true) {
                        i14 = i40 + 1;
                        charAt9 = a2.charAt(i40);
                        if (charAt9 < 55296) {
                            break;
                        }
                        i41 |= (charAt9 & 8191) << i42;
                        i42 += 13;
                        i40 = i14;
                    }
                    charAt20 = i41 | (charAt9 << i42);
                    i40 = i14;
                }
                int i43 = i40 + 1;
                charAt = a2.charAt(i40);
                if (charAt >= 55296) {
                    int i44 = charAt & 8191;
                    int i45 = 13;
                    while (true) {
                        i13 = i43 + 1;
                        charAt8 = a2.charAt(i43);
                        if (charAt8 < 55296) {
                            break;
                        }
                        i44 |= (charAt8 & 8191) << i45;
                        i45 += 13;
                        i43 = i13;
                    }
                    charAt = i44 | (charAt8 << i45);
                    i43 = i13;
                }
                int i46 = i43 + 1;
                int charAt21 = a2.charAt(i43);
                if (charAt21 >= 55296) {
                    int i47 = charAt21 & 8191;
                    int i48 = 13;
                    while (true) {
                        i12 = i46 + 1;
                        charAt7 = a2.charAt(i46);
                        if (charAt7 < 55296) {
                            break;
                        }
                        i47 |= (charAt7 & 8191) << i48;
                        i48 += 13;
                        i46 = i12;
                    }
                    charAt21 = i47 | (charAt7 << i48);
                    i46 = i12;
                }
                int i49 = i46 + 1;
                charAt2 = a2.charAt(i46);
                if (charAt2 >= 55296) {
                    int i50 = charAt2 & 8191;
                    int i51 = 13;
                    while (true) {
                        i11 = i49 + 1;
                        charAt6 = a2.charAt(i49);
                        if (charAt6 < 55296) {
                            break;
                        }
                        i50 |= (charAt6 & 8191) << i51;
                        i51 += 13;
                        i49 = i11;
                    }
                    charAt2 = i50 | (charAt6 << i51);
                    i49 = i11;
                }
                int i52 = i49 + 1;
                int charAt22 = a2.charAt(i49);
                if (charAt22 >= 55296) {
                    int i53 = charAt22 & 8191;
                    int i54 = 13;
                    while (true) {
                        i10 = i52 + 1;
                        charAt5 = a2.charAt(i52);
                        if (charAt5 < 55296) {
                            break;
                        }
                        i53 |= (charAt5 & 8191) << i54;
                        i54 += 13;
                        i52 = i10;
                    }
                    charAt22 = i53 | (charAt5 << i54);
                    i52 = i10;
                }
                int i55 = i52 + 1;
                int charAt23 = a2.charAt(i52);
                if (charAt23 >= 55296) {
                    int i56 = charAt23 & 8191;
                    int i57 = i55;
                    int i58 = 13;
                    while (true) {
                        i9 = i57 + 1;
                        charAt4 = a2.charAt(i57);
                        if (charAt4 < 55296) {
                            break;
                        }
                        i56 |= (charAt4 & 8191) << i58;
                        i58 += 13;
                        i57 = i9;
                    }
                    charAt23 = i56 | (charAt4 << i58);
                    i3 = i9;
                } else {
                    i3 = i55;
                }
                int i59 = i3 + 1;
                int charAt24 = a2.charAt(i3);
                if (charAt24 >= 55296) {
                    int i60 = charAt24 & 8191;
                    int i61 = i59;
                    int i62 = 13;
                    while (true) {
                        i8 = i61 + 1;
                        charAt3 = a2.charAt(i61);
                        if (charAt3 < 55296) {
                            break;
                        }
                        i60 |= (charAt3 & 8191) << i62;
                        i62 += 13;
                        i61 = i8;
                    }
                    charAt24 = i60 | (charAt3 << i62);
                    i59 = i8;
                }
                int[] iArr2 = new int[charAt24 + charAt22 + charAt23];
                int i63 = (charAt19 << 1) + charAt20;
                i4 = charAt21;
                i5 = i63;
                i6 = charAt24;
                i30 = charAt19;
                i34 = i59;
                int i64 = charAt22;
                iArr = iArr2;
                i7 = i64;
            }
            Unsafe unsafe = f16037b;
            Object[] b2 = d2Var2.b();
            Class<?> cls3 = d2Var2.g().getClass();
            int i65 = i34;
            int[] iArr3 = new int[charAt2 * 3];
            Object[] objArr = new Object[charAt2 << 1];
            int i66 = i6 + i7;
            int i67 = i6;
            int i68 = i65;
            int i69 = i66;
            int i70 = 0;
            int i71 = 0;
            while (i68 < length) {
                int i72 = i68 + 1;
                int charAt25 = a2.charAt(i68);
                int i73 = length;
                if (charAt25 >= 55296) {
                    int i74 = charAt25 & 8191;
                    int i75 = i72;
                    int i76 = 13;
                    while (true) {
                        i28 = i75 + 1;
                        charAt14 = a2.charAt(i75);
                        i16 = i6;
                        if (charAt14 < 55296) {
                            break;
                        }
                        i74 |= (charAt14 & 8191) << i76;
                        i76 += 13;
                        i75 = i28;
                        i6 = i16;
                    }
                    charAt25 = i74 | (charAt14 << i76);
                    i17 = i28;
                } else {
                    i16 = i6;
                    i17 = i72;
                }
                int i77 = i17 + 1;
                int charAt26 = a2.charAt(i17);
                if (charAt26 >= 55296) {
                    int i78 = charAt26 & 8191;
                    int i79 = i77;
                    int i80 = 13;
                    while (true) {
                        i27 = i79 + 1;
                        charAt13 = a2.charAt(i79);
                        z = z2;
                        if (charAt13 < 55296) {
                            break;
                        }
                        i78 |= (charAt13 & 8191) << i80;
                        i80 += 13;
                        i79 = i27;
                        z2 = z;
                    }
                    charAt26 = i78 | (charAt13 << i80);
                    i18 = i27;
                } else {
                    z = z2;
                    i18 = i77;
                }
                int i81 = charAt26 & 255;
                int i82 = i4;
                if ((charAt26 & 1024) != 0) {
                    iArr[i70] = i71;
                    i70++;
                }
                int i83 = charAt;
                if (i81 >= 51) {
                    int i84 = i18 + 1;
                    int charAt27 = a2.charAt(i18);
                    char c2 = 55296;
                    if (charAt27 >= 55296) {
                        int i85 = charAt27 & 8191;
                        int i86 = 13;
                        while (true) {
                            i26 = i84 + 1;
                            charAt12 = a2.charAt(i84);
                            if (charAt12 < c2) {
                                break;
                            }
                            i85 |= (charAt12 & 8191) << i86;
                            i86 += 13;
                            i84 = i26;
                            c2 = 55296;
                        }
                        charAt27 = i85 | (charAt12 << i86);
                        i84 = i26;
                    }
                    int i87 = i81 - 51;
                    int i88 = i84;
                    if (i87 == 9 || i87 == 17) {
                        objArr[((i71 / 3) << 1) + 1] = b2[i5];
                        i5++;
                    } else if (i87 == 12 && (charAt17 & 1) == 1) {
                        objArr[((i71 / 3) << 1) + 1] = b2[i5];
                        i5++;
                    }
                    int i89 = charAt27 << 1;
                    Object obj = b2[i89];
                    if (obj instanceof Field) {
                        j3 = (Field) obj;
                    } else {
                        j3 = j(cls3, (String) obj);
                        b2[i89] = j3;
                    }
                    d2Var = d2Var2;
                    String str2 = a2;
                    objectFieldOffset = (int) unsafe.objectFieldOffset(j3);
                    int i90 = i89 + 1;
                    Object obj2 = b2[i90];
                    if (obj2 instanceof Field) {
                        j4 = (Field) obj2;
                    } else {
                        j4 = j(cls3, (String) obj2);
                        b2[i90] = j4;
                    }
                    cls2 = cls3;
                    i20 = i5;
                    i18 = i88;
                    str = str2;
                    i23 = 0;
                    i22 = (int) unsafe.objectFieldOffset(j4);
                    i21 = i30;
                } else {
                    d2Var = d2Var2;
                    String str3 = a2;
                    int i91 = i5 + 1;
                    Field j5 = j(cls3, (String) b2[i5]);
                    if (i81 == 9 || i81 == 17) {
                        i19 = 1;
                        objArr[((i71 / 3) << 1) + 1] = j5.getType();
                    } else {
                        if (i81 == 27 || i81 == 49) {
                            i19 = 1;
                            i25 = i91 + 1;
                            objArr[((i71 / 3) << 1) + 1] = b2[i91];
                        } else if (i81 == 12 || i81 == 30 || i81 == 44) {
                            i19 = 1;
                            if ((charAt17 & 1) == 1) {
                                i25 = i91 + 1;
                                objArr[((i71 / 3) << 1) + 1] = b2[i91];
                            }
                        } else {
                            if (i81 == 50) {
                                int i92 = i67 + 1;
                                iArr[i67] = i71;
                                int i93 = (i71 / 3) << 1;
                                int i94 = i91 + 1;
                                objArr[i93] = b2[i91];
                                if ((charAt26 & RecyclerView.l.FLAG_MOVED) != 0) {
                                    i91 = i94 + 1;
                                    objArr[i93 + 1] = b2[i94];
                                    i67 = i92;
                                } else {
                                    i91 = i94;
                                    i19 = 1;
                                    i67 = i92;
                                }
                            }
                            i19 = 1;
                        }
                        i91 = i25;
                    }
                    objectFieldOffset = (int) unsafe.objectFieldOffset(j5);
                    if ((charAt17 & 1) != i19 || i81 > 17) {
                        i20 = i91;
                        i21 = i30;
                        cls2 = cls3;
                        str = str3;
                        i22 = 0;
                        i23 = 0;
                    } else {
                        int i95 = i18 + 1;
                        str = str3;
                        int charAt28 = str.charAt(i18);
                        if (charAt28 >= 55296) {
                            int i96 = charAt28 & 8191;
                            int i97 = 13;
                            while (true) {
                                i24 = i95 + 1;
                                charAt11 = str.charAt(i95);
                                if (charAt11 < 55296) {
                                    break;
                                }
                                i96 |= (charAt11 & 8191) << i97;
                                i97 += 13;
                                i95 = i24;
                            }
                            charAt28 = i96 | (charAt11 << i97);
                            i95 = i24;
                        }
                        int i98 = (i30 << 1) + (charAt28 / 32);
                        Object obj3 = b2[i98];
                        i20 = i91;
                        if (obj3 instanceof Field) {
                            j2 = (Field) obj3;
                        } else {
                            j2 = j(cls3, (String) obj3);
                            b2[i98] = j2;
                        }
                        i21 = i30;
                        cls2 = cls3;
                        i22 = (int) unsafe.objectFieldOffset(j2);
                        i23 = charAt28 % 32;
                        i18 = i95;
                    }
                    if (i81 >= 18 && i81 <= 49) {
                        iArr[i69] = objectFieldOffset;
                        i69++;
                    }
                }
                int i99 = i71 + 1;
                iArr3[i71] = charAt25;
                int i100 = i99 + 1;
                iArr3[i99] = objectFieldOffset | ((charAt26 & 256) != 0 ? 268435456 : 0) | ((charAt26 & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 ? 536870912 : 0) | (i81 << 20);
                i71 = i100 + 1;
                iArr3[i100] = (i23 << 20) | i22;
                i30 = i21;
                a2 = str;
                i68 = i18;
                cls3 = cls2;
                i4 = i82;
                length = i73;
                i6 = i16;
                z2 = z;
                charAt = i83;
                i5 = i20;
                d2Var2 = d2Var;
            }
            return new w1<>(iArr3, objArr, charAt, i4, d2Var2.g(), z2, false, iArr, i6, i66, y1Var, h1Var, v2Var, v0Var, q1Var);
        }
        ((r2) t1Var).j();
        throw new NoSuchMethodError();
    }

    private static Field j(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40 + name.length() + String.valueOf(arrays).length());
            sb.append("Field ");
            sb.append(str);
            sb.append(" for ");
            sb.append(name);
            sb.append(" not found. Known fields are ");
            sb.append(arrays);
            throw new RuntimeException(sb.toString());
        }
    }

    private static void k(int i2, Object obj, l3 l3Var) throws IOException {
        if (obj instanceof String) {
            l3Var.H(i2, (String) obj);
        } else {
            l3Var.F(i2, (zzte) obj);
        }
    }

    private static <UT, UB> void l(v2<UT, UB> v2Var, T t, l3 l3Var) throws IOException {
        v2Var.a(v2Var.c(t), l3Var);
    }

    private final <K, V> void m(l3 l3Var, int i2, Object obj, int i3) throws IOException {
        if (obj != null) {
            l3Var.N(i2, this.s.c(w(i3)), this.s.d(obj));
        }
    }

    private final void n(T t, T t2, int i2) {
        long x = x(i2) & 1048575;
        if (u(t2, i2)) {
            Object A = z2.A(t, x);
            Object A2 = z2.A(t2, x);
            if (A != null && A2 != null) {
                z2.f(t, x, zzuq.e(A, A2));
                z(t, i2);
            } else if (A2 != null) {
                z2.f(t, x, A2);
                z(t, i2);
            }
        }
    }

    private final boolean o(T t, int i2, int i3) {
        return z2.r(t, (long) (y(i3) & 1048575)) == i2;
    }

    private final boolean p(T t, int i2, int i3, int i4) {
        if (this.f16045j) {
            return u(t, i2);
        }
        return (i3 & i4) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean q(Object obj, int i2, e2 e2Var) {
        return e2Var.f(z2.A(obj, i2 & 1048575));
    }

    private final void r(T t, int i2, int i3) {
        z2.k(t, y(i3) & 1048575, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:230:0x0494  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void s(T r19, com.google.android.gms.internal.measurement.l3 r20) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.w1.s(java.lang.Object, com.google.android.gms.internal.measurement.l3):void");
    }

    private final void t(T t, T t2, int i2) {
        int x = x(i2);
        int i3 = this.f16038c[i2];
        long j2 = x & 1048575;
        if (o(t2, i3, i2)) {
            Object A = z2.A(t, j2);
            Object A2 = z2.A(t2, j2);
            if (A != null && A2 != null) {
                z2.f(t, j2, zzuq.e(A, A2));
                r(t, i3, i2);
            } else if (A2 != null) {
                z2.f(t, j2, A2);
                r(t, i3, i2);
            }
        }
    }

    private final boolean u(T t, int i2) {
        if (this.f16045j) {
            int x = x(i2);
            long j2 = x & 1048575;
            switch ((x & 267386880) >>> 20) {
                case 0:
                    return z2.z(t, j2) != 0.0d;
                case 1:
                    return z2.x(t, j2) != 0.0f;
                case 2:
                    return z2.u(t, j2) != 0;
                case 3:
                    return z2.u(t, j2) != 0;
                case 4:
                    return z2.r(t, j2) != 0;
                case 5:
                    return z2.u(t, j2) != 0;
                case 6:
                    return z2.r(t, j2) != 0;
                case 7:
                    return z2.w(t, j2);
                case 8:
                    Object A = z2.A(t, j2);
                    if (A instanceof String) {
                        return !((String) A).isEmpty();
                    }
                    if (A instanceof zzte) {
                        return !zzte.f16104f.equals(A);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    return z2.A(t, j2) != null;
                case 10:
                    return !zzte.f16104f.equals(z2.A(t, j2));
                case 11:
                    return z2.r(t, j2) != 0;
                case 12:
                    return z2.r(t, j2) != 0;
                case 13:
                    return z2.r(t, j2) != 0;
                case 14:
                    return z2.u(t, j2) != 0;
                case 15:
                    return z2.r(t, j2) != 0;
                case 16:
                    return z2.u(t, j2) != 0;
                case 17:
                    return z2.A(t, j2) != null;
                default:
                    throw new IllegalArgumentException();
            }
        }
        int y = y(i2);
        return (z2.r(t, (long) (y & 1048575)) & (1 << (y >>> 20))) != 0;
    }

    private final e2 v(int i2) {
        int i3 = (i2 / 3) << 1;
        e2 e2Var = (e2) this.f16039d[i3];
        if (e2Var != null) {
            return e2Var;
        }
        e2<T> b2 = c2.c().b((Class) this.f16039d[i3 + 1]);
        this.f16039d[i3] = b2;
        return b2;
    }

    private final Object w(int i2) {
        return this.f16039d[(i2 / 3) << 1];
    }

    private final int x(int i2) {
        return this.f16038c[i2 + 1];
    }

    private final int y(int i2) {
        return this.f16038c[i2 + 2];
    }

    private final void z(T t, int i2) {
        if (this.f16045j) {
            return;
        }
        int y = y(i2);
        long j2 = y & 1048575;
        z2.k(t, j2, z2.r(t, j2) | (1 << (y >>> 20)));
    }

    @Override // com.google.android.gms.internal.measurement.e2
    public final void a(T t, T t2) {
        t2.getClass();
        for (int i2 = 0; i2 < this.f16038c.length; i2 += 3) {
            int x = x(i2);
            long j2 = 1048575 & x;
            int i3 = this.f16038c[i2];
            switch ((x & 267386880) >>> 20) {
                case 0:
                    if (u(t2, i2)) {
                        z2.c(t, j2, z2.z(t2, j2));
                        z(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (u(t2, i2)) {
                        z2.d(t, j2, z2.x(t2, j2));
                        z(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (u(t2, i2)) {
                        z2.e(t, j2, z2.u(t2, j2));
                        z(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (u(t2, i2)) {
                        z2.e(t, j2, z2.u(t2, j2));
                        z(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (u(t2, i2)) {
                        z2.k(t, j2, z2.r(t2, j2));
                        z(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (u(t2, i2)) {
                        z2.e(t, j2, z2.u(t2, j2));
                        z(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (u(t2, i2)) {
                        z2.k(t, j2, z2.r(t2, j2));
                        z(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (u(t2, i2)) {
                        z2.g(t, j2, z2.w(t2, j2));
                        z(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (u(t2, i2)) {
                        z2.f(t, j2, z2.A(t2, j2));
                        z(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    n(t, t2, i2);
                    break;
                case 10:
                    if (u(t2, i2)) {
                        z2.f(t, j2, z2.A(t2, j2));
                        z(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (u(t2, i2)) {
                        z2.k(t, j2, z2.r(t2, j2));
                        z(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (u(t2, i2)) {
                        z2.k(t, j2, z2.r(t2, j2));
                        z(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (u(t2, i2)) {
                        z2.k(t, j2, z2.r(t2, j2));
                        z(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (u(t2, i2)) {
                        z2.e(t, j2, z2.u(t2, j2));
                        z(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (u(t2, i2)) {
                        z2.k(t, j2, z2.r(t2, j2));
                        z(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (u(t2, i2)) {
                        z2.e(t, j2, z2.u(t2, j2));
                        z(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    n(t, t2, i2);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.p.a(t, t2, j2);
                    break;
                case 50:
                    g2.e(this.s, t, t2, j2);
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (o(t2, i3, i2)) {
                        z2.f(t, j2, z2.A(t2, j2));
                        r(t, i3, i2);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    t(t, t2, i2);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (o(t2, i3, i2)) {
                        z2.f(t, j2, z2.A(t2, j2));
                        r(t, i3, i2);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    t(t, t2, i2);
                    break;
            }
        }
        if (this.f16045j) {
            return;
        }
        g2.f(this.q, t, t2);
        if (this.f16043h) {
            g2.d(this.r, t, t2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x006a, code lost:
    
        if (com.google.android.gms.internal.measurement.g2.z(com.google.android.gms.internal.measurement.z2.A(r10, r6), com.google.android.gms.internal.measurement.z2.A(r11, r6)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007e, code lost:
    
        if (com.google.android.gms.internal.measurement.z2.u(r10, r6) == com.google.android.gms.internal.measurement.z2.u(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0090, code lost:
    
        if (com.google.android.gms.internal.measurement.z2.r(r10, r6) == com.google.android.gms.internal.measurement.z2.r(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a4, code lost:
    
        if (com.google.android.gms.internal.measurement.z2.u(r10, r6) == com.google.android.gms.internal.measurement.z2.u(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b6, code lost:
    
        if (com.google.android.gms.internal.measurement.z2.r(r10, r6) == com.google.android.gms.internal.measurement.z2.r(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c8, code lost:
    
        if (com.google.android.gms.internal.measurement.z2.r(r10, r6) == com.google.android.gms.internal.measurement.z2.r(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00da, code lost:
    
        if (com.google.android.gms.internal.measurement.z2.r(r10, r6) == com.google.android.gms.internal.measurement.z2.r(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00f0, code lost:
    
        if (com.google.android.gms.internal.measurement.g2.z(com.google.android.gms.internal.measurement.z2.A(r10, r6), com.google.android.gms.internal.measurement.z2.A(r11, r6)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0106, code lost:
    
        if (com.google.android.gms.internal.measurement.g2.z(com.google.android.gms.internal.measurement.z2.A(r10, r6), com.google.android.gms.internal.measurement.z2.A(r11, r6)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x011c, code lost:
    
        if (com.google.android.gms.internal.measurement.g2.z(com.google.android.gms.internal.measurement.z2.A(r10, r6), com.google.android.gms.internal.measurement.z2.A(r11, r6)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x012e, code lost:
    
        if (com.google.android.gms.internal.measurement.z2.w(r10, r6) == com.google.android.gms.internal.measurement.z2.w(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0140, code lost:
    
        if (com.google.android.gms.internal.measurement.z2.r(r10, r6) == com.google.android.gms.internal.measurement.z2.r(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0154, code lost:
    
        if (com.google.android.gms.internal.measurement.z2.u(r10, r6) == com.google.android.gms.internal.measurement.z2.u(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0165, code lost:
    
        if (com.google.android.gms.internal.measurement.z2.r(r10, r6) == com.google.android.gms.internal.measurement.z2.r(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0178, code lost:
    
        if (com.google.android.gms.internal.measurement.z2.u(r10, r6) == com.google.android.gms.internal.measurement.z2.u(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x018b, code lost:
    
        if (com.google.android.gms.internal.measurement.z2.u(r10, r6) == com.google.android.gms.internal.measurement.z2.u(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01a4, code lost:
    
        if (java.lang.Float.floatToIntBits(com.google.android.gms.internal.measurement.z2.x(r10, r6)) == java.lang.Float.floatToIntBits(com.google.android.gms.internal.measurement.z2.x(r11, r6))) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01bf, code lost:
    
        if (java.lang.Double.doubleToLongBits(com.google.android.gms.internal.measurement.z2.z(r10, r6)) == java.lang.Double.doubleToLongBits(com.google.android.gms.internal.measurement.z2.z(r11, r6))) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0038, code lost:
    
        if (com.google.android.gms.internal.measurement.g2.z(com.google.android.gms.internal.measurement.z2.A(r10, r6), com.google.android.gms.internal.measurement.z2.A(r11, r6)) != false) goto L105;
     */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01c5 A[LOOP:0: B:2:0x0005->B:86:0x01c5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01c4 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.measurement.e2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(T r10, T r11) {
        /*
            Method dump skipped, instructions count: 640
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.w1.b(java.lang.Object, java.lang.Object):boolean");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x001b. Please report as an issue. */
    @Override // com.google.android.gms.internal.measurement.e2
    public final int c(T t) {
        int i2;
        int f2;
        int length = this.f16038c.length;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4 += 3) {
            int x = x(i4);
            int i5 = this.f16038c[i4];
            long j2 = 1048575 & x;
            int i6 = 37;
            switch ((x & 267386880) >>> 20) {
                case 0:
                    i2 = i3 * 53;
                    f2 = zzuq.f(Double.doubleToLongBits(z2.z(t, j2)));
                    i3 = i2 + f2;
                    break;
                case 1:
                    i2 = i3 * 53;
                    f2 = Float.floatToIntBits(z2.x(t, j2));
                    i3 = i2 + f2;
                    break;
                case 2:
                    i2 = i3 * 53;
                    f2 = zzuq.f(z2.u(t, j2));
                    i3 = i2 + f2;
                    break;
                case 3:
                    i2 = i3 * 53;
                    f2 = zzuq.f(z2.u(t, j2));
                    i3 = i2 + f2;
                    break;
                case 4:
                    i2 = i3 * 53;
                    f2 = z2.r(t, j2);
                    i3 = i2 + f2;
                    break;
                case 5:
                    i2 = i3 * 53;
                    f2 = zzuq.f(z2.u(t, j2));
                    i3 = i2 + f2;
                    break;
                case 6:
                    i2 = i3 * 53;
                    f2 = z2.r(t, j2);
                    i3 = i2 + f2;
                    break;
                case 7:
                    i2 = i3 * 53;
                    f2 = zzuq.j(z2.w(t, j2));
                    i3 = i2 + f2;
                    break;
                case 8:
                    i2 = i3 * 53;
                    f2 = ((String) z2.A(t, j2)).hashCode();
                    i3 = i2 + f2;
                    break;
                case 9:
                    Object A = z2.A(t, j2);
                    if (A != null) {
                        i6 = A.hashCode();
                    }
                    i3 = (i3 * 53) + i6;
                    break;
                case 10:
                    i2 = i3 * 53;
                    f2 = z2.A(t, j2).hashCode();
                    i3 = i2 + f2;
                    break;
                case 11:
                    i2 = i3 * 53;
                    f2 = z2.r(t, j2);
                    i3 = i2 + f2;
                    break;
                case 12:
                    i2 = i3 * 53;
                    f2 = z2.r(t, j2);
                    i3 = i2 + f2;
                    break;
                case 13:
                    i2 = i3 * 53;
                    f2 = z2.r(t, j2);
                    i3 = i2 + f2;
                    break;
                case 14:
                    i2 = i3 * 53;
                    f2 = zzuq.f(z2.u(t, j2));
                    i3 = i2 + f2;
                    break;
                case 15:
                    i2 = i3 * 53;
                    f2 = z2.r(t, j2);
                    i3 = i2 + f2;
                    break;
                case 16:
                    i2 = i3 * 53;
                    f2 = zzuq.f(z2.u(t, j2));
                    i3 = i2 + f2;
                    break;
                case 17:
                    Object A2 = z2.A(t, j2);
                    if (A2 != null) {
                        i6 = A2.hashCode();
                    }
                    i3 = (i3 * 53) + i6;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i2 = i3 * 53;
                    f2 = z2.A(t, j2).hashCode();
                    i3 = i2 + f2;
                    break;
                case 50:
                    i2 = i3 * 53;
                    f2 = z2.A(t, j2).hashCode();
                    i3 = i2 + f2;
                    break;
                case 51:
                    if (o(t, i5, i4)) {
                        i2 = i3 * 53;
                        f2 = zzuq.f(Double.doubleToLongBits(C(t, j2)));
                        i3 = i2 + f2;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (o(t, i5, i4)) {
                        i2 = i3 * 53;
                        f2 = Float.floatToIntBits(D(t, j2));
                        i3 = i2 + f2;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (o(t, i5, i4)) {
                        i2 = i3 * 53;
                        f2 = zzuq.f(F(t, j2));
                        i3 = i2 + f2;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (o(t, i5, i4)) {
                        i2 = i3 * 53;
                        f2 = zzuq.f(F(t, j2));
                        i3 = i2 + f2;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (o(t, i5, i4)) {
                        i2 = i3 * 53;
                        f2 = E(t, j2);
                        i3 = i2 + f2;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (o(t, i5, i4)) {
                        i2 = i3 * 53;
                        f2 = zzuq.f(F(t, j2));
                        i3 = i2 + f2;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (o(t, i5, i4)) {
                        i2 = i3 * 53;
                        f2 = E(t, j2);
                        i3 = i2 + f2;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (o(t, i5, i4)) {
                        i2 = i3 * 53;
                        f2 = zzuq.j(G(t, j2));
                        i3 = i2 + f2;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (o(t, i5, i4)) {
                        i2 = i3 * 53;
                        f2 = ((String) z2.A(t, j2)).hashCode();
                        i3 = i2 + f2;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (o(t, i5, i4)) {
                        i2 = i3 * 53;
                        f2 = z2.A(t, j2).hashCode();
                        i3 = i2 + f2;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (o(t, i5, i4)) {
                        i2 = i3 * 53;
                        f2 = z2.A(t, j2).hashCode();
                        i3 = i2 + f2;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (o(t, i5, i4)) {
                        i2 = i3 * 53;
                        f2 = E(t, j2);
                        i3 = i2 + f2;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (o(t, i5, i4)) {
                        i2 = i3 * 53;
                        f2 = E(t, j2);
                        i3 = i2 + f2;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (o(t, i5, i4)) {
                        i2 = i3 * 53;
                        f2 = E(t, j2);
                        i3 = i2 + f2;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (o(t, i5, i4)) {
                        i2 = i3 * 53;
                        f2 = zzuq.f(F(t, j2));
                        i3 = i2 + f2;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (o(t, i5, i4)) {
                        i2 = i3 * 53;
                        f2 = E(t, j2);
                        i3 = i2 + f2;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (o(t, i5, i4)) {
                        i2 = i3 * 53;
                        f2 = zzuq.f(F(t, j2));
                        i3 = i2 + f2;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (o(t, i5, i4)) {
                        i2 = i3 * 53;
                        f2 = z2.A(t, j2).hashCode();
                        i3 = i2 + f2;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i3 * 53) + this.q.c(t).hashCode();
        return this.f16043h ? (hashCode * 53) + this.r.d(t).hashCode() : hashCode;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:11:0x0042. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:299:0x0545. Please report as an issue. */
    @Override // com.google.android.gms.internal.measurement.e2
    public final int d(T t) {
        int i2;
        int i3;
        long j2;
        int h0;
        int c0;
        int B0;
        int m;
        int O;
        int Q;
        int w;
        int m2;
        int O2;
        int Q2;
        int i4 = 267386880;
        if (this.f16045j) {
            Unsafe unsafe = f16037b;
            int i5 = 0;
            int i6 = 0;
            while (i5 < this.f16038c.length) {
                int x = x(i5);
                int i7 = (x & i4) >>> 20;
                int i8 = this.f16038c[i5];
                long j3 = x & 1048575;
                int i9 = (i7 < zzui.O.d() || i7 > zzui.b0.d()) ? 0 : this.f16038c[i5 + 2] & 1048575;
                switch (i7) {
                    case 0:
                        if (u(t, i5)) {
                            w = zztv.w(i8, 0.0d);
                            i6 += w;
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (u(t, i5)) {
                            w = zztv.x(i8, 0.0f);
                            i6 += w;
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if (u(t, i5)) {
                            w = zztv.h0(i8, z2.u(t, j3));
                            i6 += w;
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if (u(t, i5)) {
                            w = zztv.m0(i8, z2.u(t, j3));
                            i6 += w;
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if (u(t, i5)) {
                            w = zztv.u0(i8, z2.r(t, j3));
                            i6 += w;
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if (u(t, i5)) {
                            w = zztv.q0(i8, 0L);
                            i6 += w;
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        if (u(t, i5)) {
                            w = zztv.z0(i8, 0);
                            i6 += w;
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        if (u(t, i5)) {
                            w = zztv.c0(i8, true);
                            i6 += w;
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if (u(t, i5)) {
                            Object A = z2.A(t, j3);
                            if (A instanceof zzte) {
                                w = zztv.Y(i8, (zzte) A);
                            } else {
                                w = zztv.b0(i8, (String) A);
                            }
                            i6 += w;
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        if (u(t, i5)) {
                            w = g2.r(i8, z2.A(t, j3), v(i5));
                            i6 += w;
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        if (u(t, i5)) {
                            w = zztv.Y(i8, (zzte) z2.A(t, j3));
                            i6 += w;
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        if (u(t, i5)) {
                            w = zztv.w0(i8, z2.r(t, j3));
                            i6 += w;
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        if (u(t, i5)) {
                            w = zztv.C0(i8, z2.r(t, j3));
                            i6 += w;
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        if (u(t, i5)) {
                            w = zztv.B0(i8, 0);
                            i6 += w;
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        if (u(t, i5)) {
                            w = zztv.v0(i8, 0L);
                            i6 += w;
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        if (u(t, i5)) {
                            w = zztv.x0(i8, z2.r(t, j3));
                            i6 += w;
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        if (u(t, i5)) {
                            w = zztv.o0(i8, z2.u(t, j3));
                            i6 += w;
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        if (u(t, i5)) {
                            w = zztv.a0(i8, (zzvv) z2.A(t, j3), v(i5));
                            i6 += w;
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        w = g2.T(i8, B(t, j3), false);
                        i6 += w;
                        break;
                    case 19:
                        w = g2.R(i8, B(t, j3), false);
                        i6 += w;
                        break;
                    case 20:
                        w = g2.K(i8, B(t, j3), false);
                        i6 += w;
                        break;
                    case 21:
                        w = g2.L(i8, B(t, j3), false);
                        i6 += w;
                        break;
                    case 22:
                        w = g2.O(i8, B(t, j3), false);
                        i6 += w;
                        break;
                    case 23:
                        w = g2.T(i8, B(t, j3), false);
                        i6 += w;
                        break;
                    case 24:
                        w = g2.R(i8, B(t, j3), false);
                        i6 += w;
                        break;
                    case 25:
                        w = g2.U(i8, B(t, j3), false);
                        i6 += w;
                        break;
                    case 26:
                        w = g2.s(i8, B(t, j3));
                        i6 += w;
                        break;
                    case 27:
                        w = g2.t(i8, B(t, j3), v(i5));
                        i6 += w;
                        break;
                    case 28:
                        w = g2.v(i8, B(t, j3));
                        i6 += w;
                        break;
                    case 29:
                        w = g2.P(i8, B(t, j3), false);
                        i6 += w;
                        break;
                    case 30:
                        w = g2.N(i8, B(t, j3), false);
                        i6 += w;
                        break;
                    case 31:
                        w = g2.R(i8, B(t, j3), false);
                        i6 += w;
                        break;
                    case 32:
                        w = g2.T(i8, B(t, j3), false);
                        i6 += w;
                        break;
                    case 33:
                        w = g2.Q(i8, B(t, j3), false);
                        i6 += w;
                        break;
                    case 34:
                        w = g2.M(i8, B(t, j3), false);
                        i6 += w;
                        break;
                    case 35:
                        m2 = g2.m((List) unsafe.getObject(t, j3));
                        if (m2 <= 0) {
                            break;
                        } else {
                            if (this.f16046k) {
                                unsafe.putInt(t, i9, m2);
                            }
                            O2 = zztv.O(i8);
                            Q2 = zztv.Q(m2);
                            w = O2 + Q2 + m2;
                            i6 += w;
                            break;
                        }
                    case 36:
                        m2 = g2.l((List) unsafe.getObject(t, j3));
                        if (m2 <= 0) {
                            break;
                        } else {
                            if (this.f16046k) {
                                unsafe.putInt(t, i9, m2);
                            }
                            O2 = zztv.O(i8);
                            Q2 = zztv.Q(m2);
                            w = O2 + Q2 + m2;
                            i6 += w;
                            break;
                        }
                    case 37:
                        m2 = g2.Y((List) unsafe.getObject(t, j3));
                        if (m2 <= 0) {
                            break;
                        } else {
                            if (this.f16046k) {
                                unsafe.putInt(t, i9, m2);
                            }
                            O2 = zztv.O(i8);
                            Q2 = zztv.Q(m2);
                            w = O2 + Q2 + m2;
                            i6 += w;
                            break;
                        }
                    case 38:
                        m2 = g2.b0((List) unsafe.getObject(t, j3));
                        if (m2 <= 0) {
                            break;
                        } else {
                            if (this.f16046k) {
                                unsafe.putInt(t, i9, m2);
                            }
                            O2 = zztv.O(i8);
                            Q2 = zztv.Q(m2);
                            w = O2 + Q2 + m2;
                            i6 += w;
                            break;
                        }
                    case 39:
                        m2 = g2.i((List) unsafe.getObject(t, j3));
                        if (m2 <= 0) {
                            break;
                        } else {
                            if (this.f16046k) {
                                unsafe.putInt(t, i9, m2);
                            }
                            O2 = zztv.O(i8);
                            Q2 = zztv.Q(m2);
                            w = O2 + Q2 + m2;
                            i6 += w;
                            break;
                        }
                    case 40:
                        m2 = g2.m((List) unsafe.getObject(t, j3));
                        if (m2 <= 0) {
                            break;
                        } else {
                            if (this.f16046k) {
                                unsafe.putInt(t, i9, m2);
                            }
                            O2 = zztv.O(i8);
                            Q2 = zztv.Q(m2);
                            w = O2 + Q2 + m2;
                            i6 += w;
                            break;
                        }
                    case 41:
                        m2 = g2.l((List) unsafe.getObject(t, j3));
                        if (m2 <= 0) {
                            break;
                        } else {
                            if (this.f16046k) {
                                unsafe.putInt(t, i9, m2);
                            }
                            O2 = zztv.O(i8);
                            Q2 = zztv.Q(m2);
                            w = O2 + Q2 + m2;
                            i6 += w;
                            break;
                        }
                    case 42:
                        m2 = g2.n((List) unsafe.getObject(t, j3));
                        if (m2 <= 0) {
                            break;
                        } else {
                            if (this.f16046k) {
                                unsafe.putInt(t, i9, m2);
                            }
                            O2 = zztv.O(i8);
                            Q2 = zztv.Q(m2);
                            w = O2 + Q2 + m2;
                            i6 += w;
                            break;
                        }
                    case 43:
                        m2 = g2.j((List) unsafe.getObject(t, j3));
                        if (m2 <= 0) {
                            break;
                        } else {
                            if (this.f16046k) {
                                unsafe.putInt(t, i9, m2);
                            }
                            O2 = zztv.O(i8);
                            Q2 = zztv.Q(m2);
                            w = O2 + Q2 + m2;
                            i6 += w;
                            break;
                        }
                    case 44:
                        m2 = g2.h((List) unsafe.getObject(t, j3));
                        if (m2 <= 0) {
                            break;
                        } else {
                            if (this.f16046k) {
                                unsafe.putInt(t, i9, m2);
                            }
                            O2 = zztv.O(i8);
                            Q2 = zztv.Q(m2);
                            w = O2 + Q2 + m2;
                            i6 += w;
                            break;
                        }
                    case 45:
                        m2 = g2.l((List) unsafe.getObject(t, j3));
                        if (m2 <= 0) {
                            break;
                        } else {
                            if (this.f16046k) {
                                unsafe.putInt(t, i9, m2);
                            }
                            O2 = zztv.O(i8);
                            Q2 = zztv.Q(m2);
                            w = O2 + Q2 + m2;
                            i6 += w;
                            break;
                        }
                    case 46:
                        m2 = g2.m((List) unsafe.getObject(t, j3));
                        if (m2 <= 0) {
                            break;
                        } else {
                            if (this.f16046k) {
                                unsafe.putInt(t, i9, m2);
                            }
                            O2 = zztv.O(i8);
                            Q2 = zztv.Q(m2);
                            w = O2 + Q2 + m2;
                            i6 += w;
                            break;
                        }
                    case 47:
                        m2 = g2.k((List) unsafe.getObject(t, j3));
                        if (m2 <= 0) {
                            break;
                        } else {
                            if (this.f16046k) {
                                unsafe.putInt(t, i9, m2);
                            }
                            O2 = zztv.O(i8);
                            Q2 = zztv.Q(m2);
                            w = O2 + Q2 + m2;
                            i6 += w;
                            break;
                        }
                    case 48:
                        m2 = g2.g((List) unsafe.getObject(t, j3));
                        if (m2 <= 0) {
                            break;
                        } else {
                            if (this.f16046k) {
                                unsafe.putInt(t, i9, m2);
                            }
                            O2 = zztv.O(i8);
                            Q2 = zztv.Q(m2);
                            w = O2 + Q2 + m2;
                            i6 += w;
                            break;
                        }
                    case 49:
                        w = g2.w(i8, B(t, j3), v(i5));
                        i6 += w;
                        break;
                    case 50:
                        w = this.s.e(i8, z2.A(t, j3), w(i5));
                        i6 += w;
                        break;
                    case 51:
                        if (o(t, i8, i5)) {
                            w = zztv.w(i8, 0.0d);
                            i6 += w;
                            break;
                        } else {
                            break;
                        }
                    case 52:
                        if (o(t, i8, i5)) {
                            w = zztv.x(i8, 0.0f);
                            i6 += w;
                            break;
                        } else {
                            break;
                        }
                    case 53:
                        if (o(t, i8, i5)) {
                            w = zztv.h0(i8, F(t, j3));
                            i6 += w;
                            break;
                        } else {
                            break;
                        }
                    case 54:
                        if (o(t, i8, i5)) {
                            w = zztv.m0(i8, F(t, j3));
                            i6 += w;
                            break;
                        } else {
                            break;
                        }
                    case 55:
                        if (o(t, i8, i5)) {
                            w = zztv.u0(i8, E(t, j3));
                            i6 += w;
                            break;
                        } else {
                            break;
                        }
                    case 56:
                        if (o(t, i8, i5)) {
                            w = zztv.q0(i8, 0L);
                            i6 += w;
                            break;
                        } else {
                            break;
                        }
                    case 57:
                        if (o(t, i8, i5)) {
                            w = zztv.z0(i8, 0);
                            i6 += w;
                            break;
                        } else {
                            break;
                        }
                    case 58:
                        if (o(t, i8, i5)) {
                            w = zztv.c0(i8, true);
                            i6 += w;
                            break;
                        } else {
                            break;
                        }
                    case 59:
                        if (o(t, i8, i5)) {
                            Object A2 = z2.A(t, j3);
                            if (A2 instanceof zzte) {
                                w = zztv.Y(i8, (zzte) A2);
                            } else {
                                w = zztv.b0(i8, (String) A2);
                            }
                            i6 += w;
                            break;
                        } else {
                            break;
                        }
                    case 60:
                        if (o(t, i8, i5)) {
                            w = g2.r(i8, z2.A(t, j3), v(i5));
                            i6 += w;
                            break;
                        } else {
                            break;
                        }
                    case 61:
                        if (o(t, i8, i5)) {
                            w = zztv.Y(i8, (zzte) z2.A(t, j3));
                            i6 += w;
                            break;
                        } else {
                            break;
                        }
                    case 62:
                        if (o(t, i8, i5)) {
                            w = zztv.w0(i8, E(t, j3));
                            i6 += w;
                            break;
                        } else {
                            break;
                        }
                    case 63:
                        if (o(t, i8, i5)) {
                            w = zztv.C0(i8, E(t, j3));
                            i6 += w;
                            break;
                        } else {
                            break;
                        }
                    case 64:
                        if (o(t, i8, i5)) {
                            w = zztv.B0(i8, 0);
                            i6 += w;
                            break;
                        } else {
                            break;
                        }
                    case 65:
                        if (o(t, i8, i5)) {
                            w = zztv.v0(i8, 0L);
                            i6 += w;
                            break;
                        } else {
                            break;
                        }
                    case 66:
                        if (o(t, i8, i5)) {
                            w = zztv.x0(i8, E(t, j3));
                            i6 += w;
                            break;
                        } else {
                            break;
                        }
                    case 67:
                        if (o(t, i8, i5)) {
                            w = zztv.o0(i8, F(t, j3));
                            i6 += w;
                            break;
                        } else {
                            break;
                        }
                    case 68:
                        if (o(t, i8, i5)) {
                            w = zztv.a0(i8, (zzvv) z2.A(t, j3), v(i5));
                            i6 += w;
                            break;
                        } else {
                            break;
                        }
                }
                i5 += 3;
                i4 = 267386880;
            }
            return i6 + h(this.q, t);
        }
        Unsafe unsafe2 = f16037b;
        int i10 = -1;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < this.f16038c.length; i13 += 3) {
            int x2 = x(i13);
            int[] iArr = this.f16038c;
            int i14 = iArr[i13];
            int i15 = (x2 & 267386880) >>> 20;
            if (i15 <= 17) {
                int i16 = iArr[i13 + 2];
                int i17 = i16 & 1048575;
                i3 = 1 << (i16 >>> 20);
                if (i17 != i10) {
                    i12 = unsafe2.getInt(t, i17);
                    i10 = i17;
                }
                i2 = i16;
            } else {
                i2 = (!this.f16046k || i15 < zzui.O.d() || i15 > zzui.b0.d()) ? 0 : this.f16038c[i13 + 2] & 1048575;
                i3 = 0;
            }
            long j4 = x2 & 1048575;
            switch (i15) {
                case 0:
                    j2 = 0;
                    if ((i12 & i3) != 0) {
                        i11 += zztv.w(i14, 0.0d);
                        break;
                    }
                    break;
                case 1:
                    j2 = 0;
                    if ((i12 & i3) != 0) {
                        i11 += zztv.x(i14, 0.0f);
                        break;
                    }
                case 2:
                    j2 = 0;
                    if ((i12 & i3) != 0) {
                        h0 = zztv.h0(i14, unsafe2.getLong(t, j4));
                        i11 += h0;
                    }
                    break;
                case 3:
                    j2 = 0;
                    if ((i12 & i3) != 0) {
                        h0 = zztv.m0(i14, unsafe2.getLong(t, j4));
                        i11 += h0;
                    }
                    break;
                case 4:
                    j2 = 0;
                    if ((i12 & i3) != 0) {
                        h0 = zztv.u0(i14, unsafe2.getInt(t, j4));
                        i11 += h0;
                    }
                    break;
                case 5:
                    j2 = 0;
                    if ((i12 & i3) != 0) {
                        h0 = zztv.q0(i14, 0L);
                        i11 += h0;
                    }
                    break;
                case 6:
                    if ((i12 & i3) != 0) {
                        i11 += zztv.z0(i14, 0);
                        j2 = 0;
                        break;
                    }
                    j2 = 0;
                case 7:
                    if ((i12 & i3) != 0) {
                        c0 = zztv.c0(i14, true);
                        i11 += c0;
                    }
                    j2 = 0;
                    break;
                case 8:
                    if ((i12 & i3) != 0) {
                        Object object = unsafe2.getObject(t, j4);
                        if (object instanceof zzte) {
                            c0 = zztv.Y(i14, (zzte) object);
                        } else {
                            c0 = zztv.b0(i14, (String) object);
                        }
                        i11 += c0;
                    }
                    j2 = 0;
                    break;
                case 9:
                    if ((i12 & i3) != 0) {
                        c0 = g2.r(i14, unsafe2.getObject(t, j4), v(i13));
                        i11 += c0;
                    }
                    j2 = 0;
                    break;
                case 10:
                    if ((i12 & i3) != 0) {
                        c0 = zztv.Y(i14, (zzte) unsafe2.getObject(t, j4));
                        i11 += c0;
                    }
                    j2 = 0;
                    break;
                case 11:
                    if ((i12 & i3) != 0) {
                        c0 = zztv.w0(i14, unsafe2.getInt(t, j4));
                        i11 += c0;
                    }
                    j2 = 0;
                    break;
                case 12:
                    if ((i12 & i3) != 0) {
                        c0 = zztv.C0(i14, unsafe2.getInt(t, j4));
                        i11 += c0;
                    }
                    j2 = 0;
                    break;
                case 13:
                    if ((i12 & i3) != 0) {
                        B0 = zztv.B0(i14, 0);
                        i11 += B0;
                    }
                    j2 = 0;
                    break;
                case 14:
                    if ((i12 & i3) != 0) {
                        c0 = zztv.v0(i14, 0L);
                        i11 += c0;
                    }
                    j2 = 0;
                    break;
                case 15:
                    if ((i12 & i3) != 0) {
                        c0 = zztv.x0(i14, unsafe2.getInt(t, j4));
                        i11 += c0;
                    }
                    j2 = 0;
                    break;
                case 16:
                    if ((i12 & i3) != 0) {
                        c0 = zztv.o0(i14, unsafe2.getLong(t, j4));
                        i11 += c0;
                    }
                    j2 = 0;
                    break;
                case 17:
                    if ((i12 & i3) != 0) {
                        c0 = zztv.a0(i14, (zzvv) unsafe2.getObject(t, j4), v(i13));
                        i11 += c0;
                    }
                    j2 = 0;
                    break;
                case 18:
                    c0 = g2.T(i14, (List) unsafe2.getObject(t, j4), false);
                    i11 += c0;
                    j2 = 0;
                    break;
                case 19:
                    c0 = g2.R(i14, (List) unsafe2.getObject(t, j4), false);
                    i11 += c0;
                    j2 = 0;
                    break;
                case 20:
                    c0 = g2.K(i14, (List) unsafe2.getObject(t, j4), false);
                    i11 += c0;
                    j2 = 0;
                    break;
                case 21:
                    c0 = g2.L(i14, (List) unsafe2.getObject(t, j4), false);
                    i11 += c0;
                    j2 = 0;
                    break;
                case 22:
                    c0 = g2.O(i14, (List) unsafe2.getObject(t, j4), false);
                    i11 += c0;
                    j2 = 0;
                    break;
                case 23:
                    c0 = g2.T(i14, (List) unsafe2.getObject(t, j4), false);
                    i11 += c0;
                    j2 = 0;
                    break;
                case 24:
                    c0 = g2.R(i14, (List) unsafe2.getObject(t, j4), false);
                    i11 += c0;
                    j2 = 0;
                    break;
                case 25:
                    c0 = g2.U(i14, (List) unsafe2.getObject(t, j4), false);
                    i11 += c0;
                    j2 = 0;
                    break;
                case 26:
                    c0 = g2.s(i14, (List) unsafe2.getObject(t, j4));
                    i11 += c0;
                    j2 = 0;
                    break;
                case 27:
                    c0 = g2.t(i14, (List) unsafe2.getObject(t, j4), v(i13));
                    i11 += c0;
                    j2 = 0;
                    break;
                case 28:
                    c0 = g2.v(i14, (List) unsafe2.getObject(t, j4));
                    i11 += c0;
                    j2 = 0;
                    break;
                case 29:
                    c0 = g2.P(i14, (List) unsafe2.getObject(t, j4), false);
                    i11 += c0;
                    j2 = 0;
                    break;
                case 30:
                    c0 = g2.N(i14, (List) unsafe2.getObject(t, j4), false);
                    i11 += c0;
                    j2 = 0;
                    break;
                case 31:
                    c0 = g2.R(i14, (List) unsafe2.getObject(t, j4), false);
                    i11 += c0;
                    j2 = 0;
                    break;
                case 32:
                    c0 = g2.T(i14, (List) unsafe2.getObject(t, j4), false);
                    i11 += c0;
                    j2 = 0;
                    break;
                case 33:
                    c0 = g2.Q(i14, (List) unsafe2.getObject(t, j4), false);
                    i11 += c0;
                    j2 = 0;
                    break;
                case 34:
                    c0 = g2.M(i14, (List) unsafe2.getObject(t, j4), false);
                    i11 += c0;
                    j2 = 0;
                    break;
                case 35:
                    m = g2.m((List) unsafe2.getObject(t, j4));
                    if (m > 0) {
                        if (this.f16046k) {
                            unsafe2.putInt(t, i2, m);
                        }
                        O = zztv.O(i14);
                        Q = zztv.Q(m);
                        B0 = O + Q + m;
                        i11 += B0;
                    }
                    j2 = 0;
                    break;
                case 36:
                    m = g2.l((List) unsafe2.getObject(t, j4));
                    if (m > 0) {
                        if (this.f16046k) {
                            unsafe2.putInt(t, i2, m);
                        }
                        O = zztv.O(i14);
                        Q = zztv.Q(m);
                        B0 = O + Q + m;
                        i11 += B0;
                    }
                    j2 = 0;
                    break;
                case 37:
                    m = g2.Y((List) unsafe2.getObject(t, j4));
                    if (m > 0) {
                        if (this.f16046k) {
                            unsafe2.putInt(t, i2, m);
                        }
                        O = zztv.O(i14);
                        Q = zztv.Q(m);
                        B0 = O + Q + m;
                        i11 += B0;
                    }
                    j2 = 0;
                    break;
                case 38:
                    m = g2.b0((List) unsafe2.getObject(t, j4));
                    if (m > 0) {
                        if (this.f16046k) {
                            unsafe2.putInt(t, i2, m);
                        }
                        O = zztv.O(i14);
                        Q = zztv.Q(m);
                        B0 = O + Q + m;
                        i11 += B0;
                    }
                    j2 = 0;
                    break;
                case 39:
                    m = g2.i((List) unsafe2.getObject(t, j4));
                    if (m > 0) {
                        if (this.f16046k) {
                            unsafe2.putInt(t, i2, m);
                        }
                        O = zztv.O(i14);
                        Q = zztv.Q(m);
                        B0 = O + Q + m;
                        i11 += B0;
                    }
                    j2 = 0;
                    break;
                case 40:
                    m = g2.m((List) unsafe2.getObject(t, j4));
                    if (m > 0) {
                        if (this.f16046k) {
                            unsafe2.putInt(t, i2, m);
                        }
                        O = zztv.O(i14);
                        Q = zztv.Q(m);
                        B0 = O + Q + m;
                        i11 += B0;
                    }
                    j2 = 0;
                    break;
                case 41:
                    m = g2.l((List) unsafe2.getObject(t, j4));
                    if (m > 0) {
                        if (this.f16046k) {
                            unsafe2.putInt(t, i2, m);
                        }
                        O = zztv.O(i14);
                        Q = zztv.Q(m);
                        B0 = O + Q + m;
                        i11 += B0;
                    }
                    j2 = 0;
                    break;
                case 42:
                    m = g2.n((List) unsafe2.getObject(t, j4));
                    if (m > 0) {
                        if (this.f16046k) {
                            unsafe2.putInt(t, i2, m);
                        }
                        O = zztv.O(i14);
                        Q = zztv.Q(m);
                        B0 = O + Q + m;
                        i11 += B0;
                    }
                    j2 = 0;
                    break;
                case 43:
                    m = g2.j((List) unsafe2.getObject(t, j4));
                    if (m > 0) {
                        if (this.f16046k) {
                            unsafe2.putInt(t, i2, m);
                        }
                        O = zztv.O(i14);
                        Q = zztv.Q(m);
                        B0 = O + Q + m;
                        i11 += B0;
                    }
                    j2 = 0;
                    break;
                case 44:
                    m = g2.h((List) unsafe2.getObject(t, j4));
                    if (m > 0) {
                        if (this.f16046k) {
                            unsafe2.putInt(t, i2, m);
                        }
                        O = zztv.O(i14);
                        Q = zztv.Q(m);
                        B0 = O + Q + m;
                        i11 += B0;
                    }
                    j2 = 0;
                    break;
                case 45:
                    m = g2.l((List) unsafe2.getObject(t, j4));
                    if (m > 0) {
                        if (this.f16046k) {
                            unsafe2.putInt(t, i2, m);
                        }
                        O = zztv.O(i14);
                        Q = zztv.Q(m);
                        B0 = O + Q + m;
                        i11 += B0;
                    }
                    j2 = 0;
                    break;
                case 46:
                    m = g2.m((List) unsafe2.getObject(t, j4));
                    if (m > 0) {
                        if (this.f16046k) {
                            unsafe2.putInt(t, i2, m);
                        }
                        O = zztv.O(i14);
                        Q = zztv.Q(m);
                        B0 = O + Q + m;
                        i11 += B0;
                    }
                    j2 = 0;
                    break;
                case 47:
                    m = g2.k((List) unsafe2.getObject(t, j4));
                    if (m > 0) {
                        if (this.f16046k) {
                            unsafe2.putInt(t, i2, m);
                        }
                        O = zztv.O(i14);
                        Q = zztv.Q(m);
                        B0 = O + Q + m;
                        i11 += B0;
                    }
                    j2 = 0;
                    break;
                case 48:
                    m = g2.g((List) unsafe2.getObject(t, j4));
                    if (m > 0) {
                        if (this.f16046k) {
                            unsafe2.putInt(t, i2, m);
                        }
                        O = zztv.O(i14);
                        Q = zztv.Q(m);
                        B0 = O + Q + m;
                        i11 += B0;
                    }
                    j2 = 0;
                    break;
                case 49:
                    c0 = g2.w(i14, (List) unsafe2.getObject(t, j4), v(i13));
                    i11 += c0;
                    j2 = 0;
                    break;
                case 50:
                    c0 = this.s.e(i14, unsafe2.getObject(t, j4), w(i13));
                    i11 += c0;
                    j2 = 0;
                    break;
                case 51:
                    if (o(t, i14, i13)) {
                        c0 = zztv.w(i14, 0.0d);
                        i11 += c0;
                    }
                    j2 = 0;
                    break;
                case 52:
                    if (o(t, i14, i13)) {
                        B0 = zztv.x(i14, 0.0f);
                        i11 += B0;
                    }
                    j2 = 0;
                    break;
                case 53:
                    if (o(t, i14, i13)) {
                        c0 = zztv.h0(i14, F(t, j4));
                        i11 += c0;
                    }
                    j2 = 0;
                    break;
                case 54:
                    if (o(t, i14, i13)) {
                        c0 = zztv.m0(i14, F(t, j4));
                        i11 += c0;
                    }
                    j2 = 0;
                    break;
                case 55:
                    if (o(t, i14, i13)) {
                        c0 = zztv.u0(i14, E(t, j4));
                        i11 += c0;
                    }
                    j2 = 0;
                    break;
                case 56:
                    if (o(t, i14, i13)) {
                        c0 = zztv.q0(i14, 0L);
                        i11 += c0;
                    }
                    j2 = 0;
                    break;
                case 57:
                    if (o(t, i14, i13)) {
                        B0 = zztv.z0(i14, 0);
                        i11 += B0;
                    }
                    j2 = 0;
                    break;
                case 58:
                    if (o(t, i14, i13)) {
                        c0 = zztv.c0(i14, true);
                        i11 += c0;
                    }
                    j2 = 0;
                    break;
                case 59:
                    if (o(t, i14, i13)) {
                        Object object2 = unsafe2.getObject(t, j4);
                        if (object2 instanceof zzte) {
                            c0 = zztv.Y(i14, (zzte) object2);
                        } else {
                            c0 = zztv.b0(i14, (String) object2);
                        }
                        i11 += c0;
                    }
                    j2 = 0;
                    break;
                case 60:
                    if (o(t, i14, i13)) {
                        c0 = g2.r(i14, unsafe2.getObject(t, j4), v(i13));
                        i11 += c0;
                    }
                    j2 = 0;
                    break;
                case 61:
                    if (o(t, i14, i13)) {
                        c0 = zztv.Y(i14, (zzte) unsafe2.getObject(t, j4));
                        i11 += c0;
                    }
                    j2 = 0;
                    break;
                case 62:
                    if (o(t, i14, i13)) {
                        c0 = zztv.w0(i14, E(t, j4));
                        i11 += c0;
                    }
                    j2 = 0;
                    break;
                case 63:
                    if (o(t, i14, i13)) {
                        c0 = zztv.C0(i14, E(t, j4));
                        i11 += c0;
                    }
                    j2 = 0;
                    break;
                case 64:
                    if (o(t, i14, i13)) {
                        B0 = zztv.B0(i14, 0);
                        i11 += B0;
                    }
                    j2 = 0;
                    break;
                case 65:
                    if (o(t, i14, i13)) {
                        c0 = zztv.v0(i14, 0L);
                        i11 += c0;
                    }
                    j2 = 0;
                    break;
                case 66:
                    if (o(t, i14, i13)) {
                        c0 = zztv.x0(i14, E(t, j4));
                        i11 += c0;
                    }
                    j2 = 0;
                    break;
                case 67:
                    if (o(t, i14, i13)) {
                        c0 = zztv.o0(i14, F(t, j4));
                        i11 += c0;
                    }
                    j2 = 0;
                    break;
                case 68:
                    if (o(t, i14, i13)) {
                        c0 = zztv.a0(i14, (zzvv) unsafe2.getObject(t, j4), v(i13));
                        i11 += c0;
                    }
                    j2 = 0;
                    break;
                default:
                    j2 = 0;
                    break;
            }
        }
        int h2 = i11 + h(this.q, t);
        return this.f16043h ? h2 + this.r.d(t).r() : h2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0511  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x054e  */
    /* JADX WARN: Removed duplicated region for block: B:566:0x0a26  */
    @Override // com.google.android.gms.internal.measurement.e2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(T r14, com.google.android.gms.internal.measurement.l3 r15) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 2912
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.w1.e(java.lang.Object, com.google.android.gms.internal.measurement.l3):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.e2
    public final boolean f(T t) {
        int i2;
        int i3 = -1;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            boolean z = true;
            if (i4 >= this.m) {
                return !this.f16043h || this.r.d(t).d();
            }
            int i6 = this.l[i4];
            int i7 = this.f16038c[i6];
            int x = x(i6);
            if (this.f16045j) {
                i2 = 0;
            } else {
                int i8 = this.f16038c[i6 + 2];
                int i9 = i8 & 1048575;
                i2 = 1 << (i8 >>> 20);
                if (i9 != i3) {
                    i5 = f16037b.getInt(t, i9);
                    i3 = i9;
                }
            }
            if (((268435456 & x) != 0) && !p(t, i6, i5, i2)) {
                return false;
            }
            int i10 = (267386880 & x) >>> 20;
            if (i10 != 9 && i10 != 17) {
                if (i10 != 27) {
                    if (i10 == 60 || i10 == 68) {
                        if (o(t, i7, i6) && !q(t, x, v(i6))) {
                            return false;
                        }
                    } else if (i10 != 49) {
                        if (i10 == 50 && !this.s.d(z2.A(t, x & 1048575)).isEmpty()) {
                            this.s.c(w(i6));
                            throw null;
                        }
                    }
                }
                List list = (List) z2.A(t, x & 1048575);
                if (!list.isEmpty()) {
                    e2 v = v(i6);
                    int i11 = 0;
                    while (true) {
                        if (i11 >= list.size()) {
                            break;
                        }
                        if (!v.f(list.get(i11))) {
                            z = false;
                            break;
                        }
                        i11++;
                    }
                }
                if (!z) {
                    return false;
                }
            } else if (p(t, i6, i5, i2) && !q(t, x, v(i6))) {
                return false;
            }
            i4++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.e2
    public final void g(T t) {
        int i2;
        int i3 = this.m;
        while (true) {
            i2 = this.n;
            if (i3 >= i2) {
                break;
            }
            long x = x(this.l[i3]) & 1048575;
            Object A = z2.A(t, x);
            if (A != null) {
                z2.f(t, x, this.s.b(A));
            }
            i3++;
        }
        int length = this.l.length;
        while (i2 < length) {
            this.p.b(t, this.l[i2]);
            i2++;
        }
        this.q.h(t);
        if (this.f16043h) {
            this.r.f(t);
        }
    }
}
