package p6;

import n6.EnumC3487a;
import o6.C3688B;
import o6.InterfaceC3698L;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class y extends C3688B implements InterfaceC3698L {
    public y(int i8) {
        super(1, Integer.MAX_VALUE, EnumC3487a.DROP_OLDEST);
        e(Integer.valueOf(i8));
    }

    @Override // o6.InterfaceC3698L
    /* renamed from: Y, reason: merged with bridge method [inline-methods] */
    public Integer getValue() {
        Integer valueOf;
        synchronized (this) {
            valueOf = Integer.valueOf(((Number) L()).intValue());
        }
        return valueOf;
    }

    public final boolean Z(int i8) {
        boolean e8;
        synchronized (this) {
            e8 = e(Integer.valueOf(((Number) L()).intValue() + i8));
        }
        return e8;
    }
}
