package y1;

import android.webkit.WebView;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* renamed from: y1.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3971d {

    /* renamed from: a, reason: collision with root package name */
    private final C3979l f39682a;

    /* renamed from: b, reason: collision with root package name */
    private final WebView f39683b;

    /* renamed from: c, reason: collision with root package name */
    private final List f39684c;

    /* renamed from: d, reason: collision with root package name */
    private final Map f39685d;

    /* renamed from: e, reason: collision with root package name */
    private final String f39686e;

    /* renamed from: f, reason: collision with root package name */
    private final String f39687f;

    /* renamed from: g, reason: collision with root package name */
    private final String f39688g;

    /* renamed from: h, reason: collision with root package name */
    private final EnumC3972e f39689h;

    private C3971d(C3979l c3979l, WebView webView, String str, List list, String str2, String str3, EnumC3972e enumC3972e) {
        ArrayList arrayList = new ArrayList();
        this.f39684c = arrayList;
        this.f39685d = new HashMap();
        this.f39682a = c3979l;
        this.f39683b = webView;
        this.f39686e = str;
        this.f39689h = enumC3972e;
        if (list != null) {
            arrayList.addAll(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C3980m c3980m = (C3980m) it.next();
                this.f39685d.put(UUID.randomUUID().toString(), c3980m);
            }
        }
        this.f39688g = str2;
        this.f39687f = str3;
    }

    public static C3971d a(C3979l c3979l, WebView webView, String str, String str2) {
        E1.g.b(c3979l, "Partner is null");
        E1.g.b(webView, "WebView is null");
        if (str2 != null) {
            E1.g.c(str2, 256, "CustomReferenceData is greater than 256 characters");
        }
        return new C3971d(c3979l, webView, null, null, str, str2, EnumC3972e.HTML);
    }

    public static C3971d b(C3979l c3979l, String str, List list, String str2, String str3) {
        E1.g.b(c3979l, "Partner is null");
        E1.g.b(str, "OM SDK JS script content is null");
        E1.g.b(list, "VerificationScriptResources is null");
        if (str3 != null) {
            E1.g.c(str3, 256, "CustomReferenceData is greater than 256 characters");
        }
        return new C3971d(c3979l, null, str, list, str2, str3, EnumC3972e.NATIVE);
    }

    public EnumC3972e c() {
        return this.f39689h;
    }

    public String d() {
        return this.f39688g;
    }

    public String e() {
        return this.f39687f;
    }

    public Map f() {
        return DesugarCollections.unmodifiableMap(this.f39685d);
    }

    public String g() {
        return this.f39686e;
    }

    public C3979l h() {
        return this.f39682a;
    }

    public List i() {
        return DesugarCollections.unmodifiableList(this.f39684c);
    }

    public WebView j() {
        return this.f39683b;
    }
}
