package O0;

import H0.InterfaceC1186u;
import O0.d;
import org.json.JSONObject;

/* loaded from: classes3.dex */
class b implements h {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static d b(InterfaceC1186u interfaceC1186u) {
        return new d(interfaceC1186u.a() + 3600000, new d.b(8, 4), new d.a(true, false, false), 0, 3600, 10.0d, 1.2d, 60);
    }

    @Override // O0.h
    public d a(InterfaceC1186u interfaceC1186u, JSONObject jSONObject) {
        return b(interfaceC1186u);
    }
}
