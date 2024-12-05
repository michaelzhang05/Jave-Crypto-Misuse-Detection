package androidx.compose.material3;

import L5.I;
import L5.t;
import P5.d;
import Q5.b;
import X5.n;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import i6.AbstractC2829k;
import i6.M;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class NavigationDrawerKt$DismissibleNavigationDrawer$2$1$1 extends AbstractC3160z implements Function1 {
    final /* synthetic */ DrawerState $drawerState;
    final /* synthetic */ String $navigationMenu;
    final /* synthetic */ M $scope;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.material3.NavigationDrawerKt$DismissibleNavigationDrawer$2$1$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends AbstractC3160z implements Function0 {
        final /* synthetic */ DrawerState $drawerState;
        final /* synthetic */ M $scope;

        /* JADX INFO: Access modifiers changed from: package-private */
        @f(c = "androidx.compose.material3.NavigationDrawerKt$DismissibleNavigationDrawer$2$1$1$1$1", f = "NavigationDrawer.kt", l = {385}, m = "invokeSuspend")
        /* renamed from: androidx.compose.material3.NavigationDrawerKt$DismissibleNavigationDrawer$2$1$1$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C03301 extends l implements n {
            final /* synthetic */ DrawerState $drawerState;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C03301(DrawerState drawerState, d dVar) {
                super(2, dVar);
                this.$drawerState = drawerState;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final d create(Object obj, d dVar) {
                return new C03301(this.$drawerState, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, d dVar) {
                return ((C03301) create(m8, dVar)).invokeSuspend(I.f6487a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = b.e();
                int i8 = this.label;
                if (i8 != 0) {
                    if (i8 == 1) {
                        t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    t.b(obj);
                    DrawerState drawerState = this.$drawerState;
                    this.label = 1;
                    if (drawerState.close(this) == e8) {
                        return e8;
                    }
                }
                return I.f6487a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(DrawerState drawerState, M m8) {
            super(0);
            this.$drawerState = drawerState;
            this.$scope = m8;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            if (((Boolean) this.$drawerState.getSwipeableState$material3_release().getConfirmStateChange$material3_release().invoke(DrawerValue.Closed)).booleanValue()) {
                AbstractC2829k.d(this.$scope, null, null, new C03301(this.$drawerState, null), 3, null);
            }
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationDrawerKt$DismissibleNavigationDrawer$2$1$1(String str, DrawerState drawerState, M m8) {
        super(1);
        this.$navigationMenu = str;
        this.$drawerState = drawerState;
        this.$scope = m8;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((SemanticsPropertyReceiver) obj);
        return I.f6487a;
    }

    public final void invoke(SemanticsPropertyReceiver semantics) {
        AbstractC3159y.i(semantics, "$this$semantics");
        SemanticsPropertiesKt.setPaneTitle(semantics, this.$navigationMenu);
        if (this.$drawerState.isOpen()) {
            SemanticsPropertiesKt.dismiss$default(semantics, null, new AnonymousClass1(this.$drawerState, this.$scope), 1, null);
        }
    }
}
