package org.apache.cordova;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Debug;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import m5.h;
import m5.k;
import m5.l;
import m5.n;
import m5.o;
import m5.q;
import org.apache.cordova.f;
import org.json.JSONException;

/* loaded from: classes.dex */
public class e {

    /* renamed from: f, reason: collision with root package name */
    private static String f8383f = "PluginManager";

    /* renamed from: g, reason: collision with root package name */
    private static String f8384g = "https";

    /* renamed from: h, reason: collision with root package name */
    private static String f8385h = "localhost";

    /* renamed from: i, reason: collision with root package name */
    private static final int f8386i;

    /* renamed from: a, reason: collision with root package name */
    private final Map f8387a = Collections.synchronizedMap(new LinkedHashMap());

    /* renamed from: b, reason: collision with root package name */
    private final Map f8388b = Collections.synchronizedMap(new LinkedHashMap());

    /* renamed from: c, reason: collision with root package name */
    private final h f8389c;

    /* renamed from: d, reason: collision with root package name */
    private final k f8390d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f8391e;

    static {
        f8386i = Debug.isDebuggerConnected() ? 60 : 16;
    }

    public e(k kVar, h hVar, Collection collection) {
        this.f8389c = hVar;
        this.f8390d = kVar;
        x(collection);
    }

    private void C() {
        synchronized (this.f8388b) {
            for (q qVar : this.f8388b.values()) {
                if (qVar.f7956d) {
                    f(qVar.f7953a);
                } else {
                    o.a(f8383f, "startupPlugins: put - " + qVar.f7953a);
                    this.f8387a.put(qVar.f7953a, null);
                }
            }
        }
    }

    private String e() {
        if (this.f8390d.getPreferences().a("AndroidInsecureFileModeEnabled", false)) {
            return "file://";
        }
        return this.f8390d.getPreferences().c("scheme", f8384g).toLowerCase() + "://" + this.f8390d.getPreferences().c("hostname", f8385h) + '/';
    }

    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0015  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021 A[Catch: Exception -> 0x0010, TRY_LEAVE, TryCatch #0 {Exception -> 0x0010, blocks: (B:20:0x0003, B:22:0x000b, B:6:0x0018, B:8:0x0021), top: B:19:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private org.apache.cordova.b i(java.lang.String r5) {
        /*
            r4 = this;
            r0 = 0
            if (r5 == 0) goto L12
            java.lang.String r1 = ""
            boolean r1 = r1.equals(r5)     // Catch: java.lang.Exception -> L10
            if (r1 != 0) goto L12
            java.lang.Class r1 = java.lang.Class.forName(r5)     // Catch: java.lang.Exception -> L10
            goto L13
        L10:
            r1 = move-exception
            goto L29
        L12:
            r1 = r0
        L13:
            if (r1 == 0) goto L17
            r2 = 1
            goto L18
        L17:
            r2 = 0
        L18:
            java.lang.Class<org.apache.cordova.b> r3 = org.apache.cordova.b.class
            boolean r3 = r3.isAssignableFrom(r1)     // Catch: java.lang.Exception -> L10
            r2 = r2 & r3
            if (r2 == 0) goto L47
            java.lang.Object r1 = r1.newInstance()     // Catch: java.lang.Exception -> L10
            org.apache.cordova.b r1 = (org.apache.cordova.b) r1     // Catch: java.lang.Exception -> L10
            r0 = r1
            goto L47
        L29:
            r1.printStackTrace()
            java.io.PrintStream r1 = java.lang.System.out
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Error adding plugin "
            r2.append(r3)
            r2.append(r5)
            java.lang.String r5 = "."
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            r1.println(r5)
        L47:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.cordova.e.i(java.lang.String):org.apache.cordova.b");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void j(String str, Object obj, String str2, b bVar) {
        if (bVar != null) {
            bVar.onMessage(str, obj);
        }
    }

    public boolean A(String str) {
        Boolean shouldAllowRequest;
        synchronized (this.f8388b) {
            Iterator it = this.f8388b.values().iterator();
            while (it.hasNext()) {
                b bVar = (b) this.f8387a.get(((q) it.next()).f7953a);
                if (bVar != null && (shouldAllowRequest = bVar.shouldAllowRequest(str)) != null) {
                    return shouldAllowRequest.booleanValue();
                }
            }
            if (str.startsWith("blob:") || str.startsWith("data:") || str.startsWith("about:blank") || str.startsWith("https://ssl.gstatic.com/accessibility/javascript/android/")) {
                return true;
            }
            if (str.startsWith("file://")) {
                return !str.contains("/app_webview/");
            }
            return false;
        }
    }

    public Boolean B(String str) {
        Boolean shouldOpenExternalUrl;
        synchronized (this.f8388b) {
            Iterator it = this.f8388b.values().iterator();
            while (it.hasNext()) {
                b bVar = (b) this.f8387a.get(((q) it.next()).f7953a);
                if (bVar != null && (shouldOpenExternalUrl = bVar.shouldOpenExternalUrl(str)) != null) {
                    return shouldOpenExternalUrl;
                }
            }
            return Boolean.FALSE;
        }
    }

    public void b(String str, String str2) {
        c(new q(str, str2, false));
    }

    public void c(q qVar) {
        this.f8388b.put(qVar.f7953a, qVar);
        b bVar = qVar.f7955c;
        if (bVar != null) {
            String str = qVar.f7953a;
            h hVar = this.f8389c;
            k kVar = this.f8390d;
            bVar.privateInitialize(str, hVar, kVar, kVar.getPreferences());
            o.a(f8383f, "addService: put - " + qVar.f7953a);
            this.f8387a.put(qVar.f7953a, qVar.f7955c);
        }
    }

    public void d(String str, String str2, String str3, String str4) {
        b f6 = f(str);
        if (f6 == null) {
            o.a(f8383f, "exec() call to unknown plugin: " + str);
            this.f8390d.sendPluginResult(new f(f.a.CLASS_NOT_FOUND_EXCEPTION), str3);
            return;
        }
        a aVar = new a(str3, this.f8390d);
        try {
            long currentTimeMillis = System.currentTimeMillis();
            boolean execute = f6.execute(str2, str4, aVar);
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            if (currentTimeMillis2 > f8386i) {
                o.g(f8383f, "THREAD WARNING: exec() call to " + str + "." + str2 + " blocked the main thread for " + currentTimeMillis2 + "ms. Plugin should use CordovaInterface.getThreadPool().");
            }
            if (execute) {
                return;
            }
            aVar.sendPluginResult(new f(f.a.INVALID_ACTION));
        } catch (JSONException unused) {
            aVar.sendPluginResult(new f(f.a.JSON_EXCEPTION));
        } catch (Exception e6) {
            o.d(f8383f, "Uncaught exception from plugin", e6);
            aVar.error(e6.getMessage());
        }
    }

    public b f(String str) {
        b bVar = (b) this.f8387a.get(str);
        if (bVar == null) {
            q qVar = (q) this.f8388b.get(str);
            if (qVar == null) {
                return null;
            }
            b bVar2 = qVar.f7955c;
            bVar = bVar2 != null ? bVar2 : i(qVar.f7954b);
            h hVar = this.f8389c;
            k kVar = this.f8390d;
            bVar.privateInitialize(str, hVar, kVar, kVar.getPreferences());
            o.a(f8383f, "getPlugin - put: " + str);
            this.f8387a.put(str, bVar);
        }
        return bVar;
    }

    public ArrayList g() {
        ArrayList arrayList = new ArrayList();
        for (b bVar : this.f8387a.values()) {
            if (bVar != null && bVar.getPathHandler() != null) {
                arrayList.add(bVar.getPathHandler());
            }
        }
        return arrayList;
    }

    public void h() {
        o.a(f8383f, "init()");
        this.f8391e = true;
        n(false);
        k();
        this.f8387a.clear();
        C();
    }

    public void k() {
        synchronized (this.f8387a) {
            for (b bVar : this.f8387a.values()) {
                if (bVar != null) {
                    bVar.onDestroy();
                }
            }
        }
    }

    public void l(Intent intent) {
        synchronized (this.f8387a) {
            for (b bVar : this.f8387a.values()) {
                if (bVar != null) {
                    bVar.onNewIntent(intent);
                }
            }
        }
    }

    public boolean m(String str) {
        synchronized (this.f8388b) {
            Iterator it = this.f8388b.values().iterator();
            while (it.hasNext()) {
                b bVar = (b) this.f8387a.get(((q) it.next()).f7953a);
                if (bVar != null && bVar.onOverrideUrlLoading(str)) {
                    return true;
                }
            }
            return false;
        }
    }

    public void n(boolean z5) {
        synchronized (this.f8387a) {
            for (b bVar : this.f8387a.values()) {
                if (bVar != null) {
                    bVar.onPause(z5);
                }
            }
        }
    }

    public boolean o(k kVar, l lVar) {
        synchronized (this.f8387a) {
            for (b bVar : this.f8387a.values()) {
                if (bVar != null && bVar.onReceivedClientCertRequest(this.f8390d, lVar)) {
                    return true;
                }
            }
            return false;
        }
    }

    public boolean p(k kVar, n nVar, String str, String str2) {
        synchronized (this.f8387a) {
            for (b bVar : this.f8387a.values()) {
                if (bVar != null && bVar.onReceivedHttpAuthRequest(this.f8390d, nVar, str, str2)) {
                    return true;
                }
            }
            return false;
        }
    }

    public void q() {
        synchronized (this.f8387a) {
            for (b bVar : this.f8387a.values()) {
                if (bVar != null) {
                    bVar.onReset();
                }
            }
        }
    }

    public void r(boolean z5) {
        synchronized (this.f8387a) {
            for (b bVar : this.f8387a.values()) {
                if (bVar != null) {
                    bVar.onResume(z5);
                }
            }
        }
    }

    public Bundle s() {
        Bundle onSaveInstanceState;
        Bundle bundle = new Bundle();
        synchronized (this.f8387a) {
            for (b bVar : this.f8387a.values()) {
                if (bVar != null && (onSaveInstanceState = bVar.onSaveInstanceState()) != null) {
                    bundle.putBundle(bVar.getServiceName(), onSaveInstanceState);
                }
            }
        }
        return bundle;
    }

    public void t() {
        synchronized (this.f8387a) {
            for (b bVar : this.f8387a.values()) {
                if (bVar != null) {
                    bVar.onStart();
                }
            }
        }
    }

    public void u() {
        synchronized (this.f8387a) {
            for (b bVar : this.f8387a.values()) {
                if (bVar != null) {
                    bVar.onStop();
                }
            }
        }
    }

    public Object v(final String str, final Object obj) {
        Object onMessage;
        o.a(f8383f, "postMessage: " + str);
        synchronized (this.f8387a) {
            if (Build.VERSION.SDK_INT >= 24) {
                this.f8387a.forEach(new BiConsumer() { // from class: m5.s
                    @Override // java.util.function.BiConsumer
                    public final void accept(Object obj2, Object obj3) {
                        org.apache.cordova.e.j(str, obj, (String) obj2, (org.apache.cordova.b) obj3);
                    }
                });
            } else {
                for (b bVar : this.f8387a.values()) {
                    if (bVar != null && (onMessage = bVar.onMessage(str, obj)) != null) {
                        return onMessage;
                    }
                }
            }
            return this.f8389c.onMessage(str, obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Uri w(Uri uri) {
        Uri remapUri;
        synchronized (this.f8387a) {
            for (b bVar : this.f8387a.values()) {
                if (bVar != null && (remapUri = bVar.remapUri(uri)) != null) {
                    return remapUri;
                }
            }
            return null;
        }
    }

    public void x(Collection collection) {
        if (this.f8391e) {
            n(false);
            k();
            this.f8387a.clear();
            this.f8388b.clear();
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            c((q) it.next());
        }
        if (this.f8391e) {
            C();
        }
    }

    public boolean y(String str) {
        Boolean shouldAllowBridgeAccess;
        synchronized (this.f8388b) {
            Iterator it = this.f8388b.values().iterator();
            while (it.hasNext()) {
                b bVar = (b) this.f8387a.get(((q) it.next()).f7953a);
                if (bVar != null && (shouldAllowBridgeAccess = bVar.shouldAllowBridgeAccess(str)) != null) {
                    return shouldAllowBridgeAccess.booleanValue();
                }
            }
            return str.startsWith(e());
        }
    }

    public boolean z(String str) {
        Boolean shouldAllowNavigation;
        synchronized (this.f8388b) {
            Iterator it = this.f8388b.values().iterator();
            while (it.hasNext()) {
                b bVar = (b) this.f8387a.get(((q) it.next()).f7953a);
                if (bVar != null && (shouldAllowNavigation = bVar.shouldAllowNavigation(str)) != null) {
                    return shouldAllowNavigation.booleanValue();
                }
            }
            return str.startsWith(e()) || str.startsWith("about:blank");
        }
    }
}
