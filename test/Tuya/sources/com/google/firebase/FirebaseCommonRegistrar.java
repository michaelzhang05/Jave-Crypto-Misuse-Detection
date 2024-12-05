package com.google.firebase;

import X0.f;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentRegistrar;
import h1.c;
import h1.e;
import h1.h;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class FirebaseCommonRegistrar implements ComponentRegistrar {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String e(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (applicationInfo != null) {
            return String.valueOf(applicationInfo.targetSdkVersion);
        }
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String f(Context context) {
        int i8;
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (applicationInfo != null && Build.VERSION.SDK_INT >= 24) {
            i8 = applicationInfo.minSdkVersion;
            return String.valueOf(i8);
        }
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String g(Context context) {
        int i8 = Build.VERSION.SDK_INT;
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
            return "tv";
        }
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
            return "watch";
        }
        if (i8 >= 23 && context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
            return "auto";
        }
        if (i8 >= 26 && context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
            return "embedded";
        }
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String h(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        if (installerPackageName != null) {
            return i(installerPackageName);
        }
        return "";
    }

    private static String i(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List getComponents() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(c.c());
        arrayList.add(f.g());
        arrayList.add(h.b("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(h.b("fire-core", "20.3.3"));
        arrayList.add(h.b("device-name", i(Build.PRODUCT)));
        arrayList.add(h.b("device-model", i(Build.DEVICE)));
        arrayList.add(h.b("device-brand", i(Build.BRAND)));
        arrayList.add(h.c("android-target-sdk", new h.a() { // from class: y0.h
            @Override // h1.h.a
            public final String a(Object obj) {
                String e8;
                e8 = FirebaseCommonRegistrar.e((Context) obj);
                return e8;
            }
        }));
        arrayList.add(h.c("android-min-sdk", new h.a() { // from class: y0.i
            @Override // h1.h.a
            public final String a(Object obj) {
                String f8;
                f8 = FirebaseCommonRegistrar.f((Context) obj);
                return f8;
            }
        }));
        arrayList.add(h.c("android-platform", new h.a() { // from class: y0.j
            @Override // h1.h.a
            public final String a(Object obj) {
                String g8;
                g8 = FirebaseCommonRegistrar.g((Context) obj);
                return g8;
            }
        }));
        arrayList.add(h.c("android-installer", new h.a() { // from class: y0.k
            @Override // h1.h.a
            public final String a(Object obj) {
                String h8;
                h8 = FirebaseCommonRegistrar.h((Context) obj);
                return h8;
            }
        }));
        String a8 = e.a();
        if (a8 != null) {
            arrayList.add(h.b("kotlin", a8));
        }
        return arrayList;
    }
}
