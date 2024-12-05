package kotlin.reflect.jvm.internal.impl.descriptors.n1;

import java.util.List;
import java.util.Map;
import kotlin.collections.o0;
import kotlin.collections.t;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.g0;
import kotlin.reflect.x.internal.l0.b.k;
import kotlin.reflect.x.internal.l0.i.r.v;
import kotlin.reflect.x.internal.l0.l.e0;
import kotlin.reflect.x.internal.l0.l.m0;
import kotlin.reflect.x.internal.l0.l.r1;
import kotlin.s;
import okhttp3.HttpUrl;

/* compiled from: annotationUtil.kt */
/* loaded from: classes2.dex */
public final class f {
    private static final kotlin.reflect.x.internal.l0.f.f a;

    /* renamed from: b, reason: collision with root package name */
    private static final kotlin.reflect.x.internal.l0.f.f f21669b;

    /* renamed from: c, reason: collision with root package name */
    private static final kotlin.reflect.x.internal.l0.f.f f21670c;

    /* renamed from: d, reason: collision with root package name */
    private static final kotlin.reflect.x.internal.l0.f.f f21671d;

    /* renamed from: e, reason: collision with root package name */
    private static final kotlin.reflect.x.internal.l0.f.f f21672e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: annotationUtil.kt */
    /* loaded from: classes2.dex */
    public static final class a extends Lambda implements Function1<g0, e0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ kotlin.reflect.x.internal.l0.b.h f21673f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(kotlin.reflect.x.internal.l0.b.h hVar) {
            super(1);
            this.f21673f = hVar;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final e0 invoke(g0 g0Var) {
            kotlin.jvm.internal.l.f(g0Var, "module");
            m0 l = g0Var.o().l(r1.INVARIANT, this.f21673f.W());
            kotlin.jvm.internal.l.e(l, "module.builtIns.getArray…ce.INVARIANT, stringType)");
            return l;
        }
    }

    static {
        kotlin.reflect.x.internal.l0.f.f r = kotlin.reflect.x.internal.l0.f.f.r("message");
        kotlin.jvm.internal.l.e(r, "identifier(\"message\")");
        a = r;
        kotlin.reflect.x.internal.l0.f.f r2 = kotlin.reflect.x.internal.l0.f.f.r("replaceWith");
        kotlin.jvm.internal.l.e(r2, "identifier(\"replaceWith\")");
        f21669b = r2;
        kotlin.reflect.x.internal.l0.f.f r3 = kotlin.reflect.x.internal.l0.f.f.r("level");
        kotlin.jvm.internal.l.e(r3, "identifier(\"level\")");
        f21670c = r3;
        kotlin.reflect.x.internal.l0.f.f r4 = kotlin.reflect.x.internal.l0.f.f.r("expression");
        kotlin.jvm.internal.l.e(r4, "identifier(\"expression\")");
        f21671d = r4;
        kotlin.reflect.x.internal.l0.f.f r5 = kotlin.reflect.x.internal.l0.f.f.r("imports");
        kotlin.jvm.internal.l.e(r5, "identifier(\"imports\")");
        f21672e = r5;
    }

    public static final c a(kotlin.reflect.x.internal.l0.b.h hVar, String str, String str2, String str3) {
        List i2;
        Map l;
        Map l2;
        kotlin.jvm.internal.l.f(hVar, "<this>");
        kotlin.jvm.internal.l.f(str, "message");
        kotlin.jvm.internal.l.f(str2, "replaceWith");
        kotlin.jvm.internal.l.f(str3, "level");
        kotlin.reflect.x.internal.l0.f.c cVar = k.a.B;
        kotlin.reflect.x.internal.l0.f.f fVar = f21672e;
        i2 = t.i();
        l = o0.l(s.a(f21671d, new v(str2)), s.a(fVar, new kotlin.reflect.x.internal.l0.i.r.b(i2, new a(hVar))));
        j jVar = new j(hVar, cVar, l);
        kotlin.reflect.x.internal.l0.f.c cVar2 = k.a.y;
        kotlin.reflect.x.internal.l0.f.f fVar2 = f21670c;
        kotlin.reflect.x.internal.l0.f.b m = kotlin.reflect.x.internal.l0.f.b.m(k.a.A);
        kotlin.jvm.internal.l.e(m, "topLevel(StandardNames.FqNames.deprecationLevel)");
        kotlin.reflect.x.internal.l0.f.f r = kotlin.reflect.x.internal.l0.f.f.r(str3);
        kotlin.jvm.internal.l.e(r, "identifier(level)");
        l2 = o0.l(s.a(a, new v(str)), s.a(f21669b, new kotlin.reflect.x.internal.l0.i.r.a(jVar)), s.a(fVar2, new kotlin.reflect.x.internal.l0.i.r.j(m, r)));
        return new j(hVar, cVar2, l2);
    }

    public static /* synthetic */ c b(kotlin.reflect.x.internal.l0.b.h hVar, String str, String str2, String str3, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str2 = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        if ((i2 & 4) != 0) {
            str3 = "WARNING";
        }
        return a(hVar, str, str2, str3);
    }
}
