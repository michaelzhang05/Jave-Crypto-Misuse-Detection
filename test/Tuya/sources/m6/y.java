package m6;

import k6.EnumC3132a;
import l6.C3339A;
import l6.InterfaceC3349K;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class y extends C3339A implements InterfaceC3349K {
    public y(int i8) {
        super(1, Integer.MAX_VALUE, EnumC3132a.DROP_OLDEST);
        d(Integer.valueOf(i8));
    }

    @Override // l6.InterfaceC3349K
    /* renamed from: Y, reason: merged with bridge method [inline-methods] */
    public Integer getValue() {
        Integer valueOf;
        synchronized (this) {
            valueOf = Integer.valueOf(((Number) L()).intValue());
        }
        return valueOf;
    }

    public final boolean Z(int i8) {
        boolean d8;
        synchronized (this) {
            d8 = d(Integer.valueOf(((Number) L()).intValue() + i8));
        }
        return d8;
    }
}
