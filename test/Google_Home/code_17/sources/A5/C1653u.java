package a5;

import android.content.Context;
import android.content.res.Resources;
import com.uptodown.activities.preferences.SettingsPreferences;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import org.json.JSONObject;

/* renamed from: a5.u, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1653u extends AbstractC1636c {

    /* renamed from: n, reason: collision with root package name */
    public static final a f14337n = new a(null);

    /* renamed from: k, reason: collision with root package name */
    private final long f14338k;

    /* renamed from: l, reason: collision with root package name */
    private final String f14339l;

    /* renamed from: m, reason: collision with root package name */
    private String f14340m;

    /* renamed from: a5.u$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public final void a(Context context) {
            AbstractC3255y.i(context, "context");
            SettingsPreferences.f30353b.b(context);
        }

        public final boolean b(Context context, long j8) {
            AbstractC3255y.i(context, "context");
            if (j8 > -1) {
                return AbstractC1636c.f14106j.a(d(context), j8);
            }
            return false;
        }

        public final C1653u c(JSONObject jsonObjectData) {
            String str;
            String str2;
            long j8;
            AbstractC3255y.i(jsonObjectData, "jsonObjectData");
            if (!jsonObjectData.isNull("imgURL")) {
                str = jsonObjectData.getString("imgURL");
                com.squareup.picasso.s.h().l(str).d();
            } else {
                str = null;
            }
            if (!jsonObjectData.isNull("packageName")) {
                str2 = jsonObjectData.getString("packageName");
            } else {
                str2 = null;
            }
            if (!jsonObjectData.isNull("appID")) {
                j8 = jsonObjectData.getLong("appID");
            } else {
                j8 = -1;
            }
            if (j8 <= -1 || str2 == null || str == null) {
                return null;
            }
            return new C1653u(j8, str2, str);
        }

        public final C1653u d(Context context) {
            AbstractC3255y.i(context, "context");
            return SettingsPreferences.f30353b.p(context);
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1653u(long j8, String packageName, String imageUrl) {
        super(j8, packageName, imageUrl, "interstitial");
        AbstractC3255y.i(packageName, "packageName");
        AbstractC3255y.i(imageUrl, "imageUrl");
        this.f14338k = j8;
        this.f14339l = packageName;
        this.f14340m = imageUrl;
    }

    public final String A(Resources resources) {
        AbstractC3255y.i(resources, "resources");
        return n();
    }

    public void B(String str) {
        AbstractC3255y.i(str, "<set-?>");
        this.f14340m = str;
    }

    @Override // a5.AbstractC1636c
    public long k() {
        return this.f14338k;
    }

    @Override // a5.AbstractC1636c
    public String n() {
        return this.f14340m;
    }

    @Override // a5.AbstractC1636c
    public String r() {
        return this.f14339l;
    }

    @Override // a5.AbstractC1636c
    public void t(Context context) {
        AbstractC3255y.i(context, "context");
        SettingsPreferences.f30353b.r0(context, this);
    }
}
