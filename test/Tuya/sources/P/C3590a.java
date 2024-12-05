package p;

import com.inmobi.cmp.core.cmpapi.status.CmpStatus;
import com.inmobi.cmp.core.cmpapi.status.DisplayStatus;
import java.util.LinkedHashMap;
import y5.s;

/* renamed from: p.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3590a {

    /* renamed from: a, reason: collision with root package name */
    public static final C3590a f36964a = new C3590a();

    /* renamed from: b, reason: collision with root package name */
    public static CmpStatus f36965b;

    /* renamed from: c, reason: collision with root package name */
    public static s f36966c;

    /* renamed from: d, reason: collision with root package name */
    public static String f36967d;

    /* renamed from: e, reason: collision with root package name */
    public static String f36968e;

    static {
        new LinkedHashMap();
        f36965b = CmpStatus.LOADING;
        DisplayStatus displayStatus = DisplayStatus.VISIBLE;
    }

    public final CmpStatus a() {
        return f36965b;
    }

    public final void b(String str) {
        f36968e = str;
    }

    public final void c(s sVar) {
        f36966c = sVar;
    }

    public final String d() {
        return f36968e;
    }

    public final void e(String str) {
        f36967d = str;
    }

    public final s f() {
        return f36966c;
    }

    public final String g() {
        return f36967d;
    }
}
