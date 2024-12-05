package M2;

import android.content.Context;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import m2.C3427m;
import u2.InterfaceC4057d;

/* loaded from: classes4.dex */
public final class f {

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3256z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f6465a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC4057d f6466b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context, InterfaceC4057d interfaceC4057d) {
            super(1);
            this.f6465a = context;
            this.f6466b = interfaceC4057d;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.stripe.android.googlepaylauncher.b invoke(L2.d environment) {
            AbstractC3255y.i(environment, "environment");
            return new com.stripe.android.googlepaylauncher.b(this.f6465a, environment, new C3427m.a(false, null, false, 7, null), true, true, null, this.f6466b, 32, null);
        }
    }

    public final Function1 a(Context appContext, InterfaceC4057d logger) {
        AbstractC3255y.i(appContext, "appContext");
        AbstractC3255y.i(logger, "logger");
        return new a(appContext, logger);
    }
}
