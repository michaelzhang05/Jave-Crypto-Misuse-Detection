package com.google.android.gms.auth;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import com.google.android.gms.common.logging.Logger;

/* loaded from: classes2.dex */
public class zzd {

    /* renamed from: b, reason: collision with root package name */
    @SuppressLint({"InlinedApi"})
    public static final String f10470b = "callerUid";

    /* renamed from: c, reason: collision with root package name */
    @SuppressLint({"InlinedApi"})
    public static final String f10471c = "androidPackageName";
    private static final String[] a = {"com.google", "com.google.work", "cn.google"};

    /* renamed from: d, reason: collision with root package name */
    private static final ComponentName f10472d = new ComponentName("com.google.android.gms", "com.google.android.gms.auth.GetToken");

    /* renamed from: e, reason: collision with root package name */
    private static final Logger f10473e = new Logger("Auth", "GoogleAuthUtil");
}
