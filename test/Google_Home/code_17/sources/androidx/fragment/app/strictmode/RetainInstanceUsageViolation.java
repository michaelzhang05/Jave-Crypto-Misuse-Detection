package androidx.fragment.app.strictmode;

import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes3.dex */
public abstract class RetainInstanceUsageViolation extends Violation {
    public /* synthetic */ RetainInstanceUsageViolation(Fragment fragment, String str, int i8, AbstractC3247p abstractC3247p) {
        this(fragment, (i8 & 2) != 0 ? null : str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetainInstanceUsageViolation(Fragment fragment, String str) {
        super(fragment, str);
        AbstractC3255y.i(fragment, "fragment");
    }
}
