package p;

import B5.s;
import com.inmobi.cmp.core.cmpapi.status.CmpStatus;
import com.inmobi.cmp.core.cmpapi.status.DisplayStatus;
import java.util.LinkedHashMap;

/* renamed from: p.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3731a {

    /* renamed from: a, reason: collision with root package name */
    public static final C3731a f36891a = new C3731a();

    /* renamed from: b, reason: collision with root package name */
    public static CmpStatus f36892b;

    /* renamed from: c, reason: collision with root package name */
    public static s f36893c;

    /* renamed from: d, reason: collision with root package name */
    public static String f36894d;

    /* renamed from: e, reason: collision with root package name */
    public static String f36895e;

    static {
        new LinkedHashMap();
        f36892b = CmpStatus.LOADING;
        DisplayStatus displayStatus = DisplayStatus.VISIBLE;
    }

    public final CmpStatus a() {
        return f36892b;
    }

    public final void b(s sVar) {
        f36893c = sVar;
    }

    public final void c(String str) {
        f36895e = str;
    }

    public final String d() {
        return f36895e;
    }

    public final void e(String str) {
        f36894d = str;
    }

    public final s f() {
        return f36893c;
    }

    public final String g() {
        return f36894d;
    }
}
