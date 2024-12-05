package o2;

import P5.AbstractC1378t;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public final class m implements InterfaceC3518e {

    /* renamed from: a, reason: collision with root package name */
    private final Map f35865a = new LinkedHashMap();

    @Override // o2.InterfaceC3518e
    public Object a(C3514a c3514a, S5.d dVar) {
        Object obj = this.f35865a.get(c3514a);
        if (obj == null) {
            return AbstractC1378t.m();
        }
        return obj;
    }

    @Override // o2.InterfaceC3518e
    public void b(C3514a bin, List accountRanges) {
        AbstractC3255y.i(bin, "bin");
        AbstractC3255y.i(accountRanges, "accountRanges");
        this.f35865a.put(bin, accountRanges);
    }

    @Override // o2.InterfaceC3518e
    public Object c(C3514a c3514a, S5.d dVar) {
        return kotlin.coroutines.jvm.internal.b.a(this.f35865a.containsKey(c3514a));
    }
}
