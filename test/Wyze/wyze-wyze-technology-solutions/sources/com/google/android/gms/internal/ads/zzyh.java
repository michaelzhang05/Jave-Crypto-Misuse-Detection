package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashMap;

@zzard
/* loaded from: classes2.dex */
public class zzyh {
    private final zzxx a;

    /* renamed from: b, reason: collision with root package name */
    private final zzxw f15818b;

    /* renamed from: c, reason: collision with root package name */
    private final zzabk f15819c;

    /* renamed from: d, reason: collision with root package name */
    private final zzagk f15820d;

    /* renamed from: e, reason: collision with root package name */
    private final zzatf f15821e;

    /* renamed from: f, reason: collision with root package name */
    private final zzauj f15822f;

    /* renamed from: g, reason: collision with root package name */
    private final zzaqf f15823g;

    /* renamed from: h, reason: collision with root package name */
    private final zzagl f15824h;

    public zzyh(zzxx zzxxVar, zzxw zzxwVar, zzabk zzabkVar, zzagk zzagkVar, zzatf zzatfVar, zzauj zzaujVar, zzaqf zzaqfVar, zzagl zzaglVar) {
        this.a = zzxxVar;
        this.f15818b = zzxwVar;
        this.f15819c = zzabkVar;
        this.f15820d = zzagkVar;
        this.f15821e = zzatfVar;
        this.f15822f = zzaujVar;
        this.f15823g = zzaqfVar;
        this.f15824h = zzaglVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(Context context, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("action", "no_ads_fallback");
        bundle.putString("flow", str);
        zzyt.a().d(context, zzyt.g().f13150f, "gmob-apps", bundle, true);
    }

    public final zzaem a(Context context, FrameLayout frameLayout, FrameLayout frameLayout2) {
        return new e60(this, frameLayout, frameLayout2, context).b(context, false);
    }

    public final zzaer b(View view, HashMap<String, View> hashMap, HashMap<String, View> hashMap2) {
        return new f60(this, view, hashMap, hashMap2).b(view.getContext(), false);
    }

    public final zzaqg e(Activity activity) {
        z50 z50Var = new z50(this, activity);
        Intent intent = activity.getIntent();
        boolean z = false;
        if (!intent.hasExtra("com.google.android.gms.ads.internal.overlay.useClientJar")) {
            zzbad.g("useClientJar flag not found in activity intent extras.");
        } else {
            z = intent.getBooleanExtra("com.google.android.gms.ads.internal.overlay.useClientJar", false);
        }
        return z50Var.b(activity, z);
    }

    public final zzzf g(Context context, String str, zzamp zzampVar) {
        return new c60(this, context, str, zzampVar).b(context, false);
    }

    public final zzatt j(Context context, String str, zzamp zzampVar) {
        return new h60(this, context, str, zzampVar).b(context, false);
    }
}
