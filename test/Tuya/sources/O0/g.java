package O0;

import H0.InterfaceC1186u;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC1186u f7721a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(InterfaceC1186u interfaceC1186u) {
        this.f7721a = interfaceC1186u;
    }

    private static h a(int i8) {
        if (i8 != 3) {
            E0.f.f().d("Could not determine SettingsJsonTransform for settings version " + i8 + ". Using default settings values.");
            return new b();
        }
        return new l();
    }

    public d b(JSONObject jSONObject) {
        return a(jSONObject.getInt("settings_version")).a(this.f7721a, jSONObject);
    }
}
