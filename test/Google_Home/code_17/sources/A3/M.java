package A3;

import A2.C0947e;
import A3.M;
import M3.C1315j;
import M3.InterfaceC1324t;
import android.content.Context;
import android.content.pm.PackageManager;
import com.stripe.android.paymentsheet.u;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import t3.C4031e;
import x3.C4188b;
import x3.InterfaceC4187a;

/* loaded from: classes4.dex */
public abstract class M {

    /* renamed from: a, reason: collision with root package name */
    public static final a f283a = new a(null);

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: A3.M$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        static final class C0001a extends AbstractC3256z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Context f284a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ S5.g f285b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0001a(Context context, S5.g gVar) {
                super(1);
                this.f284a = context;
                this.f285b = gVar;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C4031e invoke(u.i iVar) {
                String str;
                Context context = this.f284a;
                if (iVar != null) {
                    str = iVar.getId();
                } else {
                    str = null;
                }
                return new C4031e(context, str, this.f285b);
            }
        }

        /* loaded from: classes4.dex */
        static final class b extends AbstractC3256z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ L5.a f286a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(L5.a aVar) {
                super(0);
                this.f286a = aVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return ((m2.r) this.f286a.get()).g();
            }
        }

        /* loaded from: classes4.dex */
        static final class c extends AbstractC3256z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ L5.a f287a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(L5.a aVar) {
                super(0);
                this.f287a = aVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return ((m2.r) this.f287a.get()).h();
            }
        }

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String c(L5.a paymentConfiguration) {
            AbstractC3255y.i(paymentConfiguration, "$paymentConfiguration");
            return ((m2.r) paymentConfiguration.get()).g();
        }

        public final C0947e b(Context context, final L5.a paymentConfiguration) {
            AbstractC3255y.i(context, "context");
            AbstractC3255y.i(paymentConfiguration, "paymentConfiguration");
            PackageManager packageManager = context.getPackageManager();
            String packageName = context.getPackageName();
            if (packageName == null) {
                packageName = "";
            }
            return new C0947e(packageManager, D2.a.f1776a.a(context), packageName, new L5.a() { // from class: A3.L
                @Override // L5.a
                public final Object get() {
                    String c8;
                    c8 = M.a.c(L5.a.this);
                    return c8;
                }
            }, new G2.c(new A2.u(context)), null, 32, null);
        }

        public final com.stripe.android.paymentsheet.paymentdatacollection.bacs.b d() {
            return com.stripe.android.paymentsheet.paymentdatacollection.bacs.g.f27240a;
        }

        public final InterfaceC4187a e() {
            return new C4188b();
        }

        public final D2.d f() {
            return D2.c.f1777b.a();
        }

        public final boolean g() {
            return false;
        }

        public final m2.r h(Context appContext) {
            AbstractC3255y.i(appContext, "appContext");
            return m2.r.f35037c.a(appContext);
        }

        public final Function1 i(Context appContext, S5.g workContext) {
            AbstractC3255y.i(appContext, "appContext");
            AbstractC3255y.i(workContext, "workContext");
            return new C0001a(appContext, workContext);
        }

        public final Function0 j(L5.a paymentConfiguration) {
            AbstractC3255y.i(paymentConfiguration, "paymentConfiguration");
            return new b(paymentConfiguration);
        }

        public final Function0 k(L5.a paymentConfiguration) {
            AbstractC3255y.i(paymentConfiguration, "paymentConfiguration");
            return new c(paymentConfiguration);
        }

        public final InterfaceC1324t.a l() {
            return C1315j.a.f6940a;
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }
}
