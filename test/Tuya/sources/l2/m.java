package l2;

import M5.AbstractC1246t;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class m implements InterfaceC3170e {

    /* renamed from: a, reason: collision with root package name */
    private final Map f33864a = new LinkedHashMap();

    @Override // l2.InterfaceC3170e
    public void a(C3166a bin, List accountRanges) {
        AbstractC3159y.i(bin, "bin");
        AbstractC3159y.i(accountRanges, "accountRanges");
        this.f33864a.put(bin, accountRanges);
    }

    @Override // l2.InterfaceC3170e
    public Object b(C3166a c3166a, P5.d dVar) {
        return kotlin.coroutines.jvm.internal.b.a(this.f33864a.containsKey(c3166a));
    }

    @Override // l2.InterfaceC3170e
    public Object c(C3166a c3166a, P5.d dVar) {
        Object obj = this.f33864a.get(c3166a);
        if (obj == null) {
            return AbstractC1246t.m();
        }
        return obj;
    }
}
