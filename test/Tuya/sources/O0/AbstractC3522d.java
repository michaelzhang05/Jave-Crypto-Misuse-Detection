package o0;

import P.a;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.api.Scope;

/* renamed from: o0.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3522d {

    /* renamed from: a, reason: collision with root package name */
    public static final a.g f36354a;

    /* renamed from: b, reason: collision with root package name */
    public static final a.g f36355b;

    /* renamed from: c, reason: collision with root package name */
    public static final a.AbstractC0166a f36356c;

    /* renamed from: d, reason: collision with root package name */
    static final a.AbstractC0166a f36357d;

    /* renamed from: e, reason: collision with root package name */
    public static final Scope f36358e;

    /* renamed from: f, reason: collision with root package name */
    public static final Scope f36359f;

    /* renamed from: g, reason: collision with root package name */
    public static final P.a f36360g;

    /* renamed from: h, reason: collision with root package name */
    public static final P.a f36361h;

    static {
        a.g gVar = new a.g();
        f36354a = gVar;
        a.g gVar2 = new a.g();
        f36355b = gVar2;
        C3520b c3520b = new C3520b();
        f36356c = c3520b;
        C3521c c3521c = new C3521c();
        f36357d = c3521c;
        f36358e = new Scope("profile");
        f36359f = new Scope(NotificationCompat.CATEGORY_EMAIL);
        f36360g = new P.a("SignIn.API", c3520b, gVar);
        f36361h = new P.a("SignIn.INTERNAL_API", c3521c, gVar2);
    }
}
