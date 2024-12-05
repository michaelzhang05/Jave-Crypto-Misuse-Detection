package x3;

import J3.C1202j;
import J3.InterfaceC1211t;
import android.content.Context;
import android.content.pm.PackageManager;
import com.stripe.android.paymentsheet.u;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import q3.C3652e;
import u3.C3803b;
import u3.InterfaceC3802a;
import x2.C3875e;
import x3.AbstractC3891M;

/* renamed from: x3.M, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3891M {

    /* renamed from: a, reason: collision with root package name */
    public static final a f39288a = new a(null);

    /* renamed from: x3.M$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: x3.M$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        static final class C0909a extends AbstractC3160z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Context f39289a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ P5.g f39290b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0909a(Context context, P5.g gVar) {
                super(1);
                this.f39289a = context;
                this.f39290b = gVar;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C3652e invoke(u.i iVar) {
                String str;
                Context context = this.f39289a;
                if (iVar != null) {
                    str = iVar.getId();
                } else {
                    str = null;
                }
                return new C3652e(context, str, this.f39290b);
            }
        }

        /* renamed from: x3.M$a$b */
        /* loaded from: classes4.dex */
        static final class b extends AbstractC3160z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ I5.a f39291a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(I5.a aVar) {
                super(0);
                this.f39291a = aVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return ((j2.r) this.f39291a.get()).e();
            }
        }

        /* renamed from: x3.M$a$c */
        /* loaded from: classes4.dex */
        static final class c extends AbstractC3160z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ I5.a f39292a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(I5.a aVar) {
                super(0);
                this.f39292a = aVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return ((j2.r) this.f39292a.get()).f();
            }
        }

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String c(I5.a paymentConfiguration) {
            AbstractC3159y.i(paymentConfiguration, "$paymentConfiguration");
            return ((j2.r) paymentConfiguration.get()).e();
        }

        public final C3875e b(Context context, final I5.a paymentConfiguration) {
            AbstractC3159y.i(context, "context");
            AbstractC3159y.i(paymentConfiguration, "paymentConfiguration");
            PackageManager packageManager = context.getPackageManager();
            String packageName = context.getPackageName();
            if (packageName == null) {
                packageName = "";
            }
            return new C3875e(packageManager, A2.a.f74a.a(context), packageName, new I5.a() { // from class: x3.L
                @Override // I5.a
                public final Object get() {
                    String c8;
                    c8 = AbstractC3891M.a.c(I5.a.this);
                    return c8;
                }
            }, new D2.c(new x2.u(context)), null, 32, null);
        }

        public final com.stripe.android.paymentsheet.paymentdatacollection.bacs.b d() {
            return com.stripe.android.paymentsheet.paymentdatacollection.bacs.g.f26185a;
        }

        public final InterfaceC3802a e() {
            return new C3803b();
        }

        public final A2.d f() {
            return A2.c.f75b.a();
        }

        public final boolean g() {
            return false;
        }

        public final j2.r h(Context appContext) {
            AbstractC3159y.i(appContext, "appContext");
            return j2.r.f33061c.a(appContext);
        }

        public final Function1 i(Context appContext, P5.g workContext) {
            AbstractC3159y.i(appContext, "appContext");
            AbstractC3159y.i(workContext, "workContext");
            return new C0909a(appContext, workContext);
        }

        public final Function0 j(I5.a paymentConfiguration) {
            AbstractC3159y.i(paymentConfiguration, "paymentConfiguration");
            return new b(paymentConfiguration);
        }

        public final Function0 k(I5.a paymentConfiguration) {
            AbstractC3159y.i(paymentConfiguration, "paymentConfiguration");
            return new c(paymentConfiguration);
        }

        public final InterfaceC1211t.a l() {
            return C1202j.a.f5234a;
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }
}
