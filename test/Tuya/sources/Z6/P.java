package z6;

import M5.a0;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3159y;
import u6.AbstractC3808a;

/* loaded from: classes5.dex */
public abstract class P {

    /* renamed from: a, reason: collision with root package name */
    private static final Set f40535a = a0.i(AbstractC3808a.r(L5.A.f6471b).a(), AbstractC3808a.s(L5.C.f6476b).a(), AbstractC3808a.q(L5.y.f6525b).a(), AbstractC3808a.t(L5.F.f6482b).a());

    public static final boolean a(v6.f fVar) {
        AbstractC3159y.i(fVar, "<this>");
        if (fVar.isInline() && AbstractC3159y.d(fVar, y6.j.j())) {
            return true;
        }
        return false;
    }

    public static final boolean b(v6.f fVar) {
        AbstractC3159y.i(fVar, "<this>");
        if (fVar.isInline() && f40535a.contains(fVar)) {
            return true;
        }
        return false;
    }
}
