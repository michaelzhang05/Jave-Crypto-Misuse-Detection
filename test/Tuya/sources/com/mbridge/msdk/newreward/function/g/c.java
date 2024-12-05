package com.mbridge.msdk.newreward.function.g;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.same.net.Aa;
import com.mbridge.msdk.foundation.same.net.h.e;
import com.mbridge.msdk.foundation.same.net.h.f;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.newreward.function.d.b.g;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.net.URLEncoder;
import java.util.Map;

/* loaded from: classes4.dex */
public final class c extends a {

    /* renamed from: a, reason: collision with root package name */
    private String f21253a;

    /* renamed from: b, reason: collision with root package name */
    private int f21254b;

    /* renamed from: c, reason: collision with root package name */
    private String f21255c;

    /* renamed from: d, reason: collision with root package name */
    private int f21256d;

    public final void a(String str) {
        this.f21253a = str;
    }

    public final String b() {
        return this.f21253a;
    }

    public final Map<String, String> c() {
        String str;
        e eVar = new e(a());
        if (this.f21256d == g.f21099b && !TextUtils.isEmpty(this.f21253a)) {
            eVar.a("unit_ids", String.format("[%s]", this.f21253a));
        }
        if (TextUtils.isEmpty(this.f21255c)) {
            str = "";
        } else {
            str = this.f21255c;
        }
        eVar.a("vtag", str);
        if (com.mbridge.msdk.f.b.a()) {
            String b8 = Aa.b();
            if (!TextUtils.isEmpty(b8)) {
                eVar.a("keyword", b8);
            }
        }
        com.mbridge.msdk.c.a.d.a(com.mbridge.msdk.foundation.controller.c.m().c(), eVar);
        f.d(eVar);
        f.f(eVar);
        return eVar.a();
    }

    public final String d() {
        StringBuilder sb = new StringBuilder();
        try {
            for (Map.Entry<String, String> entry : c().entrySet()) {
                if (sb.length() > 0) {
                    sb.append('&');
                }
                sb.append(URLEncoder.encode(entry.getKey(), C.UTF8_NAME));
                sb.append("=");
                sb.append(URLEncoder.encode(entry.getValue(), C.UTF8_NAME));
            }
        } catch (Throwable th) {
            ad.b("RewardSettingReqParameters", th.getMessage());
        }
        return sb.toString();
    }

    public final void a(int i8) {
        this.f21254b = i8;
    }

    public final void b(String str) {
        this.f21255c = str;
    }

    public final void b(int i8) {
        this.f21256d = i8;
    }
}
