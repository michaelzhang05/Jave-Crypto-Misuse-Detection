package n0;

import O.a;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.api.Scope;

/* loaded from: classes3.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final a.g f35279a;

    /* renamed from: b, reason: collision with root package name */
    public static final a.g f35280b;

    /* renamed from: c, reason: collision with root package name */
    public static final a.AbstractC0143a f35281c;

    /* renamed from: d, reason: collision with root package name */
    static final a.AbstractC0143a f35282d;

    /* renamed from: e, reason: collision with root package name */
    public static final Scope f35283e;

    /* renamed from: f, reason: collision with root package name */
    public static final Scope f35284f;

    /* renamed from: g, reason: collision with root package name */
    public static final O.a f35285g;

    /* renamed from: h, reason: collision with root package name */
    public static final O.a f35286h;

    static {
        a.g gVar = new a.g();
        f35279a = gVar;
        a.g gVar2 = new a.g();
        f35280b = gVar2;
        C3454b c3454b = new C3454b();
        f35281c = c3454b;
        C3455c c3455c = new C3455c();
        f35282d = c3455c;
        f35283e = new Scope("profile");
        f35284f = new Scope(NotificationCompat.CATEGORY_EMAIL);
        f35285g = new O.a("SignIn.API", c3454b, gVar);
        f35286h = new O.a("SignIn.INTERNAL_API", c3455c, gVar2);
    }
}
