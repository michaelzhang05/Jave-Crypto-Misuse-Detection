package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.mbridge.msdk.MBridgeConstans;

/* loaded from: classes3.dex */
public final class d6 {

    /* renamed from: a, reason: collision with root package name */
    private final R2 f17555a;

    public d6(R2 r22) {
        this.f17555a = r22;
    }

    private final boolean d() {
        if (this.f17555a.F().f17836z.a() > 0) {
            return true;
        }
        return false;
    }

    private final boolean e() {
        if (!d() || this.f17555a.x().currentTimeMillis() - this.f17555a.F().f17836z.a() <= this.f17555a.z().C(null, H.f17095W)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        String str;
        this.f17555a.e().k();
        if (!d()) {
            return;
        }
        if (e()) {
            this.f17555a.F().f17835y.b(null);
            Bundle bundle = new Bundle();
            bundle.putString("source", "(not set)");
            bundle.putString("medium", "(not set)");
            bundle.putString("_cis", "intent");
            bundle.putLong("_cc", 1L);
            this.f17555a.H().b1("auto", "_cmpx", bundle);
        } else {
            String a8 = this.f17555a.F().f17835y.a();
            if (TextUtils.isEmpty(a8)) {
                this.f17555a.c().I().a("Cache still valid but referrer not found");
            } else {
                long a9 = ((this.f17555a.F().f17836z.a() / 3600000) - 1) * 3600000;
                Uri parse = Uri.parse(a8);
                Bundle bundle2 = new Bundle();
                Pair pair = new Pair(parse.getPath(), bundle2);
                for (String str2 : parse.getQueryParameterNames()) {
                    bundle2.putString(str2, parse.getQueryParameter(str2));
                }
                ((Bundle) pair.second).putLong("_cc", a9);
                Object obj = pair.first;
                if (obj == null) {
                    str = MBridgeConstans.DYNAMIC_VIEW_WX_APP;
                } else {
                    str = (String) obj;
                }
                this.f17555a.H().b1(str, "_cmp", (Bundle) pair.second);
            }
            this.f17555a.F().f17835y.b(null);
        }
        this.f17555a.F().f17836z.b(0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(String str, Bundle bundle) {
        String str2;
        this.f17555a.e().k();
        if (!this.f17555a.m()) {
            if (bundle != null && !bundle.isEmpty()) {
                if (str == null || str.isEmpty()) {
                    str = "auto";
                }
                Uri.Builder builder = new Uri.Builder();
                builder.path(str);
                for (String str3 : bundle.keySet()) {
                    builder.appendQueryParameter(str3, bundle.getString(str3));
                }
                str2 = builder.build().toString();
            } else {
                str2 = null;
            }
            if (!TextUtils.isEmpty(str2)) {
                this.f17555a.F().f17835y.b(str2);
                this.f17555a.F().f17836z.b(this.f17555a.x().currentTimeMillis());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c() {
        if (d() && e()) {
            this.f17555a.F().f17835y.b(null);
        }
    }
}
