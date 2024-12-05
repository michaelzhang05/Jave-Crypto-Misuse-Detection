package y5;

import L5.I;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes5.dex */
public final class r extends AbstractC3160z implements X5.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s f39924a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(s sVar) {
        super(2);
        this.f39924a = sVar;
    }

    @Override // X5.n
    public Object invoke(Object obj, Object obj2) {
        B6.l lVar;
        Map map;
        int intValue = ((Number) obj).intValue();
        ((Boolean) obj2).booleanValue();
        B6.e eVar = this.f39924a.f39932a;
        if (eVar == null || (map = eVar.f1043i) == null) {
            lVar = null;
        } else {
            lVar = (B6.l) map.get(String.valueOf(intValue));
        }
        if (lVar != null && s.e(this.f39924a, lVar)) {
            this.f39924a.f39957z.unset(intValue);
        }
        return I.f6487a;
    }
}
