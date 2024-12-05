package q;

import O5.I;
import com.inmobi.cmp.ChoiceCmpCallback;
import com.inmobi.cmp.core.model.mspa.USRegulationData;
import com.inmobi.cmp.model.ChoiceError;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3256z;

/* renamed from: q.n, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3804n extends AbstractC3256z implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3803m f38049a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3804n(C3803m c3803m) {
        super(1);
        this.f38049a = c3803m;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        I i8;
        ChoiceCmpCallback choiceCmpCallback;
        ChoiceCmpCallback choiceCmpCallback2;
        USRegulationData uSRegulationData = (USRegulationData) obj;
        if (uSRegulationData == null || (choiceCmpCallback2 = this.f38049a.f38046c) == null) {
            i8 = null;
        } else {
            choiceCmpCallback2.onReceiveUSRegulationsConsent(uSRegulationData);
            i8 = I.f8278a;
        }
        if (i8 == null && (choiceCmpCallback = this.f38049a.f38046c) != null) {
            choiceCmpCallback.onCmpError(ChoiceError.ERROR_WHILE_SAVING_CONSENT);
        }
        return I.f8278a;
    }
}
