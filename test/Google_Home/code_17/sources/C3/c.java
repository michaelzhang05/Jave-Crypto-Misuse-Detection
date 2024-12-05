package C3;

import C3.a;
import H3.c;
import M3.AbstractC1308c;
import M3.AbstractC1317l;
import M3.G;
import M3.H;
import M3.InterfaceC1307b;
import M3.InterfaceC1324t;
import M3.T;
import M3.U;
import M3.V;
import O3.i;
import O3.n;
import O3.s;
import O3.t;
import O5.I;
import P5.AbstractC1378t;
import a3.C1625g;
import a6.InterfaceC1668n;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import com.stripe.android.model.o;
import java.io.Closeable;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import m2.AbstractC3407E;
import o6.InterfaceC3698L;
import t3.w;

/* loaded from: classes4.dex */
public interface c {

    /* loaded from: classes4.dex */
    public static final class a implements c, Closeable {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC1307b f1200a;

        /* renamed from: b, reason: collision with root package name */
        private final InterfaceC3698L f1201b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f1202c;

        /* renamed from: d, reason: collision with root package name */
        private final float f1203d;

        /* renamed from: e, reason: collision with root package name */
        private final float f1204e;

        /* renamed from: f, reason: collision with root package name */
        private final float f1205f;

        /* renamed from: g, reason: collision with root package name */
        private final EnumC0019c f1206g;

        /* renamed from: h, reason: collision with root package name */
        private final boolean f1207h;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: C3.c$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0017a extends AbstractC3256z implements InterfaceC1668n {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Modifier f1209b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f1210c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0017a(Modifier modifier, int i8) {
                super(2);
                this.f1209b = modifier;
                this.f1210c = i8;
            }

            @Override // a6.InterfaceC1668n
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return I.f8278a;
            }

            public final void invoke(Composer composer, int i8) {
                a.this.g(this.f1209b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f1210c | 1));
            }
        }

        /* loaded from: classes4.dex */
        static final class b extends AbstractC3256z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ boolean f1211a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ boolean f1212b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(boolean z8, boolean z9) {
                super(1);
                this.f1211a = z8;
                this.f1212b = z9;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final B2.b invoke(InterfaceC1307b.a state) {
                AbstractC3255y.i(state, "state");
                String str = null;
                if (this.f1211a || this.f1212b) {
                    return null;
                }
                C1625g c1625g = (C1625g) AbstractC1378t.M0(state.g());
                if (c1625g != null) {
                    str = c1625g.d();
                }
                if (AbstractC3255y.d(str, o.p.f25587i.f25605a)) {
                    return B2.c.a(AbstractC3407E.f34819H0);
                }
                return B2.c.a(w.f39750D);
            }
        }

        public a(InterfaceC1307b interactor) {
            AbstractC3255y.i(interactor, "interactor");
            this.f1200a = interactor;
            this.f1201b = y4.g.n(new C3.a(true, null, 2, null));
            this.f1202c = true;
            this.f1203d = Dp.m5183constructorimpl(0);
            this.f1204e = C3.d.a();
            this.f1205f = C3.d.b();
            this.f1206g = EnumC0019c.f1225a;
            this.f1207h = true;
        }

        @Override // C3.c
        public InterfaceC3698L a() {
            return this.f1201b;
        }

        @Override // C3.c
        public EnumC0019c b() {
            return this.f1206g;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f1200a.close();
        }

        @Override // C3.c
        public boolean f() {
            return this.f1202c;
        }

        @Override // C3.c
        public void g(Modifier modifier, Composer composer, int i8) {
            AbstractC3255y.i(modifier, "modifier");
            Composer startRestartGroup = composer.startRestartGroup(-992403751);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-992403751, i8, -1, "com.stripe.android.paymentsheet.navigation.PaymentSheetScreen.AddAnotherPaymentMethod.Content (PaymentSheetScreen.kt:224)");
            }
            AbstractC1308c.a(this.f1200a, modifier, startRestartGroup, (i8 << 3) & 112, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
                endRestartGroup.updateScope(new C0017a(modifier, i8));
            }
        }

        @Override // C3.c
        public boolean l() {
            return this.f1207h;
        }

        @Override // C3.c
        public InterfaceC3698L m(boolean z8, boolean z9) {
            return y4.g.m(this.f1200a.getState(), new b(z9, z8));
        }

        @Override // C3.c
        public float n() {
            return this.f1204e;
        }

        @Override // C3.c
        public InterfaceC3698L o() {
            return y4.g.n(H.f6539a.a(true, this.f1200a.c(), G.a.b.f6538a));
        }

        @Override // C3.c
        public float s() {
            return this.f1203d;
        }

        @Override // C3.c
        public float u() {
            return this.f1205f;
        }

        @Override // C3.c
        public InterfaceC3698L v(boolean z8) {
            return y4.g.n(Boolean.valueOf(z8));
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements c, Closeable {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC1307b f1213a;

        /* renamed from: b, reason: collision with root package name */
        private final InterfaceC3698L f1214b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f1215c;

        /* renamed from: d, reason: collision with root package name */
        private final float f1216d;

        /* renamed from: e, reason: collision with root package name */
        private final float f1217e;

        /* renamed from: f, reason: collision with root package name */
        private final float f1218f;

        /* renamed from: g, reason: collision with root package name */
        private final boolean f1219g;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3256z implements InterfaceC1668n {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Modifier f1221b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f1222c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Modifier modifier, int i8) {
                super(2);
                this.f1221b = modifier;
                this.f1222c = i8;
            }

            @Override // a6.InterfaceC1668n
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return I.f8278a;
            }

            public final void invoke(Composer composer, int i8) {
                b.this.g(this.f1221b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f1222c | 1));
            }
        }

        /* renamed from: C3.c$b$b, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        static final class C0018b extends AbstractC3256z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ boolean f1223a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ boolean f1224b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0018b(boolean z8, boolean z9) {
                super(1);
                this.f1223a = z8;
                this.f1224b = z9;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final B2.b invoke(InterfaceC1307b.a state) {
                AbstractC3255y.i(state, "state");
                String str = null;
                if (this.f1223a) {
                    return null;
                }
                if (this.f1224b) {
                    return B2.c.a(w.f39797m);
                }
                C1625g c1625g = (C1625g) AbstractC1378t.M0(state.g());
                if (c1625g != null) {
                    str = c1625g.d();
                }
                if (AbstractC3255y.d(str, o.p.f25587i.f25605a)) {
                    return B2.c.a(AbstractC3407E.f34819H0);
                }
                return B2.c.a(w.f39750D);
            }
        }

        public b(InterfaceC1307b interactor) {
            AbstractC3255y.i(interactor, "interactor");
            this.f1213a = interactor;
            this.f1214b = y4.g.n(new C3.a(true, null, 2, null));
            this.f1215c = true;
            this.f1216d = Dp.m5183constructorimpl(0);
            this.f1217e = C3.d.a();
            this.f1218f = C3.d.b();
            this.f1219g = true;
        }

        @Override // C3.c
        public InterfaceC3698L a() {
            return this.f1214b;
        }

        @Override // C3.c
        public EnumC0019c b() {
            return e.a(this);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f1213a.close();
        }

        @Override // C3.c
        public boolean f() {
            return this.f1215c;
        }

        @Override // C3.c
        public void g(Modifier modifier, Composer composer, int i8) {
            AbstractC3255y.i(modifier, "modifier");
            Composer startRestartGroup = composer.startRestartGroup(1504163590);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1504163590, i8, -1, "com.stripe.android.paymentsheet.navigation.PaymentSheetScreen.AddFirstPaymentMethod.Content (PaymentSheetScreen.kt:277)");
            }
            AbstractC1308c.a(this.f1213a, modifier, startRestartGroup, (i8 << 3) & 112, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
                endRestartGroup.updateScope(new a(modifier, i8));
            }
        }

        @Override // C3.c
        public boolean l() {
            return this.f1219g;
        }

        @Override // C3.c
        public InterfaceC3698L m(boolean z8, boolean z9) {
            return y4.g.m(this.f1213a.getState(), new C0018b(z9, z8));
        }

        @Override // C3.c
        public float n() {
            return this.f1217e;
        }

        @Override // C3.c
        public InterfaceC3698L o() {
            return y4.g.n(H.f6539a.a(false, this.f1213a.c(), G.a.b.f6538a));
        }

        @Override // C3.c
        public float s() {
            return this.f1216d;
        }

        @Override // C3.c
        public float u() {
            return this.f1218f;
        }

        @Override // C3.c
        public InterfaceC3698L v(boolean z8) {
            return y4.g.n(Boolean.TRUE);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: C3.c$c, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class EnumC0019c {

        /* renamed from: a, reason: collision with root package name */
        public static final EnumC0019c f1225a = new EnumC0019c("PrimaryButtonAnchored", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final EnumC0019c f1226b = new EnumC0019c("FullPage", 1);

        /* renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ EnumC0019c[] f1227c;

        /* renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ U5.a f1228d;

        static {
            EnumC0019c[] a8 = a();
            f1227c = a8;
            f1228d = U5.b.a(a8);
        }

        private EnumC0019c(String str, int i8) {
        }

        private static final /* synthetic */ EnumC0019c[] a() {
            return new EnumC0019c[]{f1225a, f1226b};
        }

        public static EnumC0019c valueOf(String str) {
            return (EnumC0019c) Enum.valueOf(EnumC0019c.class, str);
        }

        public static EnumC0019c[] values() {
            return (EnumC0019c[]) f1227c.clone();
        }
    }

    /* loaded from: classes4.dex */
    public static final class d implements c {

        /* renamed from: a, reason: collision with root package name */
        private final H3.e f1229a;

        /* renamed from: b, reason: collision with root package name */
        private final InterfaceC3698L f1230b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f1231c;

        /* renamed from: d, reason: collision with root package name */
        private final float f1232d;

        /* renamed from: e, reason: collision with root package name */
        private final float f1233e;

        /* renamed from: f, reason: collision with root package name */
        private final float f1234f;

        /* renamed from: g, reason: collision with root package name */
        private final boolean f1235g;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3256z implements InterfaceC1668n {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Modifier f1237b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f1238c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Modifier modifier, int i8) {
                super(2);
                this.f1237b = modifier;
                this.f1238c = i8;
            }

            @Override // a6.InterfaceC1668n
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return I.f8278a;
            }

            public final void invoke(Composer composer, int i8) {
                d.this.g(this.f1237b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f1238c | 1));
            }
        }

        /* loaded from: classes4.dex */
        static final class b extends AbstractC3256z implements Function1 {

            /* JADX INFO: Access modifiers changed from: package-private */
            /* loaded from: classes4.dex */
            public static final class a extends AbstractC3256z implements Function0 {

                /* renamed from: a, reason: collision with root package name */
                public static final a f1240a = new a();

                a() {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Object invoke() {
                    m2invoke();
                    return I.f8278a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m2invoke() {
                }
            }

            b() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final G invoke(H3.c complete) {
                AbstractC3255y.i(complete, "complete");
                return H.f6539a.a(false, !((H3.f) d.this.f1229a.a().getValue()).e(), new G.a.C0118a(complete instanceof c.b, false, a.f1240a));
            }
        }

        public d(H3.e interactor) {
            AbstractC3255y.i(interactor, "interactor");
            this.f1229a = interactor;
            this.f1230b = y4.g.n(new C3.a(true, new a.C0015a(B2.c.f(w.f39752F, new Object[0], null, 4, null), false)));
            this.f1232d = Dp.m5183constructorimpl(0);
            this.f1233e = C3.d.c();
            this.f1234f = C3.d.d();
        }

        @Override // C3.c
        public InterfaceC3698L a() {
            return this.f1230b;
        }

        @Override // C3.c
        public EnumC0019c b() {
            return e.a(this);
        }

        @Override // C3.c
        public boolean f() {
            return this.f1231c;
        }

        @Override // C3.c
        public void g(Modifier modifier, Composer composer, int i8) {
            AbstractC3255y.i(modifier, "modifier");
            Composer startRestartGroup = composer.startRestartGroup(-521548963);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-521548963, i8, -1, "com.stripe.android.paymentsheet.navigation.PaymentSheetScreen.CvcRecollection.Content (PaymentSheetScreen.kt:532)");
            }
            com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.b.c(this.f1229a, startRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
                endRestartGroup.updateScope(new a(modifier, i8));
            }
        }

        @Override // C3.c
        public boolean l() {
            return this.f1235g;
        }

        @Override // C3.c
        public InterfaceC3698L m(boolean z8, boolean z9) {
            return y4.g.n(null);
        }

        @Override // C3.c
        public float n() {
            return this.f1233e;
        }

        @Override // C3.c
        public InterfaceC3698L o() {
            return y4.g.m(this.f1229a.c(), new b());
        }

        @Override // C3.c
        public float s() {
            return this.f1232d;
        }

        @Override // C3.c
        public float u() {
            return this.f1234f;
        }

        @Override // C3.c
        public InterfaceC3698L v(boolean z8) {
            return y4.g.n(Boolean.FALSE);
        }
    }

    /* loaded from: classes4.dex */
    public static final class e {
        public static EnumC0019c a(c cVar) {
            return EnumC0019c.f1226b;
        }
    }

    /* loaded from: classes4.dex */
    public static final class f implements c, Closeable {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC1324t f1241a;

        /* renamed from: b, reason: collision with root package name */
        private final InterfaceC3698L f1242b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f1243c;

        /* renamed from: d, reason: collision with root package name */
        private final float f1244d;

        /* renamed from: e, reason: collision with root package name */
        private final float f1245e;

        /* renamed from: f, reason: collision with root package name */
        private final float f1246f;

        /* renamed from: g, reason: collision with root package name */
        private final boolean f1247g;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3256z implements InterfaceC1668n {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Modifier f1249b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f1250c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Modifier modifier, int i8) {
                super(2);
                this.f1249b = modifier;
                this.f1250c = i8;
            }

            @Override // a6.InterfaceC1668n
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return I.f8278a;
            }

            public final void invoke(Composer composer, int i8) {
                f.this.g(this.f1249b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f1250c | 1));
            }
        }

        public f(InterfaceC1324t interactor) {
            AbstractC3255y.i(interactor, "interactor");
            this.f1241a = interactor;
            this.f1242b = y4.g.n(new C3.a(false, null, 2, null));
            float f8 = 0;
            this.f1244d = Dp.m5183constructorimpl(f8);
            this.f1245e = Dp.m5183constructorimpl(f8);
            this.f1246f = C3.d.b();
        }

        @Override // C3.c
        public InterfaceC3698L a() {
            return this.f1242b;
        }

        @Override // C3.c
        public EnumC0019c b() {
            return e.a(this);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f1241a.close();
        }

        @Override // C3.c
        public boolean f() {
            return this.f1243c;
        }

        @Override // C3.c
        public void g(Modifier modifier, Composer composer, int i8) {
            AbstractC3255y.i(modifier, "modifier");
            Composer startRestartGroup = composer.startRestartGroup(-1252883967);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1252883967, i8, -1, "com.stripe.android.paymentsheet.navigation.PaymentSheetScreen.EditPaymentMethod.Content (PaymentSheetScreen.kt:318)");
            }
            AbstractC1317l.d(this.f1241a, modifier, startRestartGroup, (i8 << 3) & 112, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
                endRestartGroup.updateScope(new a(modifier, i8));
            }
        }

        @Override // C3.c
        public boolean l() {
            return this.f1247g;
        }

        @Override // C3.c
        public InterfaceC3698L m(boolean z8, boolean z9) {
            return y4.g.n(B2.c.a(AbstractC3407E.f34827L0));
        }

        @Override // C3.c
        public float n() {
            return this.f1245e;
        }

        @Override // C3.c
        public InterfaceC3698L o() {
            return y4.g.n(H.f6539a.a(true, this.f1241a.c(), G.a.b.f6538a));
        }

        @Override // C3.c
        public float s() {
            return this.f1244d;
        }

        @Override // C3.c
        public float u() {
            return this.f1246f;
        }

        @Override // C3.c
        public InterfaceC3698L v(boolean z8) {
            return y4.g.n(Boolean.FALSE);
        }
    }

    /* loaded from: classes4.dex */
    public static final class g implements c {

        /* renamed from: c, reason: collision with root package name */
        private static final boolean f1253c = false;

        /* renamed from: d, reason: collision with root package name */
        private static final float f1254d;

        /* renamed from: e, reason: collision with root package name */
        private static final float f1255e;

        /* renamed from: g, reason: collision with root package name */
        private static final boolean f1257g = false;

        /* renamed from: a, reason: collision with root package name */
        public static final g f1251a = new g();

        /* renamed from: b, reason: collision with root package name */
        private static final InterfaceC3698L f1252b = y4.g.n(new C3.a(false, null, 2, null));

        /* renamed from: f, reason: collision with root package name */
        private static final float f1256f = C3.d.b();

        /* renamed from: h, reason: collision with root package name */
        public static final int f1258h = 8;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3256z implements InterfaceC1668n {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Modifier f1260b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f1261c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Modifier modifier, int i8) {
                super(2);
                this.f1260b = modifier;
                this.f1261c = i8;
            }

            @Override // a6.InterfaceC1668n
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return I.f8278a;
            }

            public final void invoke(Composer composer, int i8) {
                g.this.g(this.f1260b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f1261c | 1));
            }
        }

        static {
            float f8 = 0;
            f1254d = Dp.m5183constructorimpl(f8);
            f1255e = Dp.m5183constructorimpl(f8);
        }

        private g() {
        }

        @Override // C3.c
        public InterfaceC3698L a() {
            return f1252b;
        }

        @Override // C3.c
        public EnumC0019c b() {
            return e.a(this);
        }

        @Override // C3.c
        public boolean f() {
            return f1253c;
        }

        @Override // C3.c
        public void g(Modifier modifier, Composer composer, int i8) {
            int i9;
            int i10;
            AbstractC3255y.i(modifier, "modifier");
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
                t2.b.a(modifier, startRestartGroup, i9 & 14, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
                endRestartGroup.updateScope(new a(modifier, i8));
            }
        }

        @Override // C3.c
        public boolean l() {
            return f1257g;
        }

        @Override // C3.c
        public InterfaceC3698L m(boolean z8, boolean z9) {
            return y4.g.n(null);
        }

        @Override // C3.c
        public float n() {
            return f1255e;
        }

        @Override // C3.c
        public InterfaceC3698L o() {
            return y4.g.n(null);
        }

        @Override // C3.c
        public float s() {
            return f1254d;
        }

        @Override // C3.c
        public float u() {
            return f1256f;
        }

        @Override // C3.c
        public InterfaceC3698L v(boolean z8) {
            return y4.g.n(Boolean.FALSE);
        }
    }

    /* loaded from: classes4.dex */
    public static final class h implements c {

        /* renamed from: a, reason: collision with root package name */
        private final O3.f f1262a;

        /* renamed from: b, reason: collision with root package name */
        private final InterfaceC3698L f1263b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f1264c;

        /* renamed from: d, reason: collision with root package name */
        private final float f1265d;

        /* renamed from: e, reason: collision with root package name */
        private final float f1266e;

        /* renamed from: f, reason: collision with root package name */
        private final float f1267f;

        /* renamed from: g, reason: collision with root package name */
        private final boolean f1268g;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3256z implements InterfaceC1668n {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Modifier f1270b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f1271c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Modifier modifier, int i8) {
                super(2);
                this.f1270b = modifier;
                this.f1271c = i8;
            }

            @Override // a6.InterfaceC1668n
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return I.f8278a;
            }

            public final void invoke(Composer composer, int i8) {
                h.this.g(this.f1270b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f1271c | 1));
            }
        }

        public h(O3.f interactor) {
            AbstractC3255y.i(interactor, "interactor");
            this.f1262a = interactor;
            this.f1263b = y4.g.n(new C3.a(false, null, 2, null));
            float f8 = 0;
            this.f1265d = Dp.m5183constructorimpl(f8);
            this.f1266e = Dp.m5183constructorimpl(f8);
            this.f1267f = C3.d.d();
        }

        @Override // C3.c
        public InterfaceC3698L a() {
            return this.f1263b;
        }

        @Override // C3.c
        public EnumC0019c b() {
            return e.a(this);
        }

        @Override // C3.c
        public boolean f() {
            return this.f1264c;
        }

        @Override // C3.c
        public void g(Modifier modifier, Composer composer, int i8) {
            AbstractC3255y.i(modifier, "modifier");
            Composer startRestartGroup = composer.startRestartGroup(1539421821);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1539421821, i8, -1, "com.stripe.android.paymentsheet.navigation.PaymentSheetScreen.ManageOneSavedPaymentMethod.Content (PaymentSheetScreen.kt:492)");
            }
            O3.g.a(this.f1262a, startRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
                endRestartGroup.updateScope(new a(modifier, i8));
            }
        }

        @Override // C3.c
        public boolean l() {
            return this.f1268g;
        }

        @Override // C3.c
        public InterfaceC3698L m(boolean z8, boolean z9) {
            return y4.g.n(B2.c.a(w.f39772Z));
        }

        @Override // C3.c
        public float n() {
            return this.f1266e;
        }

        @Override // C3.c
        public InterfaceC3698L o() {
            return y4.g.n(H.f6539a.a(true, this.f1262a.getState().b(), G.a.b.f6538a));
        }

        @Override // C3.c
        public float s() {
            return this.f1265d;
        }

        @Override // C3.c
        public float u() {
            return this.f1267f;
        }

        @Override // C3.c
        public InterfaceC3698L v(boolean z8) {
            return y4.g.n(Boolean.FALSE);
        }
    }

    /* loaded from: classes4.dex */
    public static final class i implements c, Closeable {

        /* renamed from: a, reason: collision with root package name */
        private final O3.i f1272a;

        /* renamed from: b, reason: collision with root package name */
        private final InterfaceC3698L f1273b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f1274c;

        /* renamed from: d, reason: collision with root package name */
        private final float f1275d;

        /* renamed from: e, reason: collision with root package name */
        private final float f1276e;

        /* renamed from: f, reason: collision with root package name */
        private final float f1277f;

        /* renamed from: g, reason: collision with root package name */
        private final boolean f1278g;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3256z implements InterfaceC1668n {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Modifier f1280b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f1281c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Modifier modifier, int i8) {
                super(2);
                this.f1280b = modifier;
                this.f1281c = i8;
            }

            @Override // a6.InterfaceC1668n
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return I.f8278a;
            }

            public final void invoke(Composer composer, int i8) {
                i.this.g(this.f1280b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f1281c | 1));
            }
        }

        /* loaded from: classes4.dex */
        static final class b extends AbstractC3256z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            public static final b f1282a = new b();

            b() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final B2.b invoke(i.a state) {
                int i8;
                AbstractC3255y.i(state, "state");
                if (state.e()) {
                    i8 = w.f39755I;
                } else {
                    i8 = w.f39784f0;
                }
                return B2.c.a(i8);
            }
        }

        /* renamed from: C3.c$i$c, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        static final class C0020c extends AbstractC3256z implements Function1 {

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: C3.c$i$c$a */
            /* loaded from: classes4.dex */
            public static final class a extends AbstractC3256z implements Function0 {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ i f1284a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(i iVar) {
                    super(0);
                    this.f1284a = iVar;
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Object invoke() {
                    m3invoke();
                    return I.f8278a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m3invoke() {
                    this.f1284a.f1272a.a(i.b.d.f8056a);
                }
            }

            C0020c() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final G invoke(i.a state) {
                AbstractC3255y.i(state, "state");
                return H.f6539a.a(true, i.this.f1272a.c(), new G.a.C0118a(state.e(), state.a(), new a(i.this)));
            }
        }

        public i(O3.i interactor) {
            AbstractC3255y.i(interactor, "interactor");
            this.f1272a = interactor;
            this.f1273b = y4.g.n(new C3.a(false, null, 2, null));
            float f8 = 0;
            this.f1275d = Dp.m5183constructorimpl(f8);
            this.f1276e = Dp.m5183constructorimpl(f8);
            this.f1277f = C3.d.d();
        }

        @Override // C3.c
        public InterfaceC3698L a() {
            return this.f1273b;
        }

        @Override // C3.c
        public EnumC0019c b() {
            return e.a(this);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f1272a.close();
        }

        @Override // C3.c
        public boolean f() {
            return this.f1274c;
        }

        @Override // C3.c
        public void g(Modifier modifier, Composer composer, int i8) {
            AbstractC3255y.i(modifier, "modifier");
            Composer startRestartGroup = composer.startRestartGroup(-449464720);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-449464720, i8, -1, "com.stripe.android.paymentsheet.navigation.PaymentSheetScreen.ManageSavedPaymentMethods.Content (PaymentSheetScreen.kt:454)");
            }
            O3.j.a(this.f1272a, startRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
                endRestartGroup.updateScope(new a(modifier, i8));
            }
        }

        @Override // C3.c
        public boolean l() {
            return this.f1278g;
        }

        @Override // C3.c
        public InterfaceC3698L m(boolean z8, boolean z9) {
            return y4.g.m(this.f1272a.getState(), b.f1282a);
        }

        @Override // C3.c
        public float n() {
            return this.f1276e;
        }

        @Override // C3.c
        public InterfaceC3698L o() {
            return y4.g.m(this.f1272a.getState(), new C0020c());
        }

        @Override // C3.c
        public float s() {
            return this.f1275d;
        }

        @Override // C3.c
        public float u() {
            return this.f1277f;
        }

        @Override // C3.c
        public InterfaceC3698L v(boolean z8) {
            return y4.g.n(Boolean.FALSE);
        }
    }

    /* loaded from: classes4.dex */
    public static final class k implements c {

        /* renamed from: a, reason: collision with root package name */
        private final n f1301a;

        /* renamed from: b, reason: collision with root package name */
        private final InterfaceC3698L f1302b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f1303c;

        /* renamed from: d, reason: collision with root package name */
        private final float f1304d;

        /* renamed from: e, reason: collision with root package name */
        private final float f1305e;

        /* renamed from: f, reason: collision with root package name */
        private final float f1306f;

        /* renamed from: g, reason: collision with root package name */
        private final boolean f1307g;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3256z implements InterfaceC1668n {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Modifier f1309b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f1310c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Modifier modifier, int i8) {
                super(2);
                this.f1309b = modifier;
                this.f1310c = i8;
            }

            @Override // a6.InterfaceC1668n
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return I.f8278a;
            }

            public final void invoke(Composer composer, int i8) {
                k.this.g(this.f1309b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f1310c | 1));
            }
        }

        public k(n interactor) {
            AbstractC3255y.i(interactor, "interactor");
            this.f1301a = interactor;
            this.f1302b = y4.g.n(new C3.a(true, null, 2, null));
            this.f1303c = true;
            this.f1304d = Dp.m5183constructorimpl(0);
            this.f1305e = C3.d.c();
            this.f1306f = C3.d.d();
            this.f1307g = true;
        }

        @Override // C3.c
        public InterfaceC3698L a() {
            return this.f1302b;
        }

        @Override // C3.c
        public EnumC0019c b() {
            return e.a(this);
        }

        @Override // C3.c
        public boolean f() {
            return this.f1303c;
        }

        @Override // C3.c
        public void g(Modifier modifier, Composer composer, int i8) {
            AbstractC3255y.i(modifier, "modifier");
            Composer startRestartGroup = composer.startRestartGroup(-1185148305);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1185148305, i8, -1, "com.stripe.android.paymentsheet.navigation.PaymentSheetScreen.VerticalMode.Content (PaymentSheetScreen.kt:365)");
            }
            O3.o.b(this.f1301a, modifier, startRestartGroup, (i8 << 3) & 112, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
                endRestartGroup.updateScope(new a(modifier, i8));
            }
        }

        @Override // C3.c
        public boolean l() {
            return this.f1307g;
        }

        @Override // C3.c
        public InterfaceC3698L m(boolean z8, boolean z9) {
            B2.b a8;
            if (z9) {
                a8 = null;
            } else if (z8) {
                a8 = B2.c.a(w.f39782e0);
            } else {
                a8 = B2.c.a(w.f39750D);
            }
            return y4.g.n(a8);
        }

        @Override // C3.c
        public float n() {
            return this.f1305e;
        }

        @Override // C3.c
        public InterfaceC3698L o() {
            return y4.g.n(H.f6539a.a(false, this.f1301a.c(), G.a.b.f6538a));
        }

        @Override // C3.c
        public float s() {
            return this.f1304d;
        }

        @Override // C3.c
        public float u() {
            return this.f1306f;
        }

        @Override // C3.c
        public InterfaceC3698L v(boolean z8) {
            return this.f1301a.b();
        }
    }

    InterfaceC3698L a();

    EnumC0019c b();

    boolean f();

    void g(Modifier modifier, Composer composer, int i8);

    boolean l();

    InterfaceC3698L m(boolean z8, boolean z9);

    float n();

    InterfaceC3698L o();

    float s();

    float u();

    InterfaceC3698L v(boolean z8);

    /* loaded from: classes4.dex */
    public static final class j implements c, Closeable {

        /* renamed from: a, reason: collision with root package name */
        private final V f1285a;

        /* renamed from: b, reason: collision with root package name */
        private final b f1286b;

        /* renamed from: c, reason: collision with root package name */
        private final InterfaceC3698L f1287c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f1288d;

        /* renamed from: e, reason: collision with root package name */
        private final float f1289e;

        /* renamed from: f, reason: collision with root package name */
        private final float f1290f;

        /* renamed from: g, reason: collision with root package name */
        private final float f1291g;

        /* renamed from: h, reason: collision with root package name */
        private final EnumC0019c f1292h;

        /* renamed from: i, reason: collision with root package name */
        private final boolean f1293i;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3256z implements InterfaceC1668n {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Modifier f1295b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f1296c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Modifier modifier, int i8) {
                super(2);
                this.f1295b = modifier;
                this.f1296c = i8;
            }

            @Override // a6.InterfaceC1668n
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return I.f8278a;
            }

            public final void invoke(Composer composer, int i8) {
                j.this.g(this.f1295b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f1296c | 1));
            }
        }

        /* loaded from: classes4.dex */
        public interface b {

            /* loaded from: classes4.dex */
            public static final class a implements b {

                /* renamed from: a, reason: collision with root package name */
                public static final a f1297a = new a();

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

            /* renamed from: C3.c$j$b$b, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0021b implements b {

                /* renamed from: a, reason: collision with root package name */
                private final InterfaceC3698L f1298a;

                public C0021b(InterfaceC3698L cvcControllerFlow) {
                    AbstractC3255y.i(cvcControllerFlow, "cvcControllerFlow");
                    this.f1298a = cvcControllerFlow;
                }

                public final InterfaceC3698L a() {
                    return this.f1298a;
                }
            }
        }

        /* renamed from: C3.c$j$c, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        static final class C0022c extends AbstractC3256z implements Function1 {

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: C3.c$j$c$a */
            /* loaded from: classes4.dex */
            public static final class a extends AbstractC3256z implements Function0 {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ j f1300a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(j jVar) {
                    super(0);
                    this.f1300a = jVar;
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Object invoke() {
                    m4invoke();
                    return I.f8278a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m4invoke() {
                    this.f1300a.f1285a.a(V.b.e.f6838a);
                }
            }

            C0022c() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final G invoke(V.a state) {
                AbstractC3255y.i(state, "state");
                return H.f6539a.a(false, j.this.f1285a.c(), new G.a.C0118a(state.f(), state.c(), new a(j.this)));
            }
        }

        public j(V interactor, b cvcRecollectionState) {
            AbstractC3255y.i(interactor, "interactor");
            AbstractC3255y.i(cvcRecollectionState, "cvcRecollectionState");
            this.f1285a = interactor;
            this.f1286b = cvcRecollectionState;
            this.f1287c = y4.g.n(new C3.a(true, null, 2, null));
            this.f1289e = T.j();
            this.f1290f = Dp.m5183constructorimpl(0);
            this.f1291g = C3.d.b();
            this.f1292h = EnumC0019c.f1225a;
            this.f1293i = true;
        }

        @Override // C3.c
        public InterfaceC3698L a() {
            return this.f1287c;
        }

        @Override // C3.c
        public EnumC0019c b() {
            return this.f1292h;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f1285a.close();
        }

        @Override // C3.c
        public boolean f() {
            return this.f1288d;
        }

        @Override // C3.c
        public void g(Modifier modifier, Composer composer, int i8) {
            AbstractC3255y.i(modifier, "modifier");
            Composer startRestartGroup = composer.startRestartGroup(-289202489);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-289202489, i8, -1, "com.stripe.android.paymentsheet.navigation.PaymentSheetScreen.SelectSavedPaymentMethods.Content (PaymentSheetScreen.kt:168)");
            }
            U.j(this.f1285a, this.f1286b, modifier, startRestartGroup, (i8 << 6) & 896);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
                endRestartGroup.updateScope(new a(modifier, i8));
            }
        }

        @Override // C3.c
        public boolean l() {
            return this.f1293i;
        }

        @Override // C3.c
        public InterfaceC3698L m(boolean z8, boolean z9) {
            B2.b a8;
            if (z8 && z9) {
                a8 = null;
            } else {
                a8 = B2.c.a(w.f39784f0);
            }
            return y4.g.n(a8);
        }

        @Override // C3.c
        public float n() {
            return this.f1290f;
        }

        @Override // C3.c
        public InterfaceC3698L o() {
            return y4.g.m(this.f1285a.getState(), new C0022c());
        }

        @Override // C3.c
        public float s() {
            return this.f1289e;
        }

        @Override // C3.c
        public float u() {
            return this.f1291g;
        }

        @Override // C3.c
        public InterfaceC3698L v(boolean z8) {
            return y4.g.n(Boolean.valueOf(z8));
        }

        public final b y() {
            return this.f1286b;
        }

        public /* synthetic */ j(V v8, b bVar, int i8, AbstractC3247p abstractC3247p) {
            this(v8, (i8 & 2) != 0 ? b.a.f1297a : bVar);
        }
    }

    /* loaded from: classes4.dex */
    public static final class l implements c, Closeable {

        /* renamed from: a, reason: collision with root package name */
        private final s f1311a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f1312b;

        /* renamed from: c, reason: collision with root package name */
        private final InterfaceC3698L f1313c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f1314d;

        /* renamed from: e, reason: collision with root package name */
        private final float f1315e;

        /* renamed from: f, reason: collision with root package name */
        private final float f1316f;

        /* renamed from: g, reason: collision with root package name */
        private final float f1317g;

        /* renamed from: h, reason: collision with root package name */
        private final boolean f1318h;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3256z implements InterfaceC1668n {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Modifier f1320b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f1321c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Modifier modifier, int i8) {
                super(2);
                this.f1320b = modifier;
                this.f1321c = i8;
            }

            @Override // a6.InterfaceC1668n
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return I.f8278a;
            }

            public final void invoke(Composer composer, int i8) {
                l.this.g(this.f1320b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f1321c | 1));
            }
        }

        public l(s interactor, boolean z8) {
            AbstractC3255y.i(interactor, "interactor");
            this.f1311a = interactor;
            this.f1312b = z8;
            this.f1313c = y4.g.n(new C3.a(true, null, 2, null));
            this.f1314d = true;
            this.f1315e = Dp.m5183constructorimpl(0);
            this.f1316f = C3.d.c();
            this.f1317g = C3.d.d();
            this.f1318h = true;
        }

        @Override // C3.c
        public InterfaceC3698L a() {
            return this.f1313c;
        }

        @Override // C3.c
        public EnumC0019c b() {
            return e.a(this);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f1311a.close();
        }

        @Override // C3.c
        public boolean f() {
            return this.f1314d;
        }

        @Override // C3.c
        public void g(Modifier modifier, Composer composer, int i8) {
            AbstractC3255y.i(modifier, "modifier");
            Composer startRestartGroup = composer.startRestartGroup(1422248203);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1422248203, i8, -1, "com.stripe.android.paymentsheet.navigation.PaymentSheetScreen.VerticalModeForm.Content (PaymentSheetScreen.kt:403)");
            }
            t.b(this.f1311a, startRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
                endRestartGroup.updateScope(new a(modifier, i8));
            }
        }

        @Override // C3.c
        public boolean l() {
            return this.f1318h;
        }

        @Override // C3.c
        public InterfaceC3698L m(boolean z8, boolean z9) {
            return y4.g.n(null);
        }

        @Override // C3.c
        public float n() {
            return this.f1316f;
        }

        @Override // C3.c
        public InterfaceC3698L o() {
            return y4.g.n(H.f6539a.a(this.f1311a.a(), this.f1311a.c(), G.a.b.f6538a));
        }

        @Override // C3.c
        public float s() {
            return this.f1315e;
        }

        @Override // C3.c
        public float u() {
            return this.f1317g;
        }

        @Override // C3.c
        public InterfaceC3698L v(boolean z8) {
            return y4.g.n(Boolean.valueOf(this.f1312b));
        }

        public /* synthetic */ l(s sVar, boolean z8, int i8, AbstractC3247p abstractC3247p) {
            this(sVar, (i8 & 2) != 0 ? false : z8);
        }
    }
}
