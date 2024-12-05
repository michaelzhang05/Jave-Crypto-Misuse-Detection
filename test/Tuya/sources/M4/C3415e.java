package m4;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import k4.C3122b;
import k4.InterfaceC3121a;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: m4.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3415e {

    /* renamed from: a, reason: collision with root package name */
    private final List f35446a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f35447b;

    public C3415e(C3122b schemaRegistry) {
        AbstractC3159y.i(schemaRegistry, "schemaRegistry");
        this.f35446a = k4.h.g(schemaRegistry.b().a(), schemaRegistry.b().b());
        Map a8 = schemaRegistry.a();
        LinkedHashMap linkedHashMap = new LinkedHashMap(M5.Q.d(a8.size()));
        for (Map.Entry entry : a8.entrySet()) {
            linkedHashMap.put(entry.getKey(), k4.h.g(((InterfaceC3121a) entry.getValue()).a(), (String) entry.getKey()));
        }
        this.f35447b = linkedHashMap;
    }

    public final List a(String str) {
        if (str != null) {
            return (List) this.f35447b.get(str);
        }
        return this.f35446a;
    }
}
