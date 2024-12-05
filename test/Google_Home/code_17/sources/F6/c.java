package F6;

import O5.I;
import com.inmobi.cmp.core.model.mspa.USRegulationData;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes5.dex */
public final class c extends AbstractC3256z implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function1 f2829a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Function1 function1) {
        super(1);
        this.f2829a = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        this.f2829a.invoke((USRegulationData) obj);
        return I.f8278a;
    }
}
