package E3;

import E3.f;
import O5.I;
import android.content.Context;
import com.stripe.android.paymentsheet.ui.PrimaryButton;
import j6.n;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import t3.w;

/* loaded from: classes4.dex */
public abstract class j {

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1 f2567a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ f f2568b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Function1 function1, f fVar) {
            super(0);
            this.f2567a = function1;
            this.f2568b = fVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m8invoke();
            return I.f8278a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m8invoke() {
            this.f2567a.invoke(this.f2568b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3256z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ B2.b f2569a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f2570b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ d f2571c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f2572d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function0 f2573e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3256z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ boolean f2574a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ d f2575b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Function0 f2576c;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: E3.j$b$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0040a extends AbstractC3256z implements Function1 {

                /* renamed from: a, reason: collision with root package name */
                public static final C0040a f2577a = new C0040a();

                C0040a() {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final PrimaryButton.b invoke(PrimaryButton.b bVar) {
                    if (bVar != null) {
                        return PrimaryButton.b.b(bVar, null, null, false, false, 11, null);
                    }
                    return null;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(boolean z8, d dVar, Function0 function0) {
                super(0);
                this.f2574a = z8;
                this.f2575b = dVar;
                this.f2576c = function0;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m9invoke();
                return I.f8278a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m9invoke() {
                if (this.f2574a) {
                    this.f2575b.j().invoke(PrimaryButton.a.c.f27593b);
                }
                this.f2576c.invoke();
                this.f2575b.k().invoke(C0040a.f2577a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(B2.b bVar, boolean z8, d dVar, boolean z9, Function0 function0) {
            super(1);
            this.f2569a = bVar;
            this.f2570b = z8;
            this.f2571c = dVar;
            this.f2572d = z9;
            this.f2573e = function0;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PrimaryButton.b invoke(PrimaryButton.b bVar) {
            return new PrimaryButton.b(this.f2569a, new a(this.f2572d, this.f2571c, this.f2573e), this.f2570b, this.f2571c.o());
        }
    }

    public static final void a(d dVar, Context context, f screenState, boolean z8, String merchantName, Function1 onPrimaryButtonClick) {
        boolean z9;
        AbstractC3255y.i(dVar, "<this>");
        AbstractC3255y.i(context, "context");
        AbstractC3255y.i(screenState, "screenState");
        AbstractC3255y.i(merchantName, "merchantName");
        AbstractC3255y.i(onPrimaryButtonClick, "onPrimaryButtonClick");
        B2.b a8 = screenState.a();
        if (a8 != null) {
            dVar.h().invoke(a8);
        }
        if (!(screenState instanceof f.a) && !dVar.o()) {
            z9 = false;
        } else {
            z9 = true;
        }
        c(dVar, screenState.g(), new a(onPrimaryButtonClick, screenState), z9, z8);
        b(dVar, context, screenState, screenState.b(), merchantName);
    }

    public static final void b(d dVar, Context context, f screenState, B2.b bVar, String merchantName) {
        String str;
        B2.b bVar2;
        AbstractC3255y.i(dVar, "<this>");
        AbstractC3255y.i(context, "context");
        AbstractC3255y.i(screenState, "screenState");
        AbstractC3255y.i(merchantName, "merchantName");
        if (screenState instanceof f.e) {
            str = context.getString(w.f39757K, merchantName);
        } else {
            str = "";
        }
        AbstractC3255y.f(str);
        if (bVar != null) {
            String e8 = n.e("\n            " + str + "\n                \n            " + bVar.R(context) + "\n        ");
            if (e8 != null) {
                bVar2 = B2.c.b(e8);
                dVar.i().invoke(bVar2, Boolean.FALSE);
            }
        }
        bVar2 = null;
        dVar.i().invoke(bVar2, Boolean.FALSE);
    }

    private static final void c(d dVar, B2.b bVar, Function0 function0, boolean z8, boolean z9) {
        dVar.k().invoke(new b(bVar, z9, dVar, z8, function0));
    }
}
