package S6;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes5.dex */
public final class Q implements Comparable {

    /* renamed from: b, reason: collision with root package name */
    public static final a f9832b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final String f9833c;

    /* renamed from: a, reason: collision with root package name */
    private final C1420h f9834a;

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public static /* synthetic */ Q d(a aVar, File file, boolean z8, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                z8 = false;
            }
            return aVar.a(file, z8);
        }

        public static /* synthetic */ Q e(a aVar, String str, boolean z8, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                z8 = false;
            }
            return aVar.b(str, z8);
        }

        public static /* synthetic */ Q f(a aVar, Path path, boolean z8, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                z8 = false;
            }
            return aVar.c(path, z8);
        }

        public final Q a(File file, boolean z8) {
            AbstractC3255y.i(file, "<this>");
            String file2 = file.toString();
            AbstractC3255y.h(file2, "toString()");
            return b(file2, z8);
        }

        public final Q b(String str, boolean z8) {
            AbstractC3255y.i(str, "<this>");
            return T6.d.k(str, z8);
        }

        public final Q c(Path path, boolean z8) {
            AbstractC3255y.i(path, "<this>");
            return b(path.toString(), z8);
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    static {
        String separator = File.separator;
        AbstractC3255y.h(separator, "separator");
        f9833c = separator;
    }

    public Q(C1420h bytes) {
        AbstractC3255y.i(bytes, "bytes");
        this.f9834a = bytes;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(Q other) {
        AbstractC3255y.i(other, "other");
        return b().compareTo(other.b());
    }

    public final C1420h b() {
        return this.f9834a;
    }

    public final Q c() {
        int o8;
        o8 = T6.d.o(this);
        if (o8 == -1) {
            return null;
        }
        return new Q(b().M(0, o8));
    }

    public final List d() {
        int o8;
        ArrayList arrayList = new ArrayList();
        o8 = T6.d.o(this);
        if (o8 == -1) {
            o8 = 0;
        } else if (o8 < b().K() && b().h(o8) == 92) {
            o8++;
        }
        int K8 = b().K();
        int i8 = o8;
        while (o8 < K8) {
            if (b().h(o8) == 47 || b().h(o8) == 92) {
                arrayList.add(b().M(i8, o8));
                i8 = o8 + 1;
            }
            o8++;
        }
        if (i8 < b().K()) {
            arrayList.add(b().M(i8, b().K()));
        }
        return arrayList;
    }

    public final boolean e() {
        int o8;
        o8 = T6.d.o(this);
        if (o8 != -1) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if ((obj instanceof Q) && AbstractC3255y.d(((Q) obj).b(), b())) {
            return true;
        }
        return false;
    }

    public final String f() {
        return g().Q();
    }

    public final C1420h g() {
        int l8;
        l8 = T6.d.l(this);
        if (l8 != -1) {
            return C1420h.N(b(), l8 + 1, 0, 2, null);
        }
        if (o() != null && b().K() == 2) {
            return C1420h.f9898e;
        }
        return b();
    }

    public final Q h() {
        return f9832b.b(toString(), true);
    }

    public int hashCode() {
        return b().hashCode();
    }

    public final Q i() {
        C1420h c1420h;
        C1420h c1420h2;
        C1420h c1420h3;
        boolean n8;
        int l8;
        Q q8;
        C1420h c1420h4;
        C1420h c1420h5;
        C1420h b8 = b();
        c1420h = T6.d.f10137d;
        if (AbstractC3255y.d(b8, c1420h)) {
            return null;
        }
        C1420h b9 = b();
        c1420h2 = T6.d.f10134a;
        if (AbstractC3255y.d(b9, c1420h2)) {
            return null;
        }
        C1420h b10 = b();
        c1420h3 = T6.d.f10135b;
        if (!AbstractC3255y.d(b10, c1420h3)) {
            n8 = T6.d.n(this);
            if (!n8) {
                l8 = T6.d.l(this);
                if (l8 == 2 && o() != null) {
                    if (b().K() == 3) {
                        return null;
                    }
                    q8 = new Q(C1420h.N(b(), 0, 3, 1, null));
                } else {
                    if (l8 == 1) {
                        C1420h b11 = b();
                        c1420h5 = T6.d.f10135b;
                        if (b11.L(c1420h5)) {
                            return null;
                        }
                    }
                    if (l8 == -1 && o() != null) {
                        if (b().K() == 2) {
                            return null;
                        }
                        q8 = new Q(C1420h.N(b(), 0, 2, 1, null));
                    } else {
                        if (l8 == -1) {
                            c1420h4 = T6.d.f10137d;
                            return new Q(c1420h4);
                        }
                        if (l8 == 0) {
                            q8 = new Q(C1420h.N(b(), 0, 1, 1, null));
                        } else {
                            return new Q(C1420h.N(b(), 0, l8, 1, null));
                        }
                    }
                }
                return q8;
            }
            return null;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x007b, code lost:
    
        r9 = T6.d.m(r8);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final S6.Q j(S6.Q r9) {
        /*
            r8 = this;
            java.lang.String r0 = "other"
            kotlin.jvm.internal.AbstractC3255y.i(r9, r0)
            S6.Q r0 = r8.c()
            S6.Q r1 = r9.c()
            boolean r0 = kotlin.jvm.internal.AbstractC3255y.d(r0, r1)
            java.lang.String r1 = " and "
            if (r0 == 0) goto Ld6
            java.util.List r0 = r8.d()
            java.util.List r2 = r9.d()
            int r3 = r0.size()
            int r4 = r2.size()
            int r3 = java.lang.Math.min(r3, r4)
            r4 = 0
            r5 = 0
        L2b:
            if (r5 >= r3) goto L3e
            java.lang.Object r6 = r0.get(r5)
            java.lang.Object r7 = r2.get(r5)
            boolean r6 = kotlin.jvm.internal.AbstractC3255y.d(r6, r7)
            if (r6 == 0) goto L3e
            int r5 = r5 + 1
            goto L2b
        L3e:
            if (r5 != r3) goto L5d
            S6.h r3 = r8.b()
            int r3 = r3.K()
            S6.h r6 = r9.b()
            int r6 = r6.K()
            if (r3 != r6) goto L5d
            S6.Q$a r9 = S6.Q.f9832b
            java.lang.String r0 = "."
            r1 = 0
            r2 = 1
            S6.Q r9 = S6.Q.a.e(r9, r0, r4, r2, r1)
            goto Lb4
        L5d:
            int r3 = r2.size()
            java.util.List r3 = r2.subList(r5, r3)
            S6.h r6 = T6.d.c()
            int r3 = r3.indexOf(r6)
            r6 = -1
            if (r3 != r6) goto Lb5
            S6.e r1 = new S6.e
            r1.<init>()
            S6.h r9 = T6.d.f(r9)
            if (r9 != 0) goto L87
            S6.h r9 = T6.d.f(r8)
            if (r9 != 0) goto L87
            java.lang.String r9 = S6.Q.f9833c
            S6.h r9 = T6.d.i(r9)
        L87:
            int r2 = r2.size()
            r3 = r5
        L8c:
            if (r3 >= r2) goto L9b
            S6.h r6 = T6.d.c()
            r1.I(r6)
            r1.I(r9)
            int r3 = r3 + 1
            goto L8c
        L9b:
            int r2 = r0.size()
        L9f:
            if (r5 >= r2) goto Lb0
            java.lang.Object r3 = r0.get(r5)
            S6.h r3 = (S6.C1420h) r3
            r1.I(r3)
            r1.I(r9)
            int r5 = r5 + 1
            goto L9f
        Lb0:
            S6.Q r9 = T6.d.q(r1, r4)
        Lb4:
            return r9
        Lb5:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Impossible relative path to resolve: "
            r0.append(r2)
            r0.append(r8)
            r0.append(r1)
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r0.<init>(r9)
            throw r0
        Ld6:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Paths of different roots cannot be relative to each other: "
            r0.append(r2)
            r0.append(r8)
            r0.append(r1)
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r0.<init>(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: S6.Q.j(S6.Q):S6.Q");
    }

    public final Q k(Q child, boolean z8) {
        AbstractC3255y.i(child, "child");
        return T6.d.j(this, child, z8);
    }

    public final Q l(String child) {
        AbstractC3255y.i(child, "child");
        return T6.d.j(this, T6.d.q(new C1417e().writeUtf8(child), false), false);
    }

    public final File m() {
        return new File(toString());
    }

    public final Path n() {
        Path path;
        path = Paths.get(toString(), new String[0]);
        AbstractC3255y.h(path, "get(toString())");
        return path;
    }

    public final Character o() {
        C1420h c1420h;
        C1420h b8 = b();
        c1420h = T6.d.f10134a;
        if (C1420h.r(b8, c1420h, 0, 2, null) != -1 || b().K() < 2 || b().h(1) != 58) {
            return null;
        }
        char h8 = (char) b().h(0);
        if (('a' > h8 || h8 >= '{') && ('A' > h8 || h8 >= '[')) {
            return null;
        }
        return Character.valueOf(h8);
    }

    public String toString() {
        return b().Q();
    }
}
