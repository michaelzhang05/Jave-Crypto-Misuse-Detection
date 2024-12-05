package androidx.privacysandbox.ads.adservices.customaudience;

import O5.I;
import android.adservices.common.AdData;
import android.adservices.common.AdSelectionSignals;
import android.adservices.common.AdTechIdentifier;
import android.adservices.customaudience.CustomAudience;
import android.adservices.customaudience.JoinCustomAudienceRequest;
import android.adservices.customaudience.LeaveCustomAudienceRequest;
import android.adservices.customaudience.TrustedBiddingData;
import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresExtension;
import androidx.annotation.RequiresPermission;
import androidx.core.os.OutcomeReceiverKt;
import androidx.privacysandbox.ads.adservices.internal.AdServicesInfo;
import j$.time.TimeConversions;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import l6.C3374p;

/* loaded from: classes3.dex */
public abstract class CustomAudienceManager {
    public static final Companion Companion = new Companion(null);

    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        @SuppressLint({"NewApi", "ClassVerificationFailure"})
        public final CustomAudienceManager obtain(Context context) {
            AbstractC3255y.i(context, "context");
            if (AdServicesInfo.INSTANCE.version() >= 4) {
                return new Api33Ext4Impl(context);
            }
            return null;
        }

        public /* synthetic */ Companion(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    @SuppressLint({"NewApi", "ClassVerificationFailure"})
    public static final CustomAudienceManager obtain(Context context) {
        return Companion.obtain(context);
    }

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    public abstract Object joinCustomAudience(JoinCustomAudienceRequest joinCustomAudienceRequest, S5.d dVar);

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    public abstract Object leaveCustomAudience(LeaveCustomAudienceRequest leaveCustomAudienceRequest, S5.d dVar);

    /* JADX INFO: Access modifiers changed from: private */
    @RequiresExtension(extension = 1000000, version = 4)
    @SuppressLint({"ClassVerificationFailure", "NewApi"})
    /* loaded from: classes3.dex */
    public static final class Api33Ext4Impl extends CustomAudienceManager {
        private final android.adservices.customaudience.CustomAudienceManager customAudienceManager;

        public Api33Ext4Impl(android.adservices.customaudience.CustomAudienceManager customAudienceManager) {
            AbstractC3255y.i(customAudienceManager, "customAudienceManager");
            this.customAudienceManager = customAudienceManager;
        }

        private final List<AdData> convertAdData(List<androidx.privacysandbox.ads.adservices.common.AdData> list) {
            AdData.Builder metadata;
            AdData.Builder renderUri;
            AdData build;
            ArrayList arrayList = new ArrayList();
            for (androidx.privacysandbox.ads.adservices.common.AdData adData : list) {
                metadata = v.a().setMetadata(adData.getMetadata());
                renderUri = metadata.setRenderUri(adData.getRenderUri());
                build = renderUri.build();
                AbstractC3255y.h(build, "Builder()\n              …                 .build()");
                arrayList.add(build);
            }
            return arrayList;
        }

        private final AdTechIdentifier convertAdTechIdentifier(androidx.privacysandbox.ads.adservices.common.AdTechIdentifier adTechIdentifier) {
            AdTechIdentifier fromString;
            fromString = AdTechIdentifier.fromString(adTechIdentifier.getIdentifier());
            AbstractC3255y.h(fromString, "fromString(input.identifier)");
            return fromString;
        }

        private final AdSelectionSignals convertBiddingSignals(androidx.privacysandbox.ads.adservices.common.AdSelectionSignals adSelectionSignals) {
            AdSelectionSignals fromString;
            if (adSelectionSignals != null) {
                fromString = AdSelectionSignals.fromString(adSelectionSignals.getSignals());
                return fromString;
            }
            return null;
        }

        private final android.adservices.customaudience.CustomAudience convertCustomAudience(CustomAudience customAudience) {
            CustomAudience.Builder activationTime;
            CustomAudience.Builder ads;
            CustomAudience.Builder biddingLogicUri;
            CustomAudience.Builder buyer;
            CustomAudience.Builder dailyUpdateUri;
            CustomAudience.Builder expirationTime;
            CustomAudience.Builder name;
            CustomAudience.Builder trustedBiddingData;
            CustomAudience.Builder userBiddingSignals;
            android.adservices.customaudience.CustomAudience build;
            activationTime = r.a().setActivationTime(TimeConversions.convert(customAudience.getActivationTime()));
            ads = activationTime.setAds(convertAdData(customAudience.getAds()));
            biddingLogicUri = ads.setBiddingLogicUri(customAudience.getBiddingLogicUri());
            buyer = biddingLogicUri.setBuyer(convertAdTechIdentifier(customAudience.getBuyer()));
            dailyUpdateUri = buyer.setDailyUpdateUri(customAudience.getDailyUpdateUri());
            expirationTime = dailyUpdateUri.setExpirationTime(TimeConversions.convert(customAudience.getExpirationTime()));
            name = expirationTime.setName(customAudience.getName());
            trustedBiddingData = name.setTrustedBiddingData(convertTrustedSignals(customAudience.getTrustedBiddingSignals()));
            userBiddingSignals = trustedBiddingData.setUserBiddingSignals(convertBiddingSignals(customAudience.getUserBiddingSignals()));
            build = userBiddingSignals.build();
            AbstractC3255y.h(build, "Builder()\n              …\n                .build()");
            return build;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final android.adservices.customaudience.JoinCustomAudienceRequest convertJoinRequest(JoinCustomAudienceRequest joinCustomAudienceRequest) {
            JoinCustomAudienceRequest.Builder customAudience;
            android.adservices.customaudience.JoinCustomAudienceRequest build;
            customAudience = t.a().setCustomAudience(convertCustomAudience(joinCustomAudienceRequest.getCustomAudience()));
            build = customAudience.build();
            AbstractC3255y.h(build, "Builder()\n              …\n                .build()");
            return build;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final android.adservices.customaudience.LeaveCustomAudienceRequest convertLeaveRequest(LeaveCustomAudienceRequest leaveCustomAudienceRequest) {
            LeaveCustomAudienceRequest.Builder buyer;
            LeaveCustomAudienceRequest.Builder name;
            android.adservices.customaudience.LeaveCustomAudienceRequest build;
            buyer = s.a().setBuyer(convertAdTechIdentifier(leaveCustomAudienceRequest.getBuyer()));
            name = buyer.setName(leaveCustomAudienceRequest.getName());
            build = name.build();
            AbstractC3255y.h(build, "Builder()\n              …\n                .build()");
            return build;
        }

        private final android.adservices.customaudience.TrustedBiddingData convertTrustedSignals(TrustedBiddingData trustedBiddingData) {
            TrustedBiddingData.Builder trustedBiddingKeys;
            TrustedBiddingData.Builder trustedBiddingUri;
            android.adservices.customaudience.TrustedBiddingData build;
            if (trustedBiddingData != null) {
                trustedBiddingKeys = u.a().setTrustedBiddingKeys(trustedBiddingData.getTrustedBiddingKeys());
                trustedBiddingUri = trustedBiddingKeys.setTrustedBiddingUri(trustedBiddingData.getTrustedBiddingUri());
                build = trustedBiddingUri.build();
                return build;
            }
            return null;
        }

        @Override // androidx.privacysandbox.ads.adservices.customaudience.CustomAudienceManager
        @RequiresPermission("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
        @DoNotInline
        public Object joinCustomAudience(JoinCustomAudienceRequest joinCustomAudienceRequest, S5.d dVar) {
            C3374p c3374p = new C3374p(T5.b.c(dVar), 1);
            c3374p.C();
            this.customAudienceManager.joinCustomAudience(convertJoinRequest(joinCustomAudienceRequest), new androidx.privacysandbox.ads.adservices.adid.g(), OutcomeReceiverKt.asOutcomeReceiver(c3374p));
            Object y8 = c3374p.y();
            if (y8 == T5.b.e()) {
                kotlin.coroutines.jvm.internal.h.c(dVar);
            }
            if (y8 == T5.b.e()) {
                return y8;
            }
            return I.f8278a;
        }

        @Override // androidx.privacysandbox.ads.adservices.customaudience.CustomAudienceManager
        @RequiresPermission("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
        @DoNotInline
        public Object leaveCustomAudience(LeaveCustomAudienceRequest leaveCustomAudienceRequest, S5.d dVar) {
            C3374p c3374p = new C3374p(T5.b.c(dVar), 1);
            c3374p.C();
            this.customAudienceManager.leaveCustomAudience(convertLeaveRequest(leaveCustomAudienceRequest), new androidx.privacysandbox.ads.adservices.adid.g(), OutcomeReceiverKt.asOutcomeReceiver(c3374p));
            Object y8 = c3374p.y();
            if (y8 == T5.b.e()) {
                kotlin.coroutines.jvm.internal.h.c(dVar);
            }
            if (y8 == T5.b.e()) {
                return y8;
            }
            return I.f8278a;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public Api33Ext4Impl(android.content.Context r2) {
            /*
                r1 = this;
                java.lang.String r0 = "context"
                kotlin.jvm.internal.AbstractC3255y.i(r2, r0)
                java.lang.Class r0 = androidx.privacysandbox.ads.adservices.customaudience.x.a()
                java.lang.Object r2 = g.AbstractC2850d.a(r2, r0)
                java.lang.String r0 = "context.getSystemService…:class.java\n            )"
                kotlin.jvm.internal.AbstractC3255y.h(r2, r0)
                android.adservices.customaudience.CustomAudienceManager r2 = androidx.privacysandbox.ads.adservices.customaudience.y.a(r2)
                r1.<init>(r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.privacysandbox.ads.adservices.customaudience.CustomAudienceManager.Api33Ext4Impl.<init>(android.content.Context):void");
        }
    }
}
