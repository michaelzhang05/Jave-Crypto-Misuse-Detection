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
    private static HashMap<String, Class> f20611a = new HashMap<>();

    /* renamed from: b, reason: collision with root package name */
    private Context f20612b;

    /* renamed from: c, reason: collision with root package name */
    private Object f20613c;

    /* renamed from: d, reason: collision with root package name */
    private WindVaneWebView f20614d;

    public f(Context context, WindVaneWebView windVaneWebView) {
        this.f20612b = context;
        this.f20614d = windVaneWebView;
        try {
            a(com.mbridge.msdk.mbsignalcommon.base.e.f20482a, Class.forName("com.mbridge.msdk.interstitial.signalcommon.interstitial"));
        } catch (ClassNotFoundException unused) {
        }
        try {
            int i8 = RewardSignal.f22638g;
            a(com.mbridge.msdk.mbsignalcommon.base.e.f20483b, RewardSignal.class);
        } catch (ClassNotFoundException unused2) {
        }
        try {
            int i9 = VideoCommunication.f22664g;
            a(com.mbridge.msdk.mbsignalcommon.base.e.f20484c, VideoCommunication.class);
        } catch (ClassNotFoundException unused3) {
        }
        try {
            int i10 = MraidSignalCommunication.f20555g;
            a(com.mbridge.msdk.mbsignalcommon.base.e.f20486e, MraidSignalCommunication.class);
        } catch (ClassNotFoundException unused4) {
        }
        try {
            int i11 = BannerSignalPlugin.f20547g;
            a(com.mbridge.msdk.mbsignalcommon.base.e.f20487f, BannerSignalPlugin.class);
        } catch (ClassNotFoundException unused5) {
        }
        try {
            a(com.mbridge.msdk.mbsignalcommon.base.e.f20488g, Class.forName("com.mbridge.msdk.splash.signal.SplashSignal"));
        } catch (ClassNotFoundException unused6) {
        }
        try {
            int i12 = WebGLCheckSignal.f20567g;
            a(com.mbridge.msdk.mbsignalcommon.base.e.f20489h, WebGLCheckSignal.class);
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
        this.f20612b = context;
    }

    public final void a(Object obj) {
        this.f20613c = obj;
    }

    private Object a(String str, WindVaneWebView windVaneWebView, Context context) {
        Class cls = f20611a.get(str);
        if (cls == null) {
            return null;
        }
        try {
            if (!h.class.isAssignableFrom(cls)) {
                return null;
            }
            h hVar = (h) cls.newInstance();
            hVar.initialize(context, windVaneWebView);
            hVar.initialize(this.f20613c, windVaneWebView);
            return hVar;
        } catch (Exception e8) {
            e8.printStackTrace();
            return null;
        }
    }

    public final void a(String str, Class cls) {
        if (f20611a == null) {
            f20611a = new HashMap<>();
        }
        f20611a.put(str, cls);
    }

    public final Object a(String str) {
        if (f20611a == null) {
            f20611a = new HashMap<>();
        }
        return a(str, this.f20614d, this.f20612b);
    }
}
