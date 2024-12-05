package J3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import l6.AbstractC3360h;
import l6.InterfaceC3358f;
import l6.InterfaceC3359g;
import w3.d;

/* renamed from: J3.x, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1215x {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J3.x$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f5458a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ A3.a f5459b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f5460c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1 f5461d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ List f5462e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Modifier f5463f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f5464g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f5465h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, A3.a aVar, boolean z8, Function1 function1, List list, Modifier modifier, int i8, int i9) {
            super(2);
            this.f5458a = str;
            this.f5459b = aVar;
            this.f5460c = z8;
            this.f5461d = function1;
            this.f5462e = list;
            this.f5463f = modifier;
            this.f5464g = i8;
            this.f5465h = i9;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return L5.I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            AbstractC1215x.a(this.f5458a, this.f5459b, this.f5460c, this.f5461d, this.f5462e, this.f5463f, composer, RecomposeScopeImplKt.updateChangedFlags(this.f5464g | 1), this.f5465h);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J3.x$b */
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f5466a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC3358f f5467b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1 f5468c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: J3.x$b$a */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3359g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Function1 f5469a;

            a(Function1 function1) {
                this.f5469a = function1;
            }

            @Override // l6.InterfaceC3359g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(w3.c cVar, P5.d dVar) {
                this.f5469a.invoke(cVar);
                return L5.I.f6487a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC3358f interfaceC3358f, Function1 function1, P5.d dVar) {
            super(2, dVar);
            this.f5467b = interfaceC3358f;
            this.f5468c = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new b(this.f5467b, this.f5468c, dVar);
        }

        @Override // X5.n
        public final Object invoke(i6.M m8, P5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f5466a;
            if (i8 != 0) {
                if (i8 == 1) {
                    L5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                L5.t.b(obj);
                InterfaceC3358f n8 = AbstractC3360h.n(this.f5467b);
                a aVar = new a(this.f5468c);
                this.f5466a = 1;
                if (n8.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            return L5.I.f6487a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J3.x$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f5470a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f5471b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1 f5472c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC3358f f5473d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Set f5474e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ List f5475f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ m4.G f5476g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Modifier f5477h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f5478i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f5479j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, boolean z8, Function1 function1, InterfaceC3358f interfaceC3358f, Set set, List list, m4.G g8, Modifier modifier, int i8, int i9) {
            super(2);
            this.f5470a = str;
            this.f5471b = z8;
            this.f5472c = function1;
            this.f5473d = interfaceC3358f;
            this.f5474e = set;
            this.f5475f = list;
            this.f5476g = g8;
            this.f5477h = modifier;
            this.f5478i = i8;
            this.f5479j = i9;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return L5.I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            AbstractC1215x.b(this.f5470a, this.f5471b, this.f5472c, this.f5473d, this.f5474e, this.f5475f, this.f5476g, this.f5477h, composer, RecomposeScopeImplKt.updateChangedFlags(this.f5478i | 1), this.f5479j);
        }
    }

    public static final void a(String uuid, A3.a args, boolean z8, Function1 onFormFieldValuesChanged, List formElements, Modifier modifier, Composer composer, int i8, int i9) {
        Modifier modifier2;
        CreationExtras creationExtras;
        AbstractC3159y.i(uuid, "uuid");
        AbstractC3159y.i(args, "args");
        AbstractC3159y.i(onFormFieldValuesChanged, "onFormFieldValuesChanged");
        AbstractC3159y.i(formElements, "formElements");
        Composer startRestartGroup = composer.startRestartGroup(-254814677);
        if ((i9 & 32) != 0) {
            modifier2 = Modifier.Companion;
        } else {
            modifier2 = modifier;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-254814677, i8, -1, "com.stripe.android.paymentsheet.ui.PaymentMethodForm (PaymentMethodForm.kt:26)");
        }
        String str = args.e() + "_" + uuid;
        d.b bVar = new d.b(formElements, args);
        startRestartGroup.startReplaceableGroup(1729797275);
        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(startRestartGroup, 6);
        if (current != null) {
            if (current instanceof HasDefaultViewModelProviderFactory) {
                creationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
            } else {
                creationExtras = CreationExtras.Empty.INSTANCE;
            }
            ViewModel viewModel = ViewModelKt.viewModel((Class<ViewModel>) w3.d.class, current, str, bVar, creationExtras, startRestartGroup, 36936, 0);
            startRestartGroup.endReplaceableGroup();
            w3.d dVar = (w3.d) viewModel;
            List d8 = dVar.d();
            State a8 = v4.f.a(dVar.e(), startRestartGroup, 8);
            State a9 = v4.f.a(dVar.f(), startRestartGroup, 8);
            int i10 = i8 >> 3;
            b(args.e(), z8, onFormFieldValuesChanged, dVar.b(), c(a8), d8, d(a9), modifier2, startRestartGroup, (i10 & 896) | (i10 & 112) | 299008 | (m4.G.f35073d << 18) | ((i8 << 6) & 29360128), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
                endRestartGroup.updateScope(new a(uuid, args, z8, onFormFieldValuesChanged, formElements, modifier2, i8, i9));
                return;
            }
            return;
        }
        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
    }

    public static final void b(String paymentMethodCode, boolean z8, Function1 onFormFieldValuesChanged, InterfaceC3358f completeFormValues, Set hiddenIdentifiers, List elements, m4.G g8, Modifier modifier, Composer composer, int i8, int i9) {
        Modifier modifier2;
        AbstractC3159y.i(paymentMethodCode, "paymentMethodCode");
        AbstractC3159y.i(onFormFieldValuesChanged, "onFormFieldValuesChanged");
        AbstractC3159y.i(completeFormValues, "completeFormValues");
        AbstractC3159y.i(hiddenIdentifiers, "hiddenIdentifiers");
        AbstractC3159y.i(elements, "elements");
        Composer startRestartGroup = composer.startRestartGroup(958947257);
        if ((i9 & 128) != 0) {
            modifier2 = Modifier.Companion;
        } else {
            modifier2 = modifier;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(958947257, i8, -1, "com.stripe.android.paymentsheet.ui.PaymentMethodForm (PaymentMethodForm.kt:61)");
        }
        EffectsKt.LaunchedEffect(paymentMethodCode, new b(completeFormValues, onFormFieldValuesChanged, null), startRestartGroup, (i8 & 14) | 64);
        int i10 = i8 >> 9;
        Modifier modifier3 = modifier2;
        b4.i.a(hiddenIdentifiers, z8, elements, g8, modifier3, startRestartGroup, (i8 & 112) | 520 | (m4.G.f35073d << 9) | (i10 & 7168) | (i10 & 57344), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new c(paymentMethodCode, z8, onFormFieldValuesChanged, completeFormValues, hiddenIdentifiers, elements, g8, modifier2, i8, i9));
        }
    }

    private static final Set c(State state) {
        return (Set) state.getValue();
    }

    private static final m4.G d(State state) {
        return (m4.G) state.getValue();
    }
}
