package com.capacitorjs.plugins.device;

import android.os.Build;
import com.getcapacitor.a1;
import com.getcapacitor.j0;
import com.getcapacitor.u0;
import com.getcapacitor.v0;
import java.util.Locale;
import v0.b;

@b(name = "Device")
/* loaded from: classes.dex */
public class DevicePlugin extends u0 {
    private a implementation;

    @a1
    public void getBatteryInfo(v0 v0Var) {
        j0 j0Var = new j0();
        j0Var.put("batteryLevel", this.implementation.a());
        j0Var.put("isCharging", this.implementation.l());
        v0Var.x(j0Var);
    }

    @a1
    public void getId(v0 v0Var) {
        j0 j0Var = new j0();
        j0Var.m("identifier", this.implementation.i());
        v0Var.x(j0Var);
    }

    @a1
    public void getInfo(v0 v0Var) {
        j0 j0Var = new j0();
        j0Var.put("memUsed", this.implementation.d());
        j0Var.put("diskFree", this.implementation.b());
        j0Var.put("diskTotal", this.implementation.c());
        j0Var.put("realDiskFree", this.implementation.g());
        j0Var.put("realDiskTotal", this.implementation.h());
        j0Var.m("model", Build.MODEL);
        j0Var.m("operatingSystem", "android");
        j0Var.m("osVersion", Build.VERSION.RELEASE);
        j0Var.put("androidSDKVersion", Build.VERSION.SDK_INT);
        j0Var.m("platform", this.implementation.f());
        j0Var.m("manufacturer", Build.MANUFACTURER);
        j0Var.put("isVirtual", this.implementation.m());
        j0Var.m("name", this.implementation.e());
        j0Var.m("webViewVersion", this.implementation.j());
        v0Var.x(j0Var);
    }

    @a1
    public void getLanguageCode(v0 v0Var) {
        j0 j0Var = new j0();
        j0Var.m("value", Locale.getDefault().getLanguage());
        v0Var.x(j0Var);
    }

    @a1
    public void getLanguageTag(v0 v0Var) {
        j0 j0Var = new j0();
        j0Var.m("value", Locale.getDefault().toLanguageTag());
        v0Var.x(j0Var);
    }

    @Override // com.getcapacitor.u0
    public void load() {
        this.implementation = new a(getContext());
    }
}
