package q;

import L5.I;
import com.inmobi.cmp.ChoiceCmpCallback;
import com.inmobi.cmp.core.model.mspa.USRegulationData;
import com.inmobi.cmp.model.ChoiceError;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3160z;

/* renamed from: q.n, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3640n extends AbstractC3160z implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3639m f37188a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3640n(C3639m c3639m) {
        super(1);
        this.f37188a = c3639m;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        I i8;
        ChoiceCmpCallback choiceCmpCallback;
        ChoiceCmpCallback choiceCmpCallback2;
        USRegulationData uSRegulationData = (USRegulationData) obj;
        if (uSRegulationData == null || (choiceCmpCallback2 = this.f37188a.f37185c) == null) {
            i8 = null;
        } else {
            choiceCmpCallback2.onReceiveUSRegulationsConsent(uSRegulationData);
            i8 = I.f6487a;
        }
        if (i8 == null && (choiceCmpCallback = this.f37188a.f37185c) != null) {
            choiceCmpCallback.onCmpError(ChoiceError.ERROR_WHILE_SAVING_CONSENT);
        }
        return I.f6487a;
    }
}
