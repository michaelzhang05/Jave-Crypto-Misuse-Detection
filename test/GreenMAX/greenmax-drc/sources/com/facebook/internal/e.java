package com.facebook.internal;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import c.c.b.c;

/* compiled from: CustomTab.java */
/* loaded from: classes.dex */
public class e {
    private Uri a;

    public e(String str, Bundle bundle) {
        this.a = a(str, bundle == null ? new Bundle() : bundle);
    }

    public static Uri a(String str, Bundle bundle) {
        return x.e(v.b(), com.facebook.f.o() + "/dialog/" + str, bundle);
    }

    public void b(Activity activity, String str) {
        c.c.b.c c2 = new c.a(com.facebook.login.a.b()).c();
        c2.a.setPackage(str);
        c2.a.addFlags(1073741824);
        c2.a(activity, this.a);
    }
}
