package M3;

import a6.InterfaceC1668n;
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
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import o6.AbstractC3708h;
import o6.InterfaceC3706f;
import o6.InterfaceC3707g;
import z3.d;

/* renamed from: M3.x, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1328x {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: M3.x$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f7164a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ D3.a f7165b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f7166c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1 f7167d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ List f7168e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Modifier f7169f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f7170g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f7171h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, D3.a aVar, boolean z8, Function1 function1, List list, Modifier modifier, int i8, int i9) {
            super(2);
            this.f7164a = str;
            this.f7165b = aVar;
            this.f7166c = z8;
            this.f7167d = function1;
            this.f7168e = list;
            this.f7169f = modifier;
            this.f7170g = i8;
            this.f7171h = i9;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return O5.I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            AbstractC1328x.a(this.f7164a, this.f7165b, this.f7166c, this.f7167d, this.f7168e, this.f7169f, composer, RecomposeScopeImplKt.updateChangedFlags(this.f7170g | 1), this.f7171h);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: M3.x$b */
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f7172a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC3706f f7173b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1 f7174c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: M3.x$b$a */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3707g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Function1 f7175a;

            a(Function1 function1) {
                this.f7175a = function1;
            }

            @Override // o6.InterfaceC3707g
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(z3.c cVar, S5.d dVar) {
                this.f7175a.invoke(cVar);
                return O5.I.f8278a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC3706f interfaceC3706f, Function1 function1, S5.d dVar) {
            super(2, dVar);
            this.f7173b = interfaceC3706f;
            this.f7174c = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new b(this.f7173b, this.f7174c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f7172a;
            if (i8 != 0) {
                if (i8 == 1) {
                    O5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                O5.t.b(obj);
                InterfaceC3706f p8 = AbstractC3708h.p(this.f7173b);
                a aVar = new a(this.f7174c);
                this.f7172a = 1;
                if (p8.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            return O5.I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(l6.M m8, S5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: M3.x$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f7176a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f7177b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1 f7178c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC3706f f7179d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Set f7180e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ List f7181f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ p4.G f7182g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Modifier f7183h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f7184i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f7185j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, boolean z8, Function1 function1, InterfaceC3706f interfaceC3706f, Set set, List list, p4.G g8, Modifier modifier, int i8, int i9) {
            super(2);
            this.f7176a = str;
            this.f7177b = z8;
            this.f7178c = function1;
            this.f7179d = interfaceC3706f;
            this.f7180e = set;
            this.f7181f = list;
            this.f7182g = g8;
            this.f7183h = modifier;
            this.f7184i = i8;
            this.f7185j = i9;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return O5.I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            AbstractC1328x.b(this.f7176a, this.f7177b, this.f7178c, this.f7179d, this.f7180e, this.f7181f, this.f7182g, this.f7183h, composer, RecomposeScopeImplKt.updateChangedFlags(this.f7184i | 1), this.f7185j);
        }
    }

    public static final void a(String uuid, D3.a args, boolean z8, Function1 onFormFieldValuesChanged, List formElements, Modifier modifier, Composer composer, int i8, int i9) {
        Modifier modifier2;
        CreationExtras creationExtras;
        AbstractC3255y.i(uuid, "uuid");
        AbstractC3255y.i(args, "args");
        AbstractC3255y.i(onFormFieldValuesChanged, "onFormFieldValuesChanged");
        AbstractC3255y.i(formElements, "formElements");
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
            ViewModel viewModel = ViewModelKt.viewModel((Class<ViewModel>) z3.d.class, current, str, bVar, creationExtras, startRestartGroup, 36936, 0);
            startRestartGroup.endReplaceableGroup();
            z3.d dVar = (z3.d) viewModel;
            List d8 = dVar.d();
            State a8 = y4.f.a(dVar.e(), startRestartGroup, 8);
            State a9 = y4.f.a(dVar.f(), startRestartGroup, 8);
            int i10 = i8 >> 3;
            b(args.e(), z8, onFormFieldValuesChanged, dVar.b(), c(a8), d8, d(a9), modifier2, startRestartGroup, (i10 & 896) | (i10 & 112) | 299008 | (p4.G.f37099d << 18) | ((i8 << 6) & 29360128), 0);
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

    public static final void b(String paymentMethodCode, boolean z8, Function1 onFormFieldValuesChanged, InterfaceC3706f completeFormValues, Set hiddenIdentifiers, List elements, p4.G g8, Modifier modifier, Composer composer, int i8, int i9) {
        Modifier modifier2;
        AbstractC3255y.i(paymentMethodCode, "paymentMethodCode");
        AbstractC3255y.i(onFormFieldValuesChanged, "onFormFieldValuesChanged");
        AbstractC3255y.i(completeFormValues, "completeFormValues");
        AbstractC3255y.i(hiddenIdentifiers, "hiddenIdentifiers");
        AbstractC3255y.i(elements, "elements");
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
        e4.i.a(hiddenIdentifiers, z8, elements, g8, modifier3, startRestartGroup, (i8 & 112) | 520 | (p4.G.f37099d << 9) | (i10 & 7168) | (i10 & 57344), 0);
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

    private static final p4.G d(State state) {
        return (p4.G) state.getValue();
    }
}
