package o5;

import a5.Q;
import android.content.Context;
import android.os.Bundle;
import com.mbridge.msdk.MBridgeSDK;
import com.mbridge.msdk.out.MBridgeSDKFactory;
import com.mbridge.msdk.out.SDKInitStatusListener;
import com.mbridge.msdk.system.MBridgeSDKImpl;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: o5.E, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3659E {

    /* renamed from: a, reason: collision with root package name */
    public static final a f36484a = new a(null);

    /* renamed from: o5.E$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* renamed from: o5.E$b */
    /* loaded from: classes5.dex */
    public static final class b implements SDKInitStatusListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f36485a;

        b(Context context) {
            this.f36485a = context;
        }

        @Override // com.mbridge.msdk.out.SDKInitStatusListener
        public void onInitFail(String errorMsg) {
            AbstractC3255y.i(errorMsg, "errorMsg");
            Bundle bundle = new Bundle();
            bundle.putString("type", "failed");
            new C3678r(this.f36485a).b("mintegral_init", bundle);
        }

        @Override // com.mbridge.msdk.out.SDKInitStatusListener
        public void onInitSuccess() {
            Bundle bundle = new Bundle();
            bundle.putString("type", "success");
            new C3678r(this.f36485a).b("mintegral_init", bundle);
        }
    }

    private final void c(MBridgeSDK mBridgeSDK, Context context) {
        mBridgeSDK.init(mBridgeSDK.getMBConfigurationMap("288115", "7e5347690cfae30d311f1b31465c33f6"), context, new b(context));
    }

    public final void a(Context context, boolean z8) {
        AbstractC3255y.i(context, "context");
        MBridgeSDKImpl mBridgeSDK = MBridgeSDKFactory.getMBridgeSDK();
        AbstractC3255y.h(mBridgeSDK, "getMBridgeSDK()");
        mBridgeSDK.setConsentStatus(context, z8 ? 1 : 0);
    }

    public final void b(boolean z8) {
        MBridgeSDKImpl mBridgeSDK = MBridgeSDKFactory.getMBridgeSDK();
        AbstractC3255y.h(mBridgeSDK, "getMBridgeSDK()");
        mBridgeSDK.setDoNotTrackStatus(z8);
    }

    public final void d(Context context) {
        AbstractC3255y.i(context, "context");
        Q e8 = Q.f14058k.e(context);
        if (e8 == null || !e8.y()) {
            MBridgeSDKImpl mBridgeSDK = MBridgeSDKFactory.getMBridgeSDK();
            AbstractC3255y.h(mBridgeSDK, "getMBridgeSDK()");
            c(mBridgeSDK, context);
        }
    }
}
