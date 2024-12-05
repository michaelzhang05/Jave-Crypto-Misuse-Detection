package E1;

import android.view.View;

/* loaded from: classes4.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private final K1.a f2273a;

    /* renamed from: b, reason: collision with root package name */
    private final String f2274b;

    /* renamed from: c, reason: collision with root package name */
    private final B1.h f2275c;

    /* renamed from: d, reason: collision with root package name */
    private final String f2276d;

    public e(View view, B1.h hVar, String str) {
        this.f2273a = new K1.a(view);
        this.f2274b = view.getClass().getCanonicalName();
        this.f2275c = hVar;
        this.f2276d = str;
    }

    public String a() {
        return this.f2276d;
    }

    public B1.h b() {
        return this.f2275c;
    }

    public K1.a c() {
        return this.f2273a;
    }

    public String d() {
        return this.f2274b;
    }
}
