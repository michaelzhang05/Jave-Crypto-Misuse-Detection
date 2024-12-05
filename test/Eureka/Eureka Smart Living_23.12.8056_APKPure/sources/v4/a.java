package v4;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;

/* loaded from: classes.dex */
public class a extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    private List f9666a;

    /* renamed from: b, reason: collision with root package name */
    private String f9667b;

    /* renamed from: c, reason: collision with root package name */
    private org.apache.cordova.a f9668c;

    public a(org.apache.cordova.a aVar) {
        this.f9668c = aVar;
    }

    public List a() {
        return this.f9666a;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Bundle resultExtras = getResultExtras(true);
        if (resultExtras.containsKey("android.speech.extra.LANGUAGE_PREFERENCE")) {
            this.f9667b = resultExtras.getString("android.speech.extra.LANGUAGE_PREFERENCE");
        }
        if (!resultExtras.containsKey("android.speech.extra.SUPPORTED_LANGUAGES")) {
            this.f9668c.error("Could not get list of languages");
            return;
        }
        this.f9666a = resultExtras.getStringArrayList("android.speech.extra.SUPPORTED_LANGUAGES");
        this.f9668c.success(new JSONArray((Collection) this.f9666a));
    }
}
