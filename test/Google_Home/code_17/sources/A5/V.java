package a5;

import android.widget.RelativeLayout;
import com.mbridge.msdk.MBridgeConstans;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes5.dex */
public final class V {

    /* renamed from: c, reason: collision with root package name */
    public static final a f14084c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private int f14085a;

    /* renamed from: b, reason: collision with root package name */
    public RelativeLayout f14086b;

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    public final int a() {
        return this.f14085a;
    }

    public final String b() {
        int i8 = this.f14085a;
        if (i8 != 1) {
            if (i8 != 2) {
                if (i8 != 3) {
                    if (i8 != 4) {
                        if (i8 != 5) {
                            return "null";
                        }
                        return "login";
                    }
                    return "permissions";
                }
                return "continue";
            }
            return "deeplink";
        }
        return "welcome";
    }

    public final RelativeLayout c() {
        RelativeLayout relativeLayout = this.f14086b;
        if (relativeLayout != null) {
            return relativeLayout;
        }
        AbstractC3255y.y(MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        return null;
    }

    public final void d(int i8) {
        this.f14085a = i8;
    }

    public final void e(RelativeLayout relativeLayout) {
        AbstractC3255y.i(relativeLayout, "<set-?>");
        this.f14086b = relativeLayout;
    }
}
