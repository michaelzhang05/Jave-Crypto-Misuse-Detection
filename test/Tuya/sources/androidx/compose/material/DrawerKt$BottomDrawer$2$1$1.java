package androidx.compose.material;

import L5.I;
import L5.t;
import P5.d;
import X5.n;
import i6.AbstractC2829k;
import i6.M;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class DrawerKt$BottomDrawer$2$1$1 extends AbstractC3160z implements Function0 {
    final /* synthetic */ BottomDrawerState $drawerState;
    final /* synthetic */ boolean $gesturesEnabled;
    final /* synthetic */ M $scope;

    /* JADX INFO: Access modifiers changed from: package-private */
    @f(c = "androidx.compose.material.DrawerKt$BottomDrawer$2$1$1$1", f = "Drawer.kt", l = {697}, m = "invokeSuspend")
    /* renamed from: androidx.compose.material.DrawerKt$BottomDrawer$2$1$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends l implements n {
        final /* synthetic */ BottomDrawerState $drawerState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(BottomDrawerState bottomDrawerState, d dVar) {
            super(2, dVar);
            this.$drawerState = bottomDrawerState;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            return new AnonymousClass1(this.$drawerState, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, d dVar) {
            return ((AnonymousClass1) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.label;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                BottomDrawerState bottomDrawerState = this.$drawerState;
                this.label = 1;
                if (bottomDrawerState.close(this) == e8) {
                    return e8;
                }
            }
            return I.f6487a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DrawerKt$BottomDrawer$2$1$1(boolean z8, BottomDrawerState bottomDrawerState, M m8) {
        super(0);
        this.$gesturesEnabled = z8;
        this.$drawerState = bottomDrawerState;
        this.$scope = m8;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m1226invoke();
        return I.f6487a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m1226invoke() {
        if (this.$gesturesEnabled && this.$drawerState.confirmStateChange$material_release(BottomDrawerValue.Closed)) {
            AbstractC2829k.d(this.$scope, null, null, new AnonymousClass1(this.$drawerState, null), 3, null);
        }
    }
}
