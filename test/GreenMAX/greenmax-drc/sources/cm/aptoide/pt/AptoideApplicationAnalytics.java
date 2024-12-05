package cm.aptoide.pt;

import android.os.Bundle;
import cm.aptoide.analytics.AnalyticsManager;
import cm.aptoide.pt.logger.Logger;
import com.facebook.GraphRequest;
import e.d.a.b;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class AptoideApplicationAnalytics {
    private static final String APTOIDE_PACKAGE = "aptoide_package";
    private static final String CONTEXT = "APPLICATION";
    public static final String IS_ANDROID_TV = "Is_Android_Tv";
    private static final String IS_ANDROID_TV_FIELD = "is_android_tv";
    private final AnalyticsManager analyticsManager;

    public AptoideApplicationAnalytics(AnalyticsManager analyticsManager) {
        this.analyticsManager = analyticsManager;
    }

    private JSONObject addJsonLoginSuperProperty(boolean z, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            jSONObject.put("logged_in", z);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return jSONObject;
    }

    public void sendIsTvEvent(boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put(IS_ANDROID_TV_FIELD, Boolean.valueOf(z));
        this.analyticsManager.logEvent(hashMap, IS_ANDROID_TV, AnalyticsManager.Action.AUTO, CONTEXT);
    }

    public void setPackageDimension(String str) {
        Bundle bundle = new Bundle();
        bundle.putString(APTOIDE_PACKAGE, str);
        com.facebook.t.g.m(bundle, new GraphRequest.f() { // from class: cm.aptoide.pt.g0
            @Override // com.facebook.GraphRequest.f
            public final void b(com.facebook.i iVar) {
                Logger.getInstance().d("Facebook Analytics: ", iVar.toString());
            }
        });
        b.C0216b.a(APTOIDE_PACKAGE, str);
    }

    public void setVersionCodeDimension(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("version code", str);
        com.facebook.t.g.m(bundle, new GraphRequest.f() { // from class: cm.aptoide.pt.f0
            @Override // com.facebook.GraphRequest.f
            public final void b(com.facebook.i iVar) {
                Logger.getInstance().d("Facebook Analytics: ", iVar.toString());
            }
        });
        b.C0216b.a("version code", str);
    }

    public void updateDimension(boolean z) {
        Bundle bundle = new Bundle();
        bundle.putString("Logged In", z ? "Logged In" : "Not Logged In");
        com.facebook.t.g.m(bundle, new GraphRequest.f() { // from class: cm.aptoide.pt.h0
            @Override // com.facebook.GraphRequest.f
            public final void b(com.facebook.i iVar) {
                Logger.getInstance().d("Facebook Analytics: ", iVar.toString());
            }
        });
        b.C0216b.a("Logged In", z ? "Logged In" : "Not Logged In");
        io.rakam.api.f.a().c0(addJsonLoginSuperProperty(z, io.rakam.api.f.a().x()));
        e.f.a.a.a.f("logged_in", z);
    }
}
