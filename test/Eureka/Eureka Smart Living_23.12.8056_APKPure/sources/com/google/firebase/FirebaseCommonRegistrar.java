package com.google.firebase;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentRegistrar;
import i4.f;
import java.util.ArrayList;
import java.util.List;
import s4.c;
import s4.e;
import s4.h;

/* loaded from: classes.dex */
public class FirebaseCommonRegistrar implements ComponentRegistrar {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String e(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return applicationInfo != null ? String.valueOf(applicationInfo.targetSdkVersion) : "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String f(Context context) {
        int i6;
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (applicationInfo == null || Build.VERSION.SDK_INT < 24) {
            return "";
        }
        i6 = applicationInfo.minSdkVersion;
        return String.valueOf(i6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String g(Context context) {
        int i6 = Build.VERSION.SDK_INT;
        return context.getPackageManager().hasSystemFeature("android.hardware.type.television") ? "tv" : context.getPackageManager().hasSystemFeature("android.hardware.type.watch") ? "watch" : (i6 < 23 || !context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) ? (i6 < 26 || !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) ? "" : "embedded" : "auto";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String h(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        return installerPackageName != null ? i(installerPackageName) : "";
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
        arrayList.add(h.b("fire-core", "20.3.1"));
        arrayList.add(h.b("device-name", i(Build.PRODUCT)));
        arrayList.add(h.b("device-model", i(Build.DEVICE)));
        arrayList.add(h.b("device-brand", i(Build.BRAND)));
        arrayList.add(h.c("android-target-sdk", new h.a() { // from class: w3.g
            @Override // s4.h.a
            public final String a(Object obj) {
                String e6;
                e6 = FirebaseCommonRegistrar.e((Context) obj);
                return e6;
            }
        }));
        arrayList.add(h.c("android-min-sdk", new h.a() { // from class: w3.h
            @Override // s4.h.a
            public final String a(Object obj) {
                String f6;
                f6 = FirebaseCommonRegistrar.f((Context) obj);
                return f6;
            }
        }));
        arrayList.add(h.c("android-platform", new h.a() { // from class: w3.i
            @Override // s4.h.a
            public final String a(Object obj) {
                String g6;
                g6 = FirebaseCommonRegistrar.g((Context) obj);
                return g6;
            }
        }));
        arrayList.add(h.c("android-installer", new h.a() { // from class: w3.j
            @Override // s4.h.a
            public final String a(Object obj) {
                String h6;
                h6 = FirebaseCommonRegistrar.h((Context) obj);
                return h6;
            }
        }));
        String a6 = e.a();
        if (a6 != null) {
            arrayList.add(h.b("kotlin", a6));
        }
        return arrayList;
    }
}
