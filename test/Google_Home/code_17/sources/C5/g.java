package C5;

import B5.s;
import O7.w;
import androidx.lifecycle.ViewModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes5.dex */
public final class g extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    public final s f1591a;

    /* renamed from: b, reason: collision with root package name */
    public final O7.g f1592b;

    /* renamed from: c, reason: collision with root package name */
    public final w f1593c;

    /* renamed from: d, reason: collision with root package name */
    public final List f1594d;

    public g(s tcModel, O7.g disclosureRepository, w translationsTextRepository) {
        AbstractC3255y.i(tcModel, "tcModel");
        AbstractC3255y.i(disclosureRepository, "disclosureRepository");
        AbstractC3255y.i(translationsTextRepository, "translationsTextRepository");
        this.f1591a = tcModel;
        this.f1592b = disclosureRepository;
        this.f1593c = translationsTextRepository;
        this.f1594d = new ArrayList();
    }

    public final int a(U7.e switchItemType) {
        AbstractC3255y.i(switchItemType, "switchItemType");
        int ordinal = switchItemType.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return 2;
            }
            if (ordinal == 2) {
                return 10;
            }
        }
        return 8;
    }
}
