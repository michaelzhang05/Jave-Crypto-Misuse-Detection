package d4;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentFactory;
import com.stripe.android.stripe3ds2.views.ChallengeProgressFragment;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: d4.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2744h extends FragmentFactory {

    /* renamed from: a, reason: collision with root package name */
    private final String f31185a;

    /* renamed from: b, reason: collision with root package name */
    private final a4.q f31186b;

    /* renamed from: c, reason: collision with root package name */
    private final Integer f31187c;

    public C2744h(String directoryServerName, a4.q sdkTransactionId, Integer num) {
        AbstractC3255y.i(directoryServerName, "directoryServerName");
        AbstractC3255y.i(sdkTransactionId, "sdkTransactionId");
        this.f31185a = directoryServerName;
        this.f31186b = sdkTransactionId;
        this.f31187c = num;
    }

    @Override // androidx.fragment.app.FragmentFactory
    public Fragment instantiate(ClassLoader classLoader, String className) {
        AbstractC3255y.i(classLoader, "classLoader");
        AbstractC3255y.i(className, "className");
        if (AbstractC3255y.d(className, ChallengeProgressFragment.class.getName())) {
            return new ChallengeProgressFragment(this.f31185a, this.f31186b, this.f31187c);
        }
        Fragment instantiate = super.instantiate(classLoader, className);
        AbstractC3255y.f(instantiate);
        return instantiate;
    }
}
