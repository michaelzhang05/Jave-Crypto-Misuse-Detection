package k3;

import P5.a0;
import android.app.Application;
import android.content.Context;
import com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* renamed from: k3.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3214b {

    /* renamed from: a, reason: collision with root package name */
    public static final C3214b f34105a = new C3214b();

    /* renamed from: k3.b$a */
    /* loaded from: classes4.dex */
    static final class a extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ CollectBankAccountContract.a f34106a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(CollectBankAccountContract.a aVar) {
            super(0);
            this.f34106a = aVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return this.f34106a.h();
        }
    }

    private C3214b() {
    }

    public final Function0 a(CollectBankAccountContract.a args) {
        AbstractC3255y.i(args, "args");
        return new a(args);
    }

    public final Context b(Application application) {
        AbstractC3255y.i(application, "application");
        return application;
    }

    public final boolean c() {
        return false;
    }

    public final Set d() {
        return a0.f();
    }
}
