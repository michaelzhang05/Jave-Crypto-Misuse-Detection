package androidx.compose.material;

import O5.I;
import O5.t;
import S5.d;
import a6.InterfaceC1668n;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import l6.AbstractC3364k;
import l6.M;

/* loaded from: classes.dex */
final class BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1 extends AbstractC3256z implements Function1 {
    final /* synthetic */ BackdropScaffoldState $scaffoldState;
    final /* synthetic */ M $scope;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends AbstractC3256z implements Function0 {
        final /* synthetic */ BackdropScaffoldState $scaffoldState;
        final /* synthetic */ M $scope;

        /* JADX INFO: Access modifiers changed from: package-private */
        @f(c = "androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1$1$1", f = "BackdropScaffold.kt", l = {330}, m = "invokeSuspend")
        /* renamed from: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C03111 extends l implements InterfaceC1668n {
            final /* synthetic */ BackdropScaffoldState $scaffoldState;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C03111(BackdropScaffoldState backdropScaffoldState, d dVar) {
                super(2, dVar);
                this.$scaffoldState = backdropScaffoldState;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final d create(Object obj, d dVar) {
                return new C03111(this.$scaffoldState, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = T5.b.e();
                int i8 = this.label;
                if (i8 != 0) {
                    if (i8 == 1) {
                        t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    t.b(obj);
                    BackdropScaffoldState backdropScaffoldState = this.$scaffoldState;
                    this.label = 1;
                    if (backdropScaffoldState.reveal(this) == e8) {
                        return e8;
                    }
                }
                return I.f8278a;
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(M m8, d dVar) {
                return ((C03111) create(m8, dVar)).invokeSuspend(I.f8278a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(BackdropScaffoldState backdropScaffoldState, M m8) {
            super(0);
            this.$scaffoldState = backdropScaffoldState;
            this.$scope = m8;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            if (((Boolean) this.$scaffoldState.getConfirmStateChange$material_release().invoke(BackdropValue.Revealed)).booleanValue()) {
                AbstractC3364k.d(this.$scope, null, null, new C03111(this.$scaffoldState, null), 3, null);
            }
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends AbstractC3256z implements Function0 {
        final /* synthetic */ BackdropScaffoldState $scaffoldState;
        final /* synthetic */ M $scope;

        /* JADX INFO: Access modifiers changed from: package-private */
        @f(c = "androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1$2$1", f = "BackdropScaffold.kt", l = {336}, m = "invokeSuspend")
        /* renamed from: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1$2$1, reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass1 extends l implements InterfaceC1668n {
            final /* synthetic */ BackdropScaffoldState $scaffoldState;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(BackdropScaffoldState backdropScaffoldState, d dVar) {
                super(2, dVar);
                this.$scaffoldState = backdropScaffoldState;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final d create(Object obj, d dVar) {
                return new AnonymousClass1(this.$scaffoldState, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = T5.b.e();
                int i8 = this.label;
                if (i8 != 0) {
                    if (i8 == 1) {
                        t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    t.b(obj);
                    BackdropScaffoldState backdropScaffoldState = this.$scaffoldState;
                    this.label = 1;
                    if (backdropScaffoldState.conceal(this) == e8) {
                        return e8;
                    }
                }
                return I.f8278a;
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(M m8, d dVar) {
                return ((AnonymousClass1) create(m8, dVar)).invokeSuspend(I.f8278a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(BackdropScaffoldState backdropScaffoldState, M m8) {
            super(0);
            this.$scaffoldState = backdropScaffoldState;
            this.$scope = m8;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            if (((Boolean) this.$scaffoldState.getConfirmStateChange$material_release().invoke(BackdropValue.Concealed)).booleanValue()) {
                AbstractC3364k.d(this.$scope, null, null, new AnonymousClass1(this.$scaffoldState, null), 3, null);
            }
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1(BackdropScaffoldState backdropScaffoldState, M m8) {
        super(1);
        this.$scaffoldState = backdropScaffoldState;
        this.$scope = m8;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((SemanticsPropertyReceiver) obj);
        return I.f8278a;
    }

    public final void invoke(SemanticsPropertyReceiver semantics) {
        AbstractC3255y.i(semantics, "$this$semantics");
        if (this.$scaffoldState.isConcealed()) {
            SemanticsPropertiesKt.collapse$default(semantics, null, new AnonymousClass1(this.$scaffoldState, this.$scope), 1, null);
        } else {
            SemanticsPropertiesKt.expand$default(semantics, null, new AnonymousClass2(this.$scaffoldState, this.$scope), 1, null);
        }
    }
}