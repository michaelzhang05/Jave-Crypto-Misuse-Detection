package kotlin.reflect.x.internal.l0.j.b.f0;

import kotlin.jvm.internal.l;
import kotlin.reflect.x.internal.l0.f.c;
import kotlin.text.u;

/* compiled from: BuiltInSerializerProtocol.kt */
/* loaded from: classes2.dex */
public final class a extends kotlin.reflect.x.internal.l0.j.a {
    public static final a n = new a();

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private a() {
        /*
            r14 = this;
            kotlin.reflect.jvm.internal.impl.protobuf.f r1 = kotlin.reflect.jvm.internal.impl.protobuf.f.d()
            kotlin.reflect.x.internal.l0.e.y.b.a(r1)
            java.lang.String r0 = "newInstance().apply(Buil…f::registerAllExtensions)"
            kotlin.jvm.internal.l.e(r1, r0)
            kotlin.reflect.jvm.internal.impl.protobuf.h$f<kotlin.f0.x.e.l0.e.l, java.lang.Integer> r2 = kotlin.reflect.x.internal.l0.e.y.b.a
            java.lang.String r0 = "packageFqName"
            kotlin.jvm.internal.l.e(r2, r0)
            kotlin.reflect.jvm.internal.impl.protobuf.h$f<kotlin.f0.x.e.l0.e.d, java.util.List<kotlin.f0.x.e.l0.e.b>> r3 = kotlin.reflect.x.internal.l0.e.y.b.f20677c
            java.lang.String r0 = "constructorAnnotation"
            kotlin.jvm.internal.l.e(r3, r0)
            kotlin.reflect.jvm.internal.impl.protobuf.h$f<kotlin.f0.x.e.l0.e.c, java.util.List<kotlin.f0.x.e.l0.e.b>> r4 = kotlin.reflect.x.internal.l0.e.y.b.f20676b
            java.lang.String r0 = "classAnnotation"
            kotlin.jvm.internal.l.e(r4, r0)
            kotlin.reflect.jvm.internal.impl.protobuf.h$f<kotlin.f0.x.e.l0.e.i, java.util.List<kotlin.f0.x.e.l0.e.b>> r5 = kotlin.reflect.x.internal.l0.e.y.b.f20678d
            java.lang.String r0 = "functionAnnotation"
            kotlin.jvm.internal.l.e(r5, r0)
            kotlin.reflect.jvm.internal.impl.protobuf.h$f<kotlin.f0.x.e.l0.e.n, java.util.List<kotlin.f0.x.e.l0.e.b>> r6 = kotlin.reflect.x.internal.l0.e.y.b.f20679e
            java.lang.String r0 = "propertyAnnotation"
            kotlin.jvm.internal.l.e(r6, r0)
            kotlin.reflect.jvm.internal.impl.protobuf.h$f<kotlin.f0.x.e.l0.e.n, java.util.List<kotlin.f0.x.e.l0.e.b>> r7 = kotlin.reflect.x.internal.l0.e.y.b.f20680f
            java.lang.String r0 = "propertyGetterAnnotation"
            kotlin.jvm.internal.l.e(r7, r0)
            kotlin.reflect.jvm.internal.impl.protobuf.h$f<kotlin.f0.x.e.l0.e.n, java.util.List<kotlin.f0.x.e.l0.e.b>> r8 = kotlin.reflect.x.internal.l0.e.y.b.f20681g
            java.lang.String r0 = "propertySetterAnnotation"
            kotlin.jvm.internal.l.e(r8, r0)
            kotlin.reflect.jvm.internal.impl.protobuf.h$f<kotlin.f0.x.e.l0.e.g, java.util.List<kotlin.f0.x.e.l0.e.b>> r9 = kotlin.reflect.x.internal.l0.e.y.b.f20683i
            java.lang.String r0 = "enumEntryAnnotation"
            kotlin.jvm.internal.l.e(r9, r0)
            kotlin.reflect.jvm.internal.impl.protobuf.h$f<kotlin.f0.x.e.l0.e.n, kotlin.f0.x.e.l0.e.b$b$c> r10 = kotlin.reflect.x.internal.l0.e.y.b.f20682h
            java.lang.String r0 = "compileTimeValue"
            kotlin.jvm.internal.l.e(r10, r0)
            kotlin.reflect.jvm.internal.impl.protobuf.h$f<kotlin.f0.x.e.l0.e.u, java.util.List<kotlin.f0.x.e.l0.e.b>> r11 = kotlin.reflect.x.internal.l0.e.y.b.f20684j
            java.lang.String r0 = "parameterAnnotation"
            kotlin.jvm.internal.l.e(r11, r0)
            kotlin.reflect.jvm.internal.impl.protobuf.h$f<kotlin.f0.x.e.l0.e.q, java.util.List<kotlin.f0.x.e.l0.e.b>> r12 = kotlin.reflect.x.internal.l0.e.y.b.f20685k
            java.lang.String r0 = "typeAnnotation"
            kotlin.jvm.internal.l.e(r12, r0)
            kotlin.reflect.jvm.internal.impl.protobuf.h$f<kotlin.f0.x.e.l0.e.s, java.util.List<kotlin.f0.x.e.l0.e.b>> r13 = kotlin.reflect.x.internal.l0.e.y.b.l
            java.lang.String r0 = "typeParameterAnnotation"
            kotlin.jvm.internal.l.e(r13, r0)
            r0 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.x.internal.l0.j.b.f0.a.<init>():void");
    }

    private final String o(c cVar) {
        if (cVar.d()) {
            return "default-package";
        }
        String f2 = cVar.g().f();
        l.e(f2, "fqName.shortName().asString()");
        return f2;
    }

    public final String m(c cVar) {
        l.f(cVar, "fqName");
        return o(cVar) + ".kotlin_builtins";
    }

    public final String n(c cVar) {
        String v;
        l.f(cVar, "fqName");
        StringBuilder sb = new StringBuilder();
        String b2 = cVar.b();
        l.e(b2, "fqName.asString()");
        v = u.v(b2, '.', '/', false, 4, null);
        sb.append(v);
        sb.append('/');
        sb.append(m(cVar));
        return sb.toString();
    }
}
