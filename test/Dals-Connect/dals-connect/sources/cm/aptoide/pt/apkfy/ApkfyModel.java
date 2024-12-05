package cm.aptoide.pt.apkfy;

import cm.aptoide.pt.DeepLinkIntentReceiver;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import okhttp3.HttpUrl;

/* compiled from: ApkfyModel.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B]\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\rJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jx\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010$J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u0006\u0010(\u001a\u00020&J\t\u0010)\u001a\u00020*HÖ\u0001J\t\u0010+\u001a\u00020\u0003HÖ\u0001R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012¨\u0006,"}, d2 = {"Lcm/aptoide/pt/apkfy/ApkfyModel;", HttpUrl.FRAGMENT_ENCODE_SET, "packageName", HttpUrl.FRAGMENT_ENCODE_SET, "appId", HttpUrl.FRAGMENT_ENCODE_SET, DeepLinkIntentReceiver.DeepLinksKeys.OEM_ID_KEY, "guestUid", "utmSource", "utmMedium", "utmCampaign", "utmTerm", "utmContent", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAppId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getGuestUid", "()Ljava/lang/String;", "getOemId", "getPackageName", "getUtmCampaign", "getUtmContent", "getUtmMedium", "getUtmSource", "getUtmTerm", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcm/aptoide/pt/apkfy/ApkfyModel;", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hasUTMs", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "app_vanillaProdRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class ApkfyModel {
    private final Long appId;
    private final String guestUid;
    private final String oemId;
    private final String packageName;
    private final String utmCampaign;
    private final String utmContent;
    private final String utmMedium;
    private final String utmSource;
    private final String utmTerm;

    public ApkfyModel(String str, Long l, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        l.f(str3, "guestUid");
        this.packageName = str;
        this.appId = l;
        this.oemId = str2;
        this.guestUid = str3;
        this.utmSource = str4;
        this.utmMedium = str5;
        this.utmCampaign = str6;
        this.utmTerm = str7;
        this.utmContent = str8;
    }

    /* renamed from: component1, reason: from getter */
    public final String getPackageName() {
        return this.packageName;
    }

    /* renamed from: component2, reason: from getter */
    public final Long getAppId() {
        return this.appId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getOemId() {
        return this.oemId;
    }

    /* renamed from: component4, reason: from getter */
    public final String getGuestUid() {
        return this.guestUid;
    }

    /* renamed from: component5, reason: from getter */
    public final String getUtmSource() {
        return this.utmSource;
    }

    /* renamed from: component6, reason: from getter */
    public final String getUtmMedium() {
        return this.utmMedium;
    }

    /* renamed from: component7, reason: from getter */
    public final String getUtmCampaign() {
        return this.utmCampaign;
    }

    /* renamed from: component8, reason: from getter */
    public final String getUtmTerm() {
        return this.utmTerm;
    }

    /* renamed from: component9, reason: from getter */
    public final String getUtmContent() {
        return this.utmContent;
    }

    public final ApkfyModel copy(String packageName, Long appId, String oemId, String guestUid, String utmSource, String utmMedium, String utmCampaign, String utmTerm, String utmContent) {
        l.f(guestUid, "guestUid");
        return new ApkfyModel(packageName, appId, oemId, guestUid, utmSource, utmMedium, utmCampaign, utmTerm, utmContent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApkfyModel)) {
            return false;
        }
        ApkfyModel apkfyModel = (ApkfyModel) other;
        return l.a(this.packageName, apkfyModel.packageName) && l.a(this.appId, apkfyModel.appId) && l.a(this.oemId, apkfyModel.oemId) && l.a(this.guestUid, apkfyModel.guestUid) && l.a(this.utmSource, apkfyModel.utmSource) && l.a(this.utmMedium, apkfyModel.utmMedium) && l.a(this.utmCampaign, apkfyModel.utmCampaign) && l.a(this.utmTerm, apkfyModel.utmTerm) && l.a(this.utmContent, apkfyModel.utmContent);
    }

    public final Long getAppId() {
        return this.appId;
    }

    public final String getGuestUid() {
        return this.guestUid;
    }

    public final String getOemId() {
        return this.oemId;
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

    public final boolean hasUTMs() {
        return (this.utmSource == null && this.utmMedium == null && this.utmCampaign == null && this.utmTerm == null && this.utmContent == null) ? false : true;
    }

    public int hashCode() {
        String str = this.packageName;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.appId;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str2 = this.oemId;
        int hashCode3 = (((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.guestUid.hashCode()) * 31;
        String str3 = this.utmSource;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.utmMedium;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.utmCampaign;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.utmTerm;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.utmContent;
        return hashCode7 + (str7 != null ? str7.hashCode() : 0);
    }

    public String toString() {
        return "ApkfyModel(packageName=" + this.packageName + ", appId=" + this.appId + ", oemId=" + this.oemId + ", guestUid=" + this.guestUid + ", utmSource=" + this.utmSource + ", utmMedium=" + this.utmMedium + ", utmCampaign=" + this.utmCampaign + ", utmTerm=" + this.utmTerm + ", utmContent=" + this.utmContent + ')';
    }
}
