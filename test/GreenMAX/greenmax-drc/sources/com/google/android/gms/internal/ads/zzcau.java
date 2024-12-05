package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.text.TextUtils;
import cm.aptoide.pt.root.execution.Command;
import com.google.android.gms.ads.internal.zzk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzcau {
    private final Context a;

    /* renamed from: b, reason: collision with root package name */
    private final zzcan f13815b;

    /* renamed from: c, reason: collision with root package name */
    private final zzdh f13816c;

    /* renamed from: d, reason: collision with root package name */
    private final zzbai f13817d;

    /* renamed from: e, reason: collision with root package name */
    private final com.google.android.gms.ads.internal.zza f13818e;

    /* renamed from: f, reason: collision with root package name */
    private final zzwj f13819f;

    /* renamed from: g, reason: collision with root package name */
    private final Executor f13820g;

    /* renamed from: h, reason: collision with root package name */
    private final zzady f13821h;

    /* renamed from: i, reason: collision with root package name */
    private final zzcbi f13822i;

    /* renamed from: j, reason: collision with root package name */
    private final ScheduledExecutorService f13823j;

    public zzcau(Context context, zzcan zzcanVar, zzdh zzdhVar, zzbai zzbaiVar, com.google.android.gms.ads.internal.zza zzaVar, zzwj zzwjVar, Executor executor, zzcxv zzcxvVar, zzcbi zzcbiVar, ScheduledExecutorService scheduledExecutorService) {
        this.a = context;
        this.f13815b = zzcanVar;
        this.f13816c = zzdhVar;
        this.f13817d = zzbaiVar;
        this.f13818e = zzaVar;
        this.f13819f = zzwjVar;
        this.f13820g = executor;
        this.f13821h = zzcxvVar.f14578i;
        this.f13822i = zzcbiVar;
        this.f13823j = scheduledExecutorService;
    }

    private static <T> zzbbh<T> b(zzbbh<T> zzbbhVar, T t) {
        final Object obj = null;
        return zzbar.e(zzbbhVar, Exception.class, new zzbal(obj) { // from class: com.google.android.gms.internal.ads.rg
            private final Object a;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.a = obj;
            }

            @Override // com.google.android.gms.internal.ads.zzbal
            public final zzbbh zzf(Object obj2) {
                Object obj3 = this.a;
                zzawz.l("Error during loading assets.", (Exception) obj2);
                return zzbar.o(obj3);
            }
        }, zzbbm.f13155b);
    }

    private final zzbbh<List<zzadw>> c(JSONArray jSONArray, boolean z, boolean z2) {
        if (jSONArray != null && jSONArray.length() > 0) {
            ArrayList arrayList = new ArrayList();
            int length = z2 ? jSONArray.length() : 1;
            for (int i2 = 0; i2 < length; i2++) {
                arrayList.add(d(jSONArray.optJSONObject(i2), z));
            }
            return zzbar.d(zzbar.m(arrayList), ng.a, this.f13820g);
        }
        return zzbar.o(Collections.emptyList());
    }

    private final zzbbh<zzadw> d(JSONObject jSONObject, boolean z) {
        if (jSONObject == null) {
            return zzbar.o(null);
        }
        final String optString = jSONObject.optString("url");
        if (TextUtils.isEmpty(optString)) {
            return zzbar.o(null);
        }
        final double optDouble = jSONObject.optDouble("scale", 1.0d);
        boolean optBoolean = jSONObject.optBoolean("is_transparent", true);
        final int optInt = jSONObject.optInt("width", -1);
        final int optInt2 = jSONObject.optInt("height", -1);
        if (z) {
            return zzbar.o(new zzadw(null, Uri.parse(optString), optDouble, optInt, optInt2));
        }
        return e(jSONObject.optBoolean("require"), zzbar.d(this.f13815b.d(optString, optDouble, optBoolean), new zzbam(optString, optDouble, optInt, optInt2) { // from class: com.google.android.gms.internal.ads.og
            private final String a;

            /* renamed from: b, reason: collision with root package name */
            private final double f11935b;

            /* renamed from: c, reason: collision with root package name */
            private final int f11936c;

            /* renamed from: d, reason: collision with root package name */
            private final int f11937d;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.a = optString;
                this.f11935b = optDouble;
                this.f11936c = optInt;
                this.f11937d = optInt2;
            }

            @Override // com.google.android.gms.internal.ads.zzbam
            public final Object a(Object obj) {
                String str = this.a;
                return new zzadw(new BitmapDrawable(Resources.getSystem(), (Bitmap) obj), Uri.parse(str), this.f11935b, this.f11936c, this.f11937d);
            }
        }, this.f13820g), null);
    }

    private static <T> zzbbh<T> e(boolean z, final zzbbh<T> zzbbhVar, T t) {
        if (z) {
            return zzbar.c(zzbbhVar, new zzbal(zzbbhVar) { // from class: com.google.android.gms.internal.ads.tg
                private final zzbbh a;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.a = zzbbhVar;
                }

                @Override // com.google.android.gms.internal.ads.zzbal
                public final zzbbh zzf(Object obj) {
                    return obj != null ? this.a : zzbar.l(new zzcmw("Retrieve required value in native ad response failed.", 0));
                }
            }, zzbbm.f13155b);
        }
        return b(zzbbhVar, null);
    }

    private static Integer j(JSONObject jSONObject, String str) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            return Integer.valueOf(Color.rgb(jSONObject2.getInt("r"), jSONObject2.getInt("g"), jSONObject2.getInt("b")));
        } catch (JSONException unused) {
            return null;
        }
    }

    public static List<zzabj> k(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("mute");
        if (optJSONObject == null) {
            return Collections.emptyList();
        }
        JSONArray optJSONArray = optJSONObject.optJSONArray("reasons");
        if (optJSONArray != null && optJSONArray.length() > 0) {
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                zzabj m = m(optJSONArray.optJSONObject(i2));
                if (m != null) {
                    arrayList.add(m);
                }
            }
            return arrayList;
        }
        return Collections.emptyList();
    }

    public static zzabj l(JSONObject jSONObject) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2 = jSONObject.optJSONObject("mute");
        if (optJSONObject2 == null || (optJSONObject = optJSONObject2.optJSONObject("default_reason")) == null) {
            return null;
        }
        return m(optJSONObject);
    }

    private static zzabj m(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String optString = jSONObject.optString("reason");
        String optString2 = jSONObject.optString("ping_url");
        if (TextUtils.isEmpty(optString) || TextUtils.isEmpty(optString2)) {
            return null;
        }
        return new zzabj(optString, optString2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzadt a(JSONObject jSONObject, List list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        String optString = jSONObject.optString(Command.CommandHandler.TEXT);
        Integer j2 = j(jSONObject, "bg_color");
        Integer j3 = j(jSONObject, "text_color");
        int optInt = jSONObject.optInt("text_size", -1);
        boolean optBoolean = jSONObject.optBoolean("allow_pub_rendering");
        int optInt2 = jSONObject.optInt("animation_ms", 1000);
        return new zzadt(optString, list, j2, j3, optInt > 0 ? Integer.valueOf(optInt) : null, jSONObject.optInt("presentation_ms", 4000) + optInt2, this.f13821h.f12673j, optBoolean);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzbbh f(String str, Object obj) throws Exception {
        zzk.zzlh();
        zzbgz b2 = zzbhf.b(this.a, zzbin.b(), "native-omid", false, false, this.f13816c, this.f13817d, null, null, this.f13818e, this.f13819f);
        final zzbbq g2 = zzbbq.g(b2);
        b2.p().i(new zzbij(g2) { // from class: com.google.android.gms.internal.ads.ug
            private final zzbbq a;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.a = g2;
            }

            @Override // com.google.android.gms.internal.ads.zzbij
            public final void zzae(boolean z) {
                this.a.h();
            }
        });
        b2.loadData(str, "text/html", "UTF-8");
        return g2;
    }

    public final zzbbh<zzadw> g(JSONObject jSONObject, String str) {
        return d(jSONObject.optJSONObject(str), this.f13821h.f12670g);
    }

    public final zzbbh<List<zzadw>> h(JSONObject jSONObject, String str) {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        zzady zzadyVar = this.f13821h;
        return c(optJSONArray, zzadyVar.f12670g, zzadyVar.f12672i);
    }

    public final zzbbh<zzadt> i(JSONObject jSONObject, String str) {
        final JSONObject optJSONObject = jSONObject.optJSONObject(str);
        if (optJSONObject == null) {
            return zzbar.o(null);
        }
        JSONArray optJSONArray = optJSONObject.optJSONArray("images");
        JSONObject optJSONObject2 = optJSONObject.optJSONObject("image");
        if (optJSONArray == null && optJSONObject2 != null) {
            optJSONArray = new JSONArray();
            optJSONArray.put(optJSONObject2);
        }
        return e(optJSONObject.optBoolean("require"), zzbar.d(c(optJSONArray, false, true), new zzbam(this, optJSONObject) { // from class: com.google.android.gms.internal.ads.pg
            private final zzcau a;

            /* renamed from: b, reason: collision with root package name */
            private final JSONObject f11988b;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.a = this;
                this.f11988b = optJSONObject;
            }

            @Override // com.google.android.gms.internal.ads.zzbam
            public final Object a(Object obj) {
                return this.a.a(this.f11988b, (List) obj);
            }
        }, this.f13820g), null);
    }

    public final zzbbh<zzbgz> n(JSONObject jSONObject) {
        JSONObject e2 = zzazc.e(jSONObject, "html_containers", "instream");
        if (e2 == null) {
            JSONObject optJSONObject = jSONObject.optJSONObject("video");
            if (optJSONObject == null) {
                return zzbar.o(null);
            }
            if (TextUtils.isEmpty(optJSONObject.optString("vast_xml"))) {
                zzbad.i("Required field 'vast_xml' is missing");
                return zzbar.o(null);
            }
            return b(zzbar.b(this.f13822i.f(optJSONObject), ((Integer) zzyt.e().c(zzacu.L2)).intValue(), TimeUnit.SECONDS, this.f13823j), null);
        }
        return e(e2.optBoolean("require"), this.f13822i.g(e2.optString("base_url"), e2.optString("html")), null);
    }
}
