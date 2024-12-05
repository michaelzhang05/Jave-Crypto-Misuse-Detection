package com.capacitorjs.plugins.applauncher;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import com.getcapacitor.a1;
import com.getcapacitor.j0;
import com.getcapacitor.l0;
import com.getcapacitor.u0;
import com.getcapacitor.v0;
import v0.b;

@b(name = "AppLauncher")
/* loaded from: classes.dex */
public class AppLauncherPlugin extends u0 {
    @a1
    public void canOpenUrl(v0 v0Var) {
        String n6 = v0Var.n("url");
        if (n6 == null) {
            v0Var.r("Must supply a url");
            return;
        }
        PackageManager packageManager = getActivity().getApplicationContext().getPackageManager();
        j0 j0Var = new j0();
        try {
            a1.b.b(packageManager, n6, 1L);
            j0Var.put("value", true);
            v0Var.x(j0Var);
        } catch (PackageManager.NameNotFoundException unused) {
            l0.d(getLogTag(), "Package name '" + n6 + "' not found!", null);
            j0Var.put("value", false);
            v0Var.x(j0Var);
        }
    }

    @a1
    public void openUrl(v0 v0Var) {
        String n6 = v0Var.n("url");
        if (n6 == null) {
            v0Var.r("Must provide a url to open");
            return;
        }
        j0 j0Var = new j0();
        PackageManager packageManager = getContext().getPackageManager();
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(n6));
        try {
            getActivity().startActivity(intent);
            j0Var.put("completed", true);
        } catch (Exception unused) {
            try {
                getActivity().startActivity(packageManager.getLaunchIntentForPackage(n6));
                j0Var.put("completed", true);
            } catch (Exception unused2) {
                j0Var.put("completed", false);
            }
        }
        v0Var.x(j0Var);
    }
}
