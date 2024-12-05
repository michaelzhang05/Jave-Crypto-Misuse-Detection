package O0;

import H0.InterfaceC1186u;
import O0.d;
import org.json.JSONObject;

/* loaded from: classes3.dex */
class l implements h {
    private static d.a b(JSONObject jSONObject) {
        return new d.a(jSONObject.optBoolean("collect_reports", true), jSONObject.optBoolean("collect_anrs", false), jSONObject.optBoolean("collect_build_ids", false));
    }

    private static d.b c(JSONObject jSONObject) {
        return new d.b(jSONObject.optInt("max_custom_exception_events", 8), 4);
    }

    private static long d(InterfaceC1186u interfaceC1186u, long j8, JSONObject jSONObject) {
        if (jSONObject.has("expires_at")) {
            return jSONObject.optLong("expires_at");
        }
        return interfaceC1186u.a() + (j8 * 1000);
    }

    @Override // O0.h
    public d a(InterfaceC1186u interfaceC1186u, JSONObject jSONObject) {
        d.b c8;
        int optInt = jSONObject.optInt("settings_version", 0);
        int optInt2 = jSONObject.optInt("cache_duration", 3600);
        double optDouble = jSONObject.optDouble("on_demand_upload_rate_per_minute", 10.0d);
        double optDouble2 = jSONObject.optDouble("on_demand_backoff_base", 1.2d);
        int optInt3 = jSONObject.optInt("on_demand_backoff_step_duration_seconds", 60);
        if (jSONObject.has("session")) {
            c8 = c(jSONObject.getJSONObject("session"));
        } else {
            c8 = c(new JSONObject());
        }
        return new d(d(interfaceC1186u, optInt2, jSONObject), c8, b(jSONObject.getJSONObject("features")), optInt, optInt2, optDouble, optDouble2, optInt3);
    }
}
