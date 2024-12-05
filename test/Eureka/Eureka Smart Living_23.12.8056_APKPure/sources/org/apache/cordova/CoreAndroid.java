package org.apache.cordova;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.telephony.TelephonyManager;
import com.rjfun.cordova.plugin.nativeaudio.NativeAudio;
import java.util.HashMap;
import m5.k;
import m5.o;
import org.apache.cordova.f;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class CoreAndroid extends org.apache.cordova.b {
    public static final String PLUGIN_NAME = "CoreAndroid";

    /* renamed from: c, reason: collision with root package name */
    private BroadcastReceiver f8331c;

    /* renamed from: d, reason: collision with root package name */
    private org.apache.cordova.a f8332d;

    /* renamed from: e, reason: collision with root package name */
    private f f8333e;

    /* renamed from: f, reason: collision with root package name */
    private f f8334f;

    /* renamed from: g, reason: collision with root package name */
    private final Object f8335g = new Object();

    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CoreAndroid.this.webView.getPluginManager().v("spinner", NativeAudio.STOP);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CoreAndroid.this.webView.clearCache();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CoreAndroid.this.webView.clearHistory();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CoreAndroid.this.webView.backHistory();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class e extends BroadcastReceiver {
        e() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            org.apache.cordova.e pluginManager;
            String str;
            if (intent != null && intent.getAction().equals("android.intent.action.PHONE_STATE") && intent.hasExtra("state")) {
                String stringExtra = intent.getStringExtra("state");
                if (stringExtra.equals(TelephonyManager.EXTRA_STATE_RINGING)) {
                    o.e("CordovaApp", "Telephone RINGING");
                    pluginManager = CoreAndroid.this.webView.getPluginManager();
                    str = "ringing";
                } else if (stringExtra.equals(TelephonyManager.EXTRA_STATE_OFFHOOK)) {
                    o.e("CordovaApp", "Telephone OFFHOOK");
                    pluginManager = CoreAndroid.this.webView.getPluginManager();
                    str = "offhook";
                } else {
                    if (!stringExtra.equals(TelephonyManager.EXTRA_STATE_IDLE)) {
                        return;
                    }
                    o.e("CordovaApp", "Telephone IDLE");
                    pluginManager = CoreAndroid.this.webView.getPluginManager();
                    str = "idle";
                }
                pluginManager.v("telephone", str);
            }
        }
    }

    private void a() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.PHONE_STATE");
        this.f8331c = new e();
        this.webView.getContext().registerReceiver(this.f8331c, intentFilter);
    }

    private void b(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("action", str);
        } catch (JSONException e6) {
            o.d("CordovaApp", "Failed to create event message", e6);
        }
        f fVar = new f(f.a.OK, jSONObject);
        if (this.f8332d != null) {
            c(fVar);
            return;
        }
        o.e("CordovaApp", "Request to send event before messageChannel initialised: " + str);
        if ("pause".equals(str)) {
            this.f8334f = fVar;
        } else if ("resume".equals(str)) {
            this.f8334f = null;
        }
    }

    private void c(f fVar) {
        fVar.h(true);
        org.apache.cordova.a aVar = this.f8332d;
        if (aVar != null) {
            aVar.sendPluginResult(fVar);
        }
    }

    public static Object getBuildConfigValue(Context context, String str) {
        String str2;
        try {
            return Class.forName(context.getClass().getPackage().getName() + ".BuildConfig").getField(str).get(null);
        } catch (ClassNotFoundException e6) {
            e = e6;
            str2 = "Unable to get the BuildConfig, is this built with ANT?";
            o.a("CordovaApp", str2);
            e.printStackTrace();
            return null;
        } catch (IllegalAccessException e7) {
            e = e7;
            str2 = "Illegal Access Exception: Let's print a stack trace.";
            o.a("CordovaApp", str2);
            e.printStackTrace();
            return null;
        } catch (NoSuchFieldException unused) {
            o.a("CordovaApp", str + " is not a valid field. Check your build.gradle");
            return null;
        } catch (NullPointerException e8) {
            e = e8;
            str2 = "Null Pointer Exception: Let's print a stack trace.";
            o.a("CordovaApp", str2);
            e.printStackTrace();
            return null;
        }
    }

    public void backHistory() {
        this.f8371cordova.getActivity().runOnUiThread(new d());
    }

    public void clearCache() {
        this.f8371cordova.getActivity().runOnUiThread(new b());
    }

    public void clearHistory() {
        this.f8371cordova.getActivity().runOnUiThread(new c());
    }

    @Override // org.apache.cordova.b
    public boolean execute(String str, JSONArray jSONArray, org.apache.cordova.a aVar) {
        f.a aVar2 = f.a.OK;
        try {
            if (str.equals("clearCache")) {
                clearCache();
            } else if (str.equals("show")) {
                this.f8371cordova.getActivity().runOnUiThread(new a());
            } else if (str.equals("loadUrl")) {
                loadUrl(jSONArray.getString(0), jSONArray.optJSONObject(1));
            } else if (!str.equals("cancelLoadUrl")) {
                if (str.equals("clearHistory")) {
                    clearHistory();
                } else if (str.equals("backHistory")) {
                    backHistory();
                } else if (str.equals("overrideButton")) {
                    overrideButton(jSONArray.getString(0), jSONArray.getBoolean(1));
                } else if (str.equals("overrideBackbutton")) {
                    overrideBackbutton(jSONArray.getBoolean(0));
                } else if (str.equals("exitApp")) {
                    exitApp();
                } else if (str.equals("messageChannel")) {
                    synchronized (this.f8335g) {
                        this.f8332d = aVar;
                        f fVar = this.f8334f;
                        if (fVar != null) {
                            c(fVar);
                            this.f8334f = null;
                        }
                        f fVar2 = this.f8333e;
                        if (fVar2 != null) {
                            c(fVar2);
                            this.f8333e = null;
                        }
                    }
                    return true;
                }
            }
            aVar.sendPluginResult(new f(aVar2, ""));
            return true;
        } catch (JSONException unused) {
            aVar.sendPluginResult(new f(f.a.JSON_EXCEPTION));
            return false;
        }
    }

    public void exitApp() {
        this.webView.getPluginManager().v("exit", null);
    }

    public void fireJavascriptEvent(String str) {
        b(str);
    }

    public boolean isBackbuttonOverridden() {
        return this.webView.isButtonPlumbedToJs(4);
    }

    public void loadUrl(String str, JSONObject jSONObject) {
        boolean z5;
        boolean z6;
        Object obj;
        o.a("App", "App.loadUrl(" + str + "," + jSONObject + ")");
        HashMap hashMap = new HashMap();
        int i6 = 0;
        if (jSONObject != null) {
            JSONArray names = jSONObject.names();
            int i7 = 0;
            z5 = false;
            z6 = false;
            while (i6 < names.length()) {
                String string = names.getString(i6);
                if (string.equals("wait")) {
                    i7 = jSONObject.getInt(string);
                } else if (string.equalsIgnoreCase("openexternal")) {
                    z5 = jSONObject.getBoolean(string);
                } else if (string.equalsIgnoreCase("clearhistory")) {
                    z6 = jSONObject.getBoolean(string);
                } else {
                    Object obj2 = jSONObject.get(string);
                    if (obj2 != null) {
                        if (obj2.getClass().equals(String.class)) {
                            obj = (String) obj2;
                        } else if (obj2.getClass().equals(Boolean.class)) {
                            obj = (Boolean) obj2;
                        } else if (obj2.getClass().equals(Integer.class)) {
                            obj = (Integer) obj2;
                        }
                        hashMap.put(string, obj);
                    }
                }
                i6++;
            }
            i6 = i7;
        } else {
            z5 = false;
            z6 = false;
        }
        if (i6 > 0) {
            try {
                synchronized (this) {
                    wait(i6);
                }
            } catch (InterruptedException e6) {
                e6.printStackTrace();
            }
        }
        this.webView.showWebPage(str, z5, z6, hashMap);
    }

    @Override // org.apache.cordova.b
    public void onDestroy() {
        this.webView.getContext().unregisterReceiver(this.f8331c);
    }

    public void overrideBackbutton(boolean z5) {
        o.e("App", "WARNING: Back Button Default Behavior will be overridden.  The backbutton event will be fired!");
        this.webView.setButtonPlumbedToJs(4, z5);
    }

    public void overrideButton(String str, boolean z5) {
        k kVar;
        int i6;
        o.e("App", "WARNING: Volume Button Default Behavior will be overridden.  The volume event will be fired!");
        if (str.equals("volumeup")) {
            kVar = this.webView;
            i6 = 24;
        } else if (str.equals("volumedown")) {
            kVar = this.webView;
            i6 = 25;
        } else {
            if (!str.equals("menubutton")) {
                return;
            }
            kVar = this.webView;
            i6 = 82;
        }
        kVar.setButtonPlumbedToJs(i6, z5);
    }

    @Override // org.apache.cordova.b
    public void pluginInitialize() {
        a();
    }

    public void sendResumeEvent(f fVar) {
        synchronized (this.f8335g) {
            if (this.f8332d != null) {
                c(fVar);
            } else {
                this.f8333e = fVar;
            }
        }
    }
}
