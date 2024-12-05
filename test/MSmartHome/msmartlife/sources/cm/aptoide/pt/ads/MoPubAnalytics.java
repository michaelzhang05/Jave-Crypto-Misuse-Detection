package cm.aptoide.pt.ads;

import android.os.Bundle;
import cm.aptoide.pt.ads.WalletAdsOfferManager;
import cm.aptoide.pt.logger.Logger;
import com.facebook.GraphRequest;
import e.d.a.b;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class MoPubAnalytics {
    private static final String ADS_STATUS_USER_PROPERTY = "ads";

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: cm.aptoide.pt.ads.MoPubAnalytics$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$cm$aptoide$pt$ads$WalletAdsOfferManager$OfferResponseStatus;

        static {
            int[] iArr = new int[WalletAdsOfferManager.OfferResponseStatus.values().length];
            $SwitchMap$cm$aptoide$pt$ads$WalletAdsOfferManager$OfferResponseStatus = iArr;
            try {
                iArr[WalletAdsOfferManager.OfferResponseStatus.NO_ADS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$ads$WalletAdsOfferManager$OfferResponseStatus[WalletAdsOfferManager.OfferResponseStatus.ADS_HIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$ads$WalletAdsOfferManager$OfferResponseStatus[WalletAdsOfferManager.OfferResponseStatus.ADS_SHOW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public enum AdsVisibility {
        ADS_BLOCKED_BY_OFFER("ads blocked by offer"),
        CONTROL("control"),
        HAS_ADS("has ads");

        private final String type;

        AdsVisibility(String str) {
            this.type = str;
        }

        public String getType() {
            return this.type;
        }
    }

    private JSONObject addAdsSuperProperty(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            jSONObject.put(ADS_STATUS_USER_PROPERTY, str);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return jSONObject;
    }

    private String mapAdsVisibilityToAnalyticsValues(WalletAdsOfferManager.OfferResponseStatus offerResponseStatus) {
        int i2 = AnonymousClass1.$SwitchMap$cm$aptoide$pt$ads$WalletAdsOfferManager$OfferResponseStatus[offerResponseStatus.ordinal()];
        if (i2 == 1) {
            return "no_ads";
        }
        if (i2 == 2) {
            return "ads_block_by_offer";
        }
        if (i2 == 3) {
            return "with_ads";
        }
        throw new IllegalStateException("Invalid OfferResponseStatus");
    }

    private AdsVisibility mapToAdsVisibility(WalletAdsOfferManager.OfferResponseStatus offerResponseStatus) {
        int i2 = AnonymousClass1.$SwitchMap$cm$aptoide$pt$ads$WalletAdsOfferManager$OfferResponseStatus[offerResponseStatus.ordinal()];
        if (i2 == 1) {
            return AdsVisibility.CONTROL;
        }
        if (i2 == 2) {
            return AdsVisibility.ADS_BLOCKED_BY_OFFER;
        }
        if (i2 == 3) {
            return AdsVisibility.HAS_ADS;
        }
        throw new IllegalStateException("Invalid OfferResponseStatus");
    }

    public void setAdsVisibilityUserProperty(WalletAdsOfferManager.OfferResponseStatus offerResponseStatus) {
        Bundle bundle = new Bundle();
        String type = mapToAdsVisibility(offerResponseStatus).getType();
        bundle.putString(ADS_STATUS_USER_PROPERTY, type);
        com.facebook.t.g.m(bundle, new GraphRequest.f() { // from class: cm.aptoide.pt.ads.y
            @Override // com.facebook.GraphRequest.f
            public final void b(com.facebook.i iVar) {
                Logger.getInstance().d("Facebook Analytics: ", iVar.toString());
            }
        });
        b.C0216b.a(ADS_STATUS_USER_PROPERTY, type);
        io.rakam.api.f.a().c0(addAdsSuperProperty(mapAdsVisibilityToAnalyticsValues(offerResponseStatus), io.rakam.api.f.a().x()));
    }

    public void setMoPubAbTestGroup(boolean z) {
        Bundle bundle = new Bundle();
        bundle.putString("ASV-1377-MoPub-Ads", z ? "a_without_mopub" : "b_with_mopub");
        com.facebook.t.g.m(bundle, new GraphRequest.f() { // from class: cm.aptoide.pt.ads.z
            @Override // com.facebook.GraphRequest.f
            public final void b(com.facebook.i iVar) {
                Logger.getInstance().d("Facebook Analytics: ", iVar.toString());
            }
        });
        b.C0216b.a("ASV-1377-MoPub-Ads", z ? "a_without_mopub" : "b_with_mopub");
    }

    void setUserId(String str) {
        io.rakam.api.f.a().d0(str);
        e.f.a.a.a.v(str);
        Logger.getInstance().d("RAKAM", "set user");
        Logger.getInstance().d("INDICATIVE", "set user");
    }
}
