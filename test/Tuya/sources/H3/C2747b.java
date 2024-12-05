package h3;

import M5.a0;
import android.app.Application;
import android.content.Context;
import com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* renamed from: h3.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2747b {

    /* renamed from: a, reason: collision with root package name */
    public static final C2747b f31384a = new C2747b();

    /* renamed from: h3.b$a */
    /* loaded from: classes4.dex */
    static final class a extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ CollectBankAccountContract.a f31385a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(CollectBankAccountContract.a aVar) {
            super(0);
            this.f31385a = aVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return this.f31385a.f();
        }
    }

    private C2747b() {
    }

    public final Function0 a(CollectBankAccountContract.a args) {
        AbstractC3159y.i(args, "args");
        return new a(args);
    }

    public final Context b(Application application) {
        AbstractC3159y.i(application, "application");
        return application;
    }

    public final boolean c() {
        return false;
    }

    public final Set d() {
        return a0.f();
    }
}
