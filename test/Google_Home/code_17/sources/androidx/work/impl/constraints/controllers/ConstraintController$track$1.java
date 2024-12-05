package androidx.work.impl.constraints.controllers;

import O5.I;
import O5.t;
import S5.d;
import T5.b;
import a6.InterfaceC1668n;
import androidx.work.impl.constraints.ConstraintListener;
import androidx.work.impl.constraints.ConstraintsState;
import androidx.work.impl.constraints.trackers.ConstraintTracker;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3256z;
import n6.q;
import n6.s;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.work.impl.constraints.controllers.ConstraintController$track$1", f = "ContraintControllers.kt", l = {55}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class ConstraintController$track$1 extends l implements InterfaceC1668n {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ConstraintController<T> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.work.impl.constraints.controllers.ConstraintController$track$1$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends AbstractC3256z implements Function0 {
        final /* synthetic */ ConstraintController$track$1$listener$1 $listener;
        final /* synthetic */ ConstraintController<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ConstraintController constraintController, ConstraintController$track$1$listener$1 constraintController$track$1$listener$1) {
            super(0);
            this.this$0 = constraintController;
            this.$listener = constraintController$track$1$listener$1;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m5488invoke();
            return I.f8278a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5488invoke() {
            ConstraintTracker constraintTracker;
            constraintTracker = ((ConstraintController) this.this$0).tracker;
            constraintTracker.removeListener(this.$listener);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintController$track$1(ConstraintController<T> constraintController, d dVar) {
        super(2, dVar);
        this.this$0 = constraintController;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        ConstraintController$track$1 constraintController$track$1 = new ConstraintController$track$1(this.this$0, dVar);
        constraintController$track$1.L$0 = obj;
        return constraintController$track$1;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.work.impl.constraints.ConstraintListener, androidx.work.impl.constraints.controllers.ConstraintController$track$1$listener$1] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ConstraintTracker constraintTracker;
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
            final s sVar = (s) this.L$0;
            final ConstraintController<T> constraintController = this.this$0;
            ?? r12 = new ConstraintListener<T>() { // from class: androidx.work.impl.constraints.controllers.ConstraintController$track$1$listener$1
                @Override // androidx.work.impl.constraints.ConstraintListener
                public void onConstraintChanged(T t8) {
                    Object obj2;
                    if (constraintController.isConstrained((ConstraintController<T>) t8)) {
                        obj2 = new ConstraintsState.ConstraintsNotMet(constraintController.getReason());
                    } else {
                        obj2 = ConstraintsState.ConstraintsMet.INSTANCE;
                    }
                    sVar.l().w(obj2);
                }
            };
            constraintTracker = ((ConstraintController) this.this$0).tracker;
            constraintTracker.addListener(r12);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, r12);
            this.label = 1;
            if (q.a(sVar, anonymousClass1, this) == e8) {
                return e8;
            }
        }
        return I.f8278a;
    }

    @Override // a6.InterfaceC1668n
    public final Object invoke(s sVar, d dVar) {
        return ((ConstraintController$track$1) create(sVar, dVar)).invokeSuspend(I.f8278a);
    }
}
