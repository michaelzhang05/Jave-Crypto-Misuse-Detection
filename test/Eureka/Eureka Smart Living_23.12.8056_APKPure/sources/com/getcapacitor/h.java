package com.getcapacitor;

import a1.a;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.fragment.app.Fragment;
import com.getcapacitor.cordova.MockCordovaInterfaceImpl;
import com.getcapacitor.cordova.MockCordovaWebViewImpl;
import com.getcapacitor.plugin.CapacitorCookies;
import com.getcapacitor.plugin.CapacitorHttp;
import java.io.File;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;

/* loaded from: classes.dex */
public class h {
    private List A;

    /* renamed from: a, reason: collision with root package name */
    private c0 f4389a;

    /* renamed from: b, reason: collision with root package name */
    private final androidx.appcompat.app.c f4390b;

    /* renamed from: c, reason: collision with root package name */
    private final Fragment f4391c;

    /* renamed from: d, reason: collision with root package name */
    private g1 f4392d;

    /* renamed from: e, reason: collision with root package name */
    private String f4393e;

    /* renamed from: f, reason: collision with root package name */
    private String f4394f;

    /* renamed from: g, reason: collision with root package name */
    private String f4395g;

    /* renamed from: h, reason: collision with root package name */
    private a1.a f4396h;

    /* renamed from: i, reason: collision with root package name */
    private Set f4397i;

    /* renamed from: j, reason: collision with root package name */
    private ArrayList f4398j;

    /* renamed from: k, reason: collision with root package name */
    private final WebView f4399k;

    /* renamed from: l, reason: collision with root package name */
    public final MockCordovaInterfaceImpl f4400l;

    /* renamed from: m, reason: collision with root package name */
    private m5.k f4401m;

    /* renamed from: n, reason: collision with root package name */
    private m5.j f4402n;

    /* renamed from: o, reason: collision with root package name */
    private b0 f4403o;

    /* renamed from: p, reason: collision with root package name */
    private b f4404p;

    /* renamed from: q, reason: collision with root package name */
    private final p0 f4405q;

    /* renamed from: r, reason: collision with root package name */
    private final HandlerThread f4406r;

    /* renamed from: s, reason: collision with root package name */
    private Handler f4407s;

    /* renamed from: t, reason: collision with root package name */
    private final List f4408t;

    /* renamed from: u, reason: collision with root package name */
    private final List f4409u;

    /* renamed from: v, reason: collision with root package name */
    private Map f4410v;

    /* renamed from: w, reason: collision with root package name */
    private Map f4411w;

    /* renamed from: x, reason: collision with root package name */
    private Map f4412x;

    /* renamed from: y, reason: collision with root package name */
    private v0 f4413y;

    /* renamed from: z, reason: collision with root package name */
    private Uri f4414z;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: e, reason: collision with root package name */
        private androidx.appcompat.app.c f4419e;

        /* renamed from: f, reason: collision with root package name */
        private Fragment f4420f;

        /* renamed from: a, reason: collision with root package name */
        private Bundle f4415a = null;

        /* renamed from: b, reason: collision with root package name */
        private c0 f4416b = null;

        /* renamed from: c, reason: collision with root package name */
        private List f4417c = new ArrayList();

        /* renamed from: d, reason: collision with root package name */
        private List f4418d = new ArrayList();

        /* renamed from: g, reason: collision with root package name */
        private final List f4421g = new ArrayList();

        public a(androidx.appcompat.app.c cVar) {
            this.f4419e = cVar;
        }

        public a a(Class cls) {
            this.f4417c.add(cls);
            return this;
        }

        public a b(List list) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                a((Class) it.next());
            }
            return this;
        }

        public h c() {
            m5.d dVar = new m5.d();
            dVar.e(this.f4419e.getApplicationContext());
            m5.j b6 = dVar.b();
            b6.e(this.f4419e.getIntent().getExtras());
            ArrayList a6 = dVar.a();
            MockCordovaInterfaceImpl mockCordovaInterfaceImpl = new MockCordovaInterfaceImpl(this.f4419e);
            Bundle bundle = this.f4415a;
            if (bundle != null) {
                mockCordovaInterfaceImpl.restoreInstanceState(bundle);
            }
            Fragment fragment = this.f4420f;
            WebView webView = (WebView) (fragment != null ? fragment.W().findViewById(u0.a.f9372a) : this.f4419e.findViewById(u0.a.f9372a));
            MockCordovaWebViewImpl mockCordovaWebViewImpl = new MockCordovaWebViewImpl(this.f4419e.getApplicationContext());
            mockCordovaWebViewImpl.init(mockCordovaInterfaceImpl, a6, b6, webView);
            org.apache.cordova.e pluginManager = mockCordovaWebViewImpl.getPluginManager();
            mockCordovaInterfaceImpl.onCordovaInit(pluginManager);
            h hVar = new h(this.f4419e, null, this.f4420f, webView, this.f4417c, this.f4418d, mockCordovaInterfaceImpl, pluginManager, b6, this.f4416b);
            if (webView instanceof CapacitorWebView) {
                ((CapacitorWebView) webView).setBridge(hVar);
            }
            hVar.w0(mockCordovaWebViewImpl);
            hVar.A0(this.f4421g);
            hVar.y0(null);
            Bundle bundle2 = this.f4415a;
            if (bundle2 != null) {
                hVar.r0(bundle2);
            }
            return hVar;
        }

        public a d(c0 c0Var) {
            this.f4416b = c0Var;
            return this;
        }

        public a e(Bundle bundle) {
            this.f4415a = bundle;
            return this;
        }
    }

    private h(androidx.appcompat.app.c cVar, e1 e1Var, Fragment fragment, WebView webView, List list, List list2, MockCordovaInterfaceImpl mockCordovaInterfaceImpl, org.apache.cordova.e eVar, m5.j jVar, c0 c0Var) {
        this.f4397i = new HashSet();
        this.f4398j = new ArrayList();
        HandlerThread handlerThread = new HandlerThread("CapacitorPlugins");
        this.f4406r = handlerThread;
        this.f4407s = null;
        this.f4410v = new HashMap();
        this.f4411w = new HashMap();
        this.f4412x = new HashMap();
        this.A = new ArrayList();
        this.f4404p = new b();
        this.f4390b = cVar;
        this.f4391c = fragment;
        this.f4399k = webView;
        this.f4403o = new b0(this);
        this.f4408t = list;
        this.f4409u = list2;
        this.f4400l = mockCordovaInterfaceImpl;
        this.f4402n = jVar;
        handlerThread.start();
        this.f4407s = new Handler(handlerThread.getLooper());
        c0Var = c0Var == null ? c0.w(j()) : c0Var;
        this.f4389a = c0Var;
        l0.h(c0Var);
        J();
        v0();
        this.f4405q = new p0(this, webView, eVar);
        this.f4414z = cVar.getIntent().getData();
        k0();
        U();
    }

    private void J() {
        String str;
        String n6;
        WebSettings settings = this.f4399k.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setGeolocationEnabled(true);
        settings.setDatabaseEnabled(true);
        settings.setMediaPlaybackRequiresUserGesture(false);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        if (this.f4389a.s()) {
            settings.setMixedContentMode(0);
        }
        String e6 = this.f4389a.e();
        if (e6 != null) {
            settings.setUserAgentString(settings.getUserAgentString() + " " + e6);
        }
        String k6 = this.f4389a.k();
        if (k6 != null) {
            settings.setUserAgentString(k6);
        }
        String f6 = this.f4389a.f();
        if (f6 != null) {
            try {
                this.f4399k.setBackgroundColor(a1.e.a(f6));
            } catch (IllegalArgumentException unused) {
                l0.a("WebView background color not applied");
            }
        }
        if (this.f4389a.p()) {
            this.f4399k.requestFocusFromTouch();
        }
        WebView.setWebContentsDebuggingEnabled(this.f4389a.u());
        this.f4395g = F();
        String q6 = q();
        this.f4398j.add(q6);
        String D = D();
        String str2 = D + "://" + q6;
        this.f4393e = str2;
        if (this.f4395g == null) {
            this.f4394f = str2;
            if (!D.equals("http") && !D.equals("https")) {
                str = this.f4394f + "/";
            }
            n6 = this.f4389a.n();
            if (n6 != null || n6.trim().isEmpty()) {
            }
            this.f4394f += n6;
            return;
        }
        try {
            this.f4398j.add(new URL(this.f4395g).getAuthority());
            str = this.f4395g;
            this.f4393e = str;
        } catch (Exception e7) {
            l0.c("Provided server url is invalid: " + e7.getMessage());
            return;
        }
        this.f4394f = str;
        n6 = this.f4389a.n();
        if (n6 != null) {
        }
    }

    private boolean N() {
        String str;
        String str2;
        PackageInfo a6;
        SharedPreferences sharedPreferences = o().getSharedPreferences(com.getcapacitor.plugin.WebView.WEBVIEW_PREFS_NAME, 0);
        String string = sharedPreferences.getString("lastBinaryVersionCode", null);
        String string2 = sharedPreferences.getString("lastBinaryVersionName", null);
        try {
            a6 = a1.b.a(o().getPackageManager(), o().getPackageName());
            str = Integer.toString((int) androidx.core.content.pm.f.a(a6));
        } catch (Exception e6) {
            e = e6;
            str = "";
        }
        try {
            str2 = a6.versionName;
        } catch (Exception e7) {
            e = e7;
            l0.e("Unable to get package info", e);
            str2 = "";
            if (!str.equals(string)) {
            }
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putString("lastBinaryVersionCode", str);
            edit.putString("lastBinaryVersionName", str2);
            edit.putString(com.getcapacitor.plugin.WebView.CAP_SERVER_PATH, "");
            edit.apply();
            return true;
        }
        if (!str.equals(string) && str2.equals(string2)) {
            return false;
        }
        SharedPreferences.Editor edit2 = sharedPreferences.edit();
        edit2.putString("lastBinaryVersionCode", str);
        edit2.putString("lastBinaryVersionName", str2);
        edit2.putString(com.getcapacitor.plugin.WebView.CAP_SERVER_PATH, "");
        edit2.apply();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void O(x0 x0Var, String str, v0 v0Var) {
        try {
            x0Var.g(str, v0Var);
            if (v0Var.q()) {
                s0(v0Var);
            }
        } catch (f0 e6) {
            e = e6;
            l0.e("Unable to execute plugin method", e);
        } catch (y0 e7) {
            e = e7;
            l0.e("Unable to execute plugin method", e);
        } catch (Exception e8) {
            l0.e("Serious error executing plugin", e8);
            throw new RuntimeException(e8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void P(String str, ValueCallback valueCallback) {
        this.f4399k.evaluateJavascript(str, valueCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Q() {
        this.f4399k.loadUrl(this.f4394f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void R(String str) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void S(String str) {
    }

    private void U() {
        String string;
        g1 g1Var = new g1(this.f4390b, this, s(), this.f4398j, this.f4389a.o());
        this.f4392d = g1Var;
        g1Var.k("public");
        l0.a("Loading app at " + this.f4394f);
        this.f4399k.setWebChromeClient(new a0(this));
        this.f4399k.setWebViewClient(this.f4403o);
        if (!K() && !N() && (string = o().getSharedPreferences(com.getcapacitor.plugin.WebView.WEBVIEW_PREFS_NAME, 0).getString(com.getcapacitor.plugin.WebView.CAP_SERVER_PATH, null)) != null && !string.isEmpty() && new File(string).exists()) {
            z0(string);
        }
        if (!M()) {
            String p6 = p();
            if (p6 != null) {
                this.f4399k.loadUrl(p6);
                return;
            }
            l0.c("System WebView is not supported");
        }
        this.f4399k.loadUrl(this.f4394f);
    }

    private void V(Class cls) {
        l0.c("NativePlugin " + cls.getName() + " is invalid. Ensure the @CapacitorPlugin annotation exists on the plugin class and the class extends Plugin");
    }

    private void W(Class cls, Exception exc) {
        l0.e("NativePlugin " + cls.getName() + " failed to load", exc);
    }

    private String i0(Class cls) {
        String j02 = j0(cls);
        String simpleName = cls.getSimpleName();
        if (j02 == null) {
            return null;
        }
        if (j02.equals("")) {
            j02 = simpleName;
        }
        l0.a("Registering plugin instance: " + j02);
        return j02;
    }

    private String j0(Class cls) {
        v0.b bVar = (v0.b) cls.getAnnotation(v0.b.class);
        return bVar == null ? t(cls) : bVar.name();
    }

    private void k0() {
        m0(CapacitorCookies.class);
        m0(com.getcapacitor.plugin.WebView.class);
        m0(CapacitorHttp.class);
        Iterator it = this.f4408t.iterator();
        while (it.hasNext()) {
            m0((Class) it.next());
        }
        Iterator it2 = this.f4409u.iterator();
        while (it2.hasNext()) {
            n0((u0) it2.next());
        }
    }

    private i0 s() {
        try {
            return new i0(h0.i(this.f4390b, this.f4389a.r(), L()), h0.d(this.f4390b), h0.j(this.f4410v.values()), h0.e(this.f4390b), h0.f(this.f4390b), h0.g(this.f4390b), "window.WEBVIEW_SERVER_URL = '" + this.f4393e + "';");
        } catch (Exception e6) {
            l0.e("Unable to export Capacitor JS. App will not function!", e6);
            return null;
        }
    }

    private String t(Class cls) {
        q0 q0Var = (q0) cls.getAnnotation(q0.class);
        if (q0Var != null) {
            return q0Var.name();
        }
        l0.c("Plugin doesn't have the @CapacitorPlugin annotation. Please add it");
        return null;
    }

    private void v0() {
        Set set;
        String[] c6 = this.f4389a.c();
        String q6 = q();
        this.f4397i.add(D() + "://" + q6);
        if (F() != null) {
            this.f4397i.add(F());
        }
        if (c6 != null) {
            for (String str : c6) {
                if (str.startsWith("http")) {
                    set = this.f4397i;
                } else {
                    set = this.f4397i;
                    str = "https://" + str;
                }
                set.add(str);
            }
            this.f4398j.addAll(Arrays.asList(c6));
        }
        this.f4396h = a.c.b(c6);
    }

    public x0 A(int i6) {
        for (x0 x0Var : this.f4410v.values()) {
            v0.b e6 = x0Var.e();
            int i7 = 0;
            if (e6 == null) {
                q0 c6 = x0Var.c();
                if (c6 == null) {
                    continue;
                } else {
                    if (c6.permissionRequestCode() == i6) {
                        return x0Var;
                    }
                    int[] requestCodes = c6.requestCodes();
                    int length = requestCodes.length;
                    while (i7 < length) {
                        if (requestCodes[i7] == i6) {
                            return x0Var;
                        }
                        i7++;
                    }
                }
            } else {
                int[] requestCodes2 = e6.requestCodes();
                int length2 = requestCodes2.length;
                while (i7 < length2) {
                    if (requestCodes2[i7] == i6) {
                        return x0Var;
                    }
                    i7++;
                }
            }
        }
        return null;
    }

    void A0(List list) {
        this.A = list;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d1 B() {
        return null;
    }

    public boolean B0() {
        return this.f4402n.a("KeepRunning", true);
    }

    public v0 C(String str) {
        if (str == null) {
            return null;
        }
        return (v0) this.f4411w.get(str);
    }

    public void C0(v0 v0Var, Intent intent, int i6) {
        l0.a("Starting activity for result");
        this.f4413y = v0Var;
        j().startActivityForResult(intent, i6);
    }

    public String D() {
        return this.f4389a.d();
    }

    public void D0(String str, String str2) {
        g("window.Capacitor.triggerEvent(\"" + str + "\", \"" + str2 + "\")", new ValueCallback() { // from class: com.getcapacitor.g
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                h.R((String) obj);
            }
        });
    }

    public String E() {
        return this.f4392d.f();
    }

    public void E0(String str, String str2, String str3) {
        g("window.Capacitor.triggerEvent(\"" + str + "\", \"" + str2 + "\", " + str3 + ")", new ValueCallback() { // from class: com.getcapacitor.c
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                h.S((String) obj);
            }
        });
    }

    public String F() {
        return this.f4389a.m();
    }

    public void F0(String str) {
        D0(str, "window");
    }

    public WebView G() {
        return this.f4399k;
    }

    public void G0(String str, String str2) {
        E0(str, "window", str2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List H() {
        return this.A;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean H0(u0 u0Var, v0 v0Var, Map map) {
        SharedPreferences.Editor edit;
        SharedPreferences sharedPreferences = o().getSharedPreferences("PluginPermStates", 0);
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (!((Boolean) entry.getValue()).booleanValue()) {
                edit = sharedPreferences.edit();
                edit.putString(str, (androidx.core.app.b.q(j(), str) ? r0.PROMPT_WITH_RATIONALE : r0.DENIED).toString());
            } else if (sharedPreferences.getString(str, null) != null) {
                edit = sharedPreferences.edit();
                edit.remove(str);
            }
            edit.apply();
        }
        String[] strArr = (String[]) map.keySet().toArray(new String[0]);
        if (a1.d.d(o(), strArr)) {
            return true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Missing the following permissions in AndroidManifest.xml:\n");
        for (String str2 : a1.d.b(o(), strArr)) {
            sb.append(str2 + "\n");
        }
        v0Var.r(sb.toString());
        return false;
    }

    public void I(Exception exc) {
        if (exc instanceof SocketTimeoutException) {
            l0.e("Unable to load app. Ensure the server is running at " + this.f4394f + ", or modify the appUrl setting in capacitor.config.json (make sure to npx cap copy after to commit changes).", exc);
        }
    }

    public boolean K() {
        return this.f4402n.a("DisableDeploy", false);
    }

    public boolean L() {
        return (j().getApplicationInfo().flags & 2) != 0;
    }

    public boolean M() {
        PackageInfo currentWebViewPackage;
        PackageManager packageManager = o().getPackageManager();
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 26) {
            currentWebViewPackage = WebView.getCurrentWebViewPackage();
            Matcher matcher = Pattern.compile("(\\d+)").matcher(currentWebViewPackage.versionName);
            if (!matcher.find()) {
                return false;
            }
            int parseInt = Integer.parseInt(matcher.group(0));
            return currentWebViewPackage.packageName.equals("com.huawei.webview") ? parseInt >= this.f4389a.i() : parseInt >= this.f4389a.j();
        }
        try {
            return Integer.parseInt(a1.b.a(packageManager, i6 >= 24 ? "com.android.chrome" : "com.google.android.webview").versionName.split("\\.")[0]) >= this.f4389a.j();
        } catch (Exception e6) {
            l0.n("Unable to get package info for 'com.google.android.webview'" + e6.toString());
            try {
                return Integer.parseInt(a1.b.a(packageManager, "com.android.webview").versionName.split("\\.")[0]) >= this.f4389a.j();
            } catch (Exception e7) {
                l0.n("Unable to get package info for 'com.android.webview'" + e7.toString());
                return false;
            }
        }
    }

    public boolean T(Uri uri) {
        Boolean shouldOverrideLoad;
        Iterator it = this.f4410v.entrySet().iterator();
        while (it.hasNext()) {
            u0 b6 = ((x0) ((Map.Entry) it.next()).getValue()).b();
            if (b6 != null && (shouldOverrideLoad = b6.shouldOverrideLoad(uri)) != null) {
                return shouldOverrideLoad.booleanValue();
            }
        }
        if (uri.getScheme().equals("data")) {
            return false;
        }
        Uri parse = Uri.parse(this.f4394f);
        if ((parse.getHost().equals(uri.getHost()) && uri.getScheme().equals(parse.getScheme())) || this.f4396h.a(uri.getHost())) {
            return false;
        }
        try {
            o().startActivity(new Intent("android.intent.action.VIEW", uri));
            return true;
        } catch (ActivityNotFoundException unused) {
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean X(int i6, int i7, Intent intent) {
        x0 A = A(i6);
        if (A == null || A.b() == null) {
            l0.a("Unable to find a Capacitor plugin to handle requestCode, trying Cordova plugins " + i6);
            return this.f4400l.onActivityResult(i6, i7, intent);
        }
        if (A.b().getSavedCall() == null && this.f4413y != null) {
            A.b().saveCall(this.f4413y);
        }
        A.b().handleOnActivityResult(i6, i7, intent);
        this.f4413y = null;
        return true;
    }

    public void Y(Configuration configuration) {
        Iterator it = this.f4410v.values().iterator();
        while (it.hasNext()) {
            ((x0) it.next()).b().handleOnConfigurationChanged(configuration);
        }
    }

    public void Z() {
        Iterator it = this.f4410v.values().iterator();
        while (it.hasNext()) {
            ((x0) it.next()).b().handleOnDestroy();
        }
        this.f4406r.quitSafely();
        m5.k kVar = this.f4401m;
        if (kVar != null) {
            kVar.handleDestroy();
        }
    }

    public void a0() {
        this.f4399k.removeAllViews();
        this.f4399k.destroy();
    }

    public void b0(Intent intent) {
        Iterator it = this.f4410v.values().iterator();
        while (it.hasNext()) {
            ((x0) it.next()).b().handleOnNewIntent(intent);
        }
        m5.k kVar = this.f4401m;
        if (kVar != null) {
            kVar.onNewIntent(intent);
        }
    }

    public void c0() {
        Iterator it = this.f4410v.values().iterator();
        while (it.hasNext()) {
            ((x0) it.next()).b().handleOnPause();
        }
        if (this.f4401m != null) {
            this.f4401m.handlePause(B0() || this.f4400l.getActivityResultCallback() != null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean d0(int i6, String[] strArr, int[] iArr) {
        x0 A = A(i6);
        if (A != null) {
            if (A.e() != null) {
                return false;
            }
            A.b().handleRequestPermissionsResult(i6, strArr, iArr);
            return true;
        }
        l0.a("Unable to find a Capacitor plugin to handle permission requestCode, trying Cordova plugins " + i6);
        try {
            return this.f4400l.handlePermissionResult(i6, strArr, iArr);
        } catch (JSONException e6) {
            l0.a("Error on Cordova plugin permissions request " + e6.getMessage());
            return false;
        }
    }

    public void e0() {
        Iterator it = this.f4410v.values().iterator();
        while (it.hasNext()) {
            ((x0) it.next()).b().handleOnRestart();
        }
    }

    public void f(String str, final String str2, final v0 v0Var) {
        try {
            final x0 y5 = y(str);
            if (y5 == null) {
                l0.c("unable to find plugin : " + str);
                v0Var.b("unable to find plugin : " + str);
                return;
            }
            if (l0.j()) {
                l0.l("callback: " + v0Var.g() + ", pluginId: " + y5.a() + ", methodName: " + str2 + ", methodData: " + v0Var.h().toString());
            }
            this.f4407s.post(new Runnable() { // from class: com.getcapacitor.e
                @Override // java.lang.Runnable
                public final void run() {
                    h.this.O(y5, str2, v0Var);
                }
            });
        } catch (Exception e6) {
            l0.d(l0.k("callPluginMethod"), "error : " + e6, null);
            v0Var.b(e6.toString());
        }
    }

    public void f0() {
        Iterator it = this.f4410v.values().iterator();
        while (it.hasNext()) {
            ((x0) it.next()).b().handleOnResume();
        }
        m5.k kVar = this.f4401m;
        if (kVar != null) {
            kVar.handleResume(B0());
        }
    }

    public void g(final String str, final ValueCallback valueCallback) {
        new Handler(this.f4390b.getMainLooper()).post(new Runnable() { // from class: com.getcapacitor.f
            @Override // java.lang.Runnable
            public final void run() {
                h.this.P(str, valueCallback);
            }
        });
    }

    public void g0() {
        Iterator it = this.f4410v.values().iterator();
        while (it.hasNext()) {
            ((x0) it.next()).b().handleOnStart();
        }
        m5.k kVar = this.f4401m;
        if (kVar != null) {
            kVar.handleStart();
        }
    }

    public void h(Runnable runnable) {
        this.f4407s.post(runnable);
    }

    public void h0() {
        Iterator it = this.f4410v.values().iterator();
        while (it.hasNext()) {
            ((x0) it.next()).b().handleOnStop();
        }
        m5.k kVar = this.f4401m;
        if (kVar != null) {
            kVar.handleStop();
        }
    }

    public void i(Runnable runnable) {
        new Handler(this.f4390b.getMainLooper()).post(runnable);
    }

    public androidx.appcompat.app.c j() {
        return this.f4390b;
    }

    public Set k() {
        return this.f4397i;
    }

    public b l() {
        return this.f4404p;
    }

    public androidx.activity.result.c l0(c.a aVar, androidx.activity.result.b bVar) {
        Fragment fragment = this.f4391c;
        return fragment != null ? fragment.p1(aVar, bVar) : this.f4390b.N(aVar, bVar);
    }

    public a1.a m() {
        return this.f4396h;
    }

    public void m0(Class cls) {
        String i02 = i0(cls);
        if (i02 == null) {
            return;
        }
        try {
            this.f4410v.put(i02, new x0(this, cls));
        } catch (e0 unused) {
            V(cls);
        } catch (y0 e6) {
            W(cls, e6);
        }
    }

    public c0 n() {
        return this.f4389a;
    }

    public void n0(u0 u0Var) {
        Class<?> cls = u0Var.getClass();
        String i02 = i0(cls);
        if (i02 == null) {
            return;
        }
        try {
            this.f4410v.put(i02, new x0(this, u0Var));
        } catch (e0 unused) {
            V(cls);
        }
    }

    public Context o() {
        return this.f4390b;
    }

    public void o0(v0 v0Var) {
        p0(v0Var.g());
    }

    public String p() {
        String g6 = this.f4389a.g();
        if (g6 == null || g6.trim().isEmpty()) {
            return null;
        }
        String q6 = q();
        return (D() + "://" + q6) + "/" + g6;
    }

    public void p0(String str) {
        this.f4411w.remove(str);
    }

    public String q() {
        return this.f4389a.h();
    }

    public void q0() {
        this.f4411w = new HashMap();
    }

    public Uri r() {
        return this.f4414z;
    }

    public void r0(Bundle bundle) {
        String string = bundle.getString("capacitorLastActivityPluginId");
        String string2 = bundle.getString("capacitorLastActivityPluginMethod");
        String string3 = bundle.getString("capacitorLastPluginCallOptions");
        if (string != null) {
            if (string3 != null) {
                try {
                    this.f4413y = new v0(this.f4405q, string, "-1", string2, new j0(string3));
                } catch (JSONException e6) {
                    l0.e("Unable to restore plugin call, unable to parse persisted JSON object", e6);
                }
            }
            Bundle bundle2 = bundle.getBundle("capacitorLastPluginCallBundle");
            x0 y5 = y(string);
            if (bundle2 == null || y5 == null) {
                l0.c("Unable to restore last plugin call");
            } else {
                y5.b().restoreState(bundle2);
            }
        }
    }

    public void s0(v0 v0Var) {
        this.f4411w.put(v0Var.g(), v0Var);
    }

    public void t0(Bundle bundle) {
        x0 y5;
        l0.a("Saving instance state!");
        v0 v0Var = this.f4413y;
        if (v0Var == null || (y5 = y(v0Var.m())) == null) {
            return;
        }
        Bundle saveInstanceState = y5.b().saveInstanceState();
        if (saveInstanceState != null) {
            bundle.putString("capacitorLastActivityPluginId", v0Var.m());
            bundle.putString("capacitorLastActivityPluginMethod", v0Var.k());
            bundle.putString("capacitorLastPluginCallOptions", v0Var.h().toString());
            bundle.putBundle("capacitorLastPluginCallBundle", saveInstanceState);
            return;
        }
        l0.c("Couldn't save last " + v0Var.m() + "'s Plugin " + v0Var.k() + " call");
    }

    public g1 u() {
        return this.f4392d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void u0(v0 v0Var) {
        if (v0Var != null) {
            if (!this.f4412x.containsKey(v0Var.m())) {
                this.f4412x.put(v0Var.m(), new LinkedList());
            }
            ((LinkedList) this.f4412x.get(v0Var.m())).add(v0Var.g());
            s0(v0Var);
        }
    }

    public String v() {
        return this.f4393e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public v0 w(String str) {
        LinkedList linkedList = (LinkedList) this.f4412x.get(str);
        return C(linkedList != null ? (String) linkedList.poll() : null);
    }

    protected void w0(m5.k kVar) {
        this.f4401m = kVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Map x(u0 u0Var) {
        r0 b6;
        HashMap hashMap = new HashMap();
        for (v0.c cVar : u0Var.getPluginHandle().e().permissions()) {
            if (cVar.strings().length == 0 || (cVar.strings().length == 1 && cVar.strings()[0].isEmpty())) {
                String alias = cVar.alias();
                if (!alias.isEmpty() && ((r0) hashMap.get(alias)) == null) {
                    hashMap.put(alias, r0.GRANTED);
                }
            } else {
                for (String str : cVar.strings()) {
                    String alias2 = cVar.alias().isEmpty() ? str : cVar.alias();
                    if (androidx.core.content.a.a(o(), str) == 0) {
                        b6 = r0.GRANTED;
                    } else {
                        r0 r0Var = r0.PROMPT;
                        String string = o().getSharedPreferences("PluginPermStates", 0).getString(str, null);
                        b6 = string != null ? r0.b(string) : r0Var;
                    }
                    r0 r0Var2 = (r0) hashMap.get(alias2);
                    if (r0Var2 == null || r0Var2 == r0.GRANTED) {
                        hashMap.put(alias2, b6);
                    }
                }
            }
        }
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void x0(v0 v0Var) {
        this.f4413y = v0Var;
    }

    public x0 y(String str) {
        return (x0) this.f4410v.get(str);
    }

    void y0(d1 d1Var) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public v0 z() {
        v0 v0Var = this.f4413y;
        this.f4413y = null;
        return v0Var;
    }

    public void z0(String str) {
        this.f4392d.l(str);
        this.f4399k.post(new Runnable() { // from class: com.getcapacitor.d
            @Override // java.lang.Runnable
            public final void run() {
                h.this.Q();
            }
        });
    }
}
