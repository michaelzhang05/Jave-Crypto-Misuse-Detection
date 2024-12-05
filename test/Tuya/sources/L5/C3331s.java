package l5;

import android.os.Bundle;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: l5.s, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3331s {

    /* renamed from: a, reason: collision with root package name */
    public static final C3331s f34529a = new C3331s();

    private C3331s() {
    }

    public final Bundle a(Bundle params) {
        String str;
        AbstractC3159y.i(params, "params");
        if (C3332t.f34530a.f()) {
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
        AbstractC3159y.i(key, "key");
        if (g6.n.s(key, "update", true) || g6.n.s(key, "deeplink", true) || g6.n.s(key, "notification_fcm", true)) {
            return true;
        }
        return false;
    }

    public final boolean c(String key) {
        AbstractC3159y.i(key, "key");
        if (g6.n.s(key, "downBandwidthKbps", true) || g6.n.s(key, "upBandwidthKbps", true) || g6.n.s(key, "speed", true) || g6.n.s(key, TypedValues.TransitionType.S_DURATION, true)) {
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
