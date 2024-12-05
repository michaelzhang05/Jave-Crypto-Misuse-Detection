package org.apache.cordova;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Pair;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import m5.h;
import m5.o;
import org.apache.cordova.f;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class CordovaInterfaceImpl implements h {

    /* renamed from: a, reason: collision with root package name */
    protected androidx.appcompat.app.c f8289a;

    /* renamed from: b, reason: collision with root package name */
    protected ExecutorService f8290b;

    /* renamed from: c, reason: collision with root package name */
    protected e f8291c;

    /* renamed from: d, reason: collision with root package name */
    protected a f8292d;

    /* renamed from: e, reason: collision with root package name */
    protected m5.c f8293e;

    /* renamed from: f, reason: collision with root package name */
    protected b f8294f;

    /* renamed from: g, reason: collision with root package name */
    protected String f8295g;

    /* renamed from: h, reason: collision with root package name */
    protected int f8296h;

    /* renamed from: i, reason: collision with root package name */
    protected boolean f8297i;

    /* renamed from: j, reason: collision with root package name */
    protected Bundle f8298j;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private int f8299a;

        /* renamed from: b, reason: collision with root package name */
        private int f8300b;

        /* renamed from: c, reason: collision with root package name */
        private Intent f8301c;

        public a(int i6, int i7, Intent intent) {
            this.f8299a = i6;
            this.f8300b = i7;
            this.f8301c = intent;
        }
    }

    public CordovaInterfaceImpl(androidx.appcompat.app.c cVar) {
        this(cVar, Executors.newCachedThreadPool());
    }

    @Override // m5.h
    public androidx.appcompat.app.c getActivity() {
        return this.f8289a;
    }

    public Context getContext() {
        return this.f8289a;
    }

    @Override // m5.h
    public ExecutorService getThreadPool() {
        return this.f8290b;
    }

    @Override // m5.h
    public boolean hasPermission(String str) {
        return Build.VERSION.SDK_INT < 23 || this.f8289a.checkSelfPermission(str) == 0;
    }

    public boolean onActivityResult(int i6, int i7, Intent intent) {
        b bVar = this.f8294f;
        if (bVar == null && this.f8295g != null) {
            this.f8292d = new a(i6, i7, intent);
            e eVar = this.f8291c;
            if (eVar != null && (bVar = eVar.f(this.f8295g)) != null) {
                bVar.onRestoreStateForActivityResult(this.f8298j.getBundle(bVar.getServiceName()), new ResumeCallback(bVar.getServiceName(), this.f8291c));
            }
        }
        this.f8294f = null;
        if (bVar != null) {
            o.a("CordovaInterfaceImpl", "Sending activity result to plugin");
            this.f8295g = null;
            this.f8292d = null;
            bVar.onActivityResult(i6, i7, intent);
            return true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Got an activity result, but no plugin was registered to receive it");
        sb.append(this.f8292d != null ? " yet!" : ".");
        o.g("CordovaInterfaceImpl", sb.toString());
        return false;
    }

    public void onCordovaInit(e eVar) {
        CoreAndroid coreAndroid;
        this.f8291c = eVar;
        a aVar = this.f8292d;
        if (aVar != null) {
            onActivityResult(aVar.f8299a, this.f8292d.f8300b, this.f8292d.f8301c);
            return;
        }
        if (this.f8297i) {
            this.f8297i = false;
            if (eVar == null || (coreAndroid = (CoreAndroid) eVar.f(CoreAndroid.PLUGIN_NAME)) == null) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("action", "resume");
            } catch (JSONException e6) {
                o.d("CordovaInterfaceImpl", "Failed to create event message", e6);
            }
            coreAndroid.sendResumeEvent(new f(f.a.OK, jSONObject));
        }
    }

    @Override // m5.h
    public Object onMessage(String str, Object obj) {
        if (!"exit".equals(str)) {
            return null;
        }
        this.f8289a.finish();
        return null;
    }

    public void onRequestPermissionResult(int i6, String[] strArr, int[] iArr) {
        Pair a6 = this.f8293e.a(i6);
        if (a6 != null) {
            ((b) a6.first).onRequestPermissionResult(((Integer) a6.second).intValue(), strArr, iArr);
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        b bVar = this.f8294f;
        if (bVar != null) {
            bundle.putString("callbackService", bVar.getServiceName());
        }
        e eVar = this.f8291c;
        if (eVar != null) {
            bundle.putBundle("plugin", eVar.s());
        }
    }

    @Override // m5.h
    public void requestPermission(b bVar, int i6, String str) {
        requestPermissions(bVar, i6, new String[]{str});
    }

    @Override // m5.h
    public void requestPermissions(b bVar, int i6, String[] strArr) {
        getActivity().requestPermissions(strArr, this.f8293e.b(bVar, i6));
    }

    public void restoreInstanceState(Bundle bundle) {
        this.f8295g = bundle.getString("callbackService");
        this.f8298j = bundle.getBundle("plugin");
        this.f8297i = true;
    }

    public void setActivityResultCallback(b bVar) {
        b bVar2 = this.f8294f;
        if (bVar2 != null) {
            bVar2.onActivityResult(this.f8296h, 0, null);
        }
        this.f8294f = bVar;
    }

    public void setActivityResultRequestCode(int i6) {
        this.f8296h = i6;
    }

    @Override // m5.h
    public void startActivityForResult(b bVar, Intent intent, int i6) {
        setActivityResultCallback(bVar);
        try {
            this.f8289a.startActivityForResult(intent, i6);
        } catch (RuntimeException e6) {
            this.f8294f = null;
            throw e6;
        }
    }

    public CordovaInterfaceImpl(androidx.appcompat.app.c cVar, ExecutorService executorService) {
        this.f8297i = false;
        this.f8289a = cVar;
        this.f8290b = executorService;
        this.f8293e = new m5.c();
    }
}
