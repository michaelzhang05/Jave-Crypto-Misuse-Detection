package z3;

import E3.c;
import J3.AbstractC1195c;
import J3.AbstractC1204l;
import J3.G;
import J3.H;
import J3.InterfaceC1194b;
import J3.InterfaceC1211t;
import J3.T;
import J3.U;
import J3.V;
import L3.i;
import L3.s;
import L3.t;
import L5.I;
import M5.AbstractC1246t;
import X5.n;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import com.stripe.android.model.o;
import j2.AbstractC3053E;
import java.io.Closeable;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import l6.InterfaceC3349K;
import q3.w;
import y2.AbstractC3984c;
import y2.InterfaceC3983b;
import z3.C4019a;

/* renamed from: z3.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC4021c {

    /* renamed from: z3.c$a */
    /* loaded from: classes4.dex */
    public static final class a implements InterfaceC4021c, Closeable {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC1194b f40082a;

        /* renamed from: b, reason: collision with root package name */
        private final InterfaceC3349K f40083b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f40084c;

        /* renamed from: d, reason: collision with root package name */
        private final float f40085d;

        /* renamed from: e, reason: collision with root package name */
        private final float f40086e;

        /* renamed from: f, reason: collision with root package name */
        private final float f40087f;

        /* renamed from: g, reason: collision with root package name */
        private final EnumC0926c f40088g;

        /* renamed from: h, reason: collision with root package name */
        private final boolean f40089h;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: z3.c$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0924a extends AbstractC3160z implements n {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Modifier f40091b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f40092c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0924a(Modifier modifier, int i8) {
                super(2);
                this.f40091b = modifier;
                this.f40092c = i8;
            }

            @Override // X5.n
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return I.f6487a;
            }

            public final void invoke(Composer composer, int i8) {
                a.this.f(this.f40091b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f40092c | 1));
            }
        }

        /* renamed from: z3.c$a$b */
        /* loaded from: classes4.dex */
        static final class b extends AbstractC3160z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ boolean f40093a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ boolean f40094b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(boolean z8, boolean z9) {
                super(1);
                this.f40093a = z8;
                this.f40094b = z9;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final InterfaceC3983b invoke(InterfaceC1194b.a state) {
                AbstractC3159y.i(state, "state");
                String str = null;
                if (this.f40093a || this.f40094b) {
                    return null;
                }
                X2.g gVar = (X2.g) AbstractC1246t.M0(state.g());
                if (gVar != null) {
                    str = gVar.d();
                }
                if (AbstractC3159y.d(str, o.p.f24532i.f24550a)) {
                    return AbstractC3984c.a(AbstractC3053E.f32843H0);
                }
                return AbstractC3984c.a(w.f37428D);
            }
        }

        public a(InterfaceC1194b interactor) {
            AbstractC3159y.i(interactor, "interactor");
            this.f40082a = interactor;
            this.f40083b = v4.g.n(new C4019a(true, null, 2, null));
            this.f40084c = true;
            this.f40085d = Dp.m5178constructorimpl(0);
            this.f40086e = AbstractC4022d.a();
            this.f40087f = AbstractC4022d.b();
            this.f40088g = EnumC0926c.f40107a;
            this.f40089h = true;
        }

        @Override // z3.InterfaceC4021c
        public InterfaceC3349K a() {
            return this.f40083b;
        }

        @Override // z3.InterfaceC4021c
        public EnumC0926c b() {
            return this.f40088g;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f40082a.close();
        }

        @Override // z3.InterfaceC4021c
        public boolean e() {
            return this.f40084c;
        }

        @Override // z3.InterfaceC4021c
        public void f(Modifier modifier, Composer composer, int i8) {
            AbstractC3159y.i(modifier, "modifier");
            Composer startRestartGroup = composer.startRestartGroup(-992403751);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-992403751, i8, -1, "com.stripe.android.paymentsheet.navigation.PaymentSheetScreen.AddAnotherPaymentMethod.Content (PaymentSheetScreen.kt:224)");
            }
            AbstractC1195c.a(this.f40082a, modifier, startRestartGroup, (i8 << 3) & 112, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
                endRestartGroup.updateScope(new C0924a(modifier, i8));
            }
        }

        @Override // z3.InterfaceC4021c
        public boolean g() {
            return this.f40089h;
        }

        @Override // z3.InterfaceC4021c
        public InterfaceC3349K h(boolean z8, boolean z9) {
            return v4.g.m(this.f40082a.getState(), new b(z9, z8));
        }

        @Override // z3.InterfaceC4021c
        public float l() {
            return this.f40086e;
        }

        @Override // z3.InterfaceC4021c
        public InterfaceC3349K m() {
            return v4.g.n(H.f4833a.a(true, this.f40082a.a(), G.a.b.f4832a));
        }

        @Override // z3.InterfaceC4021c
        public float o() {
            return this.f40085d;
        }

        @Override // z3.InterfaceC4021c
        public float r() {
            return this.f40087f;
        }

        @Override // z3.InterfaceC4021c
        public InterfaceC3349K t(boolean z8) {
            return v4.g.n(Boolean.valueOf(z8));
        }
    }

    /* renamed from: z3.c$b */
    /* loaded from: classes4.dex */
    public static final class b implements InterfaceC4021c, Closeable {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC1194b f40095a;

        /* renamed from: b, reason: collision with root package name */
        private final InterfaceC3349K f40096b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f40097c;

        /* renamed from: d, reason: collision with root package name */
        private final float f40098d;

        /* renamed from: e, reason: collision with root package name */
        private final float f40099e;

        /* renamed from: f, reason: collision with root package name */
        private final float f40100f;

        /* renamed from: g, reason: collision with root package name */
        private final boolean f40101g;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: z3.c$b$a */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3160z implements n {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Modifier f40103b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f40104c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Modifier modifier, int i8) {
                super(2);
                this.f40103b = modifier;
                this.f40104c = i8;
            }

            @Override // X5.n
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return I.f6487a;
            }

            public final void invoke(Composer composer, int i8) {
                b.this.f(this.f40103b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f40104c | 1));
            }
        }

        /* renamed from: z3.c$b$b, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        static final class C0925b extends AbstractC3160z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ boolean f40105a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ boolean f40106b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0925b(boolean z8, boolean z9) {
                super(1);
                this.f40105a = z8;
                this.f40106b = z9;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final InterfaceC3983b invoke(InterfaceC1194b.a state) {
                AbstractC3159y.i(state, "state");
                String str = null;
                if (this.f40105a) {
                    return null;
                }
                if (this.f40106b) {
                    return AbstractC3984c.a(w.f37475m);
                }
                X2.g gVar = (X2.g) AbstractC1246t.M0(state.g());
                if (gVar != null) {
                    str = gVar.d();
                }
                if (AbstractC3159y.d(str, o.p.f24532i.f24550a)) {
                    return AbstractC3984c.a(AbstractC3053E.f32843H0);
                }
                return AbstractC3984c.a(w.f37428D);
            }
        }

        public b(InterfaceC1194b interactor) {
            AbstractC3159y.i(interactor, "interactor");
            this.f40095a = interactor;
            this.f40096b = v4.g.n(new C4019a(true, null, 2, null));
            this.f40097c = true;
            this.f40098d = Dp.m5178constructorimpl(0);
            this.f40099e = AbstractC4022d.a();
            this.f40100f = AbstractC4022d.b();
            this.f40101g = true;
        }

        @Override // z3.InterfaceC4021c
        public InterfaceC3349K a() {
            return this.f40096b;
        }

        @Override // z3.InterfaceC4021c
        public EnumC0926c b() {
            return e.a(this);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f40095a.close();
        }

        @Override // z3.InterfaceC4021c
        public boolean e() {
            return this.f40097c;
        }

        @Override // z3.InterfaceC4021c
        public void f(Modifier modifier, Composer composer, int i8) {
            AbstractC3159y.i(modifier, "modifier");
            Composer startRestartGroup = composer.startRestartGroup(1504163590);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1504163590, i8, -1, "com.stripe.android.paymentsheet.navigation.PaymentSheetScreen.AddFirstPaymentMethod.Content (PaymentSheetScreen.kt:277)");
            }
            AbstractC1195c.a(this.f40095a, modifier, startRestartGroup, (i8 << 3) & 112, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
                endRestartGroup.updateScope(new a(modifier, i8));
            }
        }

        @Override // z3.InterfaceC4021c
        public boolean g() {
            return this.f40101g;
        }

        @Override // z3.InterfaceC4021c
        public InterfaceC3349K h(boolean z8, boolean z9) {
            return v4.g.m(this.f40095a.getState(), new C0925b(z9, z8));
        }

        @Override // z3.InterfaceC4021c
        public float l() {
            return this.f40099e;
        }

        @Override // z3.InterfaceC4021c
        public InterfaceC3349K m() {
            return v4.g.n(H.f4833a.a(false, this.f40095a.a(), G.a.b.f4832a));
        }

        @Override // z3.InterfaceC4021c
        public float o() {
            return this.f40098d;
        }

        @Override // z3.InterfaceC4021c
        public float r() {
            return this.f40100f;
        }

        @Override // z3.InterfaceC4021c
        public InterfaceC3349K t(boolean z8) {
            return v4.g.n(Boolean.TRUE);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: z3.c$c, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class EnumC0926c {

        /* renamed from: a, reason: collision with root package name */
        public static final EnumC0926c f40107a = new EnumC0926c("PrimaryButtonAnchored", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final EnumC0926c f40108b = new EnumC0926c("FullPage", 1);

        /* renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ EnumC0926c[] f40109c;

        /* renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ R5.a f40110d;

        static {
            EnumC0926c[] a8 = a();
            f40109c = a8;
            f40110d = R5.b.a(a8);
        }

        private EnumC0926c(String str, int i8) {
        }

        private static final /* synthetic */ EnumC0926c[] a() {
            return new EnumC0926c[]{f40107a, f40108b};
        }

        public static EnumC0926c valueOf(String str) {
            return (EnumC0926c) Enum.valueOf(EnumC0926c.class, str);
        }

        public static EnumC0926c[] values() {
            return (EnumC0926c[]) f40109c.clone();
        }
    }

    /* renamed from: z3.c$d */
    /* loaded from: classes4.dex */
    public static final class d implements InterfaceC4021c {

        /* renamed from: a, reason: collision with root package name */
        private final E3.e f40111a;

        /* renamed from: b, reason: collision with root package name */
        private final InterfaceC3349K f40112b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f40113c;

        /* renamed from: d, reason: collision with root package name */
        private final float f40114d;

        /* renamed from: e, reason: collision with root package name */
        private final float f40115e;

        /* renamed from: f, reason: collision with root package name */
        private final float f40116f;

        /* renamed from: g, reason: collision with root package name */
        private final boolean f40117g;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: z3.c$d$a */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3160z implements n {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Modifier f40119b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f40120c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Modifier modifier, int i8) {
                super(2);
                this.f40119b = modifier;
                this.f40120c = i8;
            }

            @Override // X5.n
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return I.f6487a;
            }

            public final void invoke(Composer composer, int i8) {
                d.this.f(this.f40119b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f40120c | 1));
            }
        }

        /* renamed from: z3.c$d$b */
        /* loaded from: classes4.dex */
        static final class b extends AbstractC3160z implements Function1 {

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: z3.c$d$b$a */
            /* loaded from: classes4.dex */
            public static final class a extends AbstractC3160z implements Function0 {

                /* renamed from: a, reason: collision with root package name */
                public static final a f40122a = new a();

                a() {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Object invoke() {
                    m5629invoke();
                    return I.f6487a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m5629invoke() {
                }
            }

            b() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final G invoke(E3.c complete) {
                AbstractC3159y.i(complete, "complete");
                return H.f4833a.a(false, !((E3.f) d.this.f40111a.b().getValue()).e(), new G.a.C0093a(complete instanceof c.b, false, a.f40122a));
            }
        }

        public d(E3.e interactor) {
            AbstractC3159y.i(interactor, "interactor");
            this.f40111a = interactor;
            this.f40112b = v4.g.n(new C4019a(true, new C4019a.C0922a(AbstractC3984c.f(w.f37430F, new Object[0], null, 4, null), false)));
            this.f40114d = Dp.m5178constructorimpl(0);
            this.f40115e = AbstractC4022d.c();
            this.f40116f = AbstractC4022d.d();
        }

        @Override // z3.InterfaceC4021c
        public InterfaceC3349K a() {
            return this.f40112b;
        }

        @Override // z3.InterfaceC4021c
        public EnumC0926c b() {
            return e.a(this);
        }

        @Override // z3.InterfaceC4021c
        public boolean e() {
            return this.f40113c;
        }

        @Override // z3.InterfaceC4021c
        public void f(Modifier modifier, Composer composer, int i8) {
            AbstractC3159y.i(modifier, "modifier");
            Composer startRestartGroup = composer.startRestartGroup(-521548963);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-521548963, i8, -1, "com.stripe.android.paymentsheet.navigation.PaymentSheetScreen.CvcRecollection.Content (PaymentSheetScreen.kt:532)");
            }
            com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.b.c(this.f40111a, startRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
                endRestartGroup.updateScope(new a(modifier, i8));
            }
        }

        @Override // z3.InterfaceC4021c
        public boolean g() {
            return this.f40117g;
        }

        @Override // z3.InterfaceC4021c
        public InterfaceC3349K h(boolean z8, boolean z9) {
            return v4.g.n(null);
        }

        @Override // z3.InterfaceC4021c
        public float l() {
            return this.f40115e;
        }

        @Override // z3.InterfaceC4021c
        public InterfaceC3349K m() {
            return v4.g.m(this.f40111a.d(), new b());
        }

        @Override // z3.InterfaceC4021c
        public float o() {
            return this.f40114d;
        }

        @Override // z3.InterfaceC4021c
        public float r() {
            return this.f40116f;
        }

        @Override // z3.InterfaceC4021c
        public InterfaceC3349K t(boolean z8) {
            return v4.g.n(Boolean.FALSE);
        }
    }

    /* renamed from: z3.c$e */
    /* loaded from: classes4.dex */
    public static final class e {
        public static EnumC0926c a(InterfaceC4021c interfaceC4021c) {
            return EnumC0926c.f40108b;
        }
    }

    /* renamed from: z3.c$f */
    /* loaded from: classes4.dex */
    public static final class f implements InterfaceC4021c, Closeable {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC1211t f40123a;

        /* renamed from: b, reason: collision with root package name */
        private final InterfaceC3349K f40124b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f40125c;

        /* renamed from: d, reason: collision with root package name */
        private final float f40126d;

        /* renamed from: e, reason: collision with root package name */
        private final float f40127e;

        /* renamed from: f, reason: collision with root package name */
        private final float f40128f;

        /* renamed from: g, reason: collision with root package name */
        private final boolean f40129g;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: z3.c$f$a */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3160z implements n {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Modifier f40131b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f40132c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Modifier modifier, int i8) {
                super(2);
                this.f40131b = modifier;
                this.f40132c = i8;
            }

            @Override // X5.n
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return I.f6487a;
            }

            public final void invoke(Composer composer, int i8) {
                f.this.f(this.f40131b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f40132c | 1));
            }
        }

        public f(InterfaceC1211t interactor) {
            AbstractC3159y.i(interactor, "interactor");
            this.f40123a = interactor;
            this.f40124b = v4.g.n(new C4019a(false, null, 2, null));
            float f8 = 0;
            this.f40126d = Dp.m5178constructorimpl(f8);
            this.f40127e = Dp.m5178constructorimpl(f8);
            this.f40128f = AbstractC4022d.b();
        }

        @Override // z3.InterfaceC4021c
        public InterfaceC3349K a() {
            return this.f40124b;
        }

        @Override // z3.InterfaceC4021c
        public EnumC0926c b() {
            return e.a(this);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f40123a.close();
        }

        @Override // z3.InterfaceC4021c
        public boolean e() {
            return this.f40125c;
        }

        @Override // z3.InterfaceC4021c
        public void f(Modifier modifier, Composer composer, int i8) {
            AbstractC3159y.i(modifier, "modifier");
            Composer startRestartGroup = composer.startRestartGroup(-1252883967);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1252883967, i8, -1, "com.stripe.android.paymentsheet.navigation.PaymentSheetScreen.EditPaymentMethod.Content (PaymentSheetScreen.kt:318)");
            }
            AbstractC1204l.d(this.f40123a, modifier, startRestartGroup, (i8 << 3) & 112, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
                endRestartGroup.updateScope(new a(modifier, i8));
            }
        }

        @Override // z3.InterfaceC4021c
        public boolean g() {
            return this.f40129g;
        }

        @Override // z3.InterfaceC4021c
        public InterfaceC3349K h(boolean z8, boolean z9) {
            return v4.g.n(AbstractC3984c.a(AbstractC3053E.f32851L0));
        }

        @Override // z3.InterfaceC4021c
        public float l() {
            return this.f40127e;
        }

        @Override // z3.InterfaceC4021c
        public InterfaceC3349K m() {
            return v4.g.n(H.f4833a.a(true, this.f40123a.a(), G.a.b.f4832a));
        }

        @Override // z3.InterfaceC4021c
        public float o() {
            return this.f40126d;
        }

        @Override // z3.InterfaceC4021c
        public float r() {
            return this.f40128f;
        }

        @Override // z3.InterfaceC4021c
        public InterfaceC3349K t(boolean z8) {
            return v4.g.n(Boolean.FALSE);
        }
    }

    /* renamed from: z3.c$g */
    /* loaded from: classes4.dex */
    public static final class g implements InterfaceC4021c {

        /* renamed from: c, reason: collision with root package name */
        private static final boolean f40135c = false;

        /* renamed from: d, reason: collision with root package name */
        private static final float f40136d;

        /* renamed from: e, reason: collision with root package name */
        private static final float f40137e;

        /* renamed from: g, reason: collision with root package name */
        private static final boolean f40139g = false;

        /* renamed from: a, reason: collision with root package name */
        public static final g f40133a = new g();

        /* renamed from: b, reason: collision with root package name */
        private static final InterfaceC3349K f40134b = v4.g.n(new C4019a(false, null, 2, null));

        /* renamed from: f, reason: collision with root package name */
        private static final float f40138f = AbstractC4022d.b();

        /* renamed from: h, reason: collision with root package name */
        public static final int f40140h = 8;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: z3.c$g$a */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3160z implements n {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Modifier f40142b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f40143c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Modifier modifier, int i8) {
                super(2);
                this.f40142b = modifier;
                this.f40143c = i8;
            }

            @Override // X5.n
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return I.f6487a;
            }

            public final void invoke(Composer composer, int i8) {
                g.this.f(this.f40142b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f40143c | 1));
            }
        }

        static {
            float f8 = 0;
            f40136d = Dp.m5178constructorimpl(f8);
            f40137e = Dp.m5178constructorimpl(f8);
        }

        private g() {
        }

        @Override // z3.InterfaceC4021c
        public InterfaceC3349K a() {
            return f40134b;
        }

        @Override // z3.InterfaceC4021c
        public EnumC0926c b() {
            return e.a(this);
        }

        @Override // z3.InterfaceC4021c
        public boolean e() {
            return f40135c;
        }

        @Override // z3.InterfaceC4021c
        public void f(Modifier modifier, Composer composer, int i8) {
            int i9;
            int i10;
            AbstractC3159y.i(modifier, "modifier");
            Composer startRestartGroup = composer.startRestartGroup(1798980290);
            if ((i8 & 14) == 0) {
                if (startRestartGroup.changed(modifier)) {
                    i10 = 4;
                } else {
                    i10 = 2;
                }
                i9 = i10 | i8;
            } else {
                i9 = i8;
            }
            if ((i9 & 11) == 2 && startRestartGroup.getSkipping()) {
                startRestartGroup.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1798980290, i9, -1, "com.stripe.android.paymentsheet.navigation.PaymentSheetScreen.Loading.Content (PaymentSheetScreen.kt:112)");
                }
                q2.b.a(modifier, startRestartGroup, i9 & 14, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
                endRestartGroup.updateScope(new a(modifier, i8));
            }
        }

        @Override // z3.InterfaceC4021c
        public boolean g() {
            return f40139g;
        }

        @Override // z3.InterfaceC4021c
        public InterfaceC3349K h(boolean z8, boolean z9) {
            return v4.g.n(null);
        }

        @Override // z3.InterfaceC4021c
        public float l() {
            return f40137e;
        }

        @Override // z3.InterfaceC4021c
        public InterfaceC3349K m() {
            return v4.g.n(null);
        }

        @Override // z3.InterfaceC4021c
        public float o() {
            return f40136d;
        }

        @Override // z3.InterfaceC4021c
        public float r() {
            return f40138f;
        }

        @Override // z3.InterfaceC4021c
        public InterfaceC3349K t(boolean z8) {
            return v4.g.n(Boolean.FALSE);
        }
    }

    /* renamed from: z3.c$h */
    /* loaded from: classes4.dex */
    public static final class h implements InterfaceC4021c {

        /* renamed from: a, reason: collision with root package name */
        private final L3.f f40144a;

        /* renamed from: b, reason: collision with root package name */
        private final InterfaceC3349K f40145b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f40146c;

        /* renamed from: d, reason: collision with root package name */
        private final float f40147d;

        /* renamed from: e, reason: collision with root package name */
        private final float f40148e;

        /* renamed from: f, reason: collision with root package name */
        private final float f40149f;

        /* renamed from: g, reason: collision with root package name */
        private final boolean f40150g;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: z3.c$h$a */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3160z implements n {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Modifier f40152b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f40153c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Modifier modifier, int i8) {
                super(2);
                this.f40152b = modifier;
                this.f40153c = i8;
            }

            @Override // X5.n
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return I.f6487a;
            }

            public final void invoke(Composer composer, int i8) {
                h.this.f(this.f40152b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f40153c | 1));
            }
        }

        public h(L3.f interactor) {
            AbstractC3159y.i(interactor, "interactor");
            this.f40144a = interactor;
            this.f40145b = v4.g.n(new C4019a(false, null, 2, null));
            float f8 = 0;
            this.f40147d = Dp.m5178constructorimpl(f8);
            this.f40148e = Dp.m5178constructorimpl(f8);
            this.f40149f = AbstractC4022d.d();
        }

        @Override // z3.InterfaceC4021c
        public InterfaceC3349K a() {
            return this.f40145b;
        }

        @Override // z3.InterfaceC4021c
        public EnumC0926c b() {
            return e.a(this);
        }

        @Override // z3.InterfaceC4021c
        public boolean e() {
            return this.f40146c;
        }

        @Override // z3.InterfaceC4021c
        public void f(Modifier modifier, Composer composer, int i8) {
            AbstractC3159y.i(modifier, "modifier");
            Composer startRestartGroup = composer.startRestartGroup(1539421821);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1539421821, i8, -1, "com.stripe.android.paymentsheet.navigation.PaymentSheetScreen.ManageOneSavedPaymentMethod.Content (PaymentSheetScreen.kt:492)");
            }
            L3.g.a(this.f40144a, startRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
                endRestartGroup.updateScope(new a(modifier, i8));
            }
        }

        @Override // z3.InterfaceC4021c
        public boolean g() {
            return this.f40150g;
        }

        @Override // z3.InterfaceC4021c
        public InterfaceC3349K h(boolean z8, boolean z9) {
            return v4.g.n(AbstractC3984c.a(w.f37450Z));
        }

        @Override // z3.InterfaceC4021c
        public float l() {
            return this.f40148e;
        }

        @Override // z3.InterfaceC4021c
        public InterfaceC3349K m() {
            return v4.g.n(H.f4833a.a(true, this.f40144a.getState().b(), G.a.b.f4832a));
        }

        @Override // z3.InterfaceC4021c
        public float o() {
            return this.f40147d;
        }

        @Override // z3.InterfaceC4021c
        public float r() {
            return this.f40149f;
        }

        @Override // z3.InterfaceC4021c
        public InterfaceC3349K t(boolean z8) {
            return v4.g.n(Boolean.FALSE);
        }
    }

    /* renamed from: z3.c$i */
    /* loaded from: classes4.dex */
    public static final class i implements InterfaceC4021c, Closeable {

        /* renamed from: a, reason: collision with root package name */
        private final L3.i f40154a;

        /* renamed from: b, reason: collision with root package name */
        private final InterfaceC3349K f40155b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f40156c;

        /* renamed from: d, reason: collision with root package name */
        private final float f40157d;

        /* renamed from: e, reason: collision with root package name */
        private final float f40158e;

        /* renamed from: f, reason: collision with root package name */
        private final float f40159f;

        /* renamed from: g, reason: collision with root package name */
        private final boolean f40160g;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: z3.c$i$a */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3160z implements n {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Modifier f40162b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f40163c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Modifier modifier, int i8) {
                super(2);
                this.f40162b = modifier;
                this.f40163c = i8;
            }

            @Override // X5.n
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return I.f6487a;
            }

            public final void invoke(Composer composer, int i8) {
                i.this.f(this.f40162b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f40163c | 1));
            }
        }

        /* renamed from: z3.c$i$b */
        /* loaded from: classes4.dex */
        static final class b extends AbstractC3160z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            public static final b f40164a = new b();

            b() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final InterfaceC3983b invoke(i.a state) {
                int i8;
                AbstractC3159y.i(state, "state");
                if (state.e()) {
                    i8 = w.f37433I;
                } else {
                    i8 = w.f37462f0;
                }
                return AbstractC3984c.a(i8);
            }
        }

        /* renamed from: z3.c$i$c, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        static final class C0927c extends AbstractC3160z implements Function1 {

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: z3.c$i$c$a */
            /* loaded from: classes4.dex */
            public static final class a extends AbstractC3160z implements Function0 {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ i f40166a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(i iVar) {
                    super(0);
                    this.f40166a = iVar;
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Object invoke() {
                    m5630invoke();
                    return I.f6487a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m5630invoke() {
                    this.f40166a.f40154a.b(i.b.d.f6265a);
                }
            }

            C0927c() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final G invoke(i.a state) {
                AbstractC3159y.i(state, "state");
                return H.f4833a.a(true, i.this.f40154a.a(), new G.a.C0093a(state.e(), state.a(), new a(i.this)));
            }
        }

        public i(L3.i interactor) {
            AbstractC3159y.i(interactor, "interactor");
            this.f40154a = interactor;
            this.f40155b = v4.g.n(new C4019a(false, null, 2, null));
            float f8 = 0;
            this.f40157d = Dp.m5178constructorimpl(f8);
            this.f40158e = Dp.m5178constructorimpl(f8);
            this.f40159f = AbstractC4022d.d();
        }

        @Override // z3.InterfaceC4021c
        public InterfaceC3349K a() {
            return this.f40155b;
        }

        @Override // z3.InterfaceC4021c
        public EnumC0926c b() {
            return e.a(this);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f40154a.close();
        }

        @Override // z3.InterfaceC4021c
        public boolean e() {
            return this.f40156c;
        }

        @Override // z3.InterfaceC4021c
        public void f(Modifier modifier, Composer composer, int i8) {
            AbstractC3159y.i(modifier, "modifier");
            Composer startRestartGroup = composer.startRestartGroup(-449464720);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-449464720, i8, -1, "com.stripe.android.paymentsheet.navigation.PaymentSheetScreen.ManageSavedPaymentMethods.Content (PaymentSheetScreen.kt:454)");
            }
            L3.j.a(this.f40154a, startRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
                endRestartGroup.updateScope(new a(modifier, i8));
            }
        }

        @Override // z3.InterfaceC4021c
        public boolean g() {
            return this.f40160g;
        }

        @Override // z3.InterfaceC4021c
        public InterfaceC3349K h(boolean z8, boolean z9) {
            return v4.g.m(this.f40154a.getState(), b.f40164a);
        }

        @Override // z3.InterfaceC4021c
        public float l() {
            return this.f40158e;
        }

        @Override // z3.InterfaceC4021c
        public InterfaceC3349K m() {
            return v4.g.m(this.f40154a.getState(), new C0927c());
        }

        @Override // z3.InterfaceC4021c
        public float o() {
            return this.f40157d;
        }

        @Override // z3.InterfaceC4021c
        public float r() {
            return this.f40159f;
        }

        @Override // z3.InterfaceC4021c
        public InterfaceC3349K t(boolean z8) {
            return v4.g.n(Boolean.FALSE);
        }
    }

    /* renamed from: z3.c$k */
    /* loaded from: classes4.dex */
    public static final class k implements InterfaceC4021c {

        /* renamed from: a, reason: collision with root package name */
        private final L3.n f40183a;

        /* renamed from: b, reason: collision with root package name */
        private final InterfaceC3349K f40184b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f40185c;

        /* renamed from: d, reason: collision with root package name */
        private final float f40186d;

        /* renamed from: e, reason: collision with root package name */
        private final float f40187e;

        /* renamed from: f, reason: collision with root package name */
        private final float f40188f;

        /* renamed from: g, reason: collision with root package name */
        private final boolean f40189g;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: z3.c$k$a */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3160z implements n {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Modifier f40191b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f40192c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Modifier modifier, int i8) {
                super(2);
                this.f40191b = modifier;
                this.f40192c = i8;
            }

            @Override // X5.n
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return I.f6487a;
            }

            public final void invoke(Composer composer, int i8) {
                k.this.f(this.f40191b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f40192c | 1));
            }
        }

        public k(L3.n interactor) {
            AbstractC3159y.i(interactor, "interactor");
            this.f40183a = interactor;
            this.f40184b = v4.g.n(new C4019a(true, null, 2, null));
            this.f40185c = true;
            this.f40186d = Dp.m5178constructorimpl(0);
            this.f40187e = AbstractC4022d.c();
            this.f40188f = AbstractC4022d.d();
            this.f40189g = true;
        }

        @Override // z3.InterfaceC4021c
        public InterfaceC3349K a() {
            return this.f40184b;
        }

        @Override // z3.InterfaceC4021c
        public EnumC0926c b() {
            return e.a(this);
        }

        @Override // z3.InterfaceC4021c
        public boolean e() {
            return this.f40185c;
        }

        @Override // z3.InterfaceC4021c
        public void f(Modifier modifier, Composer composer, int i8) {
            AbstractC3159y.i(modifier, "modifier");
            Composer startRestartGroup = composer.startRestartGroup(-1185148305);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1185148305, i8, -1, "com.stripe.android.paymentsheet.navigation.PaymentSheetScreen.VerticalMode.Content (PaymentSheetScreen.kt:365)");
            }
            L3.o.b(this.f40183a, modifier, startRestartGroup, (i8 << 3) & 112, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
                endRestartGroup.updateScope(new a(modifier, i8));
            }
        }

        @Override // z3.InterfaceC4021c
        public boolean g() {
            return this.f40189g;
        }

        @Override // z3.InterfaceC4021c
        public InterfaceC3349K h(boolean z8, boolean z9) {
            InterfaceC3983b a8;
            if (z9) {
                a8 = null;
            } else if (z8) {
                a8 = AbstractC3984c.a(w.f37460e0);
            } else {
                a8 = AbstractC3984c.a(w.f37428D);
            }
            return v4.g.n(a8);
        }

        @Override // z3.InterfaceC4021c
        public float l() {
            return this.f40187e;
        }

        @Override // z3.InterfaceC4021c
        public InterfaceC3349K m() {
            return v4.g.n(H.f4833a.a(false, this.f40183a.a(), G.a.b.f4832a));
        }

        @Override // z3.InterfaceC4021c
        public float o() {
            return this.f40186d;
        }

        @Override // z3.InterfaceC4021c
        public float r() {
            return this.f40188f;
        }

        @Override // z3.InterfaceC4021c
        public InterfaceC3349K t(boolean z8) {
            return this.f40183a.c();
        }
    }

    InterfaceC3349K a();

    EnumC0926c b();

    boolean e();

    void f(Modifier modifier, Composer composer, int i8);

    boolean g();

    InterfaceC3349K h(boolean z8, boolean z9);

    float l();

    InterfaceC3349K m();

    float o();

    float r();

    InterfaceC3349K t(boolean z8);

    /* renamed from: z3.c$j */
    /* loaded from: classes4.dex */
    public static final class j implements InterfaceC4021c, Closeable {

        /* renamed from: a, reason: collision with root package name */
        private final V f40167a;

        /* renamed from: b, reason: collision with root package name */
        private final b f40168b;

        /* renamed from: c, reason: collision with root package name */
        private final InterfaceC3349K f40169c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f40170d;

        /* renamed from: e, reason: collision with root package name */
        private final float f40171e;

        /* renamed from: f, reason: collision with root package name */
        private final float f40172f;

        /* renamed from: g, reason: collision with root package name */
        private final float f40173g;

        /* renamed from: h, reason: collision with root package name */
        private final EnumC0926c f40174h;

        /* renamed from: i, reason: collision with root package name */
        private final boolean f40175i;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: z3.c$j$a */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3160z implements n {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Modifier f40177b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f40178c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Modifier modifier, int i8) {
                super(2);
                this.f40177b = modifier;
                this.f40178c = i8;
            }

            @Override // X5.n
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return I.f6487a;
            }

            public final void invoke(Composer composer, int i8) {
                j.this.f(this.f40177b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f40178c | 1));
            }
        }

        /* renamed from: z3.c$j$b */
        /* loaded from: classes4.dex */
        public interface b {

            /* renamed from: z3.c$j$b$a */
            /* loaded from: classes4.dex */
            public static final class a implements b {

                /* renamed from: a, reason: collision with root package name */
                public static final a f40179a = new a();

                private a() {
                }

                public boolean equals(Object obj) {
                    if (this == obj || (obj instanceof a)) {
                        return true;
                    }
                    return false;
                }

                public int hashCode() {
                    return 689265788;
                }

                public String toString() {
                    return "NotRequired";
                }
            }

            /* renamed from: z3.c$j$b$b, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0928b implements b {

                /* renamed from: a, reason: collision with root package name */
                private final InterfaceC3349K f40180a;

                public C0928b(InterfaceC3349K cvcControllerFlow) {
                    AbstractC3159y.i(cvcControllerFlow, "cvcControllerFlow");
                    this.f40180a = cvcControllerFlow;
                }

                public final InterfaceC3349K a() {
                    return this.f40180a;
                }
            }
        }

        /* renamed from: z3.c$j$c, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        static final class C0929c extends AbstractC3160z implements Function1 {

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: z3.c$j$c$a */
            /* loaded from: classes4.dex */
            public static final class a extends AbstractC3160z implements Function0 {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ j f40182a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(j jVar) {
                    super(0);
                    this.f40182a = jVar;
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Object invoke() {
                    m5631invoke();
                    return I.f6487a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m5631invoke() {
                    this.f40182a.f40167a.b(V.b.e.f5132a);
                }
            }

            C0929c() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final G invoke(V.a state) {
                AbstractC3159y.i(state, "state");
                return H.f4833a.a(false, j.this.f40167a.a(), new G.a.C0093a(state.f(), state.c(), new a(j.this)));
            }
        }

        public j(V interactor, b cvcRecollectionState) {
            AbstractC3159y.i(interactor, "interactor");
            AbstractC3159y.i(cvcRecollectionState, "cvcRecollectionState");
            this.f40167a = interactor;
            this.f40168b = cvcRecollectionState;
            this.f40169c = v4.g.n(new C4019a(true, null, 2, null));
            this.f40171e = T.j();
            this.f40172f = Dp.m5178constructorimpl(0);
            this.f40173g = AbstractC4022d.b();
            this.f40174h = EnumC0926c.f40107a;
            this.f40175i = true;
        }

        @Override // z3.InterfaceC4021c
        public InterfaceC3349K a() {
            return this.f40169c;
        }

        @Override // z3.InterfaceC4021c
        public EnumC0926c b() {
            return this.f40174h;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f40167a.close();
        }

        @Override // z3.InterfaceC4021c
        public boolean e() {
            return this.f40170d;
        }

        @Override // z3.InterfaceC4021c
        public void f(Modifier modifier, Composer composer, int i8) {
            AbstractC3159y.i(modifier, "modifier");
            Composer startRestartGroup = composer.startRestartGroup(-289202489);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-289202489, i8, -1, "com.stripe.android.paymentsheet.navigation.PaymentSheetScreen.SelectSavedPaymentMethods.Content (PaymentSheetScreen.kt:168)");
            }
            U.j(this.f40167a, this.f40168b, modifier, startRestartGroup, (i8 << 6) & 896);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
                endRestartGroup.updateScope(new a(modifier, i8));
            }
        }

        @Override // z3.InterfaceC4021c
        public boolean g() {
            return this.f40175i;
        }

        @Override // z3.InterfaceC4021c
        public InterfaceC3349K h(boolean z8, boolean z9) {
            InterfaceC3983b a8;
            if (z8 && z9) {
                a8 = null;
            } else {
                a8 = AbstractC3984c.a(w.f37462f0);
            }
            return v4.g.n(a8);
        }

        @Override // z3.InterfaceC4021c
        public float l() {
            return this.f40172f;
        }

        @Override // z3.InterfaceC4021c
        public InterfaceC3349K m() {
            return v4.g.m(this.f40167a.getState(), new C0929c());
        }

        @Override // z3.InterfaceC4021c
        public float o() {
            return this.f40171e;
        }

        @Override // z3.InterfaceC4021c
        public float r() {
            return this.f40173g;
        }

        @Override // z3.InterfaceC4021c
        public InterfaceC3349K t(boolean z8) {
            return v4.g.n(Boolean.valueOf(z8));
        }

        public final b w() {
            return this.f40168b;
        }

        public /* synthetic */ j(V v8, b bVar, int i8, AbstractC3151p abstractC3151p) {
            this(v8, (i8 & 2) != 0 ? b.a.f40179a : bVar);
        }
    }

    /* renamed from: z3.c$l */
    /* loaded from: classes4.dex */
    public static final class l implements InterfaceC4021c, Closeable {

        /* renamed from: a, reason: collision with root package name */
        private final s f40193a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f40194b;

        /* renamed from: c, reason: collision with root package name */
        private final InterfaceC3349K f40195c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f40196d;

        /* renamed from: e, reason: collision with root package name */
        private final float f40197e;

        /* renamed from: f, reason: collision with root package name */
        private final float f40198f;

        /* renamed from: g, reason: collision with root package name */
        private final float f40199g;

        /* renamed from: h, reason: collision with root package name */
        private final boolean f40200h;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: z3.c$l$a */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3160z implements n {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Modifier f40202b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f40203c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Modifier modifier, int i8) {
                super(2);
                this.f40202b = modifier;
                this.f40203c = i8;
            }

            @Override // X5.n
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return I.f6487a;
            }

            public final void invoke(Composer composer, int i8) {
                l.this.f(this.f40202b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f40203c | 1));
            }
        }

        public l(s interactor, boolean z8) {
            AbstractC3159y.i(interactor, "interactor");
            this.f40193a = interactor;
            this.f40194b = z8;
            this.f40195c = v4.g.n(new C4019a(true, null, 2, null));
            this.f40196d = true;
            this.f40197e = Dp.m5178constructorimpl(0);
            this.f40198f = AbstractC4022d.c();
            this.f40199g = AbstractC4022d.d();
            this.f40200h = true;
        }

        @Override // z3.InterfaceC4021c
        public InterfaceC3349K a() {
            return this.f40195c;
        }

        @Override // z3.InterfaceC4021c
        public EnumC0926c b() {
            return e.a(this);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f40193a.close();
        }

        @Override // z3.InterfaceC4021c
        public boolean e() {
            return this.f40196d;
        }

        @Override // z3.InterfaceC4021c
        public void f(Modifier modifier, Composer composer, int i8) {
            AbstractC3159y.i(modifier, "modifier");
            Composer startRestartGroup = composer.startRestartGroup(1422248203);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1422248203, i8, -1, "com.stripe.android.paymentsheet.navigation.PaymentSheetScreen.VerticalModeForm.Content (PaymentSheetScreen.kt:403)");
            }
            t.b(this.f40193a, startRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
                endRestartGroup.updateScope(new a(modifier, i8));
            }
        }

        @Override // z3.InterfaceC4021c
        public boolean g() {
            return this.f40200h;
        }

        @Override // z3.InterfaceC4021c
        public InterfaceC3349K h(boolean z8, boolean z9) {
            return v4.g.n(null);
        }

        @Override // z3.InterfaceC4021c
        public float l() {
            return this.f40198f;
        }

        @Override // z3.InterfaceC4021c
        public InterfaceC3349K m() {
            return v4.g.n(H.f4833a.a(this.f40193a.b(), this.f40193a.a(), G.a.b.f4832a));
        }

        @Override // z3.InterfaceC4021c
        public float o() {
            return this.f40197e;
        }

        @Override // z3.InterfaceC4021c
        public float r() {
            return this.f40199g;
        }

        @Override // z3.InterfaceC4021c
        public InterfaceC3349K t(boolean z8) {
            return v4.g.n(Boolean.valueOf(this.f40194b));
        }

        public /* synthetic */ l(s sVar, boolean z8, int i8, AbstractC3151p abstractC3151p) {
            this(sVar, (i8 & 2) != 0 ? false : z8);
        }
    }
}
