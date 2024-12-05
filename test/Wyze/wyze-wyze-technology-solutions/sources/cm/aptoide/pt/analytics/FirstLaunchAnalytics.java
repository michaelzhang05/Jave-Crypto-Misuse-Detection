package cm.aptoide.pt.analytics;

import android.app.Application;
import android.content.SharedPreferences;
import android.os.Bundle;
import cm.aptoide.analytics.AnalyticsLogger;
import cm.aptoide.analytics.AnalyticsManager;
import cm.aptoide.pt.GmsStatusValueProvider;
import cm.aptoide.pt.account.AdultContentAnalytics;
import cm.aptoide.pt.networking.IdsRepository;
import cm.aptoide.pt.preferences.secure.SecurePreferences;
import com.facebook.GraphRequest;
import com.facebook.i;
import com.google.android.gms.safetynet.HarmfulAppsData;
import com.google.android.gms.safetynet.SafetyNetApi;
import com.google.android.gms.safetynet.SafetyNetClient;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import e.d.a.b;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import rx.schedulers.Schedulers;

/* loaded from: classes.dex */
public class FirstLaunchAnalytics {
    private static final String APTOIDE_PACKAGE = "aptoide_package";
    private static final String CATEGORY = "category";
    private static final String CONTEXT = "APPLICATION";
    private static final String ENTRY_POINT = "Entry Point";
    private static final String ENTRY_POINT_RAKAM = "entry_point";
    public static final String FIRST_LAUNCH = "Aptoide_First_Launch";
    public static final String FIRST_LAUNCH_RAKAM = "aptoide_first_launch";
    private static final String FLAGGED = "flagged";
    private static final String GMS = "GMS";
    private static final String GMS_RAKAM = "gms";
    private static final String IS_ACTIVE = "is_active";
    public static final String PLAY_PROTECT_EVENT = "Google_Play_Protect";
    private static final String TAG = "FirstLaunchAnalytics";
    private static final String UNKNOWN = "unknown";
    private static final String UTM_CAMPAIGN = "UTM Campaign";
    private static final String UTM_CAMPAIGN_RAKAM = "utm_campaign";
    private static final String UTM_CONTENT = "UTM Content";
    private static final String UTM_CONTENT_RAKAM = "utm_content";
    private static final String UTM_MEDIUM = "UTM Medium";
    private static final String UTM_MEDIUM_RAKAM = "utm_medium";
    private static final String UTM_PACKAGE_NAME = "utm_package_name";
    private static final String UTM_SOURCE = "UTM Source";
    private static final String UTM_SOURCE_RAKAM = "utm_source";
    private static final String UTM_TERM_RAKAM = "utm_term";
    private final AnalyticsManager analyticsManager;
    private final GmsStatusValueProvider gmsStatusValueProvider;
    private final AnalyticsLogger logger;
    private final String packageName;
    private final SafetyNetClient safetyNetClient;
    private String utmSource = UNKNOWN;
    private String utmMedium = UNKNOWN;
    private String utmCampaign = UNKNOWN;
    private String utmContent = UNKNOWN;
    private String entryPoint = UNKNOWN;

    public FirstLaunchAnalytics(AnalyticsManager analyticsManager, AnalyticsLogger analyticsLogger, SafetyNetClient safetyNetClient, String str, GmsStatusValueProvider gmsStatusValueProvider) {
        this.analyticsManager = analyticsManager;
        this.logger = analyticsLogger;
        this.safetyNetClient = safetyNetClient;
        this.packageName = str;
        this.gmsStatusValueProvider = gmsStatusValueProvider;
    }

    private JSONObject addFirstLaunchProperties(boolean z, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            jSONObject.put("first_session", z);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return jSONObject;
    }

    private Map<String, Object> createFacebookFirstLaunchDataMap(String str, String str2, String str3, String str4, String str5) {
        HashMap hashMap = new HashMap();
        hashMap.put(UTM_SOURCE, str);
        hashMap.put(UTM_MEDIUM, str2);
        hashMap.put(UTM_CAMPAIGN, str3);
        hashMap.put(UTM_CONTENT, str4);
        hashMap.put(ENTRY_POINT, str5);
        return hashMap;
    }

    private String getCategoryFlaggedByPlayProtect(List<HarmfulAppsData> list) {
        for (HarmfulAppsData harmfulAppsData : list) {
            if (harmfulAppsData.f16290f.equals(this.packageName)) {
                return getPlayProtectCategoryName(harmfulAppsData.f16292h);
            }
        }
        return null;
    }

    private String getPlayProtectCategoryName(int i2) {
        switch (i2) {
            case 1:
                return "RANSOMWARE";
            case 2:
                return "PHISHING";
            case 3:
                return "TROJAN";
            case 4:
                return "UNCOMMON";
            case 5:
                return "FRAUDWARE";
            case 6:
                return "TOLL_FRAUD";
            case 7:
                return "WAP_FRAUD";
            case 8:
                return "CALL_FRAUD";
            case 9:
                return "BACKDOOR";
            case 10:
                return "SPYWARE";
            case 11:
                return "GENERIC_MALWARE";
            case 12:
                return "HARMFUL_SITE";
            case 13:
                return "WINDOWS_MALWARE";
            case 14:
                return "HOSTILE_DOWNLOADER";
            case 15:
                return "NON_ANDROID_THREAT";
            case 16:
                return "ROOTING";
            case 17:
                return "PRIVILEGE_ESCALATION";
            case 18:
                return "TRACKING";
            case 19:
                return "SPAM";
            case 20:
                return "DENIAL_OF_SERVICE";
            case 21:
                return "DATA_COLLECTION";
            default:
                return "UNKNOWN_CATEGORY";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$sendAppStart$1, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void a(SharedPreferences sharedPreferences, String str) {
        setupFirstLaunchSuperProperty(SecurePreferences.isFirstRun(sharedPreferences));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$sendAppStart$2, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void b(String str) {
        sendPlayProtectEvent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$sendAppStart$4, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void c(String str) {
        sendFirstLaunchEvent(this.utmSource, this.utmMedium, this.utmCampaign, this.utmContent, this.entryPoint);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$sendPlayProtectEvent$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void d(Task task) {
        String str;
        boolean z = true;
        boolean z2 = false;
        if (task.f()) {
            str = getCategoryFlaggedByPlayProtect(((SafetyNetApi.HarmfulAppsResponse) task.d()).o());
            if (str != null) {
                z2 = true;
            }
        } else {
            str = null;
            z = false;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(IS_ACTIVE, z ? "true" : AdultContentAnalytics.UNLOCK);
        hashMap.put(FLAGGED, z2 ? "true" : AdultContentAnalytics.UNLOCK);
        hashMap.put(CATEGORY, str);
        this.analyticsManager.logEvent(hashMap, PLAY_PROTECT_EVENT, AnalyticsManager.Action.OPEN, CONTEXT);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setUserProperties$5, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void e(i iVar) {
        this.logger.logDebug("Facebook Analytics: ", iVar.toString());
    }

    private void sendFirstLaunchEvent(String str, String str2, String str3, String str4, String str5) {
        AnalyticsManager analyticsManager = this.analyticsManager;
        Map<String, Object> createFacebookFirstLaunchDataMap = createFacebookFirstLaunchDataMap(str, str2, str3, str4, str5);
        AnalyticsManager.Action action = AnalyticsManager.Action.OPEN;
        analyticsManager.logEvent(createFacebookFirstLaunchDataMap, FIRST_LAUNCH, action, CONTEXT);
        this.analyticsManager.logEvent(new HashMap(), FIRST_LAUNCH_RAKAM, action, CONTEXT);
    }

    private void sendPlayProtectEvent() {
        this.safetyNetClient.m().a(new OnCompleteListener() { // from class: cm.aptoide.pt.analytics.a
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void a(Task task) {
                FirstLaunchAnalytics.this.d(task);
            }
        });
    }

    private void setUserProperties(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString(str, str2);
        com.facebook.t.g.m(bundle, new GraphRequest.f() { // from class: cm.aptoide.pt.analytics.c
            @Override // com.facebook.GraphRequest.f
            public final void b(i iVar) {
                FirstLaunchAnalytics.this.e(iVar);
            }
        });
        b.C0216b.a(str, str2);
    }

    private void setupFirstLaunchSuperProperty(boolean z) {
        io.rakam.api.f.a().c0(addFirstLaunchProperties(z, io.rakam.api.f.a().x()));
        HashMap hashMap = new HashMap();
        hashMap.put("first_session", Boolean.valueOf(z));
        hashMap.put(APTOIDE_PACKAGE, this.packageName);
        e.f.a.a.a.c(hashMap);
    }

    public rx.b sendAppStart(Application application, final SharedPreferences sharedPreferences, IdsRepository idsRepository) {
        return idsRepository.getUniqueIdentifier().g(new rx.m.b() { // from class: cm.aptoide.pt.analytics.g
            @Override // rx.m.b
            public final void call(Object obj) {
                com.facebook.t.g.l((String) obj);
            }
        }).A().x(new rx.m.b() { // from class: cm.aptoide.pt.analytics.f
            @Override // rx.m.b
            public final void call(Object obj) {
                FirstLaunchAnalytics.this.a(sharedPreferences, (String) obj);
            }
        }).x(new rx.m.b() { // from class: cm.aptoide.pt.analytics.d
            @Override // rx.m.b
            public final void call(Object obj) {
                FirstLaunchAnalytics.this.b((String) obj);
            }
        }).D(new rx.m.e() { // from class: cm.aptoide.pt.analytics.b
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(SecurePreferences.isFirstRun(sharedPreferences));
                return valueOf;
            }
        }).x(new rx.m.b() { // from class: cm.aptoide.pt.analytics.e
            @Override // rx.m.b
            public final void call(Object obj) {
                FirstLaunchAnalytics.this.c((String) obj);
            }
        }).X0().K(Schedulers.io());
    }

    public void sendIndicativeFirstLaunchSourceUserProperties(String str, String str2, String str3, String str4, String str5, String str6) {
        HashMap hashMap = new HashMap();
        hashMap.put(GMS_RAKAM, this.gmsStatusValueProvider.getGmsValue());
        hashMap.put(UTM_CONTENT_RAKAM, str);
        hashMap.put(UTM_SOURCE_RAKAM, str2);
        hashMap.put(UTM_CAMPAIGN_RAKAM, str3);
        hashMap.put(UTM_MEDIUM_RAKAM, str4);
        hashMap.put(UTM_TERM_RAKAM, str5);
        hashMap.put(UTM_PACKAGE_NAME, str6);
        e.f.a.a.a.c(hashMap);
    }

    public void setGmsPresent() {
        setUserProperties(GMS, this.gmsStatusValueProvider.getGmsValue());
    }
}
