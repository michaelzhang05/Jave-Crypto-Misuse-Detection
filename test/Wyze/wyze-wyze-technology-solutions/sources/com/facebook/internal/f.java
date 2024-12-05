package com.facebook.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: CustomTabUtils.java */
/* loaded from: classes.dex */
public class f {
    private static final String[] a = {"com.android.chrome", "com.chrome.beta", "com.chrome.dev"};

    public static String a() {
        Context e2 = com.facebook.f.e();
        List<ResolveInfo> queryIntentServices = e2.getPackageManager().queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 0);
        if (queryIntentServices == null) {
            return null;
        }
        HashSet hashSet = new HashSet(Arrays.asList(a));
        Iterator<ResolveInfo> it = queryIntentServices.iterator();
        while (it.hasNext()) {
            ServiceInfo serviceInfo = it.next().serviceInfo;
            if (serviceInfo != null && hashSet.contains(serviceInfo.packageName)) {
                return serviceInfo.packageName;
            }
        }
        return null;
    }

    public static String b() {
        return "fbconnect://cct." + com.facebook.f.e().getPackageName();
    }
}
