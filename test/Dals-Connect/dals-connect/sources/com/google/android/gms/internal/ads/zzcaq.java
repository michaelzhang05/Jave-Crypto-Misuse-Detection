package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import cm.aptoide.pt.account.AccountAnalytics;
import com.google.android.gms.ads.internal.zzk;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzcaq {
    private final zzbbl a;

    /* renamed from: b, reason: collision with root package name */
    private final zzcau f13811b;

    /* renamed from: c, reason: collision with root package name */
    private final zzcbd f13812c;

    public zzcaq(zzbbl zzbblVar, zzcau zzcauVar, zzcbd zzcbdVar) {
        this.a = zzbblVar;
        this.f13811b = zzcauVar;
        this.f13812c = zzcbdVar;
    }

    public final zzbbh<zzbyt> a(final zzcxu zzcxuVar, final zzcxm zzcxmVar, final JSONObject jSONObject) {
        zzbbh c2;
        final zzbbh submit = this.a.submit(new Callable(this, zzcxuVar, zzcxmVar, jSONObject) { // from class: com.google.android.gms.internal.ads.lg

            /* renamed from: f, reason: collision with root package name */
            private final zzcaq f11772f;

            /* renamed from: g, reason: collision with root package name */
            private final zzcxu f11773g;

            /* renamed from: h, reason: collision with root package name */
            private final zzcxm f11774h;

            /* renamed from: i, reason: collision with root package name */
            private final JSONObject f11775i;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f11772f = this;
                this.f11773g = zzcxuVar;
                this.f11774h = zzcxmVar;
                this.f11775i = jSONObject;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzcxu zzcxuVar2 = this.f11773g;
                zzcxm zzcxmVar2 = this.f11774h;
                JSONObject jSONObject2 = this.f11775i;
                zzbyt zzbytVar = new zzbyt();
                zzbytVar.M(jSONObject2.optInt("template_id", -1));
                zzbytVar.P(jSONObject2.optString("custom_template_id"));
                zzcxv zzcxvVar = zzcxuVar2.a.a;
                if (zzcxvVar.f14576g.contains(Integer.toString(zzbytVar.w()))) {
                    if (zzbytVar.w() == 3) {
                        if (zzbytVar.e() != null) {
                            if (!zzcxvVar.f14577h.contains(zzbytVar.e())) {
                                throw new zzcmw("Unexpected custom template id in the response.", 0);
                            }
                        } else {
                            throw new zzcmw("No custom template id for custom template ad response.", 0);
                        }
                    }
                    zzbytVar.o(jSONObject2.optDouble("rating", -1.0d));
                    String optString = jSONObject2.optString("headline", null);
                    if (zzcxmVar2.E) {
                        zzk.zzlg();
                        String m0 = zzaxi.m0();
                        StringBuilder sb = new StringBuilder(String.valueOf(m0).length() + 3 + String.valueOf(optString).length());
                        sb.append(m0);
                        sb.append(" : ");
                        sb.append(optString);
                        optString = sb.toString();
                    }
                    zzbytVar.T("headline", optString);
                    zzbytVar.T("body", jSONObject2.optString("body", null));
                    zzbytVar.T("call_to_action", jSONObject2.optString("call_to_action", null));
                    zzbytVar.T(AccountAnalytics.STORE, jSONObject2.optString(AccountAnalytics.STORE, null));
                    zzbytVar.T("price", jSONObject2.optString("price", null));
                    zzbytVar.T("advertiser", jSONObject2.optString("advertiser", null));
                    return zzbytVar;
                }
                int w = zzbytVar.w();
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append("Invalid template ID: ");
                sb2.append(w);
                throw new zzcmw(sb2.toString(), 0);
            }
        });
        final zzbbh<List<zzadw>> h2 = this.f13811b.h(jSONObject, "images");
        final zzbbh<zzadw> g2 = this.f13811b.g(jSONObject, "secondary_image");
        final zzbbh<zzadw> g3 = this.f13811b.g(jSONObject, "app_icon");
        final zzbbh<zzadt> i2 = this.f13811b.i(jSONObject, "attribution");
        final zzbbh<zzbgz> n = this.f13811b.n(jSONObject);
        final zzcau zzcauVar = this.f13811b;
        if (!jSONObject.optBoolean("enable_omid")) {
            c2 = zzbar.o(null);
        } else {
            JSONObject optJSONObject = jSONObject.optJSONObject("omid_settings");
            if (optJSONObject == null) {
                c2 = zzbar.o(null);
            } else {
                final String optString = optJSONObject.optString("omid_html");
                if (TextUtils.isEmpty(optString)) {
                    c2 = zzbar.o(null);
                } else {
                    c2 = zzbar.c(zzbar.o(null), new zzbal(zzcauVar, optString) { // from class: com.google.android.gms.internal.ads.qg
                        private final zzcau a;

                        /* renamed from: b, reason: collision with root package name */
                        private final String f12057b;

                        /* JADX INFO: Access modifiers changed from: package-private */
                        {
                            this.a = zzcauVar;
                            this.f12057b = optString;
                        }

                        @Override // com.google.android.gms.internal.ads.zzbal
                        public final zzbbh zzf(Object obj) {
                            return this.a.f(this.f12057b, obj);
                        }
                    }, zzbbm.a);
                }
            }
        }
        final zzbbh zzbbhVar = c2;
        final zzbbh<List<zzcbg>> a = this.f13812c.a(jSONObject, "custom_assets");
        return zzbar.a(submit, h2, g2, g3, i2, n, zzbbhVar, a).a(new Callable(this, submit, h2, g3, g2, i2, jSONObject, n, zzbbhVar, a) { // from class: com.google.android.gms.internal.ads.mg

            /* renamed from: f, reason: collision with root package name */
            private final zzcaq f11816f;

            /* renamed from: g, reason: collision with root package name */
            private final zzbbh f11817g;

            /* renamed from: h, reason: collision with root package name */
            private final zzbbh f11818h;

            /* renamed from: i, reason: collision with root package name */
            private final zzbbh f11819i;

            /* renamed from: j, reason: collision with root package name */
            private final zzbbh f11820j;

            /* renamed from: k, reason: collision with root package name */
            private final zzbbh f11821k;
            private final JSONObject l;
            private final zzbbh m;
            private final zzbbh n;
            private final zzbbh o;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f11816f = this;
                this.f11817g = submit;
                this.f11818h = h2;
                this.f11819i = g3;
                this.f11820j = g2;
                this.f11821k = i2;
                this.l = jSONObject;
                this.m = n;
                this.n = zzbbhVar;
                this.o = a;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzbbh zzbbhVar2 = this.f11817g;
                zzbbh zzbbhVar3 = this.f11818h;
                zzbbh zzbbhVar4 = this.f11819i;
                zzbbh zzbbhVar5 = this.f11820j;
                zzbbh zzbbhVar6 = this.f11821k;
                JSONObject jSONObject2 = this.l;
                zzbbh zzbbhVar7 = this.m;
                zzbbh zzbbhVar8 = this.n;
                zzbbh zzbbhVar9 = this.o;
                zzbyt zzbytVar = (zzbyt) zzbbhVar2.get();
                zzbytVar.n((List) zzbbhVar3.get());
                zzbytVar.u((zzaei) zzbbhVar4.get());
                zzbytVar.L((zzaei) zzbbhVar5.get());
                zzbytVar.t((zzaea) zzbbhVar6.get());
                zzbytVar.N(zzcau.k(jSONObject2));
                zzbytVar.s(zzcau.l(jSONObject2));
                zzbgz zzbgzVar = (zzbgz) zzbbhVar7.get();
                if (zzbgzVar != null) {
                    zzbytVar.R(zzbgzVar);
                    zzbytVar.Z(zzbgzVar.getView());
                    zzbytVar.K(zzbgzVar.h());
                }
                zzbgz zzbgzVar2 = (zzbgz) zzbbhVar8.get();
                if (zzbgzVar2 != null) {
                    zzbytVar.S(zzbgzVar2);
                }
                for (zzcbg zzcbgVar : (List) zzbbhVar9.get()) {
                    int i3 = zzcbgVar.a;
                    if (i3 == 1) {
                        zzbytVar.T(zzcbgVar.f13834b, zzcbgVar.f13835c);
                    } else if (i3 == 2) {
                        zzbytVar.v(zzcbgVar.f13834b, zzcbgVar.f13836d);
                    }
                }
                return zzbytVar;
            }
        }, this.a);
    }
}
