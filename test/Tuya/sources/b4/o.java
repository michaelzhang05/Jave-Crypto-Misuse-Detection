package b4;

import L5.InterfaceC1223g;
import androidx.activity.result.ActivityResultRegistry;
import androidx.appcompat.app.AppCompatActivity;
import com.stripe.android.stripecardscan.cardscan.CardScanSheet;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import kotlin.jvm.internal.InterfaceC3153s;

/* loaded from: classes4.dex */
public interface o {

    /* renamed from: a, reason: collision with root package name */
    public static final a f14766a = a.f14767a;

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f14767a = new a();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: b4.o$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0362a extends AbstractC3160z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ AppCompatActivity f14768a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f14769b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Function1 f14770c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0362a(AppCompatActivity appCompatActivity, String str, Function1 function1) {
                super(0);
                this.f14768a = appCompatActivity;
                this.f14769b = str;
                this.f14770c = function1;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final f invoke() {
                return new f(CardScanSheet.Companion.create$default(CardScanSheet.Companion, this.f14768a, this.f14769b, new b(this.f14770c), (ActivityResultRegistry) null, 8, (Object) null));
            }
        }

        private a() {
        }

        public static /* synthetic */ o b(a aVar, AppCompatActivity appCompatActivity, String str, Function1 function1, k3.i iVar, Function0 function0, j jVar, int i8, Object obj) {
            if ((i8 & 16) != 0) {
                function0 = new C0362a(appCompatActivity, str, function1);
            }
            Function0 function02 = function0;
            if ((i8 & 32) != 0) {
                jVar = new e();
            }
            return aVar.a(appCompatActivity, str, function1, iVar, function02, jVar);
        }

        public final o a(AppCompatActivity activity, String stripePublishableKey, Function1 onFinished, k3.i errorReporter, Function0 provider, j isStripeCardScanAvailable) {
            AbstractC3159y.i(activity, "activity");
            AbstractC3159y.i(stripePublishableKey, "stripePublishableKey");
            AbstractC3159y.i(onFinished, "onFinished");
            AbstractC3159y.i(errorReporter, "errorReporter");
            AbstractC3159y.i(provider, "provider");
            AbstractC3159y.i(isStripeCardScanAvailable, "isStripeCardScanAvailable");
            if (isStripeCardScanAvailable.invoke()) {
                return (o) provider.invoke();
            }
            return new p(errorReporter);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b implements CardScanSheet.CardScanResultCallback, InterfaceC3153s {

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Function1 f14771a;

        b(Function1 function) {
            AbstractC3159y.i(function, "function");
            this.f14771a = function;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof CardScanSheet.CardScanResultCallback) || !(obj instanceof InterfaceC3153s)) {
                return false;
            }
            return AbstractC3159y.d(getFunctionDelegate(), ((InterfaceC3153s) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.InterfaceC3153s
        public final InterfaceC1223g getFunctionDelegate() {
            return this.f14771a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    void a();
}
