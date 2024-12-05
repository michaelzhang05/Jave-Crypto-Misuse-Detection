package P6;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes5.dex */
public final class Q implements Comparable {

    /* renamed from: b, reason: collision with root package name */
    public static final a f8001b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final String f8002c;

    /* renamed from: a, reason: collision with root package name */
    private final C1282h f8003a;

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
            AbstractC3159y.i(file, "<this>");
            String file2 = file.toString();
            AbstractC3159y.h(file2, "toString()");
            return b(file2, z8);
        }

        public final Q b(String str, boolean z8) {
            AbstractC3159y.i(str, "<this>");
            return Q6.d.k(str, z8);
        }

        public final Q c(Path path, boolean z8) {
            AbstractC3159y.i(path, "<this>");
            return b(path.toString(), z8);
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    static {
        String separator = File.separator;
        AbstractC3159y.h(separator, "separator");
        f8002c = separator;
    }

    public Q(C1282h bytes) {
        AbstractC3159y.i(bytes, "bytes");
        this.f8003a = bytes;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(Q other) {
        AbstractC3159y.i(other, "other");
        return b().compareTo(other.b());
    }

    public final C1282h b() {
        return this.f8003a;
    }

    public final Q c() {
        int o8;
        o8 = Q6.d.o(this);
        if (o8 == -1) {
            return null;
        }
        return new Q(b().I(0, o8));
    }

    public final List d() {
        int o8;
        ArrayList arrayList = new ArrayList();
        o8 = Q6.d.o(this);
        if (o8 == -1) {
            o8 = 0;
        } else if (o8 < b().F() && b().h(o8) == 92) {
            o8++;
        }
        int F8 = b().F();
        int i8 = o8;
        while (o8 < F8) {
            if (b().h(o8) == 47 || b().h(o8) == 92) {
                arrayList.add(b().I(i8, o8));
                i8 = o8 + 1;
            }
            o8++;
        }
        if (i8 < b().F()) {
            arrayList.add(b().I(i8, b().F()));
        }
        return arrayList;
    }

    public final boolean e() {
        int o8;
        o8 = Q6.d.o(this);
        if (o8 != -1) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if ((obj instanceof Q) && AbstractC3159y.d(((Q) obj).b(), b())) {
            return true;
        }
        return false;
    }

    public final String f() {
        return g().M();
    }

    public final C1282h g() {
        int l8;
        l8 = Q6.d.l(this);
        if (l8 != -1) {
            return C1282h.J(b(), l8 + 1, 0, 2, null);
        }
        if (o() != null && b().F() == 2) {
            return C1282h.f8067e;
        }
        return b();
    }

    public final Q h() {
        return f8001b.b(toString(), true);
    }

    public int hashCode() {
        return b().hashCode();
    }

    public final Q i() {
        C1282h c1282h;
        C1282h c1282h2;
        C1282h c1282h3;
        boolean n8;
        int l8;
        Q q8;
        C1282h c1282h4;
        C1282h c1282h5;
        C1282h b8 = b();
        c1282h = Q6.d.f8340d;
        if (AbstractC3159y.d(b8, c1282h)) {
            return null;
        }
        C1282h b9 = b();
        c1282h2 = Q6.d.f8337a;
        if (AbstractC3159y.d(b9, c1282h2)) {
            return null;
        }
        C1282h b10 = b();
        c1282h3 = Q6.d.f8338b;
        if (!AbstractC3159y.d(b10, c1282h3)) {
            n8 = Q6.d.n(this);
            if (!n8) {
                l8 = Q6.d.l(this);
                if (l8 == 2 && o() != null) {
                    if (b().F() == 3) {
                        return null;
                    }
                    q8 = new Q(C1282h.J(b(), 0, 3, 1, null));
                } else {
                    if (l8 == 1) {
                        C1282h b11 = b();
                        c1282h5 = Q6.d.f8338b;
                        if (b11.H(c1282h5)) {
                            return null;
                        }
                    }
                    if (l8 == -1 && o() != null) {
                        if (b().F() == 2) {
                            return null;
                        }
                        q8 = new Q(C1282h.J(b(), 0, 2, 1, null));
                    } else {
                        if (l8 == -1) {
                            c1282h4 = Q6.d.f8340d;
                            return new Q(c1282h4);
                        }
                        if (l8 == 0) {
                            q8 = new Q(C1282h.J(b(), 0, 1, 1, null));
                        } else {
                            return new Q(C1282h.J(b(), 0, l8, 1, null));
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
    
        r9 = Q6.d.m(r8);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final P6.Q j(P6.Q r9) {
        /*
            r8 = this;
            java.lang.String r0 = "other"
            kotlin.jvm.internal.AbstractC3159y.i(r9, r0)
            P6.Q r0 = r8.c()
            P6.Q r1 = r9.c()
            boolean r0 = kotlin.jvm.internal.AbstractC3159y.d(r0, r1)
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
            boolean r6 = kotlin.jvm.internal.AbstractC3159y.d(r6, r7)
            if (r6 == 0) goto L3e
            int r5 = r5 + 1
            goto L2b
        L3e:
            if (r5 != r3) goto L5d
            P6.h r3 = r8.b()
            int r3 = r3.F()
            P6.h r6 = r9.b()
            int r6 = r6.F()
            if (r3 != r6) goto L5d
            P6.Q$a r9 = P6.Q.f8001b
            java.lang.String r0 = "."
            r1 = 0
            r2 = 1
            P6.Q r9 = P6.Q.a.e(r9, r0, r4, r2, r1)
            goto Lb4
        L5d:
            int r3 = r2.size()
            java.util.List r3 = r2.subList(r5, r3)
            P6.h r6 = Q6.d.c()
            int r3 = r3.indexOf(r6)
            r6 = -1
            if (r3 != r6) goto Lb5
            P6.e r1 = new P6.e
            r1.<init>()
            P6.h r9 = Q6.d.f(r9)
            if (r9 != 0) goto L87
            P6.h r9 = Q6.d.f(r8)
            if (r9 != 0) goto L87
            java.lang.String r9 = P6.Q.f8002c
            P6.h r9 = Q6.d.i(r9)
        L87:
            int r2 = r2.size()
            r3 = r5
        L8c:
            if (r3 >= r2) goto L9b
            P6.h r6 = Q6.d.c()
            r1.G(r6)
            r1.G(r9)
            int r3 = r3 + 1
            goto L8c
        L9b:
            int r2 = r0.size()
        L9f:
            if (r5 >= r2) goto Lb0
            java.lang.Object r3 = r0.get(r5)
            P6.h r3 = (P6.C1282h) r3
            r1.G(r3)
            r1.G(r9)
            int r5 = r5 + 1
            goto L9f
        Lb0:
            P6.Q r9 = Q6.d.q(r1, r4)
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
        throw new UnsupportedOperationException("Method not decompiled: P6.Q.j(P6.Q):P6.Q");
    }

    public final Q k(Q child, boolean z8) {
        AbstractC3159y.i(child, "child");
        return Q6.d.j(this, child, z8);
    }

    public final Q l(String child) {
        AbstractC3159y.i(child, "child");
        return Q6.d.j(this, Q6.d.q(new C1279e().writeUtf8(child), false), false);
    }

    public final File m() {
        return new File(toString());
    }

    public final Path n() {
        Path path;
        path = Paths.get(toString(), new String[0]);
        AbstractC3159y.h(path, "get(toString())");
        return path;
    }

    public final Character o() {
        C1282h c1282h;
        C1282h b8 = b();
        c1282h = Q6.d.f8337a;
        if (C1282h.q(b8, c1282h, 0, 2, null) != -1 || b().F() < 2 || b().h(1) != 58) {
            return null;
        }
        char h8 = (char) b().h(0);
        if (('a' > h8 || h8 >= '{') && ('A' > h8 || h8 >= '[')) {
            return null;
        }
        return Character.valueOf(h8);
    }

    public String toString() {
        return b().M();
    }
}
