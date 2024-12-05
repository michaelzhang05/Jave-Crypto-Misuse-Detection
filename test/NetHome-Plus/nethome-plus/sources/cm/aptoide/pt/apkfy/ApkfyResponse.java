package cm.aptoide.pt.apkfy;

import androidx.annotation.Keep;
import cm.aptoide.pt.reviews.RateAndReviewsFragment;
import com.google.gson.s.c;
import kotlin.Metadata;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;
import okhttp3.HttpUrl;

/* compiled from: ApkfyResponse.kt */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bo\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\rJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jx\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010$J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020)HÖ\u0001J\t\u0010*\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012¨\u0006+"}, d2 = {"Lcm/aptoide/pt/apkfy/ApkfyResponse;", HttpUrl.FRAGMENT_ENCODE_SET, "guestUId", HttpUrl.FRAGMENT_ENCODE_SET, "packageName", "appId", HttpUrl.FRAGMENT_ENCODE_SET, "utmSource", "utmMedium", "utmCampaign", "utmTerm", "utmContent", "oemid", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAppId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getGuestUId", "()Ljava/lang/String;", "getOemid", "getPackageName", "getUtmCampaign", "getUtmContent", "getUtmMedium", "getUtmSource", "getUtmTerm", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcm/aptoide/pt/apkfy/ApkfyResponse;", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "app_vanillaProdRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class ApkfyResponse {

    @c(RateAndReviewsFragment.BundleCons.APP_ID)
    private final Long appId;

    @c("guest_uid")
    private final String guestUId;

    @c("oemid")
    private final String oemid;

    @c("package_name")
    private final String packageName;

    @c("utm_campaign")
    private final String utmCampaign;

    @c("utm_content")
    private final String utmContent;

    @c("utm_medium")
    private final String utmMedium;

    @c("utm_source")
    private final String utmSource;

    @c("utm_term")
    private final String utmTerm;

    public ApkfyResponse() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }

    public ApkfyResponse(String str, String str2, Long l, String str3, String str4, String str5, String str6, String str7, String str8) {
        l.f(str, "guestUId");
        this.guestUId = str;
        this.packageName = str2;
        this.appId = l;
        this.utmSource = str3;
        this.utmMedium = str4;
        this.utmCampaign = str5;
        this.utmTerm = str6;
        this.utmContent = str7;
        this.oemid = str8;
    }

    /* renamed from: component1, reason: from getter */
    public final String getGuestUId() {
        return this.guestUId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPackageName() {
        return this.packageName;
    }

    /* renamed from: component3, reason: from getter */
    public final Long getAppId() {
        return this.appId;
    }

    /* renamed from: component4, reason: from getter */
    public final String getUtmSource() {
        return this.utmSource;
    }

    /* renamed from: component5, reason: from getter */
    public final String getUtmMedium() {
        return this.utmMedium;
    }

    /* renamed from: component6, reason: from getter */
    public final String getUtmCampaign() {
        return this.utmCampaign;
    }

    /* renamed from: component7, reason: from getter */
    public final String getUtmTerm() {
        return this.utmTerm;
    }

    /* renamed from: component8, reason: from getter */
    public final String getUtmContent() {
        return this.utmContent;
    }

    /* renamed from: component9, reason: from getter */
    public final String getOemid() {
        return this.oemid;
    }

    public final ApkfyResponse copy(String guestUId, String packageName, Long appId, String utmSource, String utmMedium, String utmCampaign, String utmTerm, String utmContent, String oemid) {
        l.f(guestUId, "guestUId");
        return new ApkfyResponse(guestUId, packageName, appId, utmSource, utmMedium, utmCampaign, utmTerm, utmContent, oemid);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApkfyResponse)) {
            return false;
        }
        ApkfyResponse apkfyResponse = (ApkfyResponse) other;
        return l.a(this.guestUId, apkfyResponse.guestUId) && l.a(this.packageName, apkfyResponse.packageName) && l.a(this.appId, apkfyResponse.appId) && l.a(this.utmSource, apkfyResponse.utmSource) && l.a(this.utmMedium, apkfyResponse.utmMedium) && l.a(this.utmCampaign, apkfyResponse.utmCampaign) && l.a(this.utmTerm, apkfyResponse.utmTerm) && l.a(this.utmContent, apkfyResponse.utmContent) && l.a(this.oemid, apkfyResponse.oemid);
    }

    public final Long getAppId() {
        return this.appId;
    }

    public final String getGuestUId() {
        return this.guestUId;
    }

    public final String getOemid() {
        return this.oemid;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public final String getUtmCampaign() {
        return this.utmCampaign;
    }

    public final String getUtmContent() {
        return this.utmContent;
    }

    public final String getUtmMedium() {
        return this.utmMedium;
    }

    public final String getUtmSource() {
        return this.utmSource;
    }

    public final String getUtmTerm() {
        return this.utmTerm;
    }

    public int hashCode() {
        int hashCode = this.guestUId.hashCode() * 31;
        String str = this.packageName;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.appId;
        int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        String str2 = this.utmSource;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.utmMedium;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.utmCampaign;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.utmTerm;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.utmContent;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.oemid;
        return hashCode8 + (str7 != null ? str7.hashCode() : 0);
    }

    public String toString() {
        return "ApkfyResponse(guestUId=" + this.guestUId + ", packageName=" + this.packageName + ", appId=" + this.appId + ", utmSource=" + this.utmSource + ", utmMedium=" + this.utmMedium + ", utmCampaign=" + this.utmCampaign + ", utmTerm=" + this.utmTerm + ", utmContent=" + this.utmContent + ", oemid=" + this.oemid + ')';
    }

    public /* synthetic */ ApkfyResponse(String str, String str2, Long l, String str3, String str4, String str5, String str6, String str7, String str8, int i2, g gVar) {
        this((i2 & 1) != 0 ? HttpUrl.FRAGMENT_ENCODE_SET : str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? null : l, (i2 & 8) != 0 ? null : str3, (i2 & 16) != 0 ? null : str4, (i2 & 32) != 0 ? null : str5, (i2 & 64) != 0 ? null : str6, (i2 & 128) != 0 ? null : str7, (i2 & 256) == 0 ? str8 : null);
    }
}
