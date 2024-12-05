package D5;

import B5.s;
import E6.l;
import O5.I;
import a6.InterfaceC1668n;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes5.dex */
public final class i extends AbstractC3256z implements InterfaceC1668n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s f2232a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(s sVar) {
        super(2);
        this.f2232a = sVar;
    }

    @Override // a6.InterfaceC1668n
    public Object invoke(Object obj, Object obj2) {
        l lVar;
        Map map;
        int intValue = ((Number) obj).intValue();
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        E6.e eVar = this.f2232a.f976a;
        if (eVar == null || (map = eVar.f2638i) == null) {
            lVar = null;
        } else {
            lVar = (l) map.get(String.valueOf(intValue));
        }
        if (lVar == null || (booleanValue && lVar.f2649d.isEmpty())) {
            this.f2232a.f1001z.unset(intValue);
        }
        return I.f8278a;
    }
}
