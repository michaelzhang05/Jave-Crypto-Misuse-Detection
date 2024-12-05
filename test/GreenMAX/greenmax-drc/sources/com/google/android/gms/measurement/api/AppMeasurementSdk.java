package com.google.android.gms.measurement.api;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.internal.measurement.zzea;
import com.google.android.gms.measurement.internal.zzcx;
import com.google.android.gms.measurement.internal.zzcy;
import java.util.List;
import java.util.Map;

@KeepForSdk
/* loaded from: classes2.dex */
public class AppMeasurementSdk {
    private final zzea a;

    @KeepForSdk
    /* loaded from: classes2.dex */
    public static final class ConditionalUserProperty {
        private ConditionalUserProperty() {
        }
    }

    @ShowFirstParty
    @KeepForSdk
    /* loaded from: classes2.dex */
    public interface EventInterceptor extends zzcx {
    }

    @ShowFirstParty
    @KeepForSdk
    /* loaded from: classes2.dex */
    public interface OnEventListener extends zzcy {
    }

    public AppMeasurementSdk(zzea zzeaVar) {
        this.a = zzeaVar;
    }

    @KeepForSdk
    public static AppMeasurementSdk k(Context context, String str, String str2, String str3, Bundle bundle) {
        return zzea.q(context, str, str2, str3, bundle).G();
    }

    @KeepForSdk
    public void a(String str) {
        this.a.a(str);
    }

    @KeepForSdk
    public void b(String str, String str2, Bundle bundle) {
        this.a.b(str, str2, bundle);
    }

    @KeepForSdk
    public void c(String str) {
        this.a.c(str);
    }

    @KeepForSdk
    public long d() {
        return this.a.d();
    }

    @KeepForSdk
    public String e() {
        return this.a.e();
    }

    @KeepForSdk
    public String f() {
        return this.a.I();
    }

    @KeepForSdk
    public List<Bundle> g(String str, String str2) {
        return this.a.f(str, str2);
    }

    @KeepForSdk
    public String h() {
        return this.a.g();
    }

    @KeepForSdk
    public String i() {
        return this.a.h();
    }

    @KeepForSdk
    public String j() {
        return this.a.i();
    }

    @KeepForSdk
    public int l(String str) {
        return this.a.j(str);
    }

    @KeepForSdk
    public Map<String, Object> m(String str, String str2, boolean z) {
        return this.a.k(str, str2, z);
    }

    @KeepForSdk
    public void n(String str, String str2, Bundle bundle) {
        this.a.l(str, str2, bundle);
    }

    @KeepForSdk
    public void o(Bundle bundle) {
        this.a.o(bundle, false);
    }

    @KeepForSdk
    public Bundle p(Bundle bundle) {
        return this.a.o(bundle, true);
    }

    @KeepForSdk
    public void q(Bundle bundle) {
        this.a.m(bundle);
    }

    @KeepForSdk
    public void r(Activity activity, String str, String str2) {
        this.a.n(activity, str, str2);
    }

    @KeepForSdk
    public void s(String str, String str2, Object obj) {
        this.a.x(str, str2, obj, true);
    }
}
