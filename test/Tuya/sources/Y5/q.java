package y5;

import L5.I;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes5.dex */
public final class q extends AbstractC3160z implements X5.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s f39923a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(s sVar) {
        super(2);
        this.f39923a = sVar;
    }

    @Override // X5.n
    public Object invoke(Object obj, Object obj2) {
        B6.l lVar;
        Map map;
        int intValue = ((Number) obj).intValue();
        ((Boolean) obj2).booleanValue();
        B6.e eVar = this.f39923a.f39932a;
        if (eVar == null || (map = eVar.f1043i) == null) {
            lVar = null;
        } else {
            lVar = (B6.l) map.get(String.valueOf(intValue));
        }
        if (lVar != null && !s.e(this.f39923a, lVar) && !s.c(this.f39923a, lVar) && s.g(this.f39923a, lVar)) {
            this.f39923a.f39927C.set(intValue);
        }
        return I.f6487a;
    }
}