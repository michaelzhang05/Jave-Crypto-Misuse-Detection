package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.ads.mediation.AbstractAdViewAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public abstract class zzcmn<AdT> implements zzcjv<AdT> {
    private static Bundle d(Bundle bundle) {
        return bundle == null ? new Bundle() : new Bundle(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzcjv
    public final zzbbh<AdT> a(zzcxu zzcxuVar, zzcxm zzcxmVar) {
        String optString = zzcxmVar.s.optString(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, HttpUrl.FRAGMENT_ENCODE_SET);
        zzcxv zzcxvVar = zzcxuVar.a.a;
        zzcxx t = new zzcxx().w(zzcxvVar.f14573d).n(zzcxvVar.f14574e).o(zzcxvVar.a).t(zzcxvVar.f14575f).k(zzcxvVar.f14571b).h(zzcxvVar.f14576g).l(zzcxvVar.f14577h).f(zzcxvVar.f14578i).u(zzcxvVar.f14579j).e(zzcxvVar.m).v(zzcxvVar.f14580k).t(optString);
        Bundle d2 = d(zzcxvVar.f14573d.r);
        Bundle d3 = d(d2.getBundle("com.google.ads.mediation.admob.AdMobAdapter"));
        d3.putInt("gw", 1);
        String optString2 = zzcxmVar.s.optString("mad_hac", null);
        if (optString2 != null) {
            d3.putString("mad_hac", optString2);
        }
        String optString3 = zzcxmVar.s.optString("adJson", null);
        if (optString3 != null) {
            d3.putString("_ad", optString3);
        }
        d3.putBoolean("_noRefresh", true);
        Iterator<String> keys = zzcxmVar.A.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String optString4 = zzcxmVar.A.optString(next, null);
            if (next != null) {
                d3.putString(next, optString4);
            }
        }
        d2.putBundle("com.google.ads.mediation.admob.AdMobAdapter", d3);
        zzxz zzxzVar = zzcxvVar.f14573d;
        zzcxv d4 = t.w(new zzxz(zzxzVar.f15791f, zzxzVar.f15792g, d3, zzxzVar.f15794i, zzxzVar.f15795j, zzxzVar.f15796k, zzxzVar.l, zzxzVar.m, zzxzVar.n, zzxzVar.o, zzxzVar.p, zzxzVar.q, d2, zzxzVar.s, zzxzVar.t, zzxzVar.u, zzxzVar.v, zzxzVar.w, zzxzVar.x, zzxzVar.y, zzxzVar.z)).d();
        Bundle bundle = new Bundle();
        zzcxo zzcxoVar = zzcxuVar.f14570b.f14567b;
        Bundle bundle2 = new Bundle();
        bundle2.putStringArrayList("nofill_urls", new ArrayList<>(zzcxoVar.a));
        bundle2.putInt("refresh_interval", zzcxoVar.f14560c);
        bundle2.putString("gws_query_id", zzcxoVar.f14559b);
        bundle.putBundle("parent_common_config", bundle2);
        String str = zzcxuVar.a.a.f14575f;
        Bundle bundle3 = new Bundle();
        bundle3.putString("initial_ad_unit_id", str);
        bundle3.putString("allocation_id", zzcxmVar.t);
        bundle3.putStringArrayList("click_urls", new ArrayList<>(zzcxmVar.f14548c));
        bundle3.putStringArrayList("imp_urls", new ArrayList<>(zzcxmVar.f14549d));
        bundle3.putStringArrayList("manual_tracking_urls", new ArrayList<>(zzcxmVar.n));
        bundle3.putStringArrayList("fill_urls", new ArrayList<>(zzcxmVar.m));
        bundle3.putStringArrayList("video_start_urls", new ArrayList<>(zzcxmVar.f14552g));
        bundle3.putStringArrayList("video_reward_urls", new ArrayList<>(zzcxmVar.f14553h));
        bundle3.putStringArrayList("video_complete_urls", new ArrayList<>(zzcxmVar.f14554i));
        bundle3.putString("transaction_id", zzcxmVar.f14555j);
        bundle3.putString("valid_from_timestamp", zzcxmVar.f14556k);
        bundle3.putBoolean("is_closable_area_disabled", zzcxmVar.G);
        if (zzcxmVar.l != null) {
            Bundle bundle4 = new Bundle();
            bundle4.putInt("rb_amount", zzcxmVar.l.f12982g);
            bundle4.putString("rb_type", zzcxmVar.l.f12981f);
            bundle3.putParcelableArray("rewards", new Bundle[]{bundle4});
        }
        bundle.putBundle("parent_ad_config", bundle3);
        return c(d4, bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzcjv
    public final boolean b(zzcxu zzcxuVar, zzcxm zzcxmVar) {
        return !TextUtils.isEmpty(zzcxmVar.s.optString(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, HttpUrl.FRAGMENT_ENCODE_SET));
    }

    protected abstract zzbbh<AdT> c(zzcxv zzcxvVar, Bundle bundle);
}
