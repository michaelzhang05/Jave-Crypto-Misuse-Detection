package org.apache.cordova;

import java.util.ArrayList;
import m5.o;
import org.apache.cordova.f;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ResumeCallback extends a {

    /* renamed from: e, reason: collision with root package name */
    private final String f8362e;

    /* renamed from: f, reason: collision with root package name */
    private String f8363f;

    /* renamed from: g, reason: collision with root package name */
    private e f8364g;

    public ResumeCallback(String str, e eVar) {
        super("resumecallback", null);
        this.f8362e = "CordovaResumeCallback";
        this.f8363f = str;
        this.f8364g = eVar;
    }

    @Override // org.apache.cordova.a
    public void sendPluginResult(f fVar) {
        synchronized (this) {
            if (this.f8367c) {
                o.g("CordovaResumeCallback", this.f8363f + " attempted to send a second callback to ResumeCallback\nResult was: " + fVar.b());
                return;
            }
            this.f8367c = true;
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("pluginServiceName", this.f8363f);
                jSONObject2.put("pluginStatus", f.f8431g[fVar.f()]);
                jSONObject.put("action", "resume");
                jSONObject.put("pendingResult", jSONObject2);
            } catch (JSONException unused) {
                o.c("CordovaResumeCallback", "Unable to create resume object for Activity Result");
            }
            f.a aVar = f.a.OK;
            f fVar2 = new f(aVar, jSONObject);
            ArrayList arrayList = new ArrayList();
            arrayList.add(fVar2);
            arrayList.add(fVar);
            ((CoreAndroid) this.f8364g.f(CoreAndroid.PLUGIN_NAME)).sendResumeEvent(new f(aVar, arrayList));
        }
    }
}
