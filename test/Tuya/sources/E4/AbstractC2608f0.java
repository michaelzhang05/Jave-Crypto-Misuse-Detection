package e4;

import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

@StabilityInferred(parameters = 1)
@t6.g(with = C2610g0.class)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: e4.f0 */
/* loaded from: classes4.dex */
public abstract class AbstractC2608f0 implements Parcelable {
    public static final a Companion = new a(null);

    /* renamed from: e4.f0$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public final t6.b serializer() {
            return C2610g0.f30683c;
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    public /* synthetic */ AbstractC2608f0(AbstractC3151p abstractC3151p) {
        this();
    }

    public static /* synthetic */ m4.h0 e(AbstractC2608f0 abstractC2608f0, m4.k0 k0Var, Integer num, int i8, Object obj) {
        if (obj == null) {
            if ((i8 & 2) != 0) {
                num = null;
            }
            return abstractC2608f0.c(k0Var, num);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createSectionElement");
    }

    public final m4.h0 b(List sectionFieldElements, Integer num) {
        AbstractC3159y.i(sectionFieldElements, "sectionFieldElements");
        return m4.h0.f35513f.a(sectionFieldElements, num);
    }

    public final m4.h0 c(m4.k0 sectionFieldElement, Integer num) {
        AbstractC3159y.i(sectionFieldElement, "sectionFieldElement");
        return m4.h0.f35513f.b(sectionFieldElement, num);
    }

    private AbstractC2608f0() {
    }
}
