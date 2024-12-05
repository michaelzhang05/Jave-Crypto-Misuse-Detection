package h4;

import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

@StabilityInferred(parameters = 1)
@w6.g(with = C2930g0.class)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: h4.f0 */
/* loaded from: classes4.dex */
public abstract class AbstractC2928f0 implements Parcelable {
    public static final a Companion = new a(null);

    /* renamed from: h4.f0$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public final w6.b serializer() {
            return C2930g0.f32604c;
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    public /* synthetic */ AbstractC2928f0(AbstractC3247p abstractC3247p) {
        this();
    }

    public static /* synthetic */ p4.h0 g(AbstractC2928f0 abstractC2928f0, p4.k0 k0Var, Integer num, int i8, Object obj) {
        if (obj == null) {
            if ((i8 & 2) != 0) {
                num = null;
            }
            return abstractC2928f0.b(k0Var, num);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createSectionElement");
    }

    public final p4.h0 a(List sectionFieldElements, Integer num) {
        AbstractC3255y.i(sectionFieldElements, "sectionFieldElements");
        return p4.h0.f37539f.a(sectionFieldElements, num);
    }

    public final p4.h0 b(p4.k0 sectionFieldElement, Integer num) {
        AbstractC3255y.i(sectionFieldElement, "sectionFieldElement");
        return p4.h0.f37539f.b(sectionFieldElement, num);
    }

    private AbstractC2928f0() {
    }
}
