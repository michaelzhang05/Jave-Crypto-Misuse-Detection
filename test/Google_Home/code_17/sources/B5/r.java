package B5;

import O5.I;
import a6.InterfaceC1668n;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes5.dex */
public final class r extends AbstractC3256z implements InterfaceC1668n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s f968a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(s sVar) {
        super(2);
        this.f968a = sVar;
    }

    @Override // a6.InterfaceC1668n
    public Object invoke(Object obj, Object obj2) {
        E6.l lVar;
        Map map;
        int intValue = ((Number) obj).intValue();
        ((Boolean) obj2).booleanValue();
        E6.e eVar = this.f968a.f976a;
        if (eVar == null || (map = eVar.f2638i) == null) {
            lVar = null;
        } else {
            lVar = (E6.l) map.get(String.valueOf(intValue));
        }
        if (lVar != null && s.e(this.f968a, lVar)) {
            this.f968a.f1001z.unset(intValue);
        }
        return I.f8278a;
    }
}
