package X4;

import android.widget.RelativeLayout;
import com.mbridge.msdk.MBridgeConstans;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes5.dex */
public final class V {

    /* renamed from: c, reason: collision with root package name */
    public static final a f12463c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private int f12464a;

    /* renamed from: b, reason: collision with root package name */
    public RelativeLayout f12465b;

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    public final int a() {
        return this.f12464a;
    }

    public final String b() {
        int i8 = this.f12464a;
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
        RelativeLayout relativeLayout = this.f12465b;
        if (relativeLayout != null) {
            return relativeLayout;
        }
        AbstractC3159y.y(MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        return null;
    }

    public final void d(int i8) {
        this.f12464a = i8;
    }

    public final void e(RelativeLayout relativeLayout) {
        AbstractC3159y.i(relativeLayout, "<set-?>");
        this.f12465b = relativeLayout;
    }
}
