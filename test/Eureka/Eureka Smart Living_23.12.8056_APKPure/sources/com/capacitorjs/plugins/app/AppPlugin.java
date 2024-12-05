package com.capacitorjs.plugins.app;

import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.net.Uri;
import androidx.activity.m;
import androidx.core.content.pm.f;
import com.getcapacitor.a1;
import com.getcapacitor.b;
import com.getcapacitor.c1;
import com.getcapacitor.j0;
import com.getcapacitor.l0;
import com.getcapacitor.u0;
import com.getcapacitor.v0;

@v0.b(name = "App")
/* loaded from: classes.dex */
public class AppPlugin extends u0 {
    private static final String EVENT_BACK_BUTTON = "backButton";
    private static final String EVENT_PAUSE = "pause";
    private static final String EVENT_RESTORED_RESULT = "appRestoredResult";
    private static final String EVENT_RESUME = "resume";
    private static final String EVENT_STATE_CHANGE = "appStateChange";
    private static final String EVENT_URL_OPEN = "appUrlOpen";
    private boolean hasPausedEver = false;

    /* loaded from: classes.dex */
    class a extends m {
        a(boolean z5) {
            super(z5);
        }

        @Override // androidx.activity.m
        public void b() {
            if (!AppPlugin.this.hasListeners(AppPlugin.EVENT_BACK_BUTTON)) {
                if (((u0) AppPlugin.this).bridge.G().canGoBack()) {
                    ((u0) AppPlugin.this).bridge.G().goBack();
                }
            } else {
                j0 j0Var = new j0();
                j0Var.put("canGoBack", ((u0) AppPlugin.this).bridge.G().canGoBack());
                AppPlugin.this.notifyListeners(AppPlugin.EVENT_BACK_BUTTON, j0Var, true);
                ((u0) AppPlugin.this).bridge.D0("backbutton", "document");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$load$0(Boolean bool) {
        l0.b(getLogTag(), "Firing change: " + bool);
        j0 j0Var = new j0();
        j0Var.put("isActive", bool);
        notifyListeners(EVENT_STATE_CHANGE, j0Var, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$load$1(c1 c1Var) {
        l0.b(getLogTag(), "Firing restored result");
        notifyListeners(EVENT_RESTORED_RESULT, c1Var.a(), true);
    }

    private void unsetAppListeners() {
        this.bridge.l().e(null);
        this.bridge.l().d(null);
    }

    @a1
    public void exitApp(v0 v0Var) {
        unsetAppListeners();
        v0Var.w();
        getBridge().j().finish();
    }

    @a1
    public void getInfo(v0 v0Var) {
        j0 j0Var = new j0();
        try {
            PackageInfo a6 = a1.b.a(getContext().getPackageManager(), getContext().getPackageName());
            ApplicationInfo applicationInfo = getContext().getApplicationInfo();
            int i6 = applicationInfo.labelRes;
            j0Var.m("name", i6 == 0 ? applicationInfo.nonLocalizedLabel.toString() : getContext().getString(i6));
            j0Var.m("id", a6.packageName);
            j0Var.m("build", Integer.toString((int) f.a(a6)));
            j0Var.m("version", a6.versionName);
            v0Var.x(j0Var);
        } catch (Exception unused) {
            v0Var.r("Unable to get App Info");
        }
    }

    @a1
    public void getLaunchUrl(v0 v0Var) {
        Uri r5 = this.bridge.r();
        if (r5 == null) {
            v0Var.w();
            return;
        }
        j0 j0Var = new j0();
        j0Var.m("url", r5.toString());
        v0Var.x(j0Var);
    }

    @a1
    public void getState(v0 v0Var) {
        j0 j0Var = new j0();
        j0Var.put("isActive", this.bridge.l().c());
        v0Var.x(j0Var);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.getcapacitor.u0
    public void handleOnDestroy() {
        unsetAppListeners();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.getcapacitor.u0
    public void handleOnNewIntent(Intent intent) {
        super.handleOnNewIntent(intent);
        String action = intent.getAction();
        Uri data = intent.getData();
        if (!"android.intent.action.VIEW".equals(action) || data == null) {
            return;
        }
        j0 j0Var = new j0();
        j0Var.m("url", data.toString());
        notifyListeners(EVENT_URL_OPEN, j0Var, true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.getcapacitor.u0
    public void handleOnPause() {
        super.handleOnPause();
        this.hasPausedEver = true;
        notifyListeners(EVENT_PAUSE, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.getcapacitor.u0
    public void handleOnResume() {
        super.handleOnResume();
        if (this.hasPausedEver) {
            notifyListeners(EVENT_RESUME, null);
        }
    }

    @Override // com.getcapacitor.u0
    public void load() {
        this.bridge.l().e(new b.InterfaceC0076b() { // from class: com.capacitorjs.plugins.app.a
            @Override // com.getcapacitor.b.InterfaceC0076b
            public final void a(Boolean bool) {
                AppPlugin.this.lambda$load$0(bool);
            }
        });
        this.bridge.l().d(new b.a() { // from class: com.capacitorjs.plugins.app.b
            @Override // com.getcapacitor.b.a
            public final void a(c1 c1Var) {
                AppPlugin.this.lambda$load$1(c1Var);
            }
        });
        getActivity().c().b(getActivity(), new a(true));
    }

    @a1
    public void minimizeApp(v0 v0Var) {
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.HOME");
        intent.setFlags(268435456);
        getActivity().startActivity(intent);
        v0Var.w();
    }
}
