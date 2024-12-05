package D2;

import O5.s;
import O5.t;
import android.content.Context;
import android.content.pm.PackageInfo;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f1776a = new a();

    private a() {
    }

    public final /* synthetic */ PackageInfo a(Context context) {
        Object b8;
        AbstractC3255y.i(context, "<this>");
        try {
            s.a aVar = s.f8302b;
            b8 = s.b(context.getPackageManager().getPackageInfo(context.getPackageName(), 0));
        } catch (Throwable th) {
            s.a aVar2 = s.f8302b;
            b8 = s.b(t.a(th));
        }
        if (s.g(b8)) {
            b8 = null;
        }
        return (PackageInfo) b8;
    }
}
