package Q0;

import J0.InterfaceC1288x;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC1288x f9120a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(InterfaceC1288x interfaceC1288x) {
        this.f9120a = interfaceC1288x;
    }

    private static h a(int i8) {
        if (i8 != 3) {
            G0.h.f().d("Could not determine SettingsJsonTransform for settings version " + i8 + ". Using default settings values.");
            return new b();
        }
        return new l();
    }

    public d b(JSONObject jSONObject) {
        return a(jSONObject.getInt("settings_version")).a(this.f9120a, jSONObject);
    }
}
