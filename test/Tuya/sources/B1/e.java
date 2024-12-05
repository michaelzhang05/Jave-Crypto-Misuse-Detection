package B1;

import android.view.View;
import y1.EnumC3975h;

/* loaded from: classes3.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private final H1.a f678a;

    /* renamed from: b, reason: collision with root package name */
    private final String f679b;

    /* renamed from: c, reason: collision with root package name */
    private final EnumC3975h f680c;

    /* renamed from: d, reason: collision with root package name */
    private final String f681d;

    public e(View view, EnumC3975h enumC3975h, String str) {
        this.f678a = new H1.a(view);
        this.f679b = view.getClass().getCanonicalName();
        this.f680c = enumC3975h;
        this.f681d = str;
    }

    public String a() {
        return this.f681d;
    }

    public EnumC3975h b() {
        return this.f680c;
    }

    public H1.a c() {
        return this.f678a;
    }

    public String d() {
        return this.f679b;
    }
}
