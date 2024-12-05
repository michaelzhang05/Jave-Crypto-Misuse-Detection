package com.mbridge.msdk.mbsignalcommon.windvane;

import android.content.Context;
import com.mbridge.msdk.mbsignalcommon.communication.BannerSignalPlugin;
import com.mbridge.msdk.mbsignalcommon.mraid.MraidSignalCommunication;
import com.mbridge.msdk.mbsignalcommon.webEnvCheck.WebGLCheckSignal;
import com.mbridge.msdk.video.signal.communication.RewardSignal;
import com.mbridge.msdk.video.signal.communication.VideoCommunication;
import java.util.HashMap;

/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private static HashMap<String, Class> f21666a = new HashMap<>();

    /* renamed from: b, reason: collision with root package name */
    private Context f21667b;

    /* renamed from: c, reason: collision with root package name */
    private Object f21668c;

    /* renamed from: d, reason: collision with root package name */
    private WindVaneWebView f21669d;

    public f(Context context, WindVaneWebView windVaneWebView) {
        this.f21667b = context;
        this.f21669d = windVaneWebView;
        try {
            a(com.mbridge.msdk.mbsignalcommon.base.e.f21537a, Class.forName("com.mbridge.msdk.interstitial.signalcommon.interstitial"));
        } catch (ClassNotFoundException unused) {
        }
        try {
            int i8 = RewardSignal.f23693g;
            a(com.mbridge.msdk.mbsignalcommon.base.e.f21538b, RewardSignal.class);
        } catch (ClassNotFoundException unused2) {
        }
        try {
            int i9 = VideoCommunication.f23719g;
            a(com.mbridge.msdk.mbsignalcommon.base.e.f21539c, VideoCommunication.class);
        } catch (ClassNotFoundException unused3) {
        }
        try {
            int i10 = MraidSignalCommunication.f21610g;
            a(com.mbridge.msdk.mbsignalcommon.base.e.f21541e, MraidSignalCommunication.class);
        } catch (ClassNotFoundException unused4) {
        }
        try {
            int i11 = BannerSignalPlugin.f21602g;
            a(com.mbridge.msdk.mbsignalcommon.base.e.f21542f, BannerSignalPlugin.class);
        } catch (ClassNotFoundException unused5) {
        }
        try {
            a(com.mbridge.msdk.mbsignalcommon.base.e.f21543g, Class.forName("com.mbridge.msdk.splash.signal.SplashSignal"));
        } catch (ClassNotFoundException unused6) {
        }
        try {
            int i12 = WebGLCheckSignal.f21622g;
            a(com.mbridge.msdk.mbsignalcommon.base.e.f21544h, WebGLCheckSignal.class);
        } catch (ClassNotFoundException unused7) {
        }
        try {
            if (com.mbridge.msdk.f.b.a()) {
                Class<?> cls = Class.forName("com.mbridge.msdk.mbsignalcommon.confirmation.bridge.ConfirmationJsBridgePlugin");
                a(cls.getSimpleName(), cls);
            }
        } catch (Exception unused8) {
        }
    }

    public final void a(Context context) {
        this.f21667b = context;
    }

    public final void a(Object obj) {
        this.f21668c = obj;
    }

    private Object a(String str, WindVaneWebView windVaneWebView, Context context) {
        Class cls = f21666a.get(str);
        if (cls == null) {
            return null;
        }
        try {
            if (!h.class.isAssignableFrom(cls)) {
                return null;
            }
            h hVar = (h) cls.newInstance();
            hVar.initialize(context, windVaneWebView);
            hVar.initialize(this.f21668c, windVaneWebView);
            return hVar;
        } catch (Exception e8) {
            e8.printStackTrace();
            return null;
        }
    }

    public final void a(String str, Class cls) {
        if (f21666a == null) {
            f21666a = new HashMap<>();
        }
        f21666a.put(str, cls);
    }

    public final Object a(String str) {
        if (f21666a == null) {
            f21666a = new HashMap<>();
        }
        return a(str, this.f21669d, this.f21667b);
    }
}
