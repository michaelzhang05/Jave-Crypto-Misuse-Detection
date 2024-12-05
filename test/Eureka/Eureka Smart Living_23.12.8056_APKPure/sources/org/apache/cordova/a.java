package org.apache.cordova;

import m5.k;
import m5.o;
import org.apache.cordova.f;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private String f8365a;

    /* renamed from: b, reason: collision with root package name */
    private k f8366b;

    /* renamed from: c, reason: collision with root package name */
    protected boolean f8367c;

    /* renamed from: d, reason: collision with root package name */
    private int f8368d;

    public a(String str, k kVar) {
        this.f8365a = str;
        this.f8366b = kVar;
    }

    public void error(int i6) {
        sendPluginResult(new f(f.a.ERROR, i6));
    }

    public String getCallbackId() {
        return this.f8365a;
    }

    public boolean isChangingThreads() {
        return this.f8368d > 0;
    }

    public boolean isFinished() {
        return this.f8367c;
    }

    public void sendPluginResult(f fVar) {
        synchronized (this) {
            if (!this.f8367c) {
                this.f8367c = !fVar.a();
                this.f8366b.sendPluginResult(fVar, this.f8365a);
                return;
            }
            o.g("CordovaPlugin", "Attempted to send a second callback for ID: " + this.f8365a + "\nResult was: " + fVar.b());
        }
    }

    public void success() {
        sendPluginResult(new f(f.a.OK));
    }

    public void error(String str) {
        sendPluginResult(new f(f.a.ERROR, str));
    }

    public void success(int i6) {
        sendPluginResult(new f(f.a.OK, i6));
    }

    public void error(JSONObject jSONObject) {
        sendPluginResult(new f(f.a.ERROR, jSONObject));
    }

    public void success(String str) {
        sendPluginResult(new f(f.a.OK, str));
    }

    public void success(JSONArray jSONArray) {
        sendPluginResult(new f(f.a.OK, jSONArray));
    }

    public void success(JSONObject jSONObject) {
        sendPluginResult(new f(f.a.OK, jSONObject));
    }

    public void success(byte[] bArr) {
        sendPluginResult(new f(f.a.OK, bArr));
    }
}
