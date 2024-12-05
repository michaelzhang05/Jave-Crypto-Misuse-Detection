package kotlin.reflect.x.internal.l0.e.a0.b;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.b0;
import kotlin.collections.t;
import kotlin.jvm.internal.l;
import kotlin.reflect.jvm.internal.impl.protobuf.f;
import kotlin.reflect.jvm.internal.impl.protobuf.h;
import kotlin.reflect.x.internal.l0.e.a0.a;
import kotlin.reflect.x.internal.l0.e.a0.b.d;
import kotlin.reflect.x.internal.l0.e.n;
import kotlin.reflect.x.internal.l0.e.q;
import kotlin.reflect.x.internal.l0.e.u;
import kotlin.reflect.x.internal.l0.e.z.b;
import kotlin.reflect.x.internal.l0.e.z.c;
import kotlin.reflect.x.internal.l0.e.z.e;
import kotlin.reflect.x.internal.l0.e.z.g;
import okhttp3.HttpUrl;

/* compiled from: JvmProtoBufUtil.kt */
/* loaded from: classes2.dex */
public final class i {
    public static final i a = new i();

    /* renamed from: b */
    private static final f f20408b;

    static {
        f d2 = f.d();
        a.a(d2);
        l.e(d2, "newInstance().apply(JvmP…f::registerAllExtensions)");
        f20408b = d2;
    }

    private i() {
    }

    public static /* synthetic */ d.a d(i iVar, n nVar, c cVar, g gVar, boolean z, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            z = true;
        }
        return iVar.c(nVar, cVar, gVar, z);
    }

    public static final boolean f(n nVar) {
        l.f(nVar, "proto");
        b.C0329b a2 = c.a.a();
        Object u = nVar.u(a.f20333e);
        l.e(u, "proto.getExtension(JvmProtoBuf.flags)");
        Boolean d2 = a2.d(((Number) u).intValue());
        l.e(d2, "JvmFlags.IS_MOVED_FROM_I…nsion(JvmProtoBuf.flags))");
        return d2.booleanValue();
    }

    private final String g(q qVar, c cVar) {
        if (qVar.n0()) {
            return b.b(cVar.a(qVar.Y()));
        }
        return null;
    }

    public static final Pair<f, kotlin.reflect.x.internal.l0.e.c> h(byte[] bArr, String[] strArr) {
        l.f(bArr, "bytes");
        l.f(strArr, "strings");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        return new Pair<>(a.k(byteArrayInputStream, strArr), kotlin.reflect.x.internal.l0.e.c.y1(byteArrayInputStream, f20408b));
    }

    public static final Pair<f, kotlin.reflect.x.internal.l0.e.c> i(String[] strArr, String[] strArr2) {
        l.f(strArr, "data");
        l.f(strArr2, "strings");
        byte[] e2 = a.e(strArr);
        l.e(e2, "decodeBytes(data)");
        return h(e2, strArr2);
    }

    public static final Pair<f, kotlin.reflect.x.internal.l0.e.i> j(String[] strArr, String[] strArr2) {
        l.f(strArr, "data");
        l.f(strArr2, "strings");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(a.e(strArr));
        return new Pair<>(a.k(byteArrayInputStream, strArr2), kotlin.reflect.x.internal.l0.e.i.G0(byteArrayInputStream, f20408b));
    }

    private final f k(InputStream inputStream, String[] strArr) {
        a.e F = a.e.F(inputStream, f20408b);
        l.e(F, "parseDelimitedFrom(this, EXTENSION_REGISTRY)");
        return new f(F, strArr);
    }

    public static final Pair<f, kotlin.reflect.x.internal.l0.e.l> l(byte[] bArr, String[] strArr) {
        l.f(bArr, "bytes");
        l.f(strArr, "strings");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        return new Pair<>(a.k(byteArrayInputStream, strArr), kotlin.reflect.x.internal.l0.e.l.f0(byteArrayInputStream, f20408b));
    }

    public static final Pair<f, kotlin.reflect.x.internal.l0.e.l> m(String[] strArr, String[] strArr2) {
        l.f(strArr, "data");
        l.f(strArr2, "strings");
        byte[] e2 = a.e(strArr);
        l.e(e2, "decodeBytes(data)");
        return l(e2, strArr2);
    }

    public final f a() {
        return f20408b;
    }

    public final d.b b(kotlin.reflect.x.internal.l0.e.d dVar, c cVar, g gVar) {
        int t;
        String b0;
        l.f(dVar, "proto");
        l.f(cVar, "nameResolver");
        l.f(gVar, "typeTable");
        h.f<kotlin.reflect.x.internal.l0.e.d, a.c> fVar = a.a;
        l.e(fVar, "constructorSignature");
        a.c cVar2 = (a.c) e.a(dVar, fVar);
        String string = (cVar2 == null || !cVar2.B()) ? "<init>" : cVar.getString(cVar2.z());
        if (cVar2 != null && cVar2.A()) {
            b0 = cVar.getString(cVar2.y());
        } else {
            List<u> O = dVar.O();
            l.e(O, "proto.valueParameterList");
            t = kotlin.collections.u.t(O, 10);
            ArrayList arrayList = new ArrayList(t);
            for (u uVar : O) {
                i iVar = a;
                l.e(uVar, "it");
                String g2 = iVar.g(kotlin.reflect.x.internal.l0.e.z.f.n(uVar, gVar), cVar);
                if (g2 == null) {
                    return null;
                }
                arrayList.add(g2);
            }
            b0 = b0.b0(arrayList, HttpUrl.FRAGMENT_ENCODE_SET, "(", ")V", 0, null, null, 56, null);
        }
        return new d.b(string, b0);
    }

    public final d.a c(n nVar, c cVar, g gVar, boolean z) {
        String g2;
        l.f(nVar, "proto");
        l.f(cVar, "nameResolver");
        l.f(gVar, "typeTable");
        h.f<n, a.d> fVar = a.f20332d;
        l.e(fVar, "propertySignature");
        a.d dVar = (a.d) e.a(nVar, fVar);
        if (dVar == null) {
            return null;
        }
        a.b C = dVar.H() ? dVar.C() : null;
        if (C == null && z) {
            return null;
        }
        int e0 = (C == null || !C.B()) ? nVar.e0() : C.z();
        if (C == null || !C.A()) {
            g2 = g(kotlin.reflect.x.internal.l0.e.z.f.k(nVar, gVar), cVar);
            if (g2 == null) {
                return null;
            }
        } else {
            g2 = cVar.getString(C.y());
        }
        return new d.a(cVar.getString(e0), g2);
    }

    public final d.b e(kotlin.reflect.x.internal.l0.e.i iVar, c cVar, g gVar) {
        List m;
        int t;
        List k0;
        int t2;
        String b0;
        String sb;
        l.f(iVar, "proto");
        l.f(cVar, "nameResolver");
        l.f(gVar, "typeTable");
        h.f<kotlin.reflect.x.internal.l0.e.i, a.c> fVar = a.f20330b;
        l.e(fVar, "methodSignature");
        a.c cVar2 = (a.c) e.a(iVar, fVar);
        int f0 = (cVar2 == null || !cVar2.B()) ? iVar.f0() : cVar2.z();
        if (cVar2 != null && cVar2.A()) {
            sb = cVar.getString(cVar2.y());
        } else {
            m = t.m(kotlin.reflect.x.internal.l0.e.z.f.h(iVar, gVar));
            List<u> r0 = iVar.r0();
            l.e(r0, "proto.valueParameterList");
            t = kotlin.collections.u.t(r0, 10);
            ArrayList arrayList = new ArrayList(t);
            for (u uVar : r0) {
                l.e(uVar, "it");
                arrayList.add(kotlin.reflect.x.internal.l0.e.z.f.n(uVar, gVar));
            }
            k0 = b0.k0(m, arrayList);
            t2 = kotlin.collections.u.t(k0, 10);
            ArrayList arrayList2 = new ArrayList(t2);
            Iterator it = k0.iterator();
            while (it.hasNext()) {
                String g2 = a.g((q) it.next(), cVar);
                if (g2 == null) {
                    return null;
                }
                arrayList2.add(g2);
            }
            String g3 = g(kotlin.reflect.x.internal.l0.e.z.f.j(iVar, gVar), cVar);
            if (g3 == null) {
                return null;
            }
            StringBuilder sb2 = new StringBuilder();
            b0 = b0.b0(arrayList2, HttpUrl.FRAGMENT_ENCODE_SET, "(", ")", 0, null, null, 56, null);
            sb2.append(b0);
            sb2.append(g3);
            sb = sb2.toString();
        }
        return new d.b(cVar.getString(f0), sb);
    }
}
