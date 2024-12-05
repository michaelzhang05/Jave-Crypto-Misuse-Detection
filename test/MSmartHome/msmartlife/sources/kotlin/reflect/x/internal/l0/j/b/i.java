package kotlin.reflect.x.internal.l0.j.b;

import cm.aptoide.pt.database.room.RoomNotification;
import java.util.Set;
import kotlin.collections.t0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;
import kotlin.reflect.jvm.internal.impl.descriptors.e;
import kotlin.reflect.x.internal.l0.b.k;

/* compiled from: ClassDeserializer.kt */
/* loaded from: classes2.dex */
public final class i {
    public static final b a = new b(null);

    /* renamed from: b */
    private static final Set<kotlin.reflect.x.internal.l0.f.b> f21085b;

    /* renamed from: c */
    private final k f21086c;

    /* renamed from: d */
    private final Function1<a, e> f21087d;

    /* compiled from: ClassDeserializer.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private final kotlin.reflect.x.internal.l0.f.b a;

        /* renamed from: b */
        private final g f21088b;

        public a(kotlin.reflect.x.internal.l0.f.b bVar, g gVar) {
            l.f(bVar, "classId");
            this.a = bVar;
            this.f21088b = gVar;
        }

        public final g a() {
            return this.f21088b;
        }

        public final kotlin.reflect.x.internal.l0.f.b b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && l.a(this.a, ((a) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }
    }

    /* compiled from: ClassDeserializer.kt */
    /* loaded from: classes2.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(g gVar) {
            this();
        }

        public final Set<kotlin.reflect.x.internal.l0.f.b> a() {
            return i.f21085b;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ClassDeserializer.kt */
    /* loaded from: classes2.dex */
    public static final class c extends Lambda implements Function1<a, e> {
        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final e invoke(a aVar) {
            l.f(aVar, RoomNotification.KEY);
            return i.this.c(aVar);
        }
    }

    static {
        Set<kotlin.reflect.x.internal.l0.f.b> c2;
        c2 = t0.c(kotlin.reflect.x.internal.l0.f.b.m(k.a.f19712d.l()));
        f21085b = c2;
    }

    public i(k kVar) {
        l.f(kVar, "components");
        this.f21086c = kVar;
        this.f21087d = kVar.u().i(new c());
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00b8 A[EDGE_INSN: B:43:0x00b8->B:44:0x00b8 BREAK  A[LOOP:1: B:34:0x0090->B:48:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[LOOP:1: B:34:0x0090->B:48:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.reflect.jvm.internal.impl.descriptors.e c(kotlin.f0.x.e.l0.j.b.i.a r13) {
        /*
            r12 = this;
            kotlin.f0.x.e.l0.f.b r0 = r13.b()
            kotlin.f0.x.e.l0.j.b.k r1 = r12.f21086c
            java.lang.Iterable r1 = r1.k()
            java.util.Iterator r1 = r1.iterator()
        Le:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L21
            java.lang.Object r2 = r1.next()
            kotlin.reflect.jvm.internal.impl.descriptors.o1.b r2 = (kotlin.reflect.jvm.internal.impl.descriptors.o1.b) r2
            kotlin.reflect.jvm.internal.impl.descriptors.e r2 = r2.c(r0)
            if (r2 == 0) goto Le
            return r2
        L21:
            java.util.Set<kotlin.f0.x.e.l0.f.b> r1 = kotlin.reflect.x.internal.l0.j.b.i.f21085b
            boolean r1 = r1.contains(r0)
            r2 = 0
            if (r1 == 0) goto L2b
            return r2
        L2b:
            kotlin.f0.x.e.l0.j.b.g r13 = r13.a()
            if (r13 != 0) goto L3e
            kotlin.f0.x.e.l0.j.b.k r13 = r12.f21086c
            kotlin.f0.x.e.l0.j.b.h r13 = r13.e()
            kotlin.f0.x.e.l0.j.b.g r13 = r13.a(r0)
            if (r13 != 0) goto L3e
            return r2
        L3e:
            kotlin.f0.x.e.l0.e.z.c r1 = r13.a()
            kotlin.f0.x.e.l0.e.c r10 = r13.b()
            kotlin.f0.x.e.l0.e.z.a r11 = r13.c()
            kotlin.reflect.jvm.internal.impl.descriptors.z0 r13 = r13.d()
            kotlin.f0.x.e.l0.f.b r3 = r0.g()
            java.lang.String r4 = "classId.shortClassName"
            if (r3 == 0) goto L79
            r5 = 2
            kotlin.reflect.jvm.internal.impl.descriptors.e r3 = e(r12, r3, r2, r5, r2)
            boolean r5 = r3 instanceof kotlin.reflect.x.internal.l0.j.b.g0.d
            if (r5 == 0) goto L62
            kotlin.f0.x.e.l0.j.b.g0.d r3 = (kotlin.reflect.x.internal.l0.j.b.g0.d) r3
            goto L63
        L62:
            r3 = r2
        L63:
            if (r3 != 0) goto L66
            return r2
        L66:
            kotlin.f0.x.e.l0.f.f r0 = r0.j()
            kotlin.jvm.internal.l.e(r0, r4)
            boolean r0 = r3.h1(r0)
            if (r0 != 0) goto L74
            return r2
        L74:
            kotlin.f0.x.e.l0.j.b.m r0 = r3.b1()
            goto Le4
        L79:
            kotlin.f0.x.e.l0.j.b.k r3 = r12.f21086c
            kotlin.reflect.jvm.internal.impl.descriptors.l0 r3 = r3.r()
            kotlin.f0.x.e.l0.f.c r5 = r0.h()
            java.lang.String r6 = "classId.packageFqName"
            kotlin.jvm.internal.l.e(r5, r6)
            java.util.List r3 = kotlin.reflect.jvm.internal.impl.descriptors.n0.c(r3, r5)
            java.util.Iterator r3 = r3.iterator()
        L90:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto Lb7
            java.lang.Object r5 = r3.next()
            r6 = r5
            kotlin.reflect.jvm.internal.impl.descriptors.k0 r6 = (kotlin.reflect.jvm.internal.impl.descriptors.k0) r6
            boolean r7 = r6 instanceof kotlin.reflect.x.internal.l0.j.b.p
            if (r7 == 0) goto Lb3
            kotlin.f0.x.e.l0.j.b.p r6 = (kotlin.reflect.x.internal.l0.j.b.p) r6
            kotlin.f0.x.e.l0.f.f r7 = r0.j()
            kotlin.jvm.internal.l.e(r7, r4)
            boolean r6 = r6.L0(r7)
            if (r6 == 0) goto Lb1
            goto Lb3
        Lb1:
            r6 = 0
            goto Lb4
        Lb3:
            r6 = 1
        Lb4:
            if (r6 == 0) goto L90
            goto Lb8
        Lb7:
            r5 = r2
        Lb8:
            r4 = r5
            kotlin.reflect.jvm.internal.impl.descriptors.k0 r4 = (kotlin.reflect.jvm.internal.impl.descriptors.k0) r4
            if (r4 != 0) goto Lbe
            return r2
        Lbe:
            kotlin.f0.x.e.l0.j.b.k r3 = r12.f21086c
            kotlin.f0.x.e.l0.e.z.g r6 = new kotlin.f0.x.e.l0.e.z.g
            kotlin.f0.x.e.l0.e.t r0 = r10.j1()
            java.lang.String r2 = "classProto.typeTable"
            kotlin.jvm.internal.l.e(r0, r2)
            r6.<init>(r0)
            kotlin.f0.x.e.l0.e.z.h$a r0 = kotlin.reflect.x.internal.l0.e.z.h.a
            kotlin.f0.x.e.l0.e.w r2 = r10.l1()
            java.lang.String r5 = "classProto.versionRequirementTable"
            kotlin.jvm.internal.l.e(r2, r5)
            kotlin.f0.x.e.l0.e.z.h r7 = r0.a(r2)
            r9 = 0
            r5 = r1
            r8 = r11
            kotlin.f0.x.e.l0.j.b.m r0 = r3.a(r4, r5, r6, r7, r8, r9)
        Le4:
            r4 = r0
            kotlin.f0.x.e.l0.j.b.g0.d r0 = new kotlin.f0.x.e.l0.j.b.g0.d
            r3 = r0
            r5 = r10
            r6 = r1
            r7 = r11
            r8 = r13
            r3.<init>(r4, r5, r6, r7, r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.x.internal.l0.j.b.i.c(kotlin.f0.x.e.l0.j.b.i$a):kotlin.reflect.jvm.internal.impl.descriptors.e");
    }

    public static /* synthetic */ e e(i iVar, kotlin.reflect.x.internal.l0.f.b bVar, g gVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            gVar = null;
        }
        return iVar.d(bVar, gVar);
    }

    public final e d(kotlin.reflect.x.internal.l0.f.b bVar, g gVar) {
        l.f(bVar, "classId");
        return this.f21087d.invoke(new a(bVar, gVar));
    }
}
