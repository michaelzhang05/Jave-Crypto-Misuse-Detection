package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import okhttp3.HttpUrl;
import org.json.JSONArray;

/* loaded from: classes2.dex */
public final class zzcul implements zzcva<zzcuk> {
    private final zzbbl a;

    /* renamed from: b, reason: collision with root package name */
    private final ScheduledExecutorService f14459b;

    /* renamed from: c, reason: collision with root package name */
    private final List<zzcpk> f14460c;

    /* renamed from: d, reason: collision with root package name */
    private final Context f14461d;

    /* renamed from: e, reason: collision with root package name */
    private final zzcxv f14462e;

    /* renamed from: f, reason: collision with root package name */
    private String f14463f;

    public zzcul(zzbbl zzbblVar, ScheduledExecutorService scheduledExecutorService, String str, zzcpf zzcpfVar, Context context, zzcxv zzcxvVar) {
        this.a = zzbblVar;
        this.f14459b = scheduledExecutorService;
        this.f14463f = str;
        this.f14461d = context;
        this.f14462e = zzcxvVar;
        if (zzcpfVar.b().containsKey(zzcxvVar.f14575f)) {
            this.f14460c = zzcpfVar.b().get(zzcxvVar.f14575f);
        } else {
            this.f14460c = Collections.emptyList();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final /* synthetic */ zzcuk d(List list) throws Exception {
        JSONArray jSONArray = new JSONArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            try {
                jSONArray.put(((zzbbh) it.next()).get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        if (jSONArray.length() == 0) {
            return null;
        }
        return new zzcuk(jSONArray.toString());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void a(zzcpk zzcpkVar, Bundle bundle, zzcpl zzcplVar, zzbbr zzbbrVar) {
        try {
            zzcpkVar.f14320d.p3(ObjectWrapper.i0(this.f14461d), this.f14463f, bundle, zzcpkVar.f14319c, this.f14462e.f14574e, zzcplVar);
        } catch (Exception e2) {
            zzbbrVar.c(new Exception("Error calling adapter"));
            zzbad.c(HttpUrl.FRAGMENT_ENCODE_SET, e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcva
    public final zzbbh<zzcuk> b() {
        if (((Boolean) zzyt.e().c(zzacu.a2)).booleanValue()) {
            return zzbar.c(this.a.submit(new Callable(this) { // from class: com.google.android.gms.internal.ads.to

                /* renamed from: f, reason: collision with root package name */
                private final zzcul f12203f;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.f12203f = this;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f12203f.c();
                }
            }), new zzbal(this) { // from class: com.google.android.gms.internal.ads.uo
                private final zzcul a;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.a = this;
                }

                @Override // com.google.android.gms.internal.ads.zzbal
                public final zzbbh zzf(Object obj) {
                    return this.a.e((List) obj);
                }
            }, this.a);
        }
        return zzbar.o(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ List c() throws Exception {
        ArrayList arrayList = new ArrayList();
        for (final zzcpk zzcpkVar : this.f14460c) {
            final zzbbr zzbbrVar = new zzbbr();
            final zzcpl zzcplVar = new zzcpl(zzcpkVar, zzbbrVar);
            Bundle bundle = this.f14462e.f14573d.r;
            final Bundle bundle2 = bundle != null ? bundle.getBundle(zzcpkVar.a) : null;
            arrayList.add(zzbar.b(zzbbrVar, ((Long) zzyt.e().c(zzacu.Z1)).longValue(), TimeUnit.MILLISECONDS, this.f14459b));
            this.a.execute(new Runnable(this, zzcpkVar, bundle2, zzcplVar, zzbbrVar) { // from class: com.google.android.gms.internal.ads.vo

                /* renamed from: f, reason: collision with root package name */
                private final zzcul f12291f;

                /* renamed from: g, reason: collision with root package name */
                private final zzcpk f12292g;

                /* renamed from: h, reason: collision with root package name */
                private final Bundle f12293h;

                /* renamed from: i, reason: collision with root package name */
                private final zzcpl f12294i;

                /* renamed from: j, reason: collision with root package name */
                private final zzbbr f12295j;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.f12291f = this;
                    this.f12292g = zzcpkVar;
                    this.f12293h = bundle2;
                    this.f12294i = zzcplVar;
                    this.f12295j = zzbbrVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f12291f.a(this.f12292g, this.f12293h, this.f12294i, this.f12295j);
                }
            });
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzbbh e(final List list) throws Exception {
        return zzbar.n(list).a(new Callable(list) { // from class: com.google.android.gms.internal.ads.wo

            /* renamed from: f, reason: collision with root package name */
            private final List f12340f;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f12340f = list;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzcul.d(this.f12340f);
            }
        }, this.a);
    }
}
