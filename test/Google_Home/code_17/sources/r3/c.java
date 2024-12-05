package r3;

import O5.InterfaceC1351g;
import androidx.appcompat.app.AppCompatActivity;
import com.stripe.android.financialconnections.FinancialConnectionsSheetResultCallback;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetForDataLauncher;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetForInstantDebitsLauncher;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import kotlin.jvm.internal.InterfaceC3249s;

/* loaded from: classes4.dex */
public interface c {

    /* renamed from: a, reason: collision with root package name */
    public static final a f38586a = a.f38587a;

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f38587a = new a();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: r3.c$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0869a extends AbstractC3256z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ AppCompatActivity f38588a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function1 f38589b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0869a(AppCompatActivity appCompatActivity, Function1 function1) {
                super(0);
                this.f38588a = appCompatActivity;
                this.f38589b = function1;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C3918b invoke() {
                return new C3918b(new FinancialConnectionsSheetForDataLauncher(this.f38588a, new b(this.f38589b)));
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class b extends AbstractC3256z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ AppCompatActivity f38590a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function1 f38591b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(AppCompatActivity appCompatActivity, Function1 function1) {
                super(0);
                this.f38590a = appCompatActivity;
                this.f38591b = function1;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C3918b invoke() {
                return new C3918b(new FinancialConnectionsSheetForInstantDebitsLauncher(this.f38590a, this.f38591b));
            }
        }

        private a() {
        }

        public static /* synthetic */ c b(a aVar, AppCompatActivity appCompatActivity, Function1 function1, Function0 function0, d dVar, int i8, Object obj) {
            if ((i8 & 4) != 0) {
                function0 = new C0869a(appCompatActivity, function1);
            }
            if ((i8 & 8) != 0) {
                dVar = C3917a.f38584a;
            }
            return aVar.a(appCompatActivity, function1, function0, dVar);
        }

        public static /* synthetic */ c d(a aVar, AppCompatActivity appCompatActivity, Function1 function1, Function0 function0, d dVar, int i8, Object obj) {
            if ((i8 & 4) != 0) {
                function0 = new b(appCompatActivity, function1);
            }
            if ((i8 & 8) != 0) {
                dVar = C3917a.f38584a;
            }
            return aVar.c(appCompatActivity, function1, function0, dVar);
        }

        public final c a(AppCompatActivity activity, Function1 onComplete, Function0 provider, d isFinancialConnectionsAvailable) {
            AbstractC3255y.i(activity, "activity");
            AbstractC3255y.i(onComplete, "onComplete");
            AbstractC3255y.i(provider, "provider");
            AbstractC3255y.i(isFinancialConnectionsAvailable, "isFinancialConnectionsAvailable");
            if (isFinancialConnectionsAvailable.invoke()) {
                return (c) provider.invoke();
            }
            return new e();
        }

        public final c c(AppCompatActivity activity, Function1 onComplete, Function0 provider, d isFinancialConnectionsAvailable) {
            AbstractC3255y.i(activity, "activity");
            AbstractC3255y.i(onComplete, "onComplete");
            AbstractC3255y.i(provider, "provider");
            AbstractC3255y.i(isFinancialConnectionsAvailable, "isFinancialConnectionsAvailable");
            if (isFinancialConnectionsAvailable.invoke()) {
                return (c) provider.invoke();
            }
            return new e();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b implements FinancialConnectionsSheetResultCallback, InterfaceC3249s {

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Function1 f38592a;

        b(Function1 function) {
            AbstractC3255y.i(function, "function");
            this.f38592a = function;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof FinancialConnectionsSheetResultCallback) || !(obj instanceof InterfaceC3249s)) {
                return false;
            }
            return AbstractC3255y.d(getFunctionDelegate(), ((InterfaceC3249s) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.InterfaceC3249s
        public final InterfaceC1351g getFunctionDelegate() {
            return this.f38592a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    void a(String str, String str2, String str3);
}
