package T6;

import P5.AbstractC1378t;
import S6.C1417e;
import S6.C1420h;
import S6.Q;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes5.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    private static final C1420h f10134a;

    /* renamed from: b, reason: collision with root package name */
    private static final C1420h f10135b;

    /* renamed from: c, reason: collision with root package name */
    private static final C1420h f10136c;

    /* renamed from: d, reason: collision with root package name */
    private static final C1420h f10137d;

    /* renamed from: e, reason: collision with root package name */
    private static final C1420h f10138e;

    static {
        C1420h.a aVar = C1420h.f9897d;
        f10134a = aVar.c("/");
        f10135b = aVar.c("\\");
        f10136c = aVar.c("/\\");
        f10137d = aVar.c(".");
        f10138e = aVar.c("..");
    }

    public static final Q j(Q q8, Q child, boolean z8) {
        AbstractC3255y.i(q8, "<this>");
        AbstractC3255y.i(child, "child");
        if (!child.e() && child.o() == null) {
            C1420h m8 = m(q8);
            if (m8 == null && (m8 = m(child)) == null) {
                m8 = s(Q.f9833c);
            }
            C1417e c1417e = new C1417e();
            c1417e.I(q8.b());
            if (c1417e.E() > 0) {
                c1417e.I(m8);
            }
            c1417e.I(child.b());
            return q(c1417e, z8);
        }
        return child;
    }

    public static final Q k(String str, boolean z8) {
        AbstractC3255y.i(str, "<this>");
        return q(new C1417e().writeUtf8(str), z8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int l(Q q8) {
        int A8 = C1420h.A(q8.b(), f10134a, 0, 2, null);
        if (A8 != -1) {
            return A8;
        }
        return C1420h.A(q8.b(), f10135b, 0, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C1420h m(Q q8) {
        C1420h b8 = q8.b();
        C1420h c1420h = f10134a;
        if (C1420h.r(b8, c1420h, 0, 2, null) == -1) {
            C1420h b9 = q8.b();
            C1420h c1420h2 = f10135b;
            if (C1420h.r(b9, c1420h2, 0, 2, null) == -1) {
                return null;
            }
            return c1420h2;
        }
        return c1420h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean n(Q q8) {
        if (!q8.b().g(f10138e) || (q8.b().K() != 2 && !q8.b().D(q8.b().K() - 3, f10134a, 0, 1) && !q8.b().D(q8.b().K() - 3, f10135b, 0, 1))) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int o(Q q8) {
        if (q8.b().K() == 0) {
            return -1;
        }
        if (q8.b().h(0) == 47) {
            return 1;
        }
        if (q8.b().h(0) == 92) {
            if (q8.b().K() <= 2 || q8.b().h(1) != 92) {
                return 1;
            }
            int o8 = q8.b().o(f10135b, 2);
            if (o8 == -1) {
                return q8.b().K();
            }
            return o8;
        }
        if (q8.b().K() > 2 && q8.b().h(1) == 58 && q8.b().h(2) == 92) {
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

    private static final boolean p(C1417e c1417e, C1420h c1420h) {
        if (!AbstractC3255y.d(c1420h, f10135b) || c1417e.E() < 2 || c1417e.n(1L) != 58) {
            return false;
        }
        char n8 = (char) c1417e.n(0L);
        if (('a' > n8 || n8 >= '{') && ('A' > n8 || n8 >= '[')) {
            return false;
        }
        return true;
    }

    public static final Q q(C1417e c1417e, boolean z8) {
        C1420h c1420h;
        boolean z9;
        boolean z10;
        C1420h readByteString;
        AbstractC3255y.i(c1417e, "<this>");
        C1417e c1417e2 = new C1417e();
        C1420h c1420h2 = null;
        int i8 = 0;
        while (true) {
            if (!c1417e.d(0L, f10134a)) {
                c1420h = f10135b;
                if (!c1417e.d(0L, c1420h)) {
                    break;
                }
            }
            byte readByte = c1417e.readByte();
            if (c1420h2 == null) {
                c1420h2 = r(readByte);
            }
            i8++;
        }
        if (i8 >= 2 && AbstractC3255y.d(c1420h2, c1420h)) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            AbstractC3255y.f(c1420h2);
            c1417e2.I(c1420h2);
            c1417e2.I(c1420h2);
        } else if (i8 > 0) {
            AbstractC3255y.f(c1420h2);
            c1417e2.I(c1420h2);
        } else {
            long o8 = c1417e.o(f10136c);
            if (c1420h2 == null) {
                if (o8 == -1) {
                    c1420h2 = s(Q.f9833c);
                } else {
                    c1420h2 = r(c1417e.n(o8));
                }
            }
            if (p(c1417e, c1420h2)) {
                if (o8 == 2) {
                    c1417e2.h(c1417e, 3L);
                } else {
                    c1417e2.h(c1417e, 2L);
                }
            }
        }
        if (c1417e2.E() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        ArrayList arrayList = new ArrayList();
        while (!c1417e.exhausted()) {
            long o9 = c1417e.o(f10136c);
            if (o9 == -1) {
                readByteString = c1417e.A();
            } else {
                readByteString = c1417e.readByteString(o9);
                c1417e.readByte();
            }
            C1420h c1420h3 = f10138e;
            if (AbstractC3255y.d(readByteString, c1420h3)) {
                if (!z10 || !arrayList.isEmpty()) {
                    if (z8 && (z10 || (!arrayList.isEmpty() && !AbstractC3255y.d(AbstractC1378t.y0(arrayList), c1420h3)))) {
                        if (!z9 || arrayList.size() != 1) {
                            AbstractC1378t.Q(arrayList);
                        }
                    } else {
                        arrayList.add(readByteString);
                    }
                }
            } else if (!AbstractC3255y.d(readByteString, f10137d) && !AbstractC3255y.d(readByteString, C1420h.f9898e)) {
                arrayList.add(readByteString);
            }
        }
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            if (i9 > 0) {
                c1417e2.I(c1420h2);
            }
            c1417e2.I((C1420h) arrayList.get(i9));
        }
        if (c1417e2.E() == 0) {
            c1417e2.I(f10137d);
        }
        return new Q(c1417e2.A());
    }

    private static final C1420h r(byte b8) {
        if (b8 != 47) {
            if (b8 == 92) {
                return f10135b;
            }
            throw new IllegalArgumentException("not a directory separator: " + ((int) b8));
        }
        return f10134a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C1420h s(String str) {
        if (AbstractC3255y.d(str, "/")) {
            return f10134a;
        }
        if (AbstractC3255y.d(str, "\\")) {
            return f10135b;
        }
        throw new IllegalArgumentException("not a directory separator: " + str);
    }
}
