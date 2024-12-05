package C6;

import P5.a0;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3255y;
import x6.AbstractC4193a;

/* loaded from: classes5.dex */
public abstract class P {

    /* renamed from: a, reason: collision with root package name */
    private static final Set f1653a = a0.i(AbstractC4193a.r(O5.A.f8262b).a(), AbstractC4193a.s(O5.C.f8267b).a(), AbstractC4193a.q(O5.y.f8316b).a(), AbstractC4193a.t(O5.F.f8273b).a());

    public static final boolean a(y6.f fVar) {
        AbstractC3255y.i(fVar, "<this>");
        if (fVar.isInline() && AbstractC3255y.d(fVar, B6.j.j())) {
            return true;
        }
        return false;
    }

    public static final boolean b(y6.f fVar) {
        AbstractC3255y.i(fVar, "<this>");
        if (fVar.isInline() && f1653a.contains(fVar)) {
            return true;
        }
        return false;
    }
}
