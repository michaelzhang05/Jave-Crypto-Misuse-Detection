package I2;

import android.content.Context;
import kotlin.jvm.internal.AbstractC3159y;
import s0.AbstractC3731v;
import s0.C3723m;

/* loaded from: classes4.dex */
public final class a implements h {

    /* renamed from: a, reason: collision with root package name */
    private final Context f3907a;

    public a(Context context) {
        AbstractC3159y.i(context, "context");
        this.f3907a = context;
    }

    @Override // I2.h
    public C3723m a(d environment) {
        AbstractC3159y.i(environment, "environment");
        AbstractC3731v.a a8 = new AbstractC3731v.a.C0871a().b(environment.b()).a();
        AbstractC3159y.h(a8, "build(...)");
        C3723m a9 = AbstractC3731v.a(this.f3907a, a8);
        AbstractC3159y.h(a9, "getPaymentsClient(...)");
        return a9;
    }
}
