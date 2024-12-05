package o5;

import android.os.Bundle;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: o5.s, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3679s {

    /* renamed from: a, reason: collision with root package name */
    public static final C3679s f36530a = new C3679s();

    private C3679s() {
    }

    public final Bundle a(Bundle params) {
        String str;
        AbstractC3255y.i(params, "params");
        if (C3680t.f36531a.f()) {
            str = "wifi";
        } else {
            str = "mobile";
        }
        params.putString("connectionType", str);
        params.putLong("downBandwidthKbps", r0.a());
        params.putLong("upBandwidthKbps", r0.b());
        return params;
    }

    public final boolean b(String key) {
        AbstractC3255y.i(key, "key");
        if (j6.n.s(key, "update", true) || j6.n.s(key, "deeplink", true) || j6.n.s(key, "notification_fcm", true)) {
            return true;
        }
        return false;
    }

    public final boolean c(String key) {
        AbstractC3255y.i(key, "key");
        if (j6.n.s(key, "downBandwidthKbps", true) || j6.n.s(key, "upBandwidthKbps", true) || j6.n.s(key, "speed", true) || j6.n.s(key, TypedValues.TransitionType.S_DURATION, true)) {
            return true;
        }
        return false;
    }

    public final String d(long j8) {
        if (j8 < 10485760) {
            return "<10MB";
        }
        if (j8 < 104857600) {
            return "<100MB";
        }
        if (j8 < 524288000) {
            return "<500MB";
        }
        if (j8 < 1073741824) {
            return "<1GB";
        }
        if (j8 >= 10737418240L) {
            return "<10MB";
        }
        return "<10GB";
    }
}
