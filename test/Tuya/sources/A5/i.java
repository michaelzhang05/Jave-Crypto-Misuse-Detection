package A5;

import B6.l;
import L5.I;
import X5.n;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3160z;
import y5.s;

/* loaded from: classes5.dex */
public final class i extends AbstractC3160z implements n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s f510a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(s sVar) {
        super(2);
        this.f510a = sVar;
    }

    @Override // X5.n
    public Object invoke(Object obj, Object obj2) {
        l lVar;
        Map map;
        int intValue = ((Number) obj).intValue();
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        B6.e eVar = this.f510a.f39932a;
        if (eVar == null || (map = eVar.f1043i) == null) {
            lVar = null;
        } else {
            lVar = (l) map.get(String.valueOf(intValue));
        }
        if (lVar == null || (booleanValue && lVar.f1054d.isEmpty())) {
            this.f510a.f39957z.unset(intValue);
        }
        return I.f6487a;
    }
}
