package B5;

import O5.I;
import a6.InterfaceC1668n;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes5.dex */
public final class q extends AbstractC3256z implements InterfaceC1668n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s f967a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(s sVar) {
        super(2);
        this.f967a = sVar;
    }

    @Override // a6.InterfaceC1668n
    public Object invoke(Object obj, Object obj2) {
        E6.l lVar;
        Map map;
        int intValue = ((Number) obj).intValue();
        ((Boolean) obj2).booleanValue();
        E6.e eVar = this.f967a.f976a;
        if (eVar == null || (map = eVar.f2638i) == null) {
            lVar = null;
        } else {
            lVar = (E6.l) map.get(String.valueOf(intValue));
        }
        if (lVar != null && !s.e(this.f967a, lVar) && !s.c(this.f967a, lVar) && s.g(this.f967a, lVar)) {
            this.f967a.f971C.set(intValue);
        }
        return I.f8278a;
    }
}
