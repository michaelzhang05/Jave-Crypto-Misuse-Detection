package kotlin.reflect.x.internal.l0.d.a;

import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.l;
import kotlin.reflect.jvm.internal.impl.descriptors.b;
import kotlin.reflect.jvm.internal.impl.descriptors.y0;
import kotlin.reflect.x.internal.l0.b.h;
import kotlin.reflect.x.internal.l0.d.b.v;
import kotlin.reflect.x.internal.l0.f.f;

/* compiled from: specialBuiltinMembers.kt */
/* loaded from: classes2.dex */
public final class e extends h0 {
    public static final e n = new e();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: specialBuiltinMembers.kt */
    /* loaded from: classes2.dex */
    public static final class a extends Lambda implements Function1<b, Boolean> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ y0 f19871f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(y0 y0Var) {
            super(1);
            this.f19871f = y0Var;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(b bVar) {
            l.f(bVar, "it");
            return Boolean.valueOf(h0.a.j().containsKey(v.d(this.f19871f)));
        }
    }

    private e() {
    }

    public final f i(y0 y0Var) {
        l.f(y0Var, "functionDescriptor");
        Map<String, f> j2 = h0.a.j();
        String d2 = v.d(y0Var);
        if (d2 == null) {
            return null;
        }
        return j2.get(d2);
    }

    public final boolean j(y0 y0Var) {
        l.f(y0Var, "functionDescriptor");
        return h.f0(y0Var) && kotlin.reflect.x.internal.l0.i.t.a.c(y0Var, false, new a(y0Var), 1, null) != null;
    }

    public final boolean k(y0 y0Var) {
        l.f(y0Var, "<this>");
        return l.a(y0Var.getName().f(), "removeAt") && l.a(v.d(y0Var), h0.a.h().b());
    }
}
