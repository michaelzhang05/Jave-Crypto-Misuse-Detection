package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class g0 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f5903a;

    /* renamed from: b, reason: collision with root package name */
    private String f5904b;

    /* renamed from: c, reason: collision with root package name */
    private String f5905c;

    /* renamed from: d, reason: collision with root package name */
    private int f5906d;

    /* renamed from: e, reason: collision with root package name */
    private int f5907e = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g0(Context context) {
        this.f5903a = context;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String c(w3.e eVar) {
        String d6 = eVar.m().d();
        if (d6 != null) {
            return d6;
        }
        String c6 = eVar.m().c();
        if (!c6.startsWith("1:")) {
            return c6;
        }
        String[] split = c6.split(":");
        if (split.length < 2) {
            return null;
        }
        String str = split[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    private PackageInfo f(String str) {
        try {
            return this.f5903a.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e6) {
            Log.w("FirebaseMessaging", "Failed to find package " + e6);
            return null;
        }
    }

    private synchronized void h() {
        PackageInfo f6 = f(this.f5903a.getPackageName());
        if (f6 != null) {
            this.f5904b = Integer.toString(f6.versionCode);
            this.f5905c = f6.versionName;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized String a() {
        if (this.f5904b == null) {
            h();
        }
        return this.f5904b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized String b() {
        if (this.f5905c == null) {
            h();
        }
        return this.f5905c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized int d() {
        PackageInfo f6;
        if (this.f5906d == 0 && (f6 = f("com.google.android.gms")) != null) {
            this.f5906d = f6.versionCode;
        }
        return this.f5906d;
    }

    synchronized int e() {
        int i6 = this.f5907e;
        if (i6 != 0) {
            return i6;
        }
        PackageManager packageManager = this.f5903a.getPackageManager();
        if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("FirebaseMessaging", "Google Play services missing or without correct permission.");
            return 0;
        }
        if (!z1.i.g()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && queryIntentServices.size() > 0) {
                this.f5907e = 1;
                return 1;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers != null && queryBroadcastReceivers.size() > 0) {
            this.f5907e = 2;
            return 2;
        }
        Log.w("FirebaseMessaging", "Failed to resolve IID implementation package, falling back");
        if (z1.i.g()) {
            this.f5907e = 2;
        } else {
            this.f5907e = 1;
        }
        return this.f5907e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean g() {
        return e() != 0;
    }
}
