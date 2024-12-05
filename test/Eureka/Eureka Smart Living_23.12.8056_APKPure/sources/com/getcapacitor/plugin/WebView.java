package com.getcapacitor.plugin;

import android.content.SharedPreferences;
import com.getcapacitor.a1;
import com.getcapacitor.j0;
import com.getcapacitor.u0;
import com.getcapacitor.v0;

@v0.b
/* loaded from: classes.dex */
public class WebView extends u0 {
    public static final String CAP_SERVER_PATH = "serverBasePath";
    public static final String WEBVIEW_PREFS_NAME = "CapWebViewSettings";

    @a1
    public void getServerBasePath(v0 v0Var) {
        String E = this.bridge.E();
        j0 j0Var = new j0();
        j0Var.m("path", E);
        v0Var.x(j0Var);
    }

    @a1
    public void persistServerBasePath(v0 v0Var) {
        String E = this.bridge.E();
        SharedPreferences.Editor edit = getContext().getSharedPreferences(WEBVIEW_PREFS_NAME, 0).edit();
        edit.putString(CAP_SERVER_PATH, E);
        edit.apply();
        v0Var.w();
    }

    @a1
    public void setServerBasePath(v0 v0Var) {
        this.bridge.z0(v0Var.n("path"));
        v0Var.w();
    }
}
