package kotlin.reflect.x.internal;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.reflect.jvm.internal.impl.descriptors.t0;
import kotlin.reflect.x.internal.KPropertyImpl;
import kotlin.reflect.x.internal.calls.CallerImpl;
import kotlin.reflect.x.internal.l0.e.a0.b.i;
import kotlin.reflect.x.internal.l0.i.d;
import kotlin.reflect.x.internal.l0.j.b.g0.j;
import kotlin.reflect.x.internal.l0.l.n1;
import okhttp3.HttpUrl;

/* compiled from: KPropertyImpl.kt */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a \u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0006*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00022\u0006\u0010\u0007\u001a\u00020\bH\u0002\u001a\f\u0010\t\u001a\u00020\b*\u00020\nH\u0002\"\"\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u000b"}, d2 = {"boundReceiver", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlin/reflect/jvm/internal/KPropertyImpl$Accessor;", "getBoundReceiver", "(Lkotlin/reflect/jvm/internal/KPropertyImpl$Accessor;)Ljava/lang/Object;", "computeCallerForAccessor", "Lkotlin/reflect/jvm/internal/calls/Caller;", "isGetter", HttpUrl.FRAGMENT_ENCODE_SET, "isJvmFieldPropertyInCompanionObject", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "kotlin-reflection"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class w {
    /* JADX WARN: Removed duplicated region for block: B:14:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.reflect.x.internal.calls.Caller<?> b(kotlin.reflect.x.internal.KPropertyImpl.a<?, ?> r6, boolean r7) {
        /*
            Method dump skipped, instructions count: 589
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.x.internal.w.b(kotlin.f0.x.e.v$a, boolean):kotlin.f0.x.e.k0.d");
    }

    private static final CallerImpl<Field> c(KPropertyImpl.a<?, ?> aVar, boolean z, Field field) {
        CallerImpl<Field> aVar2;
        if (g(aVar.n().D()) || !Modifier.isStatic(field.getModifiers())) {
            if (z) {
                if (!aVar.C()) {
                    return new CallerImpl.f.c(field);
                }
                aVar2 = new CallerImpl.f.a(field, f(aVar));
            } else {
                aVar2 = aVar.C() ? new CallerImpl.g.a(field, e(aVar), f(aVar)) : new CallerImpl.g.c(field, e(aVar));
            }
        } else if (d(aVar)) {
            if (z) {
                return aVar.C() ? new CallerImpl.f.b(field) : new CallerImpl.f.d(field);
            }
            aVar2 = aVar.C() ? new CallerImpl.g.b(field, e(aVar)) : new CallerImpl.g.d(field, e(aVar));
        } else {
            if (z) {
                return new CallerImpl.f.e(field);
            }
            aVar2 = new CallerImpl.g.e(field, e(aVar));
        }
        return aVar2;
    }

    private static final boolean d(KPropertyImpl.a<?, ?> aVar) {
        return aVar.n().D().getAnnotations().A(i0.j());
    }

    private static final boolean e(KPropertyImpl.a<?, ?> aVar) {
        return !n1.l(aVar.n().D().getType());
    }

    public static final Object f(KPropertyImpl.a<?, ?> aVar) {
        l.f(aVar, "<this>");
        return aVar.n().E();
    }

    private static final boolean g(t0 t0Var) {
        m b2 = t0Var.b();
        l.e(b2, "containingDeclaration");
        if (!d.x(b2)) {
            return false;
        }
        m b3 = b2.b();
        return !(d.C(b3) || d.t(b3)) || ((t0Var instanceof j) && i.f(((j) t0Var).E()));
    }
}
