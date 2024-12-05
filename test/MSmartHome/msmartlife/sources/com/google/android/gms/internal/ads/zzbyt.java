package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import cm.aptoide.pt.account.AccountAnalytics;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzbyt {
    private int a;

    /* renamed from: b, reason: collision with root package name */
    private zzaar f13696b;

    /* renamed from: c, reason: collision with root package name */
    private zzaea f13697c;

    /* renamed from: d, reason: collision with root package name */
    private View f13698d;

    /* renamed from: e, reason: collision with root package name */
    private List<zzadw> f13699e;

    /* renamed from: g, reason: collision with root package name */
    private zzabj f13701g;

    /* renamed from: h, reason: collision with root package name */
    private Bundle f13702h;

    /* renamed from: i, reason: collision with root package name */
    private zzbgz f13703i;

    /* renamed from: j, reason: collision with root package name */
    private zzbgz f13704j;

    /* renamed from: k, reason: collision with root package name */
    private IObjectWrapper f13705k;
    private View l;
    private IObjectWrapper m;
    private double n;
    private zzaei o;
    private zzaei p;
    private String q;
    private float t;
    private c.e.g<String, zzadw> r = new c.e.g<>();
    private c.e.g<String, String> s = new c.e.g<>();

    /* renamed from: f, reason: collision with root package name */
    private List<zzabj> f13700f = Collections.emptyList();

    private static <T> T G(IObjectWrapper iObjectWrapper) {
        if (iObjectWrapper == null) {
            return null;
        }
        return (T) ObjectWrapper.R(iObjectWrapper);
    }

    public static zzbyt H(zzana zzanaVar) {
        try {
            return p(zzanaVar.getVideoController(), zzanaVar.a(), (View) G(zzanaVar.x()), zzanaVar.b(), zzanaVar.f(), zzanaVar.d(), zzanaVar.getExtras(), zzanaVar.c(), (View) G(zzanaVar.v()), zzanaVar.e(), zzanaVar.getStore(), zzanaVar.i(), zzanaVar.l(), zzanaVar.h(), null, 0.0f);
        } catch (RemoteException e2) {
            zzbad.d("Failed to get native ad assets from app install ad mapper", e2);
            return null;
        }
    }

    public static zzbyt I(zzand zzandVar) {
        try {
            return p(zzandVar.getVideoController(), zzandVar.a(), (View) G(zzandVar.x()), zzandVar.b(), zzandVar.f(), zzandVar.d(), zzandVar.getExtras(), zzandVar.c(), (View) G(zzandVar.v()), zzandVar.e(), null, null, -1.0d, zzandVar.h0(), zzandVar.m(), 0.0f);
        } catch (RemoteException e2) {
            zzbad.d("Failed to get native ad assets from content ad mapper", e2);
            return null;
        }
    }

    public static zzbyt J(zzang zzangVar) {
        try {
            return p(zzangVar.getVideoController(), zzangVar.a(), (View) G(zzangVar.x()), zzangVar.b(), zzangVar.f(), zzangVar.d(), zzangVar.getExtras(), zzangVar.c(), (View) G(zzangVar.v()), zzangVar.e(), zzangVar.getStore(), zzangVar.i(), zzangVar.l(), zzangVar.h(), zzangVar.m(), zzangVar.W3());
        } catch (RemoteException e2) {
            zzbad.d("Failed to get native ad assets from unified ad mapper", e2);
            return null;
        }
    }

    private final synchronized void O(float f2) {
        this.t = f2;
    }

    private final synchronized String Q(String str) {
        return this.s.get(str);
    }

    private static zzbyt p(zzaar zzaarVar, zzaea zzaeaVar, View view, String str, List list, String str2, Bundle bundle, String str3, View view2, IObjectWrapper iObjectWrapper, String str4, String str5, double d2, zzaei zzaeiVar, String str6, float f2) {
        zzbyt zzbytVar = new zzbyt();
        zzbytVar.a = 6;
        zzbytVar.f13696b = zzaarVar;
        zzbytVar.f13697c = zzaeaVar;
        zzbytVar.f13698d = view;
        zzbytVar.T("headline", str);
        zzbytVar.f13699e = list;
        zzbytVar.T("body", str2);
        zzbytVar.f13702h = bundle;
        zzbytVar.T("call_to_action", str3);
        zzbytVar.l = view2;
        zzbytVar.m = iObjectWrapper;
        zzbytVar.T(AccountAnalytics.STORE, str4);
        zzbytVar.T("price", str5);
        zzbytVar.n = d2;
        zzbytVar.o = zzaeiVar;
        zzbytVar.T("advertiser", str6);
        zzbytVar.O(f2);
        return zzbytVar;
    }

    public static zzbyt q(zzana zzanaVar) {
        try {
            zzaar videoController = zzanaVar.getVideoController();
            zzaea a = zzanaVar.a();
            View view = (View) G(zzanaVar.x());
            String b2 = zzanaVar.b();
            List<zzadw> f2 = zzanaVar.f();
            String d2 = zzanaVar.d();
            Bundle extras = zzanaVar.getExtras();
            String c2 = zzanaVar.c();
            View view2 = (View) G(zzanaVar.v());
            IObjectWrapper e2 = zzanaVar.e();
            String store = zzanaVar.getStore();
            String i2 = zzanaVar.i();
            double l = zzanaVar.l();
            zzaei h2 = zzanaVar.h();
            zzbyt zzbytVar = new zzbyt();
            zzbytVar.a = 2;
            zzbytVar.f13696b = videoController;
            zzbytVar.f13697c = a;
            zzbytVar.f13698d = view;
            zzbytVar.T("headline", b2);
            zzbytVar.f13699e = f2;
            zzbytVar.T("body", d2);
            zzbytVar.f13702h = extras;
            zzbytVar.T("call_to_action", c2);
            zzbytVar.l = view2;
            zzbytVar.m = e2;
            zzbytVar.T(AccountAnalytics.STORE, store);
            zzbytVar.T("price", i2);
            zzbytVar.n = l;
            zzbytVar.o = h2;
            return zzbytVar;
        } catch (RemoteException e3) {
            zzbad.d("Failed to get native ad from app install ad mapper", e3);
            return null;
        }
    }

    public static zzbyt r(zzand zzandVar) {
        try {
            zzaar videoController = zzandVar.getVideoController();
            zzaea a = zzandVar.a();
            View view = (View) G(zzandVar.x());
            String b2 = zzandVar.b();
            List<zzadw> f2 = zzandVar.f();
            String d2 = zzandVar.d();
            Bundle extras = zzandVar.getExtras();
            String c2 = zzandVar.c();
            View view2 = (View) G(zzandVar.v());
            IObjectWrapper e2 = zzandVar.e();
            String m = zzandVar.m();
            zzaei h0 = zzandVar.h0();
            zzbyt zzbytVar = new zzbyt();
            zzbytVar.a = 1;
            zzbytVar.f13696b = videoController;
            zzbytVar.f13697c = a;
            zzbytVar.f13698d = view;
            zzbytVar.T("headline", b2);
            zzbytVar.f13699e = f2;
            zzbytVar.T("body", d2);
            zzbytVar.f13702h = extras;
            zzbytVar.T("call_to_action", c2);
            zzbytVar.l = view2;
            zzbytVar.m = e2;
            zzbytVar.T("advertiser", m);
            zzbytVar.p = h0;
            return zzbytVar;
        } catch (RemoteException e3) {
            zzbad.d("Failed to get native ad from content ad mapper", e3);
            return null;
        }
    }

    public final synchronized zzbgz A() {
        return this.f13703i;
    }

    public final synchronized zzbgz B() {
        return this.f13704j;
    }

    public final synchronized IObjectWrapper C() {
        return this.f13705k;
    }

    public final synchronized c.e.g<String, zzadw> D() {
        return this.r;
    }

    public final synchronized c.e.g<String, String> E() {
        return this.s;
    }

    public final synchronized void F(IObjectWrapper iObjectWrapper) {
        this.f13705k = iObjectWrapper;
    }

    public final synchronized void K(zzaar zzaarVar) {
        this.f13696b = zzaarVar;
    }

    public final synchronized void L(zzaei zzaeiVar) {
        this.p = zzaeiVar;
    }

    public final synchronized void M(int i2) {
        this.a = i2;
    }

    public final synchronized void N(List<zzabj> list) {
        this.f13700f = list;
    }

    public final synchronized void P(String str) {
        this.q = str;
    }

    public final synchronized void R(zzbgz zzbgzVar) {
        this.f13703i = zzbgzVar;
    }

    public final synchronized void S(zzbgz zzbgzVar) {
        this.f13704j = zzbgzVar;
    }

    public final synchronized void T(String str, String str2) {
        if (str2 == null) {
            this.s.remove(str);
        } else {
            this.s.put(str, str2);
        }
    }

    public final synchronized zzaei U() {
        return this.o;
    }

    public final synchronized zzaea V() {
        return this.f13697c;
    }

    public final synchronized IObjectWrapper W() {
        return this.m;
    }

    public final synchronized zzaei X() {
        return this.p;
    }

    public final synchronized float Y() {
        return this.t;
    }

    public final synchronized void Z(View view) {
        this.l = view;
    }

    public final synchronized void a() {
        zzbgz zzbgzVar = this.f13703i;
        if (zzbgzVar != null) {
            zzbgzVar.destroy();
            this.f13703i = null;
        }
        zzbgz zzbgzVar2 = this.f13704j;
        if (zzbgzVar2 != null) {
            zzbgzVar2.destroy();
            this.f13704j = null;
        }
        this.f13705k = null;
        this.r.clear();
        this.s.clear();
        this.f13696b = null;
        this.f13697c = null;
        this.f13698d = null;
        this.f13699e = null;
        this.f13702h = null;
        this.l = null;
        this.m = null;
        this.o = null;
        this.p = null;
        this.q = null;
    }

    public final synchronized String b() {
        return Q("advertiser");
    }

    public final synchronized String c() {
        return Q("body");
    }

    public final synchronized String d() {
        return Q("call_to_action");
    }

    public final synchronized String e() {
        return this.q;
    }

    public final synchronized Bundle f() {
        if (this.f13702h == null) {
            this.f13702h = new Bundle();
        }
        return this.f13702h;
    }

    public final synchronized String g() {
        return Q("headline");
    }

    public final synchronized List<zzadw> h() {
        return this.f13699e;
    }

    public final synchronized List<zzabj> i() {
        return this.f13700f;
    }

    public final synchronized String j() {
        return Q("price");
    }

    public final synchronized double k() {
        return this.n;
    }

    public final synchronized String l() {
        return Q(AccountAnalytics.STORE);
    }

    public final synchronized zzaar m() {
        return this.f13696b;
    }

    public final synchronized void n(List<zzadw> list) {
        this.f13699e = list;
    }

    public final synchronized void o(double d2) {
        this.n = d2;
    }

    public final synchronized void s(zzabj zzabjVar) {
        this.f13701g = zzabjVar;
    }

    public final synchronized void t(zzaea zzaeaVar) {
        this.f13697c = zzaeaVar;
    }

    public final synchronized void u(zzaei zzaeiVar) {
        this.o = zzaeiVar;
    }

    public final synchronized void v(String str, zzadw zzadwVar) {
        if (zzadwVar == null) {
            this.r.remove(str);
        } else {
            this.r.put(str, zzadwVar);
        }
    }

    public final synchronized int w() {
        return this.a;
    }

    public final synchronized View x() {
        return this.f13698d;
    }

    public final synchronized zzabj y() {
        return this.f13701g;
    }

    public final synchronized View z() {
        return this.l;
    }
}
