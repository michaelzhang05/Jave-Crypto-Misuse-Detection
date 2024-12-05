package B1;

import android.webkit.WebView;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final l f726a;

    /* renamed from: b, reason: collision with root package name */
    private final WebView f727b;

    /* renamed from: c, reason: collision with root package name */
    private final List f728c;

    /* renamed from: d, reason: collision with root package name */
    private final Map f729d;

    /* renamed from: e, reason: collision with root package name */
    private final String f730e;

    /* renamed from: f, reason: collision with root package name */
    private final String f731f;

    /* renamed from: g, reason: collision with root package name */
    private final String f732g;

    /* renamed from: h, reason: collision with root package name */
    private final e f733h;

    private d(l lVar, WebView webView, String str, List list, String str2, String str3, e eVar) {
        ArrayList arrayList = new ArrayList();
        this.f728c = arrayList;
        this.f729d = new HashMap();
        this.f726a = lVar;
        this.f727b = webView;
        this.f730e = str;
        this.f733h = eVar;
        if (list != null) {
            arrayList.addAll(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                m mVar = (m) it.next();
                this.f729d.put(UUID.randomUUID().toString(), mVar);
            }
        }
        this.f732g = str2;
        this.f731f = str3;
    }

    public static d a(l lVar, WebView webView, String str, String str2) {
        H1.g.d(lVar, "Partner is null");
        H1.g.d(webView, "WebView is null");
        if (str2 != null) {
            H1.g.e(str2, 256, "CustomReferenceData is greater than 256 characters");
        }
        return new d(lVar, webView, null, null, str, str2, e.HTML);
    }

    public static d b(l lVar, String str, List list, String str2, String str3) {
        H1.g.d(lVar, "Partner is null");
        H1.g.d(str, "OM SDK JS script content is null");
        H1.g.d(list, "VerificationScriptResources is null");
        if (str3 != null) {
            H1.g.e(str3, 256, "CustomReferenceData is greater than 256 characters");
        }
        return new d(lVar, null, str, list, str2, str3, e.NATIVE);
    }

    public e c() {
        return this.f733h;
    }

    public String d() {
        return this.f732g;
    }

    public String e() {
        return this.f731f;
    }

    public Map f() {
        return DesugarCollections.unmodifiableMap(this.f729d);
    }

    public String g() {
        return this.f730e;
    }

    public l h() {
        return this.f726a;
    }

    public List i() {
        return DesugarCollections.unmodifiableList(this.f728c);
    }

    public WebView j() {
        return this.f727b;
    }
}
