package y4;

import O5.C1352h;
import O5.I;
import O5.t;
import a6.InterfaceC1668n;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProduceStateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import l6.M;
import o6.InterfaceC3698L;
import o6.InterfaceC3707g;

/* loaded from: classes4.dex */
public abstract class f {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3698L f40943a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC3698L interfaceC3698L) {
            super(0);
            this.f40943a = interfaceC3698L;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.f40943a.getValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f40944a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f40945b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC3698L f40946c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3707g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ ProduceStateScope f40947a;

            a(ProduceStateScope produceStateScope) {
                this.f40947a = produceStateScope;
            }

            @Override // o6.InterfaceC3707g
            public final Object emit(Object obj, S5.d dVar) {
                this.f40947a.setValue(obj);
                return I.f8278a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC3698L interfaceC3698L, S5.d dVar) {
            super(2, dVar);
            this.f40946c = interfaceC3698L;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            b bVar = new b(this.f40946c, dVar);
            bVar.f40945b = obj;
            return bVar;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(ProduceStateScope produceStateScope, S5.d dVar) {
            return ((b) create(produceStateScope, dVar)).invokeSuspend(I.f8278a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f40944a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            } else {
                t.b(obj);
                ProduceStateScope produceStateScope = (ProduceStateScope) this.f40945b;
                InterfaceC3698L interfaceC3698L = this.f40946c;
                a aVar = new a(produceStateScope);
                this.f40944a = 1;
                if (interfaceC3698L.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1352h();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f40948a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f40949b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC1668n f40950c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ MutableState f40951d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(InterfaceC1668n interfaceC1668n, MutableState mutableState, S5.d dVar) {
            super(2, dVar);
            this.f40950c = interfaceC1668n;
            this.f40951d = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            c cVar = new c(this.f40950c, this.f40951d, dVar);
            cVar.f40949b = obj;
            return cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f40948a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                M m8 = (M) this.f40949b;
                InterfaceC1668n interfaceC1668n = this.f40950c;
                d dVar = new d(this.f40951d, m8.getCoroutineContext());
                this.f40948a = 1;
                if (interfaceC1668n.invoke(dVar, this) == e8) {
                    return e8;
                }
            }
            return I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    public static final State a(InterfaceC3698L interfaceC3698L, Composer composer, int i8) {
        AbstractC3255y.i(interfaceC3698L, "<this>");
        composer.startReplaceableGroup(-419709006);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-419709006, i8, -1, "com.stripe.android.uicore.utils.collectAsState (StateFlowsCompose.kt:42)");
        }
        composer.startReplaceableGroup(-2023564304);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new a(interfaceC3698L);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        State b8 = b((Function0) rememberedValue, interfaceC3698L, new b(interfaceC3698L, null), composer, 582);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return b8;
    }

    private static final State b(Function0 function0, Object obj, InterfaceC1668n interfaceC1668n, Composer composer, int i8) {
        composer.startReplaceableGroup(2085798134);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2085798134, i8, -1, "com.stripe.android.uicore.utils.produceState (StateFlowsCompose.kt:32)");
        }
        composer.startReplaceableGroup(-1742439704);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(function0.invoke(), null, 2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState = (MutableState) rememberedValue;
        composer.endReplaceableGroup();
        EffectsKt.LaunchedEffect(obj, new c(interfaceC1668n, mutableState, null), composer, 72);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return mutableState;
    }
}
