package com.mbridge.msdk.videocommon.download;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.af;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes4.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private AtomicBoolean f23117a;

    /* renamed from: b, reason: collision with root package name */
    private AtomicBoolean f23118b;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private static final h f23119a = new h();
    }

    public static h a() {
        return a.f23119a;
    }

    public final boolean b(int i8) {
        if (MBridgeConstans.DEBUG) {
            ad.c("RewardVideoRefactorManager", "isRewardVideoRefactor adType: " + i8 + ", key: REWARD_VIDEO_REFACTOR_FOR_CAMPAIGN_REQUEST");
        }
        if (i8 != 94 && i8 != 287) {
            return false;
        }
        AtomicBoolean atomicBoolean = this.f23118b;
        if (atomicBoolean != null) {
            return atomicBoolean.get();
        }
        try {
            this.f23118b = new AtomicBoolean(af.a().a("r_v_r_f_c_r", false));
        } catch (Exception e8) {
            this.f23118b = new AtomicBoolean(false);
            if (MBridgeConstans.DEBUG) {
                ad.b("RewardVideoRefactorManager", "isRewardVideoRefactor error: " + e8.getMessage());
            }
        }
        return this.f23118b.get();
    }

    private h() {
    }

    public final boolean a(int i8) {
        if (MBridgeConstans.DEBUG) {
            ad.c("RewardVideoRefactorManager", "isRewardVideoRefactor adType: " + i8 + ", key: REWARD_VIDEO_REFACTOR_FOR_LOAD");
        }
        if (i8 != 94 && i8 != 287) {
            return false;
        }
        AtomicBoolean atomicBoolean = this.f23117a;
        if (atomicBoolean != null) {
            return atomicBoolean.get();
        }
        try {
            this.f23117a = new AtomicBoolean(af.a().a("r_v_r_f_l", false));
        } catch (Exception e8) {
            this.f23117a = new AtomicBoolean(false);
            if (MBridgeConstans.DEBUG) {
                ad.b("RewardVideoRefactorManager", "isRewardVideoRefactor error: " + e8.getMessage());
            }
        }
        return this.f23117a.get();
    }

    public final int a(String str, int i8) {
        try {
            return af.a().a(str, i8);
        } catch (Exception e8) {
            if (MBridgeConstans.DEBUG) {
                ad.b("RewardVideoRefactorManager", "getRewardVideoCampaignRequestTimeout error: " + e8.getMessage());
            }
            return i8;
        }
    }
}