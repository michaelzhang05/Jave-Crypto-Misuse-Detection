package cm.aptoide.pt.app.mmpcampaigns;

import cm.aptoide.pt.BuildConfig;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.b0;
import kotlin.jvm.internal.l;
import kotlin.text.u;
import kotlin.text.v;
import okhttp3.HttpUrl;

/* compiled from: CampaignManager.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001¨\u0006\u0004"}, d2 = {"injectCampaignAttributes", HttpUrl.FRAGMENT_ENCODE_SET, "medium", "guestUID", "app_vanillaProdRelease"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CampaignManagerKt {
    public static final String injectCampaignAttributes(String str, String str2, String str3) {
        String w;
        String b0;
        boolean F;
        l.f(str, "<this>");
        l.f(str2, "medium");
        w = u.w(str, "{{OEMID}}", BuildConfig.OEMID, false, 4, null);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("utm_source", "Vanilla");
        linkedHashMap.put("utm_medium", str2);
        String str4 = null;
        if (str3 != null) {
            if (!(str3.length() > 0)) {
                str3 = null;
            }
            if (str3 != null) {
                linkedHashMap.put("guest_uid", str3);
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            arrayList.add(((String) entry.getKey()) + '=' + ((String) entry.getValue()));
        }
        b0 = b0.b0(arrayList, "&", null, null, 0, null, null, 62, null);
        if (!(b0.length() > 0)) {
            b0 = null;
        }
        if (b0 != null) {
            StringBuilder sb = new StringBuilder();
            F = v.F(w, "?", false, 2, null);
            sb.append(F ? "&" : "?");
            sb.append(b0);
            str4 = sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(w);
        if (str4 == null) {
            str4 = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        sb2.append(str4);
        return sb2.toString();
    }
}
