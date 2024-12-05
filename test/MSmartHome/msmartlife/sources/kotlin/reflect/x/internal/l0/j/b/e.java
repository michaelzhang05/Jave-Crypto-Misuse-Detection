package kotlin.reflect.x.internal.l0.j.b;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.IntIterator;
import kotlin.collections.n0;
import kotlin.collections.o0;
import kotlin.collections.r;
import kotlin.collections.t;
import kotlin.collections.u;
import kotlin.jvm.internal.l;
import kotlin.reflect.jvm.internal.impl.descriptors.g0;
import kotlin.reflect.jvm.internal.impl.descriptors.h;
import kotlin.reflect.jvm.internal.impl.descriptors.i1;
import kotlin.reflect.jvm.internal.impl.descriptors.j0;
import kotlin.reflect.jvm.internal.impl.descriptors.x;
import kotlin.reflect.jvm.internal.impl.descriptors.z0;
import kotlin.reflect.x.internal.l0.e.b;
import kotlin.reflect.x.internal.l0.e.z.c;
import kotlin.reflect.x.internal.l0.f.f;
import kotlin.reflect.x.internal.l0.i.d;
import kotlin.reflect.x.internal.l0.i.r.g;
import kotlin.reflect.x.internal.l0.i.r.i;
import kotlin.reflect.x.internal.l0.i.r.j;
import kotlin.reflect.x.internal.l0.i.r.k;
import kotlin.reflect.x.internal.l0.i.r.m;
import kotlin.reflect.x.internal.l0.i.r.q;
import kotlin.reflect.x.internal.l0.i.r.v;
import kotlin.reflect.x.internal.l0.i.r.w;
import kotlin.reflect.x.internal.l0.i.r.y;
import kotlin.reflect.x.internal.l0.i.r.z;
import kotlin.reflect.x.internal.l0.l.e0;
import kotlin.reflect.x.internal.l0.l.m0;

/* compiled from: AnnotationDeserializer.kt */
/* loaded from: classes2.dex */
public final class e {
    private final g0 a;

    /* renamed from: b, reason: collision with root package name */
    private final j0 f20997b;

    /* compiled from: AnnotationDeserializer.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[b.C0320b.c.EnumC0323c.values().length];
            iArr[b.C0320b.c.EnumC0323c.BYTE.ordinal()] = 1;
            iArr[b.C0320b.c.EnumC0323c.CHAR.ordinal()] = 2;
            iArr[b.C0320b.c.EnumC0323c.SHORT.ordinal()] = 3;
            iArr[b.C0320b.c.EnumC0323c.INT.ordinal()] = 4;
            iArr[b.C0320b.c.EnumC0323c.LONG.ordinal()] = 5;
            iArr[b.C0320b.c.EnumC0323c.FLOAT.ordinal()] = 6;
            iArr[b.C0320b.c.EnumC0323c.DOUBLE.ordinal()] = 7;
            iArr[b.C0320b.c.EnumC0323c.BOOLEAN.ordinal()] = 8;
            iArr[b.C0320b.c.EnumC0323c.STRING.ordinal()] = 9;
            iArr[b.C0320b.c.EnumC0323c.CLASS.ordinal()] = 10;
            iArr[b.C0320b.c.EnumC0323c.ENUM.ordinal()] = 11;
            iArr[b.C0320b.c.EnumC0323c.ANNOTATION.ordinal()] = 12;
            iArr[b.C0320b.c.EnumC0323c.ARRAY.ordinal()] = 13;
            a = iArr;
        }
    }

    public e(g0 g0Var, j0 j0Var) {
        l.f(g0Var, "module");
        l.f(j0Var, "notFoundClasses");
        this.a = g0Var;
        this.f20997b = j0Var;
    }

    private final boolean b(g<?> gVar, e0 e0Var, b.C0320b.c cVar) {
        Iterable j2;
        b.C0320b.c.EnumC0323c U = cVar.U();
        int i2 = U == null ? -1 : a.a[U.ordinal()];
        if (i2 == 10) {
            h w = e0Var.O0().w();
            kotlin.reflect.jvm.internal.impl.descriptors.e eVar = w instanceof kotlin.reflect.jvm.internal.impl.descriptors.e ? (kotlin.reflect.jvm.internal.impl.descriptors.e) w : null;
            if (eVar != null && !kotlin.reflect.x.internal.l0.b.h.k0(eVar)) {
                return false;
            }
        } else {
            if (i2 != 13) {
                return l.a(gVar.a(this.a), e0Var);
            }
            if ((gVar instanceof kotlin.reflect.x.internal.l0.i.r.b) && ((kotlin.reflect.x.internal.l0.i.r.b) gVar).b().size() == cVar.L().size()) {
                e0 k2 = c().k(e0Var);
                l.e(k2, "builtIns.getArrayElementType(expectedType)");
                kotlin.reflect.x.internal.l0.i.r.b bVar = (kotlin.reflect.x.internal.l0.i.r.b) gVar;
                j2 = t.j(bVar.b());
                if (!(j2 instanceof Collection) || !((Collection) j2).isEmpty()) {
                    Iterator it = j2.iterator();
                    while (it.hasNext()) {
                        int a2 = ((IntIterator) it).a();
                        g<?> gVar2 = bVar.b().get(a2);
                        b.C0320b.c J = cVar.J(a2);
                        l.e(J, "value.getArrayElement(i)");
                        if (!b(gVar2, k2, J)) {
                            return false;
                        }
                    }
                }
            } else {
                throw new IllegalStateException(("Deserialized ArrayValue should have the same number of elements as the original array value: " + gVar).toString());
            }
        }
        return true;
    }

    private final kotlin.reflect.x.internal.l0.b.h c() {
        return this.a.o();
    }

    private final Pair<f, g<?>> d(b.C0320b c0320b, Map<f, ? extends i1> map, c cVar) {
        i1 i1Var = map.get(x.b(cVar, c0320b.y()));
        if (i1Var == null) {
            return null;
        }
        f b2 = x.b(cVar, c0320b.y());
        e0 type = i1Var.getType();
        l.e(type, "parameter.type");
        b.C0320b.c z = c0320b.z();
        l.e(z, "proto.value");
        return new Pair<>(b2, g(type, z, cVar));
    }

    private final kotlin.reflect.jvm.internal.impl.descriptors.e e(kotlin.reflect.x.internal.l0.f.b bVar) {
        return x.c(this.a, bVar, this.f20997b);
    }

    private final g<?> g(e0 e0Var, b.C0320b.c cVar, c cVar2) {
        g<?> f2 = f(e0Var, cVar, cVar2);
        if (!b(f2, e0Var, cVar)) {
            f2 = null;
        }
        if (f2 != null) {
            return f2;
        }
        return k.f20873b.a("Unexpected argument value: actual type " + cVar.U() + " != expected type " + e0Var);
    }

    public final kotlin.reflect.jvm.internal.impl.descriptors.n1.c a(b bVar, c cVar) {
        Map i2;
        int t;
        int e2;
        int b2;
        l.f(bVar, "proto");
        l.f(cVar, "nameResolver");
        kotlin.reflect.jvm.internal.impl.descriptors.e e3 = e(x.a(cVar, bVar.C()));
        i2 = o0.i();
        if (bVar.z() != 0 && !kotlin.reflect.x.internal.l0.l.u1.k.m(e3) && d.t(e3)) {
            Collection<kotlin.reflect.jvm.internal.impl.descriptors.d> k2 = e3.k();
            l.e(k2, "annotationClass.constructors");
            kotlin.reflect.jvm.internal.impl.descriptors.d dVar = (kotlin.reflect.jvm.internal.impl.descriptors.d) r.o0(k2);
            if (dVar != null) {
                List<i1> h2 = dVar.h();
                l.e(h2, "constructor.valueParameters");
                t = u.t(h2, 10);
                e2 = n0.e(t);
                b2 = kotlin.ranges.f.b(e2, 16);
                LinkedHashMap linkedHashMap = new LinkedHashMap(b2);
                for (Object obj : h2) {
                    linkedHashMap.put(((i1) obj).getName(), obj);
                }
                List<b.C0320b> A = bVar.A();
                l.e(A, "proto.argumentList");
                ArrayList arrayList = new ArrayList();
                for (b.C0320b c0320b : A) {
                    l.e(c0320b, "it");
                    Pair<f, g<?>> d2 = d(c0320b, linkedHashMap, cVar);
                    if (d2 != null) {
                        arrayList.add(d2);
                    }
                }
                i2 = o0.q(arrayList);
            }
        }
        return new kotlin.reflect.jvm.internal.impl.descriptors.n1.d(e3.s(), i2, z0.a);
    }

    public final g<?> f(e0 e0Var, b.C0320b.c cVar, c cVar2) {
        g<?> eVar;
        int t;
        l.f(e0Var, "expectedType");
        l.f(cVar, "value");
        l.f(cVar2, "nameResolver");
        Boolean d2 = kotlin.reflect.x.internal.l0.e.z.b.O.d(cVar.Q());
        l.e(d2, "IS_UNSIGNED.get(value.flags)");
        boolean booleanValue = d2.booleanValue();
        b.C0320b.c.EnumC0323c U = cVar.U();
        switch (U == null ? -1 : a.a[U.ordinal()]) {
            case 1:
                byte S = (byte) cVar.S();
                return booleanValue ? new w(S) : new kotlin.reflect.x.internal.l0.i.r.d(S);
            case 2:
                eVar = new kotlin.reflect.x.internal.l0.i.r.e((char) cVar.S());
                break;
            case 3:
                short S2 = (short) cVar.S();
                return booleanValue ? new z(S2) : new kotlin.reflect.x.internal.l0.i.r.u(S2);
            case 4:
                int S3 = (int) cVar.S();
                if (booleanValue) {
                    eVar = new kotlin.reflect.x.internal.l0.i.r.x(S3);
                    break;
                } else {
                    eVar = new m(S3);
                    break;
                }
            case 5:
                long S4 = cVar.S();
                return booleanValue ? new y(S4) : new kotlin.reflect.x.internal.l0.i.r.r(S4);
            case 6:
                eVar = new kotlin.reflect.x.internal.l0.i.r.l(cVar.R());
                break;
            case 7:
                eVar = new i(cVar.O());
                break;
            case 8:
                eVar = new kotlin.reflect.x.internal.l0.i.r.c(cVar.S() != 0);
                break;
            case 9:
                eVar = new v(cVar2.getString(cVar.T()));
                break;
            case 10:
                eVar = new q(x.a(cVar2, cVar.M()), cVar.I());
                break;
            case 11:
                eVar = new j(x.a(cVar2, cVar.M()), x.b(cVar2, cVar.P()));
                break;
            case 12:
                b H = cVar.H();
                l.e(H, "value.annotation");
                eVar = new kotlin.reflect.x.internal.l0.i.r.a(a(H, cVar2));
                break;
            case 13:
                List<b.C0320b.c> L = cVar.L();
                l.e(L, "value.arrayElementList");
                t = u.t(L, 10);
                ArrayList arrayList = new ArrayList(t);
                for (b.C0320b.c cVar3 : L) {
                    m0 i2 = c().i();
                    l.e(i2, "builtIns.anyType");
                    l.e(cVar3, "it");
                    arrayList.add(f(i2, cVar3, cVar2));
                }
                return new n(arrayList, e0Var);
            default:
                throw new IllegalStateException(("Unsupported annotation argument type: " + cVar.U() + " (expected " + e0Var + ')').toString());
        }
        return eVar;
    }
}
