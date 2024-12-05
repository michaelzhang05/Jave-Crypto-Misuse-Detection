package l5;

import X4.Q;
import android.content.Context;
import android.os.Bundle;
import com.mbridge.msdk.MBridgeSDK;
import com.mbridge.msdk.out.MBridgeSDKFactory;
import com.mbridge.msdk.out.SDKInitStatusListener;
import com.mbridge.msdk.system.MBridgeSDKImpl;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: l5.E, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3311E {

    /* renamed from: a, reason: collision with root package name */
    public static final a f34483a = new a(null);

    /* renamed from: l5.E$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* renamed from: l5.E$b */
    /* loaded from: classes5.dex */
    public static final class b implements SDKInitStatusListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f34484a;

        b(Context context) {
            this.f34484a = context;
        }

        @Override // com.mbridge.msdk.out.SDKInitStatusListener
        public void onInitFail(String errorMsg) {
            AbstractC3159y.i(errorMsg, "errorMsg");
            Bundle bundle = new Bundle();
            bundle.putString("type", "failed");
            new C3330r(this.f34484a).b("mintegral_init", bundle);
        }

        @Override // com.mbridge.msdk.out.SDKInitStatusListener
        public void onInitSuccess() {
            Bundle bundle = new Bundle();
            bundle.putString("type", "success");
            new C3330r(this.f34484a).b("mintegral_init", bundle);
        }
    }

    private final void c(MBridgeSDK mBridgeSDK, Context context) {
        mBridgeSDK.init(mBridgeSDK.getMBConfigurationMap("288115", "7e5347690cfae30d311f1b31465c33f6"), context, new b(context));
    }

    public final void a(Context context, boolean z8) {
        AbstractC3159y.i(context, "context");
        MBridgeSDKImpl mBridgeSDK = MBridgeSDKFactory.getMBridgeSDK();
        AbstractC3159y.h(mBridgeSDK, "getMBridgeSDK()");
        mBridgeSDK.setConsentStatus(context, z8 ? 1 : 0);
    }

    public final void b(boolean z8) {
        MBridgeSDKImpl mBridgeSDK = MBridgeSDKFactory.getMBridgeSDK();
        AbstractC3159y.h(mBridgeSDK, "getMBridgeSDK()");
        mBridgeSDK.setDoNotTrackStatus(z8);
    }

    public final void d(Context context) {
        AbstractC3159y.i(context, "context");
        Q e8 = Q.f12437k.e(context);
        if (e8 == null || !e8.G()) {
            MBridgeSDKImpl mBridgeSDK = MBridgeSDKFactory.getMBridgeSDK();
            AbstractC3159y.h(mBridgeSDK, "getMBridgeSDK()");
            c(mBridgeSDK, context);
        }
    }
}
