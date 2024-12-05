package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public final class zzdae {
    private final Executor a;

    /* renamed from: b, reason: collision with root package name */
    private final zzbah f14647b;

    /* renamed from: c, reason: collision with root package name */
    private final zzcmu f14648c;

    /* renamed from: d, reason: collision with root package name */
    private final String f14649d;

    /* renamed from: e, reason: collision with root package name */
    private final String f14650e;

    /* renamed from: f, reason: collision with root package name */
    private final String f14651f;

    /* renamed from: g, reason: collision with root package name */
    private final Context f14652g;

    /* renamed from: h, reason: collision with root package name */
    private final Clock f14653h;

    public zzdae(Executor executor, zzbah zzbahVar, zzcmu zzcmuVar, zzbai zzbaiVar, String str, String str2, Context context, Clock clock) {
        this.a = executor;
        this.f14647b = zzbahVar;
        this.f14648c = zzcmuVar;
        this.f14649d = zzbaiVar.f13150f;
        this.f14650e = str;
        this.f14651f = str2;
        this.f14652g = context;
        this.f14653h = clock;
    }

    private static String d(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str3)) {
            str3 = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        return str.replaceAll(str2, str3);
    }

    private static String f(String str) {
        return (TextUtils.isEmpty(str) || !zzazx.a()) ? str : "fakeForAdDebugLog";
    }

    public final void a(zzcxu zzcxuVar, zzcxm zzcxmVar, List<String> list) {
        c(zzcxuVar, zzcxmVar, false, list);
    }

    public final void b(zzcxu zzcxuVar, zzcxm zzcxmVar, List<String> list, zzasr zzasrVar) {
        long a = this.f14653h.a();
        try {
            String type = zzasrVar.getType();
            String num = Integer.toString(zzasrVar.getAmount());
            ArrayList arrayList = new ArrayList();
            String f2 = f(zzcxuVar.a.a.f14579j);
            String f3 = f(zzcxuVar.a.a.f14580k);
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(zzavx.c(d(d(d(d(d(d(it.next(), "@gw_rwd_userid@", Uri.encode(f2)), "@gw_rwd_custom_data@", Uri.encode(f3)), "@gw_tmstmp@", Long.toString(a)), "@gw_rwd_itm@", Uri.encode(type)), "@gw_rwd_amt@", num), "@gw_sdkver@", this.f14649d), this.f14652g, zzcxmVar.M));
            }
            h(arrayList);
        } catch (RemoteException unused) {
        }
    }

    public final void c(zzcxu zzcxuVar, zzcxm zzcxmVar, boolean z, List<String> list) {
        ArrayList arrayList = new ArrayList();
        String str = z ? "1" : "0";
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String d2 = d(d(d(it.next(), "@gw_adlocid@", zzcxuVar.a.a.f14575f), "@gw_adnetrefresh@", str), "@gw_sdkver@", this.f14649d);
            if (zzcxmVar != null) {
                d2 = zzavx.c(d(d(d(d2, "@gw_qdata@", zzcxmVar.v), "@gw_adnetid@", zzcxmVar.u), "@gw_allocid@", zzcxmVar.t), this.f14652g, zzcxmVar.M);
            }
            arrayList.add(d(d(d(d2, "@gw_adnetstatus@", this.f14648c.e()), "@gw_seqnum@", this.f14650e), "@gw_sessid@", this.f14651f));
        }
        h(arrayList);
    }

    public final void e(final String str) {
        this.a.execute(new Runnable(this, str) { // from class: com.google.android.gms.internal.ads.qq

            /* renamed from: f, reason: collision with root package name */
            private final zzdae f12063f;

            /* renamed from: g, reason: collision with root package name */
            private final String f12064g;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f12063f = this;
                this.f12064g = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f12063f.g(this.f12064g);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void g(String str) {
        this.f14647b.a(str);
    }

    public final void h(List<String> list) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            e(it.next());
        }
    }
}
