package Q6;

import M5.AbstractC1246t;
import P6.C1279e;
import P6.C1282h;
import P6.Q;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes5.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    private static final C1282h f8337a;

    /* renamed from: b, reason: collision with root package name */
    private static final C1282h f8338b;

    /* renamed from: c, reason: collision with root package name */
    private static final C1282h f8339c;

    /* renamed from: d, reason: collision with root package name */
    private static final C1282h f8340d;

    /* renamed from: e, reason: collision with root package name */
    private static final C1282h f8341e;

    static {
        C1282h.a aVar = C1282h.f8066d;
        f8337a = aVar.c("/");
        f8338b = aVar.c("\\");
        f8339c = aVar.c("/\\");
        f8340d = aVar.c(".");
        f8341e = aVar.c("..");
    }

    public static final Q j(Q q8, Q child, boolean z8) {
        AbstractC3159y.i(q8, "<this>");
        AbstractC3159y.i(child, "child");
        if (!child.e() && child.o() == null) {
            C1282h m8 = m(q8);
            if (m8 == null && (m8 = m(child)) == null) {
                m8 = s(Q.f8002c);
            }
            C1279e c1279e = new C1279e();
            c1279e.G(q8.b());
            if (c1279e.x() > 0) {
                c1279e.G(m8);
            }
            c1279e.G(child.b());
            return q(c1279e, z8);
        }
        return child;
    }

    public static final Q k(String str, boolean z8) {
        AbstractC3159y.i(str, "<this>");
        return q(new C1279e().writeUtf8(str), z8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int l(Q q8) {
        int w8 = C1282h.w(q8.b(), f8337a, 0, 2, null);
        if (w8 != -1) {
            return w8;
        }
        return C1282h.w(q8.b(), f8338b, 0, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C1282h m(Q q8) {
        C1282h b8 = q8.b();
        C1282h c1282h = f8337a;
        if (C1282h.q(b8, c1282h, 0, 2, null) == -1) {
            C1282h b9 = q8.b();
            C1282h c1282h2 = f8338b;
            if (C1282h.q(b9, c1282h2, 0, 2, null) == -1) {
                return null;
            }
            return c1282h2;
        }
        return c1282h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean n(Q q8) {
        if (!q8.b().g(f8341e) || (q8.b().F() != 2 && !q8.b().A(q8.b().F() - 3, f8337a, 0, 1) && !q8.b().A(q8.b().F() - 3, f8338b, 0, 1))) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int o(Q q8) {
        if (q8.b().F() == 0) {
            return -1;
        }
        if (q8.b().h(0) == 47) {
            return 1;
        }
        if (q8.b().h(0) == 92) {
            if (q8.b().F() <= 2 || q8.b().h(1) != 92) {
                return 1;
            }
            int o8 = q8.b().o(f8338b, 2);
            if (o8 == -1) {
                return q8.b().F();
            }
            return o8;
        }
        if (q8.b().F() > 2 && q8.b().h(1) == 58 && q8.b().h(2) == 92) {
            char h8 = (char) q8.b().h(0);
            if ('a' > h8 || h8 >= '{') {
                if ('A' <= h8 && h8 < '[') {
                    return 3;
                }
            } else {
                return 3;
            }
        }
        return -1;
    }

    private static final boolean p(C1279e c1279e, C1282h c1282h) {
        if (!AbstractC3159y.d(c1282h, f8338b) || c1279e.x() < 2 || c1279e.l(1L) != 58) {
            return false;
        }
        char l8 = (char) c1279e.l(0L);
        if (('a' > l8 || l8 >= '{') && ('A' > l8 || l8 >= '[')) {
            return false;
        }
        return true;
    }

    public static final Q q(C1279e c1279e, boolean z8) {
        C1282h c1282h;
        boolean z9;
        boolean z10;
        C1282h readByteString;
        AbstractC3159y.i(c1279e, "<this>");
        C1279e c1279e2 = new C1279e();
        C1282h c1282h2 = null;
        int i8 = 0;
        while (true) {
            if (!c1279e.s(0L, f8337a)) {
                c1282h = f8338b;
                if (!c1279e.s(0L, c1282h)) {
                    break;
                }
            }
            byte readByte = c1279e.readByte();
            if (c1282h2 == null) {
                c1282h2 = r(readByte);
            }
            i8++;
        }
        if (i8 >= 2 && AbstractC3159y.d(c1282h2, c1282h)) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            AbstractC3159y.f(c1282h2);
            c1279e2.G(c1282h2);
            c1279e2.G(c1282h2);
        } else if (i8 > 0) {
            AbstractC3159y.f(c1282h2);
            c1279e2.G(c1282h2);
        } else {
            long m8 = c1279e.m(f8339c);
            if (c1282h2 == null) {
                if (m8 == -1) {
                    c1282h2 = s(Q.f8002c);
                } else {
                    c1282h2 = r(c1279e.l(m8));
                }
            }
            if (p(c1279e, c1282h2)) {
                if (m8 == 2) {
                    c1279e2.C(c1279e, 3L);
                } else {
                    c1279e2.C(c1279e, 2L);
                }
            }
        }
        if (c1279e2.x() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        ArrayList arrayList = new ArrayList();
        while (!c1279e.exhausted()) {
            long m9 = c1279e.m(f8339c);
            if (m9 == -1) {
                readByteString = c1279e.t();
            } else {
                readByteString = c1279e.readByteString(m9);
                c1279e.readByte();
            }
            C1282h c1282h3 = f8341e;
            if (AbstractC3159y.d(readByteString, c1282h3)) {
                if (!z10 || !arrayList.isEmpty()) {
                    if (z8 && (z10 || (!arrayList.isEmpty() && !AbstractC3159y.d(AbstractC1246t.y0(arrayList), c1282h3)))) {
                        if (!z9 || arrayList.size() != 1) {
                            AbstractC1246t.Q(arrayList);
                        }
                    } else {
                        arrayList.add(readByteString);
                    }
                }
            } else if (!AbstractC3159y.d(readByteString, f8340d) && !AbstractC3159y.d(readByteString, C1282h.f8067e)) {
                arrayList.add(readByteString);
            }
        }
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            if (i9 > 0) {
                c1279e2.G(c1282h2);
            }
            c1279e2.G((C1282h) arrayList.get(i9));
        }
        if (c1279e2.x() == 0) {
            c1279e2.G(f8340d);
        }
        return new Q(c1279e2.t());
    }

    private static final C1282h r(byte b8) {
        if (b8 != 47) {
            if (b8 == 92) {
                return f8338b;
            }
            throw new IllegalArgumentException("not a directory separator: " + ((int) b8));
        }
        return f8337a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C1282h s(String str) {
        if (AbstractC3159y.d(str, "/")) {
            return f8337a;
        }
        if (AbstractC3159y.d(str, "\\")) {
            return f8338b;
        }
        throw new IllegalArgumentException("not a directory separator: " + str);
    }
}
