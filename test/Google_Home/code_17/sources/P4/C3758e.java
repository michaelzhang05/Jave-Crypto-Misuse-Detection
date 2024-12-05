package p4;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3255y;
import n4.C3477b;
import n4.InterfaceC3476a;

/* renamed from: p4.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3758e {

    /* renamed from: a, reason: collision with root package name */
    private final List f37472a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f37473b;

    public C3758e(C3477b schemaRegistry) {
        AbstractC3255y.i(schemaRegistry, "schemaRegistry");
        this.f37472a = n4.h.g(schemaRegistry.b().a(), schemaRegistry.b().b());
        Map a8 = schemaRegistry.a();
        LinkedHashMap linkedHashMap = new LinkedHashMap(P5.Q.d(a8.size()));
        for (Map.Entry entry : a8.entrySet()) {
            linkedHashMap.put(entry.getKey(), n4.h.g(((InterfaceC3476a) entry.getValue()).a(), (String) entry.getKey()));
        }
        this.f37473b = linkedHashMap;
    }

    public final List a(String str) {
        if (str != null) {
            return (List) this.f37473b.get(str);
        }
        return this.f37472a;
    }
}
