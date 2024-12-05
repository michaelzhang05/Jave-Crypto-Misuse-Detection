package e4;

import O5.InterfaceC1351g;
import androidx.activity.result.ActivityResultRegistry;
import androidx.appcompat.app.AppCompatActivity;
import com.stripe.android.stripecardscan.cardscan.CardScanSheet;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import kotlin.jvm.internal.InterfaceC3249s;

/* loaded from: classes4.dex */
public interface o {

    /* renamed from: a, reason: collision with root package name */
    public static final a f31772a = a.f31773a;

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f31773a = new a();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: e4.o$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0730a extends AbstractC3256z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ AppCompatActivity f31774a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f31775b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Function1 f31776c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0730a(AppCompatActivity appCompatActivity, String str, Function1 function1) {
                super(0);
                this.f31774a = appCompatActivity;
                this.f31775b = str;
                this.f31776c = function1;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final f invoke() {
                return new f(CardScanSheet.Companion.create$default(CardScanSheet.Companion, this.f31774a, this.f31775b, new b(this.f31776c), (ActivityResultRegistry) null, 8, (Object) null));
            }
        }

        private a() {
        }

        public static /* synthetic */ o b(a aVar, AppCompatActivity appCompatActivity, String str, Function1 function1, n3.i iVar, Function0 function0, j jVar, int i8, Object obj) {
            if ((i8 & 16) != 0) {
                function0 = new C0730a(appCompatActivity, str, function1);
            }
            Function0 function02 = function0;
            if ((i8 & 32) != 0) {
                jVar = new e();
            }
            return aVar.a(appCompatActivity, str, function1, iVar, function02, jVar);
        }

        public final o a(AppCompatActivity activity, String stripePublishableKey, Function1 onFinished, n3.i errorReporter, Function0 provider, j isStripeCardScanAvailable) {
            AbstractC3255y.i(activity, "activity");
            AbstractC3255y.i(stripePublishableKey, "stripePublishableKey");
            AbstractC3255y.i(onFinished, "onFinished");
            AbstractC3255y.i(errorReporter, "errorReporter");
            AbstractC3255y.i(provider, "provider");
            AbstractC3255y.i(isStripeCardScanAvailable, "isStripeCardScanAvailable");
            if (isStripeCardScanAvailable.invoke()) {
                return (o) provider.invoke();
            }
            return new p(errorReporter);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b implements CardScanSheet.CardScanResultCallback, InterfaceC3249s {

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Function1 f31777a;

        b(Function1 function) {
            AbstractC3255y.i(function, "function");
            this.f31777a = function;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof CardScanSheet.CardScanResultCallback) || !(obj instanceof InterfaceC3249s)) {
                return false;
            }
            return AbstractC3255y.d(getFunctionDelegate(), ((InterfaceC3249s) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.InterfaceC3249s
        public final InterfaceC1351g getFunctionDelegate() {
            return this.f31777a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    void a();
}
