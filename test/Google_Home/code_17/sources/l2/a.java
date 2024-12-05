package L2;

import android.content.Context;
import kotlin.jvm.internal.AbstractC3255y;
import r0.AbstractC3913v;
import r0.C3905m;

/* loaded from: classes4.dex */
public final class a implements h {

    /* renamed from: a, reason: collision with root package name */
    private final Context f5902a;

    public a(Context context) {
        AbstractC3255y.i(context, "context");
        this.f5902a = context;
    }

    @Override // L2.h
    public C3905m a(d environment) {
        AbstractC3255y.i(environment, "environment");
        AbstractC3913v.a a8 = new AbstractC3913v.a.C0865a().b(environment.b()).a();
        AbstractC3255y.h(a8, "build(...)");
        C3905m a9 = AbstractC3913v.a(this.f5902a, a8);
        AbstractC3255y.h(a9, "getPaymentsClient(...)");
        return a9;
    }
}
