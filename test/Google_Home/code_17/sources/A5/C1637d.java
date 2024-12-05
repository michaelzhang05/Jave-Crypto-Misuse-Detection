package a5;

import android.content.Context;
import android.os.Bundle;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import o5.C3678r;
import org.json.JSONObject;

/* renamed from: a5.d, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1637d {

    /* renamed from: h, reason: collision with root package name */
    public static final a f14116h = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private String f14117a;

    /* renamed from: b, reason: collision with root package name */
    private String f14118b;

    /* renamed from: c, reason: collision with root package name */
    private String f14119c;

    /* renamed from: d, reason: collision with root package name */
    private String f14120d;

    /* renamed from: e, reason: collision with root package name */
    private String f14121e;

    /* renamed from: f, reason: collision with root package name */
    private String f14122f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f14123g;

    /* renamed from: a5.d$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public final C1637d a(JSONObject jsonObjectData) {
            AbstractC3255y.i(jsonObjectData, "jsonObjectData");
            C1637d c1637d = new C1637d();
            if (!jsonObjectData.isNull("affiliatedURL")) {
                c1637d.j(jsonObjectData.getString("affiliatedURL"));
            }
            if (!jsonObjectData.isNull(CampaignEx.JSON_KEY_TITLE)) {
                c1637d.o(jsonObjectData.getString(CampaignEx.JSON_KEY_TITLE));
            }
            if (!jsonObjectData.isNull("description")) {
                c1637d.l(jsonObjectData.getString("description"));
            }
            if (!jsonObjectData.isNull("buttonText")) {
                c1637d.k(jsonObjectData.getString("buttonText"));
            }
            if (!jsonObjectData.isNull("mainColor")) {
                c1637d.m(jsonObjectData.getString("mainColor"));
            }
            if (!jsonObjectData.isNull("secondaryColor")) {
                c1637d.n(jsonObjectData.getString("secondaryColor"));
            }
            return c1637d;
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    public final void a(Context context, Long l8) {
        AbstractC3255y.i(context, "context");
        Bundle bundle = new Bundle();
        if (l8 != null && l8.longValue() > 0) {
            bundle.putString("appId", l8.toString());
        }
        bundle.putString("type", "clicked");
        new C3678r(context).b("affiliated", bundle);
    }

    public final void b(Context context, Long l8) {
        AbstractC3255y.i(context, "context");
        if (!this.f14123g) {
            this.f14123g = true;
            Bundle bundle = new Bundle();
            if (l8 != null && l8.longValue() > 0) {
                bundle.putString("appId", l8.toString());
            }
            bundle.putString("type", "shown");
            new C3678r(context).b("affiliated", bundle);
        }
    }

    public final String c() {
        return this.f14117a;
    }

    public final String d() {
        return this.f14120d;
    }

    public final String e() {
        return this.f14119c;
    }

    public final String f() {
        return this.f14121e;
    }

    public final String g() {
        return this.f14122f;
    }

    public final boolean h() {
        return this.f14123g;
    }

    public final String i() {
        return this.f14118b;
    }

    public final void j(String str) {
        this.f14117a = str;
    }

    public final void k(String str) {
        this.f14120d = str;
    }

    public final void l(String str) {
        this.f14119c = str;
    }

    public final void m(String str) {
        this.f14121e = str;
    }

    public final void n(String str) {
        this.f14122f = str;
    }

    public final void o(String str) {
        this.f14118b = str;
    }
}
