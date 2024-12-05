package J2;

import android.content.Context;
import j2.C3073m;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import r2.InterfaceC3684d;

/* loaded from: classes4.dex */
public final class f {

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f4759a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC3684d f4760b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context, InterfaceC3684d interfaceC3684d) {
            super(1);
            this.f4759a = context;
            this.f4760b = interfaceC3684d;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.stripe.android.googlepaylauncher.b invoke(I2.d environment) {
            AbstractC3159y.i(environment, "environment");
            return new com.stripe.android.googlepaylauncher.b(this.f4759a, environment, new C3073m.a(false, null, false, 7, null), true, true, null, this.f4760b, 32, null);
        }
    }

    public final Function1 a(Context appContext, InterfaceC3684d logger) {
        AbstractC3159y.i(appContext, "appContext");
        AbstractC3159y.i(logger, "logger");
        return new a(appContext, logger);
    }
}
