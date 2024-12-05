package b2;

import java.lang.reflect.Method;

/* renamed from: b2.D, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1960D {

    /* renamed from: e, reason: collision with root package name */
    public static final C1960D f15072e = new C1960D(0, "VZCBSIFJD", 0, 1);

    /* renamed from: f, reason: collision with root package name */
    public static final C1960D f15073f = new C1960D(1, "VZCBSIFJD", 1, 2);

    /* renamed from: g, reason: collision with root package name */
    public static final C1960D f15074g = new C1960D(2, "VZCBSIFJD", 2, 3);

    /* renamed from: h, reason: collision with root package name */
    public static final C1960D f15075h = new C1960D(3, "VZCBSIFJD", 3, 4);

    /* renamed from: i, reason: collision with root package name */
    public static final C1960D f15076i = new C1960D(4, "VZCBSIFJD", 4, 5);

    /* renamed from: j, reason: collision with root package name */
    public static final C1960D f15077j = new C1960D(5, "VZCBSIFJD", 5, 6);

    /* renamed from: k, reason: collision with root package name */
    public static final C1960D f15078k = new C1960D(6, "VZCBSIFJD", 6, 7);

    /* renamed from: l, reason: collision with root package name */
    public static final C1960D f15079l = new C1960D(7, "VZCBSIFJD", 7, 8);

    /* renamed from: m, reason: collision with root package name */
    public static final C1960D f15080m = new C1960D(8, "VZCBSIFJD", 8, 9);

    /* renamed from: a, reason: collision with root package name */
    private final int f15081a;

    /* renamed from: b, reason: collision with root package name */
    private final String f15082b;

    /* renamed from: c, reason: collision with root package name */
    private final int f15083c;

    /* renamed from: d, reason: collision with root package name */
    private final int f15084d;

    private C1960D(int i8, String str, int i9, int i10) {
        this.f15081a = i8;
        this.f15082b = str;
        this.f15083c = i9;
        this.f15084d = i10;
    }

    private static void a(Class cls, StringBuilder sb) {
        char c8;
        while (cls.isArray()) {
            sb.append('[');
            cls = cls.getComponentType();
        }
        if (cls.isPrimitive()) {
            if (cls == Integer.TYPE) {
                c8 = 'I';
            } else if (cls == Void.TYPE) {
                c8 = 'V';
            } else if (cls == Boolean.TYPE) {
                c8 = 'Z';
            } else if (cls == Byte.TYPE) {
                c8 = 'B';
            } else if (cls == Character.TYPE) {
                c8 = 'C';
            } else if (cls == Short.TYPE) {
                c8 = 'S';
            } else if (cls == Double.TYPE) {
                c8 = 'D';
            } else if (cls == Float.TYPE) {
                c8 = 'F';
            } else if (cls == Long.TYPE) {
                c8 = 'J';
            } else {
                throw new AssertionError();
            }
            sb.append(c8);
            return;
        }
        sb.append('L');
        sb.append(g(cls));
        sb.append(';');
    }

    public static C1960D[] b(String str) {
        int i8 = 0;
        int i9 = 1;
        int i10 = 0;
        while (str.charAt(i9) != ')') {
            while (str.charAt(i9) == '[') {
                i9++;
            }
            int i11 = i9 + 1;
            if (str.charAt(i9) == 'L') {
                i9 = Math.max(i11, str.indexOf(59, i11) + 1);
            } else {
                i9 = i11;
            }
            i10++;
        }
        C1960D[] c1960dArr = new C1960D[i10];
        int i12 = 1;
        while (str.charAt(i12) != ')') {
            int i13 = i12;
            while (str.charAt(i13) == '[') {
                i13++;
            }
            int i14 = i13 + 1;
            if (str.charAt(i13) == 'L') {
                i14 = Math.max(i14, str.indexOf(59, i14) + 1);
            }
            c1960dArr[i8] = o(str, i12, i14);
            i8++;
            i12 = i14;
        }
        return c1960dArr;
    }

    public static int c(String str) {
        int i8 = 1;
        char charAt = str.charAt(1);
        int i9 = 1;
        int i10 = 1;
        while (charAt != ')') {
            if (charAt != 'J' && charAt != 'D') {
                while (str.charAt(i9) == '[') {
                    i9++;
                }
                int i11 = i9 + 1;
                if (str.charAt(i9) == 'L') {
                    i11 = Math.max(i11, str.indexOf(59, i11) + 1);
                }
                i10++;
                i9 = i11;
            } else {
                i9++;
                i10 += 2;
            }
            charAt = str.charAt(i9);
        }
        char charAt2 = str.charAt(i9 + 1);
        if (charAt2 == 'V') {
            return i10 << 2;
        }
        if (charAt2 == 'J' || charAt2 == 'D') {
            i8 = 2;
        }
        return (i10 << 2) | i8;
    }

    public static String e(Class cls) {
        StringBuilder sb = new StringBuilder();
        a(cls, sb);
        return sb.toString();
    }

    public static String g(Class cls) {
        return cls.getName().replace('.', '/');
    }

    public static String h(Method method) {
        StringBuilder sb = new StringBuilder();
        sb.append('(');
        for (Class<?> cls : method.getParameterTypes()) {
            a(cls, sb);
        }
        sb.append(')');
        a(method.getReturnType(), sb);
        return sb.toString();
    }

    public static C1960D i(String str) {
        return new C1960D(11, str, 0, str.length());
    }

    public static C1960D j(String str) {
        int i8;
        if (str.charAt(0) == '[') {
            i8 = 9;
        } else {
            i8 = 12;
        }
        return new C1960D(i8, str, 0, str.length());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int k(String str) {
        int i8 = 1;
        while (str.charAt(i8) != ')') {
            while (str.charAt(i8) == '[') {
                i8++;
            }
            int i9 = i8 + 1;
            if (str.charAt(i8) == 'L') {
                i8 = Math.max(i9, str.indexOf(59, i9) + 1);
            } else {
                i8 = i9;
            }
        }
        return i8 + 1;
    }

    public static C1960D m(Class cls) {
        if (cls.isPrimitive()) {
            if (cls == Integer.TYPE) {
                return f15077j;
            }
            if (cls == Void.TYPE) {
                return f15072e;
            }
            if (cls == Boolean.TYPE) {
                return f15073f;
            }
            if (cls == Byte.TYPE) {
                return f15075h;
            }
            if (cls == Character.TYPE) {
                return f15074g;
            }
            if (cls == Short.TYPE) {
                return f15076i;
            }
            if (cls == Double.TYPE) {
                return f15080m;
            }
            if (cls == Float.TYPE) {
                return f15078k;
            }
            if (cls == Long.TYPE) {
                return f15079l;
            }
            throw new AssertionError();
        }
        return n(e(cls));
    }

    public static C1960D n(String str) {
        return o(str, 0, str.length());
    }

    private static C1960D o(String str, int i8, int i9) {
        char charAt = str.charAt(i8);
        if (charAt != '(') {
            if (charAt != 'F') {
                if (charAt != 'L') {
                    if (charAt != 'S') {
                        if (charAt != 'V') {
                            if (charAt != 'I') {
                                if (charAt != 'J') {
                                    if (charAt != 'Z') {
                                        if (charAt != '[') {
                                            switch (charAt) {
                                                case 'B':
                                                    return f15075h;
                                                case 'C':
                                                    return f15074g;
                                                case 'D':
                                                    return f15080m;
                                                default:
                                                    throw new IllegalArgumentException();
                                            }
                                        }
                                        return new C1960D(9, str, i8, i9);
                                    }
                                    return f15073f;
                                }
                                return f15079l;
                            }
                            return f15077j;
                        }
                        return f15072e;
                    }
                    return f15076i;
                }
                return new C1960D(10, str, i8 + 1, i9 - 1);
            }
            return f15078k;
        }
        return new C1960D(11, str, i8, i9);
    }

    public String d() {
        int i8 = this.f15081a;
        if (i8 == 10) {
            return this.f15082b.substring(this.f15083c - 1, this.f15084d + 1);
        }
        if (i8 == 12) {
            return 'L' + this.f15082b.substring(this.f15083c, this.f15084d) + ';';
        }
        return this.f15082b.substring(this.f15083c, this.f15084d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1960D)) {
            return false;
        }
        C1960D c1960d = (C1960D) obj;
        int i8 = this.f15081a;
        int i9 = 10;
        if (i8 == 12) {
            i8 = 10;
        }
        int i10 = c1960d.f15081a;
        if (i10 != 12) {
            i9 = i10;
        }
        if (i8 != i9) {
            return false;
        }
        int i11 = this.f15083c;
        int i12 = this.f15084d;
        int i13 = c1960d.f15083c;
        if (i12 - i11 != c1960d.f15084d - i13) {
            return false;
        }
        while (i11 < i12) {
            if (this.f15082b.charAt(i11) != c1960d.f15082b.charAt(i13)) {
                return false;
            }
            i11++;
            i13++;
        }
        return true;
    }

    public String f() {
        return this.f15082b.substring(this.f15083c, this.f15084d);
    }

    public int hashCode() {
        int i8;
        int i9 = this.f15081a;
        if (i9 == 12) {
            i8 = 10;
        } else {
            i8 = i9;
        }
        int i10 = i8 * 13;
        if (i9 >= 9) {
            int i11 = this.f15084d;
            for (int i12 = this.f15083c; i12 < i11; i12++) {
                i10 = (i10 + this.f15082b.charAt(i12)) * 17;
            }
        }
        return i10;
    }

    public int l() {
        int i8 = this.f15081a;
        if (i8 == 12) {
            return 10;
        }
        return i8;
    }

    public String toString() {
        return d();
    }
}
