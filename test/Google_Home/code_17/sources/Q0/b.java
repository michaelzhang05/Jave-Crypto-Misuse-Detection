package Q0;

import J0.InterfaceC1288x;
import Q0.d;
import org.json.JSONObject;

/* loaded from: classes3.dex */
class b implements h {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static d b(InterfaceC1288x interfaceC1288x) {
        return new d(interfaceC1288x.a() + 3600000, new d.b(8, 4), new d.a(true, false, false), 0, 3600, 10.0d, 1.2d, 60);
    }

    @Override // Q0.h
    public d a(InterfaceC1288x interfaceC1288x, JSONObject jSONObject) {
        return b(interfaceC1288x);
    }
}
