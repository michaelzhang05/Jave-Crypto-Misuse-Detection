package A2;

import L5.s;
import L5.t;
import android.content.Context;
import android.content.pm.PackageInfo;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f74a = new a();

    private a() {
    }

    public final /* synthetic */ PackageInfo a(Context context) {
        Object b8;
        AbstractC3159y.i(context, "<this>");
        try {
            s.a aVar = s.f6511b;
            b8 = s.b(context.getPackageManager().getPackageInfo(context.getPackageName(), 0));
        } catch (Throwable th) {
            s.a aVar2 = s.f6511b;
            b8 = s.b(t.a(th));
        }
        if (s.g(b8)) {
            b8 = null;
        }
        return (PackageInfo) b8;
    }
}
