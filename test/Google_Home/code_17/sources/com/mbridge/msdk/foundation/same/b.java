package com.mbridge.msdk.foundation.same;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.af;

/* loaded from: classes4.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static volatile b f20514a;

    /* renamed from: b, reason: collision with root package name */
    private Boolean f20515b = null;

    /* renamed from: c, reason: collision with root package name */
    private Boolean f20516c = null;

    private b() {
    }

    public static b a() {
        if (f20514a == null) {
            synchronized (b.class) {
                try {
                    if (f20514a == null) {
                        f20514a = new b();
                    }
                } finally {
                }
            }
        }
        return f20514a;
    }

    public final Boolean b() {
        return this.f20515b;
    }

    public final Boolean c() {
        return this.f20516c;
    }

    public final boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (str.equals("new_bridge_reward_video")) {
            boolean a8 = af.a().a("new_bridge_reward_video", false, false);
            this.f20515b = Boolean.valueOf(a8);
            return a8;
        }
        if (!str.equals("new_bridge_new_interstitial_video")) {
            return false;
        }
        boolean a9 = af.a().a("new_bridge_new_interstitial_video", false, false);
        this.f20516c = Boolean.valueOf(a9);
        return a9;
    }
}
