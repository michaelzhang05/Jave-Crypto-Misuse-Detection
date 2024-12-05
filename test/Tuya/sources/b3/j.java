package B3;

import B3.f;
import L5.I;
import android.content.Context;
import com.stripe.android.paymentsheet.ui.PrimaryButton;
import g6.n;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import q3.w;
import y2.AbstractC3984c;
import y2.InterfaceC3983b;

/* loaded from: classes4.dex */
public abstract class j {

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1 f972a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ f f973b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Function1 function1, f fVar) {
            super(0);
            this.f972a = function1;
            this.f973b = fVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m3invoke();
            return I.f6487a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m3invoke() {
            this.f972a.invoke(this.f973b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3983b f974a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f975b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ d f976c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f977d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function0 f978e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3160z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ boolean f979a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ d f980b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Function0 f981c;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: B3.j$b$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0015a extends AbstractC3160z implements Function1 {

                /* renamed from: a, reason: collision with root package name */
                public static final C0015a f982a = new C0015a();

                C0015a() {
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
                this.f979a = z8;
                this.f980b = dVar;
                this.f981c = function0;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m4invoke();
                return I.f6487a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m4invoke() {
                if (this.f979a) {
                    this.f980b.j().invoke(PrimaryButton.a.c.f26538b);
                }
                this.f981c.invoke();
                this.f980b.k().invoke(C0015a.f982a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC3983b interfaceC3983b, boolean z8, d dVar, boolean z9, Function0 function0) {
            super(1);
            this.f974a = interfaceC3983b;
            this.f975b = z8;
            this.f976c = dVar;
            this.f977d = z9;
            this.f978e = function0;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PrimaryButton.b invoke(PrimaryButton.b bVar) {
            return new PrimaryButton.b(this.f974a, new a(this.f977d, this.f976c, this.f978e), this.f975b, this.f976c.o());
        }
    }

    public static final void a(d dVar, Context context, f screenState, boolean z8, String merchantName, Function1 onPrimaryButtonClick) {
        boolean z9;
        AbstractC3159y.i(dVar, "<this>");
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(screenState, "screenState");
        AbstractC3159y.i(merchantName, "merchantName");
        AbstractC3159y.i(onPrimaryButtonClick, "onPrimaryButtonClick");
        InterfaceC3983b b8 = screenState.b();
        if (b8 != null) {
            dVar.h().invoke(b8);
        }
        if (!(screenState instanceof f.a) && !dVar.o()) {
            z9 = false;
        } else {
            z9 = true;
        }
        c(dVar, screenState.e(), new a(onPrimaryButtonClick, screenState), z9, z8);
        b(dVar, context, screenState, screenState.c(), merchantName);
    }

    public static final void b(d dVar, Context context, f screenState, InterfaceC3983b interfaceC3983b, String merchantName) {
        String str;
        InterfaceC3983b interfaceC3983b2;
        AbstractC3159y.i(dVar, "<this>");
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(screenState, "screenState");
        AbstractC3159y.i(merchantName, "merchantName");
        if (screenState instanceof f.e) {
            str = context.getString(w.f37435K, merchantName);
        } else {
            str = "";
        }
        AbstractC3159y.f(str);
        if (interfaceC3983b != null) {
            String e8 = n.e("\n            " + str + "\n                \n            " + interfaceC3983b.R(context) + "\n        ");
            if (e8 != null) {
                interfaceC3983b2 = AbstractC3984c.b(e8);
                dVar.i().invoke(interfaceC3983b2, Boolean.FALSE);
            }
        }
        interfaceC3983b2 = null;
        dVar.i().invoke(interfaceC3983b2, Boolean.FALSE);
    }

    private static final void c(d dVar, InterfaceC3983b interfaceC3983b, Function0 function0, boolean z8, boolean z9) {
        dVar.k().invoke(new b(interfaceC3983b, z9, dVar, z8, function0));
    }
}
